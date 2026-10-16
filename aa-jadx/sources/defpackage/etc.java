package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class etc extends java.util.concurrent.FutureTask {
    final /* synthetic */ defpackage.ete a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etc(defpackage.ete eteVar, java.util.concurrent.Callable callable) {
        super(callable);
        this.a = eteVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        try {
            this.a.e(get());
        } catch (java.lang.InterruptedException e) {
            android.util.Log.w("AsyncTask", e);
        } catch (java.util.concurrent.CancellationException unused) {
            this.a.e(null);
        } catch (java.util.concurrent.ExecutionException e2) {
            throw new java.lang.RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
        } catch (java.lang.Throwable th) {
            throw new java.lang.RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
