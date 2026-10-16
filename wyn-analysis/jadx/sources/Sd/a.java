package Sd;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final KClass f11061a;

    /* renamed from: b, reason: collision with root package name */
    public final KType f11062b;

    public a(KClass type, KType kType) {
        AbstractC3340k.e(type, "type");
        this.f11061a = type;
        this.f11062b = kType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        KType kType = this.f11062b;
        if (kType == null) {
            a aVar = (a) obj;
            if (aVar.f11062b == null) {
                return AbstractC3340k.a(this.f11061a, aVar.f11061a);
            }
        }
        return AbstractC3340k.a(kType, ((a) obj).f11062b);
    }

    public final int hashCode() {
        KType kType = this.f11062b;
        return kType != null ? kType.hashCode() : this.f11061a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TypeInfo(");
        Object obj = this.f11062b;
        if (obj == null) {
            obj = this.f11061a;
        }
        sb2.append(obj);
        sb2.append(')');
        return sb2.toString();
    }
}
