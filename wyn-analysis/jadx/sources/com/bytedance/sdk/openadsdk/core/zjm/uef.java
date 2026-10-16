package com.bytedance.sdk.openadsdk.core.zjm;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.core.ku;
import com.bytedance.sdk.openadsdk.core.wk.oa.ivm;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.gb;

/* loaded from: classes3.dex */
public abstract class uef extends com.bytedance.sdk.openadsdk.core.ivm.yo {
    protected int bcc;
    protected boolean cz;
    protected String dj;
    protected String ivm;
    protected TTDislikeDialogAbstract lw;
    protected com.bytedance.sdk.openadsdk.yo.yo moa;

    /* renamed from: oa, reason: collision with root package name */
    protected Context f25872oa;
    private com.bytedance.sdk.openadsdk.moa.xs uef;
    protected int xs;
    protected com.bytedance.sdk.openadsdk.core.model.gzw yo;
    protected boolean zjm;

    public uef(Context context) {
        super(context);
        this.ivm = "embeded_ad";
        this.cz = true;
        this.zjm = true;
        setTag("tt_express_backup_fl_tag_26");
    }

    public String getDescription() {
        return !TextUtils.isEmpty(this.yo.xw()) ? this.yo.xw() : !TextUtils.isEmpty(this.yo.az()) ? this.yo.az() : "";
    }

    public String getNameOrSource() {
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = this.yo;
        return gzwVar == null ? "" : (gzwVar.no() == null || TextUtils.isEmpty(this.yo.no().oa())) ? !TextUtils.isEmpty(this.yo.jp()) ? this.yo.jp() : "" : this.yo.no().oa();
    }

    public float getRealHeight() {
        return af.yo(this.f25872oa, this.bcc);
    }

    public float getRealWidth() {
        return af.yo(this.f25872oa, this.xs);
    }

    @Override // android.view.View
    public Object getTag() {
        return "tt_express_backup_fl_tag_26";
    }

    public String getTitle() {
        return (this.yo.no() == null || TextUtils.isEmpty(this.yo.no().oa())) ? !TextUtils.isEmpty(this.yo.jp()) ? this.yo.jp() : !TextUtils.isEmpty(this.yo.xw()) ? this.yo.xw() : "" : this.yo.no().oa();
    }

    public com.bytedance.sdk.openadsdk.core.wk.oa.ivm getVideoView() {
        com.bytedance.sdk.openadsdk.core.wk.oa.ivm ivmVar;
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = this.yo;
        if (gzwVar != null && this.f25872oa != null) {
            if (com.bytedance.sdk.openadsdk.core.model.gzw.lw(gzwVar)) {
                try {
                    ivmVar = new com.bytedance.sdk.openadsdk.core.wk.oa.ivm(this.f25872oa, this.yo, this.ivm, true, false, this.uef);
                    ivmVar.setVideoCacheUrl(this.dj);
                    ivmVar.setControllerStatusCallBack(new ivm.oa() { // from class: com.bytedance.sdk.openadsdk.core.zjm.uef.2
                        @Override // com.bytedance.sdk.openadsdk.core.wk.oa.ivm.oa
                        public void uef(boolean z2, long j8, long j10, long j11, boolean z10) {
                        }
                    });
                    ivmVar.setIsAutoPlay(this.cz);
                    ivmVar.uef(this.zjm, "bannerGetVideoView");
                } catch (Throwable unused) {
                }
                if (!com.bytedance.sdk.openadsdk.core.model.gzw.lw(this.yo) && ivmVar != null && ivmVar.uef(0L, true, false)) {
                    return ivmVar;
                }
            } else {
                ivmVar = null;
                if (!com.bytedance.sdk.openadsdk.core.model.gzw.lw(this.yo)) {
                }
            }
        }
        return null;
    }

    public void setDislikeInner(ku kuVar) {
        if (kuVar instanceof com.bytedance.sdk.openadsdk.yo.yo) {
            this.moa = (com.bytedance.sdk.openadsdk.yo.yo) kuVar;
        }
    }

    public void setDislikeOuter(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar;
        if (tTDislikeDialogAbstract != null && (gzwVar = this.yo) != null) {
            tTDislikeDialogAbstract.setMaterialMeta(gzwVar.em(), this.yo.tkg());
        }
        this.lw = tTDislikeDialogAbstract;
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        super.setTag("tt_express_backup_fl_tag_26");
    }

    public void uef() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.lw;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.yo.yo yoVar = this.moa;
        if (yoVar != null) {
            yoVar.uef();
        } else {
            TTDelegateActivity.uef(this.yo, (String) null);
        }
    }

    public abstract void uef(View view, int i5, com.bytedance.sdk.openadsdk.core.model.ab abVar);

    public void uef(View view, boolean z2) {
        com.bytedance.sdk.openadsdk.core.yo.oa oaVar;
        if (view == null) {
            return;
        }
        if (z2) {
            Context context = this.f25872oa;
            com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = this.yo;
            String str = this.ivm;
            oaVar = new com.bytedance.sdk.openadsdk.core.yo.uef(context, gzwVar, str, gb.uef(str));
        } else {
            Context context2 = this.f25872oa;
            com.bytedance.sdk.openadsdk.core.model.gzw gzwVar2 = this.yo;
            String str2 = this.ivm;
            oaVar = new com.bytedance.sdk.openadsdk.core.yo.oa(context2, gzwVar2, str2, gb.uef(str2));
        }
        view.setOnTouchListener(oaVar);
        view.setOnClickListener(oaVar);
        oaVar.uef(new oa() { // from class: com.bytedance.sdk.openadsdk.core.zjm.uef.1
            @Override // com.bytedance.sdk.openadsdk.core.zjm.oa
            public void uef(View view2, int i5, com.bytedance.sdk.openadsdk.core.model.ab abVar) {
                uef.this.uef(view2, i5, abVar);
            }
        });
    }

    public void uef(View view) {
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = this.yo;
        if (gzwVar == null || gzwVar.nj() == null || view == null) {
            return;
        }
        uef(view, this.yo.vj() == 1 && this.cz);
    }
}
