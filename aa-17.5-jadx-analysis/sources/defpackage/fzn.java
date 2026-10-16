package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class fzn implements iej {
    final /* synthetic */ bwq a;

    public fzn(bwq bwqVar) {
        this.a = bwqVar;
    }

    @Override // defpackage.iej
    public final boolean fh(hwt hwtVar, Object obj, iev ievVar) {
        return false;
    }

    @Override // defpackage.iej
    public final /* bridge */ /* synthetic */ boolean fi(Object obj, Object obj2, iev ievVar, int i) {
        ievVar.getClass();
        if (!(((Drawable) obj) instanceof BitmapDrawable)) {
            return false;
        }
        this.a.b(null);
        return false;
    }
}
