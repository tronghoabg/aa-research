package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f30885a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30886b;

    public c(boolean z2, String str) {
        this.f30885a = z2;
        this.f30886b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f30885a == cVar.f30885a && AbstractC3340k.a(this.f30886b, cVar.f30886b);
    }

    public final int hashCode() {
        int i5 = (this.f30885a ? 1231 : 1237) * 31;
        String str = this.f30886b;
        return i5 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidInlineControllerData(enabled=");
        sb2.append(this.f30885a);
        sb2.append(", url=");
        return AbstractC0279p0.n(sb2, this.f30886b, ')');
    }
}
