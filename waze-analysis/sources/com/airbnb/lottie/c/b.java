package com.airbnb.lottie.c;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.airbnb.lottie.g.c;
import com.airbnb.lottie.g.k;
import com.airbnb.lottie.t;
import java.io.IOException;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f2092a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Context f2093b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2094c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f2095d;

    public b(Drawable.Callback callback, String str, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f2094c = str;
        } else {
            this.f2094c = String.valueOf(str).concat(DomExceptionUtils.SEPARATOR);
        }
        this.f2095d = map;
        if (callback instanceof View) {
            this.f2093b = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f2093b = null;
        }
    }

    private final void c(String str, Bitmap bitmap) {
        synchronized (f2092a) {
            ((t) this.f2095d.get(str)).g(bitmap);
        }
    }

    public final Bitmap a(String str) {
        t tVar = (t) this.f2095d.get(str);
        if (tVar != null) {
            Bitmap bitmapC = tVar.c();
            if (bitmapC != null) {
                return bitmapC;
            }
            Context context = this.f2093b;
            if (context != null) {
                String strE = tVar.e();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (strE.startsWith("data:") && strE.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(strE.substring(strE.indexOf(44) + 1), 0);
                        Bitmap bitmapD = k.d(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options), tVar.b(), tVar.a());
                        c(str, bitmapD);
                        return bitmapD;
                    } catch (IllegalArgumentException e2) {
                        c.b("data URL did not have correct base64 format.", e2);
                        return null;
                    }
                }
                try {
                    String str2 = this.f2094c;
                    if (TextUtils.isEmpty(str2)) {
                        throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                    }
                    try {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(str2 + strE), null, options);
                        if (bitmapDecodeStream != null) {
                            Bitmap bitmapD2 = k.d(bitmapDecodeStream, tVar.b(), tVar.a());
                            c(str, bitmapD2);
                            return bitmapD2;
                        }
                        c.a("Decoded image `" + str + "` is null.");
                        return null;
                    } catch (IllegalArgumentException e3) {
                        c.b("Unable to decode image `" + str + "`.", e3);
                        return null;
                    }
                } catch (IOException e4) {
                    c.b("Unable to open asset.", e4);
                }
            }
        }
        return null;
    }

    public final boolean b(Context context) {
        Context context2 = this.f2093b;
        if (context2 instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == context2;
    }
}
