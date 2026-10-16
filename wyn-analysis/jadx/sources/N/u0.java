package N;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0740o f7925a;

    public /* synthetic */ u0(C0740o c0740o) {
        this.f7925a = c0740o;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u0) {
            return AbstractC3340k.a(this.f7925a, ((u0) obj).f7925a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7925a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.f7925a + ')';
    }
}
