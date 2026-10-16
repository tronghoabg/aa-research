package com.waze.ui.e;

import androidx.compose.ui.graphics.ImageBitmap;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p extends r {

    /* renamed from: a, reason: collision with root package name */
    private final ImageBitmap f42236a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ImageBitmap imageBitmap) {
        super(null);
        h.g.b.x.f(imageBitmap, "bitmap");
        this.f42236a = imageBitmap;
    }

    public final ImageBitmap a() {
        return this.f42236a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && h.g.b.x.n(this.f42236a, ((p) obj).f42236a);
    }

    public final int hashCode() {
        return this.f42236a.hashCode();
    }

    public final String toString() {
        return "Bitmap(bitmap=" + this.f42236a + ")";
    }
}
