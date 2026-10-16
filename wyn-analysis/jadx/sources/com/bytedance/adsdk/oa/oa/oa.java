package com.bytedance.adsdk.oa.oa;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.bytedance.adsdk.oa.ivm.ivm;
import com.bytedance.adsdk.oa.moa;
import com.bytedance.adsdk.oa.zjm;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public class oa {
    private static final Object uef = new Object();
    private final Map<String, zjm> lw;
    private moa moa;

    /* renamed from: oa, reason: collision with root package name */
    private final Context f24571oa;
    private final String yo;

    public oa(Drawable.Callback callback, String str, moa moaVar, Map<String, zjm> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.yo = str;
        } else {
            this.yo = str.concat("/");
        }
        this.lw = map;
        uef(moaVar);
        if (callback instanceof View) {
            this.f24571oa = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f24571oa = null;
        }
    }

    private Bitmap oa(String str, Bitmap bitmap) {
        synchronized (uef) {
            this.lw.get(str).uef(bitmap);
        }
        return bitmap;
    }

    public void uef(moa moaVar) {
        this.moa = moaVar;
    }

    public Bitmap uef(String str, Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap bitmapDj = this.lw.get(str).dj();
            oa(str, bitmap);
            return bitmapDj;
        }
        zjm zjmVar = this.lw.get(str);
        Bitmap bitmapDj2 = zjmVar.dj();
        zjmVar.uef(null);
        return bitmapDj2;
    }

    public Bitmap uef(String str) {
        zjm zjmVar = this.lw.get(str);
        if (zjmVar == null) {
            return null;
        }
        Bitmap bitmapDj = zjmVar.dj();
        if (bitmapDj != null) {
            return bitmapDj;
        }
        moa moaVar = this.moa;
        if (moaVar != null) {
            return moaVar.uef(zjmVar);
        }
        Context context = this.f24571oa;
        if (context == null) {
            return null;
        }
        String strCz = zjmVar.cz();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strCz.startsWith("data:") && strCz.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strCz.substring(strCz.indexOf(44) + 1), 0);
                return oa(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.yo)) {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.yo + strCz), null, options);
                    if (bitmapDecodeStream == null) {
                        return null;
                    }
                    return oa(str, ivm.uef(bitmapDecodeStream, zjmVar.uef(), zjmVar.oa()));
                } catch (IllegalArgumentException unused2) {
                    return null;
                }
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException unused3) {
            return null;
        }
    }

    public boolean uef(Context context) {
        return (context == null && this.f24571oa == null) || this.f24571oa.equals(context);
    }
}
