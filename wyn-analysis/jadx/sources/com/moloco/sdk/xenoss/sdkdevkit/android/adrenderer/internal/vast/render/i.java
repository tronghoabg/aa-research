package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import java.io.File;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y f31988a;

    /* renamed from: b, reason: collision with root package name */
    public final File f31989b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f31990c;

    /* renamed from: d, reason: collision with root package name */
    public final String f31991d;

    /* renamed from: e, reason: collision with root package name */
    public final String f31992e;

    /* renamed from: f, reason: collision with root package name */
    public final k f31993f;

    /* renamed from: g, reason: collision with root package name */
    public final h f31994g;

    public i(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y yVar, File localMediaResource, Integer num, String networkMediaResource, String str, k kVar, h hVar) {
        AbstractC3340k.e(localMediaResource, "localMediaResource");
        AbstractC3340k.e(networkMediaResource, "networkMediaResource");
        this.f31988a = yVar;
        this.f31989b = localMediaResource;
        this.f31990c = num;
        this.f31991d = networkMediaResource;
        this.f31992e = str;
        this.f31993f = kVar;
        this.f31994g = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return AbstractC3340k.a(this.f31988a, iVar.f31988a) && AbstractC3340k.a(this.f31989b, iVar.f31989b) && AbstractC3340k.a(this.f31990c, iVar.f31990c) && AbstractC3340k.a(this.f31991d, iVar.f31991d) && AbstractC3340k.a(this.f31992e, iVar.f31992e) && AbstractC3340k.a(this.f31993f, iVar.f31993f) && AbstractC3340k.a(this.f31994g, iVar.f31994g);
    }

    public final int hashCode() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y yVar = this.f31988a;
        int iHashCode = (this.f31989b.hashCode() + ((yVar == null ? 0 : yVar.hashCode()) * 31)) * 31;
        Integer num = this.f31990c;
        int iC = N0.a.c((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f31991d);
        String str = this.f31992e;
        int iHashCode2 = (this.f31993f.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        h hVar = this.f31994g;
        return iHashCode2 + (hVar != null ? hVar.hashCode() : 0);
    }

    public final String toString() {
        return "Linear(skipOffset=" + this.f31988a + ", localMediaResource=" + this.f31989b + ", localMediaResourceBitrate=" + this.f31990c + ", networkMediaResource=" + this.f31991d + ", clickThroughUrl=" + this.f31992e + ", tracking=" + this.f31993f + ", icon=" + this.f31994g + ')';
    }
}
