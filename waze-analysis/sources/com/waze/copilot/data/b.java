package com.waze.copilot.data;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f22968a;

    public b(String str) {
        this.f22968a = str;
    }

    public final String a() {
        return this.f22968a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && h.g.b.x.n(this.f22968a, ((b) obj).f22968a);
    }

    public final int hashCode() {
        String str = this.f22968a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "AssetPreview(previewImageUrl=" + this.f22968a + ")";
    }
}
