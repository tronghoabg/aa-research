package com.bytedance.sdk.component.adexpress.dynamic.oa;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.moa.xs;

/* loaded from: classes.dex */
public class uef {
    public static int uef(xs xsVar) {
        if (xsVar == null) {
            return 0;
        }
        String strPu = xsVar.pu();
        String strGsd = xsVar.gsd();
        if (TextUtils.isEmpty(strGsd) || TextUtils.isEmpty(strPu) || !strGsd.equals("creative")) {
            return 0;
        }
        if (strPu.equals("shake")) {
            return 2;
        }
        if (strPu.equals("twist")) {
            return 3;
        }
        return strPu.equals("slide") ? 1 : 0;
    }
}
