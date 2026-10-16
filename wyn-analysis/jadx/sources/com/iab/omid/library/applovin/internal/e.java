package com.iab.omid.library.applovin.internal;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.applovin.weakreference.a f27866a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27867b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f27868c;

    /* renamed from: d, reason: collision with root package name */
    private final String f27869d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f27866a = new com.iab.omid.library.applovin.weakreference.a(view);
        this.f27867b = view.getClass().getCanonicalName();
        this.f27868c = friendlyObstructionPurpose;
        this.f27869d = str;
    }

    public String a() {
        return this.f27869d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f27868c;
    }

    public com.iab.omid.library.applovin.weakreference.a c() {
        return this.f27866a;
    }

    public String d() {
        return this.f27867b;
    }
}
