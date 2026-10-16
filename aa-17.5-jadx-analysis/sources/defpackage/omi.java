package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
final class omi extends ieq {
    final /* synthetic */ omm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omi(omm ommVar) {
        super(128, 128);
        this.a = ommVar;
    }

    @Override // defpackage.iev
    public final void a(Drawable drawable) {
        int i = omm.h;
        omm ommVar = this.a;
        ommVar.k = false;
        tfk.a.d(ommVar.b, 3);
    }

    @Override // defpackage.ieq, defpackage.iev
    public final void b(Drawable drawable) {
        int i = omm.h;
        omm ommVar = this.a;
        ommVar.k = false;
        tfk.a.d(ommVar.b, 2);
    }

    @Override // defpackage.iev
    public final /* bridge */ /* synthetic */ void c(Object obj, ife ifeVar) {
        Bitmap bitmap = (Bitmap) obj;
        int i = omm.h;
        bitmap.getAllocationByteCount();
        bitmap.getWidth();
        bitmap.getHeight();
        omm ommVar = this.a;
        ommVar.k = false;
        ommVar.d = bitmap;
        tfk.a.d(ommVar.b, 1);
        ommVar.c.a(bitmap);
    }
}
