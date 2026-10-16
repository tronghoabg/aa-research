package com.waze.view.popups.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final String f45259a;

    public j(String str) {
        h.g.b.x.f(str, "photoSaveFilePath");
        this.f45259a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && h.g.b.x.n(this.f45259a, ((j) obj).f45259a);
    }

    public final int hashCode() {
        return this.f45259a.hashCode();
    }

    public final String toString() {
        return "TakePhoto(photoSaveFilePath=" + this.f45259a + ")";
    }
}
