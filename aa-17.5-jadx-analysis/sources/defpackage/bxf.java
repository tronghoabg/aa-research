package defpackage;

/* loaded from: classes.dex */
public final class bxf {
    public bxg a;
    public int b;
    public afeg c;
    public int d;
    public bzb e;
    public aae f;
    public aan g;

    public bxf(bxg bxgVar) {
        this.a = bxgVar;
    }

    public static final boolean s(bvk bvkVar, aan aanVar) {
        bvkVar.getClass();
        byi byiVar = bvkVar.b;
        if (byiVar == null) {
            byiVar = bxp.c;
        }
        return !byiVar.a(bvkVar.e().e, aanVar.a(bvkVar));
    }

    public final void a() {
        bxg bxgVar = this.a;
        if (bxgVar != null) {
            bxgVar.c(this, null);
        }
    }

    public final void b() {
        bxg bxgVar = this.a;
        if (bxgVar != null) {
            bxgVar.b();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.c = null;
    }

    public final void c(boolean z) {
        int i = this.b;
        this.b = z ? i | 4 : i & (-5);
    }

    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 256 : i & (-257);
    }

    public final void e(boolean z) {
        int i = this.b;
        this.b = z ? i | 8 : i & (-9);
    }

    public final void f(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }

    public final void g(boolean z) {
        int i = this.b;
        this.b = z ? i | 1024 : i & (-1025);
    }

    public final void h(boolean z) {
        int i = this.b;
        this.b = z ? i | sk.AUDIO_CONTENT_BUFFER_SIZE : i & (-513);
    }

    public final void i(boolean z) {
        int i = this.b;
        this.b = z ? i | 128 : i & (-129);
    }

    public final void j(boolean z) {
        int i = this.b;
        this.b = z ? i | 16 : i & (-17);
    }

    public final boolean k() {
        return (this.b & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0;
    }

    public final boolean l() {
        return (this.b & 128) != 0;
    }

    public final boolean m() {
        return (this.b & 16) != 0;
    }

    public final boolean n() {
        return (this.b & 1) != 0;
    }

    public final boolean o() {
        bzb bzbVar;
        return (this.a == null || (bzbVar = this.e) == null || !bzbVar.a()) ? false : true;
    }

    public final boolean p() {
        return this.g != null;
    }

    public final void q() {
        this.b |= 1;
    }

    public final int r(Object obj) {
        bxg bxgVar = this.a;
        if (bxgVar != null) {
            return bxgVar.c(this, obj);
        }
        return 1;
    }
}
