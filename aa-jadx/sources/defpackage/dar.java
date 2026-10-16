package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class dar implements android.view.Choreographer.FrameCallback {
    final /* synthetic */ defpackage.aiuf a;
    final /* synthetic */ defpackage.affc b;

    public dar(defpackage.aiuf aiufVar, defpackage.affc affcVar) {
        this.a = aiufVar;
        this.b = affcVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        java.lang.Object afavVar;
        try {
            afavVar = this.b.invoke(java.lang.Long.valueOf(j));
        } catch (java.lang.Throwable th) {
            afavVar = new defpackage.afav(th);
        }
        this.a.w(afavVar);
    }
}
