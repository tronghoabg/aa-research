package Jd;

import ef.C2515C;
import ff.AbstractC2645F;
import ff.AbstractC2651f;
import ff.C2648c;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.fork.ForkServer;
import r7.AbstractC3935e;

/* renamed from: Jd.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0668b {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f6042a;

    /* renamed from: b, reason: collision with root package name */
    public static final Set f6043b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f6044c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f6045d;

    /* renamed from: e, reason: collision with root package name */
    public static final ArrayList f6046e;

    static {
        ArrayList arrayListE0 = ff.o.E0(new zf.c('0', '9'), ff.o.C0(new zf.c('a', 'z'), new zf.c('A', 'Z')));
        ArrayList arrayList = new ArrayList(ff.p.a0(arrayListE0, 10));
        Iterator it = arrayListE0.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        f6042a = ff.o.X0(arrayList);
        f6043b = ff.o.X0(ff.o.E0(new zf.c('0', '9'), ff.o.C0(new zf.c('a', 'z'), new zf.c('A', 'Z'))));
        ff.o.X0(ff.o.E0(new zf.c('0', '9'), ff.o.C0(new zf.c('a', 'f'), new zf.c('A', 'F'))));
        Set setP0 = ff.m.P0(new Character[]{':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', ',', ';', '=', '-', '.', '_', '~', '+'});
        ArrayList arrayList2 = new ArrayList(ff.p.a0(setP0, 10));
        Iterator it2 = setP0.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        f6044c = arrayList2;
        f6045d = ff.m.P0(new Character[]{':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', '=', '-', '.', '_', '~'});
        AbstractC2645F.Z(f6043b, ff.m.P0(new Character[]{'!', '#', '$', '&', '+', '-', '.', '^', '_', '`', '|', '~'}));
        List listD = AbstractC3935e.D('-', '.', '_', '~');
        ArrayList arrayList3 = new ArrayList(ff.p.a0(listD, 10));
        Iterator it3 = listD.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        f6046e = arrayList3;
    }

    public static final int a(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        if ('a' > c10 || c10 >= 'g') {
            return -1;
        }
        return c10 - 'W';
    }

    public static final String b(String str, int i5, int i10, boolean z2) throws Ya.a {
        int i11 = i5;
        while (i11 < i10) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '%' || (z2 && cCharAt == '+')) {
                int i12 = i10 - i5;
                if (i12 > 255) {
                    i12 /= 3;
                }
                StringBuilder sb2 = new StringBuilder(i12);
                if (i11 > i5) {
                    sb2.append((CharSequence) str, i5, i11);
                }
                byte[] bArr = null;
                while (i11 < i10) {
                    char cCharAt2 = str.charAt(i11);
                    if (z2 && cCharAt2 == '+') {
                        sb2.append(' ');
                    } else if (cCharAt2 == '%') {
                        if (bArr == null) {
                            bArr = new byte[(i10 - i11) / 3];
                        }
                        int i13 = 0;
                        while (i11 < i10 && str.charAt(i11) == '%') {
                            int i14 = i11 + 2;
                            if (i14 >= i10) {
                                StringBuilder sb3 = new StringBuilder("Incomplete trailing HEX escape: ");
                                sb3.append(str.subSequence(i11, str.length()).toString());
                                sb3.append(", in ");
                                sb3.append((Object) str);
                                throw new Ya.a(N0.a.d(i11, " at ", sb3));
                            }
                            int i15 = i11 + 1;
                            int iA = a(str.charAt(i15));
                            int iA2 = a(str.charAt(i14));
                            if (iA == -1 || iA2 == -1) {
                                throw new Ya.a("Wrong HEX escape: %" + str.charAt(i15) + str.charAt(i14) + ", in " + ((Object) str) + ", at " + i11);
                            }
                            bArr[i13] = (byte) ((iA * 16) + iA2);
                            i11 += 3;
                            i13++;
                        }
                        C2648c c2648c = AbstractC2651f.Companion;
                        int length = bArr.length;
                        c2648c.getClass();
                        C2648c.a(0, i13, length);
                        sb2.append(new String(bArr, 0, i13, Bf.a.f1670a));
                    } else {
                        sb2.append(cCharAt2);
                    }
                    i11++;
                }
                String string = sb2.toString();
                AbstractC3340k.d(string, "toString(...)");
                return string;
            }
            i11++;
        }
        if (i5 == 0 && i10 == str.length()) {
            return str.toString();
        }
        String strSubstring = str.substring(i5, i10);
        AbstractC3340k.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String c(String str) {
        int length = str.length();
        Charset charset = Bf.a.f1670a;
        AbstractC3340k.e(str, "<this>");
        AbstractC3340k.e(charset, "charset");
        return b(str, 0, length, false);
    }

    public static String d(int i5, int i10, int i11, String str) {
        if ((i11 & 1) != 0) {
            i5 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        boolean z2 = (i11 & 4) == 0;
        Charset charset = Bf.a.f1670a;
        AbstractC3340k.e(str, "<this>");
        AbstractC3340k.e(charset, "charset");
        return b(str, i5, i10, z2);
    }

    public static final String e(String str, final boolean z2) {
        AbstractC3340k.e(str, "<this>");
        final StringBuilder sb2 = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = Bf.a.f1670a.newEncoder();
        AbstractC3340k.d(charsetEncoderNewEncoder, "newEncoder(...)");
        f(AbstractC3935e.x(charsetEncoderNewEncoder, str, 0, str.length()), new tf.l() { // from class: Jd.a
            @Override // tf.l
            public final Object invoke(Object obj) {
                Byte b5 = (Byte) obj;
                byte bByteValue = b5.byteValue();
                boolean zContains = AbstractC0668b.f6042a.contains(b5);
                StringBuilder sb3 = sb2;
                if (zContains || AbstractC0668b.f6046e.contains(b5)) {
                    sb3.append((char) bByteValue);
                } else if (z2 && bByteValue == 32) {
                    sb3.append('+');
                } else {
                    sb3.append(AbstractC0668b.g(bByteValue));
                }
                return C2515C.f34653a;
            }
        });
        return sb2.toString();
    }

    public static final void f(Pf.a aVar, tf.l lVar) {
        while (!aVar.exhausted()) {
            while (!aVar.exhausted()) {
                lVar.invoke(Byte.valueOf(aVar.readByte()));
            }
        }
    }

    public static final String g(byte b5) {
        int i5 = (b5 & ForkServer.ERROR) >> 4;
        int i10 = b5 & 15;
        return new String(new char[]{'%', (char) ((i5 < 0 || i5 >= 10) ? ((char) (i5 + 65)) - '\n' : i5 + 48), (char) ((i10 < 0 || i10 >= 10) ? ((char) (i10 + 65)) - '\n' : i10 + 48)});
    }
}
