package Q1;

import A7.AbstractC0279p0;
import android.media.MediaFormat;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.List;
import ka.AbstractC3256n;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f9688a = new Object();

    public static String a(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (f9688a) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbQ = AbstractC0279p0.q(str, "\n  ");
        sbQ.append(strReplace.replace("\n", "\n  "));
        sbQ.append('\n');
        return sbQ.toString();
    }

    public static void b(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void c(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(String str, boolean z2) throws e {
        if (!z2) {
            throw new e(str);
        }
    }

    public static void e(int i5, int i10) {
        if (i5 < 0 || i5 >= i10) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void f(String str, boolean z2) {
        if (!z2) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void g(boolean z2) {
        if (!z2) {
            throw new IllegalStateException();
        }
    }

    public static void h(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str);
        }
    }

    public static void j(String str, String str2) {
        synchronized (f9688a) {
            Log.d(str, a(str2, null));
        }
    }

    public static void k(String str, String str2) {
        synchronized (f9688a) {
            Log.e(str, a(str2, null));
        }
    }

    public static void l(String str, String str2, Throwable th) {
        synchronized (f9688a) {
            Log.e(str, a(str2, th));
        }
    }

    public static String m(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i5 = 0; i5 < attributeCount; i5++) {
            if (xmlPullParser.getAttributeName(i5).equals(str)) {
                return xmlPullParser.getAttributeValue(i5);
            }
        }
        return null;
    }

    public static int[] n(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i5 = iIndexOf5 + 2;
        if (i5 < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i5) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static void o(String str, String str2) {
        synchronized (f9688a) {
            Log.i(str, a(str2, null));
        }
    }

    public static boolean p(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean q(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static void r(MediaFormat mediaFormat, String str, int i5) {
        if (i5 != -1) {
            mediaFormat.setInteger(str, i5);
        }
    }

    public static String s(StringBuilder sb2, int i5, int i10) {
        int i11;
        int iLastIndexOf;
        if (i5 >= i10) {
            return sb2.toString();
        }
        if (sb2.charAt(i5) == '/') {
            i5++;
        }
        int i12 = i5;
        int i13 = i12;
        while (i12 <= i10) {
            if (i12 == i10) {
                i11 = i12;
            } else if (sb2.charAt(i12) == '/') {
                i11 = i12 + 1;
            } else {
                i12++;
            }
            int i14 = i13 + 1;
            if (i12 == i14 && sb2.charAt(i13) == '.') {
                sb2.delete(i13, i11);
                i10 -= i11 - i13;
            } else {
                if (i12 == i13 + 2 && sb2.charAt(i13) == '.' && sb2.charAt(i14) == '.') {
                    iLastIndexOf = sb2.lastIndexOf("/", i13 - 2) + 1;
                    int i15 = iLastIndexOf > i5 ? iLastIndexOf : i5;
                    sb2.delete(i15, i11);
                    i10 -= i11 - i15;
                } else {
                    iLastIndexOf = i12 + 1;
                }
                i13 = iLastIndexOf;
            }
            i12 = i13;
        }
        return sb2.toString();
    }

    public static String t(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrN = n(str2);
        if (iArrN[0] != -1) {
            sb2.append(str2);
            s(sb2, iArrN[1], iArrN[2]);
            return sb2.toString();
        }
        int[] iArrN2 = n(str);
        if (iArrN[3] == 0) {
            sb2.append((CharSequence) str, 0, iArrN2[3]);
            sb2.append(str2);
            return sb2.toString();
        }
        if (iArrN[2] == 0) {
            sb2.append((CharSequence) str, 0, iArrN2[2]);
            sb2.append(str2);
            return sb2.toString();
        }
        int i5 = iArrN[1];
        if (i5 != 0) {
            int i10 = iArrN2[0] + 1;
            sb2.append((CharSequence) str, 0, i10);
            sb2.append(str2);
            return s(sb2, iArrN[1] + i10, i10 + iArrN[2]);
        }
        if (str2.charAt(i5) == '/') {
            sb2.append((CharSequence) str, 0, iArrN2[1]);
            sb2.append(str2);
            int i11 = iArrN2[1];
            return s(sb2, i11, iArrN[2] + i11);
        }
        int i12 = iArrN2[0] + 2;
        int i13 = iArrN2[1];
        if (i12 >= i13 || i13 != iArrN2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrN2[2] - 1);
            int i14 = iLastIndexOf == -1 ? iArrN2[1] : iLastIndexOf + 1;
            sb2.append((CharSequence) str, 0, i14);
            sb2.append(str2);
            return s(sb2, iArrN2[1], i14 + iArrN[2]);
        }
        sb2.append((CharSequence) str, 0, i13);
        sb2.append('/');
        sb2.append(str2);
        int i15 = iArrN2[1];
        return s(sb2, i15, iArrN[2] + i15 + 1);
    }

    public static Uri u(String str, String str2) {
        return Uri.parse(t(str, str2));
    }

    public static void v(MediaFormat mediaFormat, List list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            mediaFormat.setByteBuffer(AbstractC3256n.g(i5, "csd-"), ByteBuffer.wrap((byte[]) list.get(i5)));
        }
    }

    public static void w(String str, String str2) {
        synchronized (f9688a) {
            Log.w(str, a(str2, null));
        }
    }

    public static void x(String str, String str2, Throwable th) {
        synchronized (f9688a) {
            Log.w(str, a(str2, th));
        }
    }
}
