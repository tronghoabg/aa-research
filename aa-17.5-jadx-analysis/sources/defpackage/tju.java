package defpackage;

import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes3.dex */
public abstract class tju implements tjy {
    public final tjy a;

    public tju(tjy tjyVar) {
        this.a = tjyVar;
    }

    @Override // defpackage.tjy
    public final Uri a(Object obj) {
        return this.a.a(obj);
    }

    @Override // defpackage.tjy
    public final /* synthetic */ IconCompat c(Uri uri) {
        return szp.y(this, uri);
    }

    @Override // defpackage.tjy
    public final Object d(Uri uri) {
        return this.a.d(uri);
    }
}
