package com.waze.app_nav.hub.service;

import android.os.Bundle;
import android.support.v4.app.ar;
import android.view.View;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.LifecycleOwner;
import h.g.b.x;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class d extends ar {

    /* renamed from: a, reason: collision with root package name */
    private final bn f15378a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f15379b;

    public d() {
        this.f15378a = ck.b(true);
        this.f15379b = h.g.a(new com.waze.ads.b(this, 8));
    }

    protected final long a() {
        return ((Number) this.f15379b.getValue()).longValue();
    }

    public void c() {
    }

    @Override // android.support.v4.app.ar
    public void onViewCreated(View view, Bundle bundle) {
        x.f(view, "view");
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, new c(this));
        com.waze.shared_infra.g.e.c(view);
    }

    public d(int i2) {
        super(i2);
        this.f15378a = ck.b(true);
        this.f15379b = h.g.a(new com.waze.ads.b(this, 8));
    }
}
