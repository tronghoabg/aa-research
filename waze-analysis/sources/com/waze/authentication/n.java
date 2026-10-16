package com.waze.authentication;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n extends v {

    /* renamed from: a, reason: collision with root package name */
    public static final n f15767a = new n();

    private n() {
        super("GRPCClientCreationFailed");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -187395707;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "GRPCClientCreationFailed";
    }
}
