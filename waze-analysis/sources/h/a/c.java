package h.a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import l.a.bcd;
import l.a.bde;
import l.a.bfg;
import l.a.bga;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class c {
    public static int A(Object[] objArr) {
        h.g.b.x.f(objArr, "<this>");
        return objArr.length - 1;
    }

    public static int B(int[] iArr, int i2) {
        h.g.b.x.f(iArr, "<this>");
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (i2 == iArr[i3]) {
                return i3;
            }
        }
        return -1;
    }

    public static int C(Object[] objArr, Object obj) {
        h.g.b.x.f(objArr, "<this>");
        int i2 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i2 < length) {
                if (objArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i2 < length2) {
            if (h.g.b.x.n(obj, objArr[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int D(int[] iArr) {
        h.g.b.x.f(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i2 = iArr[0];
        int iY = y(iArr);
        if (iY > 0) {
            int i3 = 1;
            while (true) {
                int i4 = iArr[i3];
                if (i2 < i4) {
                    i2 = i4;
                }
                if (i3 == iY) {
                    break;
                }
                i3++;
            }
        }
        return i2;
    }

    public static int E(int[] iArr) {
        h.g.b.x.f(iArr, "<this>");
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        return i2;
    }

    public static Float F(float[] fArr) {
        h.g.b.x.f(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    public static Float G(float[] fArr) {
        h.g.b.x.f(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return null;
        }
        return Float.valueOf(fArr[length - 1]);
    }

    public static Iterable H(double[] dArr) {
        h.g.b.x.f(dArr, "<this>");
        return dArr.length == 0 ? i.h() : new w(dArr, 4);
    }

    public static Iterable I(float[] fArr) {
        h.g.b.x.f(fArr, "<this>");
        return fArr.length == 0 ? i.h() : new w(fArr, 3);
    }

    public static Iterable J(int[] iArr) {
        h.g.b.x.f(iArr, "<this>");
        return iArr.length == 0 ? i.h() : new w(iArr, 0);
    }

    public static Iterable K(long[] jArr) {
        h.g.b.x.f(jArr, "<this>");
        return jArr.length == 0 ? i.h() : new w(jArr, 2);
    }

    public static Iterable L(Object[] objArr) {
        h.g.b.x.f(objArr, "<this>");
        return objArr.length == 0 ? i.h() : new w(objArr, 1);
    }

    public static Object M(Object[] objArr) {
        h.g.b.x.f(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object N(Object[] objArr) {
        h.g.b.x.f(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static Object O(Object[] objArr, int i2) {
        h.g.b.x.f(objArr, "<this>");
        if (i2 < 0 || i2 >= objArr.length) {
            return null;
        }
        return objArr[i2];
    }

    public static Object P(Object[] objArr) {
        h.g.b.x.f(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static List Q(Object[] objArr, int i2) {
        h.g.b.x.f(objArr, "<this>");
        int length = objArr.length;
        h.g.b.x.f(objArr, "<this>");
        int iH = h.k.n.h(length - i2, 0);
        if (iH >= 0) {
            return iH == 0 ? i.h() : iH >= length ? X(objArr) : iH == 1 ? i.d(objArr[length - 1]) : i(u(objArr, length - iH, length));
        }
        throw new IllegalArgumentException("Requested element count " + iH + " is less than zero.");
    }

    public static List R(Object[] objArr) {
        h.g.b.x.f(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        aB(objArr, arrayList);
        return arrayList;
    }

    public static List S(Object[] objArr, h.k.j jVar) {
        h.g.b.x.f(objArr, "<this>");
        h.g.b.x.f(jVar, "indices");
        return jVar.isEmpty() ? i.h() : i(u(objArr, jVar.getStart().intValue(), jVar.getEndInclusive().intValue() + 1));
    }

    public static List T(double[] dArr) {
        h.g.b.x.f(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            return i.h();
        }
        if (length == 1) {
            return i.d(Double.valueOf(dArr[0]));
        }
        h.g.b.x.f(dArr, "<this>");
        ArrayList arrayList = new ArrayList(length);
        for (double d2 : dArr) {
            arrayList.add(Double.valueOf(d2));
        }
        return arrayList;
    }

    public static List U(float[] fArr) {
        h.g.b.x.f(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return i.h();
        }
        if (length == 1) {
            return i.d(Float.valueOf(fArr[0]));
        }
        h.g.b.x.f(fArr, "<this>");
        ArrayList arrayList = new ArrayList(length);
        for (float f2 : fArr) {
            arrayList.add(Float.valueOf(f2));
        }
        return arrayList;
    }

    public static List V(int[] iArr) {
        h.g.b.x.f(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? Z(iArr) : i.d(Integer.valueOf(iArr[0])) : i.h();
    }

    public static List W(long[] jArr) {
        h.g.b.x.f(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return i.h();
        }
        if (length == 1) {
            return i.d(Long.valueOf(jArr[0]));
        }
        h.g.b.x.f(jArr, "<this>");
        ArrayList arrayList = new ArrayList(length);
        for (long j2 : jArr) {
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }

    public static List X(Object[] objArr) {
        h.g.b.x.f(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return ac.f47967a;
        }
        if (length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            h.g.b.x.e(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
        h.g.b.x.e(objArrCopyOf, "copyOf(...)");
        h.g.b.x.f(objArrCopyOf, "<this>");
        List listAsList = Arrays.asList(objArrCopyOf);
        h.g.b.x.e(listAsList, "asList(...)");
        return listAsList;
    }

    public static List Y(boolean[] zArr) {
        h.g.b.x.f(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            return i.h();
        }
        if (length == 1) {
            return i.d(Boolean.valueOf(zArr[0]));
        }
        h.g.b.x.f(zArr, "<this>");
        ArrayList arrayList = new ArrayList(length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    public static List Z(int[] iArr) {
        h.g.b.x.f(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i2 : iArr) {
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList;
    }

    public static final void a(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
    }

    public static void aB(Object[] objArr, Collection collection) {
        h.g.b.x.f(objArr, "<this>");
        h.g.b.x.f(collection, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
    }

    public static /* synthetic */ String aC(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, h.g.a.l lVar, int i2) throws IOException {
        if ((i2 & 1) != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        char c2 = 0;
        char c3 = (i2 & 8) != 0 ? (char) 65535 : (char) 0;
        String str = (i2 & 16) != 0 ? "..." : null;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        h.g.b.x.f(bArr, "<this>");
        h.g.b.x.f(charSequence, "separator");
        h.g.b.x.f(charSequence2, "prefix");
        h.g.b.x.f(charSequence3, "postfix");
        h.g.b.x.f(str, "truncated");
        StringBuilder sb = new StringBuilder();
        h.g.b.x.f(bArr, "<this>");
        h.g.b.x.f(sb, "buffer");
        h.g.b.x.f(charSequence, "separator");
        h.g.b.x.f(charSequence2, "prefix");
        h.g.b.x.f(charSequence3, "postfix");
        h.g.b.x.f(str, "truncated");
        sb.append(charSequence2);
        int length = bArr.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= length) {
                c2 = c3;
                break;
            }
            byte b2 = bArr[i3];
            i4++;
            if (i4 > 1) {
                sb.append(charSequence);
            }
            if (c3 >= 0 && i4 > 0) {
                break;
            }
            if (lVar != null) {
                sb.append((CharSequence) lVar.invoke(Byte.valueOf(b2)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b2));
            }
            i3++;
        }
        if (c2 >= 0 && i4 > 0) {
            sb.append((CharSequence) str);
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public static /* synthetic */ String aD(float[] fArr, CharSequence charSequence, int i2, CharSequence charSequence2, h.g.a.l lVar, int i3) throws IOException {
        if ((i3 & 1) != 0) {
        }
        String str = (i3 & 2) != 0 ? "" : null;
        String str2 = (i3 & 4) != 0 ? "" : null;
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) != 0) {
            lVar = null;
        }
        h.g.b.x.f(fArr, "<this>");
        h.g.b.x.f(charSequence, "separator");
        h.g.b.x.f(str, "prefix");
        h.g.b.x.f(str2, "postfix");
        h.g.b.x.f(charSequence2, "truncated");
        StringBuilder sb = new StringBuilder();
        h.g.b.x.f(fArr, "<this>");
        h.g.b.x.f(sb, "buffer");
        h.g.b.x.f(charSequence, "separator");
        h.g.b.x.f(str, "prefix");
        h.g.b.x.f(str2, "postfix");
        h.g.b.x.f(charSequence2, "truncated");
        sb.append((CharSequence) str);
        int i4 = 0;
        for (float f2 : fArr) {
            i4++;
            if (i4 > 1) {
                sb.append(charSequence);
            }
            if (i2 >= 0 && i4 > i2) {
                break;
            }
            if (lVar != null) {
                sb.append((CharSequence) lVar.invoke(Float.valueOf(f2)));
            } else {
                sb.append((CharSequence) String.valueOf(f2));
            }
        }
        if (i2 >= 0 && i4 > i2) {
            sb.append(charSequence2);
        }
        sb.append((CharSequence) str2);
        return sb.toString();
    }

    public static /* synthetic */ String aE(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, h.g.a.l lVar, int i2) throws IOException {
        if ((i2 & 1) != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        char c2 = 0;
        char c3 = (i2 & 8) != 0 ? (char) 65535 : (char) 0;
        String str = (i2 & 16) != 0 ? "..." : null;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        h.g.b.x.f(objArr, "<this>");
        h.g.b.x.f(charSequence, "separator");
        h.g.b.x.f(charSequence2, "prefix");
        h.g.b.x.f(charSequence3, "postfix");
        h.g.b.x.f(str, "truncated");
        StringBuilder sb = new StringBuilder();
        h.g.b.x.f(objArr, "<this>");
        h.g.b.x.f(sb, "buffer");
        h.g.b.x.f(charSequence, "separator");
        h.g.b.x.f(charSequence2, "prefix");
        h.g.b.x.f(charSequence3, "postfix");
        h.g.b.x.f(str, "truncated");
        sb.append(charSequence2);
        int length = objArr.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= length) {
                c2 = c3;
                break;
            }
            Object obj = objArr[i3];
            i4++;
            if (i4 > 1) {
                sb.append(charSequence);
            }
            if (c3 >= 0 && i4 > 0) {
                break;
            }
            h.n.o.b(sb, obj, lVar);
            i3++;
        }
        if (c2 >= 0 && i4 > 0) {
            sb.append((CharSequence) str);
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public static void aF(double[] dArr, int i2) {
        h.g.b.x.f(dArr, "<this>");
        Arrays.sort(dArr, 0, i2);
    }

    public static void aG(float[] fArr, int i2) {
        h.g.b.x.f(fArr, "<this>");
        Arrays.sort(fArr, 0, i2);
    }

    public static void aH(int[] iArr, int i2) {
        h.g.b.x.f(iArr, "<this>");
        Arrays.sort(iArr, 0, i2);
    }

    public static void aI(long[] jArr, int i2) {
        h.g.b.x.f(jArr, "<this>");
        Arrays.sort(jArr, 0, i2);
    }

    public static void aJ(Object[] objArr, Collection collection) {
        h.g.b.x.f(objArr, "<this>");
        h.g.b.x.f(collection, "destination");
        for (Object obj : objArr) {
            collection.add(obj);
        }
    }

    public static /* synthetic */ void aK(float[] fArr, float[] fArr2, int i2, int i3, int i4) {
        if ((i4 & 8) != 0) {
            i3 = fArr.length;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        aq(fArr, fArr2, i2, 0, i3);
    }

    public static /* synthetic */ void aL(Object[] objArr, Object[] objArr2, int i2, int i3, int i4, int i5) {
        if ((i5 & 8) != 0) {
            i4 = objArr.length;
        }
        int i6 = i5 & 4;
        int i7 = i5 & 2;
        if (i6 != 0) {
            i3 = 0;
        }
        if (i7 != 0) {
            i2 = 0;
        }
        at(objArr, objArr2, i2, i3, i4);
    }

    public static /* synthetic */ void aM(int[] iArr, int[] iArr2, int i2, int i3, int i4) {
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        ar(iArr, iArr2, i2, 0, i3);
    }

    public static final Iterator aN(Iterator it, int i2, boolean z, boolean z2) {
        h.g.b.x.f(it, "iterator");
        return !it.hasNext() ? ab.f47966a : h.m.k.a(new at(i2, it, z2, z, null));
    }

    public static final /* synthetic */ int aO(int i2) {
        return Integer.numberOfLeadingZeros(i2) + 1;
    }

    public static final /* synthetic */ com.waze.shared_infra.coordinators.c aQ(bga bgaVar) {
        h.g.b.x.f(bgaVar, "builder");
        return new com.waze.shared_infra.coordinators.c(bgaVar);
    }

    public static final /* synthetic */ com.waze.shared_infra.coordinators.c aR(bfg bfgVar) {
        h.g.b.x.f(bfgVar, "builder");
        return new com.waze.shared_infra.coordinators.c(bfgVar);
    }

    public static final /* synthetic */ com.waze.shared_infra.coordinators.c aS(bde bdeVar) {
        h.g.b.x.f(bdeVar, "builder");
        return new com.waze.shared_infra.coordinators.c(bdeVar);
    }

    public static final /* synthetic */ com.waze.shared_infra.coordinators.c aT(bcd bcdVar) {
        h.g.b.x.f(bcdVar, "builder");
        return new com.waze.shared_infra.coordinators.c(bcdVar);
    }

    private static void aU(Object[] objArr, StringBuilder sb, List list) {
        if (list.contains(objArr)) {
            sb.append("[...]");
            return;
        }
        list.add(objArr);
        sb.append('[');
        int length = objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 != 0) {
                sb.append(", ");
            }
            Object obj = objArr[i2];
            if (obj == null) {
                sb.append("null");
            } else if (obj instanceof Object[]) {
                aU((Object[]) obj, sb, list);
            } else if (obj instanceof byte[]) {
                String string = Arrays.toString((byte[]) obj);
                h.g.b.x.e(string, "toString(...)");
                sb.append(string);
            } else if (obj instanceof short[]) {
                String string2 = Arrays.toString((short[]) obj);
                h.g.b.x.e(string2, "toString(...)");
                sb.append(string2);
            } else if (obj instanceof int[]) {
                String string3 = Arrays.toString((int[]) obj);
                h.g.b.x.e(string3, "toString(...)");
                sb.append(string3);
            } else if (obj instanceof long[]) {
                String string4 = Arrays.toString((long[]) obj);
                h.g.b.x.e(string4, "toString(...)");
                sb.append(string4);
            } else if (obj instanceof float[]) {
                String string5 = Arrays.toString((float[]) obj);
                h.g.b.x.e(string5, "toString(...)");
                sb.append(string5);
            } else if (obj instanceof double[]) {
                String string6 = Arrays.toString((double[]) obj);
                h.g.b.x.e(string6, "toString(...)");
                sb.append(string6);
            } else if (obj instanceof char[]) {
                String string7 = Arrays.toString((char[]) obj);
                h.g.b.x.e(string7, "toString(...)");
                sb.append(string7);
            } else if (obj instanceof boolean[]) {
                String string8 = Arrays.toString((boolean[]) obj);
                h.g.b.x.e(string8, "toString(...)");
                sb.append(string8);
            } else if (obj instanceof h.r) {
                byte[] bArrB = ((h.r) obj).b();
                sb.append(bArrB != null ? i.aM(h.r.a(bArrB), ", ", "[", "]", 0, null, 56) : "null");
            } else if (obj instanceof h.z) {
                short[] sArrB = ((h.z) obj).b();
                sb.append(sArrB != null ? i.aM(h.z.a(sArrB), ", ", "[", "]", 0, null, 56) : "null");
            } else if (obj instanceof h.u) {
                int[] iArrB = ((h.u) obj).b();
                sb.append(iArrB != null ? i.aM(h.u.a(iArrB), ", ", "[", "]", 0, null, 56) : "null");
            } else if (obj instanceof h.w) {
                long[] jArrB = ((h.w) obj).b();
                sb.append(jArrB != null ? i.aM(h.w.a(jArrB), ", ", "[", "]", 0, null, 56) : "null");
            } else {
                sb.append(obj.toString());
            }
        }
        sb.append(']');
        list.remove(i.e(list));
    }

    public static List aa(Object[] objArr) {
        h.g.b.x.f(objArr, "<this>");
        return new ArrayList(i.g(objArr, false));
    }

    public static List ab(Object[] objArr, Object[] objArr2) {
        h.g.b.x.f(objArr, "<this>");
        h.g.b.x.f(objArr2, "other");
        int iMin = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(new h.k(objArr[i2], objArr2[i2]));
        }
        return arrayList;
    }

    public static Set ac(int[] iArr) {
        h.g.b.x.f(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return e.c.d.a.p();
        }
        if (length == 1) {
            return e.c.d.a.o(Integer.valueOf(iArr[0]));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(r.a(length));
        h.g.b.x.f(iArr, "<this>");
        h.g.b.x.f(linkedHashSet, "destination");
        for (int i2 : iArr) {
            linkedHashSet.add(Integer.valueOf(i2));
        }
        return linkedHashSet;
    }

    public static Set ad(Object[] objArr) {
        h.g.b.x.f(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return e.c.d.a.p();
        }
        if (length == 1) {
            return e.c.d.a.o(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(r.a(length));
        aJ(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static h.k.j ae(int[] iArr) {
        h.g.b.x.f(iArr, "<this>");
        return new h.k.j(0, y(iArr));
    }

    public static boolean af(byte[] bArr, byte b2) {
        h.g.b.x.f(bArr, "<this>");
        h.g.b.x.f(bArr, "<this>");
        int length = bArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (b2 != bArr[i2]) {
                i2++;
            } else if (i2 >= 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean ag(char[] cArr, char c2) {
        h.g.b.x.f(cArr, "<this>");
        h.g.b.x.f(cArr, "<this>");
        for (char c3 : cArr) {
            if (c2 == c3) {
                return true;
            }
        }
        return false;
    }

    public static boolean ah(int[] iArr, int i2) {
        h.g.b.x.f(iArr, "<this>");
        return B(iArr, i2) >= 0;
    }

    public static boolean ai(long[] jArr, long j2) {
        h.g.b.x.f(jArr, "<this>");
        h.g.b.x.f(jArr, "<this>");
        int length = jArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (j2 != jArr[i2]) {
                i2++;
            } else if (i2 >= 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean aj(Object[] objArr, Object obj) {
        h.g.b.x.f(objArr, "<this>");
        return C(objArr, obj) >= 0;
    }

    public static boolean ak(short[] sArr, short s) {
        h.g.b.x.f(sArr, "<this>");
        h.g.b.x.f(sArr, "<this>");
        int length = sArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (s != sArr[i2]) {
                i2++;
            } else if (i2 >= 0) {
                return true;
            }
        }
        return false;
    }

    public static byte[] al(byte[] bArr, h.k.j jVar) {
        h.g.b.x.f(bArr, "<this>");
        h.g.b.x.f(jVar, "indices");
        return jVar.isEmpty() ? new byte[0] : l(bArr, jVar.getStart().intValue(), jVar.getEndInclusive().intValue() + 1);
    }

    public static /* synthetic */ int am(float[] fArr, float f2) {
        int length = fArr.length;
        h.g.b.x.f(fArr, "<this>");
        return Arrays.binarySearch(fArr, 0, length, f2);
    }

    public static void an(byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        h.g.b.x.f(bArr, "<this>");
        h.g.b.x.f(bArr2, "destination");
        System.arraycopy(bArr, i3, bArr2, i2, i4 - i3);
    }

    public static void ao(char[] cArr, char[] cArr2, int i2, int i3, int i4) {
        h.g.b.x.f(cArr, "<this>");
        h.g.b.x.f(cArr2, "destination");
        System.arraycopy(cArr, i3, cArr2, i2, i4 - i3);
    }

    public static void ap(double[] dArr, double[] dArr2, int i2, int i3, int i4) {
        h.g.b.x.f(dArr, "<this>");
        h.g.b.x.f(dArr2, "destination");
        System.arraycopy(dArr, i3, dArr2, i2, i4 - i3);
    }

    public static void aq(float[] fArr, float[] fArr2, int i2, int i3, int i4) {
        h.g.b.x.f(fArr, "<this>");
        h.g.b.x.f(fArr2, "destination");
        System.arraycopy(fArr, i3, fArr2, i2, i4 - i3);
    }

    public static void ar(int[] iArr, int[] iArr2, int i2, int i3, int i4) {
        h.g.b.x.f(iArr, "<this>");
        h.g.b.x.f(iArr2, "destination");
        System.arraycopy(iArr, i3, iArr2, i2, i4 - i3);
    }

    public static void as(long[] jArr, long[] jArr2, int i2, int i3, int i4) {
        h.g.b.x.f(jArr, "<this>");
        h.g.b.x.f(jArr2, "destination");
        System.arraycopy(jArr, i3, jArr2, i2, i4 - i3);
    }

    public static void at(Object[] objArr, Object[] objArr2, int i2, int i3, int i4) {
        h.g.b.x.f(objArr, "<this>");
        h.g.b.x.f(objArr2, "destination");
        System.arraycopy(objArr, i3, objArr2, i2, i4 - i3);
    }

    public static /* synthetic */ void av(long[] jArr, long[] jArr2, int i2) {
        as(jArr, jArr2, i2, 0, jArr.length);
    }

    public static void aw(long[] jArr, long j2, int i2) {
        h.g.b.x.f(jArr, "<this>");
        Arrays.fill(jArr, 0, i2, j2);
    }

    public static /* synthetic */ void ax(float[] fArr, float f2) {
        int length = fArr.length;
        h.g.b.x.f(fArr, "<this>");
        Arrays.fill(fArr, 0, length, f2);
    }

    public static /* synthetic */ void ay(int[] iArr, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        h.g.b.x.f(iArr, "<this>");
        Arrays.fill(iArr, 0, i3, i2);
    }

    public static final void b(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
    }

    public static final void c(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
        }
        if (i2 <= i3) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i2 + " > toIndex: " + i3);
    }

    public static final int d(int i2, int i3) {
        int i4 = i2 + (i2 >> 1);
        if (i4 - i3 < 0) {
            i4 = i3;
        }
        return (-2147483639) + i4 > 0 ? i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i4;
    }

    public static final void e(int i2, int i3) {
        if (i2 <= i3) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + i3 + ").");
    }

    public static String f(Object[] objArr) {
        StringBuilder sb = new StringBuilder((h.k.n.i(objArr.length, 429496729) * 5) + 2);
        aU(objArr, sb, new ArrayList());
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [long[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v6, types: [short[]] */
    public static boolean g(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr != null && objArr2 != null) {
            int length = objArr2.length;
            int length2 = objArr.length;
            if (length2 == length) {
                for (int i2 = 0; i2 < length2; i2++) {
                    Object obj = objArr[i2];
                    Object obj2 = objArr2[i2];
                    if (obj != obj2) {
                        if (obj == null || obj2 == null) {
                            return false;
                        }
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!g((Object[]) obj, (Object[]) obj2)) {
                                return false;
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                                return false;
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                                return false;
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                                return false;
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                                return false;
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                                return false;
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                                return false;
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                                return false;
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                                return false;
                            }
                        } else if ((obj instanceof h.r) && (obj2 instanceof h.r)) {
                            byte[] bArrB = ((h.r) obj).b();
                            byte[] bArrB2 = ((h.r) obj2).b();
                            if (bArrB == null) {
                                bArrB = null;
                            }
                            if (!Arrays.equals(bArrB, bArrB2 != null ? bArrB2 : null)) {
                                return false;
                            }
                        } else if ((obj instanceof h.z) && (obj2 instanceof h.z)) {
                            short[] sArrB = ((h.z) obj).b();
                            ?? B = ((h.z) obj2).b();
                            if (sArrB == null) {
                                sArrB = null;
                            }
                            if (!Arrays.equals(sArrB, (short[]) (B != 0 ? B : null))) {
                                return false;
                            }
                        } else if ((obj instanceof h.u) && (obj2 instanceof h.u)) {
                            int[] iArrB = ((h.u) obj).b();
                            ?? B2 = ((h.u) obj2).b();
                            if (iArrB == null) {
                                iArrB = null;
                            }
                            if (!Arrays.equals(iArrB, (int[]) (B2 != 0 ? B2 : null))) {
                                return false;
                            }
                        } else if ((obj instanceof h.w) && (obj2 instanceof h.w)) {
                            long[] jArrB = ((h.w) obj).b();
                            ?? B3 = ((h.w) obj2).b();
                            if (jArrB == null) {
                                jArrB = null;
                            }
                            if (!Arrays.equals(jArrB, (long[]) (B3 != 0 ? B3 : null))) {
                                return false;
                            }
                        } else if (!h.g.b.x.n(obj, obj2)) {
                            return false;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static List h(int[] iArr) {
        h.g.b.x.f(iArr, "<this>");
        return new v(iArr);
    }

    public static List i(Object[] objArr) {
        h.g.b.x.f(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        h.g.b.x.e(listAsList, "asList(...)");
        return listAsList;
    }

    public static void j(Object[] objArr, Object obj, int i2, int i3) {
        h.g.b.x.f(objArr, "<this>");
        Arrays.fill(objArr, i2, i3, obj);
    }

    public static void k(Object[] objArr, Comparator comparator) {
        h.g.b.x.f(objArr, "<this>");
        h.g.b.x.f(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static byte[] l(byte[] bArr, int i2, int i3) {
        h.g.b.x.f(bArr, "<this>");
        e(i3, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i2, i3);
        h.g.b.x.e(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static byte[] m(byte[] bArr, byte[] bArr2) {
        h.g.b.x.f(bArr, "<this>");
        h.g.b.x.f(bArr2, "elements");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        h.g.b.x.c(bArrCopyOf);
        return bArrCopyOf;
    }

    public static float[] n(float[] fArr, int i2, int i3) {
        h.g.b.x.f(fArr, "<this>");
        e(i3, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i2, i3);
        h.g.b.x.e(fArrCopyOfRange, "copyOfRange(...)");
        return fArrCopyOfRange;
    }

    public static int[] o(int[] iArr, int[] iArr2) {
        h.g.b.x.f(iArr, "<this>");
        h.g.b.x.f(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
        h.g.b.x.c(iArrCopyOf);
        return iArrCopyOf;
    }

    public static Boolean[] p(boolean[] zArr) {
        h.g.b.x.f(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i2 = 0; i2 < zArr.length; i2++) {
            boolArr[i2] = Boolean.valueOf(zArr[i2]);
        }
        return boolArr;
    }

    public static Double[] q(double[] dArr) {
        h.g.b.x.f(dArr, "<this>");
        Double[] dArr2 = new Double[dArr.length];
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr2[i2] = Double.valueOf(dArr[i2]);
        }
        return dArr2;
    }

    public static Float[] r(float[] fArr) {
        h.g.b.x.f(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr2[i2] = Float.valueOf(fArr[i2]);
        }
        return fArr2;
    }

    public static Integer[] s(int[] iArr) {
        h.g.b.x.f(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i2] = Integer.valueOf(iArr[i2]);
        }
        return numArr;
    }

    public static Long[] t(long[] jArr) {
        h.g.b.x.f(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i2] = Long.valueOf(jArr[i2]);
        }
        return lArr;
    }

    public static Object[] u(Object[] objArr, int i2, int i3) {
        h.g.b.x.f(objArr, "<this>");
        e(i3, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i2, i3);
        h.g.b.x.e(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static Object[] v(Object[] objArr, Object obj) {
        h.g.b.x.f(objArr, "<this>");
        int length = objArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + 1);
        objArrCopyOf[length] = obj;
        h.g.b.x.c(objArrCopyOf);
        return objArrCopyOf;
    }

    public static Object[] w(Object[] objArr, Object[] objArr2) {
        h.g.b.x.f(objArr, "<this>");
        h.g.b.x.f(objArr2, "elements");
        int length = objArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + 1);
        System.arraycopy(objArr2, 0, objArrCopyOf, length, 1);
        h.g.b.x.c(objArrCopyOf);
        return objArrCopyOf;
    }

    public static int x(float[] fArr) {
        h.g.b.x.f(fArr, "<this>");
        return fArr.length - 1;
    }

    public static int y(int[] iArr) {
        h.g.b.x.f(iArr, "<this>");
        return iArr.length - 1;
    }

    public static int z(long[] jArr) {
        h.g.b.x.f(jArr, "<this>");
        return jArr.length - 1;
    }
}
