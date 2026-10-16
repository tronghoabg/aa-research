package defpackage;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class ajvi extends ajvu {
    private static final long serialVersionUID = -1931571557597830536L;
    private boolean c;

    public ajvi(Charset charset) {
        super(charset);
        this.c = false;
    }

    @Override // defpackage.ajpy
    public final String b() {
        return "basic";
    }

    @Override // defpackage.ajpy
    @Deprecated
    public final ajoy c(ajqj ajqjVar, ajph ajphVar) throws ajqf {
        return g(ajqjVar, ajphVar, new akaw());
    }

    @Override // defpackage.ajvh, defpackage.ajpy
    public final void d(ajoy ajoyVar) throws ajqm {
        super.d(ajoyVar);
        this.c = true;
    }

    @Override // defpackage.ajpy
    public final boolean e() {
        return this.c;
    }

    @Override // defpackage.ajpy
    public final boolean f() {
        return false;
    }

    @Override // defpackage.ajvh, defpackage.ajqi
    public final ajoy g(ajqj ajqjVar, ajph ajphVar, akba akbaVar) throws ajqf {
        ahgm.e(ajqjVar, "Credentials");
        StringBuilder sb = new StringBuilder();
        sb.append(((ajqg) ajqjVar.b()).a);
        sb.append(":");
        sb.append(ajqjVar.a() == null ? "null" : ajqjVar.a());
        byte[] bArrC = new ajos().c(ahkt.b(sb.toString(), k(ajphVar)));
        akbh akbhVar = new akbh(32);
        if (i()) {
            akbhVar.f("Proxy-Authorization");
        } else {
            akbhVar.f("Authorization");
        }
        akbhVar.f(": Basic ");
        akbhVar.g(bArrC, 0, bArrC.length);
        return new akak(akbhVar);
    }

    @Override // defpackage.ajvh
    public final String toString() {
        return "BASIC [complete=" + this.c + "]";
    }

    public ajvi() {
        this(ajox.b);
    }
}
