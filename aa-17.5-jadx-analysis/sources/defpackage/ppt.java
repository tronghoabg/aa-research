package defpackage;

/* loaded from: classes2.dex */
final class ppt implements pwq {
    final /* synthetic */ pwq a;

    public ppt(pwq pwqVar) {
        this.a = pwqVar;
    }

    @Override // defpackage.pwq
    public final void a(rjg rjgVar, pwu pwuVar) {
        String[] strArr = vaq.a;
        ((ynz) ((ynz) ppu.a.h()).ai((char) 6800)).y("Failed client parameters RPC response.  failure=%s", pwuVar);
        this.a.a(rjgVar, pwuVar);
    }

    @Override // defpackage.pwq
    public final /* bridge */ /* synthetic */ void b(rjg rjgVar, Object obj) {
        String[] strArr = vaq.a;
        ((ynz) ((ynz) ppu.a.f()).ai((char) 6801)).u("Fetch new client parameters: Success!");
        this.a.b(rjgVar, (acbu) obj);
    }
}
