package com.bytedance.sdk.openadsdk.component.reward.yo.uef;

import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.component.reward.yo.cz;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ivm implements cz {

    /* renamed from: oa, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.dz.ivm f25462oa;
    private gzw uef;

    public ivm(gzw gzwVar) {
        this.uef = gzwVar;
    }

    public void uef(ViewGroup viewGroup) {
        if (!this.uef.tko() || viewGroup == null) {
            return;
        }
        if (this.f25462oa == null) {
            this.f25462oa = com.bytedance.sdk.openadsdk.core.dz.ivm.uef();
        }
        this.f25462oa.uef(viewGroup, this.uef);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.yo.cz
    public void uef(int i5, JSONObject jSONObject) {
        gzw gzwVar;
        boolean zOptBoolean;
        long jOptLong;
        long j8;
        int iQe;
        JSONObject jSONObjectOptJSONObject;
        if (this.f25462oa == null || (gzwVar = this.uef) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd = gzwVar.odd();
        com.bytedance.sdk.openadsdk.core.dz.moa moaVarUef = moaVarOdd != null ? moaVarOdd.uef() : null;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("params")) == null) {
            zOptBoolean = false;
            jOptLong = 0;
            j8 = 0;
        } else {
            long jOptLong2 = jSONObjectOptJSONObject.optLong("video_duration", 0L);
            zOptBoolean = jSONObjectOptJSONObject.optBoolean("is_mute", false);
            j8 = jOptLong2;
            jOptLong = jSONObjectOptJSONObject.optLong("current_position", 0L);
        }
        if (i5 != 3) {
            switch (i5) {
                case 15:
                    if (this.uef.epe() == 7) {
                        iQe = this.uef.ho();
                    } else {
                        iQe = this.uef.qe();
                    }
                    com.bytedance.sdk.openadsdk.core.dz.ivm ivmVar = this.f25462oa;
                    if (ivmVar != null) {
                        ivmVar.uef(iQe > 0, iQe / 1000);
                        break;
                    }
                    break;
                case 16:
                    com.bytedance.sdk.openadsdk.core.dz.ivm ivmVar2 = this.f25462oa;
                    if (ivmVar2 != null) {
                        ivmVar2.uef(j8, zOptBoolean);
                        break;
                    }
                    break;
                case 17:
                    com.bytedance.sdk.openadsdk.core.dz.ivm ivmVar3 = this.f25462oa;
                    if (ivmVar3 != null) {
                        ivmVar3.moa();
                        break;
                    }
                    break;
                default:
                    com.bytedance.sdk.openadsdk.core.dz.ivm ivmVar4 = this.f25462oa;
                    if (ivmVar4 != null) {
                        ivmVar4.uef(i5);
                        break;
                    }
                    break;
            }
        } else {
            com.bytedance.sdk.openadsdk.core.dz.ivm ivmVar5 = this.f25462oa;
            if (ivmVar5 != null) {
                ivmVar5.yo();
            }
        }
        uef(i5, moaVarUef, jOptLong, j8, zOptBoolean);
    }

    private void uef(int i5, com.bytedance.sdk.openadsdk.core.dz.moa moaVar, long j8, long j10, boolean z2) {
        if (moaVar == null) {
            return;
        }
        switch (i5) {
            case 0:
                moaVar.oa(j8);
                break;
            case 1:
                moaVar.yo(j8);
                break;
            case 2:
                moaVar.ivm(j8);
                moaVar.lw(j8);
                break;
            case 3:
                moaVar.uef(j8);
                break;
            case 6:
            case 7:
            case 8:
            case 15:
                moaVar.uef(i5, j8, j10);
                break;
            case 9:
                moaVar.moa(j8);
                break;
            case 12:
                if (z2) {
                    moaVar.bcc(j8);
                    break;
                } else {
                    moaVar.cz(j8);
                    break;
                }
            case 13:
                moaVar.xs(j8);
                break;
            case 14:
                moaVar.uef(com.bytedance.sdk.openadsdk.core.dz.uef.uef.GENERAL_LINEAR_AD_ERROR);
                break;
        }
    }
}
