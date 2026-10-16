package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bxl {
    public defpackage.bxm a;
    public int b;
    public defpackage.affg c;
    public int d;
    public defpackage.bzh e;
    public defpackage.aal f;
    public defpackage.aau g;

    public bxl(defpackage.bxm bxmVar) {
        this.a = bxmVar;
    }

    public static final boolean s(defpackage.bvr bvrVar, defpackage.aau aauVar) {
        bvrVar.getClass();
        defpackage.byo byoVar = bvrVar.b;
        if (byoVar == null) {
            byoVar = defpackage.bxv.c;
        }
        return !byoVar.a(bvrVar.e().e, aauVar.a(bvrVar));
    }

    public final void a() {
        defpackage.bxm bxmVar = this.a;
        if (bxmVar != null) {
            bxmVar.c(this, null);
        }
    }

    public final void b() {
        defpackage.bxm bxmVar = this.a;
        if (bxmVar != null) {
            bxmVar.b();
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
        this.b = z ? i | defpackage.sp.AUDIO_CONTENT_BUFFER_SIZE : i & (-513);
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
        return (this.b & defpackage.sp.AUDIO_CONTENT_BUFFER_SIZE) != 0;
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
        defpackage.bzh bzhVar;
        return (this.a == null || (bzhVar = this.e) == null || !bzhVar.a()) ? false : true;
    }

    public final boolean p() {
        return this.g != null;
    }

    public final void q() {
        this.b |= 1;
    }

    public final int r(java.lang.Object obj) {
        defpackage.bxm bxmVar = this.a;
        if (bxmVar != null) {
            return bxmVar.c(this, obj);
        }
        return 1;
    }
}
