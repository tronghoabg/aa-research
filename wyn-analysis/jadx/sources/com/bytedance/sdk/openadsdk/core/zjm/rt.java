package com.bytedance.sdk.openadsdk.core.zjm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.cz.ivm;
import com.bytedance.sdk.component.utils.gr;
import com.bytedance.sdk.openadsdk.core.oyt;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class rt extends ue {
    protected final AtomicBoolean bcc;
    private final gr.uef oib;
    private Activity sy;
    protected com.bytedance.sdk.openadsdk.core.zjm.uef.oa xs;

    public rt(Context context, com.bytedance.sdk.component.adexpress.oa.cq cqVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.openadsdk.moa.moa.lw lwVar, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        super(context, cqVar, themeStatusBroadcastReceiver, lwVar, gzwVar);
        this.bcc = new AtomicBoolean(false);
        this.oib = new gr.uef() { // from class: com.bytedance.sdk.openadsdk.core.zjm.rt.1
            @Override // com.bytedance.sdk.component.utils.gr.uef
            public void uef(Context context2, Intent intent, boolean z2, int i5) throws JSONException {
                oyt oytVar = ((ue) rt.this).dz;
                if (oytVar != null) {
                    oytVar.moa(i5);
                }
            }
        };
        bs();
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.ue
    public void ab() {
        super.ab();
        com.bytedance.sdk.openadsdk.core.zjm.uef.oa oaVar = this.xs;
        if (oaVar != null) {
            oaVar.lw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.ue, com.bytedance.sdk.component.adexpress.lw.uef
    public void bcc() {
        super.bcc();
        com.bytedance.sdk.openadsdk.core.zjm.uef.oa oaVar = this.xs;
        if (oaVar != null) {
            oaVar.ivm();
        }
    }

    public void bs() {
        if (this.bcc.get()) {
            return;
        }
        this.bcc.set(true);
        com.bytedance.sdk.component.utils.gr.uef(this.oib, ((ue) this).cz);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.ue
    public void dz() {
        super.dz();
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.uef
    public void oa() {
        com.bytedance.sdk.component.adexpress.lw.lw.uef().uef(this.moa);
    }

    public void sy() {
        if (this.bcc.get()) {
            this.bcc.set(false);
            try {
                com.bytedance.sdk.component.utils.gr.uef(this.oib);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.uef
    public ivm.yo uef() {
        return ivm.yo.ADS_V4;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.ue
    public void wk() {
        oyt oytVar;
        com.bytedance.sdk.component.cz.ivm ivmVar = this.moa;
        if (ivmVar == null || ivmVar.getWebView() == null || (oytVar = ((ue) this).dz) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.zjm.uef.oa oaVar = new com.bytedance.sdk.openadsdk.core.zjm.uef.oa(oytVar, this.moa, ((ue) this).dj);
        this.xs = oaVar;
        oaVar.moa();
        this.xs.oa();
        this.xs.uef(this).uef(this.sy).uef(((ue) this).cq).uef(this.f25871ab).uef(((ue) this).zjm).uef(((ue) this).wrv).uef(((ue) this).wk).uef();
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.ue, com.bytedance.sdk.component.adexpress.lw.uef
    public void xs() {
        super.xs();
        this.xs.yo();
        sy();
    }

    public void oa(Activity activity) {
        this.sy = activity;
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.uef
    public com.bytedance.sdk.component.cz.ivm uef(Context context, String str) {
        return com.bytedance.sdk.component.adexpress.lw.lw.uef().uef(context, str);
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.uef
    public boolean oa(com.bytedance.sdk.component.adexpress.oa.dz dzVar) {
        return dzVar.oa() && TextUtils.equals(dzVar.wk(), "v4");
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.ue, com.bytedance.sdk.component.adexpress.lw.uef, com.bytedance.sdk.component.adexpress.oa.dj
    public void uef(com.bytedance.sdk.component.adexpress.oa.dz dzVar) {
        super.uef(dzVar);
    }
}
