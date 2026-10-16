package com.waze.g;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f23990a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23991b;

    public b(String str, String str2) {
        x.f(str, "installationId");
        x.f(str2, "unauthenticatedInstallationId");
        this.f23990a = str;
        this.f23991b = str2;
    }

    public final String a() {
        return this.f23990a;
    }

    public final String b() {
        return this.f23991b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return x.n(this.f23990a, bVar.f23990a) && x.n(this.f23991b, bVar.f23991b);
    }

    public final int hashCode() {
        return (this.f23990a.hashCode() * 31) + this.f23991b.hashCode();
    }

    public final String toString() {
        return "InstallationInfo(installationId=" + this.f23990a + ", unauthenticatedInstallationId=" + this.f23991b + ")";
    }
}
