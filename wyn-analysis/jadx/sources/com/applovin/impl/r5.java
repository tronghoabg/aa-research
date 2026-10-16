package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.e6;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class r5 extends j5 {

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.e f22737g;

    /* renamed from: h, reason: collision with root package name */
    private final AppLovinPostbackListener f22738h;

    /* renamed from: i, reason: collision with root package name */
    private final e6.b f22739i;

    public class a implements AppLovinPostbackListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i5) {
            r5.this.e();
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            if (r5.this.f22738h != null) {
                r5.this.f22738h.onPostbackSuccess(r5.this.f22737g.f());
            }
        }
    }

    public r5(com.applovin.impl.sdk.network.e eVar, e6.b bVar, com.applovin.impl.sdk.k kVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", kVar);
        if (eVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.f22737g = eVar;
        this.f22738h = appLovinPostbackListener;
        this.f22739i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        b bVar = new b(this.f22737g, b());
        bVar.a(this.f22739i);
        b().r0().a(bVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (StringUtils.isValidString(this.f22737g.f())) {
            if (this.f22737g.u()) {
                b().y0().a(this.f22737g, new a());
                return;
            } else {
                e();
                return;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.d(this.f21767b, "Requested URL is not valid; nothing to do...");
        }
        AppLovinPostbackListener appLovinPostbackListener = this.f22738h;
        if (appLovinPostbackListener != null) {
            appLovinPostbackListener.onPostbackFailure(this.f22737g.f(), AppLovinErrorCodes.INVALID_URL);
        }
    }

    public class b extends m6 {

        /* renamed from: m, reason: collision with root package name */
        final String f22741m;

        public b(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
            this.f22741m = r5.this.f22737g.f();
        }

        @Override // com.applovin.impl.m6, com.applovin.impl.C1658q0.e
        public void a(String str, Object obj, int i5) {
            if (obj instanceof String) {
                for (String str2 : this.f21766a.c(y4.f23857n0)) {
                    if (str2.startsWith(str2)) {
                        String str3 = (String) obj;
                        if (TextUtils.isEmpty(str3)) {
                            continue;
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(str3);
                                AbstractC1659r0.c(jSONObject, this.f21766a);
                                AbstractC1659r0.b(jSONObject, this.f21766a);
                                AbstractC1659r0.a(jSONObject, this.f21766a);
                                break;
                            } catch (JSONException unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            if (r5.this.f22738h != null) {
                r5.this.f22738h.onPostbackSuccess(this.f22741m);
            }
            if (r5.this.f22737g.t()) {
                this.f21766a.t().a(r5.this.f22737g.s(), this.f22741m, i5, obj, null, true);
            }
        }

        @Override // com.applovin.impl.m6, com.applovin.impl.C1658q0.e
        public void a(String str, int i5, String str2, Object obj) {
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVar = this.f21768c;
                String str3 = this.f21767b;
                StringBuilder sbL = pd.f.l(i5, "Failed to dispatch postback. Error code: ", " URL: ");
                sbL.append(this.f22741m);
                oVar.b(str3, sbL.toString());
            }
            if (r5.this.f22738h != null) {
                r5.this.f22738h.onPostbackFailure(this.f22741m, i5);
            }
            if (r5.this.f22737g.t()) {
                this.f21766a.t().a(r5.this.f22737g.s(), this.f22741m, i5, obj, str2, false);
            }
        }
    }
}
