package io.turntabl.scalagettingstarted

object MyApp extends App {

val books = List(new Book("Phoenix", "gaming",1990,"play"),
  new Book("Phoenix", "gaming",1990,"play"),
  new Book("me", "age of empires",1994,"History"),
  new Book("Phoenix", "gaming",1990,"play"),
  new Book("Phoenix", "gaming",1990,"play")
  )

  books.foreach(println)

  def bookByTitle(books:List[Book]):Map[String, Book]= books.map(books=>books.title->books).toMap

//  def ByTitle(books:List[Book]):Map[String, Book] = books.map(books=>books.title->books).toMap

  val Title= List("gaming","anase","age of empire")
  val bk = bookByTitle(books)
  Title flatMap bk.get

  for (t <- Title;
       lb <- bk.get(t))
    yield(t,lb)


}

