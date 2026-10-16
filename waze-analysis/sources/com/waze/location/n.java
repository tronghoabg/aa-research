package com.waze.location;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class n extends com.waze.app_nav.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f25411a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f25412b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f25413c;

    public n() {
        n nVar = this;
        h.h hVar = h.h.f48130a;
        this.f25411a = h.g.b(hVar, new m(nVar, 1));
        this.f25412b = h.g.b(hVar, new m(nVar, 0));
        this.f25413c = h.g.b(hVar, new m(nVar, 2));
        h.g.b.x.e(registerForActivityResult(new ActivityResultContracts.StartIntentSenderForResult(), new ActivityResultCallback() { // from class: com.waze.location.k
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                h.g.b.x.f((ActivityResult) obj, "it");
                this.f25405a.f(null);
            }
        }), "registerForActivityResult(...)");
    }

    public static final /* synthetic */ q c(n nVar) {
        return (q) nVar.f25413c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(com.google.android.gms.common.api.y yVar) {
        ((b) this.f25411a.getValue()).b(yVar);
        ((com.waze.app_nav.w) this.f25412b.getValue()).c();
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.g.b.x.f(layoutInflater, "inflater");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        h.g.b.x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new l(this, (h.c.e) null, 0), 3);
        return new View(viewGroup != null ? viewGroup.getContext() : null);
    }
}
