package com.bytedance.adsdk.ugeno.cz.yo;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.cz.moa.yo;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class uef extends yo {
    private int syr;

    public uef(Context context) {
        super(context);
        this.syr = -16777216;
    }

    private String wk(String str) {
        String strCq = cq(str);
        return TextUtils.isEmpty(strCq) ? "" : "local://".concat(String.valueOf(strCq));
    }

    public abstract String cq(String str);

    @Override // com.bytedance.adsdk.ugeno.cz.moa.yo, com.bytedance.adsdk.ugeno.oa.yo
    public void oa() throws JSONException, NumberFormatException {
        ((yo) this).uef = wk(((yo) this).uef);
        super.oa();
        ((com.bytedance.adsdk.ugeno.cz.moa.uef) this.lw).setColorFilter(this.syr);
        ((com.bytedance.adsdk.ugeno.cz.moa.uef) this.lw).setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    @Override // com.bytedance.adsdk.ugeno.cz.moa.yo, com.bytedance.adsdk.ugeno.oa.yo
    public void uef(String str, String str2) {
        super.uef(str, str2);
        str.getClass();
        if (str.equals("textColor")) {
            this.syr = com.bytedance.adsdk.ugeno.xs.uef.uef(str2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.cz.moa.yo
    public String yo() {
        return "drawable";
    }
}
