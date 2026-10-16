package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.io.File;
import java.util.List;

/* renamed from: com.applovin.impl.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1634e0 extends AbstractCallableC1630c0 {

    /* renamed from: f, reason: collision with root package name */
    private final String f21391f;

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f21392g;

    /* renamed from: h, reason: collision with root package name */
    private final List f21393h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f21394i;

    /* renamed from: j, reason: collision with root package name */
    private final String f21395j;
    private final com.applovin.impl.sdk.k k;

    /* renamed from: l, reason: collision with root package name */
    private final a f21396l;

    /* renamed from: com.applovin.impl.e0$a */
    public interface a {
        void a(Uri uri);
    }

    public C1634e0(String str, com.applovin.impl.sdk.ad.b bVar, String str2, com.applovin.impl.sdk.k kVar, a aVar) {
        this(str, bVar, bVar.S(), true, str2, kVar, aVar);
    }

    private void a(Uri uri) {
        a aVar;
        if (this.f21175e.get() || (aVar = this.f21396l) == null) {
            return;
        }
        aVar.a(uri);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() {
        if (this.f21175e.get()) {
            return Boolean.FALSE;
        }
        String strA = this.k.G().a(a(), this.f21391f, this.f21392g.getCachePrefix(), this.f21393h, this.f21394i, this.k.G().a(this.f21391f, this.f21392g), this.f21395j, f2.a((AppLovinAdImpl) this.f21392g));
        if (TextUtils.isEmpty(strA)) {
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f21175e.get()) {
            return Boolean.FALSE;
        }
        File fileA = this.k.G().a(strA, a());
        if (fileA == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21173c.b(this.f21172b, "Unable to retrieve File for cached filename = " + strA);
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f21175e.get()) {
            return Boolean.FALSE;
        }
        Uri uriFromFile = Uri.fromFile(fileA);
        if (uriFromFile == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21173c.b(this.f21172b, "Unable to extract Uri from file");
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f21175e.get()) {
            return Boolean.FALSE;
        }
        a(uriFromFile);
        return Boolean.TRUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f21391f.equals(((C1634e0) obj).f21391f);
    }

    public int hashCode() {
        String str = this.f21391f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public C1634e0(String str, com.applovin.impl.sdk.ad.b bVar, List list, boolean z2, String str2, com.applovin.impl.sdk.k kVar, a aVar) {
        super("AsyncTaskCacheResource", kVar);
        this.f21391f = str;
        this.f21392g = bVar;
        this.f21393h = list;
        this.f21394i = z2;
        this.f21395j = str2;
        this.k = kVar;
        this.f21396l = aVar;
    }
}
