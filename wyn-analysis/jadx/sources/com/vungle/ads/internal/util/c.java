package com.vungle.ads.internal.util;

import android.content.Intent;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f33834a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f33835b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f33836c;

    /* renamed from: d, reason: collision with root package name */
    public final com.vungle.ads.internal.ui.m f33837d;

    public c(WeakReference context, Intent intent, Intent intent2, com.vungle.ads.internal.ui.m mVar) {
        AbstractC3340k.e(context, "context");
        this.f33834a = context;
        this.f33835b = intent;
        this.f33836c = intent2;
        this.f33837d = mVar;
    }

    public final com.vungle.ads.internal.ui.m a() {
        return this.f33837d;
    }

    public final WeakReference b() {
        return this.f33834a;
    }

    public final Intent c() {
        return this.f33835b;
    }

    public final Intent d() {
        return this.f33836c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC3340k.a(this.f33834a, cVar.f33834a) && AbstractC3340k.a(this.f33835b, cVar.f33835b) && AbstractC3340k.a(this.f33836c, cVar.f33836c) && AbstractC3340k.a(this.f33837d, cVar.f33837d);
    }

    public final int hashCode() {
        int iHashCode = this.f33834a.hashCode() * 31;
        Intent intent = this.f33835b;
        int iHashCode2 = (iHashCode + (intent == null ? 0 : intent.hashCode())) * 31;
        Intent intent2 = this.f33836c;
        int iHashCode3 = (iHashCode2 + (intent2 == null ? 0 : intent2.hashCode())) * 31;
        com.vungle.ads.internal.ui.m mVar = this.f33837d;
        return iHashCode3 + (mVar != null ? mVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("TargetActivityInfo(context=");
        sbA.append(this.f33834a);
        sbA.append(", deepLinkOverrideIntent=");
        sbA.append(this.f33835b);
        sbA.append(", defaultIntent=");
        sbA.append(this.f33836c);
        sbA.append(", adOpenCallback=");
        sbA.append(this.f33837d);
        sbA.append(')');
        return sbA.toString();
    }
}
