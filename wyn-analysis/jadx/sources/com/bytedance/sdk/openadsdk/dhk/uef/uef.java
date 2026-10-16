package com.bytedance.sdk.openadsdk.dhk.uef;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.lw.ab;
import com.bytedance.sdk.component.lw.bcc;
import com.bytedance.sdk.component.lw.dj;
import com.bytedance.sdk.component.lw.zjm;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.zjm.moa;
import java.util.Map;

/* loaded from: classes3.dex */
public class uef {

    /* renamed from: com.bytedance.sdk.openadsdk.dhk.uef.uef$uef, reason: collision with other inner class name */
    public interface InterfaceC0116uef {
        void uef(int i5, String str, Throwable th);

        void uef(String str, oa oaVar);
    }

    public void uef(com.bytedance.sdk.openadsdk.dhk.uef uefVar, final InterfaceC0116uef interfaceC0116uef, int i5, int i10, ImageView.ScaleType scaleType, String str, final int i11, gzw gzwVar) {
        zjm zjmVarUef = moa.uef(uefVar.uef).uef(uefVar.f25885oa).uef(i5).oa(i10).lw(af.lw(sy.uef())).moa(af.yo(sy.uef())).oa(str).uef(scaleType).uef(!TextUtils.isEmpty(str));
        if (i11 <= 0 || Build.VERSION.SDK_INT < 26) {
            zjmVarUef.yo(1);
        } else {
            zjmVarUef.yo(2).uef(new bcc() { // from class: com.bytedance.sdk.openadsdk.dhk.uef.uef.1
                @Override // com.bytedance.sdk.component.lw.bcc
                public Bitmap uef(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.moa.uef.uef(sy.uef(), bitmap, i11);
                }
            });
        }
        zjmVarUef.uef(new com.bytedance.sdk.openadsdk.zjm.oa(gzwVar, uefVar.uef, new ab() { // from class: com.bytedance.sdk.openadsdk.dhk.uef.uef.2
            @Override // com.bytedance.sdk.component.lw.ab
            public void uef(dj djVar) {
                uef.this.uef(djVar, interfaceC0116uef);
            }

            @Override // com.bytedance.sdk.component.lw.ab
            public void uef(int i12, String str2, Throwable th) {
                uef.this.uef(i12, str2, th, interfaceC0116uef);
            }
        }));
    }

    public void uef(dj djVar, InterfaceC0116uef interfaceC0116uef) {
        if (interfaceC0116uef != null) {
            Object objOa = djVar.oa();
            int iUef = uef(djVar);
            if (objOa instanceof Drawable) {
                interfaceC0116uef.uef(djVar.uef(), new oa((Drawable) objOa, iUef));
                return;
            }
            if (objOa instanceof byte[]) {
                interfaceC0116uef.uef(djVar.uef(), new oa((byte[]) objOa, iUef));
                return;
            }
            if (objOa instanceof Bitmap) {
                interfaceC0116uef.uef(djVar.uef(), new oa((Bitmap) objOa, djVar.yo() instanceof Bitmap ? (Bitmap) djVar.yo() : null, iUef));
            } else {
                interfaceC0116uef.uef(0, "not bitmap or gif result!", null);
            }
        }
    }

    private int uef(dj djVar) {
        Object obj;
        Map<String, String> mapMoa = djVar.moa();
        if (mapMoa == null || (obj = mapMoa.get("image_size")) == null || !(obj instanceof Integer)) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    public void uef(int i5, String str, Throwable th, InterfaceC0116uef interfaceC0116uef) {
        if (interfaceC0116uef != null) {
            interfaceC0116uef.uef(i5, str, th);
        }
    }
}
