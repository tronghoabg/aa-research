package defpackage;

import android.graphics.Rect;

/* loaded from: classes2.dex */
final class feu extends ffx {
    final /* synthetic */ Rect a;

    public feu(Rect rect) {
        this.a = rect;
    }

    @Override // defpackage.ffx
    public final Rect a() {
        Rect rect = this.a;
        if (rect.isEmpty()) {
            return null;
        }
        return rect;
    }
}
