package defpackage;

import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class ahdw {
    public static final int a(ajhv ajhvVar) {
        return Arrays.hashCode(ajhvVar.b);
    }

    public static final String b(ajhv ajhvVar, int i) {
        String str = (String) woy.cW(ajhvVar.b, i + i);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException(a.bn(i, "name[", "]"));
    }

    public static final String c(ajhv ajhvVar, int i) {
        String str = (String) woy.cW(ajhvVar.b, i + i + 1);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException(a.bn(i, "value[", "]"));
    }

    public static final Iterator d(ajhv ajhvVar) {
        int iA = ajhvVar.a();
        aezu[] aezuVarArr = new aezu[iA];
        for (int i = 0; i < iA; i++) {
            aezuVarArr[i] = new aezu(b(ajhvVar, i), c(ajhvVar, i));
        }
        return afez.d(aezuVarArr);
    }

    public static final void e(String str) {
        str.getClass();
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '!' || cCharAt >= 127) {
                throw new IllegalArgumentException("Unexpected char 0x" + o(cCharAt) + " at " + i + " in header name: " + str);
            }
        }
    }

    public static final void f(String str, String str2) {
        str.getClass();
        str2.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (cCharAt < ' ' || cCharAt >= 127)) {
                throw new IllegalArgumentException("Unexpected char 0x" + o(cCharAt) + " at " + i + " in " + str2 + " value" + (ajiq.k(str2) ? "" : ": ".concat(str)));
            }
        }
    }

    public static final int g(String str, String str2, int i) {
        while (i < str.length()) {
            if (afyh.A(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static final ahfn getPropertySignature(ahis ahisVar, ahld ahldVar, ahlh ahlhVar, boolean z, boolean z2, boolean z3) {
        ahisVar.getClass();
        ahldVar.getClass();
        ahlhVar.getClass();
        ahop<ahis, ahly> ahopVar = ahmh.propertySignature;
        ahopVar.getClass();
        ahly ahlyVar = (ahly) ahlf.getExtensionOrNull(ahisVar, ahopVar);
        if (ahlyVar == null) {
            return null;
        }
        if (z) {
            ahml jvmFieldSignature = ahmt.INSTANCE.getJvmFieldSignature(ahisVar, ahldVar, ahlhVar, z3);
            if (jvmFieldSignature != null) {
                return ahfn.Companion.fromJvmMemberSignature(jvmFieldSignature);
            }
            return null;
        }
        if (!z2 || !ahlyVar.hasSyntheticMethod()) {
            return null;
        }
        ahfm ahfmVar = ahfn.Companion;
        ahlv syntheticMethod = ahlyVar.getSyntheticMethod();
        syntheticMethod.getClass();
        return ahfmVar.fromMethod(ahldVar, syntheticMethod);
    }

    public static final String h(ajhg ajhgVar) {
        String str = ajhgVar.o;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (ajhgVar.c) {
            sb.append("no-cache, ");
        }
        if (ajhgVar.d) {
            sb.append("no-store, ");
        }
        int i = ajhgVar.e;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = ajhgVar.f;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (ajhgVar.g) {
            sb.append("private, ");
        }
        if (ajhgVar.h) {
            sb.append("public, ");
        }
        if (ajhgVar.i) {
            sb.append("must-revalidate, ");
        }
        int i3 = ajhgVar.j;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = ajhgVar.k;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (ajhgVar.l) {
            sb.append("only-if-cached, ");
        }
        if (ajhgVar.m) {
            sb.append("no-transform, ");
        }
        if (ajhgVar.n) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length()).getClass();
        String string = sb.toString();
        ajhgVar.o = string;
        return string;
    }

    public static final ajhg i(ajhf ajhfVar) {
        return new ajhg(ajhfVar.a, ajhfVar.b, -1, -1, false, false, false, ajhfVar.c, -1, ajhfVar.d, false, false, null);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection] */
    public static final erb j(ajhv ajhvVar) {
        erb erbVar = new erb((byte[]) null, (short[]) null);
        woy.cr(erbVar.a, ajhvVar.b);
        return erbVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection] */
    public static final ajhv k(erb erbVar) {
        return new ajhv((String[]) erbVar.a.toArray(new String[0]));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public static final void l(erb erbVar, String str, String str2) {
        ?? r0 = erbVar.a;
        r0.add(str);
        r0.add(afyh.k(str2).toString());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public static final void m(erb erbVar, String str) {
        int i = 0;
        while (true) {
            ?? r1 = erbVar.a;
            if (i >= r1.size()) {
                return;
            }
            if (afyh.R(str, (String) r1.get(i))) {
                r1.remove(i);
                r1.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public static final void n(erb erbVar, String str, String str2) {
        e(str);
        f(str2, str);
        m(erbVar, str);
        l(erbVar, str, str2);
    }

    private static final String o(char c) {
        String string = Integer.toString(c, 16);
        string.getClass();
        return string.length() < 2 ? CloudRecognizerProtocolStrings.DBG_VALUE.concat(string) : string;
    }
}
