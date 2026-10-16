package com.bytedance.sdk.openadsdk.activity.single;

import Va.M6;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.oa;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.settings.dj;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.cz;
import com.bytedance.sdk.openadsdk.utils.dz;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class cz extends yo {

    /* renamed from: ab, reason: collision with root package name */
    private bcc f25228ab;
    private com.bytedance.sdk.openadsdk.component.reward.top.yo bcc;
    private int bs;
    private oa.AbstractC0075oa cq;
    private com.bytedance.sdk.openadsdk.wk.uef cz;
    private com.bytedance.sdk.openadsdk.core.ivm.yo dj;
    private int dz;
    public dz ivm;
    private boolean sy;
    private lw wk;
    private com.bytedance.sdk.openadsdk.core.ivm.bcc wrv;
    private final List<bcc> xs;
    private com.bytedance.sdk.openadsdk.core.ivm.yo zjm;

    public cz(Activity activity, gzw gzwVar, oa oaVar) {
        super(activity, gzwVar, oaVar);
        this.xs = new ArrayList();
        this.sy = false;
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar = new com.bytedance.sdk.openadsdk.core.ivm.yo(activity);
        this.zjm = yoVar;
        if (Build.VERSION.SDK_INT >= 35) {
            yoVar.setFitsSystemWindows(true);
        }
        activity.setContentView(this.zjm);
    }

    private void moa(bcc bccVar) {
        com.bytedance.sdk.openadsdk.wk.uef uefVar = this.cz;
        if (uefVar != null) {
            af.xs(uefVar);
            this.cz = null;
        }
        com.bytedance.sdk.openadsdk.component.reward.top.yo yoVar = this.bcc;
        if (yoVar != null) {
            af.xs(yoVar);
            af.xs(this.bcc.getITopLayout());
            this.bcc = null;
        }
        oa.AbstractC0075oa abstractC0075oa = this.cq;
        if (abstractC0075oa != null) {
            abstractC0075oa.yo();
        }
        if (bccVar instanceof xs) {
            ((xs) bccVar).etd();
        }
        dz dzVar = this.ivm;
        if (dzVar != null) {
            dzVar.yo();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x011c A[PHI: r11
  0x011c: PHI (r11v3 int) = (r11v2 int), (r11v4 int), (r11v2 int), (r11v2 int) binds: [B:28:0x00b7, B:42:0x0106, B:32:0x00c7, B:33:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int oa(int r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.single.cz.oa(int, boolean):int");
    }

    private void orq() {
        this.ivm = com.bytedance.sdk.openadsdk.utils.cz.uef(this.uef, new cz.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.cz.1
            @Override // com.bytedance.sdk.openadsdk.utils.cz.uef
            public void oa() {
                if (cz.this.bcc != null) {
                    cz.this.bcc.setSkipInvisiable();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.utils.cz.uef
            public View uef() {
                if (cz.this.bcc != null) {
                    return cz.this.bcc.getCloseButton();
                }
                return null;
            }
        });
    }

    private void tpx() {
        boolean zWk = dj.oa().wk(String.valueOf(this.f25266oa.jnk()));
        int iOa = this.moa.ivm() ? oa(0, zWk) : 0;
        if (this.xs.isEmpty() && !cp.yo(this.f25266oa)) {
            int i5 = iOa + 1;
            this.xs.add(uef(this.moa, this.f25266oa, iOa, i5, true));
            iOa = i5;
        }
        uef(iOa, zWk);
    }

    private void yo(bcc bccVar) {
        try {
            this.wrv.setText(this.uef.getString(orq.oa(sy.uef(), "tt_multiple_ad_indicator"), Integer.valueOf(bccVar.dj + 1), Integer.valueOf(this.dz)));
            this.wrv.setVisibility(0);
        } catch (Throwable th) {
            dhk.uef("SeqSwitchLayoutManager", "updateCurrentAdIndex: ", th);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public int bcc() {
        oa.AbstractC0075oa abstractC0075oa = this.cq;
        if (abstractC0075oa != null) {
            return abstractC0075oa.uef();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public bcc cq() {
        bcc bccVar = this.f25228ab;
        if (bccVar == null) {
            return null;
        }
        int i5 = bccVar.zjm;
        while (true) {
            i5++;
            if (i5 >= this.xs.size()) {
                return null;
            }
            bcc bccVar2 = this.xs.get(i5);
            if (bccVar2 instanceof uef) {
                return bccVar2;
            }
            if ((bccVar2 instanceof lw) && cp.yo(bccVar2.ivm) && bccVar2.f25225ab) {
                return bccVar2;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void cz() {
        super.cz();
        bcc bccVar = this.f25228ab;
        if (bccVar != null) {
            bccVar.dhk();
        }
    }

    public int dhk() {
        bcc bccVar = this.f25228ab;
        if (bccVar != null) {
            return bccVar.zjm;
        }
        return -1;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public bcc dj() {
        return this.f25228ab;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public lw dz() {
        lw lwVar = this.wk;
        if (lwVar != null) {
            return lwVar;
        }
        bcc bccVar = this.f25228ab;
        int i5 = bccVar != null ? bccVar.zjm : -1;
        int size = this.xs.size() - 1;
        while (true) {
            if (size <= i5) {
                break;
            }
            bcc bccVar2 = this.xs.get(size);
            if (bccVar2 instanceof lw) {
                lw lwVar2 = (lw) bccVar2;
                if (lwVar2.uef) {
                    this.wk = lwVar2;
                    break;
                }
            }
            size--;
        }
        return this.wk;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void ivm() {
        super.ivm();
        bcc bccVar = this.f25228ab;
        if (bccVar != null) {
            bccVar.cq();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void oib() {
        oa.AbstractC0075oa abstractC0075oa = this.cq;
        if (abstractC0075oa != null) {
            abstractC0075oa.cz();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void sy() {
        oa.AbstractC0075oa abstractC0075oa = this.cq;
        if (abstractC0075oa != null) {
            abstractC0075oa.bcc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public List<gzw> wk() {
        return this.f25266oa.at();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public com.bytedance.sdk.openadsdk.component.reward.top.yo wrv() {
        return this.bcc;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void xs() {
        super.xs();
        bcc bccVar = this.f25228ab;
        if (bccVar != null) {
            bccVar.moa();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public int zjm() {
        return this.bs;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void uef() {
        super.uef();
        tpx();
    }

    private static bcc uef(oa oaVar, gzw gzwVar, int i5, int i10, boolean z2) {
        boolean zNyn = gzwVar.nyn();
        AdSlot adSlotCl = gzwVar.cl();
        if (adSlotCl != null) {
            zNyn = adSlotCl.getDurationSlotType() == 7;
        }
        if (zNyn) {
            return new xs(oaVar, gzwVar, i5, i10, z2);
        }
        return new ivm(oaVar, gzwVar, i5, i10, z2);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void yo() {
        super.yo();
        bcc bccVar = this.f25228ab;
        if (bccVar != null) {
            bccVar.dz();
        }
        oa.AbstractC0075oa abstractC0075oa = this.cq;
        if (abstractC0075oa != null) {
            abstractC0075oa.uef(-1);
        }
        dz dzVar = this.ivm;
        if (dzVar != null) {
            dzVar.oa();
        }
    }

    private void uef(int i5, boolean z2) {
        if (dz() == null && this.moa.ivm()) {
            orq();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void uef(Bundle bundle) {
        super.uef(bundle);
        this.dj = new com.bytedance.sdk.openadsdk.core.ivm.yo(this.uef);
        this.zjm.addView(this.dj, new FrameLayout.LayoutParams(-1, -1));
        this.cz = new com.bytedance.sdk.openadsdk.wk.uef(this.uef);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, af.oa(this.uef, 2.0f));
        layoutParams.gravity = 80;
        this.zjm.addView(this.cz, layoutParams);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(this.uef);
        this.wrv = bccVar;
        bccVar.setTextColor(-1);
        this.wrv.setTextSize(15.0f);
        this.wrv.setShadowLayer(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, -16777216);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = af.oa(this.uef, 60.0f);
        layoutParams2.rightMargin = af.oa(this.uef, 16.0f);
        layoutParams2.gravity = 8388661;
        this.zjm.addView(this.wrv, layoutParams2);
        com.bytedance.sdk.openadsdk.component.reward.top.yo yoVar = new com.bytedance.sdk.openadsdk.component.reward.top.yo(this.uef);
        this.bcc = yoVar;
        this.zjm.addView(yoVar, new FrameLayout.LayoutParams(-1, -2));
        this.bcc.uef(this.f25266oa);
        this.bcc.setShowDislike(true);
        uef(null, null, new oa.lw(1, null));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public boolean moa() {
        if (this.xs.isEmpty()) {
            return false;
        }
        bcc bccVar = (bcc) M6.k(1, this.xs);
        return (bccVar instanceof lw) && ((lw) bccVar).uef;
    }

    private void oa(bcc bccVar, bcc bccVar2, oa.lw lwVar) {
        gzw gzwVar;
        if (this.cq == null) {
            if (bccVar2 != null && bccVar2.d_()) {
                this.cq = new oa.moa(this.moa, this.f25266oa, this.bcc);
            } else {
                this.cq = new oa.uef(this.moa, this.f25266oa, this.bcc);
            }
        }
        this.cq.oa();
        int iOa = oa(bccVar2);
        boolean z2 = bccVar2 instanceof lw;
        if (z2 && !((lw) bccVar2).uef && !bccVar2.f25225ab && (gzwVar = bccVar2.ivm) != null && gzwVar.qz()) {
            this.cq.moa();
        } else {
            this.cq.uef(iOa, bccVar2.ivm);
            boolean z10 = bccVar2 instanceof lw;
            if (z10 && ((lw) bccVar2).uef) {
                moa(bccVar);
            } else if (bccVar2.ivm.nl()) {
                boolean z11 = false;
                boolean z12 = (bccVar2 instanceof uef) && com.bytedance.sdk.openadsdk.core.model.dhk.lw(bccVar2.ivm);
                if (z10 && (bccVar2.f25225ab || com.bytedance.sdk.openadsdk.core.model.dhk.ivm(bccVar2.ivm))) {
                    z11 = true;
                }
                if (z12 || z11) {
                    this.cq.uef(bccVar2);
                }
            } else if (bccVar2.f25225ab) {
                this.cq.uef(bccVar2.ivm, bccVar2.bs);
            } else if (z10) {
                this.cq.yo(bccVar2.ivm.hzk().moa());
            }
        }
        dz dzVar = this.ivm;
        if (dzVar != null && bccVar == null) {
            dzVar.uef(iOa * 1000);
        }
        if (bccVar2 instanceof uef) {
            this.bs++;
            uef(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (com.bytedance.sdk.openadsdk.core.model.dhk.lw(bccVar2.ivm)) {
                this.wrv.setVisibility(8);
                return;
            } else {
                yo(bccVar2);
                return;
            }
        }
        if (z2) {
            if (((lw) bccVar2).uef) {
                this.wrv.setVisibility(8);
                return;
            }
            if (bccVar2.f25225ab && cp.yo(bccVar2.ivm)) {
                this.bs++;
            }
            if (!bccVar2.f25225ab && !com.bytedance.sdk.openadsdk.core.model.dhk.ivm(bccVar2.ivm)) {
                yo(bccVar2);
            } else {
                this.wrv.setVisibility(8);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void uef(bcc bccVar, bcc bccVar2, oa.lw lwVar) {
        bcc bccVar3 = this.f25228ab;
        if ((bccVar3 == null || bccVar3 == bccVar) && !com.bytedance.sdk.component.utils.oa.uef(this.uef)) {
            dhk();
            if (bccVar2 == null) {
                bcc bccVar4 = this.f25228ab;
                int i5 = bccVar4 != null ? bccVar4.zjm + 1 : 0;
                if (i5 < this.xs.size()) {
                    bccVar2 = this.xs.get(i5);
                }
                if (bccVar2 == null) {
                    this.moa.xs();
                    return;
                }
            }
            bcc bccVar5 = this.f25228ab;
            if (bccVar5 != null) {
                if (bccVar5 == bccVar2) {
                    return;
                }
                bccVar5.dz();
                this.f25228ab.moa();
                com.bytedance.sdk.openadsdk.component.reward.view.bcc bccVarUef = this.f25228ab.uef();
                if (bccVarUef != null) {
                    this.dj.removeView(bccVarUef);
                }
                this.f25228ab.oib();
                this.f25228ab.wrv = false;
                if (this.moa.lw()) {
                    bcc bccVar6 = this.f25228ab;
                    if (bccVar6 instanceof uef) {
                        int i10 = bccVar6.zjm + 1;
                        bcc bccVar7 = i10 < this.xs.size() ? this.xs.get(i10) : null;
                        if ((bccVar7 instanceof lw) && bccVar7 != bccVar2) {
                            com.bytedance.sdk.openadsdk.component.reward.view.bcc bccVarUef2 = bccVar7.uef();
                            if (bccVarUef2 != null && bccVarUef2.getParent() != null && (bccVarUef2.getParent() instanceof ViewGroup)) {
                                ((ViewGroup) bccVarUef2.getParent()).removeView(bccVarUef2);
                            }
                            bccVar7.oib();
                        }
                    }
                }
            }
            if (com.bytedance.sdk.component.utils.oa.uef(this.uef)) {
                return;
            }
            bccVar2.wrv = true;
            bcc bccVar8 = this.f25228ab;
            this.f25228ab = bccVar2;
            oa(bccVar8, bccVar2, lwVar);
            bccVar2.oa(this.uef, lwVar);
            com.bytedance.sdk.openadsdk.component.reward.view.bcc bccVarUef3 = bccVar2.uef();
            if (bccVarUef3 != null) {
                ViewParent parent = bccVarUef3.getParent();
                if (parent != null) {
                    if (parent == this.dj) {
                        bccVarUef3.setVisibility(0);
                    } else if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(bccVarUef3);
                    }
                }
                if (bccVarUef3.getParent() == null) {
                    this.dj.addView(bccVarUef3, new ViewGroup.LayoutParams(-1, -1));
                }
            }
            for (int i11 = bccVar8 != null ? bccVar8.zjm : 0; i11 < this.xs.size(); i11++) {
                this.xs.get(i11).uef(bccVar8, this.f25228ab, lwVar);
            }
            this.moa.oa(this.f25228ab);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int oa(com.bytedance.sdk.openadsdk.activity.single.bcc r8) {
        /*
            r7 = this;
            int r8 = r8.zjm
            r0 = 0
        L3:
            java.util.List<com.bytedance.sdk.openadsdk.activity.single.bcc> r1 = r7.xs
            int r1 = r1.size()
            if (r8 >= r1) goto L9c
            java.util.List<com.bytedance.sdk.openadsdk.activity.single.bcc> r1 = r7.xs
            java.lang.Object r1 = r1.get(r8)
            com.bytedance.sdk.openadsdk.activity.single.bcc r1 = (com.bytedance.sdk.openadsdk.activity.single.bcc) r1
            boolean r2 = r1 instanceof com.bytedance.sdk.openadsdk.activity.single.lw
            if (r2 == 0) goto L1e
            r2 = r1
            com.bytedance.sdk.openadsdk.activity.single.lw r2 = (com.bytedance.sdk.openadsdk.activity.single.lw) r2
            boolean r2 = r2.uef
            if (r2 != 0) goto L9c
        L1e:
            boolean r2 = r1.f25225ab
            com.bytedance.sdk.openadsdk.core.model.gzw r3 = r1.ivm
            boolean r3 = com.bytedance.sdk.openadsdk.core.model.dhk.ivm(r3)
            com.bytedance.sdk.openadsdk.core.model.gzw r4 = r1.ivm
            boolean r4 = com.bytedance.sdk.openadsdk.core.model.dhk.lw(r4)
            com.bytedance.sdk.openadsdk.core.model.gzw r5 = r1.ivm
            com.bytedance.sdk.openadsdk.core.model.gsd r5 = r5.uef()
            if (r5 == 0) goto L39
            int r5 = r5.yo()
            goto L3b
        L39:
            r5 = 10
        L3b:
            boolean r6 = r1 instanceof com.bytedance.sdk.openadsdk.activity.single.uef
            if (r6 == 0) goto L59
            if (r4 == 0) goto L43
        L41:
            int r0 = r0 + r5
            goto L98
        L43:
            com.bytedance.sdk.openadsdk.core.model.gzw r1 = r1.ivm
            com.bykv.vk.openvk.uef.uef.uef.yo.oa r1 = r1.nj()
            if (r1 == 0) goto L53
            double r2 = (double) r0
            double r0 = r1.ivm()
            double r0 = r0 + r2
            int r0 = (int) r0
            goto L98
        L53:
            long r0 = (long) r0
            r2 = 10
            long r0 = r0 + r2
            int r0 = (int) r0
            goto L98
        L59:
            boolean r4 = r1 instanceof com.bytedance.sdk.openadsdk.activity.single.lw
            if (r4 == 0) goto L98
            if (r3 == 0) goto L60
            goto L41
        L60:
            if (r2 == 0) goto L7b
            com.bytedance.sdk.openadsdk.core.model.gzw r2 = r1.ivm
            boolean r2 = r2.nl()
            if (r2 == 0) goto L6b
            goto L41
        L6b:
            com.bytedance.sdk.openadsdk.core.model.gzw r2 = r1.ivm
            int r2 = com.bytedance.sdk.openadsdk.core.model.cp.tpx(r2)
            com.bytedance.sdk.openadsdk.core.model.gzw r1 = r1.ivm
            int r1 = com.bytedance.sdk.openadsdk.core.model.cp.rt(r1)
            int r1 = r1 + r2
        L78:
            int r1 = r1 + r0
            r0 = r1
            goto L98
        L7b:
            com.bytedance.sdk.openadsdk.activity.single.oa r2 = r7.moa
            boolean r2 = r2.lw()
            if (r2 == 0) goto L98
            com.bytedance.sdk.openadsdk.core.model.gzw r2 = r1.ivm
            if (r2 == 0) goto L98
            boolean r2 = r2.qz()
            if (r2 != 0) goto L98
            com.bytedance.sdk.openadsdk.core.model.gzw r1 = r1.ivm
            com.bytedance.sdk.openadsdk.core.model.gr r1 = r1.hzk()
            int r1 = r1.moa()
            goto L78
        L98:
            int r8 = r8 + 1
            goto L3
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.single.cz.oa(com.bytedance.sdk.openadsdk.activity.single.bcc):int");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void uef(int i5, int i10) {
        super.uef(i5, i10);
        if (i5 >= 0) {
            if (TextUtils.isEmpty(this.yo)) {
                this.wrv.setText(this.uef.getString(orq.oa(sy.uef(), "tt_multiple_playable_wait_tips"), Integer.valueOf(i5)));
            } else {
                this.wrv.setText(String.format(this.yo, Integer.valueOf(i5)));
            }
            this.wrv.setVisibility(0);
            return;
        }
        this.wrv.setVisibility(8);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void oa() {
        super.oa();
        bcc bccVar = this.f25228ab;
        if (bccVar != null) {
            bccVar.yo();
        }
        oa.AbstractC0075oa abstractC0075oa = this.cq;
        if (abstractC0075oa != null) {
            abstractC0075oa.oa(-1);
        }
        dz dzVar = this.ivm;
        if (dzVar != null) {
            dzVar.uef();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void uef(Activity activity) {
        super.uef(activity);
        bcc bccVar = this.f25228ab;
        if (bccVar != null) {
            bccVar.oa(activity);
        }
        int iDhk = dhk();
        for (bcc bccVar2 : this.xs) {
            if (bccVar2.zjm >= iDhk) {
                bccVar2.oib();
            }
        }
        oa.AbstractC0075oa abstractC0075oa = this.cq;
        if (abstractC0075oa != null) {
            abstractC0075oa.yo();
        }
        dz dzVar = this.ivm;
        if (dzVar != null) {
            dzVar.yo();
        }
        bcc bccVar3 = this.f25228ab;
        if (bccVar3 != null && !bccVar3.orq() && !this.f25266oa.tpq()) {
            wk.oa().post(new oa.yo(this.f25266oa));
        }
        this.f25228ab = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void oa(bcc bccVar, int i5) {
        oa.AbstractC0075oa abstractC0075oa = this.cq;
        if (abstractC0075oa == null) {
            return;
        }
        if (i5 == 2) {
            abstractC0075oa.uef(i5);
            dz dzVar = this.ivm;
            if (dzVar != null) {
                dzVar.oa();
                return;
            }
            return;
        }
        if (i5 == 1) {
            abstractC0075oa.oa(i5);
            dz dzVar2 = this.ivm;
            if (dzVar2 != null) {
                dzVar2.uef();
                return;
            }
            return;
        }
        if (i5 == 3 || i5 == 4) {
            try {
                this.f25228ab.gsd().tpx.dxx();
            } catch (Throwable th) {
                dhk.yo("SeqSwitchLayoutManager", th);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void oa(Activity activity) {
        super.oa(activity);
        bcc bccVar = this.f25228ab;
        if (bccVar != null) {
            bccVar.uef(activity);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void uef(float f10) {
        com.bytedance.sdk.openadsdk.wk.uef uefVar = this.cz;
        if (uefVar == null) {
            return;
        }
        uefVar.setProgress(f10);
        if (f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.cz.getVisibility() == 0) {
            this.cz.setVisibility(4);
        } else {
            if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.cz.getVisibility() == 0) {
                return;
            }
            this.cz.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void uef(int i5) {
        oa.AbstractC0075oa abstractC0075oa = this.cq;
        if (abstractC0075oa != null) {
            if (i5 == 2) {
                abstractC0075oa.uef(2);
            } else if (i5 == 1) {
                abstractC0075oa.oa(1);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void uef(bcc bccVar, oa.lw lwVar) {
        bcc bccVar2 = this.f25228ab;
        if (bccVar2 == null || bccVar2 == bccVar) {
            if (bccVar2 != null && (bccVar2 instanceof uef)) {
                final long jDz = (bccVar2.gsd() == null || this.f25228ab.gsd().tpx == null) ? 0L : this.f25228ab.gsd().tpx.dz();
                final int i5 = this.f25228ab.dj + 1;
                long jCurrentTimeMillis = System.currentTimeMillis();
                bcc bccVar3 = this.f25228ab;
                com.bytedance.sdk.openadsdk.moa.yo.uef(jCurrentTimeMillis, bccVar3.ivm, bccVar3.e_(), "dislike_skip", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.cz.2
                    @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                    public JSONObject oa() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("duration", jDz);
                        } catch (Throwable unused) {
                        }
                        return jSONObject;
                    }

                    @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                    public JSONObject uef() {
                        return com.bytedance.sdk.openadsdk.moa.yo.uef(i5);
                    }
                });
            }
            bcc bccVarCq = cq();
            if (bccVarCq == null) {
                bccVarCq = dz();
            }
            uef(this.f25228ab, bccVarCq, lwVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void uef(bcc bccVar, boolean z2, boolean z10, boolean z11, int i5) {
        lw lwVarDz;
        bcc bccVar2 = this.f25228ab;
        if ((bccVar2 == null || bccVar2 == bccVar) && (lwVarDz = dz()) != null) {
            oa.lw lwVar = new oa.lw(i5, bccVar != null ? bccVar.gsd() : null);
            lwVar.uef.putBoolean("isSkip", z2);
            lwVar.uef.putBoolean("force", z10);
            lwVar.uef.putBoolean("isFromLandingPage", z11);
            uef(this.f25228ab, lwVarDz, lwVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void uef(uef uefVar, boolean z2) {
        oa.AbstractC0075oa abstractC0075oa;
        super.uef(uefVar, z2);
        if (uefVar == null || uefVar != this.f25228ab || (abstractC0075oa = this.cq) == null) {
            return;
        }
        abstractC0075oa.oa(z2);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void uef(bcc bccVar) {
        oa.AbstractC0075oa abstractC0075oa;
        super.uef(bccVar);
        if (bccVar == null) {
            return;
        }
        bccVar.toString();
        if (bccVar.wrv && (abstractC0075oa = this.cq) != null) {
            abstractC0075oa.ivm();
        }
        bcc bccVarCq = cq();
        if (bccVarCq instanceof uef) {
            com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVarGsd = bccVarCq.gsd();
            if (oaVarGsd == null || !com.bytedance.sdk.openadsdk.core.model.dhk.lw(oaVarGsd.f25412oa)) {
                ((uef) bccVarCq).tpx();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void uef(bcc bccVar, boolean z2) {
        oa.AbstractC0075oa abstractC0075oa;
        super.uef(bccVar, z2);
        if (bccVar == null) {
            return;
        }
        bccVar.toString();
        if (!bccVar.wrv || (abstractC0075oa = this.cq) == null) {
            return;
        }
        abstractC0075oa.uef(z2);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void uef(View view) {
        super.uef(view);
        if (view.getParent() != null) {
            return;
        }
        view.setVisibility(4);
        this.dj.addView(view, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void uef(View view, boolean z2) {
        super.uef(view, z2);
        if (view.getParent() == null && this.dj != null) {
            view.setVisibility(4);
            int childCount = this.dj.getChildCount();
            if (z2) {
                this.dj.addView(view, 0);
            } else {
                this.dj.addView(view, childCount - 1);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public boolean uef(bcc bccVar, int i5) {
        return i5 == this.xs.size() - 1 && this.xs.get(i5) != null && (this.xs.get(i5) instanceof lw);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.yo
    public void uef(boolean z2) {
        super.uef(z2);
        bcc bccVar = this.f25228ab;
        if (bccVar != null) {
            bccVar.yo(z2);
        }
    }
}
