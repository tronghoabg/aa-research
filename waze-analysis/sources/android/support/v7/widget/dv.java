package android.support.v7.widget;

import android.graphics.Rect;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class dv {

    /* renamed from: a, reason: collision with root package name */
    protected final en f1376a;

    /* renamed from: c, reason: collision with root package name */
    private int f1378c = Integer.MIN_VALUE;

    /* renamed from: b, reason: collision with root package name */
    final Rect f1377b = new Rect();

    /* synthetic */ dv(en enVar) {
        this.f1376a = enVar;
    }

    public static dv p(en enVar, int i2) {
        return i2 != 0 ? new du(enVar) : new dt(enVar);
    }

    public abstract int a(View view);

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l(View view);

    public abstract int m(View view);

    public abstract void n(int i2);

    public final int o() {
        if (this.f1378c == Integer.MIN_VALUE) {
            return 0;
        }
        return k() - this.f1378c;
    }

    public final void q() {
        this.f1378c = k();
    }
}
