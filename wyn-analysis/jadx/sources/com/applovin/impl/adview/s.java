package com.applovin.impl.adview;

import android.view.KeyEvent;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21104a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f21105b;

    public /* synthetic */ s(KeyEvent.Callback callback, int i5) {
        this.f21104a = i5;
        this.f21105b = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21104a) {
            case 0:
                ((f) this.f21105b).e();
                break;
            case 1:
                ((f) this.f21105b).f();
                break;
            default:
                a.a((WebView) this.f21105b);
                break;
        }
    }
}
