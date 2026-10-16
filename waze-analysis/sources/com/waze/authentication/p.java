package com.waze.authentication;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class p extends v {

    /* renamed from: a, reason: collision with root package name */
    public static final p f15769a = new p();

    private p() {
        super("IssueAccessTokenFailed");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 791291769;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "IssueAccessTokenFailed";
    }
}
