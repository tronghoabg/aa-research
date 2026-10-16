package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xux extends java.lang.ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ java.lang.Object initialValue() {
        defpackage.wfp.h(java.lang.Thread.currentThread());
        defpackage.nrr nrrVar = new defpackage.nrr((byte[]) null);
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        java.util.WeakHashMap weakHashMap = defpackage.xuy.b;
        synchronized (weakHashMap) {
            weakHashMap.put(threadCurrentThread, nrrVar);
        }
        return nrrVar;
    }
}
