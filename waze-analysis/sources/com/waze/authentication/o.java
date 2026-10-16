package com.waze.authentication;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class o extends v {

    /* renamed from: a, reason: collision with root package name */
    public static final o f15768a = new o();

    private o() {
        super("InvalidCredentials");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 146539589;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "InvalidCredentials";
    }
}
