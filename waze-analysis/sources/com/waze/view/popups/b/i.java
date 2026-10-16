package com.waze.view.popups.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends k {

    /* renamed from: a, reason: collision with root package name */
    public final String f45258a;

    public i(String str) {
        h.g.b.x.f(str, "photoLoadFilePath");
        this.f45258a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && h.g.b.x.n(this.f45258a, ((i) obj).f45258a);
    }

    public final int hashCode() {
        return this.f45258a.hashCode();
    }

    public final String toString() {
        return "ShowPhoto(photoLoadFilePath=" + this.f45258a + ")";
    }
}
