package defpackage;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f17090a;

    public a(Boolean bool) {
        this.f17090a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && AbstractC3340k.a(this.f17090a, ((a) obj).f17090a);
    }

    public final int hashCode() {
        Boolean bool = this.f17090a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "IsEnabledMessage(enabled=" + this.f17090a + ")";
    }
}
