package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class neb extends ieq {
    final /* synthetic */ nec a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public neb(nec necVar) {
        super(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.a = necVar;
    }

    @Override // defpackage.iev
    public final void a(Drawable drawable) {
        this.a.m(null);
    }

    @Override // defpackage.ieq, defpackage.iev
    public final void b(Drawable drawable) {
        this.a.m(null);
    }

    @Override // defpackage.iev
    public final /* bridge */ /* synthetic */ void c(Object obj, ife ifeVar) {
        Bitmap bitmapCopy = (Bitmap) obj;
        Bitmap.Config config = bitmapCopy.getConfig();
        nec necVar = this.a;
        if (necVar.j && aclu.d() && config != null) {
            bitmapCopy = bitmapCopy.copy(config, bitmapCopy.isMutable());
        }
        necVar.m(bitmapCopy);
    }
}
