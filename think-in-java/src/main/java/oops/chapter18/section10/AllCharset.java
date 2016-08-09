/*
 *
 * Copyright (c) 2010-2015 by Shanghai HanTao Information Co., Ltd.
 * All rights reserved.
 *
 */

package oops.chapter18.section10;

import java.nio.charset.Charset;
import java.util.Map;
import java.util.SortedMap;

/**
 * Description:
 * <p/>
 * Create Author  : lilzhang
 * Create Date    : 2016-08-09
 * Project        : desultory-essay
 * File Name      : AllCharset.java
 */
public class AllCharset
{
    public static void main(String[] args)
    {
        SortedMap<String, Charset> charsets = Charset.availableCharsets();
        for (Map.Entry<String, Charset> entry : charsets.entrySet())
        {
            String charsetName = entry.getKey();
            System.out.print(charsetName);
            Charset charset = entry.getValue();
            System.out.print(" : ");
            for (String s : charset.aliases())
            {
                System.out.print(s + ", ");
            }
            System.out.println();
        }
    }

    /*
    Big5 : csBig5,
    Big5-HKSCS : Big5_HKSCS, big5-hkscs, big5hkscs, big5hk,
    EUC-JP : eucjis, Extended_UNIX_Code_Packed_Format_for_Japanese, x-eucjp, eucjp, csEUCPkdFmtjapanese, x-euc-jp, euc_jp,
    EUC-KR : 5601, ksc5601-1987, ksc5601_1987, euckr, ksc5601, ksc_5601, ks_c_5601-1987, euc_kr, csEUCKR,
    GB18030 : gb18030-2000,
    GB2312 : euc-cn, x-EUC-CN, gb2312-1980, gb2312, gb2312-80, EUC_CN, euccn,
    GBK : windows-936, CP936,
    IBM-Thai : 838, cp838, ibm838, ibm-838,
    IBM00858 : cp858, 858, ccsid00858, PC-Multilingual-850+euro, cp00858,
    IBM01140 : 1140, cp01140, ccsid01140, cp1140, ebcdic-us-037+euro,
    IBM01141 : cp1141, 1141, cp01141, ccsid01141, ebcdic-de-273+euro,
    IBM01142 : cp01142, cp1142, ebcdic-no-277+euro, 1142, ebcdic-dk-277+euro, ccsid01142,
    IBM01143 : ebcdic-se-278+euro, 1143, cp01143, ccsid01143, ebcdic-fi-278+euro, cp1143,
    IBM01144 : cp01144, ebcdic-it-280+euro, 1144, ccsid01144, cp1144,
    IBM01145 : ebcdic-es-284+euro, cp1145, cp01145, 1145, ccsid01145,
    IBM01146 : ccsid01146, cp01146, ebcdic-gb-285+euro, 1146, cp1146,
    IBM01147 : ccsid01147, ebcdic-fr-277+euro, cp1147, 1147, cp01147,
    IBM01148 : cp1148, ebcdic-international-500+euro, 1148, ccsid01148, cp01148,
    IBM01149 : ebcdic-s-871+euro, cp01149, cp1149, 1149, ccsid01149,
    IBM037 : cs-ebcdic-cp-nl, cs-ebcdic-cp-us, ebcdic-cp-wt, 037, ebcdic-cp-ca, cs-ebcdic-cp-wt, ibm-037, csIBM037, cp037, cs-ebcdic-cp-ca, cpibm37, ibm037, ebcdic-cp-nl, ebcdic-cp-us, ibm-37,
    IBM1026 : 1026, cp1026, ibm-1026, ibm1026,
    IBM1047 : cp1047, 1047, ibm-1047,
    IBM273 : ibm-273, ibm273, cp273, 273,
    IBM277 : 277, cp277, ibm-277, ibm277,
    IBM278 : csIBM278, ebcdic-cp-se, cp278, 278, ebcdic-sv, ibm278, ibm-278,
    IBM280 : 280, ibm-280, ibm280, cp280,
    IBM284 : cpibm284, csIBM284, ibm284, cp284, 284, ibm-284,
    IBM285 : ibm285, ebcdic-cp-gb, cpibm285, cp285, csIBM285, ebcdic-gb, 285, ibm-285,
    IBM290 : cp290, ibm-290, ibm290, EBCDIC-JP-kana, 290, csIBM290,
    IBM297 : cp297, cpibm297, ibm297, ebcdic-cp-fr, 297, ibm-297, csIBM297,
    IBM420 : ibm420, cp420, 420, ibm-420, csIBM420, ebcdic-cp-ar1,
    IBM424 : csIBM424, ibm-424, ibm424, cp424, ebcdic-cp-he, 424,
    IBM437 : ibm-437, windows-437, cspc8codepage437, 437, ibm437, cp437,
    IBM500 : ibm-500, ebcdic-cp-bh, cp500, csIBM500, ibm500, ebcdic-cp-ch, 500,
    IBM775 : ibm-775, 775, cp775, ibm775,
    IBM850 : ibm-850, cp850, 850, cspc850multilingual, ibm850,
    IBM852 : ibm852, csPCp852, 852, ibm-852, cp852,
    IBM855 : cspcp855, 855, ibm855, ibm-855, cp855,
    IBM857 : csIBM857, 857, ibm-857, cp857, ibm857,
    IBM860 : 860, cp860, ibm-860, csIBM860, ibm860,
    IBM861 : 861, cp-is, ibm-861, cp861, csIBM861, ibm861,
    IBM862 : ibm-862, ibm862, csIBM862, cp862, cspc862latinhebrew, 862,
    IBM863 : ibm863, csIBM863, cp863, 863, ibm-863,
    IBM864 : csIBM864, ibm864, 864, cp864, ibm-864,
    IBM865 : csIBM865, ibm865, 865, ibm-865, cp865,
    IBM866 : 866, ibm-866, ibm866, csIBM866, cp866,
    IBM868 : 868, ibm-868, cp868, csIBM868, cp-ar, ibm868,
    IBM869 : 869, ibm-869, cp869, csIBM869, cp-gr, ibm869,
    IBM870 : ibm-870, ebcdic-cp-roece, ebcdic-cp-yu, csIBM870, ibm870, cp870, 870,
    IBM871 : ibm-871, 871, ebcdic-cp-is, cp871, csIBM871, ibm871,
    IBM918 : ebcdic-cp-ar2, 918, ibm-918, cp918,
    ISO-2022-CN : csISO2022CN, ISO2022CN,
    ISO-2022-JP : jis_encoding, csjisencoding, jis, iso2022jp, csISO2022JP,
    ISO-2022-JP-2 : csISO2022JP2, iso2022jp2,
    ISO-2022-KR : csISO2022KR, ISO2022KR,
    ISO-8859-1 : csISOLatin1, latin1, IBM-819, iso-ir-100, 8859_1, ISO_8859-1:1987, ISO_8859-1, 819, l1, ISO8859-1, IBM819, ISO_8859_1, ISO8859_1, cp819,
    ISO-8859-13 : 8859_13, iso8859_13, iso_8859-13, ISO8859-13,
    ISO-8859-15 : IBM923, 8859_15, ISO_8859-15, ISO-8859-15, L9, ISO8859-15, ISO8859_15_FDIS, 923, LATIN0, csISOlatin9, LATIN9, csISOlatin0, IBM-923, ISO8859_15, cp923,
    ISO-8859-2 : csISOLatin2, iso-ir-101, ibm-912, 8859_2, l2, ISO_8859-2, ibm912, 912, ISO8859-2, latin2, iso8859_2, ISO_8859-2:1987, cp912,
    ISO-8859-3 : ibm-913, latin3, csISOLatin3, iso-ir-109, l3, iso8859_3, ISO_8859-3:1988, 8859_3, ibm913, ISO8859-3, ISO_8859-3, 913, cp913,
    ISO-8859-4 : iso-ir-110, iso8859-4, ibm914, ibm-914, csISOLatin4, l4, 914, 8859_4, latin4, ISO_8859-4, ISO_8859-4:1988, iso8859_4, cp914,
    ISO-8859-5 : cp915, ISO8859-5, ibm915, ISO_8859-5:1988, ibm-915, 8859_5, 915, cyrillic, iso8859_5, ISO_8859-5, iso-ir-144, csISOLatinCyrillic,
    ISO-8859-6 : arabic, ibm1089, iso8859_6, iso-ir-127, 8859_6, cp1089, ECMA-114, ISO_8859-6, csISOLatinArabic, 1089, ibm-1089, ISO8859-6, ASMO-708, ISO_8859-6:1987,
    ISO-8859-7 : iso8859-7, sun_eu_greek, csISOLatinGreek, 813, ISO_8859-7, ibm-813, ISO_8859-7:1987, greek, greek8, iso8859_7, ECMA-118, iso-ir-126, 8859_7, cp813, ibm813, ELOT_928,
    ISO-8859-8 : ibm916, cp916, csISOLatinHebrew, ISO_8859-8, ISO8859-8, ibm-916, iso8859_8, hebrew, 916, iso-ir-138, ISO_8859-8:1988, 8859_8,
    ISO-8859-9 : ISO_8859-9, 920, iso8859_9, csISOLatin5, l5, 8859_9, latin5, ibm920, iso-ir-148, ISO_8859-9:1989, ISO8859-9, cp920, ibm-920,
    JIS_X0201 : JIS0201, X0201, JIS_X0201, csHalfWidthKatakana,
    JIS_X0212-1990 : csISO159JISX02121990, x0212, jis_x0212-1990, iso-ir-159, JIS0212,
    KOI8-R : cskoi8r, koi8_r, koi8,
    KOI8-U : koi8_u,
    Shift_JIS : x-sjis, shift_jis, sjis, ms_kanji, shift-jis, csShiftJIS,
    TIS-620 : tis620.2533, tis620,
    US-ASCII : cp367, ascii7, ISO646-US, 646, csASCII, us, iso_646.irv:1983, ISO_646.irv:1991, IBM367, ASCII, default, ANSI_X3.4-1986, ANSI_X3.4-1968, iso-ir-6,
    UTF-16 : utf16, UnicodeBig, UTF_16, unicode,
    UTF-16BE : X-UTF-16BE, UTF_16BE, ISO-10646-UCS-2, UnicodeBigUnmarked,
    UTF-16LE : UnicodeLittleUnmarked, UTF_16LE, X-UTF-16LE,
    UTF-32 : UTF32, UTF_32,
    UTF-32BE : X-UTF-32BE, UTF_32BE,
    UTF-32LE : X-UTF-32LE, UTF_32LE,
    UTF-8 : unicode-1-1-utf-8, UTF8,
    windows-1250 : cp1250, cp5346,
    windows-1251 : ansi-1251, cp5347, cp1251,
    windows-1252 : cp1252, cp5348,
    windows-1253 : cp5349, cp1253,
    windows-1254 : cp5350, cp1254,
    windows-1255 : cp1255,
    windows-1256 : cp1256,
    windows-1257 : cp1257, cp5353,
    windows-1258 : cp1258,
    windows-31j : csWindows31J, windows-932, MS932,
    x-Big5-HKSCS-2001 : big5-hkscs:unicode3.0, big5-hkscs-2001, big5hk-2001, big5hkscs-2001, Big5_HKSCS_2001,
    x-Big5-Solaris : Big5_Solaris,
    x-euc-jp-linux : euc_jp_linux, euc-jp-linux,
    x-EUC-TW : euctw, euc_tw, EUC-TW, cns11643,
    x-eucJP-Open : eucJP-open, EUC_JP_Solaris,
    x-IBM1006 : ibm-1006, cp1006, ibm1006, 1006,
    x-IBM1025 : ibm-1025, cp1025, 1025, ibm1025,
    x-IBM1046 : ibm-1046, ibm1046, cp1046, 1046,
    x-IBM1097 : 1097, cp1097, ibm-1097, ibm1097,
    x-IBM1098 : ibm-1098, ibm1098, cp1098, 1098,
    x-IBM1112 : ibm-1112, 1112, ibm1112, cp1112,
    x-IBM1122 : 1122, cp1122, ibm-1122, ibm1122,
    x-IBM1123 : ibm-1123, ibm1123, cp1123, 1123,
    x-IBM1124 : 1124, cp1124, ibm-1124, ibm1124,
    x-IBM1364 : 1364, cp1364, ibm1364, ibm-1364,
    x-IBM1381 : ibm-1381, ibm1381, cp1381, 1381,
    x-IBM1383 : cp1383, 1383, ibm-1383, ibm1383,
    x-IBM300 : ibm300, 300, cp300, ibm-300,
    x-IBM33722 : ibm33722, 33722, ibm-33722_vascii_vpua, ibm-5050, ibm-33722, cp33722,
    x-IBM737 : cp737, ibm-737, 737, ibm737,
    x-IBM833 : ibm-833, ibm833, cp833,
    x-IBM834 : 834, ibm834, ibm-834, cp834,
    x-IBM856 : 856, cp856, ibm-856, ibm856,
    x-IBM874 : 874, cp874, ibm874, ibm-874,
    x-IBM875 : 875, ibm875, cp875, ibm-875,
    x-IBM921 : cp921, ibm921, 921, ibm-921,
    x-IBM922 : ibm922, ibm-922, 922, cp922,
    x-IBM930 : cp930, ibm930, 930, ibm-930,
    x-IBM933 : 933, cp933, ibm933, ibm-933,
    x-IBM935 : ibm935, 935, cp935, ibm-935,
    x-IBM937 : ibm-937, cp937, 937, ibm937,
    x-IBM939 : ibm-939, ibm939, cp939, 939,
    x-IBM942 : ibm-942, ibm942, 942, cp942,
    x-IBM942C : 942C, ibm942C, ibm-942C, cp942C,
    x-IBM943 : ibm943, cp943, 943, ibm-943,
    x-IBM943C : ibm-943C, 943C, cp943C, ibm943C,
    x-IBM948 : ibm948, ibm-948, cp948, 948,
    x-IBM949 : 949, ibm-949, ibm949, cp949,
    x-IBM949C : ibm949C, cp949C, 949C, ibm-949C,
    x-IBM950 : 950, ibm950, cp950, ibm-950,
    x-IBM964 : 964, ibm-964, cp964, ibm964,
    x-IBM970 : 970, ibm-970, ibm970, cp970, ibm-eucKR,
    x-ISCII91 : iso-ir-153, ST_SEV_358-88, ISCII91, iscii, csISO153GOST1976874,
    x-ISO-2022-CN-CNS : ISO-2022-CN-CNS, ISO2022CN_CNS,
    x-ISO-2022-CN-GB : ISO-2022-CN-GB, ISO2022CN_GB,
    x-iso-8859-11 : iso-8859-11, iso8859_11,
    x-JIS0208 : JIS_X0208-1983, x0208, JIS0208, JIS_C6226-1983, iso-ir-87, csISO87JISX0208,
    x-JISAutoDetect : JISAutoDetect,
    x-Johab : ksc5601_1992, ms1361, johab, ksc5601-1992,
    x-MacArabic : MacArabic,
    x-MacCentralEurope : MacCentralEurope,
    x-MacCroatian : MacCroatian,
    x-MacCyrillic : MacCyrillic,
    x-MacDingbat : MacDingbat,
    x-MacGreek : MacGreek,
    x-MacHebrew : MacHebrew,
    x-MacIceland : MacIceland,
    x-MacRoman : MacRoman,
    x-MacRomania : MacRomania,
    x-MacSymbol : MacSymbol,
    x-MacThai : MacThai,
    x-MacTurkish : MacTurkish,
    x-MacUkraine : MacUkraine,
    x-MS932_0213 :
    x-MS950-HKSCS : MS950_HKSCS,
    x-MS950-HKSCS-XP : MS950_HKSCS_XP,
    x-mswin-936 : ms936, ms_936,
    x-PCK : pck,
    x-SJIS_0213 :
    x-UTF-16LE-BOM : UnicodeLittle,
    X-UTF-32BE-BOM : UTF-32BE-BOM, UTF_32BE_BOM,
    X-UTF-32LE-BOM : UTF_32LE_BOM, UTF-32LE-BOM,
    x-windows-50220 : ms50220, cp50220,
    x-windows-50221 : cp50221, ms50221,
    x-windows-874 : ms-874, ms874, windows-874,
    x-windows-949 : ms_949, windows-949, windows949, ms949,
    x-windows-950 : ms950, windows-950,
    x-windows-iso2022jp : windows-iso2022jp,
    */
}
