package com.bytedance.sdk.component.lw.oa.yo;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.lw.cq;
import com.bytedance.sdk.component.lw.oa.yo.yo;
import com.bytedance.sdk.component.lw.sy;
import com.bytedance.sdk.component.lw.wk;
import com.bytedance.sdk.component.lw.zjm;
import com.bytedance.sdk.component.utils.ab;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public class oa implements wk {
    private volatile ivm uef;

    private oa() {
    }

    private void oa(Context context, cq cqVar) {
        if (this.uef != null) {
            Log.w("ImageLoader", "already init!");
        }
        if (cqVar == null) {
            cqVar = lw.uef(context);
        }
        this.uef = new ivm(context, cqVar);
    }

    public static wk uef(Context context, cq cqVar) {
        oa oaVar = new oa();
        oaVar.oa(context, cqVar);
        return oaVar;
    }

    @Override // com.bytedance.sdk.component.lw.wk
    public zjm uef(String str) {
        return new yo.oa(this.uef).yo(str);
    }

    @Override // com.bytedance.sdk.component.lw.wk
    public InputStream uef(String str, String str2) throws NoSuchAlgorithmException {
        byte[] bArrUef;
        if (this.uef != null) {
            if (TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                str2 = ab.uef(str);
            }
            sy syVarYo = this.uef.yo();
            if (syVarYo != null && (bArrUef = syVarYo.uef(str2)) != null) {
                return new ByteArrayInputStream(bArrUef);
            }
            Collection<com.bytedance.sdk.component.lw.yo> collectionMoa = this.uef.moa();
            if (collectionMoa != null) {
                Iterator<com.bytedance.sdk.component.lw.yo> it = collectionMoa.iterator();
                while (it.hasNext()) {
                    InputStream inputStreamUef = it.next().uef(str2);
                    if (inputStreamUef != null) {
                        return inputStreamUef;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.lw.wk
    public boolean uef(String str, String str2, String str3) throws NoSuchAlgorithmException {
        if (this.uef == null || TextUtils.isEmpty(str3)) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            str2 = ab.uef(str);
        }
        com.bytedance.sdk.component.lw.yo yoVarUef = this.uef.uef(str3);
        if (yoVarUef != null) {
            return yoVarUef.oa(str2);
        }
        return false;
    }
}
