package com.bytedance.sdk.component.adexpress.ivm;

import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ivm extends tpx {
    private oib uef;

    public ivm(Context context, int i5, int i10, int i11, JSONObject jSONObject) {
        super(context);
        uef(context, i5, i10, i11, jSONObject);
    }

    private void uef(Context context, int i5, int i10, int i11, JSONObject jSONObject) {
        oib oibVar = new oib(context, com.bytedance.sdk.component.adexpress.yo.uef.yo(context), i5, i10, i11, jSONObject);
        this.uef = oibVar;
        addView(oibVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.uef.setLayoutParams(layoutParams);
    }

    public oib getShakeView() {
        return this.uef;
    }

    public void setShakeText(String str) {
        if (this.uef == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.uef.setShakeText("");
        } else {
            this.uef.setShakeText(str);
        }
    }
}
