package ff;

import A7.AbstractC0279p0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import p7.AbstractC3772b;
import r7.AbstractC3935e;
import vf.AbstractC4345a;

/* loaded from: classes5.dex */
public abstract class m extends AbstractC3772b {
    public static String A0(Object[] objArr, String str, String str2, String str3, tf.l lVar, int i5) {
        if ((i5 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i5 & 2) != 0 ? "" : str2;
        String str6 = (i5 & 4) != 0 ? "" : str3;
        if ((i5 & 32) != 0) {
            lVar = null;
        }
        AbstractC3340k.e(objArr, "<this>");
        StringBuilder sb2 = new StringBuilder();
        z0(objArr, sb2, str4, str5, str6, "...", lVar);
        return sb2.toString();
    }

    public static int B0(int[] iArr) {
        if (iArr.length != 0) {
            return iArr[iArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object C0(Object[] objArr) {
        AbstractC3340k.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static char D0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object E0(Object[] objArr) {
        AbstractC3340k.e(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final void F0(Object[] objArr, LinkedHashSet linkedHashSet) {
        AbstractC3340k.e(objArr, "<this>");
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
    }

    public static List G0(byte[] bArr) {
        AbstractC3340k.e(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            return v.f35432a;
        }
        if (length == 1) {
            return AbstractC3935e.C(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b5 : bArr) {
            arrayList.add(Byte.valueOf(b5));
        }
        return arrayList;
    }

    public static List H0(double[] dArr) {
        AbstractC3340k.e(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            return v.f35432a;
        }
        if (length == 1) {
            return AbstractC3935e.C(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d3 : dArr) {
            arrayList.add(Double.valueOf(d3));
        }
        return arrayList;
    }

    public static List I0(float[] fArr) {
        AbstractC3340k.e(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return v.f35432a;
        }
        if (length == 1) {
            return AbstractC3935e.C(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    public static List J0(int[] iArr) {
        AbstractC3340k.e(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? N0(iArr) : AbstractC3935e.C(Integer.valueOf(iArr[0])) : v.f35432a;
    }

    public static List K0(long[] jArr) {
        AbstractC3340k.e(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return v.f35432a;
        }
        if (length == 1) {
            return AbstractC3935e.C(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j8 : jArr) {
            arrayList.add(Long.valueOf(j8));
        }
        return arrayList;
    }

    public static List L0(Object[] objArr) {
        AbstractC3340k.e(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return v.f35432a;
        }
        if (length == 1) {
            return AbstractC3935e.C(objArr[0]);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC3340k.d(objArrCopyOf, "copyOf(...)");
        return c0(objArrCopyOf);
    }

    public static List M0(short[] sArr) {
        AbstractC3340k.e(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            return v.f35432a;
        }
        if (length == 1) {
            return AbstractC3935e.C(Short.valueOf(sArr[0]));
        }
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s10 : sArr) {
            arrayList.add(Short.valueOf(s10));
        }
        return arrayList;
    }

    public static ArrayList N0(int[] iArr) {
        AbstractC3340k.e(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i5 : iArr) {
            arrayList.add(Integer.valueOf(i5));
        }
        return arrayList;
    }

    public static ArrayList O0(Object[] objArr) {
        AbstractC3340k.e(objArr, "<this>");
        return new ArrayList(new k(objArr, false));
    }

    public static Set P0(Object[] objArr) {
        AbstractC3340k.e(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return x.f35434a;
        }
        if (length == 1) {
            return tg.b.P(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC2641B.D(objArr.length));
        F0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static List c0(Object[] objArr) {
        AbstractC3340k.e(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        AbstractC3340k.d(listAsList, "asList(...)");
        return listAsList;
    }

    public static Af.k d0(Object[] objArr) {
        return objArr.length == 0 ? Af.e.f1294a : new Af.o(objArr, 4);
    }

    public static boolean e0(Object obj, Object[] objArr) {
        AbstractC3340k.e(objArr, "<this>");
        return y0(obj, objArr) >= 0;
    }

    public static void f0(int i5, int i10, int i11, byte[] bArr, byte[] destination) {
        AbstractC3340k.e(bArr, "<this>");
        AbstractC3340k.e(destination, "destination");
        System.arraycopy(bArr, i10, destination, i5, i11 - i10);
    }

    public static void g0(int i5, int i10, int i11, int[] iArr, int[] destination) {
        AbstractC3340k.e(iArr, "<this>");
        AbstractC3340k.e(destination, "destination");
        System.arraycopy(iArr, i10, destination, i5, i11 - i10);
    }

    public static void h0(Object[] objArr, int i5, Object[] destination, int i10, int i11) {
        AbstractC3340k.e(objArr, "<this>");
        AbstractC3340k.e(destination, "destination");
        System.arraycopy(objArr, i10, destination, i5, i11 - i10);
    }

    public static /* synthetic */ void i0(int i5, int i10, int[] iArr, int[] iArr2) {
        if ((i10 & 8) != 0) {
            i5 = iArr.length;
        }
        g0(0, 0, i5, iArr, iArr2);
    }

    public static /* synthetic */ void j0(Object[] objArr, int i5, Object[] objArr2, int i10, int i11) {
        if ((i11 & 4) != 0) {
            i5 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = objArr.length;
        }
        h0(objArr, 0, objArr2, i5, i10);
    }

    public static byte[] k0(int i5, int i10, byte[] bArr) {
        AbstractC3340k.e(bArr, "<this>");
        AbstractC3772b.m(i10, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i5, i10);
        AbstractC3340k.d(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static float[] l0(float[] fArr, int i5, int i10) {
        AbstractC3772b.m(i10, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i5, i10);
        AbstractC3340k.d(fArrCopyOfRange, "copyOfRange(...)");
        return fArrCopyOfRange;
    }

    public static Object[] m0(Object[] objArr, int i5, int i10) {
        AbstractC3340k.e(objArr, "<this>");
        AbstractC3772b.m(i10, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i5, i10);
        AbstractC3340k.d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static List n0(int i5, Object[] objArr) {
        if (i5 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.i(i5, "Requested element count ", " is less than zero.").toString());
        }
        int length = objArr.length - i5;
        if (length < 0) {
            length = 0;
        }
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.i(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length == 0) {
            return v.f35432a;
        }
        int length2 = objArr.length;
        return length >= length2 ? L0(objArr) : length == 1 ? AbstractC3935e.C(objArr[length2 - 1]) : c0(m0(objArr, length2 - length, length2));
    }

    public static void o0(Object[] objArr, H6.g gVar, int i5, int i10) {
        AbstractC3340k.e(objArr, "<this>");
        Arrays.fill(objArr, i5, i10, gVar);
    }

    public static void p0(int i5, int[] iArr) {
        int length = iArr.length;
        AbstractC3340k.e(iArr, "<this>");
        Arrays.fill(iArr, 0, length, i5);
    }

    public static void q0(long[] jArr) {
        int length = jArr.length;
        AbstractC3340k.e(jArr, "<this>");
        Arrays.fill(jArr, 0, length, -9187201950435737472L);
    }

    public static ArrayList s0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int t0(int[] iArr) {
        if (iArr.length != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object u0(Object[] objArr) {
        AbstractC3340k.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object v0(Object[] objArr) {
        AbstractC3340k.e(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static Integer w0(int i5, int[] iArr) {
        if (i5 < 0 || i5 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i5]);
    }

    public static Object x0(int i5, Object[] objArr) {
        AbstractC3340k.e(objArr, "<this>");
        if (i5 < 0 || i5 >= objArr.length) {
            return null;
        }
        return objArr[i5];
    }

    public static int y0(Object obj, Object[] objArr) {
        AbstractC3340k.e(objArr, "<this>");
        int i5 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i5 < length) {
                if (objArr[i5] == null) {
                    return i5;
                }
                i5++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i5 < length2) {
            if (obj.equals(objArr[i5])) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static final void z0(Object[] objArr, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, tf.l lVar) {
        AbstractC3340k.e(objArr, "<this>");
        sb2.append(charSequence2);
        int i5 = 0;
        for (Object obj : objArr) {
            i5++;
            if (i5 > 1) {
                sb2.append(charSequence);
            }
            AbstractC4345a.i(sb2, obj, lVar);
        }
        sb2.append(charSequence3);
    }
}
