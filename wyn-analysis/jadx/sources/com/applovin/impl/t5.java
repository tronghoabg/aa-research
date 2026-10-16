package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import cb.AbstractC1593a;
import com.applovin.impl.C1627b0;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class t5 extends j5 {

    /* renamed from: g, reason: collision with root package name */
    private final b f23295g;

    /* renamed from: h, reason: collision with root package name */
    private final String f23296h;

    /* renamed from: i, reason: collision with root package name */
    private String f23297i;

    public interface b {
        void a(C1627b0.b bVar, String str);

        void a(String str, String str2);
    }

    public t5(com.applovin.impl.sdk.k kVar, String str, b bVar) {
        super("TaskFetchAppAdsContent", kVar);
        this.f23296h = str;
        this.f23295g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = new ArrayList(Arrays.asList(Uri.parse(this.f23296h).getAuthority().split("\\.")));
        if (arrayList.size() > 0) {
            String str = (String) arrayList.get(0);
            if ("www".equals(str) || "m".equals(str)) {
                arrayList.remove(0);
            }
        }
        String strJoin = TextUtils.join(".", arrayList);
        Uri uriBuild = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority(strJoin).appendPath("app-ads.txt").build();
        com.applovin.impl.sdk.network.a aVarA = com.applovin.impl.sdk.network.a.a(this.f21766a).c("GET").b(uriBuild.toString()).a(new Uri.Builder().scheme("http").authority(strJoin).appendPath("app-ads.txt").build().toString()).a((Object) "").a(false).a();
        this.f23297i = uriBuild.toString();
        if (com.applovin.impl.sdk.o.a()) {
            AbstractC1593a.w(new StringBuilder("Looking up app-ads.txt at "), this.f23297i, this.f21768c, this.f21767b);
        }
        this.f21766a.r0().a(new a(aVarA, this.f21766a));
    }

    public class a extends m6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.m6, com.applovin.impl.C1658q0.e
        public void a(String str, String str2, int i5) {
            if (TextUtils.isEmpty(str2)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21768c.b(this.f21767b, "No app-ads.txt found");
                }
                t5.this.f23295g.a(C1627b0.b.APPADSTXT_NOT_FOUND, t5.this.f23297i);
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21768c.a(this.f21767b, "Found app-ads.txt");
                }
                t5.this.f23295g.a(str2, t5.this.f23297i);
            }
        }

        @Override // com.applovin.impl.m6, com.applovin.impl.C1658q0.e
        public void a(String str, int i5, String str2, String str3) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.b(this.f21767b, "Unable to fetch app-ads.txt due to: " + str2 + ", and received error code: " + i5);
            }
            t5.this.f23295g.a(C1627b0.b.APPADSTXT_NOT_FOUND, t5.this.f23297i);
        }
    }
}
