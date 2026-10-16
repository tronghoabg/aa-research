package V4;

import R4.e;
import U4.d;
import Y4.m;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final int f13015a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13016b;

    /* renamed from: c, reason: collision with root package name */
    public d f13017c;

    public a() {
        if (!m.g(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f13015a = Integer.MIN_VALUE;
        this.f13016b = Integer.MIN_VALUE;
    }

    public abstract void c(Drawable drawable);

    public abstract void e(Object obj);

    @Override // R4.e
    public final void a() {
    }

    @Override // R4.e
    public final void b() {
    }

    @Override // R4.e
    public final void onDestroy() {
    }

    public void d(Drawable drawable) {
    }
}
