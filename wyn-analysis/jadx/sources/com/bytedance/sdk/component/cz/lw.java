package com.bytedance.sdk.component.cz;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.cz.ivm;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class lw extends WebView {
    private yo ivm;
    private boolean lw;
    private boolean moa;

    /* renamed from: oa, reason: collision with root package name */
    private final HashSet<String> f24976oa;
    public long uef;
    private boolean yo;

    public lw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24976oa = new HashSet<>();
        this.uef = System.currentTimeMillis();
        oa();
    }

    private void oa() {
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setDisplayZoomControls(false);
        settings.setBuiltInZoomControls(false);
        settings.setSupportMultipleWindows(false);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        setWebViewClient(new ivm.uef());
    }

    @Override // android.webkit.WebView
    public void addJavascriptInterface(Object obj, String str) {
        toString();
        if (this.yo || this.lw) {
            return;
        }
        super.addJavascriptInterface(obj, str);
        this.f24976oa.add(str);
    }

    @Override // android.webkit.WebView
    public void clearCache(boolean z2) {
        if (this.yo || this.lw) {
            return;
        }
        super.clearCache(z2);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        toString();
        if (this.yo) {
            return;
        }
        this.yo = true;
        uef();
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
        super.destroy();
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!this.yo && !this.lw) {
            super.evaluateJavascript(str, valueCallback);
        } else if (valueCallback != null) {
            valueCallback.onReceiveValue("");
        }
    }

    @Override // android.webkit.WebView
    public void goBack() {
        if (this.yo || this.lw) {
            return;
        }
        super.goBack();
    }

    @Override // android.webkit.WebView
    public void goBackOrForward(int i5) {
        if (this.yo || this.lw) {
            return;
        }
        super.goBackOrForward(i5);
    }

    @Override // android.webkit.WebView
    public void goForward() {
        if (this.yo || this.lw) {
            return;
        }
        super.goForward();
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (this.yo || this.lw) {
            return;
        }
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (this.yo || this.lw) {
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError unused) {
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        toString();
        if (this.moa) {
            destroy();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.yo || this.lw) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public void onMeasure(int i5, int i10) {
        if (this.yo || this.lw) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i5, i10);
        }
    }

    @Override // android.webkit.WebView
    public void onPause() {
        if (this.yo || this.lw) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void onResume() {
        if (this.yo || this.lw) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void pauseTimers() {
        if (this.yo || this.lw) {
            return;
        }
        super.pauseTimers();
    }

    @Override // android.webkit.WebView
    public void reload() {
        if (this.yo || this.lw) {
            return;
        }
        super.reload();
    }

    @Override // android.webkit.WebView
    public void removeJavascriptInterface(String str) {
        if (this.yo || this.lw) {
            return;
        }
        super.removeJavascriptInterface(str);
        this.f24976oa.remove(str);
    }

    @Override // android.webkit.WebView
    public void resumeTimers() {
        if (this.yo || this.lw) {
            return;
        }
        super.resumeTimers();
    }

    public void setDestroyOnDetached(boolean z2) {
        this.moa = z2;
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        yo yoVar = this.ivm;
        if (yoVar == null) {
            super.setOnTouchListener(onTouchListener);
        } else {
            yoVar.uef(onTouchListener);
            super.setOnTouchListener(this.ivm);
        }
    }

    public void setRecycler(boolean z2) {
        this.lw = z2;
    }

    public void setTouchListenerProxy(yo yoVar) {
        this.ivm = yoVar;
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (this.yo || this.lw) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception unused) {
        }
    }

    public void uef() {
        if (this.yo) {
            return;
        }
        setOnClickListener(null);
        setOnTouchListener(null);
        setOnScrollChangeListener(null);
        Iterator<String> it = this.f24976oa.iterator();
        while (it.hasNext()) {
            super.removeJavascriptInterface(it.next());
        }
        this.f24976oa.clear();
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (this.yo || this.lw) {
            return;
        }
        try {
            super.loadUrl(str, map);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError unused) {
        }
    }

    public lw(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f24976oa = new HashSet<>();
        this.uef = System.currentTimeMillis();
        oa();
    }
}
