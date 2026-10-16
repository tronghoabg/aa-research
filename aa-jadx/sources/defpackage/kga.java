package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class kga extends android.os.AsyncTask {
    public final defpackage.kfx d = new defpackage.kfx();
    private final java.lang.ref.WeakReference a = new java.lang.ref.WeakReference(null);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public android.graphics.Bitmap doInBackground(defpackage.kfz... kfzVarArr) {
        return this.d.a(kfzVarArr[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(android.graphics.Bitmap bitmap) {
        android.widget.ImageView imageView = (android.widget.ImageView) this.a.get();
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    @Override // android.os.AsyncTask
    protected final void onCancelled() {
        super.onCancelled();
        this.d.b = true;
    }
}
