package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@SpringBootTest
class DemoApplicationTests {

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


        LocalDate localDate1 = localDate.plusMonths(6);
        long until = localDate3.until(localDate2, ChronoUnit.MONTHS);
        int dayOfMonth = localDate3.getDayOfMonth();
        //if(localDate.getDayOfMonth())
        long until1 = localDate3.until(localDate4, ChronoUnit.MONTHS);
        System.out.println(before);
        System.out.println(period);
        System.out.println(period2);
        System.out.println(until1);
    }

    @Test
    public void che() {

    }







}
