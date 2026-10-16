package defpackage;

/* loaded from: classes.dex */
public final class cuj extends cfx implements cyg, czb {
    public long a;
    public afec c;
    public dej d;
    private aivh e;
    private boolean f;
    private boolean g;
    private dek i;
    public float b = 1.0f;
    private final afec h = new chk(this, 11);

    public cuj(long j, afec afecVar) {
        this.a = j;
        this.c = afecVar;
    }

    public final void b() {
        aivh aivhVar = this.e;
        if (aivhVar != null) {
            aivhVar.s(null);
        }
        this.e = null;
        this.f = false;
        if (this.g) {
            d();
        }
    }

    public final void d() {
        aivh aivhVar = this.e;
        if (aivhVar != null) {
            aivhVar.s(null);
        }
        this.e = null;
        this.c.invoke(Boolean.valueOf(this.f));
        this.g = this.f;
    }

    @Override // defpackage.cfx
    public final void em() {
        b();
        aivh aivhVar = this.e;
        if (aivhVar != null) {
            aivhVar.s(null);
        }
        this.e = null;
        this.f = false;
        this.d = null;
    }

    @Override // defpackage.czb
    public final void en() {
        b();
    }

    @Override // defpackage.cfx
    public final void er() {
        dek dekVar = this.i;
        if (dekVar != null) {
            dekVar.b();
        }
        this.i = bzi.z(this, this.h);
    }

    public final void g(float f, dej dejVar) {
        this.d = dejVar;
        long j = dejVar.c;
        long j2 = j >> 32;
        long j3 = dejVar.a;
        int i = (int) j2;
        int iMin = Math.min(Math.max((int) (j3 >> 32), 0), i);
        int iMin2 = Math.min(Math.max((int) j3, 0), (int) j);
        long j4 = dejVar.b;
        int i2 = (int) (j4 >> 32);
        int i3 = (int) j4;
        float fMax = Math.max((Math.max(Math.min(i2, i), 0) - iMin) * (Math.max(Math.min(i3, r0), 0) - iMin2), 0) / Math.min(i * r0, (i2 - r1) * (i3 - r5));
        boolean z = true;
        if (fMax <= f && fMax != 1.0f) {
            z = false;
        }
        if (z != this.f) {
            this.f = z;
            aivh aivhVar = this.e;
            if (aivhVar != null) {
                aivhVar.s(null);
            }
            this.e = null;
            if (z != this.g) {
                if (!z || this.a <= 0) {
                    d();
                } else {
                    this.e = ahnc.d(N(), null, 0, new btm(this, (afck) null, 3), 3);
                }
            }
        }
    }

    @Override // defpackage.cfx
    public final void q() {
        dek dekVar = this.i;
        if (dekVar != null) {
            dekVar.b();
        }
        b();
    }

    @Override // defpackage.cyg
    public final void r() {
    }
}
