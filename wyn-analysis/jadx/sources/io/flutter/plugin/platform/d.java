package io.flutter.plugin.platform;

import E5.RunnableC0443c;
import android.view.View;

/* loaded from: classes5.dex */
public final class d implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f37093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N2.j f37094b;

    public d(N2.j jVar, View view) {
        this.f37094b = jVar;
        this.f37093a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i5) {
        this.f37093a.post(new RunnableC0443c(this, i5, 8));
    }
}
