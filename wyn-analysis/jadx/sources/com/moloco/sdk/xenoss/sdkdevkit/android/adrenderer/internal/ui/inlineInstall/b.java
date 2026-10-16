package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f30880a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f30881b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30882c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30883d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f30884e;

    public b(boolean z2, boolean z10, String str, String str2, boolean z11) {
        this.f30880a = z2;
        this.f30881b = z10;
        this.f30882c = str;
        this.f30883d = str2;
        this.f30884e = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f30880a == bVar.f30880a && this.f30881b == bVar.f30881b && AbstractC3340k.a(this.f30882c, bVar.f30882c) && AbstractC3340k.a(this.f30883d, bVar.f30883d) && this.f30884e == bVar.f30884e;
    }

    public final int hashCode() {
        int i5 = (((this.f30880a ? 1231 : 1237) * 31) + (this.f30881b ? 1231 : 1237)) * 31;
        String str = this.f30882c;
        int iHashCode = (i5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f30883d;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f30884e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidAutoInlineControllerData(enabled=");
        sb2.append(this.f30880a);
        sb2.append(", onSkip=");
        sb2.append(this.f30881b);
        sb2.append(", eventLink=");
        sb2.append(this.f30882c);
        sb2.append(", clickthroughUrl=");
        sb2.append(this.f30883d);
        sb2.append(", forceFullscreen=");
        return AbstractC0279p0.p(sb2, this.f30884e, ')');
    }
}
