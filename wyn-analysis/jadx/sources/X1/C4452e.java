package x1;

import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: x1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4452e {

    /* renamed from: a, reason: collision with root package name */
    public final String f47652a;

    public C4452e(String name) {
        AbstractC3340k.e(name, "name");
        this.f47652a = name;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4452e)) {
            return false;
        }
        return AbstractC3340k.a(this.f47652a, ((C4452e) obj).f47652a);
    }

    public final int hashCode() {
        return this.f47652a.hashCode();
    }

    public final String toString() {
        return this.f47652a;
    }
}
