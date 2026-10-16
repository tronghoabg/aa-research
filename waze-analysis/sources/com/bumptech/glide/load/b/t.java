package com.bumptech.glide.load.b;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class t implements com.bumptech.glide.load.o {

    /* renamed from: b, reason: collision with root package name */
    private final u f3273b;

    /* renamed from: c, reason: collision with root package name */
    private final URL f3274c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3275d;

    /* renamed from: e, reason: collision with root package name */
    private String f3276e;

    /* renamed from: f, reason: collision with root package name */
    private URL f3277f;

    /* renamed from: g, reason: collision with root package name */
    private volatile byte[] f3278g;

    /* renamed from: h, reason: collision with root package name */
    private int f3279h;

    public t(URL url) {
        u uVar = u.f3280a;
        com.bumptech.glide.g.p.f(url);
        this.f3274c = url;
        this.f3275d = null;
        com.bumptech.glide.g.p.f(uVar);
        this.f3273b = uVar;
    }

    @Override // com.bumptech.glide.load.o
    public final void a(MessageDigest messageDigest) {
        if (this.f3278g == null) {
            this.f3278g = b().getBytes(f3507a);
        }
        messageDigest.update(this.f3278g);
    }

    public final String b() {
        String str = this.f3275d;
        if (str != null) {
            return str;
        }
        URL url = this.f3274c;
        com.bumptech.glide.g.p.f(url);
        return url.toString();
    }

    public final URL c() {
        URL url = this.f3277f;
        if (url == null) {
            if (TextUtils.isEmpty(this.f3276e)) {
                String string = this.f3275d;
                if (TextUtils.isEmpty(string)) {
                    URL url2 = this.f3274c;
                    com.bumptech.glide.g.p.f(url2);
                    string = url2.toString();
                }
                this.f3276e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$[]");
            }
            url = new URL(this.f3276e);
            this.f3277f = url;
        }
        return url;
    }

    public final Map d() {
        return this.f3273b.a();
    }

    @Override // com.bumptech.glide.load.o
    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (b().equals(tVar.b()) && this.f3273b.equals(tVar.f3273b)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.o
    public final int hashCode() {
        int i2 = this.f3279h;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = b().hashCode();
        this.f3279h = iHashCode;
        int iHashCode2 = (iHashCode * 31) + this.f3273b.hashCode();
        this.f3279h = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        return b();
    }

    public t(String str) {
        u uVar = u.f3280a;
        this.f3274c = null;
        com.bumptech.glide.g.p.c(str);
        this.f3275d = str;
        com.bumptech.glide.g.p.f(uVar);
        this.f3273b = uVar;
    }
}
