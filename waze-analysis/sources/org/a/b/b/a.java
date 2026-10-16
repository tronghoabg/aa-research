package org.a.b.b;

import androidx.activity.ComponentActivity;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class a implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ComponentActivity f56355a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f56356b;

    public a(ComponentActivity componentActivity, int i2) {
        this.f56356b = i2;
        this.f56355a = componentActivity;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f56356b;
        if (i2 == 0) {
            return this.f56355a.getViewModelStore();
        }
        ComponentActivity componentActivity = this.f56355a;
        return i2 != 1 ? componentActivity.getDefaultViewModelCreationExtras() : componentActivity.getDefaultViewModelProviderFactory();
    }
}
