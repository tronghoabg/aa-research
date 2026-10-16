package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class mro extends ieq {
    final /* synthetic */ mrq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mro(mrq mrqVar) {
        super(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.a = mrqVar;
    }

    @Override // defpackage.iev
    public final void a(Drawable drawable) {
        this.a.b.b(null);
    }

    @Override // defpackage.iev
    public final /* bridge */ /* synthetic */ void c(Object obj, ife ifeVar) {
        Bitmap bitmap = (Bitmap) obj;
        ((ype) ((ype) mrq.a.f()).ai((char) 5227)).y("resource loaded: %s", bitmap);
        this.a.b.b(bitmap);
    }
}
