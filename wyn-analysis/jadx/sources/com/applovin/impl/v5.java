package com.applovin.impl;

import android.text.TextUtils;
import android.webkit.URLUtil;
import cb.AbstractC1593a;
import com.applovin.impl.C1627b0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class v5 extends j5 {

    /* renamed from: g, reason: collision with root package name */
    private final b f23404g;

    public interface b {
        void a(C1627b0.b bVar);

        void a(String str);
    }

    public v5(com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskFetchDeveloperUri", kVar);
        this.f23404g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strValueOf = String.valueOf(this.f21766a.A().F().get("package_name"));
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Looking up developer URI for package name: ".concat(strValueOf));
        }
        this.f21766a.r0().a(new a(com.applovin.impl.sdk.network.a.a(this.f21766a).c("GET").b("https://play.google.com/store/apps/details?id=".concat(strValueOf)).a((Object) "").a(false).a(), this.f21766a));
    }

    public class a extends m6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.m6, com.applovin.impl.C1658q0.e
        public void a(String str, String str2, int i5) {
            if (TextUtils.isEmpty(str2)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21768c.b(this.f21767b, "No developer URI found - response from the Play Store is empty");
                }
                v5.this.f23404g.a(C1627b0.b.APP_DETAILS_NOT_FOUND);
                return;
            }
            Matcher matcher = Pattern.compile("(?<=\"appstore:developer_url\" content=\").*?(?=\">)").matcher(str2);
            if (!matcher.find()) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21768c.b(this.f21767b, "No developer URI found - unable to find the developer_url meta tag from the Play Store listing");
                }
                v5.this.f23404g.a(C1627b0.b.INVALID_DEVELOPER_URI);
                return;
            }
            String strGroup = matcher.group();
            if (!URLUtil.isValidUrl(strGroup)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21768c.b(this.f21767b, "Developer URI (" + strGroup + ") is not valid");
                }
                v5.this.f23404g.a(C1627b0.b.INVALID_DEVELOPER_URI);
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                AbstractC1593a.s("Found developer URI: ", strGroup, this.f21768c, this.f21767b);
            }
            v5.this.f23404g.a(strGroup);
        }

        @Override // com.applovin.impl.m6, com.applovin.impl.C1658q0.e
        public void a(String str, int i5, String str2, String str3) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.b(this.f21767b, "Unable to fetch app details due to: " + str2 + ", and received error code: " + i5);
            }
            v5.this.f23404g.a(C1627b0.b.APP_DETAILS_NOT_FOUND);
        }
    }
}
