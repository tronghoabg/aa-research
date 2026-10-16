package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public final class uss implements usq {
    private Bitmap a;

    public uss(Bitmap bitmap) {
        this.a = bitmap;
        bitmap.getWidth();
        bitmap.getHeight();
    }

    @Override // defpackage.usq
    public final Bitmap a() {
        Bitmap bitmap = this.a;
        this.a = null;
        return bitmap;
    }

    @Override // defpackage.utd
    public final boolean b() {
        return this.a != null;
    }
}
