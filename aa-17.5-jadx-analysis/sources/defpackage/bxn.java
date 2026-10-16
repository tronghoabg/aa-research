package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class bxn extends bvb {
    public static final ajab k = ajac.a(cck.a);
    private static final AtomicReference u = new AtomicReference(false);
    private final aivj A;
    private final lah B;
    public long a;
    public final bul b;
    public final Object c;
    public aivh d;
    public Throwable e;
    public final byw f;
    public final List g;
    public aitf h;
    public boolean i;
    public final afco j;
    public final ajab l;
    public aap m;
    public final aan n;
    public final aan o;
    public final aan p;
    public aap q;
    public final bii r;
    public final bxc s;
    public final nfh t;
    private final List v;
    private List w;
    private final List x;
    private List y;
    private final ajab z;

    public bxn(afco afcoVar) {
        bul bulVar = new bul(new bxh(this, 1));
        this.b = bulVar;
        this.t = new nfh(new bxh(this, 0));
        this.c = new Object();
        this.v = new ArrayList();
        this.m = new aap(6);
        this.f = new byw(new bvd[16]);
        this.x = new ArrayList();
        this.g = new ArrayList();
        this.n = new aan(6);
        this.r = new bii();
        long[] jArr = aao.a;
        this.o = new aan(6);
        this.p = new aan(6);
        this.z = ajac.a(null);
        this.l = new ajab(bxi.c);
        this.B = new lah((byte[]) null);
        aivj aivjVar = new aivj((aivh) afcoVar.get(aivh.d));
        aivjVar.p(new bji(this, 15));
        this.A = aivjVar;
        this.j = afcoVar.plus(bulVar).plus(aivjVar);
        this.s = new bxc();
    }

    private static final void L(bxn bxnVar, bwl bwlVar, bwl bwlVar2) {
        List list = bwlVar2.e;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                bwl bwlVar3 = (bwl) list.get(i);
                bii biiVar = bxnVar.r;
                bwk bwkVar = bwlVar3.a;
                bii biiVar2 = new bii(bwlVar3, bwlVar);
                bys.b((aan) biiVar.b, bwkVar, biiVar2);
                bys.b((aan) biiVar.a, biiVar2.b, bwkVar);
                L(bxnVar, bwlVar, bwlVar3);
            }
        }
    }

    private final boolean M() {
        return this.f.b != 0 || E() || N() || this.n.e();
    }

    private final boolean N() {
        return !this.i && ((ccq) this.t.a).c();
    }

    private final void O(bvd bvdVar) throws Throwable {
        synchronized (this.c) {
            List list = this.g;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (affa.f(((bwl) list.get(i)).f, bvdVar)) {
                    ArrayList arrayList = new ArrayList();
                    P(arrayList, this, bvdVar);
                    while (!arrayList.isEmpty()) {
                        I(arrayList, null);
                        P(arrayList, this, bvdVar);
                    }
                    return;
                }
            }
        }
    }

    private static final void P(List list, bxn bxnVar, bvd bvdVar) {
        list.clear();
        synchronized (bxnVar.c) {
            Iterator it = bxnVar.g.iterator();
            while (it.hasNext()) {
                bwl bwlVar = (bwl) it.next();
                if (affa.f(bwlVar.f, bvdVar)) {
                    list.add(bwlVar);
                    it.remove();
                }
            }
        }
    }

    private final void Q(bvd bvdVar) {
        if (this.v.remove(bvdVar)) {
            this.w = null;
        }
    }

    private static final void R(cdw cdwVar) {
        try {
            if (cdwVar.c() instanceof cee) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            cdwVar.d();
        }
    }

    public final aitf A() {
        bxi bxiVar;
        ajab ajabVar = this.l;
        if (((bxi) ajabVar.b()).compareTo(bxi.b) > 0) {
            if (this.z.b() != null) {
                bxiVar = bxi.c;
            } else if (this.d == null) {
                this.m = new aap(6);
                this.f.g();
                bxiVar = (E() || N()) ? bxi.d : bxi.c;
            } else {
                bxiVar = (this.f.b != 0 || this.m.c() || !this.x.isEmpty() || !this.g.isEmpty() || E() || N() || this.n.e()) ? bxi.f : bxi.e;
            }
            ajabVar.d(bxiVar);
            if (bxiVar != bxi.f) {
                return null;
            }
            aitf aitfVar = this.h;
            this.h = null;
            return aitfVar;
        }
        List listZ = z();
        int size = listZ.size();
        for (int i = 0; i < size; i++) {
        }
        this.v.clear();
        this.w = afbe.a;
        this.m = new aap(6);
        this.f.g();
        this.x.clear();
        this.g.clear();
        this.y = null;
        aitf aitfVar2 = this.h;
        if (aitfVar2 != null) {
            aitfVar2.g(null);
        }
        this.h = null;
        this.z.d(null);
        return null;
    }

    public final void B() {
        synchronized (this.c) {
            ajab ajabVar = this.l;
            if (((bxi) ajabVar.b()).compareTo(bxi.e) >= 0) {
                ajabVar.d(bxi.b);
            }
        }
        this.A.s(null);
    }

    public final void C() {
        aitf aitfVarA;
        synchronized (this.c) {
            aitfVarA = A();
            if (((bxi) this.l.b()).compareTo(bxi.b) <= 0) {
                throw aije.a("Recomposer shutdown; frame clock awaiter will never resume", this.e);
            }
        }
        if (aitfVarA != null) {
            aitfVarA.w(afak.a);
        }
    }

    public final void D() {
        synchronized (this.c) {
            this.i = true;
        }
    }

    public final boolean E() {
        return !this.i && this.b.a.c();
    }

    public final boolean F() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (!this.m.c() && this.f.b == 0 && !E()) {
                if (!N()) {
                    z = false;
                }
            }
        }
        return z;
    }

    public final boolean G() {
        boolean zM;
        synchronized (this.c) {
            if (this.m.b()) {
                return M();
            }
            List listZ = z();
            byz byzVar = new byz(this.m);
            this.m = new aap(6);
            try {
                int size = listZ.size();
                for (int i = 0; i < size; i++) {
                    ((bvd) listZ.get(i)).s(byzVar);
                    if (((bxi) this.l.b()).compareTo(bxi.b) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    if (A() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zM = M();
                }
                return zM;
            } catch (Throwable th) {
                synchronized (this.c) {
                    this.m.k(byzVar);
                    throw th;
                }
            }
        }
    }

    public final void H(bvd bvdVar) {
        List arrayList = this.y;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.y = arrayList;
        }
        if (!arrayList.contains(bvdVar)) {
            arrayList.add(bvdVar);
        }
        Q(bvdVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a7, code lost:
    
        r1 = r10.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ac, code lost:
    
        if (r2 >= r1) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b6, code lost:
    
        if (((defpackage.aezu) r10.get(r2)).b == null) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01b8, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01bb, code lost:
    
        r1 = new java.util.ArrayList(r10.size());
        r2 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c9, code lost:
    
        if (r4 >= r2) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01cb, code lost:
    
        r11 = (defpackage.aezu) r10.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01d3, code lost:
    
        if (r11.b != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01d5, code lost:
    
        r11 = (defpackage.bwl) r11.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01da, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01db, code lost:
    
        if (r11 == null) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01dd, code lost:
    
        r1.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01e0, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e3, code lost:
    
        monitor-enter(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01e4, code lost:
    
        defpackage.woy.cq(r0.g, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01e9, code lost:
    
        monitor-exit(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ea, code lost:
    
        r1 = new java.util.ArrayList(r10.size());
        r2 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01f8, code lost:
    
        if (r4 >= r2) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01fa, code lost:
    
        r8 = r10.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0203, code lost:
    
        if (((defpackage.aezu) r8).b == null) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0205, code lost:
    
        r1.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0208, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x020b, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0382 A[Catch: all -> 0x04ed, TryCatch #6 {all -> 0x04ed, blocks: (B:99:0x0286, B:101:0x0298, B:103:0x02a3, B:104:0x02a9, B:110:0x02e3, B:165:0x047f, B:117:0x02f4, B:118:0x02f7, B:119:0x02f8, B:121:0x0303, B:124:0x0309, B:127:0x030f, B:129:0x0318, B:130:0x031d, B:132:0x0324, B:133:0x0329, B:135:0x033b, B:140:0x035b, B:141:0x035d, B:143:0x0379, B:145:0x0382, B:147:0x038a, B:149:0x03a0, B:151:0x03ab, B:153:0x03c4, B:164:0x047c, B:189:0x04ba, B:190:0x04bd, B:192:0x04bf, B:193:0x04c2, B:136:0x0349, B:194:0x04c3, B:142:0x036e), top: B:258:0x0286, inners: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List I(java.util.List r32, defpackage.aap r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxn.I(java.util.List, aap):java.util.List");
    }

    public final bvd J(bvd bvdVar, aap aapVar) {
        aap aapVar2;
        if (bvdVar.v() || bvdVar.f() || ((aapVar2 = this.q) != null && aapVar2.a(bvdVar))) {
            return null;
        }
        cdw cdwVarN = byx.n(new bji(bvdVar, 14), new bee(bvdVar, aapVar, 12));
        try {
            cec cecVarW = cdwVarN.w();
            boolean zL = false;
            if (aapVar != null) {
                try {
                    if (aapVar.c()) {
                        bws bwsVar = new bws(aapVar, bvdVar, 2);
                        bwc bwcVar = bvdVar.k;
                        if (((bvv) bwcVar).l) {
                            buz.b("Preparing a composition while composing is not supported");
                        }
                        ((bvv) bwcVar).l = true;
                        try {
                            bwsVar.invoke();
                            ((bvv) bwcVar).l = false;
                        } catch (Throwable th) {
                            ((bvv) bwcVar).l = false;
                            throw th;
                        }
                    }
                } finally {
                    cek.i.k(cecVarW);
                }
            }
            synchronized (bvdVar.c) {
                bxa bxaVar = bvdVar.g;
                if (bxaVar == null || (bxaVar.d.get() == bxb.e && bxaVar.e == Thread.currentThread().getId())) {
                    bvdVar.o();
                    try {
                        aan aanVarX = bvdVar.x();
                        try {
                            bwc bwcVar2 = bvdVar.k;
                            bxw bxwVar = bvdVar.f;
                            if (!((bvv) bwcVar2).y.o()) {
                                buz.b("Expected applyChanges() to have been called");
                            }
                            if (aanVarX.e > 0 || !((bvv) bwcVar2).g.isEmpty()) {
                                ((bvv) bwcVar2).r = bxwVar;
                                try {
                                    ((bvv) bwcVar2).ak(aanVarX, null);
                                    ((bvv) bwcVar2).r = null;
                                    zL = ((bvv) bwcVar2).y.l();
                                } catch (Throwable th2) {
                                    ((bvv) bwcVar2).r = null;
                                    throw th2;
                                }
                            }
                            if (!zL) {
                                bvdVar.p();
                            }
                        } catch (Throwable th3) {
                            bvdVar.n = aanVarX;
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        try {
                            Set set = bvdVar.d;
                            if (!set.isEmpty()) {
                                cda cdaVar = bvdVar.j;
                                try {
                                    cdaVar.h(set, bvdVar.k.Q());
                                    cdaVar.b();
                                    cdaVar.a();
                                } catch (Throwable th5) {
                                    cdaVar.a();
                                    throw th5;
                                }
                            }
                            throw th4;
                        } catch (Throwable th6) {
                            bvdVar.h();
                            throw th6;
                        }
                    }
                } else {
                    a.h(bxaVar.d, bxb.f, bxb.d);
                    bxaVar.g.a.e(9);
                }
            }
            if (zL) {
                return bvdVar;
            }
            return null;
        } finally {
            R(cdwVarN);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [bvd] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [bva] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public final void K(Throwable th, bvd bvdVar) throws Throwable {
        if (!((Boolean) u.get()).booleanValue() || (th instanceof buu)) {
            synchronized (this.c) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                ajab ajabVar = this.z;
                kgx kgxVar = (kgx) ajabVar.b();
                if (kgxVar != null) {
                    throw ((Throwable) kgxVar.a);
                }
                ajabVar.d(new kgx(th, (byte[]) null));
            }
            throw th;
        }
        synchronized (this.c) {
            Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
            this.x.clear();
            this.f.g();
            this.m = new aap(6);
            this.g.clear();
            this.n.k();
            this.o.k();
            this.z.d(new kgx(th, (byte[]) null));
            if (bvdVar != 0) {
                while (bvdVar != 0) {
                    H(bvdVar);
                    bvdVar = bvdVar.a.c();
                    if (true != (bvdVar instanceof bvd)) {
                        bvdVar = 0;
                    }
                }
            }
            if (A() != null) {
                buz.b("expected to go to inactive state due to composition error");
            }
        }
    }

    @Override // defpackage.bvb
    public final long a() {
        return 1000L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [afdr, java.lang.Object] */
    @Override // defpackage.bvb
    public final buo b(afdr afdrVar) {
        bwt bwtVar = new bwt(afdrVar);
        nfh nfhVar = this.t;
        return ((ccq) nfhVar.a).a(bwtVar, nfhVar.b);
    }

    @Override // defpackage.bvb
    public final bva c() {
        return null;
    }

    @Override // defpackage.bvb
    public final afco d() {
        return this.j;
    }

    @Override // defpackage.bvb
    public final void e(bwl bwlVar) {
        aitf aitfVarA;
        synchronized (this.c) {
            bys.b(this.n, bwlVar.a, bwlVar);
            if (bwlVar.e != null) {
                L(this, bwlVar, bwlVar);
            }
            aitfVarA = A();
        }
        if (aitfVarA != null) {
            aitfVarA.w(afak.a);
        }
    }

    @Override // defpackage.bvb
    public final void i(bxf bxfVar) {
        lah lahVar = this.B;
        aap aapVar = (aap) lahVar.j();
        if (aapVar == null) {
            aap aapVar2 = aaq.a;
            aapVar = new aap(6);
            lahVar.k(aapVar);
        }
        aapVar.j(bxfVar);
    }

    @Override // defpackage.bvb
    public final boolean l() {
        return ((Boolean) u.get()).booleanValue();
    }

    @Override // defpackage.bvb
    public final boolean m() {
        return false;
    }

    @Override // defpackage.bvb
    public final boolean n() {
        return buz.a == 2;
    }

    @Override // defpackage.bvb
    public final boolean o() {
        return buz.a != 0;
    }

    @Override // defpackage.bvb
    public final aap p(bvd bvdVar, bxw bxwVar, afeg afegVar) {
        try {
            bxw bxwVarG = bvdVar.g(bxwVar);
            try {
                s(bvdVar, afegVar);
                aap aapVar = (aap) this.B.j();
                if (aapVar == null) {
                    aapVar = aaq.a;
                    aapVar.getClass();
                }
                return aapVar;
            } finally {
                bvdVar.g(bxwVarG);
            }
        } finally {
            this.B.k(null);
        }
    }

    @Override // defpackage.bvb
    public final aap q(bvd bvdVar, bxw bxwVar, aap aapVar) {
        try {
            G();
            bvdVar.s(new byz(aapVar));
            bxw bxwVarG = bvdVar.g(bxwVar);
            try {
                bvd bvdVarJ = J(bvdVar, null);
                if (bvdVarJ != null) {
                    O(bvdVar);
                    bvdVarJ.j();
                    bvdVarJ.k();
                }
                aap aapVar2 = (aap) this.B.j();
                if (aapVar2 == null) {
                    aapVar2 = aaq.a;
                    aapVar2.getClass();
                }
                return aapVar2;
            } finally {
                bvdVar.g(bxwVarG);
            }
        } finally {
            this.B.k(null);
        }
    }

    @Override // defpackage.bvb
    public final void s(bvd bvdVar, afeg afegVar) throws Throwable {
        boolean zContains;
        boolean zV = bvdVar.v();
        synchronized (this.c) {
            zContains = ((bxi) this.l.b()).compareTo(bxi.b) > 0 ? true ^ z().contains(bvdVar) : true;
        }
        try {
            cdw cdwVarN = byx.n(new bji(bvdVar, 14), new bee(bvdVar, null, 12));
            try {
                cec cecVarW = cdwVarN.w();
                try {
                    synchronized (bvdVar.c) {
                        bvdVar.o();
                        aan aanVarX = bvdVar.x();
                        try {
                            bwc bwcVar = bvdVar.k;
                            bxw bxwVar = bvdVar.f;
                            if (!((bvv) bwcVar).y.o()) {
                                buz.b("Expected applyChanges() to have been called");
                            }
                            ((bvv) bwcVar).r = bxwVar;
                            try {
                                ((bvv) bwcVar).ak(aanVarX, afegVar);
                            } finally {
                                ((bvv) bwcVar).r = null;
                            }
                        } catch (Throwable th) {
                            bvdVar.n = aanVarX;
                            throw th;
                        }
                    }
                    synchronized (this.c) {
                        if (((bxi) this.l.b()).compareTo(bxi.b) > 0 && !z().contains(bvdVar)) {
                            this.v.add(bvdVar);
                            this.w = null;
                        }
                    }
                    if (!zV) {
                        cek.b().e();
                    }
                    try {
                        O(bvdVar);
                        try {
                            bvdVar.j();
                            bvdVar.k();
                            if (zV) {
                                return;
                            }
                            cek.b().e();
                        } catch (Throwable th2) {
                            K(th2, null);
                        }
                    } catch (Throwable th3) {
                        K(th3, bvdVar);
                    }
                } catch (Throwable th4) {
                    try {
                        Set set = bvdVar.d;
                        if (!set.isEmpty()) {
                            cda cdaVar = bvdVar.j;
                            try {
                                cdaVar.h(set, bvdVar.k.Q());
                                cdaVar.b();
                                cdaVar.a();
                            } catch (Throwable th5) {
                                cdaVar.a();
                                throw th5;
                            }
                        }
                        throw th4;
                    } finally {
                    }
                }
            } finally {
                R(cdwVarN);
            }
        } catch (Throwable th6) {
            if (zContains) {
                synchronized (this.c) {
                }
            }
            K(th6, bvdVar);
        }
    }

    @Override // defpackage.bvb
    public final void t(bvd bvdVar) {
        aitf aitfVarA;
        synchronized (this.c) {
            byw bywVar = this.f;
            if (bywVar.l(bvdVar)) {
                aitfVarA = null;
            } else {
                bywVar.n(bvdVar);
                aitfVarA = A();
            }
        }
        if (aitfVarA != null) {
            aitfVarA.w(afak.a);
        }
    }

    @Override // defpackage.bvb
    public final void u(bvd bvdVar) {
        synchronized (this.c) {
            aap aapVar = this.q;
            if (aapVar == null) {
                aap aapVar2 = aaq.a;
                aapVar = new aap(6);
                this.q = aapVar;
            }
            aapVar.j(bvdVar);
        }
    }

    @Override // defpackage.bvb
    public final void v(bvd bvdVar) {
        synchronized (this.c) {
            Q(bvdVar);
            this.f.m(bvdVar);
            this.x.remove(bvdVar);
        }
    }

    @Override // defpackage.bvb
    public final kgx w(bwl bwlVar) {
        kgx kgxVar;
        synchronized (this.c) {
            kgxVar = (kgx) this.o.i(bwlVar);
        }
        return kgxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0190  */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v16 */
    @Override // defpackage.bvb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(defpackage.bwl r19, defpackage.kgx r20, defpackage.buj r21) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxn.x(bwl, kgx, buj):void");
    }

    public final Object y(afck afckVar) {
        Object objA = ahnc.a(this.b, new bxk(this, new bxm(this, null), czz.ah(afckVar.hH()), null), afckVar);
        afcr afcrVar = afcr.a;
        if (objA != afcrVar) {
            objA = afak.a;
        }
        return objA == afcrVar ? objA : afak.a;
    }

    public final List z() {
        List list = this.w;
        if (list != null) {
            return list;
        }
        List list2 = this.v;
        List arrayList = list2.isEmpty() ? afbe.a : new ArrayList(list2);
        this.w = arrayList;
        return arrayList;
    }

    @Override // defpackage.bvb
    public final void g(Set set) {
    }
}
