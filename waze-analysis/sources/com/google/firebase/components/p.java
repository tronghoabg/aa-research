package com.google.firebase.components;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    private final ae f8968a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8969b;

    /* synthetic */ p(ae aeVar, boolean z) {
        this.f8968a = aeVar;
        this.f8969b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (pVar.f8968a.equals(this.f8968a) && pVar.f8969b == this.f8969b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f8969b).hashCode() ^ ((this.f8968a.hashCode() ^ 1000003) * 1000003);
    }
}
