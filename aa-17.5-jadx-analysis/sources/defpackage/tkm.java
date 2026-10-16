package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.libraries.auto.template.icons.proxy.ProxyContentProvider;
import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class tkm implements tjy {
    public static final tkk a = new tkk();
    public static final yob b = yob.c("com/google/android/libraries/auto/template/icons/proxy/RegistrarIconFactory");
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    private final Context d;

    public tkm(Context context) {
        this.d = context;
    }

    @Override // defpackage.tjy
    public final /* bridge */ /* synthetic */ IconCompat b(Object obj) {
        tkl tklVar = (tkl) obj;
        tklVar.getClass();
        String str = tklVar.a;
        Object obj2 = this.c.get(str);
        if (obj2 == null) {
            throw new IllegalStateException("Could not find delegate for id ".concat(str));
        }
        return ((tjy) obj2).c(tklVar.b);
    }

    @Override // defpackage.tjy
    public final /* synthetic */ IconCompat c(Uri uri) {
        return szp.y(this, uri);
    }

    @Override // defpackage.tjy
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Uri a(tkl tklVar) {
        Uri.Builder builderScheme = new Uri.Builder().scheme("content");
        yob yobVar = ProxyContentProvider.a;
        Uri uriBuild = builderScheme.authority(String.valueOf(this.d.getPackageName()).concat(".icons")).appendPath(tklVar.a).appendPath(tklVar.b.toString()).build();
        uriBuild.getClass();
        return uriBuild;
    }

    @Override // defpackage.tjy
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final tkl d(Uri uri) {
        String str = uri.getPathSegments().get(0);
        Uri uri2 = Uri.parse(uri.getPathSegments().get(1));
        str.getClass();
        uri2.getClass();
        return new tkl(str, uri2);
    }
}
