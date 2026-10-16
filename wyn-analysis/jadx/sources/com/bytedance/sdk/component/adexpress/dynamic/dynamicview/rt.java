package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import cb.AbstractC1593a;
import com.qonversion.android.sdk.internal.api.ApiHeadersProvider;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class rt extends ivm {
    public rt(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        super(context, dynamicRootView, bccVar);
        this.bcc += 6;
        if (this.wrv.gb()) {
            com.bytedance.sdk.component.adexpress.ivm.uef uefVar = new com.bytedance.sdk.component.adexpress.ivm.uef(context, this.wrv.xs(), this.wrv.lw(), 1, this.wrv.bcc());
            this.wk = uefVar;
            uefVar.setMaxLines(1);
        } else {
            TextView textView = new TextView(context);
            this.wk = textView;
            textView.setIncludeFontPadding(false);
        }
        this.wk.setTag(Integer.valueOf(getClickArea()));
        addView(this.wk, getWidgetLayoutParams());
    }

    private void dj() {
        if (this.wk instanceof com.bytedance.sdk.component.adexpress.ivm.uef) {
            String text = getText();
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(text);
                for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                    arrayList.add(jSONArray.optString(i5));
                }
            } catch (JSONException unused) {
                arrayList.add(text);
            }
            ((com.bytedance.sdk.component.adexpress.ivm.uef) this.wk).setMaxLines(1);
            ((com.bytedance.sdk.component.adexpress.ivm.uef) this.wk).setTextColor(this.wrv.xs());
            ((com.bytedance.sdk.component.adexpress.ivm.uef) this.wk).setTextSize(this.wrv.lw());
            ((com.bytedance.sdk.component.adexpress.ivm.uef) this.wk).setAnimationText(arrayList);
            ((com.bytedance.sdk.component.adexpress.ivm.uef) this.wk).setAnimationType(this.wrv.sk());
            ((com.bytedance.sdk.component.adexpress.ivm.uef) this.wk).setAnimationDuration(this.wrv.af() * 1000);
            ((com.bytedance.sdk.component.adexpress.ivm.uef) this.wk).uef();
        }
    }

    private boolean uef() {
        DynamicRootView dynamicRootView = this.dz;
        return (dynamicRootView == null || dynamicRootView.getRenderRequest() == null || this.dz.getRenderRequest().zjm() == 4) ? false : true;
    }

    private void zjm() {
        int iUef;
        if (AbstractC1593a.z(this.cq, "source") || AbstractC1593a.z(this.cq, "title") || AbstractC1593a.z(this.cq, "text_star")) {
            int[] iArrOa = com.bytedance.sdk.component.adexpress.dynamic.lw.dj.oa(this.wrv.ivm(), this.wrv.lw(), true);
            int iUef2 = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(getContext(), this.wrv.oa());
            int iUef3 = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(getContext(), this.wrv.yo());
            int iUef4 = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(getContext(), this.wrv.moa());
            int iUef5 = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(getContext(), this.wrv.uef());
            int iMin = Math.min(iUef2, iUef5);
            if (AbstractC1593a.z(this.cq, "source") && (iUef = ((this.bcc - ((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(getContext(), this.wrv.lw()))) - iUef2) - iUef5) > 1 && iUef <= iMin * 2) {
                int i5 = iUef / 2;
                this.wk.setPadding(iUef3, iUef2 - i5, iUef4, iUef5 - (iUef - i5));
                return;
            }
            int i10 = (((iArrOa[1] + iUef2) + iUef5) - this.bcc) - 2;
            if (i10 <= 1) {
                return;
            }
            if (i10 <= iMin * 2) {
                int i11 = i10 / 2;
                this.wk.setPadding(iUef3, iUef2 - i11, iUef4, iUef5 - (i10 - i11));
            } else if (i10 > iUef2 + iUef5) {
                final int i12 = (i10 - iUef2) - iUef5;
                this.wk.setPadding(iUef3, 0, iUef4, 0);
                if (i12 <= ((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(getContext(), 1.0f)) + 1) {
                    ((TextView) this.wk).setTextSize(this.wrv.lw() - 1.0f);
                } else if (i12 <= (((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(getContext(), 1.0f)) + 1) * 2) {
                    ((TextView) this.wk).setTextSize(this.wrv.lw() - 2.0f);
                } else {
                    post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rt.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                ViewGroup.LayoutParams layoutParams = rt.this.wk.getLayoutParams();
                                rt rtVar = rt.this;
                                layoutParams.height = rtVar.bcc + i12;
                                rtVar.wk.setLayoutParams(layoutParams);
                                rt.this.wk.setTranslationY(-i12);
                                ((ViewGroup) rt.this.wk.getParent()).setClipChildren(false);
                                ((ViewGroup) rt.this.wk.getParent().getParent()).setClipChildren(false);
                            } catch (Throwable unused) {
                            }
                        }
                    });
                }
            } else if (iUef2 > iUef5) {
                this.wk.setPadding(iUef3, iUef2 - (i10 - iMin), iUef4, iUef5 - iMin);
            } else {
                this.wk.setPadding(iUef3, iUef2 - iMin, iUef4, iUef5 - (i10 - iMin));
            }
        }
        if (AbstractC1593a.z(this.cq, "fillButton")) {
            this.wk.setTextAlignment(2);
            ((TextView) this.wk).setGravity(17);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lz
    public boolean cz() throws NumberFormatException {
        int i5;
        double d3;
        super.cz();
        if (TextUtils.isEmpty(getText())) {
            this.wk.setVisibility(4);
            return true;
        }
        if (this.wrv.gb()) {
            dj();
            return true;
        }
        ((TextView) this.wk).setText(this.wrv.ivm());
        ((TextView) this.wk).setTextDirection(5);
        this.wk.setTextAlignment(this.wrv.bcc());
        ((TextView) this.wk).setTextColor(this.wrv.xs());
        ((TextView) this.wk).setTextSize(this.wrv.lw());
        if (this.wrv.orq()) {
            int iGzw = this.wrv.gzw();
            if (iGzw > 0) {
                ((TextView) this.wk).setLines(iGzw);
                ((TextView) this.wk).setEllipsize(TextUtils.TruncateAt.END);
            }
        } else {
            ((TextView) this.wk).setMaxLines(1);
            ((TextView) this.wk).setGravity(17);
            ((TextView) this.wk).setEllipsize(TextUtils.TruncateAt.END);
        }
        com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar = this.cq;
        if (bccVar != null && bccVar.zjm() != null) {
            if (com.bytedance.sdk.component.adexpress.moa.oa() && uef() && (AbstractC1593a.z(this.cq, "text_star") || AbstractC1593a.z(this.cq, "score-count") || AbstractC1593a.z(this.cq, "score-count-type-1") || AbstractC1593a.z(this.cq, "score-count-type-2"))) {
                setVisibility(8);
                return true;
            }
            if (AbstractC1593a.z(this.cq, "score-count") || AbstractC1593a.z(this.cq, "score-count-type-2")) {
                try {
                    try {
                        i5 = Integer.parseInt(getText());
                    } catch (NumberFormatException unused) {
                        i5 = -1;
                    }
                    if (i5 < 0) {
                        if (com.bytedance.sdk.component.adexpress.moa.oa()) {
                            setVisibility(8);
                            return true;
                        }
                        this.wk.setVisibility(0);
                    }
                    if (TextUtils.equals(this.cq.zjm().oa(), "score-count-type-2")) {
                        ((TextView) this.wk).setText(String.format(new DecimalFormat("(###,###,###)").format(i5), Integer.valueOf(i5)));
                        ((TextView) this.wk).setGravity(17);
                        return true;
                    }
                    uef((TextView) this.wk, i5, getContext(), "tt_comment_num");
                } catch (Exception unused2) {
                }
            } else if (AbstractC1593a.z(this.cq, "text_star")) {
                try {
                    d3 = Double.parseDouble(getText());
                } catch (Exception unused3) {
                    d3 = -1.0d;
                }
                if (d3 < 0.0d || d3 > 5.0d) {
                    if (com.bytedance.sdk.component.adexpress.moa.oa()) {
                        setVisibility(8);
                        return true;
                    }
                    this.wk.setVisibility(0);
                }
                ((TextView) this.wk).setIncludeFontPadding(false);
                ((TextView) this.wk).setText(String.format("%.1f", Double.valueOf(d3)));
            } else if (TextUtils.equals("privacy-detail", this.cq.zjm().oa())) {
                ((TextView) this.wk).setText("Permission list | Privacy policy");
            } else if (AbstractC1593a.z(this.cq, "development-name")) {
                ((TextView) this.wk).setText(com.bytedance.sdk.component.utils.orq.uef(com.bytedance.sdk.component.adexpress.moa.uef(), "tt_text_privacy_development") + getText());
            } else if (AbstractC1593a.z(this.cq, ApiHeadersProvider.APP_VERSION)) {
                ((TextView) this.wk).setText(com.bytedance.sdk.component.utils.orq.uef(com.bytedance.sdk.component.adexpress.moa.uef(), "tt_text_privacy_app_version") + getText());
            } else {
                ((TextView) this.wk).setText(getText());
            }
            this.wk.setTextAlignment(this.wrv.bcc());
            ((TextView) this.wk).setGravity(this.wrv.cz());
            if (com.bytedance.sdk.component.adexpress.moa.oa()) {
                zjm();
            }
        }
        return true;
    }

    public String getText() {
        String strIvm = this.wrv.ivm();
        if (TextUtils.isEmpty(strIvm)) {
            if (!com.bytedance.sdk.component.adexpress.moa.oa() && AbstractC1593a.z(this.cq, "text_star")) {
                strIvm = "5";
            }
            if (!com.bytedance.sdk.component.adexpress.moa.oa() && AbstractC1593a.z(this.cq, "score-count")) {
                strIvm = "6870";
            }
        }
        return (AbstractC1593a.z(this.cq, "title") || AbstractC1593a.z(this.cq, "subtitle")) ? strIvm.replace("\n", "") : strIvm;
    }

    public void uef(TextView textView, int i5, Context context, String str) {
        textView.setText("(" + String.format(com.bytedance.sdk.component.utils.orq.uef(context, str), Integer.valueOf(i5)) + ")");
        if (i5 == -1) {
            textView.setVisibility(8);
        }
    }
}
