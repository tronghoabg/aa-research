package io.ktor.utils.io;

import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: io.ktor.utils.io.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2868a implements InterfaceC2874g {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f37383b;

    public C2868a(Throwable th) {
        this.f37383b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2868a) && AbstractC3340k.a(this.f37383b, ((C2868a) obj).f37383b);
    }

    public final int hashCode() {
        Throwable th = this.f37383b;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return "Closed(cause=" + this.f37383b + ')';
    }
}
