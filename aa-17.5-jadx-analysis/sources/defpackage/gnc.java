package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* loaded from: classes2.dex */
final class gnc implements huv {
    private final Uri a;
    private final int b;
    private final Context c;

    public gnc(Context context, Uri uri, int i) {
        this.a = uri;
        this.b = i;
        this.c = context;
    }

    @Override // defpackage.huv
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.huv
    public final void d(hsh hshVar, huu huuVar) {
        Uri uri = this.a;
        Context context = this.c;
        String queryParameter = uri.getQueryParameter("lookupKey");
        String queryParameter2 = uri.getQueryParameter("name");
        gnb gnbVar = new gnb(context.getResources());
        gnbVar.b(queryParameter2, queryParameter);
        Bitmap bitmapA = gnbVar.a(this.b);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapA.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
        huuVar.f(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
    }

    @Override // defpackage.huv
    public final int e() {
        return 1;
    }

    @Override // defpackage.huv
    public final void b() {
    }

    @Override // defpackage.huv
    public final void c() {
    }
}
