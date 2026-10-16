package h3;

import j$.util.Objects;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractCollection f36044a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(List topics) {
        AbstractC3340k.e(topics, "topics");
        this.f36044a = (AbstractCollection) topics;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.AbstractCollection, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.AbstractCollection, java.util.List] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        ?? r02 = this.f36044a;
        b bVar = (b) obj;
        if (r02.size() != bVar.f36044a.size()) {
            return false;
        }
        return new HashSet((Collection) r02).equals(new HashSet(bVar.f36044a));
    }

    public final int hashCode() {
        return Objects.hash(this.f36044a);
    }

    public final String toString() {
        return "Topics=" + this.f36044a;
    }
}
