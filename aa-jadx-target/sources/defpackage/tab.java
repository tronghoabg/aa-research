package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class tab implements defpackage.aeep {
    final /* synthetic */ defpackage.taf a;
    private final /* synthetic */ int b;

    public tab(defpackage.taf tafVar, int i) {
        this.b = i;
        this.a = tafVar;
    }

    @Override // defpackage.aeep
    public final void a() {
        if (this.b != 0) {
            ((defpackage.yqj) defpackage.taf.a.f()).u("Closed connection");
            defpackage.kpu.b(defpackage.yxo.DODGEBOOST_CONNECTION_COMPLETED);
            this.a.c(false);
        } else {
            ((defpackage.yqj) defpackage.taf.a.f()).u("Response stream completed");
            defpackage.taf tafVar = this.a;
            synchronized (tafVar) {
                tafVar.l();
            }
        }
    }

    @Override // defpackage.aeep
    public final void b(java.lang.Throwable th) {
        if (this.b != 0) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.taf.a.g()).p(th)).u("Connection error");
            defpackage.kpu.b(defpackage.yxo.SERVICE_UNAVAILABLE);
            defpackage.kpu.b(defpackage.yxo.DODGEBOOST_CONNECTION_REMOTE_EXCEPTION);
            this.a.c(true);
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) defpackage.taf.a.g()).p(th)).u("Error with MediaRecommendation Callback stream");
        defpackage.taf tafVar = this.a;
        synchronized (tafVar) {
            tafVar.l();
        }
        defpackage.kpu.b(defpackage.yxo.MEDIA_REC_BIDI_STREAM_REMOTE_EXCEPTION);
    }

    @Override // defpackage.aeep
    public final /* synthetic */ void c(java.lang.Object obj) {
        if (this.b != 0) {
            ((tar) obj).getClass();
            return;
        }
        tbg tbgVar = (tbg) obj;
        tbgVar.getClass();
        defpackage.yqm yqmVar = defpackage.taf.a;
        ((defpackage.yqj) yqmVar.f()).w("Got %s media recommendations", tbgVar.b.size());
        ((defpackage.yqj) yqmVar.e()).y("%s", tbgVar);
        defpackage.taf tafVar = this.a;
        synchronized (tafVar) {
            defpackage.wyz wyzVar = tafVar.g;
            defpackage.abor aborVarN = tbf.a.n();
            aborVarN.getClass();
            defpackage.tan.e(aborVarN);
            defpackage.abpj abpjVar = tbgVar.b;
            abpjVar.getClass();
            defpackage.tan.d(abpjVar, aborVarN);
            wyzVar.r(defpackage.tan.c(aborVarN));
        }
        defpackage.kpu.b(defpackage.yxo.MEDIA_REC_BIDI_STREAM_RESPONSE_RECEIVED);
    }
}
