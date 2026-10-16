package com.waze.ui.ac;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a implements i {

    /* renamed from: a, reason: collision with root package name */
    private final String f41757a;

    public a(String str) {
        x.f(str, "imagePath");
        this.f41757a = str;
    }

    public final String a() {
        return this.f41757a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && x.n(this.f41757a, ((a) obj).f41757a);
    }

    public final int hashCode() {
        return this.f41757a.hashCode();
    }

    public final String toString() {
        return "File(imagePath=" + this.f41757a + ")";
    }
}
