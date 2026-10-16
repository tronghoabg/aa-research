package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dan extends java.lang.ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ java.lang.Object initialValue() {
        android.view.Choreographer choreographer = android.view.Choreographer.getInstance();
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        if (looperMyLooper == null) {
            throw new java.lang.IllegalStateException("no Looper on this thread");
        }
        defpackage.dap dapVar = new defpackage.dap(choreographer, android.os.Handler.createAsync(looperMyLooper));
        return dapVar.plus(dapVar.j);
    }
}
