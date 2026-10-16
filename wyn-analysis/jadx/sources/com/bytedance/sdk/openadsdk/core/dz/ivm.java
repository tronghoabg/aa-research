package com.bytedance.sdk.openadsdk.core.dz;

import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ivm {

    /* renamed from: oa, reason: collision with root package name */
    private xs f25573oa;
    final Set<Pair<View, FriendlyObstructionPurpose>> uef = new HashSet();

    private ivm() {
        lw.uef(sy.uef());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bcc() {
        xs xsVar = this.f25573oa;
        if (xsVar != null) {
            try {
                xsVar.yo();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ivm() {
        if (this.f25573oa != null) {
            try {
                uef((View) null, (FriendlyObstructionPurpose) null);
                this.f25573oa.oa();
            } catch (Throwable unused) {
            }
        }
    }

    private Handler lw() {
        return com.bytedance.sdk.component.utils.cz.oa();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xs() {
        xs xsVar = this.f25573oa;
        if (xsVar != null) {
            try {
                xsVar.moa();
            } catch (Throwable unused) {
            }
        }
    }

    public void moa() {
        if (com.bykv.vk.openvk.uef.uef.oa.oa.uef.uef()) {
            bcc();
        } else {
            lw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dz.ivm.7
                @Override // java.lang.Runnable
                public void run() {
                    ivm.this.bcc();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(WebView webView) {
        try {
            if (this.f25573oa == null) {
                this.f25573oa = bcc.uef(webView);
            }
        } catch (Throwable th) {
            dhk.yo("createWebViewSession failed : ".concat(String.valueOf(th)), new Object[0]);
            HashMap map = new HashMap();
            map.put("scene", "createWebViewSession");
            map.put(PglCryptUtils.KEY_MESSAGE, th.getMessage());
            lw.uef(map);
        }
    }

    public void yo() {
        if (com.bykv.vk.openvk.uef.uef.oa.oa.uef.uef()) {
            xs();
        } else {
            lw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dz.ivm.6
                @Override // java.lang.Runnable
                public void run() {
                    ivm.this.xs();
                }
            });
        }
    }

    public static ivm uef() {
        return new ivm();
    }

    public void oa() {
        if (com.bykv.vk.openvk.uef.uef.oa.oa.uef.uef()) {
            ivm();
        } else {
            lw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dz.ivm.4
                @Override // java.lang.Runnable
                public void run() {
                    ivm.this.ivm();
                }
            });
        }
    }

    public void uef(final WebView webView) {
        if (webView == null || this.f25573oa != null) {
            return;
        }
        if (com.bykv.vk.openvk.uef.uef.oa.oa.uef.uef()) {
            oa(webView);
        } else {
            lw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dz.ivm.1
                @Override // java.lang.Runnable
                public void run() {
                    ivm.this.oa(webView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(boolean z2, float f10) {
        if (this.f25573oa != null) {
            try {
                uef((View) null, (FriendlyObstructionPurpose) null);
                this.f25573oa.uef(z2, f10);
            } catch (Throwable unused) {
            }
        }
    }

    public void uef(final View view, final gzw gzwVar) {
        if (this.f25573oa != null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd = gzwVar.odd();
        final Set<zjm> setOa = moaVarOdd != null ? moaVarOdd.oa() : null;
        if (view == null || setOa == null) {
            return;
        }
        if (com.bykv.vk.openvk.uef.uef.oa.oa.uef.uef()) {
            uef(view, setOa, gzwVar);
        } else {
            lw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dz.ivm.3
                @Override // java.lang.Runnable
                public void run() {
                    ivm.this.uef(view, (Set<zjm>) setOa, gzwVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        xs xsVar = this.f25573oa;
        try {
            if (xsVar == null) {
                if (view == null || friendlyObstructionPurpose == null) {
                    return;
                }
                this.uef.add(new Pair<>(view, friendlyObstructionPurpose));
                return;
            }
            if (view != null && friendlyObstructionPurpose != null) {
                xsVar.uef(view, friendlyObstructionPurpose);
            }
            if (this.uef.size() > 0) {
                xsVar.uef(this.uef);
                this.uef.clear();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(View view, Set<zjm> set, gzw gzwVar) {
        try {
            if (this.f25573oa == null) {
                this.f25573oa = bcc.uef(view, set);
                if (gzwVar.ebe()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.moa.yo.oa(gzwVar, gzwVar.lw(), "track_create", (JSONObject) null);
            }
        } catch (Throwable th) {
            dhk.yo("createVideoSession failed : ".concat(String.valueOf(th)), new Object[0]);
            HashMap map = new HashMap();
            map.put("scene", "createVideoSession");
            map.put(PglCryptUtils.KEY_MESSAGE, th.getMessage());
            lw.uef(map);
        }
    }

    public void oa(long j8, boolean z2) {
        xs xsVar = this.f25573oa;
        if (xsVar != null) {
            try {
                xsVar.uef(j8 / 1000.0f, z2);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(boolean z2) {
        xs xsVar = this.f25573oa;
        if (xsVar != null) {
            try {
                xsVar.uef(z2);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(int i5) {
        xs xsVar = this.f25573oa;
        if (xsVar != null) {
            try {
                xsVar.oa(i5);
            } catch (Throwable unused) {
            }
        }
    }

    public void uef(final boolean z2, final float f10) {
        if (com.bykv.vk.openvk.uef.uef.oa.oa.uef.uef()) {
            oa(z2, f10);
        } else {
            lw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dz.ivm.5
                @Override // java.lang.Runnable
                public void run() {
                    ivm.this.oa(z2, f10);
                }
            });
        }
    }

    public void uef(final View view, final FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (com.bykv.vk.openvk.uef.uef.oa.oa.uef.uef()) {
            oa(view, friendlyObstructionPurpose);
        } else {
            lw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dz.ivm.8
                @Override // java.lang.Runnable
                public void run() {
                    ivm.this.oa(view, friendlyObstructionPurpose);
                }
            });
        }
    }

    public void uef(final long j8, final boolean z2) {
        if (com.bykv.vk.openvk.uef.uef.oa.oa.uef.uef()) {
            oa(j8, z2);
        } else {
            lw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dz.ivm.9
                @Override // java.lang.Runnable
                public void run() {
                    ivm.this.oa(j8, z2);
                }
            });
        }
    }

    public void uef(final boolean z2) {
        if (com.bykv.vk.openvk.uef.uef.oa.oa.uef.uef()) {
            oa(z2);
        } else {
            lw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dz.ivm.10
                @Override // java.lang.Runnable
                public void run() {
                    ivm.this.oa(z2);
                }
            });
        }
    }

    public void uef(final int i5) {
        if (com.bykv.vk.openvk.uef.uef.oa.oa.uef.uef()) {
            oa(i5);
        } else {
            lw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dz.ivm.2
                @Override // java.lang.Runnable
                public void run() {
                    ivm.this.oa(i5);
                }
            });
        }
    }
}
