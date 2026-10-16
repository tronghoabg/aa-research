package com.bytedance.sdk.openadsdk.component.reward.uef;

import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;

/* loaded from: classes3.dex */
public class cz {

    /* renamed from: oa, reason: collision with root package name */
    public static int f25398oa = 1;
    public static int uef = 0;
    public static int yo = 2;
    private zjm lw;
    private final boolean moa;

    public cz(oa oaVar, gzw gzwVar) {
        this.moa = gzwVar.geh();
        this.lw = cp.ivm(gzwVar) ? new bcc(oaVar) : new zjm(oaVar);
    }

    public void bcc() {
        zjm zjmVar = this.lw;
        if (zjmVar != null) {
            zjmVar.lw();
        }
    }

    public void cz() {
        zjm zjmVar = this.lw;
        if (zjmVar != null) {
            zjmVar.dz();
        }
    }

    public boolean dj() {
        zjm zjmVar = this.lw;
        if (zjmVar != null) {
            return zjmVar.wk();
        }
        return false;
    }

    public void ivm() {
        zjm zjmVar = this.lw;
        if (zjmVar != null) {
            zjmVar.cz();
        }
    }

    public void lw() {
        zjm zjmVar = this.lw;
        if (zjmVar != null) {
            zjmVar.moa();
        }
    }

    public boolean moa() {
        zjm zjmVar = this.lw;
        if (zjmVar != null) {
            return zjmVar.zjm();
        }
        return false;
    }

    public boolean oa() {
        return false;
    }

    public com.bytedance.sdk.openadsdk.orq.bcc uef() {
        return null;
    }

    public void xs() {
        zjm zjmVar = this.lw;
        if (zjmVar != null) {
            zjmVar.uef();
        }
    }

    public com.bytedance.sdk.openadsdk.cq.lw yo() {
        return null;
    }

    public void zjm() {
        zjm zjmVar = this.lw;
        if (zjmVar != null) {
            zjmVar.yo();
        }
    }

    public void oa(int i5) {
        zjm zjmVar = this.lw;
        if (zjmVar != null) {
            zjmVar.uef(i5);
        }
    }

    public void uef(int i5) {
        zjm zjmVar = this.lw;
        if (zjmVar != null) {
            zjmVar.uef(i5);
        }
    }

    public void yo(int i5) {
        zjm zjmVar;
        if (i5 == yo || (zjmVar = this.lw) == null) {
            return;
        }
        zjmVar.ivm();
    }

    public boolean moa(int i5) {
        zjm zjmVar;
        if (i5 != f25398oa || (zjmVar = this.lw) == null) {
            return false;
        }
        return zjmVar.cq();
    }

    public void oa(boolean z2) {
        zjm zjmVar = this.lw;
        if (zjmVar != null) {
            zjmVar.yo(z2);
        }
    }

    public void uef(com.bytedance.sdk.openadsdk.core.yo.lw lwVar) {
        zjm zjmVar = this.lw;
        if (zjmVar != null) {
            zjmVar.uef(lwVar);
        }
    }

    public void uef(boolean z2) {
        zjm zjmVar = this.lw;
        if (zjmVar != null) {
            zjmVar.oa(z2);
        }
    }
}
