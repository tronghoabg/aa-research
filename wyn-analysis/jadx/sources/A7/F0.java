package A7;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class F0 {

    /* renamed from: c, reason: collision with root package name */
    public static final F0 f490c = new F0(100);

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap f491a;

    /* renamed from: b, reason: collision with root package name */
    public final int f492b;

    public F0(EnumMap enumMap, int i5) {
        EnumMap enumMap2 = new EnumMap(E0.class);
        this.f491a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f492b = i5;
    }

    public static char a(H0 h02) {
        if (h02 == null) {
            return '-';
        }
        int iOrdinal = h02.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static F0 b(int i5, Bundle bundle) {
        if (bundle == null) {
            return new F0(i5);
        }
        EnumMap enumMap = new EnumMap(E0.class);
        for (E0 e02 : G0.STORAGE.f499a) {
            enumMap.put((EnumMap) e02, (E0) f(bundle.getString(e02.f486a)));
        }
        return new F0(enumMap, i5);
    }

    public static F0 c(int i5, String str) {
        EnumMap enumMap = new EnumMap(E0.class);
        if (str == null) {
            str = "";
        }
        G0 g02 = G0.STORAGE;
        int i10 = 0;
        while (true) {
            E0[] e0Arr = g02.f499a;
            if (i10 >= e0Arr.length) {
                return new F0(enumMap, i5);
            }
            E0 e02 = e0Arr[i10];
            int i11 = i10 + 2;
            if (i11 < str.length()) {
                enumMap.put((EnumMap) e02, (E0) e(str.charAt(i11)));
            } else {
                enumMap.put((EnumMap) e02, (E0) H0.UNINITIALIZED);
            }
            i10++;
        }
    }

    public static H0 e(char c10) {
        return c10 != '+' ? c10 != '0' ? c10 != '1' ? H0.UNINITIALIZED : H0.GRANTED : H0.DENIED : H0.POLICY;
    }

    public static H0 f(String str) {
        H0 h02 = H0.UNINITIALIZED;
        return str == null ? h02 : str.equals("granted") ? H0.GRANTED : str.equals("denied") ? H0.DENIED : h02;
    }

    public static String g(int i5) {
        return i5 != -30 ? i5 != -20 ? i5 != -10 ? i5 != 0 ? i5 != 30 ? i5 != 90 ? i5 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static boolean h(int i5, int i10) {
        if (i5 == -20 && i10 == -30) {
            return true;
        }
        return (i5 == -30 && i10 == -20) || i5 == i10 || i5 < i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final A7.F0 d(A7.F0 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<A7.E0> r1 = A7.E0.class
            r0.<init>(r1)
            A7.G0 r1 = A7.G0.STORAGE
            A7.E0[] r1 = r1.f499a
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L4b
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f491a
            java.lang.Object r5 = r5.get(r4)
            A7.H0 r5 = (A7.H0) r5
            java.util.EnumMap r6 = r9.f491a
            java.lang.Object r6 = r6.get(r4)
            A7.H0 r6 = (A7.H0) r6
            if (r5 != 0) goto L24
            goto L33
        L24:
            if (r6 != 0) goto L27
            goto L43
        L27:
            A7.H0 r7 = A7.H0.UNINITIALIZED
            if (r5 != r7) goto L2c
            goto L33
        L2c:
            if (r6 != r7) goto L2f
            goto L43
        L2f:
            A7.H0 r7 = A7.H0.POLICY
            if (r5 != r7) goto L35
        L33:
            r5 = r6
            goto L43
        L35:
            if (r6 != r7) goto L38
            goto L43
        L38:
            A7.H0 r7 = A7.H0.DENIED
            if (r5 == r7) goto L42
            if (r6 != r7) goto L3f
            goto L42
        L3f:
            A7.H0 r5 = A7.H0.GRANTED
            goto L43
        L42:
            r5 = r7
        L43:
            if (r5 == 0) goto L48
            r0.put(r4, r5)
        L48:
            int r3 = r3 + 1
            goto Ld
        L4b:
            A7.F0 r9 = new A7.F0
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.F0.d(A7.F0):A7.F0");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        for (E0 e02 : G0.STORAGE.f499a) {
            if (this.f491a.get(e02) != f02.f491a.get(e02)) {
                return false;
            }
        }
        return this.f492b == f02.f492b;
    }

    public final int hashCode() {
        int iHashCode = this.f492b * 17;
        Iterator it = this.f491a.values().iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((H0) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final boolean i(E0 e02) {
        return ((H0) this.f491a.get(e02)) != H0.DENIED;
    }

    public final F0 j(F0 f02) {
        EnumMap enumMap = new EnumMap(E0.class);
        for (E0 e02 : G0.STORAGE.f499a) {
            H0 h02 = (H0) this.f491a.get(e02);
            if (h02 == H0.UNINITIALIZED) {
                h02 = (H0) f02.f491a.get(e02);
            }
            if (h02 != null) {
                enumMap.put((EnumMap) e02, (E0) h02);
            }
        }
        return new F0(enumMap, this.f492b);
    }

    public final boolean k(F0 f02, E0... e0Arr) {
        for (E0 e02 : e0Arr) {
            H0 h02 = (H0) this.f491a.get(e02);
            H0 h03 = (H0) f02.f491a.get(e02);
            H0 h04 = H0.DENIED;
            if (h02 == h04 && h03 != h04) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String l() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "G1"
            r0.<init>(r1)
            A7.G0 r1 = A7.G0.STORAGE
            A7.E0[] r1 = r1.f499a
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L38
            r4 = r1[r3]
            java.util.EnumMap r5 = r7.f491a
            java.lang.Object r4 = r5.get(r4)
            A7.H0 r4 = (A7.H0) r4
            r5 = 45
            if (r4 == 0) goto L32
            int r4 = r4.ordinal()
            if (r4 == 0) goto L32
            r6 = 1
            if (r4 == r6) goto L30
            r6 = 2
            if (r4 == r6) goto L2d
            r6 = 3
            if (r4 == r6) goto L30
            goto L32
        L2d:
            r5 = 48
            goto L32
        L30:
            r5 = 49
        L32:
            r0.append(r5)
            int r3 = r3 + 1
            goto Ld
        L38:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.F0.l():java.lang.String");
    }

    public final String m() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (E0 e02 : G0.STORAGE.f499a) {
            sb2.append(a((H0) this.f491a.get(e02)));
        }
        return sb2.toString();
    }

    public final boolean n() {
        return i(E0.ANALYTICS_STORAGE);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(g(this.f492b));
        for (E0 e02 : G0.STORAGE.f499a) {
            sb2.append(",");
            sb2.append(e02.f486a);
            sb2.append("=");
            H0 h02 = (H0) this.f491a.get(e02);
            if (h02 == null) {
                h02 = H0.UNINITIALIZED;
            }
            sb2.append(h02);
        }
        return sb2.toString();
    }

    public F0(int i5) {
        EnumMap enumMap = new EnumMap(E0.class);
        this.f491a = enumMap;
        E0 e02 = E0.AD_STORAGE;
        H0 h02 = H0.UNINITIALIZED;
        enumMap.put((EnumMap) e02, (E0) h02);
        enumMap.put((EnumMap) E0.ANALYTICS_STORAGE, (E0) h02);
        this.f492b = i5;
    }
}
