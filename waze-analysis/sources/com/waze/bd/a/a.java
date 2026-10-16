package com.waze.bd.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    private final int f16204a;

    public a(int i2) {
        super(null);
        this.f16204a = i2;
    }

    public final int a() {
        return this.f16204a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f16204a == ((a) obj).f16204a;
    }

    public final int hashCode() {
        return this.f16204a;
    }

    public final String toString() {
        return "ErrorCode(errorCode=" + this.f16204a + ")";
    }

    private a() {
        super(null);
    }
}
