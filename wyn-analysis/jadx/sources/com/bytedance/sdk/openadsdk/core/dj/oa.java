package com.bytedance.sdk.openadsdk.core.dj;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.settings.dj;
import com.bytedance.sdk.openadsdk.core.zjm.cq;
import com.bytedance.sdk.openadsdk.gzw.lw;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class oa {
    public static final Long uef = 0L;

    /* renamed from: oa, reason: collision with root package name */
    private AtomicBoolean f25566oa;

    public static final class uef {
        static final oa uef = new oa();
    }

    private void ab() {
        if (uef().lw() || this.f25566oa.getAndSet(true)) {
            return;
        }
        ApmHelper.initAPM();
        lw.uef();
        cq.oa();
        com.bytedance.sdk.openadsdk.core.wk.yo.uef.uef().oa();
    }

    public static oa uef() {
        return uef.uef;
    }

    public int bcc() {
        return com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_compliance_file", "user_compliance_status", -1);
    }

    public long cq() {
        return com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_compliance_file", "allow_req_time", uef.longValue());
    }

    public boolean cz() {
        int iUef = com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_compliance_file", "user_compliance_status", -1);
        return iUef == 1 || iUef == 2;
    }

    public boolean dj() {
        return com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_compliance_file", "user_compliance_status", -1) == 1;
    }

    public void dz() {
        uef().oa();
    }

    public boolean ivm() {
        return com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_compliance_file", "app_reg", -1) == 1;
    }

    public boolean lw() {
        return (!moa() && ivm() && cz()) ? false : true;
    }

    public boolean moa() {
        long jCq = cq();
        return wrv() && jCq != 0 && System.currentTimeMillis() < jCq;
    }

    public void oa() {
        String strHts = dj.oa().hts();
        if (TextUtils.isEmpty(strHts)) {
            return;
        }
        if (TextUtils.equals("true", strHts)) {
            uef(1);
        } else if (TextUtils.equals("false", strHts)) {
            uef(0);
        }
    }

    public void wk() {
        ab();
    }

    public boolean wrv() {
        return com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_compliance_file", "user_compliance_status", -1) == 3;
    }

    public boolean xs() {
        return com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_compliance_file", "app_reg", -1) == -1;
    }

    public int yo() {
        return com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_compliance_file", "app_reg", -1);
    }

    public boolean zjm() {
        return com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_compliance_file", "user_compliance_status", -1) == -1;
    }

    private oa() {
        this.f25566oa = new AtomicBoolean(false);
    }

    public void uef(int i5) {
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_compliance_file", "app_reg", Integer.valueOf(i5));
    }

    public void uef(long j8) {
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_compliance_file", "allow_req_time", Long.valueOf(j8));
    }

    public void uef(String str) {
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_compliance_file", "user_compliance_status_reason", str);
    }

    public void uef(final moa moaVar, final boolean z2) {
        yo yoVar = new yo();
        yoVar.uef(new moa() { // from class: com.bytedance.sdk.openadsdk.core.dj.oa.1
            @Override // com.bytedance.sdk.openadsdk.core.dj.moa
            public void uef(boolean z10) {
                if (!z10) {
                    moaVar.uef(false);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.dj.uef uefVar = new com.bytedance.sdk.openadsdk.core.dj.uef(z2);
                uefVar.uef(new moa() { // from class: com.bytedance.sdk.openadsdk.core.dj.oa.1.1
                    @Override // com.bytedance.sdk.openadsdk.core.dj.moa
                    public void uef(boolean z11) {
                        moaVar.uef(z11);
                    }
                });
                uefVar.uef();
            }
        });
        yoVar.uef();
    }

    public void oa(int i5) {
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_compliance_file", "user_compliance_status", Integer.valueOf(i5));
    }
}
