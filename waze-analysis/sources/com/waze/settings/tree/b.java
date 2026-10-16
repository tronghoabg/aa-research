package com.waze.settings.tree;

import android.graphics.drawable.Drawable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends d {

    /* renamed from: a, reason: collision with root package name */
    private final Drawable f37515a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Drawable drawable) {
        super(null);
        h.g.b.x.f(drawable, "value");
        this.f37515a = drawable;
    }

    public final Drawable a() {
        return this.f37515a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && h.g.b.x.n(this.f37515a, ((b) obj).f37515a);
    }

    public final int hashCode() {
        return this.f37515a.hashCode();
    }

    public final String toString() {
        return "Image(value=" + this.f37515a + ")";
    }
}
