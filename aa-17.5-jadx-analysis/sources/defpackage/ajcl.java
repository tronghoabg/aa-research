package defpackage;

/* loaded from: classes3.dex */
final class ajcl implements Runnable {
    final /* synthetic */ ajcm a;
    private Runnable b;

    public ajcl(ajcm ajcmVar, Runnable runnable) {
        this.a = ajcmVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        while (true) {
            try {
                this.b.run();
            } catch (Throwable th) {
                aiiu.b(afcp.a, th);
            }
            ajcm ajcmVar = this.a;
            Runnable runnableE = ajcmVar.e();
            if (runnableE == null) {
                return;
            }
            try {
                this.b = runnableE;
                i++;
                if (i >= 16) {
                    aitu aituVar = ajcmVar.a;
                    if (ajcb.c(aituVar, ajcmVar)) {
                        ajcb.b(aituVar, ajcmVar, this);
                        return;
                    }
                }
            } catch (Throwable th2) {
                ajcm ajcmVar2 = this.a;
                synchronized (ajcmVar2.c) {
                    ajcmVar2.b.c();
                    throw th2;
                }
            }
        }
    }
}
