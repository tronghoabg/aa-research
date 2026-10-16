package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2093n {

    /* renamed from: a, reason: collision with root package name */
    public final int f31528a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f31529b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f31530c;

    /* renamed from: d, reason: collision with root package name */
    public final C2079l f31531d;

    public C2093n(int i5, Set set, boolean z2, C2079l c2079l) {
        this.f31528a = i5;
        this.f31529b = set;
        this.f31530c = z2;
        this.f31531d = c2079l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2093n)) {
            return false;
        }
        C2093n c2093n = (C2093n) obj;
        return this.f31528a == c2093n.f31528a && AbstractC3340k.a(this.f31529b, c2093n.f31529b) && this.f31530c == c2093n.f31530c && AbstractC3340k.a(this.f31531d, c2093n.f31531d);
    }

    public final int hashCode() {
        return this.f31531d.hashCode() + ((((this.f31529b.hashCode() + (this.f31528a * 31)) * 31) + (this.f31530c ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "WrapperChainParams(wrapperDepth=" + this.f31528a + ", usedVastAdTagUrls=" + this.f31529b + ", followAdditionalWrappers=" + this.f31530c + ", aggregatedWrapperChainData=" + this.f31531d + ')';
    }
}
