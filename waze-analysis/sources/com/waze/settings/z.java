package com.waze.settings;

import android.content.ComponentCallbacks;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class z implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f37680a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f37681b;

    public z(Object obj, int i2) {
        this.f37681b = i2;
        this.f37680a = obj;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f37681b;
        if (i2 == 0) {
            Object obj = this.f37680a;
            ComponentActivity componentActivity = (ComponentActivity) obj;
            ViewModelStore viewModelStore = componentActivity.getViewModelStore();
            CreationExtras defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
            org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d((ComponentCallbacks) obj);
            int i3 = h.g.b.ar.f48106a;
            return org.a.b.c.a.a(new h.g.b.m(ae.class), viewModelStore, defaultViewModelCreationExtras, bVarD, null);
        }
        if (i2 != 1) {
            if (i2 == 2) {
                return (ViewModelStoreOwner) this.f37680a;
            }
            if (i2 == 3) {
                return (ViewModelStoreOwner) this.f37680a;
            }
            Object obj2 = this.f37680a;
            return i2 != 4 ? (ViewModelStoreOwner) obj2 : (ViewModelStoreOwner) obj2;
        }
        Object obj3 = this.f37680a;
        ComponentActivity componentActivity2 = (ComponentActivity) obj3;
        ViewModelStore viewModelStore2 = componentActivity2.getViewModelStore();
        CreationExtras defaultViewModelCreationExtras2 = componentActivity2.getDefaultViewModelCreationExtras();
        org.a.d.k.b bVarD2 = org.chromium.support_lib_boundary.a.b.d((ComponentCallbacks) obj3);
        int i4 = h.g.b.ar.f48106a;
        return org.a.b.c.a.a(new h.g.b.m(x.class), viewModelStore2, defaultViewModelCreationExtras2, bVarD2, null);
    }
}
