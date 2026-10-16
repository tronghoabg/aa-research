package z0;

import A.AbstractC0213f;
import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final H0.a f48284a;

    /* renamed from: b, reason: collision with root package name */
    public final int f48285b;

    /* renamed from: c, reason: collision with root package name */
    public final int f48286c;

    /* renamed from: d, reason: collision with root package name */
    public final int f48287d;

    /* renamed from: e, reason: collision with root package name */
    public final int f48288e;

    /* renamed from: f, reason: collision with root package name */
    public final float f48289f;

    /* renamed from: g, reason: collision with root package name */
    public final float f48290g;

    public f(H0.a aVar, int i5, int i10, int i11, int i12, float f10, float f11) {
        this.f48284a = aVar;
        this.f48285b = i5;
        this.f48286c = i10;
        this.f48287d = i11;
        this.f48288e = i12;
        this.f48289f = f10;
        this.f48290g = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC3340k.a(this.f48284a, fVar.f48284a) && this.f48285b == fVar.f48285b && this.f48286c == fVar.f48286c && this.f48287d == fVar.f48287d && this.f48288e == fVar.f48288e && Float.valueOf(this.f48289f).equals(Float.valueOf(fVar.f48289f)) && Float.valueOf(this.f48290g).equals(Float.valueOf(fVar.f48290g));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f48290g) + AbstractC0213f.c(this.f48289f, ((((((((this.f48284a.hashCode() * 31) + this.f48285b) * 31) + this.f48286c) * 31) + this.f48287d) * 31) + this.f48288e) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphInfo(paragraph=");
        sb2.append(this.f48284a);
        sb2.append(", startIndex=");
        sb2.append(this.f48285b);
        sb2.append(", endIndex=");
        sb2.append(this.f48286c);
        sb2.append(", startLineIndex=");
        sb2.append(this.f48287d);
        sb2.append(", endLineIndex=");
        sb2.append(this.f48288e);
        sb2.append(", top=");
        sb2.append(this.f48289f);
        sb2.append(", bottom=");
        return AbstractC0279p0.m(sb2, this.f48290g, ')');
    }
}
