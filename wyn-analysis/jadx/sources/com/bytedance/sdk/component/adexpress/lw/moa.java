package com.bytedance.sdk.component.adexpress.lw;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.uef.dhk;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class moa {
    private WeakReference<dhk> uef;

    public moa(dhk dhkVar) {
        this.uef = new WeakReference<>(dhkVar);
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        WeakReference<dhk> weakReference = this.uef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.uef.get().invokeMethod(str);
    }

    public void uef(dhk dhkVar) {
        this.uef = new WeakReference<>(dhkVar);
    }
}
