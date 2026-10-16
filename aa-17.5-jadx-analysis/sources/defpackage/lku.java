package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes2.dex */
public final class lku implements tjy {
    public final tjy a;
    final /* synthetic */ tjz b;
    private final tka c;

    public lku(tjz tjzVar, Context context, tjy tjyVar) {
        this.b = tjzVar;
        this.a = tjyVar;
        int i = tjzVar.a;
        Integer num = tjzVar.b;
        this.c = new tka(context, tjyVar, i, num != null ? num.intValue() : 0);
    }

    @Override // defpackage.tjy
    public final /* synthetic */ Uri a(Object obj) {
        return ((lkv) obj).a();
    }

    @Override // defpackage.tjy
    public final /* bridge */ /* synthetic */ IconCompat b(Object obj) {
        lkv lkvVar = (lkv) obj;
        lkvVar.getClass();
        return lkvVar.a ? this.c.b(lkvVar.b) : this.a.b(lkvVar.b);
    }

    @Override // defpackage.tjy
    public final /* synthetic */ IconCompat c(Uri uri) {
        return szp.y(this, uri);
    }

    @Override // defpackage.tjy
    public final /* bridge */ /* synthetic */ Object d(Uri uri) {
        return lnm.r(uri, new kut(this, 19));
    }
}
