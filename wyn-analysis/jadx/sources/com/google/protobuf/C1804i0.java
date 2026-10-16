package com.google.protobuf;

import com.applovin.shadow.okhttp3.internal.http2.Settings;

/* renamed from: com.google.protobuf.i0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1804i0 {

    /* renamed from: a, reason: collision with root package name */
    public final MessageLite f27687a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27688b;

    public C1804i0(int i5, MessageLite messageLite) {
        this.f27687a = messageLite;
        this.f27688b = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1804i0)) {
            return false;
        }
        C1804i0 c1804i0 = (C1804i0) obj;
        return this.f27687a == c1804i0.f27687a && this.f27688b == c1804i0.f27688b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f27687a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f27688b;
    }
}
