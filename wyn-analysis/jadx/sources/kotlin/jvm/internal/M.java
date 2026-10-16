package kotlin.jvm.internal;

import E5.Q;
import ef.EnumC2526j;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.KClass;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;
import p3.C3762c;
import r7.AbstractC3935e;

/* loaded from: classes5.dex */
public final class M implements KTypeParameter {

    /* renamed from: a, reason: collision with root package name */
    public final KClass f39744a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f39745b;

    /* renamed from: c, reason: collision with root package name */
    public final String f39746c;

    /* renamed from: d, reason: collision with root package name */
    public final KVariance f39747d;

    /* renamed from: e, reason: collision with root package name */
    public volatile List f39748e;

    public M(KClass container, KVariance variance) {
        AbstractC3340k.e(container, "container");
        AbstractC3340k.e(variance, "variance");
        AbstractC3340k.e(container, "container");
        this.f39744a = container;
        this.f39745b = Fe.c.y(EnumC2526j.f34668b, new C3762c(this, 1));
        this.f39746c = "PluginConfigT";
        this.f39747d = variance;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        return AbstractC3340k.a(this.f39746c, m10.f39746c) && AbstractC3340k.a(this.f39744a, m10.f39744a);
    }

    @Override // kotlin.reflect.KTypeParameter
    public final String getName() {
        return this.f39746c;
    }

    @Override // kotlin.reflect.KTypeParameter
    public final List getUpperBounds() {
        List list = this.f39748e;
        if (list != null) {
            return list;
        }
        I i5 = H.f39741a;
        List listC = AbstractC3935e.C(i5.typeOf(i5.getOrCreateKotlinClass(Object.class), Collections.EMPTY_LIST, true));
        this.f39748e = listC;
        return listC;
    }

    @Override // kotlin.reflect.KTypeParameter
    public final KVariance getVariance() {
        return this.f39747d;
    }

    public final int hashCode() {
        return this.f39746c.hashCode() + (this.f39744a.hashCode() * 31);
    }

    @Override // kotlin.reflect.KTypeParameter
    public final boolean isReified() {
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i5 = L.f39743a[getVariance().ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                sb2.append("in ");
            } else {
                if (i5 != 3) {
                    throw new Q((byte) 0, 9);
                }
                sb2.append("out ");
            }
        }
        sb2.append(getName());
        return sb2.toString();
    }
}
