package com.bytedance.sdk.component.lw.oa.oa;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.lw.oa.yo.oa.uef;
import com.bytedance.sdk.component.lw.oib;
import com.bytedance.sdk.component.utils.dj;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;

/* loaded from: classes.dex */
public class moa<T> implements ivm {
    private void oa(final com.bytedance.sdk.component.lw.oa.yo.yo yoVar, final byte[] bArr, final com.bytedance.sdk.component.lw.oa.yo.uef uefVar) {
        try {
            new com.bytedance.sdk.component.lw.oa.yo.oa.uef().uef(bArr, yoVar.ab(), new uef.InterfaceC0062uef() { // from class: com.bytedance.sdk.component.lw.oa.oa.moa.2
                @Override // com.bytedance.sdk.component.lw.oa.yo.oa.uef.InterfaceC0062uef
                public void uef(Drawable drawable) {
                    uefVar.uef(new com.bytedance.sdk.component.lw.oa.yo.moa().uef(yoVar, drawable, null, true));
                }

                @Override // com.bytedance.sdk.component.lw.oa.yo.oa.uef.InterfaceC0062uef
                public void uef() {
                    uefVar.uef(BackupConstant.SCENE_BACKUP_RENDER_FAIL, "decode gif fail", new Exception("decode gif fail"));
                }

                @Override // com.bytedance.sdk.component.lw.oa.yo.oa.uef.InterfaceC0062uef
                public void uef(byte[] bArr2) {
                    if (com.bytedance.sdk.component.utils.ivm.uef(bArr)) {
                        moa.this.uef(yoVar, bArr, true, uefVar);
                    } else {
                        uefVar.uef(1001, "result type is gif but data not image", new Exception("gif not image format"));
                    }
                }
            });
        } catch (Throwable th) {
            uefVar.uef(2000, "decode gif error", th);
        }
    }

    @Override // com.bytedance.sdk.component.lw.oa.oa.ivm
    public boolean uef(com.bytedance.sdk.component.lw.oa.yo.yo yoVar, oib oibVar, com.bytedance.sdk.component.lw.oa.yo.uef uefVar) {
        byte[] bArrCq = yoVar.cq();
        if (bArrCq == null) {
            uefVar.uef(2000, "imageData is empty", new Exception("imageData is empty"));
            return false;
        }
        int iDj = yoVar.dj();
        yoVar.uef(bArrCq.length);
        if (iDj == 2) {
            boolean z2 = (com.bytedance.sdk.component.utils.ivm.oa(bArrCq) || dj.uef(bArrCq, 0)) ? false : true;
            if (com.bytedance.sdk.component.utils.ivm.uef(bArrCq)) {
                uef(yoVar, bArrCq, z2, uefVar);
            } else {
                uefVar.uef(1001, "result type is bit but data not image", new Exception("not image format"));
            }
        } else if (iDj == 3) {
            uefVar.uef(new com.bytedance.sdk.component.lw.oa.yo.moa().uef(yoVar, bArrCq, null, com.bytedance.sdk.component.utils.ivm.oa(bArrCq)));
        } else if (com.bytedance.sdk.component.utils.ivm.oa(bArrCq)) {
            oa(yoVar, bArrCq, uefVar);
        } else if (dj.uef(bArrCq, 0)) {
            uef(yoVar, bArrCq, uefVar);
        } else if (com.bytedance.sdk.component.utils.ivm.uef(bArrCq)) {
            uef(yoVar, bArrCq, true, uefVar);
        } else {
            uefVar.uef(1001, "is not supprot image type", new Exception("not supprot image type"));
        }
        return false;
    }

    private void uef(final com.bytedance.sdk.component.lw.oa.yo.yo yoVar, final byte[] bArr, final com.bytedance.sdk.component.lw.oa.yo.uef uefVar) {
        try {
            new com.bytedance.sdk.component.lw.oa.yo.oa.uef().uef(bArr, new uef.InterfaceC0062uef() { // from class: com.bytedance.sdk.component.lw.oa.oa.moa.1
                @Override // com.bytedance.sdk.component.lw.oa.yo.oa.uef.InterfaceC0062uef
                public void uef(Drawable drawable) {
                    uefVar.uef(new com.bytedance.sdk.component.lw.oa.yo.moa().uef(yoVar, drawable, null, false));
                }

                @Override // com.bytedance.sdk.component.lw.oa.yo.oa.uef.InterfaceC0062uef
                public void uef() {
                    uefVar.uef(BackupConstant.SCENE_BACKUP_RENDER_FAIL, "decode webp animate fail", new Exception("decode webp animate fail"));
                }

                @Override // com.bytedance.sdk.component.lw.oa.yo.oa.uef.InterfaceC0062uef
                public void uef(byte[] bArr2) {
                    if (com.bytedance.sdk.component.utils.ivm.uef(bArr)) {
                        moa.this.uef(yoVar, bArr, true, uefVar);
                    } else {
                        uefVar.uef(1001, "result type is webp animated but data not image", new Exception("webp animated not image format"));
                    }
                }
            });
        } catch (Throwable th) {
            uefVar.uef(2000, "decode webp animation error", th);
        }
    }

    @Override // com.bytedance.sdk.component.lw.oa.oa.ivm
    public String uef() {
        return "decode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(com.bytedance.sdk.component.lw.oa.yo.yo yoVar, byte[] bArr, boolean z2, com.bytedance.sdk.component.lw.oa.yo.uef uefVar) {
        try {
            com.bytedance.sdk.component.lw.oa.yo.ivm ivmVarAb = yoVar.ab();
            Bitmap bitmapUef = ivmVarAb.uef(yoVar).uef(bArr, ivmVarAb);
            if (bitmapUef != null) {
                yoVar.bcc();
                yoVar.uef();
                bitmapUef.getWidth();
                bitmapUef.getHeight();
                bitmapUef.getByteCount();
                uefVar.uef(new com.bytedance.sdk.component.lw.oa.yo.moa().uef(yoVar, bitmapUef, null, false));
                if (z2) {
                    uef(yoVar.bs(), ivmVarAb, yoVar.bcc(), bitmapUef);
                    return;
                }
                return;
            }
            yoVar.bcc();
            yoVar.uef();
            uefVar.uef(BackupConstant.SCENE_BACKUP_RENDER_FAIL, "decode failed bitmap null", new Exception("decode failed bitmap null"));
        } catch (Throwable th) {
            yoVar.bcc();
            yoVar.uef();
            uefVar.uef(BackupConstant.SCENE_BACKUP_RENDER_FAIL, "decode failed:" + th.getMessage(), th);
        }
    }

    private void uef(com.bytedance.sdk.component.lw.oa oaVar, com.bytedance.sdk.component.lw.oa.yo.ivm ivmVar, String str, Bitmap bitmap) {
        if (oaVar == null || ivmVar == null || !oaVar.lw()) {
            return;
        }
        ivmVar.uef(oaVar).uef(str, bitmap);
    }
}
