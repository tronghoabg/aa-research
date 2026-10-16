package Q0;

import R0.o;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: A0, reason: collision with root package name */
    public int f9581A0;
    public b[] B0;

    /* renamed from: C0, reason: collision with root package name */
    public b[] f9582C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f9583D0;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f9584E0;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f9585F0;

    /* renamed from: G0, reason: collision with root package name */
    public WeakReference f9586G0;

    /* renamed from: H0, reason: collision with root package name */
    public WeakReference f9587H0;

    /* renamed from: I0, reason: collision with root package name */
    public WeakReference f9588I0;

    /* renamed from: J0, reason: collision with root package name */
    public WeakReference f9589J0;

    /* renamed from: K0, reason: collision with root package name */
    public final HashSet f9590K0;

    /* renamed from: L0, reason: collision with root package name */
    public final R0.b f9591L0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f9592q0 = new ArrayList();

    /* renamed from: r0, reason: collision with root package name */
    public final G9.e f9593r0 = new G9.e(this);

    /* renamed from: s0, reason: collision with root package name */
    public final R0.e f9594s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f9595t0;

    /* renamed from: u0, reason: collision with root package name */
    public T0.e f9596u0;
    public boolean v0;

    /* renamed from: w0, reason: collision with root package name */
    public final O0.c f9597w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f9598x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f9599y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f9600z0;

    public e() {
        R0.e eVar = new R0.e(0);
        eVar.f10050b = true;
        eVar.f10051c = true;
        eVar.f10054f = new ArrayList();
        new ArrayList();
        eVar.f10056h = null;
        eVar.f10057i = new R0.b();
        eVar.f10055g = new ArrayList();
        eVar.f10052d = this;
        eVar.f10053e = this;
        this.f9594s0 = eVar;
        this.f9596u0 = null;
        this.v0 = false;
        this.f9597w0 = new O0.c();
        this.f9600z0 = 0;
        this.f9581A0 = 0;
        this.B0 = new b[4];
        this.f9582C0 = new b[4];
        this.f9583D0 = 257;
        this.f9584E0 = false;
        this.f9585F0 = false;
        this.f9586G0 = null;
        this.f9587H0 = null;
        this.f9588I0 = null;
        this.f9589J0 = null;
        this.f9590K0 = new HashSet();
        this.f9591L0 = new R0.b();
    }

    public static void V(d dVar, T0.e eVar, R0.b bVar) {
        int i5;
        int i10;
        if (eVar == null) {
            return;
        }
        if (dVar.f9553g0 == 8 || (dVar instanceof h) || (dVar instanceof a)) {
            bVar.f10042e = 0;
            bVar.f10043f = 0;
            return;
        }
        int[] iArr = dVar.f9570p0;
        bVar.f10038a = iArr[0];
        bVar.f10039b = iArr[1];
        bVar.f10040c = dVar.q();
        bVar.f10041d = dVar.k();
        bVar.f10046i = false;
        bVar.f10047j = 0;
        boolean z2 = bVar.f10038a == 3;
        boolean z10 = bVar.f10039b == 3;
        boolean z11 = z2 && dVar.f9536W > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean z12 = z10 && dVar.f9536W > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z2 && dVar.t(0) && dVar.f9572r == 0 && !z11) {
            bVar.f10038a = 2;
            if (z10 && dVar.f9573s == 0) {
                bVar.f10038a = 1;
            }
            z2 = false;
        }
        if (z10 && dVar.t(1) && dVar.f9573s == 0 && !z12) {
            bVar.f10039b = 2;
            if (z2 && dVar.f9572r == 0) {
                bVar.f10039b = 1;
            }
            z10 = false;
        }
        if (dVar.A()) {
            bVar.f10038a = 1;
            z2 = false;
        }
        if (dVar.B()) {
            bVar.f10039b = 1;
            z10 = false;
        }
        int[] iArr2 = dVar.f9574t;
        if (z11) {
            if (iArr2[0] == 4) {
                bVar.f10038a = 1;
            } else if (!z10) {
                if (bVar.f10039b == 1) {
                    i10 = bVar.f10041d;
                } else {
                    bVar.f10038a = 2;
                    eVar.b(dVar, bVar);
                    i10 = bVar.f10043f;
                }
                bVar.f10038a = 1;
                bVar.f10040c = (int) (dVar.f9536W * i10);
            }
        }
        if (z12) {
            if (iArr2[1] == 4) {
                bVar.f10039b = 1;
            } else if (!z2) {
                if (bVar.f10038a == 1) {
                    i5 = bVar.f10040c;
                } else {
                    bVar.f10039b = 2;
                    eVar.b(dVar, bVar);
                    i5 = bVar.f10042e;
                }
                bVar.f10039b = 1;
                if (dVar.f9537X == -1) {
                    bVar.f10041d = (int) (i5 / dVar.f9536W);
                } else {
                    bVar.f10041d = (int) (dVar.f9536W * i5);
                }
            }
        }
        eVar.b(dVar, bVar);
        dVar.O(bVar.f10042e);
        dVar.L(bVar.f10043f);
        dVar.f9519E = bVar.f10045h;
        dVar.I(bVar.f10044g);
        bVar.f10047j = 0;
    }

    @Override // Q0.d
    public final void C() {
        this.f9597w0.t();
        this.f9598x0 = 0;
        this.f9599y0 = 0;
        this.f9592q0.clear();
        super.C();
    }

    @Override // Q0.d
    public final void F(G9.e eVar) {
        super.F(eVar);
        int size = this.f9592q0.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((d) this.f9592q0.get(i5)).F(eVar);
        }
    }

    @Override // Q0.d
    public final void P(boolean z2, boolean z10) {
        super.P(z2, z10);
        int size = this.f9592q0.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((d) this.f9592q0.get(i5)).P(z2, z10);
        }
    }

    public final void R(d dVar, int i5) {
        if (i5 == 0) {
            int i10 = this.f9600z0 + 1;
            b[] bVarArr = this.f9582C0;
            if (i10 >= bVarArr.length) {
                this.f9582C0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.f9582C0;
            int i11 = this.f9600z0;
            bVarArr2[i11] = new b(dVar, 0, this.v0);
            this.f9600z0 = i11 + 1;
            return;
        }
        if (i5 == 1) {
            int i12 = this.f9581A0 + 1;
            b[] bVarArr3 = this.B0;
            if (i12 >= bVarArr3.length) {
                this.B0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.B0;
            int i13 = this.f9581A0;
            bVarArr4[i13] = new b(dVar, 1, this.v0);
            this.f9581A0 = i13 + 1;
        }
    }

    public final void S(O0.c cVar) {
        e eVar;
        O0.c cVar2;
        boolean zW = W(64);
        b(cVar, zW);
        int size = this.f9592q0.size();
        boolean z2 = false;
        for (int i5 = 0; i5 < size; i5++) {
            d dVar = (d) this.f9592q0.get(i5);
            boolean[] zArr = dVar.f9532S;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i10 = 0; i10 < size; i10++) {
                d dVar2 = (d) this.f9592q0.get(i10);
                if (dVar2 instanceof a) {
                    a aVar = (a) dVar2;
                    for (int i11 = 0; i11 < aVar.f9657r0; i11++) {
                        d dVar3 = aVar.f9656q0[i11];
                        if (aVar.f9488t0 || dVar3.c()) {
                            int i12 = aVar.f9487s0;
                            if (i12 == 0 || i12 == 1) {
                                dVar3.f9532S[0] = true;
                            } else if (i12 == 2 || i12 == 3) {
                                dVar3.f9532S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f9590K0;
        hashSet.clear();
        for (int i13 = 0; i13 < size; i13++) {
            d dVar4 = (d) this.f9592q0.get(i13);
            dVar4.getClass();
            boolean z10 = dVar4 instanceof g;
            if (z10 || (dVar4 instanceof h)) {
                if (z10) {
                    hashSet.add(dVar4);
                } else {
                    dVar4.b(cVar, zW);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g gVar = (g) ((d) it.next());
                for (int i14 = 0; i14 < gVar.f9657r0; i14++) {
                    if (hashSet.contains(gVar.f9656q0[i14])) {
                        gVar.b(cVar, zW);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).b(cVar, zW);
                }
                hashSet.clear();
            }
        }
        if (O0.c.f8764p) {
            HashSet hashSet2 = new HashSet();
            for (int i15 = 0; i15 < size; i15++) {
                d dVar5 = (d) this.f9592q0.get(i15);
                dVar5.getClass();
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    hashSet2.add(dVar5);
                }
            }
            eVar = this;
            cVar2 = cVar;
            eVar.a(this, cVar2, hashSet2, this.f9570p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                d dVar6 = (d) it3.next();
                j.b(this, cVar2, dVar6);
                dVar6.b(cVar2, zW);
            }
        } else {
            eVar = this;
            cVar2 = cVar;
            for (int i16 = 0; i16 < size; i16++) {
                d dVar7 = (d) eVar.f9592q0.get(i16);
                if (dVar7 instanceof e) {
                    int[] iArr = dVar7.f9570p0;
                    int i17 = iArr[0];
                    int i18 = iArr[1];
                    if (i17 == 2) {
                        dVar7.M(1);
                    }
                    if (i18 == 2) {
                        dVar7.N(1);
                    }
                    dVar7.b(cVar2, zW);
                    if (i17 == 2) {
                        dVar7.M(i17);
                    }
                    if (i18 == 2) {
                        dVar7.N(i18);
                    }
                } else {
                    j.b(this, cVar2, dVar7);
                    if (!(dVar7 instanceof g) && !(dVar7 instanceof h)) {
                        dVar7.b(cVar2, zW);
                    }
                }
            }
        }
        if (eVar.f9600z0 > 0) {
            j.a(this, cVar2, null, 0);
        }
        if (eVar.f9581A0 > 0) {
            j.a(this, cVar2, null, 1);
        }
    }

    public final boolean T(int i5, boolean z2) {
        boolean z10;
        R0.e eVar = this.f9594s0;
        e eVar2 = (e) eVar.f10052d;
        boolean z11 = false;
        int iJ = eVar2.j(0);
        int iJ2 = eVar2.j(1);
        int iR = eVar2.r();
        int iS = eVar2.s();
        ArrayList arrayList = (ArrayList) eVar.f10054f;
        if (z2 && (iJ == 2 || iJ2 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                o oVar = (o) it.next();
                if (oVar.f10085f == i5 && !oVar.k()) {
                    z2 = false;
                    break;
                }
            }
            if (i5 == 0) {
                if (z2 && iJ == 2) {
                    eVar2.M(1);
                    eVar2.O(eVar.d(eVar2, 0));
                    eVar2.f9546d.f10084e.d(eVar2.q());
                }
            } else if (z2 && iJ2 == 2) {
                eVar2.N(1);
                eVar2.L(eVar.d(eVar2, 1));
                eVar2.f9548e.f10084e.d(eVar2.k());
            }
        }
        int[] iArr = eVar2.f9570p0;
        if (i5 == 0) {
            int i10 = iArr[0];
            if (i10 == 1 || i10 == 4) {
                int iQ = eVar2.q() + iR;
                eVar2.f9546d.f10088i.d(iQ);
                eVar2.f9546d.f10084e.d(iQ - iR);
                z10 = true;
            }
            z10 = false;
        } else {
            int i11 = iArr[1];
            if (i11 == 1 || i11 == 4) {
                int iK = eVar2.k() + iS;
                eVar2.f9548e.f10088i.d(iK);
                eVar2.f9548e.f10084e.d(iK - iS);
                z10 = true;
            }
            z10 = false;
        }
        eVar.i();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            o oVar2 = (o) it2.next();
            if (oVar2.f10085f == i5 && (oVar2.f10081b != eVar2 || oVar2.f10086g)) {
                oVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z11 = true;
                break;
            }
            o oVar3 = (o) it3.next();
            if (oVar3.f10085f == i5 && (z10 || oVar3.f10081b != eVar2)) {
                if (!oVar3.f10087h.f10067j || !oVar3.f10088i.f10067j || (!(oVar3 instanceof R0.c) && !oVar3.f10084e.f10067j)) {
                    break;
                }
            }
        }
        eVar2.M(iJ);
        eVar2.N(iJ2);
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0842 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:501:0x084f A[LOOP:14: B:500:0x084d->B:501:0x084f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:513:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0920  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0127  */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U() {
        /*
            Method dump skipped, instructions count: 2364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.e.U():void");
    }

    public final boolean W(int i5) {
        return (this.f9583D0 & i5) == i5;
    }

    @Override // Q0.d
    public final void n(StringBuilder sb2) {
        sb2.append(this.f9558j + ":{\n");
        StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(this.f9534U);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.f9535V);
        sb2.append("\n");
        Iterator it = this.f9592q0.iterator();
        while (it.hasNext()) {
            ((d) it.next()).n(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }
}
