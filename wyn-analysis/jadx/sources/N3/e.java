package n3;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1451o;
import androidx.lifecycle.EnumC1450n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.V;
import java.util.Map;
import s.C3984d;
import s.C3986f;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f40910a;

    /* renamed from: b, reason: collision with root package name */
    public final C3592d f40911b = new C3592d();

    /* renamed from: c, reason: collision with root package name */
    public boolean f40912c;

    public e(f fVar) {
        this.f40910a = fVar;
    }

    public final void a() {
        f fVar = this.f40910a;
        AbstractC1451o lifecycle = fVar.getLifecycle();
        if (lifecycle.b() != EnumC1450n.f18677b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new C3589a(fVar, 0));
        C3592d c3592d = this.f40911b;
        if (c3592d.f40905b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new V(c3592d, 1));
        c3592d.f40905b = true;
        this.f40912c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f40912c) {
            a();
        }
        AbstractC1451o lifecycle = this.f40910a.getLifecycle();
        if (lifecycle.b().compareTo(EnumC1450n.f18679d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
        }
        C3592d c3592d = this.f40911b;
        if (!c3592d.f40905b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c3592d.f40907d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c3592d.f40906c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c3592d.f40907d = true;
    }

    public final void c(Bundle bundle) {
        C3592d c3592d = this.f40911b;
        c3592d.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = c3592d.f40906c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C3986f c3986f = c3592d.f40904a;
        c3986f.getClass();
        C3984d c3984d = new C3984d(c3986f);
        c3986f.f44823c.put(c3984d, Boolean.FALSE);
        while (c3984d.hasNext()) {
            Map.Entry entry = (Map.Entry) c3984d.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC3591c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
