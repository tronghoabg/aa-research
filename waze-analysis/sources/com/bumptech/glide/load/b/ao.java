package com.bumptech.glide.load.b;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.android.gms.common.api.internal.be;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ao implements ad {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f3227a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f3228b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f3229c;

    public ao(Object obj, Object obj2, int i2) {
        this.f3227a = i2;
        this.f3229c = obj;
        this.f3228b = obj2;
    }

    private final Uri c(Integer num) throws Resources.NotFoundException {
        try {
            return Uri.parse("android.resource://" + ((Resources) this.f3229c).getResourcePackageName(num.intValue()) + DomExceptionUtils.SEPARATOR + num);
        } catch (Resources.NotFoundException e2) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Objects.toString(num);
            Log.w("ResourceLoader", "Received invalid resource id: ".concat(String.valueOf(num)), e2);
            return null;
        }
    }

    @Override // com.bumptech.glide.load.b.ad
    public final /* synthetic */ boolean a(Object obj) {
        if (this.f3227a != 0) {
            Uri uri = (Uri) obj;
            return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.bumptech.glide.load.b.ad, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.bumptech.glide.load.b.a, java.lang.Object] */
    @Override // com.bumptech.glide.load.b.ad
    public final /* synthetic */ be b(Object obj, int i2, int i3, com.bumptech.glide.load.s sVar) throws Resources.NotFoundException {
        if (this.f3227a != 0) {
            Uri uri = (Uri) obj;
            return new be(new com.bumptech.glide.f.d(uri), this.f3228b.a((AssetManager) this.f3229c, uri.toString().substring(22)));
        }
        Uri uriC = c((Integer) obj);
        if (uriC == null) {
            return null;
        }
        return this.f3228b.b(uriC, i2, i3, sVar);
    }
}
