package com.bytedance.sdk.component.lw.oa.yo.oa;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.sdk.component.lw.oa.yo.ivm;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.xs;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class uef {

    /* renamed from: com.bytedance.sdk.component.lw.oa.yo.oa.uef$uef, reason: collision with other inner class name */
    public interface InterfaceC0062uef {
        void uef();

        void uef(Drawable drawable);

        void uef(byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(byte[] bArr, ivm ivmVar, InterfaceC0062uef interfaceC0062uef) {
        File fileUef;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileUef = xs.uef(ivmVar.uef(), "P_GIF_CACHE", "P_U_GIF_FILE");
            fileOutputStream = new FileOutputStream(fileUef);
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(bArr, 0, bArr.length);
            if (Build.VERSION.SDK_INT >= 28) {
                Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(fileUef));
                if (interfaceC0062uef != null) {
                    interfaceC0062uef.uef(drawableDecodeDrawable);
                }
            } else if (interfaceC0062uef != null) {
                interfaceC0062uef.uef(bArr);
            }
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            try {
                dhk.uef("PAGGifDefaultDecoder", "Gif  getSourceByFile fail : ", th);
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Throwable unused2) {
                    }
                }
                if (interfaceC0062uef != null) {
                    interfaceC0062uef.uef();
                }
            } catch (Throwable th3) {
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Throwable unused3) {
                    }
                }
                throw th3;
            }
        }
    }

    public void uef(byte[] bArr, ivm ivmVar, InterfaceC0062uef interfaceC0062uef) {
        if (Build.VERSION.SDK_INT <= 30) {
            uef(bArr, interfaceC0062uef, ivmVar);
        } else {
            uef(bArr, interfaceC0062uef);
        }
    }

    public void uef(byte[] bArr, InterfaceC0062uef interfaceC0062uef) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT < 28) {
            if (interfaceC0062uef != null) {
                interfaceC0062uef.uef(bArr);
                return;
            }
            return;
        }
        try {
            Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(byteBufferWrap));
            if (interfaceC0062uef != null) {
                interfaceC0062uef.uef(drawableDecodeDrawable);
            }
        } catch (Throwable th) {
            dhk.yo("PAGGifDefaultDecoder", th.getMessage());
            if (interfaceC0062uef != null) {
                interfaceC0062uef.uef();
            }
        }
    }

    private void uef(final byte[] bArr, final InterfaceC0062uef interfaceC0062uef, final ivm ivmVar) {
        try {
            ivmVar.bcc().submit(new Runnable() { // from class: com.bytedance.sdk.component.lw.oa.yo.oa.uef.1
                @Override // java.lang.Runnable
                public void run() {
                    uef.this.oa(bArr, ivmVar, interfaceC0062uef);
                }
            });
        } catch (Throwable th) {
            dhk.yo("PAGGifDefaultDecoder", th.getMessage());
            if (interfaceC0062uef != null) {
                interfaceC0062uef.uef();
            }
        }
    }
}
