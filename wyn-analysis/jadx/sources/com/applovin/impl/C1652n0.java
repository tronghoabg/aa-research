package com.applovin.impl;

import org.json.JSONObject;

/* renamed from: com.applovin.impl.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1652n0 extends j5 {

    /* renamed from: g, reason: collision with root package name */
    private final String f22310g;

    /* renamed from: h, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.a f22311h;

    public C1652n0(String str, com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
        super("CommunicatorRequestTask", kVar, str);
        this.f22310g = str;
        this.f22311h = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f21766a.r0().a(new a(this.f22311h, this.f21766a, d()));
    }

    /* renamed from: com.applovin.impl.n0$a */
    public class a extends m6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z2) {
            super(aVar, kVar, z2);
        }

        @Override // com.applovin.impl.m6, com.applovin.impl.C1658q0.e
        public void a(String str, JSONObject jSONObject, int i5) {
            this.f21766a.t().a(C1652n0.this.f22310g, C1652n0.this.f22311h.f(), i5, jSONObject, null, true);
        }

        @Override // com.applovin.impl.m6, com.applovin.impl.C1658q0.e
        public void a(String str, int i5, String str2, JSONObject jSONObject) {
            this.f21766a.t().a(C1652n0.this.f22310g, C1652n0.this.f22311h.f(), i5, jSONObject, str2, false);
        }
    }
}
