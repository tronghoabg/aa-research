package X1;

import E4.n;
import N1.C;
import N1.C0764m;
import N1.C0765n;
import N1.O;
import Q1.x;
import S1.A;
import U1.a0;
import Va.M6;
import a9.C1342b;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k2.C3157n;
import k2.F;
import k2.InterfaceC3143E;
import k2.e0;
import k2.f0;
import k2.n0;
import ka.AbstractC3256n;
import l2.C3383h;
import l8.AbstractC3409K;
import l8.AbstractC3437s;
import l8.C3407I;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
import wa.C4398a;

/* loaded from: classes.dex */
public final class b implements F, e0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f15918a;

    /* renamed from: b, reason: collision with root package name */
    public final n f15919b;

    /* renamed from: c, reason: collision with root package name */
    public final A f15920c;

    /* renamed from: d, reason: collision with root package name */
    public final Z1.g f15921d;

    /* renamed from: e, reason: collision with root package name */
    public final ae.d f15922e;

    /* renamed from: f, reason: collision with root package name */
    public final S3.n f15923f;

    /* renamed from: g, reason: collision with root package name */
    public final long f15924g;

    /* renamed from: h, reason: collision with root package name */
    public final o2.n f15925h;

    /* renamed from: i, reason: collision with root package name */
    public final o2.e f15926i;

    /* renamed from: j, reason: collision with root package name */
    public final n0 f15927j;
    public final a[] k;

    /* renamed from: l, reason: collision with root package name */
    public final C1342b f15928l;

    /* renamed from: m, reason: collision with root package name */
    public final m f15929m;

    /* renamed from: o, reason: collision with root package name */
    public final Z1.d f15931o;

    /* renamed from: p, reason: collision with root package name */
    public final Z1.d f15932p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC3143E f15933q;

    /* renamed from: t, reason: collision with root package name */
    public C3157n f15936t;

    /* renamed from: u, reason: collision with root package name */
    public Y1.c f15937u;

    /* renamed from: v, reason: collision with root package name */
    public int f15938v;

    /* renamed from: w, reason: collision with root package name */
    public List f15939w;

    /* renamed from: y, reason: collision with root package name */
    public long f15941y;

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f15917z = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: A, reason: collision with root package name */
    public static final Pattern f15916A = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: x, reason: collision with root package name */
    public boolean f15940x = true;

    /* renamed from: r, reason: collision with root package name */
    public C3383h[] f15934r = new C3383h[0];

    /* renamed from: s, reason: collision with root package name */
    public j[] f15935s = new j[0];

    /* renamed from: n, reason: collision with root package name */
    public final IdentityHashMap f15930n = new IdentityHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public b(int i5, Y1.c cVar, S3.n nVar, int i10, n nVar2, A a5, Z1.g gVar, Z1.d dVar, ae.d dVar2, Z1.d dVar3, long j8, o2.n nVar3, o2.e eVar, C1342b c1342b, Y9.c cVar2, V1.k kVar) throws NumberFormatException {
        int i11;
        int i12;
        int[][] iArr;
        boolean[] zArr;
        C0765n[] c0765nArrS;
        Y1.f fVarG;
        Integer num;
        Z1.g gVar2 = gVar;
        int i13 = 0;
        this.f15918a = i5;
        this.f15937u = cVar;
        this.f15923f = nVar;
        this.f15938v = i10;
        this.f15919b = nVar2;
        this.f15920c = a5;
        this.f15921d = gVar2;
        this.f15932p = dVar;
        this.f15922e = dVar2;
        this.f15931o = dVar3;
        this.f15924g = j8;
        this.f15925h = nVar3;
        this.f15926i = eVar;
        this.f15928l = c1342b;
        boolean z2 = true;
        this.f15929m = new m(cVar, cVar2, eVar);
        c1342b.getClass();
        C3407I c3407i = AbstractC3409K.f40056b;
        l8.e0 e0Var = l8.e0.f40101e;
        this.f15936t = new C3157n(e0Var, e0Var);
        Y1.h hVarB = cVar.b(i10);
        List list = hVarB.f16345d;
        this.f15939w = list;
        List list2 = hVarB.f16344c;
        int size = list2.size();
        HashMap map = new HashMap(AbstractC3437s.a(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i14 = 0; i14 < size; i14++) {
            map.put(Long.valueOf(((Y1.a) list2.get(i14)).f16300a), Integer.valueOf(i14));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i14));
            arrayList.add(arrayList2);
            sparseArray.put(i14, arrayList2);
        }
        int i15 = 0;
        while (i15 < size) {
            Y1.a aVar = (Y1.a) list2.get(i15);
            Y1.f fVarG2 = g("http://dashif.org/guidelines/trickmode", aVar.f16304e);
            List list3 = aVar.f16305f;
            fVarG2 = fVarG2 == null ? g("http://dashif.org/guidelines/trickmode", list3) : fVarG2;
            int iIntValue = (fVarG2 == null || (num = (Integer) map.get(Long.valueOf(Long.parseLong(fVarG2.f16336b)))) == null) ? i15 : num.intValue();
            if (iIntValue == i15 && (fVarG = g("urn:mpeg:dash:adaptation-set-switching:2016", list3)) != null) {
                int i16 = x.f9724a;
                String[] strArrSplit = fVarG.f16336b.split(",", -1);
                int length = strArrSplit.length;
                int i17 = 0;
                while (i17 < length) {
                    boolean z10 = z2;
                    Integer num2 = (Integer) map.get(Long.valueOf(Long.parseLong(strArrSplit[i17])));
                    if (num2 != null) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                    i17++;
                    z2 = z10;
                }
            }
            boolean z11 = z2;
            if (iIntValue != i15) {
                List list4 = (List) sparseArray.get(i15);
                List list5 = (List) sparseArray.get(iIntValue);
                list5.addAll(list4);
                sparseArray.put(i15, list5);
                arrayList.remove(list4);
            }
            i15++;
            z2 = z11;
        }
        boolean z12 = z2;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i18 = 0; i18 < size2; i18++) {
            int[] iArrK = S3.f.K((Collection) arrayList.get(i18));
            iArr2[i18] = iArrK;
            Arrays.sort(iArrK);
        }
        boolean[] zArr2 = new boolean[size2];
        C0765n[][] c0765nArr = new C0765n[size2][];
        int i19 = 0;
        int i20 = 0;
        while (i19 < size2) {
            int[] iArr3 = iArr2[i19];
            int length2 = iArr3.length;
            int i21 = i13;
            while (true) {
                if (i21 >= length2) {
                    iArr = iArr2;
                    break;
                }
                List list6 = ((Y1.a) list2.get(iArr3[i21])).f16302c;
                iArr = iArr2;
                while (i13 < list6.size()) {
                    if (!((Y1.m) list6.get(i13)).f16361d.isEmpty()) {
                        zArr2[i19] = z12;
                        i20++;
                        break;
                    }
                    i13++;
                }
                i21++;
                iArr2 = iArr;
                i13 = 0;
            }
            int[] iArr4 = iArr[i19];
            int length3 = iArr4.length;
            int i22 = 0;
            while (true) {
                if (i22 >= length3) {
                    zArr = zArr2;
                    c0765nArrS = new C0765n[0];
                    break;
                }
                int i23 = iArr4[i22];
                Y1.a aVar2 = (Y1.a) list2.get(i23);
                List list7 = ((Y1.a) list2.get(i23)).f16303d;
                int[] iArr5 = iArr4;
                int i24 = 0;
                while (i24 < list7.size()) {
                    Y1.f fVar = (Y1.f) list7.get(i24);
                    int i25 = length3;
                    zArr = zArr2;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(fVar.f16335a)) {
                        C0764m c0764m = new C0764m();
                        c0764m.f8194m = C.m("application/cea-608");
                        c0764m.f8183a = M6.s(new StringBuilder(), aVar2.f16300a, ":cea608");
                        c0765nArrS = s(fVar, f15917z, new C0765n(c0764m));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(fVar.f16335a)) {
                        C0764m c0764m2 = new C0764m();
                        c0764m2.f8194m = C.m("application/cea-708");
                        c0764m2.f8183a = M6.s(new StringBuilder(), aVar2.f16300a, ":cea708");
                        c0765nArrS = s(fVar, f15916A, new C0765n(c0764m2));
                        break;
                    }
                    i24++;
                    zArr2 = zArr;
                    length3 = i25;
                }
                i22++;
                iArr4 = iArr5;
            }
            c0765nArr[i19] = c0765nArrS;
            if (c0765nArrS.length != 0) {
                i20++;
            }
            i19++;
            zArr2 = zArr;
            iArr2 = iArr;
            i13 = 0;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        int size3 = list.size() + i20 + size2;
        O[] oArr = new O[size3];
        a[] aVarArr = new a[size3];
        int i26 = 0;
        int i27 = 0;
        while (i27 < size2) {
            int[] iArr7 = iArr6[i27];
            ArrayList arrayList3 = new ArrayList();
            int length4 = iArr7.length;
            int i28 = 0;
            while (i28 < length4) {
                arrayList3.addAll(((Y1.a) list2.get(iArr7[i28])).f16302c);
                i28++;
                size2 = size2;
            }
            int i29 = size2;
            int size4 = arrayList3.size();
            C0765n[] c0765nArr2 = new C0765n[size4];
            int i30 = 0;
            while (i30 < size4) {
                int i31 = size4;
                C0765n c0765n = ((Y1.m) arrayList3.get(i30)).f16358a;
                int i32 = i26;
                C0764m c0764mA = c0765n.a();
                c0764mA.f8182K = gVar2.l(c0765n);
                c0765nArr2[i30] = new C0765n(c0764mA);
                i30++;
                size4 = i31;
                i26 = i32;
            }
            int i33 = i26;
            Y1.a aVar3 = (Y1.a) list2.get(iArr7[0]);
            C0765n[][] c0765nArr3 = c0765nArr;
            long j10 = aVar3.f16300a;
            String string = j10 != -1 ? Long.toString(j10) : AbstractC3256n.g(i27, "unset:");
            int i34 = i33 + 1;
            if (zArr3[i27]) {
                i11 = i33 + 2;
            } else {
                i11 = i34;
                i34 = -1;
            }
            List list8 = list2;
            if (c0765nArr3[i27].length != 0) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
                i11 = -1;
            }
            p(nVar2, c0765nArr2);
            int i35 = i12;
            oArr[i33] = new O(string, c0765nArr2);
            C3407I c3407i2 = AbstractC3409K.f40056b;
            l8.e0 e0Var2 = l8.e0.f40101e;
            a aVar4 = new a(aVar3.f16301b, 0, iArr7, i33, i34, i11, -1, e0Var2);
            int[] iArr8 = iArr7;
            int i36 = i33;
            aVarArr[i36] = aVar4;
            int i37 = -1;
            if (i34 != -1) {
                String strF = N0.a.f(string, ":emsg");
                C0764m c0764m3 = new C0764m();
                c0764m3.f8183a = strF;
                c0764m3.f8194m = C.m("application/x-emsg");
                C0765n[] c0765nArr4 = new C0765n[z12];
                c0765nArr4[0] = new C0765n(c0764m3);
                oArr[i34] = new O(strF, c0765nArr4);
                a aVar5 = new a(5, 1, iArr8, i36, -1, -1, -1, e0Var2);
                iArr8 = iArr8;
                i36 = i36;
                aVarArr[i34] = aVar5;
                i37 = -1;
            }
            if (i11 != i37) {
                String strF2 = N0.a.f(string, ":cc");
                aVarArr[i11] = new a(3, 1, iArr8, i36, -1, -1, -1, AbstractC3409K.k(c0765nArr3[i27]));
                p(nVar2, c0765nArr3[i27]);
                oArr[i11] = new O(strF2, c0765nArr3[i27]);
            }
            i27++;
            size2 = i29;
            i26 = i35;
            z12 = true;
            c0765nArr = c0765nArr3;
            list2 = list8;
            gVar2 = gVar;
        }
        int i38 = 0;
        while (i38 < list.size()) {
            Y1.g gVar3 = (Y1.g) list.get(i38);
            C0764m c0764m4 = new C0764m();
            c0764m4.f8183a = gVar3.a();
            c0764m4.f8194m = C.m("application/x-emsg");
            oArr[i26] = new O(gVar3.a() + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + i38, new C0765n(c0764m4));
            C3407I c3407i3 = AbstractC3409K.f40056b;
            aVarArr[i26] = new a(5, 2, new int[0], -1, -1, -1, i38, l8.e0.f40101e);
            i38++;
            i26++;
        }
        Pair pairCreate = Pair.create(new n0(oArr), aVarArr);
        this.f15927j = (n0) pairCreate.first;
        this.k = (a[]) pairCreate.second;
    }

    public static Y1.f g(String str, List list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            Y1.f fVar = (Y1.f) list.get(i5);
            if (str.equals(fVar.f16335a)) {
                return fVar;
            }
        }
        return null;
    }

    public static void p(n nVar, C0765n[] c0765nArr) {
        for (int i5 = 0; i5 < c0765nArr.length; i5++) {
            C0765n c0765n = c0765nArr[i5];
            E4.F f10 = (E4.F) nVar.f2940d;
            if (f10.f2853b && ((C4398a) f10.f2854c).d(c0765n)) {
                C0764m c0764mA = c0765n.a();
                c0764mA.f8194m = C.m("application/x-media3-cues");
                c0764mA.f8179H = ((C4398a) f10.f2854c).g(c0765n);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c0765n.f8232n);
                String str = c0765n.k;
                sb2.append(str != null ? StringUtils.SPACE.concat(str) : "");
                c0764mA.f8192j = sb2.toString();
                c0764mA.f8199r = Long.MAX_VALUE;
                c0765n = new C0765n(c0764mA);
            }
            c0765nArr[i5] = c0765n;
        }
    }

    public static C0765n[] s(Y1.f fVar, Pattern pattern, C0765n c0765n) throws NumberFormatException {
        String str = fVar.f16336b;
        if (str == null) {
            return new C0765n[]{c0765n};
        }
        int i5 = x.f9724a;
        String[] strArrSplit = str.split(";", -1);
        C0765n[] c0765nArr = new C0765n[strArrSplit.length];
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            Matcher matcher = pattern.matcher(strArrSplit[i10]);
            if (!matcher.matches()) {
                return new C0765n[]{c0765n};
            }
            int i11 = Integer.parseInt(matcher.group(1));
            C0764m c0764mA = c0765n.a();
            c0764mA.f8183a = c0765n.f8220a + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + i11;
            c0764mA.f8178G = i11;
            c0764mA.f8186d = matcher.group(2);
            c0765nArr[i10] = new C0765n(c0764mA);
        }
        return c0765nArr;
    }

    @Override // k2.e0
    public final void a(f0 f0Var) {
        this.f15933q.a(this);
    }

    @Override // k2.F
    public final long b(long j8, a0 a0Var) {
        for (C3383h c3383h : this.f15934r) {
            if (c3383h.f39903a == 2) {
                return c3383h.f39907e.b(j8, a0Var);
            }
        }
        return j8;
    }

    @Override // k2.f0
    public final long c() {
        return this.f15936t.c();
    }

    @Override // k2.F
    public final long d(long j8) throws Throwable {
        for (C3383h c3383h : this.f15934r) {
            c3383h.z(j8);
        }
        for (j jVar : this.f15935s) {
            int iA = x.a(jVar.f16004c, j8, true);
            jVar.f16008g = iA;
            jVar.f16009h = (jVar.f16005d && iA == jVar.f16004c.length) ? j8 : -9223372036854775807L;
        }
        return j8;
    }

    @Override // k2.f0
    public final boolean e() {
        return this.f15936t.e();
    }

    @Override // k2.F
    public final long f() {
        C3383h[] c3383hArr = this.f15934r;
        int length = c3383hArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            C3383h c3383h = c3383hArr[i5];
            c3383h.getClass();
            try {
                if (c3383h.f39925x) {
                    return this.f15941y;
                }
            } finally {
                c3383h.f39925x = false;
            }
        }
        return -9223372036854775807L;
    }

    @Override // k2.F
    public final void h() {
        this.f15925h.a();
    }

    @Override // k2.F
    public final void i(long j8) throws Throwable {
        for (C3383h c3383h : this.f15934r) {
            c3383h.i(j8);
        }
    }

    @Override // k2.F
    public final n0 j() {
        return this.f15927j;
    }

    @Override // k2.f0
    public final boolean k(U1.C c10) {
        return this.f15936t.k(c10);
    }

    public final int m(int i5, int[] iArr) {
        int i10 = iArr[i5];
        if (i10 != -1) {
            a[] aVarArr = this.k;
            int i11 = aVarArr[i10].f15912e;
            for (int i12 = 0; i12 < iArr.length; i12++) {
                int i13 = iArr[i12];
                if (i13 == i11 && aVarArr[i13].f15910c == 0) {
                    return i12;
                }
            }
        }
        return -1;
    }

    @Override // k2.f0
    public final long n() {
        return this.f15936t.n();
    }

    @Override // k2.f0
    public final void o(long j8) {
        this.f15936t.o(j8);
    }

    @Override // k2.F
    public final void q(InterfaceC3143E interfaceC3143E, long j8) {
        this.f15933q = interfaceC3143E;
        interfaceC3143E.l(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x024f  */
    @Override // k2.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long r(n2.q[] r36, boolean[] r37, k2.d0[] r38, boolean[] r39, long r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X1.b.r(n2.q[], boolean[], k2.d0[], boolean[], long):long");
    }
}
