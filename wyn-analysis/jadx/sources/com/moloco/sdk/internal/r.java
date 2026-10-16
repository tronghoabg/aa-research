package com.moloco.sdk.internal;

import com.moloco.sdk.publisher.MolocoAdError;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final MolocoAdError f29363a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c f29364b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f29365c;

    public r(MolocoAdError molocoAdError, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c subErrorType, Map map) {
        AbstractC3340k.e(subErrorType, "subErrorType");
        this.f29363a = molocoAdError;
        this.f29364b = subErrorType;
        this.f29365c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return AbstractC3340k.a(this.f29363a, rVar.f29363a) && AbstractC3340k.a(this.f29364b, rVar.f29364b) && AbstractC3340k.a(this.f29365c, rVar.f29365c);
    }

    public final int hashCode() {
        return this.f29365c.hashCode() + ((this.f29364b.hashCode() + (this.f29363a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MolocoInternalAdError(molocoAdError=" + this.f29363a + ", subErrorType=" + this.f29364b + ", details=" + this.f29365c + ')';
    }
}
