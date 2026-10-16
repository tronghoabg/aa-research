package com.bytedance.sdk.openadsdk.core.cq.yo;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.bs;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.oyt;
import com.bytedance.sdk.openadsdk.core.zjm.ab;

/* loaded from: classes3.dex */
public class oa {
    private final boolean lw;
    private com.bytedance.sdk.openadsdk.core.cq.yo.uef moa;

    /* renamed from: oa, reason: collision with root package name */
    private Context f25562oa;
    private yo uef;
    private gzw yo;

    public static class uef {
        public static yo uef(Context context, gzw gzwVar, boolean z2) {
            if (bs.uef(gzwVar, z2)) {
                return new moa(context, gzwVar, z2);
            }
            return null;
        }
    }

    public oa(Context context, gzw gzwVar) {
        this(context, gzwVar, false);
    }

    public void moa() {
        yo yoVar = this.uef;
        if (yoVar != null) {
            yoVar.yo();
        }
    }

    public void oa() {
        yo yoVar = this.uef;
        if (yoVar != null) {
            yoVar.oa();
        }
    }

    public void uef(ab abVar) {
        yo yoVarUef = uef.uef(this.f25562oa, this.yo, this.lw);
        this.uef = yoVarUef;
        if (yoVarUef != null) {
            yoVarUef.uef();
            this.uef.uef(abVar);
        }
    }

    public View yo() {
        yo yoVar = this.uef;
        if (yoVar != null) {
            return yoVar.moa();
        }
        return null;
    }

    public oa(Context context, gzw gzwVar, boolean z2) {
        this.f25562oa = context;
        this.yo = gzwVar;
        this.lw = z2;
    }

    public void uef(com.bytedance.sdk.openadsdk.core.cq.yo.uef uefVar) {
        this.moa = uefVar;
        yo yoVar = this.uef;
        if (yoVar != null) {
            yoVar.uef(uefVar);
        }
    }

    public void uef(int i5) {
        oyt oytVarLw;
        yo yoVar = this.uef;
        if (!(yoVar instanceof moa) || (oytVarLw = ((moa) yoVar).lw()) == null || oytVarLw.uef() == null) {
            return;
        }
        oytVarLw.uef().uef(i5);
    }

    public yo uef() {
        return this.uef;
    }
}
