package defpackage;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class kfx extends AsyncTask {
    public final kfu d = new kfu();
    private final WeakReference a = new WeakReference(null);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap doInBackground(kfw... kfwVarArr) {
        return this.d.a(kfwVarArr[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Bitmap bitmap) {
        ImageView imageView = (ImageView) this.a.get();
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
