package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    private static final PorterDuff.Mode f1048a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    private static ae f1049b;

    /* renamed from: c, reason: collision with root package name */
    private fj f1050c;

    public static synchronized PorterDuffColorFilter c(int i2, PorterDuff.Mode mode) {
        return fj.b(i2, mode);
    }

    public static synchronized ae e() {
        if (f1049b == null) {
            g();
        }
        return f1049b;
    }

    public static synchronized void g() {
        if (f1049b == null) {
            ae aeVar = new ae();
            f1049b = aeVar;
            aeVar.f1050c = fj.e();
            f1049b.f1050c.g(new ad());
        }
    }

    final synchronized ColorStateList a(Context context, int i2) {
        return this.f1050c.a(context, i2);
    }

    public final synchronized Drawable d(Context context, int i2) {
        return this.f1050c.c(context, i2);
    }

    public final synchronized void f(Context context) {
        this.f1050c.f(context);
    }

    final synchronized Drawable h(Context context, int i2) {
        return this.f1050c.d(context, i2, true);
    }
}
