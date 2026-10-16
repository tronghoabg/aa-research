package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public final class usr implements usq {
    public final uvy a;
    private final Bitmap b;

    public usr(Bitmap bitmap) {
        this.b = bitmap;
        this.a = bitmap != null ? new uvy(bitmap.getWidth(), bitmap.getHeight()) : new uvy(0, 0);
    }

    @Override // defpackage.usq
    public final Bitmap a() {
        return this.b;
    }

    @Override // defpackage.utd
    public final boolean b() {
        return true;
    }
}
