package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tfm implements defpackage.tfl {
    final /* synthetic */ defpackage.tfn a;
    private volatile java.lang.Object b;

    public tfm(defpackage.tfn tfnVar) {
        this.a = tfnVar;
    }

    @Override // defpackage.tfl
    public final java.lang.Object b(android.content.Context context) {
        java.lang.Object objB;
        java.lang.Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        defpackage.tfn tfnVar = this.a;
        synchronized (this) {
            objB = this.b;
            if (objB == null) {
                android.content.Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                objB = tfnVar.b(applicationContext);
                this.b = objB;
            }
        }
        return objB;
    }
}
