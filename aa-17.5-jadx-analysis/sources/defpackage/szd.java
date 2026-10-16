package defpackage;

import j$.util.DesugarCollections;

/* loaded from: classes.dex */
final class szd implements aedp {
    final /* synthetic */ szh a;
    private final /* synthetic */ int b;

    public szd(szh szhVar, int i) {
        this.b = i;
        this.a = szhVar;
    }

    @Override // defpackage.aedp
    public final void a() {
        if (this.b != 0) {
            ((ype) szh.a.f()).u("Closed connection");
            lau.b(ywj.DODGEBOOST_CONNECTION_COMPLETED);
            this.a.c(false);
        } else {
            ((ype) szh.a.f()).u("Response stream completed");
            szh szhVar = this.a;
            synchronized (szhVar) {
                szhVar.l();
            }
        }
    }

    @Override // defpackage.aedp
    public final void b(Throwable th) {
        if (this.b != 0) {
            ((ype) ((ype) szh.a.g()).p(th)).u("Connection error");
            lau.b(ywj.SERVICE_UNAVAILABLE);
            lau.b(ywj.DODGEBOOST_CONNECTION_REMOTE_EXCEPTION);
            this.a.c(true);
            return;
        }
        ((ype) ((ype) szh.a.g()).p(th)).u("Error with MediaRecommendation Callback stream");
        szh szhVar = this.a;
        synchronized (szhVar) {
            szhVar.l();
        }
        lau.b(ywj.MEDIA_REC_BIDI_STREAM_REMOTE_EXCEPTION);
    }

    @Override // defpackage.aedp
    public final /* synthetic */ void c(Object obj) {
        if (this.b != 0) {
            ((szt) obj).getClass();
            return;
        }
        tai taiVar = (tai) obj;
        taiVar.getClass();
        yph yphVar = szh.a;
        ((ype) yphVar.f()).w("Got %s media recommendations", taiVar.b.size());
        ((ype) yphVar.e()).y("%s", taiVar);
        szh szhVar = this.a;
        synchronized (szhVar) {
            wyd wydVar = szhVar.g;
            abnp abnpVarN = tah.a.n();
            abnpVarN.getClass();
            DesugarCollections.unmodifiableList(((tah) abnpVarN.b).b).getClass();
            aboh abohVar = taiVar.b;
            abohVar.getClass();
            tss.t(abohVar, abnpVarN);
            wydVar.s(tss.s(abnpVarN));
        }
        lau.b(ywj.MEDIA_REC_BIDI_STREAM_RESPONSE_RECEIVED);
    }
}
