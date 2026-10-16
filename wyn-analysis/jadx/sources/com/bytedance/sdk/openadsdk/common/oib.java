package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.utils.af;

/* loaded from: classes3.dex */
public class oib extends com.bytedance.sdk.openadsdk.core.ivm.yo {
    public oib(Context context) {
        super(context);
        uef();
    }

    private void uef() {
        Context context = getContext();
        int iOa = af.oa(context, 12.0f);
        int iOa2 = af.oa(context, 10.0f);
        int iOa3 = af.oa(context, 24.0f);
        setLayoutParams(new ViewGroup.LayoutParams(-1, af.oa(context, 44.0f)));
        setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar = new com.bytedance.sdk.openadsdk.core.ivm.moa(context);
        moaVar.setId(520093720);
        moaVar.setClickable(true);
        moaVar.setFocusable(true);
        moaVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.dj.uef(context, "tt_leftbackicon_selector"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iOa3, iOa3);
        layoutParams.setMargins(iOa, iOa2, 0, iOa2);
        layoutParams.gravity = (uef(context) ? 5 : 3) | 16;
        addView(moaVar, layoutParams);
        if (uef(context)) {
            moaVar.setImageResource(com.bytedance.sdk.component.utils.orq.moa(context, "tt_titlebar_forward"));
        }
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar2 = new com.bytedance.sdk.openadsdk.core.ivm.moa(context);
        moaVar2.setId(com.bytedance.sdk.openadsdk.utils.bs.ot);
        moaVar2.setClickable(true);
        moaVar2.setFocusable(true);
        moaVar2.setImageResource(com.bytedance.sdk.component.utils.orq.moa(context, "tt_history_titlebar_delete"));
        moaVar2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iOa3, iOa3);
        layoutParams2.setMargins(0, iOa2, iOa, iOa2);
        layoutParams2.gravity = (uef(context) ? 3 : 5) | 16;
        addView(moaVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        bccVar.setId(com.bytedance.sdk.openadsdk.utils.bs.uu);
        bccVar.setSingleLine(true);
        bccVar.setText(context.getString(com.bytedance.sdk.component.utils.orq.oa(context, "tt_history_title")));
        bccVar.setEllipsize(TextUtils.TruncateAt.END);
        int i5 = Build.VERSION.SDK_INT;
        bccVar.setTextAppearance(R.style.TextAppearance.Material.Medium);
        Typeface typefaceCreate = i5 >= 28 ? Typeface.create(bccVar.getTypeface(), 500, false) : null;
        if (typefaceCreate != null) {
            bccVar.setTypeface(typefaceCreate);
        }
        bccVar.setGravity(17);
        bccVar.setTextColor(-16777216);
        bccVar.setTextSize(1, 17.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        addView(bccVar, layoutParams3);
    }

    private boolean uef(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    private boolean uef(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (char c10 : str.toCharArray()) {
            if (Character.getDirectionality(c10) == 1 || Character.getDirectionality(c10) == 2) {
                return true;
            }
        }
        return false;
    }
}
