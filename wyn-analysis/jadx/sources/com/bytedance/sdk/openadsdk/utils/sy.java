package com.bytedance.sdk.openadsdk.utils;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.dhk.uef.uef;
import j$.util.Objects;

/* loaded from: classes3.dex */
public class sy {

    public interface uef {
        void uef();

        void uef(com.bytedance.sdk.openadsdk.dhk.uef.oa oaVar);
    }

    public static void uef(com.bytedance.sdk.openadsdk.dhk.uef uefVar, int i5, int i10, uef uefVar2, String str) {
        uef(uefVar, i5, i10, uefVar2, str, 0);
    }

    public static void uef(com.bytedance.sdk.openadsdk.dhk.uef uefVar, int i5, int i10, final uef uefVar2, String str, int i11) {
        Objects.toString(uefVar);
        com.bytedance.sdk.openadsdk.dhk.oa.oa().moa().uef(uefVar, new uef.InterfaceC0116uef() { // from class: com.bytedance.sdk.openadsdk.utils.sy.1
            @Override // com.bytedance.sdk.openadsdk.dhk.uef.uef.InterfaceC0116uef
            public void uef(String str2, com.bytedance.sdk.openadsdk.dhk.uef.oa oaVar) {
                uef uefVar3;
                if (oaVar.lw() && (uefVar3 = uefVar2) != null) {
                    uefVar3.uef(oaVar);
                    return;
                }
                uef uefVar4 = uefVar2;
                if (uefVar4 != null) {
                    uefVar4.uef();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.dhk.uef.uef.InterfaceC0116uef
            public void uef(int i12, String str2, Throwable th) {
                uef uefVar3 = uefVar2;
                if (uefVar3 != null) {
                    uefVar3.uef();
                }
            }
        }, i5, i10, ImageView.ScaleType.CENTER_INSIDE, str, i11, null);
    }

    public static Drawable uef(byte[] bArr, int i5) {
        if (bArr != null && bArr.length > 0) {
            try {
                return new BitmapDrawable(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            } catch (Throwable unused) {
                return new ColorDrawable(0);
            }
        }
        return new ColorDrawable(0);
    }
}
