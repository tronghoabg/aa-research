package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class dar implements android.view.Choreographer.FrameCallback {
    final /* synthetic */ aiuf a;
    final /* synthetic */ defpackage.affc b;

    public dar(aiuf aiufVar, defpackage.affc affcVar) {
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
