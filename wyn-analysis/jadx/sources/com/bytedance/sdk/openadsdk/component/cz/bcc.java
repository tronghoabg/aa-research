package com.bytedance.sdk.openadsdk.component.cz;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.widget.bs;
import com.bytedance.sdk.openadsdk.core.zjm;
import com.bytedance.sdk.openadsdk.utils.af;

/* loaded from: classes3.dex */
public class bcc {

    /* renamed from: oa, reason: collision with root package name */
    private static Drawable f25325oa;
    private static boolean uef;
    private TextView moa;
    private bs yo;

    public static Drawable yo() {
        return f25325oa;
    }

    public void oa() {
        if (uef) {
            return;
        }
        try {
            int iCz = zjm.oa().cz();
            if (iCz != 0) {
                f25325oa = sy.uef().getResources().getDrawable(iCz);
            }
            uef = true;
        } catch (Throwable unused) {
            uef = true;
        }
    }

    public void uef(yo yoVar, gzw gzwVar, float f10, float f11, boolean z2) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (yoVar != null) {
            this.yo = yoVar.getHostAppIcon();
            this.moa = yoVar.getHostAppName();
            View userInfo = yoVar.getUserInfo();
            if (yoVar instanceof moa) {
                bs bsVar = this.yo;
                if (bsVar != null && (layoutParams2 = bsVar.getLayoutParams()) != null) {
                    if (gzwVar.cgg() == 1) {
                        int iOa = af.oa(this.yo.getContext(), 40.0f);
                        layoutParams2.width = iOa;
                        layoutParams2.height = iOa;
                    } else {
                        int iOa2 = af.oa(this.yo.getContext(), 30.0f);
                        layoutParams2.width = iOa2;
                        layoutParams2.height = iOa2;
                    }
                    this.yo.setLayoutParams(layoutParams2);
                }
                if (this.moa != null) {
                    if (gzwVar.cgg() == 1) {
                        this.moa.setTextSize(30.0f);
                    } else {
                        this.moa.setTextSize(24.0f);
                    }
                }
                if (userInfo != null && (layoutParams = userInfo.getLayoutParams()) != null) {
                    if (gzwVar.cgg() == 1) {
                        layoutParams.height = af.oa(userInfo.getContext(), 107.0f);
                    } else {
                        layoutParams.height = af.oa(userInfo.getContext(), 60.0f);
                    }
                    userInfo.setLayoutParams(layoutParams);
                }
            }
            if (userInfo != null) {
                userInfo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.cz.bcc.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
            }
        }
    }

    public void uef() {
        String strBcc = zjm.oa().bcc();
        if (TextUtils.isEmpty(strBcc)) {
            this.moa.setVisibility(8);
        } else {
            this.moa.setText(strBcc);
        }
        oa();
        try {
            Drawable drawable = f25325oa;
            if (drawable == null) {
                this.yo.setVisibility(8);
                return;
            }
            this.yo.setImageDrawable(drawable);
            if (this.moa.getVisibility() == 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.yo.getLayoutParams();
                marginLayoutParams.setMargins(0, 0, 0, 0);
                this.yo.setLayoutParams(marginLayoutParams);
            }
        } catch (Throwable unused) {
            this.yo.setVisibility(8);
        }
    }
}
