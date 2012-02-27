package com.oltpbenchmark.benchmarks.wikipedia.data;

import com.oltpbenchmark.util.Histogram;

public abstract class RevisionHistograms {

    /**
     * The length of the REV_COMMENT column
     */
    public static final Histogram<Integer> COMMENT_LENGTH = new Histogram<Integer>() {
        {
            this.put(0, 369676);
            this.put(1, 2349);
            this.put(2, 6499);
            this.put(3, 15283);
            this.put(4, 12587);
            this.put(5, 9478);
            this.put(6, 8950);
            this.put(7, 15733);
            this.put(8, 17814);
            this.put(9, 13030);
            this.put(10, 20114);
            this.put(11, 23820);
            this.put(12, 37709);
            this.put(13, 33519);
            this.put(14, 32407);
            this.put(15, 28522);
            this.put(16, 32136);
            this.put(17, 28346);
            this.put(18, 23220);
            this.put(19, 26814);
            this.put(20, 44981);
            this.put(21, 22521);
            this.put(22, 21283);
            this.put(23, 20584);
            this.put(24, 20573);
            this.put(25, 20744);
            this.put(26, 21000);
            this.put(27, 16677);
            this.put(28, 18865);
            this.put(29, 17696);
            this.put(30, 15825);
            this.put(31, 17675);
            this.put(32, 14153);
            this.put(33, 16588);
            this.put(34, 14771);
            this.put(35, 14556);
            this.put(36, 14078);
            this.put(37, 11642);
            this.put(38, 11149);
            this.put(39, 10627);
            this.put(40, 10310);
            this.put(41, 8686);
            this.put(42, 11333);
            this.put(43, 8712);
            this.put(44, 8030);
            this.put(45, 8106);
            this.put(46, 7814);
            this.put(47, 8776);
            this.put(48, 7439);
            this.put(49, 6503);
            this.put(50, 6323);
            this.put(51, 5874);
            this.put(52, 6472);
            this.put(53, 6024);
            this.put(54, 7171);
            this.put(55, 5338);
            this.put(56, 6252);
            this.put(57, 5208);
            this.put(58, 5260);
            this.put(59, 4390);
            this.put(60, 4723);
            this.put(61, 4467);
            this.put(62, 5498);
            this.put(63, 4129);
            this.put(64, 3989);
            this.put(65, 3594);
            this.put(66, 4851);
            this.put(67, 3588);
            this.put(68, 3825);
            this.put(69, 3705);
            this.put(70, 3212);
            this.put(71, 3124);
            this.put(72, 3775);
            this.put(73, 2853);
            this.put(74, 2969);
            this.put(75, 2785);
            this.put(76, 2796);
            this.put(77, 3964);
            this.put(78, 2514);
            this.put(79, 2493);
            this.put(80, 2955);
            this.put(81, 3000);
            this.put(82, 2916);
            this.put(83, 2223);
            this.put(84, 2247);
            this.put(85, 2489);
            this.put(86, 1892);
            this.put(87, 2705);
            this.put(88, 3226);
            this.put(89, 1994);
            this.put(90, 1852);
            this.put(91, 2070);
            this.put(92, 2066);
            this.put(93, 2371);
            this.put(94, 1961);
            this.put(95, 1803);
            this.put(96, 2305);
            this.put(97, 1812);
            this.put(98, 2145);
            this.put(99, 2203);
            this.put(100, 1837);
            this.put(101, 1799);
            this.put(102, 1726);
            this.put(103, 1730);
            this.put(104, 1890);
            this.put(105, 1688);
            this.put(106, 1478);
            this.put(107, 1659);
            this.put(108, 1396);
            this.put(109, 2088);
            this.put(110, 1772);
            this.put(111, 1158);
            this.put(112, 1234);
            this.put(113, 1756);
            this.put(114, 1417);
            this.put(115, 1173);
            this.put(116, 1480);
            this.put(117, 1447);
            this.put(118, 1640);
            this.put(119, 1910);
            this.put(120, 1851);
            this.put(121, 1699);
            this.put(122, 1994);
            this.put(123, 1464);
            this.put(124, 1504);
            this.put(125, 3023);
            this.put(126, 1779);
            this.put(127, 1572);
            this.put(128, 3420);
            this.put(129, 1463);
            this.put(130, 1637);
            this.put(131, 2772);
            this.put(132, 1751);
            this.put(133, 2315);
            this.put(134, 2190);
            this.put(135, 1690);
            this.put(136, 1889);
            this.put(137, 2412);
            this.put(138, 1839);
            this.put(139, 1665);
            this.put(140, 1512);
            this.put(141, 1267);
            this.put(142, 1543);
            this.put(143, 1057);
            this.put(144, 961);
            this.put(145, 1019);
            this.put(146, 835);
            this.put(147, 835);
            this.put(148, 914);
            this.put(149, 726);
            this.put(150, 688);
            this.put(151, 598);
            this.put(152, 786);
            this.put(153, 610);
            this.put(154, 702);
            this.put(155, 925);
            this.put(156, 739);
            this.put(157, 804);
            this.put(158, 578);
            this.put(159, 531);
            this.put(160, 555);
            this.put(161, 629);
            this.put(162, 532);
            this.put(163, 543);
            this.put(164, 548);
            this.put(165, 568);
            this.put(166, 616);
            this.put(167, 503);
            this.put(168, 596);
            this.put(169, 535);
            this.put(170, 614);
            this.put(171, 538);
            this.put(172, 479);
            this.put(173, 513);
            this.put(174, 613);
            this.put(175, 447);
            this.put(176, 488);
            this.put(177, 436);
            this.put(178, 497);
            this.put(179, 438);
            this.put(180, 490);
            this.put(181, 385);
            this.put(182, 440);
            this.put(183, 409);
            this.put(184, 509);
            this.put(185, 343);
            this.put(186, 483);
            this.put(187, 405);
            this.put(188, 401);
            this.put(189, 362);
            this.put(190, 462);
            this.put(191, 336);
            this.put(192, 433);
            this.put(193, 423);
            this.put(194, 345);
            this.put(195, 439);
            this.put(196, 393);
            this.put(197, 580);
            this.put(198, 581);
            this.put(199, 5151);
            this.put(200, 1201);
            this.put(201, 64);
            this.put(202, 56);
            this.put(203, 56);
            this.put(204, 43);
            this.put(205, 35);
            this.put(206, 41);
            this.put(207, 62);
            this.put(208, 66);
            this.put(209, 68);
            this.put(210, 82);
            this.put(211, 78);
            this.put(212, 50);
            this.put(213, 63);
            this.put(214, 59);
            this.put(215, 76);
            this.put(216, 76);
            this.put(217, 43);
            this.put(218, 38);
            this.put(219, 27);
            this.put(220, 36);
            this.put(221, 35);
            this.put(222, 37);
            this.put(223, 45);
            this.put(224, 32);
            this.put(225, 40);
            this.put(226, 30);
            this.put(227, 27);
            this.put(228, 16);
            this.put(229, 17);
            this.put(230, 18);
            this.put(231, 18);
            this.put(232, 11);
            this.put(233, 11);
            this.put(234, 21);
            this.put(235, 12);
            this.put(236, 11);
            this.put(237, 14);
            this.put(238, 10);
            this.put(239, 19);
            this.put(240, 11);
            this.put(241, 14);
            this.put(242, 8);
            this.put(243, 55);
            this.put(244, 19);
            this.put(245, 36);
            this.put(246, 35);
            this.put(247, 53);
            this.put(248, 96);
            this.put(249, 101);
            this.put(250, 173);
            this.put(251, 138);
            this.put(252, 110);
            this.put(253, 135);
            this.put(254, 34);
            this.put(255, 232);
        }
    };
    
    public static final Histogram<Integer> REVISION_DELTA = new Histogram<Integer>() {
        {
            this.put(-100000, 20);
            this.put(-99000, 6);
            this.put(-98000, 5);
            this.put(-97000, 6);
            this.put(-96000, 4);
            this.put(-95000, 7);
            this.put(-94000, 12);
            this.put(-93000, 19);
            this.put(-92000, 10);
            this.put(-91000, 3);
            this.put(-90000, 2);
            this.put(-89000, 1);
            this.put(-88000, 12);
            this.put(-87000, 13);
            this.put(-86000, 10);
            this.put(-85000, 4);
            this.put(-84000, 9);
            this.put(-83000, 17);
            this.put(-82000, 11);
            this.put(-81000, 11);
            this.put(-80000, 6);
            this.put(-79000, 7);
            this.put(-78000, 12);
            this.put(-77000, 36);
            this.put(-76000, 6);
            this.put(-75000, 16);
            this.put(-74000, 21);
            this.put(-73000, 12);
            this.put(-72000, 7);
            this.put(-71000, 13);
            this.put(-70000, 12);
            this.put(-69000, 34);
            this.put(-68000, 21);
            this.put(-67000, 16);
            this.put(-66000, 11);
            this.put(-65000, 24);
            this.put(-64000, 12);
            this.put(-63000, 21);
            this.put(-62000, 29);
            this.put(-61000, 33);
            this.put(-60000, 49);
            this.put(-59000, 25);
            this.put(-58000, 26);
            this.put(-57000, 32);
            this.put(-56000, 26);
            this.put(-55000, 19);
            this.put(-54000, 31);
            this.put(-53000, 33);
            this.put(-52000, 39);
            this.put(-51000, 35);
            this.put(-50000, 31);
            this.put(-49000, 29);
            this.put(-48000, 47);
            this.put(-47000, 40);
            this.put(-46000, 47);
            this.put(-45000, 63);
            this.put(-44000, 40);
            this.put(-43000, 47);
            this.put(-42000, 47);
            this.put(-41000, 36);
            this.put(-40000, 46);
            this.put(-39000, 45);
            this.put(-38000, 61);
            this.put(-37000, 67);
            this.put(-36000, 86);
            this.put(-35000, 52);
            this.put(-34000, 59);
            this.put(-33000, 81);
            this.put(-32000, 47);
            this.put(-31000, 78);
            this.put(-30000, 60);
            this.put(-29000, 92);
            this.put(-28000, 126);
            this.put(-27000, 98);
            this.put(-26000, 102);
            this.put(-25000, 96);
            this.put(-24000, 92);
            this.put(-23000, 100);
            this.put(-22000, 145);
            this.put(-21000, 164);
            this.put(-20000, 144);
            this.put(-19000, 161);
            this.put(-18000, 142);
            this.put(-17000, 136);
            this.put(-16000, 171);
            this.put(-15000, 238);
            this.put(-14000, 212);
            this.put(-13000, 250);
            this.put(-12000, 265);
            this.put(-11000, 376);
            this.put(-10000, 206);
            this.put(-9900, 46);
            this.put(-9800, 38);
            this.put(-9700, 43);
            this.put(-9600, 51);
            this.put(-9500, 40);
            this.put(-9400, 49);
            this.put(-9300, 42);
            this.put(-9200, 50);
            this.put(-9100, 37);
            this.put(-9000, 55);
            this.put(-8900, 48);
            this.put(-8800, 41);
            this.put(-8700, 46);
            this.put(-8600, 50);
            this.put(-8500, 34);
            this.put(-8400, 52);
            this.put(-8300, 32);
            this.put(-8200, 51);
            this.put(-8100, 59);
            this.put(-8000, 57);
            this.put(-7900, 62);
            this.put(-7800, 61);
            this.put(-7700, 65);
            this.put(-7600, 66);
            this.put(-7500, 77);
            this.put(-7400, 76);
            this.put(-7300, 57);
            this.put(-7200, 59);
            this.put(-7100, 77);
            this.put(-7000, 72);
            this.put(-6900, 70);
            this.put(-6800, 94);
            this.put(-6700, 89);
            this.put(-6600, 76);
            this.put(-6500, 91);
            this.put(-6400, 101);
            this.put(-6300, 112);
            this.put(-6200, 114);
            this.put(-6100, 100);
            this.put(-6000, 103);
            this.put(-5900, 113);
            this.put(-5800, 118);
            this.put(-5700, 110);
            this.put(-5600, 112);
            this.put(-5500, 143);
            this.put(-5400, 128);
            this.put(-5300, 147);
            this.put(-5200, 159);
            this.put(-5100, 125);
            this.put(-5000, 155);
            this.put(-4900, 171);
            this.put(-4800, 148);
            this.put(-4700, 198);
            this.put(-4600, 166);
            this.put(-4500, 170);
            this.put(-4400, 166);
            this.put(-4300, 225);
            this.put(-4200, 205);
            this.put(-4100, 214);
            this.put(-4000, 275);
            this.put(-3900, 250);
            this.put(-3800, 241);
            this.put(-3700, 263);
            this.put(-3600, 316);
            this.put(-3500, 329);
            this.put(-3400, 368);
            this.put(-3300, 355);
            this.put(-3200, 414);
            this.put(-3100, 407);
            this.put(-3000, 439);
            this.put(-2900, 495);
            this.put(-2800, 495);
            this.put(-2700, 574);
            this.put(-2600, 628);
            this.put(-2500, 807);
            this.put(-2400, 850);
            this.put(-2300, 899);
            this.put(-2200, 1032);
            this.put(-2100, 1209);
            this.put(-2000, 1419);
            this.put(-1900, 1362);
            this.put(-1800, 1796);
            this.put(-1700, 2342);
            this.put(-1600, 2052);
            this.put(-1500, 2849);
            this.put(-1400, 3933);
            this.put(-1300, 3665);
            this.put(-1200, 3897);
            this.put(-1100, 4839);
            this.put(-1000, 6300);
            this.put(-900, 7412);
            this.put(-800, 9877);
            this.put(-700, 12435);
            this.put(-600, 16649);
            this.put(-500, 22398);
            this.put(-400, 31869);
            this.put(-300, 48934);
            this.put(-200, 79906);
            this.put(-100, 235205);
            this.put(0, 725175);
            this.put(100, 78411);
            this.put(200, 20261);
            this.put(300, 10518);
            this.put(400, 6604);
            this.put(500, 4682);
            this.put(600, 3612);
            this.put(700, 2928);
            this.put(800, 2268);
            this.put(900, 1900);
            this.put(1000, 1689);
            this.put(1100, 1421);
            this.put(1200, 1261);
            this.put(1300, 1110);
            this.put(1400, 941);
            this.put(1500, 943);
            this.put(1600, 805);
            this.put(1700, 716);
            this.put(1800, 700);
            this.put(1900, 593);
            this.put(2000, 658);
            this.put(2100, 586);
            this.put(2200, 503);
            this.put(2300, 462);
            this.put(2400, 403);
            this.put(2500, 391);
            this.put(2600, 384);
            this.put(2700, 310);
            this.put(2800, 324);
            this.put(2900, 295);
            this.put(3000, 325);
            this.put(3100, 301);
            this.put(3200, 307);
            this.put(3300, 255);
            this.put(3400, 263);
            this.put(3500, 210);
            this.put(3600, 228);
            this.put(3700, 185);
            this.put(3800, 193);
            this.put(3900, 213);
            this.put(4000, 187);
            this.put(4100, 159);
            this.put(4200, 144);
            this.put(4300, 180);
            this.put(4400, 137);
            this.put(4500, 132);
            this.put(4600, 141);
            this.put(4700, 157);
            this.put(4800, 132);
            this.put(4900, 153);
            this.put(5000, 136);
            this.put(5100, 131);
            this.put(5200, 140);
            this.put(5300, 116);
            this.put(5400, 120);
            this.put(5500, 108);
            this.put(5600, 100);
            this.put(5700, 105);
            this.put(5800, 98);
            this.put(5900, 100);
            this.put(6000, 87);
            this.put(6100, 77);
            this.put(6200, 81);
            this.put(6300, 88);
            this.put(6400, 74);
            this.put(6500, 72);
            this.put(6600, 72);
            this.put(6700, 73);
            this.put(6800, 94);
            this.put(6900, 73);
            this.put(7000, 65);
            this.put(7100, 77);
            this.put(7200, 62);
            this.put(7300, 52);
            this.put(7400, 50);
            this.put(7500, 68);
            this.put(7600, 61);
            this.put(7700, 52);
            this.put(7800, 57);
            this.put(7900, 60);
            this.put(8000, 44);
            this.put(8100, 57);
            this.put(8200, 56);
            this.put(8300, 45);
            this.put(8400, 43);
            this.put(8500, 44);
            this.put(8600, 47);
            this.put(8700, 40);
            this.put(8800, 43);
            this.put(8900, 44);
            this.put(9000, 58);
            this.put(9100, 43);
            this.put(9200, 43);
            this.put(9300, 38);
            this.put(9400, 54);
            this.put(9500, 44);
            this.put(9600, 50);
            this.put(9700, 32);
            this.put(9800, 39);
            this.put(9900, 43);
            this.put(10000, 157);
            this.put(11000, 362);
            this.put(12000, 262);
            this.put(13000, 245);
            this.put(14000, 207);
            this.put(15000, 228);
            this.put(16000, 198);
            this.put(17000, 150);
            this.put(18000, 137);
            this.put(19000, 156);
            this.put(20000, 143);
            this.put(21000, 172);
            this.put(22000, 153);
            this.put(23000, 114);
            this.put(24000, 104);
            this.put(25000, 103);
            this.put(26000, 94);
            this.put(27000, 113);
            this.put(28000, 133);
            this.put(29000, 108);
            this.put(30000, 66);
            this.put(31000, 74);
            this.put(32000, 55);
            this.put(33000, 75);
            this.put(34000, 67);
            this.put(35000, 57);
            this.put(36000, 94);
            this.put(37000, 72);
            this.put(38000, 63);
            this.put(39000, 57);
            this.put(40000, 45);
            this.put(41000, 41);
            this.put(42000, 50);
            this.put(43000, 52);
            this.put(44000, 38);
            this.put(45000, 67);
            this.put(46000, 51);
            this.put(47000, 44);
            this.put(48000, 44);
            this.put(49000, 39);
            this.put(50000, 32);
            this.put(51000, 38);
            this.put(52000, 38);
            this.put(53000, 36);
            this.put(54000, 36);
            this.put(55000, 17);
            this.put(56000, 29);
            this.put(57000, 36);
            this.put(58000, 16);
            this.put(59000, 37);
            this.put(60000, 42);
            this.put(61000, 38);
            this.put(62000, 32);
            this.put(63000, 23);
            this.put(64000, 12);
            this.put(65000, 26);
            this.put(66000, 12);
            this.put(67000, 19);
            this.put(68000, 21);
            this.put(69000, 33);
            this.put(70000, 12);
            this.put(71000, 12);
            this.put(72000, 10);
            this.put(73000, 10);
            this.put(74000, 23);
            this.put(75000, 16);
            this.put(76000, 11);
            this.put(77000, 36);
            this.put(78000, 11);
            this.put(79000, 9);
            this.put(80000, 10);
            this.put(81000, 16);
            this.put(82000, 15);
            this.put(83000, 21);
            this.put(84000, 4);
            this.put(85000, 5);
            this.put(86000, 10);
            this.put(87000, 12);
            this.put(88000, 10);
            this.put(89000, 7);
            this.put(90000, 3);
            this.put(91000, 3);
            this.put(92000, 10);
            this.put(93000, 22);
            this.put(94000, 13);
            this.put(95000, 9);
            this.put(96000, 5);
            this.put(97000, 6);
            this.put(98000, 8);
            this.put(99000, 4);
            this.put(100000, 25);
        }
    };
    
    /**
     * The histogram of the REV_MINOR_EDIT column
     */
    public static final Histogram<Integer> MINOR_EDIT = new Histogram<Integer>() {
        {
            this.put(0, 1142822);
            this.put(1, 362171);
        }
    };
    
}