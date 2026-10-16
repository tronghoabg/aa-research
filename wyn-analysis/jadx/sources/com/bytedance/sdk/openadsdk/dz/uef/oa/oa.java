package com.bytedance.sdk.openadsdk.dz.uef.oa;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.core.ivm.bcc;
import com.bytedance.sdk.openadsdk.core.ivm.moa;
import com.bytedance.sdk.openadsdk.core.ivm.xs;
import com.bytedance.sdk.openadsdk.core.ivm.yo;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.bs;

/* loaded from: classes3.dex */
public class oa extends yo {
    private Context uef;

    public oa(Context context) {
        super(context);
        this.uef = context;
        oa();
    }

    private void oa() {
        setVisibility(8);
    }

    public void uef() {
        Context context = getContext();
        if (getChildCount() > 0) {
            setVisibility(0);
            return;
        }
        xs xsVar = new xs(context);
        xsVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        bcc bccVar = new bcc(context);
        bccVar.setText(orq.oa(context, "tt_history_no_data"));
        bccVar.setId(bs.sw);
        bccVar.setTextSize(2, 18.0f);
        Typeface typefaceCreate = Build.VERSION.SDK_INT >= 28 ? Typeface.create(bccVar.getTypeface(), 500, false) : null;
        if (typefaceCreate != null) {
            bccVar.setTypeface(typefaceCreate);
        }
        bccVar.setTextColor(Color.parseColor("#333333"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        layoutParams.topMargin = uef(16.0f);
        layoutParams.bottomMargin = uef(8.0f);
        xsVar.addView(bccVar, layoutParams);
        moa moaVar = new moa(context);
        moaVar.setImageResource(orq.moa(context, "tt_history_empty_icon"));
        moaVar.setId(bs.jkf);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(uef(72.0f), uef(72.0f));
        layoutParams2.addRule(2, bccVar.getId());
        layoutParams2.addRule(14);
        xsVar.addView(moaVar, layoutParams2);
        bcc bccVar2 = new bcc(context);
        bccVar2.setText(orq.oa(context, "tt_history_placeholder_submessage"));
        bccVar2.setTextSize(2, 14.0f);
        bccVar2.setTextColor(Color.parseColor("#666666"));
        bccVar2.setGravity(17);
        bccVar2.setMaxWidth(uef(280.0f));
        bccVar2.setLineSpacing(uef(2.0f), 1.0f);
        bccVar2.setPadding(uef(20.0f), 0, uef(20.0f), 0);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(3, bccVar.getId());
        layoutParams3.addRule(14);
        layoutParams3.topMargin = uef(8.0f);
        xsVar.addView(bccVar2, layoutParams3);
        addView(xsVar);
    }

    private int uef(float f10) {
        return af.oa(this.uef, f10);
    }
}
