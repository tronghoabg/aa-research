package defpackage;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import java.io.ByteArrayOutputStream;

/* loaded from: classes2.dex */
final class lmz extends AsyncTask {
    byte[] a;
    final /* synthetic */ lna b;
    private final int c;
    private final ByteArrayOutputStream d = new ByteArrayOutputStream();

    public lmz(lna lnaVar, int i) {
        this.b = lnaVar;
        this.c = i;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Bitmap bitmap = ((Bitmap[]) objArr)[0];
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = this.d;
        bitmap.compress(Bitmap.CompressFormat.PNG, 20, byteArrayOutputStream);
        this.a = byteArrayOutputStream.toByteArray();
        return null;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (isCancelled()) {
            return;
        }
        int i = this.c;
        lna lnaVar = this.b;
        if (i != lnaVar.a) {
            return;
        }
        lnaVar.i.p(lnaVar.b, lnaVar.c, lnaVar.d, this.a, lnaVar.e);
    }
}
