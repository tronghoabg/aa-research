package com.bytedance.adsdk.ugeno.cz.xs;

import android.content.Context;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class uef extends com.bytedance.adsdk.ugeno.oa.uef<com.bytedance.adsdk.ugeno.cz.oa.uef> {
    public uef(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.oa.uef, com.bytedance.adsdk.ugeno.oa.yo
    public void oa() throws JSONException {
        super.oa();
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public void uef(String str, String str2) {
        super.uef(str, str2);
        str.getClass();
        switch (str) {
            case "onVideoProgress":
            case "onVideoFinish":
            case "onVideoPlay":
            case "onVideoResume":
            case "onVideoPause":
                oa(str, str2);
                break;
        }
    }
}
