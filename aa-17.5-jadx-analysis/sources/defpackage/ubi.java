package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.Semaphore;

/* loaded from: classes3.dex */
abstract class ubi implements ubf {
    protected udx b;
    protected int c;
    protected utf d;
    protected ueu e;
    protected float f;
    protected long g;
    protected boolean h;
    protected ube i;
    protected long j;
    public plf k;
    public float l;
    protected rjg n;
    private boolean p;
    protected final Semaphore a = new Semaphore(1);
    protected int m = 1;
    private int o = 0;
    private boolean q = true;

    protected ubi() {
    }

    @Override // defpackage.ubf
    public final void A(long j, ube ubeVar) {
        this.j = j;
        this.g = j;
        this.i = ubeVar;
        if (this.h) {
            if (ubeVar == ube.b) {
                this.f = 1.0f;
            }
            if (ubeVar == ube.c) {
                this.f = BitmapDescriptorFactory.HUE_RED;
            }
        }
    }

    @Override // defpackage.ubf
    public final boolean B() {
        return this.p;
    }

    @Override // defpackage.ubf
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // defpackage.ubf
    public /* synthetic */ boolean D() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0058 A[PHI: r4
  0x0058: PHI (r4v1 int) = (r4v0 int), (r4v0 int), (r4v2 int), (r4v2 int) binds: [B:26:0x0056, B:22:0x0048, B:16:0x003b, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    @Override // defpackage.ubf
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int E(long r11) {
        /*
            r10 = this;
            long r0 = r10.j
            long r0 = r11 - r0
            r10.g = r11
            ube r11 = r10.i
            long r11 = r10.c(r11)
            ube r2 = r10.i
            int r2 = r2.ordinal()
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 5
            if (r2 == 0) goto L5e
            r5 = 1
            r6 = 995783694(0x3b5a740e, float:0.0033333334)
            r7 = 0
            r9 = 3
            if (r2 == r5) goto L42
            r5 = 2
            if (r2 == r5) goto L26
            if (r2 == r9) goto L5e
            goto L62
        L26:
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            r3 = 6
            r4 = 4
            if (r2 <= 0) goto L31
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 < 0) goto L58
            goto L3f
        L31:
            float r11 = (float) r0
            float r11 = r11 * r6
            float r12 = r10.f
            float r12 = r12 - r11
            r10.f = r12
            r11 = 0
            int r12 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r12 > 0) goto L58
            r10.f = r11
        L3f:
            r10.m = r3
            goto L62
        L42:
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 <= 0) goto L4b
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 < 0) goto L5b
            goto L58
        L4b:
            float r11 = (float) r0
            float r11 = r11 * r6
            float r12 = r10.f
            float r12 = r12 + r11
            r10.f = r12
            int r11 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r11 < 0) goto L5b
            r10.f = r3
        L58:
            r10.m = r4
            goto L62
        L5b:
            r10.m = r9
            goto L62
        L5e:
            r10.m = r4
            r10.f = r3
        L62:
            int r10 = r10.m
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ubi.E(long):int");
    }

    protected final void F(udx udxVar, int i, utf utfVar, ueu ueuVar) {
        woy.aa(this.q, this);
        this.n = (rjg) (udxVar.S() != null ? ((rhj) udxVar.S().e).c : null);
        this.b = udxVar.X();
        this.c = i;
        this.d = utfVar;
        this.e = ueuVar;
        this.p = false;
        this.f = 1.0f;
        this.g = 0L;
        this.j = 0L;
        this.i = ube.a;
        abcs abcsVarN = udxVar.n();
        abnh abnhVar = abhx.a;
        abcsVarN.j(abnhVar);
        Object objJ = abcsVarN.w.j(abnhVar.d);
        this.h = ((abii) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).i;
        this.q = false;
    }

    @Override // defpackage.ubb
    public final abcs a() {
        return ((uat) this.b).a;
    }

    @Override // defpackage.ubf
    public long c(ube ubeVar) {
        return 0L;
    }

    @Override // defpackage.ubf
    public tpv d() {
        return null;
    }

    @Override // defpackage.ubf
    public uew f() {
        return null;
    }

    @Override // defpackage.ubf
    public uew g() {
        return null;
    }

    protected void h() {
        woy.aa(!this.q, this);
        woy.aa(this.o == 0, this);
        this.b = null;
        this.c = -559038737;
        this.d = null;
        this.e = null;
        this.p = false;
        this.q = true;
        plf plfVar = this.k;
        if (plfVar != null) {
            plfVar.g(this);
            this.k = null;
        }
    }

    @Override // defpackage.ubf
    public void i() {
        throw null;
    }

    @Override // defpackage.ubf
    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    @Override // defpackage.ubf
    public boolean o() {
        throw null;
    }

    public int p(umk umkVar, boolean z, too tooVar) {
        throw null;
    }

    @Override // defpackage.ubf
    public final int t() {
        return this.c;
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.f("id", this.c);
        udx udxVar = this.b;
        xxgVarAo.b("minZoomLevel", udxVar == null ? "<null>" : Float.valueOf(((uat) udxVar).l));
        udx udxVar2 = this.b;
        xxgVarAo.b("rank", udxVar2 != null ? Integer.valueOf(((uat) udxVar2).a.i) : "<null>");
        xxgVarAo.b("drawOrder", this.d);
        xxgVarAo.e("opacity", this.f);
        xxgVarAo.f("referenceMask", this.o);
        xxgVarAo.h("destructed", this.q);
        xxgVarAo.b("labelPool", this.k);
        return xxgVarAo.toString();
    }

    @Override // defpackage.ubf
    public final udx u() {
        return this.b;
    }

    @Override // defpackage.ubf
    public final utf v() {
        return this.d;
    }

    @Override // defpackage.ubf
    public final synchronized void w(int i) {
        boolean z = true;
        woy.aa(!this.q, this);
        if ((this.o & i) != 0) {
            z = false;
        }
        woy.aa(z, this);
        this.o = i | this.o;
    }

    @Override // defpackage.ubf
    public final synchronized void x(int i) {
        woy.aa((this.o & i) != 0, this);
        int i2 = (~i) & this.o;
        this.o = i2;
        if (i2 == 0) {
            h();
        }
    }

    @Override // defpackage.ubf
    public final void y(boolean z) {
        this.p = z;
    }

    @Override // defpackage.ubf
    public final void z(float f) {
        this.l = f;
    }

    @Override // defpackage.ubf
    public void j(boolean z) {
    }

    @Override // defpackage.ubf
    public void k(boolean z) {
    }

    @Override // defpackage.ubf
    public void l(ubf ubfVar, float f) {
    }
}
