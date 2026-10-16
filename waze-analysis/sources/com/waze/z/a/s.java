package com.waze.z.a;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final s f46181a = new s(null, 0 == true ? 1 : 0, 63);

    /* renamed from: b, reason: collision with root package name */
    private final String f46182b;

    /* renamed from: c, reason: collision with root package name */
    private final Alignment f46183c;

    /* renamed from: d, reason: collision with root package name */
    private final ContentScale f46184d;

    /* renamed from: e, reason: collision with root package name */
    private final float f46185e;

    /* renamed from: f, reason: collision with root package name */
    private final ColorFilter f46186f;

    /* renamed from: g, reason: collision with root package name */
    private final Shape f46187g;

    public /* synthetic */ s(ContentScale contentScale, ColorFilter colorFilter, int i2) {
        this((i2 & 2) != 0 ? Alignment.Companion.getCenter() : null, (i2 & 4) != 0 ? ContentScale.Companion.getFit() : contentScale, (i2 & 8) != 0 ? 1.0f : 0.0f, (i2 & 16) != 0 ? null : colorFilter, null);
    }

    public static /* synthetic */ s g(s sVar, ContentScale contentScale, ColorFilter colorFilter, Shape shape, int i2) {
        if ((i2 & 1) != 0) {
            String str = sVar.f46182b;
        }
        Alignment alignment = (i2 & 2) != 0 ? sVar.f46183c : null;
        if ((i2 & 4) != 0) {
            contentScale = sVar.f46184d;
        }
        ContentScale contentScale2 = contentScale;
        float f2 = (i2 & 8) != 0 ? sVar.f46185e : 0.0f;
        if ((i2 & 16) != 0) {
            colorFilter = sVar.f46186f;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((i2 & 32) != 0) {
            shape = sVar.f46187g;
        }
        h.g.b.x.f(alignment, "alignment");
        h.g.b.x.f(contentScale2, "contentScale");
        return new s(alignment, contentScale2, f2, colorFilter2, shape);
    }

    public final float a() {
        return this.f46185e;
    }

    public final Alignment b() {
        return this.f46183c;
    }

    public final ColorFilter c() {
        return this.f46186f;
    }

    public final Shape d() {
        return this.f46187g;
    }

    public final ContentScale e() {
        return this.f46184d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        String str = sVar.f46182b;
        return h.g.b.x.n(null, null) && h.g.b.x.n(this.f46183c, sVar.f46183c) && h.g.b.x.n(this.f46184d, sVar.f46184d) && Float.compare(this.f46185e, sVar.f46185e) == 0 && h.g.b.x.n(this.f46186f, sVar.f46186f) && h.g.b.x.n(this.f46187g, sVar.f46187g);
    }

    public final int hashCode() {
        int iHashCode = (((this.f46183c.hashCode() * 31) + this.f46184d.hashCode()) * 31) + Float.floatToIntBits(this.f46185e);
        ColorFilter colorFilter = this.f46186f;
        int iHashCode2 = ((iHashCode * 31) + (colorFilter == null ? 0 : colorFilter.hashCode())) * 31;
        Shape shape = this.f46187g;
        return iHashCode2 + (shape != null ? shape.hashCode() : 0);
    }

    public final String toString() {
        return "ImageProperties(contentDescription=null, alignment=" + this.f46183c + ", contentScale=" + this.f46184d + ", alpha=" + this.f46185e + ", colorFilter=" + this.f46186f + ", shape=" + this.f46187g + ")";
    }

    public s(Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, Shape shape) {
        h.g.b.x.f(alignment, "alignment");
        h.g.b.x.f(contentScale, "contentScale");
        this.f46182b = null;
        this.f46183c = alignment;
        this.f46184d = contentScale;
        this.f46185e = f2;
        this.f46186f = colorFilter;
        this.f46187g = shape;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s() {
        this(null, 0 == true ? 1 : 0, 63);
    }
}
