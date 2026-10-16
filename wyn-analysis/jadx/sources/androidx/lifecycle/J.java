package androidx.lifecycle;

import ac.C1346a;
import android.os.Handler;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class J implements InterfaceC1457v {

    /* renamed from: i, reason: collision with root package name */
    public static final J f18589i = new J();

    /* renamed from: a, reason: collision with root package name */
    public int f18590a;

    /* renamed from: b, reason: collision with root package name */
    public int f18591b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f18594e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18592c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18593d = true;

    /* renamed from: f, reason: collision with root package name */
    public final C1459x f18595f = new C1459x(this);

    /* renamed from: g, reason: collision with root package name */
    public final C8.g f18596g = new C8.g(this, 28);

    /* renamed from: h, reason: collision with root package name */
    public final C1346a f18597h = new C1346a(this, 1);

    public final void a() {
        int i5 = this.f18591b + 1;
        this.f18591b = i5;
        if (i5 == 1) {
            if (this.f18592c) {
                this.f18595f.f(EnumC1449m.ON_RESUME);
                this.f18592c = false;
            } else {
                Handler handler = this.f18594e;
                AbstractC3340k.b(handler);
                handler.removeCallbacks(this.f18596g);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC1457v
    public final AbstractC1451o getLifecycle() {
        return this.f18595f;
    }
}
