package Va;

import A7.C0237b0;
import android.content.Context;
import android.os.Process;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class B7 {

    /* renamed from: h, reason: collision with root package name */
    public static int f13228h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static int f13229i = 1;

    /* renamed from: a, reason: collision with root package name */
    public C0919b8 f13230a;

    /* renamed from: b, reason: collision with root package name */
    public C0963f0 f13231b;

    /* renamed from: c, reason: collision with root package name */
    public Z7 f13232c;

    /* renamed from: d, reason: collision with root package name */
    public Z0 f13233d;

    /* renamed from: e, reason: collision with root package name */
    public Context f13234e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f13235f;

    /* renamed from: g, reason: collision with root package name */
    public Xa f13236g;

    public static String k(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC0897a.f13937u) {
            try {
                AbstractC0897a.f13936t = i5;
                char[] cArr = new char[charArray.length];
                AbstractC0897a.f13935s = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13935s;
                    if (i10 < charArray.length) {
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ 2261539803667671093L);
                        AbstractC0897a.f13935s = i10 + 1;
                    } else {
                        str2 = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public final C0963f0 a() {
        int i5 = f13229i + 51;
        int i10 = i5 % 128;
        f13228h = i10;
        if (i5 % 2 != 0) {
            throw null;
        }
        int i11 = i10 + 57;
        f13229i = i11 % 128;
        int i12 = i11 % 2;
        C0963f0 c0963f0 = this.f13231b;
        if (i12 == 0) {
            int i13 = 52 / 0;
        }
        return c0963f0;
    }

    public final synchronized boolean b() {
        boolean zQ0;
        f13229i = (f13228h + 115) % 128;
        zQ0 = this.f13233d.q0();
        f13228h = (f13229i + 53) % 128;
        return zQ0;
    }

    public final synchronized ArrayList c() {
        int i5 = f13228h + 119;
        f13229i = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (this.f13235f != null) {
            return new ArrayList(this.f13235f);
        }
        ArrayList arrayList = new ArrayList();
        f13229i = (f13228h + 55) % 128;
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[PHI: r0
  0x0026: PHI (r0v4 java.lang.String) = (r0v3 java.lang.String), (r0v8 java.lang.String) binds: [B:8:0x0024, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String d() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.B7.d():java.lang.String");
    }

    public final String e() {
        f13229i = (f13228h + 85) % 128;
        C0919b8 c0919b8 = this.f13230a;
        c0919b8.getClass();
        int i5 = (C0919b8.f14023m + 93) % 128;
        C0919b8.f14024n = i5;
        int i10 = i5 + 9;
        C0919b8.f14023m = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        int i11 = f13229i + 99;
        f13228h = i11 % 128;
        if (i11 % 2 == 0) {
            return c0919b8.f14031g;
        }
        throw null;
    }

    public final String f() {
        f13229i = (f13228h + 25) % 128;
        C0919b8 c0919b8 = this.f13230a;
        c0919b8.getClass();
        int i5 = C0919b8.f14023m + 91;
        int i10 = i5 % 128;
        C0919b8.f14024n = i10;
        if (i5 % 2 == 0) {
            int i11 = 17 / 0;
        }
        C0919b8.f14023m = (i10 + 33) % 128;
        int i12 = f13229i + 103;
        f13228h = i12 % 128;
        if (i12 % 2 == 0) {
            return c0919b8.f14030f;
        }
        throw null;
    }

    public final String g() {
        f13228h = (f13229i + 89) % 128;
        String strU0 = this.f13233d.u0();
        f13229i = (f13228h + 67) % 128;
        return strU0;
    }

    public final String h() {
        f13229i = (f13228h + 37) % 128;
        String strX0 = this.f13233d.x0();
        f13229i = (f13228h + 35) % 128;
        return strX0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x049f A[PHI: r12 r13 r18
  0x049f: PHI (r12v13 java.lang.String) = (r12v12 java.lang.String), (r12v17 java.lang.String) binds: [B:145:0x04c4, B:138:0x049d] A[DONT_GENERATE, DONT_INLINE]
  0x049f: PHI (r13v13 Va.p7) = (r13v11 Va.p7), (r13v17 Va.p7) binds: [B:145:0x04c4, B:138:0x049d] A[DONT_GENERATE, DONT_INLINE]
  0x049f: PHI (r18v14 Va.p7) = (r18v12 Va.p7), (r18v15 Va.p7) binds: [B:145:0x04c4, B:138:0x049d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04a4 A[PHI: r13 r18
  0x04a4: PHI (r13v12 Va.p7) = (r13v11 Va.p7), (r13v17 Va.p7) binds: [B:145:0x04c4, B:138:0x049d] A[DONT_GENERATE, DONT_INLINE]
  0x04a4: PHI (r18v13 Va.p7) = (r18v12 Va.p7), (r18v15 Va.p7) binds: [B:145:0x04c4, B:138:0x049d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x06a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02d0 A[PHI: r21
  0x02d0: PHI (r21v4 char) = (r21v2 char), (r21v5 char) binds: [B:84:0x0328, B:76:0x02ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x035a A[PHI: r21
  0x035a: PHI (r21v17 char) = (r21v1 char), (r21v2 char), (r21v3 char), (r21v5 char), (r21v6 char), (r21v18 char) binds: [B:88:0x0345, B:82:0x031d, B:79:0x02f5, B:76:0x02ce, B:70:0x0296, B:68:0x027a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r0
  0x0023: PHI (r0v5 Va.Xa) = (r0v4 Va.Xa), (r0v57 Va.Xa) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 1858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.B7.i():void");
    }

    public final String j() {
        f13228h = (f13229i + 47) % 128;
        C0919b8 c0919b8 = this.f13230a;
        c0919b8.getClass();
        int i5 = C0919b8.f14023m + 53;
        C0919b8.f14024n = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 4 / 0;
        }
        f13228h = (f13229i + 39) % 128;
        return c0919b8.f14027c;
    }

    public final synchronized void l(Xa xa2) {
        int i5 = f13228h;
        this.f13236g = xa2;
        f13229i = (i5 + 23) % 128;
    }

    public final C0999ha m(C0984g8 c0984g8) {
        int i5 = f13228h + 27;
        f13229i = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (c0984g8 == null) {
            return null;
        }
        HashMap mapC = this.f13230a.c();
        int i10 = C0984g8.f14188i + 71;
        int i11 = i10 % 128;
        C0984g8.f14189j = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        C0984g8.f14188i = (i11 + 23) % 128;
        C0999ha c0999haM = m((C0984g8) mapC.get(c0984g8.f14191b));
        C0999ha c0999ha = new C0999ha();
        c0999ha.f14263a = c0984g8;
        c0999ha.f14264b = c0999haM;
        int i12 = f13229i + 9;
        f13228h = i12 % 128;
        if (i12 % 2 == 0) {
            return c0999ha;
        }
        throw null;
    }

    public final String n() {
        int i5 = f13229i + 37;
        f13228h = i5 % 128;
        int i10 = i5 % 2;
        C0919b8 c0919b8 = this.f13230a;
        if (i10 == 0) {
            return c0919b8.e();
        }
        c0919b8.e();
        throw null;
    }

    public final String o() {
        f13229i = (f13228h + 69) % 128;
        C0919b8 c0919b8 = this.f13230a;
        c0919b8.getClass();
        int i5 = C0919b8.f14024n + 15;
        int i10 = i5 % 128;
        C0919b8.f14023m = i10;
        if (i5 % 2 != 0) {
            throw null;
        }
        int i11 = i10 + 25;
        C0919b8.f14024n = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        f13229i = (f13228h + 87) % 128;
        return c0919b8.f14028d;
    }

    public final void p(String str, List list) {
        f13228h = (f13229i + 69) % 128;
        Iterator it = c().iterator();
        while (it.hasNext()) {
            C1214y7 c1214y7 = (C1214y7) it.next();
            c1214y7.getClass();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C1214y7.A("\ufff1\r\r\u000b\n\uffff￠\u0010\r\uffff\u0002\u0001\uffff\u0011\u0012ￌ", 16 - KeyEvent.normalizeMetaState(0), (Process.myPid() >> 22) + Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, (ViewConfiguration.getPressedStateDuration() >> 16) + 16, false).intern());
            sb2.append(str);
            c1214y7.t(sb2.toString(), list);
            int i5 = C1214y7.f14802l + 71;
            C1214y7.f14803m = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }
        int i10 = f13228h + 65;
        f13229i = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public final void q() {
        int i5 = f13228h + 79;
        f13229i = i5 % 128;
        int i10 = i5 % 2;
        ArrayList arrayList = this.f13235f;
        if (i10 == 0) {
            arrayList.iterator();
            throw null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f13228h = (f13229i + 107) % 128;
            C1214y7 c1214y7 = (C1214y7) it.next();
            c1214y7.getClass();
            int i11 = (C1214y7.f14802l + 113) % 128;
            C1214y7.f14803m = i11;
            C1214y7.f14802l = (i11 + 105) % 128;
            C0921ba c0921ba = c1214y7.f14813j;
            c0921ba.getClass();
            Nb nb2 = new Nb(1);
            nb2.f13555d = c0921ba;
            Cb.g(nb2);
            int i12 = C0921ba.f14042i + 111;
            C0921ba.f14041h = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 51 / 0;
            }
            int i14 = (C1214y7.f14802l + 95) % 128;
            C1214y7.f14803m = i14;
            int i15 = i14 + 83;
            C1214y7.f14802l = i15 % 128;
            int i16 = i15 % 2;
            c0921ba.s();
            if (i16 != 0) {
                throw null;
            }
            int i17 = C1214y7.f14802l + 7;
            C1214y7.f14803m = i17 % 128;
            int i18 = i17 % 2;
            c0921ba.j();
            if (i18 == 0) {
                throw null;
            }
            int i19 = C1214y7.f14803m + 21;
            C1214y7.f14802l = i19 % 128;
            if (i19 % 2 != 0) {
                int i20 = 63 / 0;
            }
            if (c1214y7.f14809f != null) {
                C0974fb.e().k(c1214y7.f14809f);
                c1214y7.f14809f = null;
                C1214y7.f14803m = (C1214y7.f14802l + 41) % 128;
            }
            C0237b0 c0237b0 = c1214y7.f14810g;
            if (c0237b0 != null) {
                int i21 = C1214y7.f14802l + 37;
                C1214y7.f14803m = i21 % 128;
                if (i21 % 2 == 0) {
                    c0237b0.x();
                    c1214y7.f14810g = null;
                    int i22 = 43 / 0;
                } else {
                    c0237b0.x();
                    c1214y7.f14810g = null;
                }
            }
            c1214y7.f14808e = null;
            f13228h = (f13229i + 17) % 128;
        }
        S s10 = new S(1);
        s10.f13671d = this;
        Cb.g(s10);
    }
}
