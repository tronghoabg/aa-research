package com.bytedance.sdk.component.adexpress.lw;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.cz.ivm;
import com.bytedance.sdk.component.uef.dhk;
import com.bytedance.sdk.component.utils.pz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class lw {
    private static int bcc = 10;
    private static volatile lw cz = null;
    private static int ivm = 10;
    private static final byte[] lw = new byte[0];
    private final AtomicBoolean xs = new AtomicBoolean(false);
    private List<ivm> uef = new ArrayList();

    /* renamed from: oa, reason: collision with root package name */
    private List<ivm> f24922oa = new ArrayList();
    private Map<Integer, yo> yo = new HashMap();
    private Map<Integer, moa> moa = new HashMap();

    private lw() {
        com.bytedance.sdk.component.adexpress.uef.uef.yo yoVarYo = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo();
        if (yoVarYo != null) {
            ivm = yoVarYo.zjm();
            bcc = yoVarYo.dj();
        }
    }

    public static lw uef() {
        if (cz == null) {
            synchronized (lw.class) {
                try {
                    if (cz == null) {
                        cz = new lw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return cz;
    }

    private void xs(ivm ivmVar) {
        if (ivmVar == null) {
            return;
        }
        if (pz.oa(ivmVar.getScene())) {
            pz.uef(ivmVar);
            return;
        }
        if (this.uef.size() >= ivm) {
            try {
                Context context = ivmVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                ivmVar.ab();
                return;
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        if (this.uef.contains(ivmVar)) {
            return;
        }
        try {
            Context context2 = ivmVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                ivmVar.setRecycler(true);
                this.uef.add(ivmVar);
                yo();
            }
        } catch (Throwable th2) {
            yo();
            th2.getMessage();
        }
    }

    public void ivm(ivm ivmVar) {
        WebView webView;
        if (ivmVar == null || (webView = ivmVar.getWebView()) == null) {
            return;
        }
        yo yoVar = this.yo.get(Integer.valueOf(webView.hashCode()));
        if (yoVar != null) {
            yoVar.uef(null);
        }
        ivmVar.b_("SDK_INJECT_GLOBAL");
    }

    public boolean lw(ivm ivmVar) {
        if (ivmVar == null) {
            return false;
        }
        try {
            Context context = ivmVar.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            ivmVar.ab();
            return true;
        } catch (Throwable th) {
            th.getMessage();
            return true;
        }
    }

    public void moa(ivm ivmVar) {
        if (ivmVar == null) {
            return;
        }
        pz.oa(ivmVar);
        ivmVar.b_("SDK_INJECT_GLOBAL");
        ivm(ivmVar);
        xs(ivmVar);
    }

    public ivm oa(Context context, String str) {
        ivm.yo yoVar = ivm.yo.ADS_V3;
        if (pz.oa(yoVar)) {
            if (!com.bytedance.sdk.component.adexpress.moa.lw.uef(str) || pz.uef(yoVar) > 1) {
                return pz.uef(context, null, 0, yoVar);
            }
            return null;
        }
        if (moa() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.moa.lw.uef(str) && moa() <= 1) {
            moa();
            return null;
        }
        ivm ivmVarRemove = this.f24922oa.remove(0);
        if (ivmVarRemove == null) {
            return null;
        }
        try {
            Context context2 = ivmVarRemove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                ivmVarRemove.setRecycler(false);
                moa();
            }
            return ivmVarRemove;
        } catch (Throwable unused) {
            moa();
            return null;
        }
    }

    public void yo(ivm ivmVar) {
        if (ivmVar == null) {
            return;
        }
        pz.oa(ivmVar);
        ivmVar.b_("SDK_INJECT_GLOBAL");
        ivm(ivmVar);
        oa(ivmVar);
    }

    public int moa() {
        return this.f24922oa.size();
    }

    public ivm yo(Context context, String str) {
        ivm.yo yoVar = ivm.yo.ADS;
        if (pz.oa(yoVar)) {
            if (!com.bytedance.sdk.component.adexpress.moa.lw.uef(str) || pz.uef(yoVar) > 1) {
                return pz.uef(context, null, 0, yoVar);
            }
            return null;
        }
        if (yo() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.moa.lw.uef(str) && yo() <= 1) {
            yo();
            return null;
        }
        ivm ivmVarRemove = this.uef.remove(0);
        if (ivmVarRemove == null) {
            return null;
        }
        try {
            Context context2 = ivmVarRemove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                ivmVarRemove.setRecycler(false);
                yo();
            }
            return ivmVarRemove;
        } catch (Throwable unused) {
            yo();
            return null;
        }
    }

    public ivm uef(Context context, String str) {
        ivm.yo yoVar = ivm.yo.ADS_V4;
        if (!pz.oa(yoVar)) {
            return null;
        }
        if (!com.bytedance.sdk.component.adexpress.moa.lw.uef(str) || pz.uef(yoVar) > 1) {
            return pz.uef(context, null, 0, yoVar);
        }
        return null;
    }

    public void uef(ivm ivmVar) {
        if (ivmVar == null) {
            return;
        }
        pz.oa(ivmVar);
        ivmVar.b_("SDK_INJECT_GLOBAL");
        ivm(ivmVar);
        if (pz.oa(ivmVar.getScene())) {
            pz.uef(ivmVar);
            return;
        }
        try {
            Context context = ivmVar.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            ivmVar.ab();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void oa(ivm ivmVar) {
        if (ivmVar == null) {
            return;
        }
        if (pz.oa(ivmVar.getScene())) {
            pz.uef(ivmVar);
            return;
        }
        if (this.f24922oa.size() >= bcc) {
            try {
                Context context = ivmVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                ivmVar.ab();
                return;
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        if (this.f24922oa.contains(ivmVar)) {
            return;
        }
        try {
            Context context2 = ivmVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                ivmVar.setRecycler(true);
                this.f24922oa.add(ivmVar);
                moa();
            }
        } catch (Throwable th2) {
            moa();
            th2.getMessage();
        }
    }

    public int yo() {
        return this.uef.size();
    }

    public void uef(ivm ivmVar, oa oaVar) {
        WebView webView;
        if (ivmVar == null || oaVar == null || (webView = ivmVar.getWebView()) == null) {
            return;
        }
        yo yoVar = this.yo.get(Integer.valueOf(webView.hashCode()));
        if (yoVar != null) {
            yoVar.uef(oaVar);
        } else {
            yoVar = new yo(oaVar);
            this.yo.put(Integer.valueOf(webView.hashCode()), yoVar);
        }
        ivmVar.uef(yoVar, "SDK_INJECT_GLOBAL");
    }

    public void uef(WebView webView, dhk dhkVar, String str) {
        if (webView == null || dhkVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        moa moaVar = this.moa.get(Integer.valueOf(webView.hashCode()));
        if (moaVar != null) {
            moaVar.uef(dhkVar);
        } else {
            moaVar = new moa(dhkVar);
            this.moa.put(Integer.valueOf(webView.hashCode()), moaVar);
        }
        webView.addJavascriptInterface(moaVar, str);
    }

    public void oa() {
        for (ivm ivmVar : this.uef) {
            if (ivmVar != null) {
                try {
                    Context context = ivmVar.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    }
                    ivmVar.ab();
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }
        this.uef.clear();
        for (ivm ivmVar2 : this.f24922oa) {
            if (ivmVar2 != null) {
                try {
                    Context context2 = ivmVar2.getContext();
                    if (context2 instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    }
                    ivmVar2.ab();
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
        }
        this.f24922oa.clear();
    }

    public void uef(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        moa moaVar = this.moa.get(Integer.valueOf(webView.hashCode()));
        if (moaVar != null) {
            moaVar.uef(null);
        }
        webView.removeJavascriptInterface(str);
    }

    public void uef(int i5) {
        synchronized (lw) {
            ivm = i5;
        }
    }

    public void oa(int i5) {
        synchronized (lw) {
            bcc = i5;
        }
    }
}
