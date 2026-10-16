package Nd;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f8654a;

    /* renamed from: b, reason: collision with root package name */
    public final Sd.a f8655b;

    public a(String str, Sd.a aVar) {
        this.f8654a = str;
        this.f8655b = aVar;
        if (Bf.k.y0(str)) {
            throw new IllegalArgumentException("Name can't be blank");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC3340k.a(this.f8654a, aVar.f8654a) && AbstractC3340k.a(this.f8655b, aVar.f8655b);
    }

    public final int hashCode() {
        return this.f8655b.hashCode() + (this.f8654a.hashCode() * 31);
    }

    public final String toString() {
        return "AttributeKey: " + this.f8654a;
    }
}
