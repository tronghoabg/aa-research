package l8;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: l8.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3442x extends d0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparator f40181a;

    public C3442x(Comparator comparator) {
        this.f40181a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f40181a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3442x) {
            return this.f40181a.equals(((C3442x) obj).f40181a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40181a.hashCode();
    }

    public final String toString() {
        return this.f40181a.toString();
    }
}
