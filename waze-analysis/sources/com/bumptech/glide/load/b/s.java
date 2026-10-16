package com.bumptech.glide.load.b;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.be;
import java.io.File;
import java.net.URL;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class s implements ad {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f3271a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f3272b;

    public s(Context context, int i2, byte[] bArr) {
        this.f3271a = i2;
        this.f3272b = context.getApplicationContext();
    }

    private static Uri c(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // com.bumptech.glide.load.b.ad
    public final /* synthetic */ boolean a(Object obj) {
        int i2 = this.f3271a;
        if (i2 == 0) {
            return true;
        }
        if (i2 == 1) {
            return true;
        }
        if (i2 == 2) {
            return com.bumptech.glide.load.n.m((Uri) obj);
        }
        if (i2 == 3) {
            return true;
        }
        if (i2 == 4) {
            return com.bumptech.glide.load.n.k((Uri) obj);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.bumptech.glide.load.b.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.bumptech.glide.load.b.ad, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.bumptech.glide.load.b.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.bumptech.glide.load.b.ad, java.lang.Object] */
    @Override // com.bumptech.glide.load.b.ad
    public final /* synthetic */ be b(Object obj, int i2, int i3, com.bumptech.glide.load.s sVar) {
        Uri uriC;
        int i4 = this.f3271a;
        if (i4 == 0) {
            File file = (File) obj;
            return new be(new com.bumptech.glide.f.d(file), new p(file, this.f3272b));
        }
        if (i4 == 1) {
            byte[] bArr = (byte[]) obj;
            return new be(new com.bumptech.glide.f.d(bArr), new d(bArr, this.f3272b));
        }
        if (i4 == 2) {
            Uri uri = (Uri) obj;
            return new be(new com.bumptech.glide.f.d(uri), new z((Context) this.f3272b, uri));
        }
        if (i4 != 3) {
            if (i4 != 4) {
                return this.f3272b.b(new t((URL) obj), i2, i3, sVar);
            }
            Uri uri2 = (Uri) obj;
            if (com.bumptech.glide.load.n.o(i2, i3)) {
                return new be(new com.bumptech.glide.f.d(uri2), com.bumptech.glide.load.data.a.c.b((Context) this.f3272b, uri2));
            }
            return null;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            uriC = null;
        } else if (str.charAt(0) == '/') {
            uriC = c(str);
        } else {
            Uri uri3 = Uri.parse(str);
            uriC = uri3.getScheme() == null ? c(str) : uri3;
        }
        if (uriC != null) {
            ?? r3 = this.f3272b;
            if (r3.a(uriC)) {
                return r3.b(uriC, i2, i3, sVar);
            }
        }
        return null;
    }

    public s(Object obj, int i2) {
        this.f3271a = i2;
        this.f3272b = obj;
    }
}
