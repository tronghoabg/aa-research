package com.waze.authentication;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class t extends v {

    /* renamed from: a, reason: collision with root package name */
    public static final t f15773a = new t();

    private t() {
        super("StoreAccessTokenFailed");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1970661489;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "StoreAccessTokenFailed";
    }
}
