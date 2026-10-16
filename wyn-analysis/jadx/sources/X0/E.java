package X0;

import android.os.Bundle;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public boolean f15787a;

    /* renamed from: b, reason: collision with root package name */
    public Object f15788b;

    /* renamed from: c, reason: collision with root package name */
    public Object f15789c;

    /* renamed from: d, reason: collision with root package name */
    public Object f15790d;

    public E(t0.y layoutNodeWrapper, Z.j modifier) {
        AbstractC3340k.e(layoutNodeWrapper, "layoutNodeWrapper");
        AbstractC3340k.e(modifier, "modifier");
        this.f15788b = layoutNodeWrapper;
        this.f15789c = modifier;
    }

    public void a(Bundle bundle) {
        if (this.f15787a) {
            bundle.putCharSequence("android.summaryText", (CharSequence) this.f15790d);
        }
        CharSequence charSequence = (CharSequence) this.f15789c;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String strC = c();
        if (strC != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
        }
    }

    public abstract void b(N2.j jVar);

    public String c() {
        return null;
    }

    public void g() {
        this.f15787a = true;
    }

    public void h() {
        this.f15787a = false;
    }

    public void i(Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.f15790d = bundle.getCharSequence("android.summaryText");
            this.f15787a = true;
        }
        this.f15789c = bundle.getCharSequence("android.title.big");
    }

    public E() {
        this.f15787a = false;
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }
}
