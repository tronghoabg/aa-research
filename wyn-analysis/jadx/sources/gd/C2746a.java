package gd;

import j$.util.Objects;

/* renamed from: gd.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2746a {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f35867a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2746a.class != obj.getClass()) {
            return false;
        }
        return this.f35867a.equals(((C2746a) obj).f35867a);
    }

    public final int hashCode() {
        return Objects.hash(this.f35867a);
    }
}
