package com.bytedance.sdk.openadsdk.core.zjm;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class moa {

    /* renamed from: oa, reason: collision with root package name */
    private static int f25862oa;
    private static volatile moa yo;
    private final List<ivm> uef = new ArrayList();

    public static moa uef() {
        if (yo == null) {
            synchronized (moa.class) {
                try {
                    if (yo == null) {
                        yo = new moa();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return yo;
    }

    public ivm oa() {
        ivm ivmVarRemove;
        if (yo() > 0 && (ivmVarRemove = this.uef.remove(0)) != null) {
            return ivmVarRemove;
        }
        return null;
    }

    public int yo() {
        return this.uef.size();
    }

    public void yo(ivm ivmVar) {
        if (ivmVar == null || ivmVar.getWebView() == null) {
            return;
        }
        if (ivmVar.getParent() != null) {
            ((ViewGroup) ivmVar.getParent()).removeView(ivmVar);
        }
        try {
            ivmVar.removeAllViews();
            ivmVar.xs();
            ivmVar.setWebChromeClient(null);
            ivmVar.setWebViewClient(null);
            ivmVar.setDownloadListener(null);
            ivmVar.setDefaultTextEncodingName("UTF-8");
            ivmVar.setAllowFileAccess(false);
            ivmVar.setJavaScriptEnabled(true);
            ivmVar.setCacheMode(-1);
            ivmVar.setDatabaseEnabled(true);
            ivmVar.setSupportZoom(false);
            ivmVar.getWebView().setLayerType(0, null);
            ivmVar.setBackgroundColor(0);
            ivmVar.getWebView().setHorizontalScrollBarEnabled(false);
            ivmVar.getWebView().setHorizontalScrollbarOverlay(false);
            ivmVar.getWebView().setVerticalScrollBarEnabled(false);
            ivmVar.getWebView().setVerticalScrollbarOverlay(false);
            com.bytedance.sdk.openadsdk.core.widget.uef.yo.uef(ivmVar);
            ivmVar.dz();
            ivmVar.setMixedContentMode(0);
        } catch (Exception unused) {
        }
    }

    public void oa(ivm ivmVar) {
        if (ivmVar != null) {
            if (this.uef.size() >= f25862oa) {
                ivmVar.ab();
            } else {
                if (this.uef.contains(ivmVar)) {
                    return;
                }
                yo(ivmVar);
                this.uef.add(ivmVar);
            }
        }
    }

    public void uef(ivm ivmVar) {
        if (ivmVar != null) {
            oa(ivmVar);
        }
    }
}
