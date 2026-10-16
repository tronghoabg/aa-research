package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public final V f18756a;

    /* renamed from: b, reason: collision with root package name */
    public int f18757b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f18758c = new Rect();

    public B(V v2) {
        this.f18756a = v2;
    }

    public static B a(V v2, int i5) {
        if (i5 == 0) {
            return new A(v2, 0);
        }
        if (i5 == 1) {
            return new A(v2, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i5);
}
