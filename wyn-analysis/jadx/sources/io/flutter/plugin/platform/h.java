package io.flutter.plugin.platform;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import kd.C3293D;
import pc.C3791a;

/* loaded from: classes5.dex */
public final class h implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37095a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View.OnFocusChangeListener f37096b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f37097c;

    public h(View.OnFocusChangeListener onFocusChangeListener, C3791a c3791a) {
        this.f37096b = onFocusChangeListener;
        this.f37097c = c3791a;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.f37095a) {
            case 0:
                i iVar = (i) this.f37097c;
                this.f37096b.onFocusChange(iVar, S3.f.P(iVar, new C3293D(26)));
                break;
            default:
                C3791a c3791a = (C3791a) this.f37097c;
                this.f37096b.onFocusChange(c3791a, S3.f.P(c3791a, new C3293D(26)));
                break;
        }
    }

    public h(i iVar, View.OnFocusChangeListener onFocusChangeListener) {
        this.f37097c = iVar;
        this.f37096b = onFocusChangeListener;
    }
}
