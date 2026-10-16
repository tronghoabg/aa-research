package com.applovin.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.applovin.impl.adview.AppLovinWebViewBase;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.applovin.impl.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1644j0 extends AppLovinWebViewBase {

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f21756b;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f21757a;

    public AbstractC1644j0(Context context) throws NoSuchMethodException, SecurityException {
        super(context);
        this.f21757a = new AtomicReference();
        if (f21756b == null) {
            try {
                WebView.class.getDeclaredMethod("onTouchEvent", MotionEvent.class);
                f21756b = Boolean.TRUE;
            } catch (NoSuchMethodException unused) {
                com.applovin.impl.sdk.o.h("AppLovinSdk", "WebView.onTouchEvent() not implemented");
                f21756b = Boolean.FALSE;
            }
        }
    }

    public boolean a() {
        return this.f21757a.get() != null;
    }

    public MotionEvent getAndClearLastClickEvent() {
        return (MotionEvent) this.f21757a.getAndSet(null);
    }

    public MotionEvent getLastClickEvent() {
        return (MotionEvent) this.f21757a.get();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f21757a.set(MotionEvent.obtain(motionEvent));
        if (f21756b.booleanValue()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
