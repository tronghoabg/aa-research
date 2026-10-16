package defpackage;

import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class aeas implements advx {
    final /* synthetic */ adjx a;
    private final /* synthetic */ int b;

    public aeas(adjx adjxVar, int i) {
        this.b = i;
        this.a = adjxVar;
    }

    @Override // defpackage.advx
    public final adsm a() {
        int i = this.b;
        adjx adjxVar = this.a;
        if (i != 0) {
            adqw adqwVar = (adqw) adjxVar;
            return new adqv(new sm(adqwVar.a, (byte[]) null), zfq.a, adqwVar.b.ac());
        }
        aeau aeauVar = (aeau) adjxVar;
        erb erbVar = aeauVar.h;
        aebt aebtVar = aeauVar.f;
        SSLSocketFactory sSLSocketFactoryC = aeauVar.c();
        return new aeat(aeauVar.d, aeauVar.e, sSLSocketFactoryC, aebtVar, erbVar);
    }
}
