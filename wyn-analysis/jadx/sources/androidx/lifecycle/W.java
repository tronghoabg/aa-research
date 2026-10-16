package androidx.lifecycle;

import android.os.Bundle;
import ef.C2532p;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import n3.C3592d;
import n3.InterfaceC3591c;

/* loaded from: classes.dex */
public final class W implements InterfaceC3591c {

    /* renamed from: a, reason: collision with root package name */
    public final C3592d f18639a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18640b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f18641c;

    /* renamed from: d, reason: collision with root package name */
    public final C2532p f18642d;

    public W(C3592d savedStateRegistry, f0 f0Var) {
        AbstractC3340k.e(savedStateRegistry, "savedStateRegistry");
        this.f18639a = savedStateRegistry;
        this.f18642d = Fe.c.z(new A0.p(f0Var, 17));
    }

    @Override // n3.InterfaceC3591c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f18641c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((X) this.f18642d.getValue()).f18643b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((T) entry.getValue()).f18632e.a();
            if (!AbstractC3340k.a(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.f18640b = false;
        return bundle;
    }

    public final void b() {
        if (this.f18640b) {
            return;
        }
        Bundle bundleA = this.f18639a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f18641c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleA != null) {
            bundle.putAll(bundleA);
        }
        this.f18641c = bundle;
        this.f18640b = true;
    }
}
