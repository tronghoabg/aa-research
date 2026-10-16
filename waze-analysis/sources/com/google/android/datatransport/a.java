package com.google.android.datatransport;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f3901a;

    private a(String str) {
        this.f3901a = str;
    }

    public static a a(String str) {
        return new a(str);
    }

    public final String b() {
        return this.f3901a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f3901a.equals(((a) obj).f3901a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3901a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Encoding{name=\"" + this.f3901a + "\"}";
    }
}
