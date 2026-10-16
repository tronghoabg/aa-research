package com.waze.copilot.data;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final long f22911a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22912b;

    public a(long j2, String str) {
        h.g.b.x.f(str, "assetZipUrl");
        this.f22911a = j2;
        this.f22912b = str;
    }

    public final long a() {
        return this.f22911a;
    }

    public final String b() {
        return this.f22912b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f22911a == aVar.f22911a && h.g.b.x.n(this.f22912b, aVar.f22912b);
    }

    public final int hashCode() {
        return (a.a.b(this.f22911a) * 31) + this.f22912b.hashCode();
    }

    public final String toString() {
        return "AssetDownloadable(lastChangedTimeStampSec=" + this.f22911a + ", assetZipUrl=" + this.f22912b + ")";
    }
}
