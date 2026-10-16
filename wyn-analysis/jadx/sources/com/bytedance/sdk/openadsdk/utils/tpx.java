package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class tpx {
    private static int uef;

    /* renamed from: oa, reason: collision with root package name */
    private static final LinkedHashMap<String, SoftReference<uef>> f26165oa = new LinkedHashMap<String, SoftReference<uef>>(uef, 0.75f, true) { // from class: com.bytedance.sdk.openadsdk.utils.tpx.1
        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, SoftReference<uef>> entry) {
            uef uefVar;
            com.bytedance.sdk.component.cz.ivm ivmVar;
            if (size() <= tpx.uef) {
                return false;
            }
            SoftReference<uef> value = entry.getValue();
            if (value == null || (uefVar = value.get()) == null || (ivmVar = uefVar.uef) == null) {
                return true;
            }
            try {
                com.bytedance.sdk.component.utils.pz.uef(ivmVar);
                return true;
            } catch (Throwable unused) {
                entry.getKey();
                return true;
            }
        }
    };

    public static class uef {

        /* renamed from: oa, reason: collision with root package name */
        Bundle f26166oa;
        com.bytedance.sdk.component.cz.ivm uef;

        public uef(com.bytedance.sdk.component.cz.ivm ivmVar, Bundle bundle) {
            this.uef = ivmVar;
            this.f26166oa = bundle;
        }
    }

    private static void oa() {
        uef uefVar;
        com.bytedance.sdk.component.cz.ivm ivmVar;
        synchronized (f26165oa) {
            while (true) {
                LinkedHashMap<String, SoftReference<uef>> linkedHashMap = f26165oa;
                if (linkedHashMap.size() > uef) {
                    SoftReference<uef> softReferenceRemove = linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
                    if (softReferenceRemove != null && (uefVar = softReferenceRemove.get()) != null && (ivmVar = uefVar.uef) != null) {
                        try {
                            com.bytedance.sdk.component.utils.pz.uef(ivmVar);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    public static void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        if (gzwVar == null) {
            uef = 0;
        } else {
            uef = Math.max(0, gzwVar.xs());
        }
        oa();
    }

    public static void uef(String str, com.bytedance.sdk.component.cz.ivm ivmVar, Bundle bundle) {
        if (uef <= 0 || TextUtils.isEmpty(str) || ivmVar == null) {
            return;
        }
        LinkedHashMap<String, SoftReference<uef>> linkedHashMap = f26165oa;
        synchronized (linkedHashMap) {
            try {
                uef(ivmVar.getWebView());
                uef(ivmVar, ivmVar.getContext());
                synchronized (linkedHashMap) {
                    linkedHashMap.put(str, new SoftReference<>(new uef(ivmVar, bundle)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        linkedHashMap.size();
    }

    public static com.bytedance.sdk.component.cz.ivm uef(Context context, String str) {
        com.bytedance.sdk.component.cz.ivm ivmVar;
        if (uef <= 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        LinkedHashMap<String, SoftReference<uef>> linkedHashMap = f26165oa;
        synchronized (linkedHashMap) {
            try {
                SoftReference<uef> softReferenceRemove = linkedHashMap.remove(str);
                if (softReferenceRemove == null) {
                    return null;
                }
                uef uefVar = softReferenceRemove.get();
                if (uefVar != null && (ivmVar = uefVar.uef) != null) {
                    uef(ivmVar, context);
                    return uefVar.uef;
                }
                return null;
            } finally {
            }
        }
    }

    public static Bundle uef(String str) {
        if (uef <= 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        LinkedHashMap<String, SoftReference<uef>> linkedHashMap = f26165oa;
        synchronized (linkedHashMap) {
            try {
                SoftReference<uef> softReference = linkedHashMap.get(str);
                if (softReference == null) {
                    return null;
                }
                uef uefVar = softReference.get();
                return uefVar != null ? uefVar.f26166oa : null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void uef(com.bytedance.sdk.component.cz.ivm ivmVar, Context context) {
        try {
            if (ivmVar.getContext() instanceof MutableContextWrapper) {
                ((MutableContextWrapper) ivmVar.getContext()).setBaseContext(context.getApplicationContext());
            }
        } catch (ClassCastException unused) {
        }
        ViewGroup viewGroup = (ViewGroup) ivmVar.getParent();
        if (viewGroup != null) {
            try {
                viewGroup.removeView(ivmVar);
            } catch (Throwable unused2) {
            }
        }
    }

    private static void uef(WebView webView) {
        if (webView != null && uef > 0) {
            try {
                webView.evaluateJavascript("[].forEach.call(document.querySelectorAll('audio,video'), function(audio) { try { audio.pause(); } catch(e) {} })", null);
            } catch (Throwable unused) {
            }
        }
    }
}
