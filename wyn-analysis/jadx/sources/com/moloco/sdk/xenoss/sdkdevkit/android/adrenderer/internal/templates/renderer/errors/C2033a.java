package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2033a extends s {

    /* renamed from: e, reason: collision with root package name */
    public static final C2033a f30637e = new C2033a("net::ERR_CERT_AUTHORITY_INVALID", false, true);

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.s
    public final String a() {
        return "net::ERR_CERT_AUTHORITY_INVALID";
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C2033a);
    }

    public final int hashCode() {
        return -932810174;
    }

    public final String toString() {
        return "ERR_CERT_AUTHORITY_INVALID";
    }
}
