class Theatre
{
public static void main(String[] args)
{
Theatre saravanan=new Theatre();
int Balance=saravanan.bookticket(200);
System.out.println("After bookticket:"+Balance);
}
int bookticket(int total)
{
int ticket_price=120;
int Balance=(total-ticket_price);
return Balance;
}
}
