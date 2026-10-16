package h1;

import j$.util.Objects;
import java.util.List;

/* renamed from: h1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2767b {

    /* renamed from: a, reason: collision with root package name */
    public String f35935a;

    /* renamed from: b, reason: collision with root package name */
    public String f35936b;

    /* renamed from: c, reason: collision with root package name */
    public List f35937c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2767b)) {
            return false;
        }
        C2767b c2767b = (C2767b) obj;
        return Objects.equals(this.f35935a, c2767b.f35935a) && Objects.equals(this.f35936b, c2767b.f35936b) && Objects.equals(this.f35937c, c2767b.f35937c);
    }

    public final int hashCode() {
        return Objects.hash(this.f35935a, this.f35936b, this.f35937c);
    }
}
