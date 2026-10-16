package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dao implements android.view.Choreographer.FrameCallback, java.lang.Runnable {
    final /* synthetic */ defpackage.dap a;

    public dao(defpackage.dap dapVar) {
        this.a = dapVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        defpackage.dap dapVar = this.a;
        dapVar.d.removeCallbacks(this);
        dapVar.b();
        synchronized (dapVar.e) {
            if (dapVar.h) {
                dapVar.h = false;
                java.util.List list = dapVar.f;
                dapVar.f = dapVar.g;
                dapVar.g = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((android.view.Choreographer.FrameCallback) list.get(i)).doFrame(j);
                }
                list.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.dap dapVar = this.a;
        dapVar.b();
        synchronized (dapVar.e) {
            if (dapVar.f.isEmpty()) {
                dapVar.c.removeFrameCallback(this);
                dapVar.h = false;
            }
        }
    }
}
