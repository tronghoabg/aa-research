package defpackage;

import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes2.dex */
public final class lkx implements tjy {
    final /* synthetic */ tjz a;

    public lkx(tjz tjzVar) {
        this.a = tjzVar;
    }

    @Override // defpackage.tjy
    public final /* synthetic */ Uri a(Object obj) {
        return ((lkv) obj).a();
    }

    @Override // defpackage.tjy
    public final /* synthetic */ IconCompat c(Uri uri) {
        return szp.y(this, uri);
    }

    @Override // defpackage.tjy
    public final /* bridge */ /* synthetic */ Object d(Uri uri) {
        return lnm.r(uri, new lfn(13));
    }

    @Override // defpackage.tjy
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final IconCompat b(lkv lkvVar) {
        lkvVar.getClass();
        boolean zW = szp.w((Uri) lkvVar.b);
        tjz tjzVar = this.a;
        return zW ? tjzVar.c.b(lkvVar) : tjzVar.d.b(lkvVar);
    }
}
