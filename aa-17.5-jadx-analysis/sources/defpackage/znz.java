package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class znz {
    static final yfy a;
    static final yfy b;
    static final yfy c;
    static final String d;
    static final Pattern e;
    static final Pattern f;
    static final String g;
    static final String h;
    static final String i;
    static final String j;
    static final Pattern k;

    static {
        yfu yfuVar = new yfu(4);
        yfuVar.e('0', '0');
        yfuVar.e('1', '1');
        yfuVar.e('2', '2');
        yfuVar.e('3', '3');
        yfuVar.e('4', '4');
        yfuVar.e('5', '5');
        yfuVar.e('6', '6');
        yfuVar.e('7', '7');
        yfuVar.e('8', '8');
        yfuVar.e('9', '9');
        yfy yfyVarD = yfuVar.d(true);
        a = yfyVarD;
        yfu yfuVar2 = new yfu(4);
        yfuVar2.e('A', '2');
        yfuVar2.e('B', '2');
        yfuVar2.e('C', '2');
        yfuVar2.e('D', '3');
        yfuVar2.e('E', '3');
        yfuVar2.e('F', '3');
        yfuVar2.e('G', '4');
        yfuVar2.e('H', '4');
        yfuVar2.e('I', '4');
        yfuVar2.e('J', '5');
        yfuVar2.e('K', '5');
        yfuVar2.e('L', '5');
        yfuVar2.e('M', '6');
        yfuVar2.e('N', '6');
        yfuVar2.e('O', '6');
        yfuVar2.e('P', '7');
        yfuVar2.e('Q', '7');
        yfuVar2.e('R', '7');
        yfuVar2.e('S', '7');
        yfuVar2.e('T', '8');
        yfuVar2.e('U', '8');
        yfuVar2.e('V', '8');
        yfuVar2.e('W', '9');
        yfuVar2.e('X', '9');
        yfuVar2.e('Y', '9');
        yfuVar2.e('Z', '9');
        yfy yfyVarD2 = yfuVar2.d(true);
        b = yfyVarD2;
        yfu yfuVar3 = new yfu(4);
        yfuVar3.h(yfyVarD2);
        yfuVar3.h(yfyVarD);
        c = yfuVar3.d(true);
        String strConcat = String.valueOf(yfyVarD2.keySet().toString().replaceAll("[, \\[\\]]", "")).concat(String.valueOf(woy.ar(yfyVarD2.keySet().toString()).replaceAll("[, \\[\\]]", "")));
        d = strConcat;
        e = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        f = Pattern.compile("^\\+(\\p{Nd}|[\\-\\.\\(\\)]?)*\\p{Nd}(\\p{Nd}|[\\-\\.\\(\\)]?)*$");
        String strConcat2 = String.valueOf(strConcat).concat("\\p{Nd}");
        g = strConcat2;
        String str = "[" + strConcat2 + "]+((\\-)*[" + strConcat2 + "])*";
        h = str;
        String str2 = "[" + strConcat + "]+((\\-)*[" + strConcat2 + "])*";
        i = str2;
        String str3 = "^(" + str + "\\.)*" + str2 + "\\.?$";
        j = str3;
        k = Pattern.compile(str3);
    }
}
