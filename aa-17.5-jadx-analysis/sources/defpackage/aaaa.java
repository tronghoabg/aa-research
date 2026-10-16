package defpackage;

import android.graphics.Bitmap;
import android.view.View;

/* loaded from: classes3.dex */
final class aaaa {
    public Bitmap a;
    public aaao b;
    public final gjt c;
    private final View d;

    public aaaa(View view, gjt gjtVar) {
        this.d = view;
        this.c = gjtVar;
    }

    static /* synthetic */ void b(boolean z) {
        if (z) {
            zrn.d("Map gestures", " are not supported in Lite Mode");
        }
    }

    final void a(Bitmap bitmap, aaao aaaoVar) {
        this.a = bitmap;
        this.b = aaaoVar;
        this.d.postInvalidate();
    }
}
