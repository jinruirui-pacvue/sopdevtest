package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.*;
import java.util.stream.Stream;

import static java.time.temporal.ChronoField.NANO_OF_SECOND;


@SpringBootTest
class DemoApplicationTests {

    public static final DateTimeFormatter f6 = DateTimeFormatter.ofPattern("MMM-yyyy").withLocale(Locale.US);
    public static final DateTimeFormatter f5 = DateTimeFormatter.ofPattern("yyyyMM").withLocale(Locale.US);
    public static final DateTimeFormatter f7 = DateTimeFormatter.ofPattern("yyyyMMDD").withLocale(Locale.US);
    public static final DateTimeFormatter f13 = DateTimeFormatter.ofPattern("dd-MMM-yyyy").withLocale(Locale.US);




    @Test
    void contextLoads() {

        /*Dictionary<string, DataRow> dict = new Dictionary<string,DataRow>();
        foreach (DataRow row in ds.Tables[0].Rows)
        {
            dict[row["code"].ToString()] = row;
        }
        foreach (DataRow row in dst.Tables[0].Rows)
        {
            DataRow dr;
            if(dict.TryGetValue(row["code"].ToString(), out dr))
            {
                row["name"] = dr["name"];
                row["price"] = dr["price"];
            }
        }



        for (int i = 0; i < ds.Tables[0].Rows.Count; i++)
        {
            for (int j = 0; j < dst.Tables[0].Rows.Count; j++)
            {

                if (ds.Tables[0].Rows[i]["code"].ToString() == dst.Tables[0].Rows[j]["code"].ToString())
                {
                    dst.Tables[0].Rows[j]["name"] = ds.Tables[0].Rows[i]["name"];
                    dst.Tables[0].Rows[j]["price"] = ds.Tables[0].Rows[i]["price"];
                }

            }
        }
        */
    }


    @Test
    public void massage() {
       /* String subject = String.format("The invoice was created error, and the deal ID is ==> %s,month of year ==> %s",
                123,202310);
        System.out.println(subject);
        ArrayList<BigDecimal> list = new ArrayList<>();
        list.add(BigDecimal.ONE);
        list.add(BigDecimal.ZERO);
        list.add(BigDecimal.TEN);
        boolean b = Collections.max(list).compareTo(BigDecimal.valueOf(9.9999999)) < 0;*/
        List<String> strings = Arrays.asList("gwen.steinhauer@wmglobal.com,damien.bianchi@globalstrategies.com".split(","));
        System.out.println(strings);
    }

    @Test
    public void localDateInfo() {
        LocalDate localDate = LocalDate.of(2022, 1, 1);
        LocalDate localDate2 = LocalDate.of(2022, 6, 30);
        LocalDate localDate3 = LocalDate.of(2022, 1, 15);
        LocalDate localDate4 = LocalDate.of(2022, 7, 14);
        boolean before = localDate.isBefore(localDate2);

        Period period = Period.between(localDate, localDate2);
        Period period2 = Period.between(localDate3, localDate4);

        String format = localDate2.format(f6);

        LocalDate localDate1 = localDate.plusMonths(6);
        long until = localDate3.until(localDate2, ChronoUnit.MONTHS);
        int dayOfMonth = localDate3.getDayOfMonth();
        //if(localDate.getDayOfMonth())
        long until1 = localDate3.until(localDate4, ChronoUnit.MONTHS);
        System.out.println(format);
        System.out.println(period);
        System.out.println(period2);
        System.out.println(until1);
    }

    @Test
    public void time() {
        TemporalAccessor parse = f6.parse("Apr-2023");
        //int i = parse.get(fi);
        //int i = parse.get(NANO_OF_SECOND);
        //String format = f5.format(parse);
        String substring = "01-Apr-2023";
        TemporalAccessor s = f13.parse("01-"+"Apr-2023".substring(0, 8));

        String format = f5.format(s);
        String format7 = f7.format(s);

        System.err.println(parse.toString());
        System.err.println(substring);
        System.err.println("s :" + s);
        System.err.println("s1 :" + format);
        System.err.println("s1 :" + format7);
        //System.err.println(format);

    }
    @Test
    public void che() {

        Stream.of("one", "two", "three", "four").filter(e -> e.length() > 3).peek(e -> System.err.println("Filtered value: " + e));

    }











}
