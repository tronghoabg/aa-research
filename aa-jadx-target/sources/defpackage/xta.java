package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xta {
    public java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;
    public java.lang.Object e;
    public java.lang.Object f;
    public java.lang.Object g;
    public java.lang.Object h;
    public java.lang.Object i;
    public java.lang.Object j;
    public java.lang.Object k;
    public java.lang.Object l;

    public xta(defpackage.wvi wviVar) {
        this.k = new defpackage.wvg();
        this.b = new defpackage.wvg();
        this.a = new defpackage.wvg();
        this.l = new defpackage.wvg();
        this.j = new defpackage.wuv(0.0f);
        this.i = new defpackage.wuv(0.0f);
        this.g = new defpackage.wuv(0.0f);
        this.f = new defpackage.wuv(0.0f);
        this.e = new defpackage.wva();
        this.h = new defpackage.wva();
        this.c = new defpackage.wva();
        this.d = new defpackage.wva();
        this.k = wviVar.j;
        this.b = wviVar.k;
        this.a = wviVar.l;
        this.l = wviVar.m;
        this.j = wviVar.b;
        this.i = wviVar.c;
        this.g = wviVar.d;
        this.f = wviVar.e;
        this.e = wviVar.f;
        this.h = wviVar.g;
        this.c = wviVar.h;
        this.d = wviVar.i;
    }

    private static void s(defpackage.wpu wpuVar) {
        if (wpuVar instanceof defpackage.wvg) {
            float f = ((defpackage.wvg) wpuVar).a;
        } else if (wpuVar instanceof wuz) {
            float f2 = ((wuz) wpuVar).a;
        }
    }

    public final xrn a() {
        java.lang.Object obj = this.f;
        return obj == null ? new xrn((java.lang.String) null, 4095) : (xrn) obj;
    }

    public final xrn b() {
        java.lang.Object obj = this.g;
        return obj == null ? new xrn("2", 4094) : (xrn) obj;
    }

    public final xro c() {
        java.lang.Object obj = this.j;
        return obj == null ? new xro() : (xro) obj;
    }

    public final xrr d() {
        java.lang.Object obj = this.a;
        java.lang.Object obj2 = this.b;
        java.lang.Object obj3 = this.c;
        java.lang.Object obj4 = this.d;
        java.lang.Object obj5 = this.e;
        java.lang.Object obj6 = this.f;
        java.lang.Object obj7 = this.g;
        java.lang.Object obj8 = this.h;
        java.lang.Object obj9 = this.i;
        java.lang.Object obj10 = this.j;
        return new xrr((xry) obj, (xsa) obj2, (xsb) obj3, (xsc) obj4, (xsf) obj5, (xrn) obj6, (xrn) obj7, (xsd) obj8, (xrt) obj9, (xro) obj10, (xrz) this.k, (xrv) this.l);
    }

    public final xsa e() {
        java.lang.Object obj = this.b;
        return obj == null ? new xsa((byte[]) null) : (xsa) obj;
    }

    public final xsd f() {
        java.lang.Object obj = this.h;
        return obj == null ? new xsd((byte[]) null) : (xsd) obj;
    }

    public final xsf g() {
        java.lang.Object obj = this.e;
        return obj == null ? new xsf(0.0f, 64.0f, 1.0f, 1.0f) : (xsf) obj;
    }

    public final void h(float f) {
        this.f = new defpackage.wuv(f);
    }

    public final void i(float f) {
        this.g = new defpackage.wuv(f);
    }

    public final void j(float f) {
        this.j = new defpackage.wuv(f);
    }

    public final void k(float f) {
        this.i = new defpackage.wuv(f);
    }

    public final void l(float f) {
        j(f);
        k(f);
        i(f);
        h(f);
    }

    public final void m(wuy wuyVar) {
        this.j = wuyVar;
        this.i = wuyVar;
        this.g = wuyVar;
        this.f = wuyVar;
    }

    public final void n(defpackage.wpu wpuVar) {
        this.l = wpuVar;
        s(wpuVar);
    }

    public final void o(defpackage.wpu wpuVar) {
        this.a = wpuVar;
        s(wpuVar);
    }

    public final void p(defpackage.wpu wpuVar) {
        this.k = wpuVar;
        s(wpuVar);
    }

    public final void q(defpackage.wpu wpuVar) {
        this.b = wpuVar;
        s(wpuVar);
    }

    public final void r(defpackage.wpu wpuVar) {
        p(wpuVar);
        q(wpuVar);
        o(wpuVar);
        n(wpuVar);
    }

    public xta() {
        this((byte[]) null);
    }

    public xta(xrr xrrVar) {
        this.a = xrrVar.a;
        this.b = xrrVar.b;
        this.c = xrrVar.c;
        this.d = xrrVar.d;
        this.e = xrrVar.e;
        this.f = xrrVar.f;
        this.g = xrrVar.g;
        this.h = xrrVar.h;
        this.i = xrrVar.i;
        this.j = xrrVar.j;
        this.k = xrrVar.k;
        this.l = xrrVar.l;
    }

    public xta(char[] cArr) {
        this.k = new defpackage.wvg();
        this.b = new defpackage.wvg();
        this.a = new defpackage.wvg();
        this.l = new defpackage.wvg();
        this.j = new defpackage.wuv(0.0f);
        this.i = new defpackage.wuv(0.0f);
        this.g = new defpackage.wuv(0.0f);
        this.f = new defpackage.wuv(0.0f);
        this.e = new defpackage.wva();
        this.h = new defpackage.wva();
        this.c = new defpackage.wva();
        this.d = new defpackage.wva();
    }

    public /* synthetic */ xta(byte[] bArr) {
        this(new xrr((byte[]) null));
    }
}
