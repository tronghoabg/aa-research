package com.waze.h.b;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends com.waze.i.a {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f24320a;

    public c(Integer num) {
        super(null);
        this.f24320a = num;
    }

    public final Integer a() {
        return this.f24320a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && x.n(this.f24320a, ((c) obj).f24320a);
    }

    public final int hashCode() {
        Integer num = this.f24320a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "Error(errorCode=" + this.f24320a + ")";
    }

    public c() {
        this((byte[]) null);
    }

    public /* synthetic */ c(byte[] bArr) {
        this((Integer) null);
    }
}
