package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dan extends java.lang.ThreadLocal {
    /* JADX WARN: Type inference failed for: r2v1, types: [afdg, dap] */
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ java.lang.Object initialValue() {
        android.view.Choreographer choreographer = android.view.Choreographer.getInstance();
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        if (looperMyLooper == null) {
            throw new java.lang.IllegalStateException("no Looper on this thread");
        }
        ?? dapVar = new defpackage.dap(choreographer, hh$.ExternalSyntheticApiModelOutline0.m(looperMyLooper));
        return dapVar.plus(dapVar.j);
    }
}
