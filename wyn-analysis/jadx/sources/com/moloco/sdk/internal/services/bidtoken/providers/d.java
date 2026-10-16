package com.moloco.sdk.internal.services.bidtoken.providers;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Long f29474a;

    public d(Long l10) {
        this.f29474a = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && AbstractC3340k.a(this.f29474a, ((d) obj).f29474a);
    }

    public final int hashCode() {
        Long l10 = this.f29474a;
        if (l10 == null) {
            return 0;
        }
        return l10.hashCode();
    }

    public final String toString() {
        return "AppDirInfo(appDirSize=" + this.f29474a + ')';
    }
}
