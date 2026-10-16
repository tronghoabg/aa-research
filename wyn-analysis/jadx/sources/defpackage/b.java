package defpackage;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f19095a;

    public b(Boolean bool) {
        this.f19095a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && AbstractC3340k.a(this.f19095a, ((b) obj).f19095a);
    }

    public final int hashCode() {
        Boolean bool = this.f19095a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "ToggleMessage(enable=" + this.f19095a + ")";
    }
}
