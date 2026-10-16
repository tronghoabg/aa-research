package androidx.fragment.app;

import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public abstract class z0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f18571a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18572b;

    public boolean a() {
        return this instanceof C1419h;
    }

    public abstract void b(ViewGroup viewGroup);

    public abstract void c(ViewGroup viewGroup);

    public void d(androidx.activity.b backEvent, ViewGroup container) {
        AbstractC3340k.e(backEvent, "backEvent");
        AbstractC3340k.e(container, "container");
    }

    public void e(ViewGroup container) {
        AbstractC3340k.e(container, "container");
    }
}
