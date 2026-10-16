package com.waze.ab.a;

import android.net.Uri;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class w extends x {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f13752a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Uri uri) {
        super(null);
        h.g.b.x.f(uri, "uri");
        this.f13752a = uri;
    }

    public final Uri a() {
        return this.f13752a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && h.g.b.x.n(this.f13752a, ((w) obj).f13752a);
    }

    public final int hashCode() {
        return this.f13752a.hashCode();
    }

    public final String toString() {
        return "TakePicture(uri=" + this.f13752a + ")";
    }
}
