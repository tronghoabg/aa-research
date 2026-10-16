package com.waze.authentication;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class s extends v {

    /* renamed from: a, reason: collision with root package name */
    public static final s f15772a = new s();

    private s() {
        super("OtherLoginError");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1094668175;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "OtherLoginError";
    }
}
