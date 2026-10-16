package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes2.dex */
public final class meg implements tjy {
    private final tjy a;
    private final tjy b;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, tjy] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, tjy] */
    public /* synthetic */ meg(Context context, int i) {
        juo juoVar = new juo(context, i, 7);
        this.a = new juo(context, i, 8).invoke();
        this.b = juoVar.invoke();
    }

    private static final boolean e(Uri uri) {
        String scheme = uri.getScheme();
        return scheme != null && afyh.R(scheme, "content");
    }

    @Override // defpackage.tjy
    public final /* bridge */ /* synthetic */ Uri a(Object obj) {
        mef mefVar = (mef) obj;
        Uri.Builder builder = new Uri.Builder();
        Uri uri = mefVar.a;
        if (uri != null) {
            builder.appendQueryParameter("cached", uri.toString());
        }
        String str = mefVar.b;
        if (str != null) {
            builder.appendQueryParameter("name", str);
        }
        builder.appendQueryParameter("number", mefVar.c);
        Uri uriBuild = builder.build();
        uriBuild.getClass();
        return uriBuild;
    }

    @Override // defpackage.tjy
    public final /* bridge */ /* synthetic */ IconCompat b(Object obj) {
        mef mefVar = (mef) obj;
        mefVar.getClass();
        Uri uri = mefVar.a;
        if (uri != null && e(uri)) {
            return this.b.b(uri);
        }
        String str = mefVar.c;
        Uri uriC = jxn.c().c(str);
        if (uriC != null && e(uriC)) {
            return this.b.b(uriC);
        }
        String str2 = mefVar.b;
        if (str2 != null) {
            str = str2;
        }
        return this.a.b(new men(str, str));
    }

    @Override // defpackage.tjy
    public final /* synthetic */ IconCompat c(Uri uri) {
        return szp.y(this, uri);
    }

    @Override // defpackage.tjy
    public final /* bridge */ /* synthetic */ Object d(Uri uri) {
        String queryParameter = uri.getQueryParameter("cached");
        Uri uri2 = queryParameter != null ? Uri.parse(queryParameter) : null;
        String queryParameter2 = uri.getQueryParameter("name");
        String queryParameter3 = uri.getQueryParameter("number");
        queryParameter3.getClass();
        return new mef(uri2, queryParameter2, queryParameter3);
    }
}
