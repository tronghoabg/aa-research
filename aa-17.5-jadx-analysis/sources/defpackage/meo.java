package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes2.dex */
public final class meo implements tjy {
    private final Context a;
    private final int b;

    public meo(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    @Override // defpackage.tjy
    public final /* bridge */ /* synthetic */ Uri a(Object obj) {
        men menVar = (men) obj;
        Uri uriBuild = new Uri.Builder().appendPath(menVar.a).appendPath(menVar.b).build();
        uriBuild.getClass();
        return uriBuild;
    }

    @Override // defpackage.tjy
    public final /* bridge */ /* synthetic */ IconCompat b(Object obj) {
        men menVar = (men) obj;
        menVar.getClass();
        gnb gnbVar = new gnb(this.a.getResources());
        gnbVar.b(menVar.a, menVar.b);
        gnbVar.c();
        return IconCompat.k(gnbVar.a(this.b));
    }

    @Override // defpackage.tjy
    public final /* synthetic */ IconCompat c(Uri uri) {
        return szp.y(this, uri);
    }

    @Override // defpackage.tjy
    public final /* bridge */ /* synthetic */ Object d(Uri uri) {
        String str = uri.getPathSegments().get(0);
        str.getClass();
        String str2 = uri.getPathSegments().get(1);
        str2.getClass();
        return new men(str, str2);
    }
}
