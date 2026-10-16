package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class eu extends com.waze.app_nav.hub.b.m {

    /* renamed from: a, reason: collision with root package name */
    private final String f19567a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f19568b;

    public eu(String str, boolean z) {
        super(null);
        this.f19567a = str;
        this.f19568b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu)) {
            return false;
        }
        eu euVar = (eu) obj;
        return h.g.b.x.n(this.f19567a, euVar.f19567a) && this.f19568b == euVar.f19568b;
    }

    public final String g() {
        return this.f19567a;
    }

    public final boolean h() {
        return this.f19568b;
    }

    public final int hashCode() {
        String str = this.f19567a;
        return ((str == null ? 0 : str.hashCode()) * 31) + a.a.a(this.f19568b);
    }

    public final String toString() {
        return "Search(searchTerm=" + this.f19567a + ", isVoiceSearch=" + this.f19568b + ")";
    }
}
