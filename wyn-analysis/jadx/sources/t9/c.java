package t9;

import j$.util.DesugarCollections;
import java.util.List;
import ka.C1;

/* loaded from: classes4.dex */
public abstract class c implements p {

    /* renamed from: a, reason: collision with root package name */
    public final List f45944a;

    public c(List list) {
        this.f45944a = DesugarCollections.unmodifiableList(list);
    }

    @Override // t9.p
    public final C1 a(C1 c12) {
        return null;
    }

    @Override // t9.p
    public final C1 b(C1 c12, s8.q qVar) {
        return d(c12);
    }

    @Override // t9.p
    public final C1 c(C1 c12, C1 c13) {
        return d(c12);
    }

    public abstract C1 d(C1 c12);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f45944a.equals(((c) obj).f45944a);
    }

    public final int hashCode() {
        return this.f45944a.hashCode() + (getClass().hashCode() * 31);
    }
}
