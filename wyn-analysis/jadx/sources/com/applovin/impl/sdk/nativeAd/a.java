package com.applovin.impl.sdk.nativeAd;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.f2;
import com.applovin.impl.j5;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.UUID;

/* loaded from: classes.dex */
public class a extends j5 {

    /* renamed from: g, reason: collision with root package name */
    private final AppLovinNativeAdImpl f23121g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC0022a f23122h;

    /* renamed from: i, reason: collision with root package name */
    private final String f23123i;

    /* renamed from: com.applovin.impl.sdk.nativeAd.a$a, reason: collision with other inner class name */
    public interface InterfaceC0022a {
        void a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public a(AppLovinNativeAdImpl appLovinNativeAdImpl, k kVar, InterfaceC0022a interfaceC0022a) {
        super("TaskCacheNativeAd", kVar);
        this.f23123i = UUID.randomUUID().toString();
        this.f23121g = appLovinNativeAdImpl;
        this.f23122h = interfaceC0022a;
    }

    private float a(Uri uri) throws IOException {
        FileInputStream fileInputStream;
        int i5;
        int i10;
        File file = new File(uri.getPath());
        if (!file.exists()) {
            return -1.0f;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(fileInputStream, null, options);
                i5 = options.outWidth;
                i10 = options.outHeight;
            } finally {
            }
        } catch (IOException e7) {
            if (o.a()) {
                this.f21768c.a(this.f21767b, "Failed to calculate aspect ratio", e7);
            }
        }
        if (i5 <= 0 || i10 <= 0) {
            fileInputStream.close();
            return -1.0f;
        }
        float f10 = i5 / i10;
        fileInputStream.close();
        return f10;
    }

    private Uri b(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (o.a()) {
            this.f21768c.a(this.f21767b, "Attempting to cache resource: " + uri);
        }
        String strA = this.f21766a.G().a(a(), uri.toString(), this.f23121g.getCachePrefix(), Collections.EMPTY_LIST, false, false, 1, this.f23123i, f2.a(this.f23121g));
        if (TextUtils.isEmpty(strA)) {
            if (o.a()) {
                this.f21768c.b(this.f21767b, "Unable to cache resource for uri: " + uri);
            }
            return null;
        }
        File fileA = this.f21766a.G().a(strA, a());
        if (fileA != null) {
            Uri uriFromFile = Uri.fromFile(fileA);
            if (uriFromFile != null) {
                return uriFromFile;
            }
            if (o.a()) {
                this.f21768c.b(this.f21767b, "Unable to extract Uri from image file");
            }
            return null;
        }
        if (o.a()) {
            this.f21768c.b(this.f21767b, "Unable to retrieve File from cached image filename = " + strA);
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() throws IOException {
        if (o.a()) {
            this.f21768c.a(this.f21767b, "Begin caching ad #" + this.f23121g.getAdIdNumber() + "...");
        }
        Uri uriB = b(this.f23121g.getIconUri());
        if (uriB != null) {
            this.f23121g.setIconUri(uriB);
        }
        Uri uriB2 = b(this.f23121g.getMainImageUri());
        if (uriB2 != null) {
            this.f23121g.setMainImageUri(uriB2);
            float fA = a(uriB2);
            if (fA > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.f23121g.setMainImageAspectRatio(fA);
            }
        }
        Uri uriB3 = b(this.f23121g.getPrivacyIconUri());
        if (uriB3 != null) {
            this.f23121g.setPrivacyIconUri(uriB3);
        }
        if (o.a()) {
            this.f21768c.a(this.f21767b, "Finished caching ad #" + this.f23121g.getAdIdNumber());
        }
        this.f23122h.a(this.f23121g);
    }
}
