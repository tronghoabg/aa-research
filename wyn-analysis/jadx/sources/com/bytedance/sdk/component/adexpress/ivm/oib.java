package com.bytedance.sdk.component.adexpress.ivm;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class oib extends sy {
    private TextView uef;

    public oib(Context context, View view, int i5, int i10, int i11, JSONObject jSONObject) {
        super(context, view, i5, i10, i11, jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.ivm.sy
    public void setShakeText(String str) {
        if (this.uef == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.uef.setText(str);
            return;
        }
        try {
            this.uef.setText(com.bytedance.sdk.component.utils.orq.oa(this.uef.getContext(), "tt_splash_default_click_shake"));
        } catch (Exception e7) {
            e7.getMessage();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ivm.sy
    public void uef(Context context, View view) {
        addView(view);
        this.uef = (TextView) findViewById(2097610747);
    }
}
