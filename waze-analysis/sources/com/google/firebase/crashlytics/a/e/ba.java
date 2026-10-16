package com.google.firebase.crashlytics.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ba extends cs {

    /* renamed from: a, reason: collision with root package name */
    private final String f9417a;

    @Override // com.google.firebase.crashlytics.a.e.cs
    public final String a() {
        return this.f9417a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cs) {
            return this.f9417a.equals(((cs) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f9417a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "User{identifier=" + this.f9417a + "}";
    }
}
