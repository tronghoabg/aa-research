package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wrq implements defpackage.eap {
    final /* synthetic */ defpackage.wrs a;
    final /* synthetic */ defpackage.wrt b;

    public wrq(defpackage.wrs wrsVar, defpackage.wrt wrtVar) {
        this.a = wrsVar;
        this.b = wrtVar;
    }

    @Override // defpackage.eap
    public final defpackage.edf a(android.view.View view, defpackage.edf edfVar) {
        this.a.a(view, edfVar, new defpackage.wrt(this.b));
        return edfVar;
    }
}
