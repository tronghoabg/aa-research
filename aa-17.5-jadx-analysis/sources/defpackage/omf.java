package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.android.apps.auto.components.ui.image.CrossfadeImageView;

/* loaded from: classes2.dex */
public final class omf extends iey {
    public boolean b;
    final /* synthetic */ CrossfadeImageView c;
    private Bitmap d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omf(CrossfadeImageView crossfadeImageView) {
        super(crossfadeImageView);
        this.c = crossfadeImageView;
    }

    @Override // defpackage.ieo, defpackage.iev
    public final void b(Drawable drawable) {
        this.c.c(null);
    }

    @Override // defpackage.iev
    public final /* bridge */ /* synthetic */ void c(Object obj, ife ifeVar) {
        Bitmap bitmap = (Bitmap) obj;
        this.d = bitmap.copy(bitmap.getConfig(), false);
        i();
    }

    public final void i() {
        Bitmap bitmap;
        if (this.b || (bitmap = this.d) == null) {
            return;
        }
        this.c.c(bitmap);
    }
}
