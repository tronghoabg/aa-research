package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class z extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Sdk.SDKError.Reason f33898a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f33899b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Sdk.SDKError.Builder f33900c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Sdk.SDKError.Reason reason, String str, Sdk.SDKError.Builder builder) {
        super(0);
        this.f33898a = reason;
        this.f33899b = str;
        this.f33900c = builder;
    }

    @Override // tf.a
    public final Object invoke() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Logging error: ");
        sbA.append(this.f33898a);
        sbA.append(" with message: ");
        sbA.append(this.f33899b);
        sbA.append(", mediation: ");
        sbA.append(this.f33900c.getMediationName());
        return sbA.toString();
    }
}
