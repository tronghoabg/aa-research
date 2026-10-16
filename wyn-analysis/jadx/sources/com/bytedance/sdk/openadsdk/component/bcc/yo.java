package com.bytedance.sdk.openadsdk.component.bcc;

import android.content.Context;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.uef.uef.uef.moa.yo;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.yo.uef;
import com.bytedance.sdk.openadsdk.moa.lw.oa.wk;

/* loaded from: classes3.dex */
public class yo implements uef.InterfaceC0112uef {
    private boolean lw = false;
    private oa moa;

    /* renamed from: oa, reason: collision with root package name */
    private FrameLayout f25324oa;
    private Context uef;
    private gzw yo;

    public yo(Context context) {
        this.uef = context.getApplicationContext();
    }

    public void ab() {
        oa oaVar = this.moa;
        if (oaVar != null) {
            oaVar.af();
        }
    }

    public void bcc() {
        try {
            if (lw()) {
                this.moa.oa();
            }
        } catch (Throwable th) {
            dhk.yo("TTAppOpenVideoManager", "open_ad", "AppOpenVideoManager onPause throw Exception :" + th.getMessage());
        }
    }

    public long cq() {
        oa oaVar = this.moa;
        if (oaVar != null) {
            return oaVar.ivm();
        }
        return 0L;
    }

    public void cz() {
        try {
            if (ivm()) {
                dj();
            }
        } catch (Throwable th) {
            dhk.yo("TTAppOpenVideoManager", "onContinue throw Exception :" + th.getMessage());
        }
    }

    public void dj() {
        oa oaVar = this.moa;
        if (oaVar != null) {
            oaVar.yo();
        }
    }

    public long dz() {
        oa oaVar = this.moa;
        if (oaVar != null) {
            return oaVar.xs();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.yo.uef.InterfaceC0112uef
    public long getVideoProgress() {
        return cq();
    }

    public boolean ivm() {
        oa oaVar = this.moa;
        return (oaVar == null || oaVar.dj() == null || !this.moa.dj().xs()) ? false : true;
    }

    public boolean lw() {
        oa oaVar = this.moa;
        return (oaVar == null || oaVar.dj() == null || !this.moa.dj().ivm()) ? false : true;
    }

    public boolean moa() {
        oa oaVar = this.moa;
        return (oaVar == null || oaVar.dj() == null || !this.moa.dj().oa()) ? false : true;
    }

    public oa oa() {
        return this.moa;
    }

    public void uef(FrameLayout frameLayout, gzw gzwVar) {
        this.f25324oa = frameLayout;
        this.yo = gzwVar;
        this.moa = new oa(this.uef, frameLayout, gzwVar);
    }

    public long wk() {
        oa oaVar = this.moa;
        if (oaVar == null) {
            return 0L;
        }
        return this.moa.xs() + oaVar.cz();
    }

    public void wrv() {
        oa oaVar = this.moa;
        if (oaVar == null) {
            return;
        }
        this.uef = null;
        oaVar.moa();
        this.moa = null;
    }

    public boolean xs() {
        oa oaVar = this.moa;
        return oaVar != null && oaVar.dz();
    }

    public boolean yo() {
        return this.lw;
    }

    public void zjm() {
        oa oaVar = this.moa;
        if (oaVar == null) {
            return;
        }
        oaVar.moa();
        this.moa = null;
    }

    public boolean uef() {
        com.bytedance.sdk.openadsdk.core.wk.uef.oa oaVarUef = gzw.uef(CacheDirFactory.getICacheDir(0).oa(), this.yo);
        oaVarUef.oa(this.yo.iou());
        oaVarUef.oa(this.f25324oa.getWidth());
        oaVarUef.yo(this.f25324oa.getHeight());
        oaVarUef.yo(this.yo.em());
        oaVarUef.uef(0L);
        oaVarUef.uef(true);
        return this.moa.uef(oaVarUef);
    }

    public void uef(boolean z2) {
        this.lw = z2;
    }

    public void uef(yo.uef uefVar) {
        oa oaVar = this.moa;
        if (oaVar != null) {
            oaVar.uef(uefVar);
        }
    }

    public boolean uef(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.uef uefVar, gzw gzwVar) {
        uef(frameLayout, gzwVar);
        uef(uefVar);
        try {
            return uef();
        } catch (Throwable th) {
            dhk.yo("TTAppOpenVideoManager", "open_ad", "ttAppOpenAd playVideo error: " + th.getMessage());
            return false;
        }
    }

    public boolean uef(float f10) {
        try {
            oa oaVar = this.moa;
            if (oaVar != null) {
                return oaVar.uef(f10);
            }
        } catch (Throwable th) {
            dhk.yo("TTAppOpenVideoManager", "open_ad", "setPlaybackSpeed error: " + th.getMessage());
        }
        return false;
    }

    public void uef(int i5) {
        if (this.moa != null) {
            wk.uef uefVar = new wk.uef();
            uefVar.oa(cq());
            uefVar.moa(wk());
            uefVar.yo(dz());
            uefVar.yo(i5);
            uefVar.moa(this.moa.bcc());
            uefVar.uef(this.moa.bs());
            this.moa.uef(uefVar);
        }
    }
}
