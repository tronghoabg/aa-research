package defpackage;

import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;
import java.net.URL;

/* loaded from: classes3.dex */
public final class tkg implements tjy {
    private final afec a;

    public tkg(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.tjy
    public final /* bridge */ /* synthetic */ Uri a(Object obj) {
        Uri uri = Uri.parse(((URL) obj).toString());
        uri.getClass();
        return uri;
    }

    @Override // defpackage.tjy
    public final /* synthetic */ IconCompat c(Uri uri) {
        return szp.y(this, uri);
    }

    @Override // defpackage.tjy
    public final /* bridge */ /* synthetic */ Object d(Uri uri) {
        return new URL(uri.toString());
    }

    @Override // defpackage.tjy
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final IconCompat b(URL url) {
        url.getClass();
        return IconCompat.k(BitmapFactory.decodeStream((InputStream) this.a.invoke(url)));
    }
}
