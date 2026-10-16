package i0;

import A.AbstractC0213f;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4291a;

/* loaded from: classes.dex */
public final class H extends J implements Iterable, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final String f36520a;

    /* renamed from: b, reason: collision with root package name */
    public final float f36521b;

    /* renamed from: c, reason: collision with root package name */
    public final float f36522c;

    /* renamed from: d, reason: collision with root package name */
    public final float f36523d;

    /* renamed from: e, reason: collision with root package name */
    public final float f36524e;

    /* renamed from: f, reason: collision with root package name */
    public final float f36525f;

    /* renamed from: g, reason: collision with root package name */
    public final float f36526g;

    /* renamed from: h, reason: collision with root package name */
    public final float f36527h;

    /* renamed from: i, reason: collision with root package name */
    public final List f36528i;

    /* renamed from: j, reason: collision with root package name */
    public final List f36529j;

    public H(String name, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List clipPathData, List children) {
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(clipPathData, "clipPathData");
        AbstractC3340k.e(children, "children");
        this.f36520a = name;
        this.f36521b = f10;
        this.f36522c = f11;
        this.f36523d = f12;
        this.f36524e = f13;
        this.f36525f = f14;
        this.f36526g = f15;
        this.f36527h = f16;
        this.f36528i = clipPathData;
        this.f36529j = children;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof H)) {
            H h10 = (H) obj;
            return AbstractC3340k.a(this.f36520a, h10.f36520a) && this.f36521b == h10.f36521b && this.f36522c == h10.f36522c && this.f36523d == h10.f36523d && this.f36524e == h10.f36524e && this.f36525f == h10.f36525f && this.f36526g == h10.f36526g && this.f36527h == h10.f36527h && AbstractC3340k.a(this.f36528i, h10.f36528i) && AbstractC3340k.a(this.f36529j, h10.f36529j);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36529j.hashCode() + ((this.f36528i.hashCode() + AbstractC0213f.c(this.f36527h, AbstractC0213f.c(this.f36526g, AbstractC0213f.c(this.f36525f, AbstractC0213f.c(this.f36524e, AbstractC0213f.c(this.f36523d, AbstractC0213f.c(this.f36522c, AbstractC0213f.c(this.f36521b, this.f36520a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new S.h(this);
    }
}
