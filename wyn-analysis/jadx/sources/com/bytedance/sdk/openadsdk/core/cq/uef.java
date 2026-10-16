package com.bytedance.sdk.openadsdk.core.cq;

import A0.j;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.uef;
import com.bytedance.sdk.component.lw.ab;
import com.bytedance.sdk.component.lw.dj;
import com.bytedance.sdk.component.lw.oa.yo.ivm;
import com.bytedance.sdk.component.lw.oa.yo.lw;
import com.bytedance.sdk.component.lw.zjm;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.xs;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.utils.km;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Map;

/* loaded from: classes3.dex */
public class uef implements com.bytedance.adsdk.ugeno.uef {

    public static class oa implements ab {
        private final int moa;

        /* renamed from: oa, reason: collision with root package name */
        private final uef f25551oa;
        private final WeakReference<ImageView> uef;
        private final int yo;

        public oa(ImageView imageView, uef uefVar, int i5, int i10) {
            this.uef = new WeakReference<>(imageView);
            this.f25551oa = uefVar;
            this.yo = i5;
            this.moa = i10;
        }

        @Override // com.bytedance.sdk.component.lw.ab
        public void uef(int i5, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.lw.ab
        public void uef(dj djVar) {
            try {
                final ImageView imageView = this.uef.get();
                if (imageView == null) {
                    return;
                }
                final Object objOa = djVar.oa();
                if (objOa instanceof Drawable) {
                    km.uef((Runnable) new com.bytedance.sdk.component.bcc.oa.yo("load_draw_img") { // from class: com.bytedance.sdk.openadsdk.core.cq.uef.oa.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28 && j.B(objOa)) {
                                j.k(objOa).start();
                            }
                            imageView.setImageDrawable((Drawable) objOa);
                        }
                    });
                    return;
                }
                if (!(objOa instanceof byte[])) {
                    if (objOa instanceof Bitmap) {
                        km.uef((Runnable) new com.bytedance.sdk.component.bcc.oa.yo("ug_load_bitmap") { // from class: com.bytedance.sdk.openadsdk.core.cq.uef.oa.3
                            @Override // java.lang.Runnable
                            public void run() {
                                imageView.setImageBitmap((Bitmap) objOa);
                            }
                        });
                    }
                } else {
                    if (djVar.lw()) {
                        if (Build.VERSION.SDK_INT <= 30) {
                            this.f25551oa.uef((byte[]) objOa, imageView);
                            return;
                        } else {
                            this.f25551oa.uef(imageView, (byte[]) objOa, this.yo, this.moa);
                            return;
                        }
                    }
                    if (this.f25551oa.uef((byte[]) objOa)) {
                        this.f25551oa.uef(imageView, (byte[]) objOa, this.yo, this.moa);
                        return;
                    }
                    final Bitmap bitmapUef = new com.bytedance.sdk.component.lw.oa.yo.oa.oa(this.yo, this.moa, imageView.getScaleType(), Bitmap.Config.RGB_565, this.yo, this.moa).uef((byte[]) objOa, new ivm(sy.uef(), new lw.uef().uef(com.bytedance.sdk.openadsdk.zjm.moa.oa()).uef()));
                    if (bitmapUef != null) {
                        km.uef((Runnable) new com.bytedance.sdk.component.bcc.oa.yo("load_static_img") { // from class: com.bytedance.sdk.openadsdk.core.cq.uef.oa.2
                            @Override // java.lang.Runnable
                            public void run() {
                                imageView.setImageBitmap(bitmapUef);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                dhk.yo("ImageLoaderProvider", th.getMessage());
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.cq.uef$uef, reason: collision with other inner class name */
    public interface InterfaceC0087uef {
        void uef(Drawable drawable);
    }

    private void oa(final ImageView imageView, byte[] bArr, int i5, int i10) {
        final Bitmap bitmapUef = new com.bytedance.sdk.component.lw.oa.yo.oa.oa(i5, i10, imageView.getScaleType(), Bitmap.Config.ARGB_4444, i5, i10).uef(bArr, new ivm(sy.uef(), new lw.uef().uef(com.bytedance.sdk.openadsdk.zjm.moa.oa()).uef()));
        if (bitmapUef != null) {
            km.uef((Runnable) new com.bytedance.sdk.component.bcc.oa.yo("loadStaticImage") { // from class: com.bytedance.sdk.openadsdk.core.cq.uef.2
                @Override // java.lang.Runnable
                public void run() {
                    imageView.setImageBitmap(bitmapUef);
                }
            });
        }
    }

    @Override // com.bytedance.adsdk.ugeno.uef
    public void uef(com.bytedance.adsdk.ugeno.core.dj djVar, String str, ImageView imageView, int i5, int i10, uef.InterfaceC0044uef interfaceC0044uef) {
        String strUef = moa.uef(str);
        zjm zjmVarYo = com.bytedance.sdk.openadsdk.zjm.moa.uef(strUef).yo(1);
        uef(djVar, zjmVarYo, strUef);
        zjmVarYo.uef(new oa(imageView, this, i5, i10), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable oa(byte[] bArr) {
        FileOutputStream fileOutputStream;
        File fileUef;
        try {
            fileUef = xs.uef(sy.uef(), "UGEN_GIF_CACHE", "TT_UGEN_GIF_FILE");
            fileOutputStream = new FileOutputStream(fileUef);
        } catch (Throwable th) {
            th = th;
            fileOutputStream = null;
        }
        try {
            fileOutputStream.write(bArr, 0, bArr.length);
            if (Build.VERSION.SDK_INT >= 28) {
                Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(fileUef));
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                return drawableDecodeDrawable;
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(sy.uef().getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            try {
                fileOutputStream.close();
            } catch (Throwable unused2) {
            }
            return bitmapDrawable;
        } catch (Throwable th2) {
            th = th2;
            try {
                dhk.uef("ImageLoaderProvider", "GifView  getSourceByFile fail : ", th);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused3) {
                    }
                }
                return null;
            } catch (Throwable th3) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused4) {
                    }
                }
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(final ImageView imageView, byte[] bArr, int i5, int i10) throws IOException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                final Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(byteBufferWrap));
                if (drawableDecodeDrawable != null) {
                    km.uef((Runnable) new com.bytedance.sdk.component.bcc.oa.yo("loadAnimatedDrawable") { // from class: com.bytedance.sdk.openadsdk.core.cq.uef.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (j.B(drawableDecodeDrawable)) {
                                j.k(drawableDecodeDrawable).start();
                            }
                            imageView.setImageDrawable(drawableDecodeDrawable);
                        }
                    });
                    return;
                }
                return;
            } catch (IOException e7) {
                dhk.yo("ImageLoaderProvider", e7.getMessage());
                return;
            }
        }
        oa(imageView, bArr, i5, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(byte[] bArr, final ImageView imageView) {
        try {
            uef(bArr, new InterfaceC0087uef() { // from class: com.bytedance.sdk.openadsdk.core.cq.uef.3
                @Override // com.bytedance.sdk.openadsdk.core.cq.uef.InterfaceC0087uef
                public void uef(final Drawable drawable) {
                    km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cq.uef.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28 && j.B(drawable)) {
                                j.k(drawable).start();
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            });
        } catch (Exception e7) {
            dhk.yo("ImageLoaderProvider", e7.getMessage());
        }
    }

    private void uef(final byte[] bArr, final InterfaceC0087uef interfaceC0087uef) {
        km.yo((Runnable) new com.bytedance.sdk.component.bcc.oa.yo("pag_animation_drawable") { // from class: com.bytedance.sdk.openadsdk.core.cq.uef.4
            @Override // java.lang.Runnable
            public void run() {
                Drawable drawableOa = uef.this.oa(bArr);
                InterfaceC0087uef interfaceC0087uef2 = interfaceC0087uef;
                if (interfaceC0087uef2 != null) {
                    interfaceC0087uef2.uef(drawableOa);
                }
            }
        });
    }

    public void oa(com.bytedance.adsdk.ugeno.core.dj djVar, String str, final uef.InterfaceC0044uef interfaceC0044uef) {
        zjm zjmVarYo = com.bytedance.sdk.openadsdk.zjm.moa.uef(str).yo(2);
        uef(djVar, zjmVarYo, str);
        zjmVarYo.uef(new ab() { // from class: com.bytedance.sdk.openadsdk.core.cq.uef.5
            @Override // com.bytedance.sdk.component.lw.ab
            public void uef(dj djVar2) {
                if (djVar2 == null) {
                    interfaceC0044uef.uef(null);
                    return;
                }
                if (interfaceC0044uef != null) {
                    Object objOa = djVar2.oa();
                    if (objOa instanceof Bitmap) {
                        interfaceC0044uef.uef((Bitmap) objOa);
                        return;
                    }
                    if (djVar2.oa() instanceof byte[]) {
                        try {
                            interfaceC0044uef.uef(BitmapFactory.decodeByteArray((byte[]) djVar2.oa(), 0, ((byte[]) djVar2.oa()).length));
                            return;
                        } catch (Throwable unused) {
                        }
                    }
                    interfaceC0044uef.uef(null);
                }
            }

            @Override // com.bytedance.sdk.component.lw.ab
            public void uef(int i5, String str2, Throwable th) {
                uef.InterfaceC0044uef interfaceC0044uef2 = interfaceC0044uef;
                if (interfaceC0044uef2 != null) {
                    interfaceC0044uef2.uef(null);
                }
            }
        }, 4);
    }

    public boolean uef(byte[] bArr) {
        return com.bytedance.sdk.component.utils.dj.uef(bArr, 0);
    }

    @Override // com.bytedance.adsdk.ugeno.uef
    public void uef(com.bytedance.adsdk.ugeno.core.dj djVar, String str, uef.InterfaceC0044uef interfaceC0044uef) {
        oa(djVar, moa.uef(str), interfaceC0044uef);
    }

    private void uef(com.bytedance.adsdk.ugeno.core.dj djVar, zjm zjmVar, String str) {
        Map<String, Object> mapOa;
        if (djVar == null || (mapOa = djVar.oa()) == null) {
            return;
        }
        Object obj = mapOa.get("image_info");
        if (obj instanceof Map) {
            zjmVar.uef((String) ((Map) obj).get(str));
        }
        String str2 = (String) mapOa.get("cache_dir");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zjmVar.oa(str2);
    }
}
