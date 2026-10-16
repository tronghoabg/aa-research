package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation;

import A7.AbstractC0279p0;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f30595a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f30596b;

    public b() {
        this.f30595a = a.f30593c;
        this.f30596b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f30595a == bVar.f30595a && this.f30596b == bVar.f30596b;
    }

    public final int hashCode() {
        return (this.f30595a.hashCode() * 31) + (this.f30596b ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OrientationSettings(orientation=");
        sb2.append(this.f30595a);
        sb2.append(", allowOrientationChange=");
        return AbstractC0279p0.p(sb2, this.f30596b, ')');
    }

    public b(a aVar, boolean z2) {
        this.f30595a = aVar;
        this.f30596b = z2;
    }
}
