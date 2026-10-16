package E0;

import Va.M6;
import java.util.List;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* loaded from: classes.dex */
public final class l implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final l f2796b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f2797c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f2798d;

    /* renamed from: e, reason: collision with root package name */
    public static final l f2799e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f2800f;

    /* renamed from: g, reason: collision with root package name */
    public static final List f2801g;

    /* renamed from: a, reason: collision with root package name */
    public final int f2802a;

    static {
        l lVar = new l(100);
        l lVar2 = new l(200);
        l lVar3 = new l(300);
        l lVar4 = new l(400);
        l lVar5 = new l(500);
        l lVar6 = new l(600);
        f2796b = lVar6;
        l lVar7 = new l(700);
        l lVar8 = new l(800);
        l lVar9 = new l(900);
        f2797c = lVar3;
        f2798d = lVar4;
        f2799e = lVar5;
        f2800f = lVar7;
        f2801g = AbstractC3935e.D(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9);
    }

    public l(int i5) {
        this.f2802a = i5;
        if (1 > i5 || i5 >= 1001) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "Font weight can be in range [1, 1000]. Current value: ").toString());
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(l other) {
        AbstractC3340k.e(other, "other");
        return AbstractC3340k.g(this.f2802a, other.f2802a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f2802a == ((l) obj).f2802a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2802a;
    }

    public final String toString() {
        return M6.r(new StringBuilder("FontWeight(weight="), this.f2802a, ')');
    }
}
