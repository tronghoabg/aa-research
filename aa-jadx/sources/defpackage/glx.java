package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class glx implements defpackage.geq {
    private final defpackage.geq a;
    private final defpackage.usc b;

    public glx(defpackage.geq geqVar, defpackage.usc uscVar) {
        this.a = geqVar;
        this.b = uscVar;
    }

    @Override // defpackage.geq
    public final void a(defpackage.glm glmVar) throws defpackage.xy, android.os.RemoteException {
        boolean z;
        this.a.a(glmVar);
        try {
            defpackage.usc uscVar = this.b;
            synchronized (uscVar) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                long jCurrentTimeMillis2 = 4000;
                while (true) {
                    z = uscVar.a;
                    if (z || jCurrentTimeMillis2 <= 0) {
                        break;
                    }
                    uscVar.wait(jCurrentTimeMillis2);
                    jCurrentTimeMillis2 = 4000 - (java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
                }
                if (!z) {
                    throw new java.util.concurrent.TimeoutException("Response was not set while blocked");
                }
            }
            glmVar.a();
        } catch (java.lang.InterruptedException e) {
            glmVar.a();
            throw new java.lang.IllegalStateException("Exception while waiting for client response.", e);
        } catch (java.util.concurrent.TimeoutException e2) {
            if (android.util.Log.isLoggable("CarApp.H", 5)) {
                android.util.Log.w("CarApp.H", "Timeout blocking for a client response", e2);
            }
        }
    }
}
