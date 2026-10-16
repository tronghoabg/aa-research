package com.waze.settings;

import android.os.Bundle;
import android.view.View;
import androidx.activity.contextaware.ContextAware;
import androidx.core.view.KeyEventDispatcher;
import androidx.lifecycle.FlowLiveDataConversions;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class SettingsNavHostFragment extends gz implements ce, org.a.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f36695a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f36696b;

    public SettingsNavHostFragment() {
        SettingsNavHostFragment settingsNavHostFragment = this;
        this.f36695a = org.a.b.b.d.a(settingsNavHostFragment);
        this.f36696b = h.g.b(h.h.f48132c, new az(settingsNavHostFragment, new z(settingsNavHostFragment, 4), 2));
    }

    private final gy b() {
        return (gy) this.f36696b.getValue();
    }

    @Override // com.waze.settings.ce
    public final cs a() {
        ContextAware parentFragment = getParentFragment();
        ce ceVar = parentFragment instanceof ce ? (ce) parentFragment : null;
        if (ceVar == null) {
            KeyEventDispatcher.Component activity = getActivity();
            ce ceVar2 = activity instanceof ce ? (ce) activity : null;
            if (ceVar2 == null) {
                throw new RuntimeException("invalid settings host");
            }
            ceVar = ceVar2;
        }
        return ceVar.a();
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f36695a.getValue();
    }

    @Override // org.a.a.b.a
    public final /* synthetic */ void m() {
    }

    @Override // android.support.v4.app.ar
    public final void onResume() {
        super.onResume();
        b().k();
    }

    @Override // androidx.navigation.fragment.NavHostFragment, android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        h.g.b.x.f(view, "view");
        super.onViewCreated(view, bundle);
        FlowLiveDataConversions.asLiveData$default(b().g(), (h.c.j) null, 0L, 3, (Object) null).observe(getViewLifecycleOwner(), new aw(new com.waze.config.cv(this, 9), 2, (char[]) null));
    }
}
