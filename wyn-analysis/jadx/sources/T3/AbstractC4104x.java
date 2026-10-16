package t3;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import q.c1;

/* renamed from: t3.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4104x {

    /* renamed from: a, reason: collision with root package name */
    public static final y f45735a;

    /* renamed from: b, reason: collision with root package name */
    public static final c1 f45736b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f45735a = new z();
        } else {
            f45735a = new y();
        }
        f45736b = new c1(6, "translationAlpha", Float.class);
        new c1(7, "clipBounds", Rect.class);
    }

    public static void a(View view, int i5, int i10, int i11, int i12) {
        f45735a.Q(view, i5, i10, i11, i12);
    }
}
