package cd;

import j$.util.Objects;
import java.util.ArrayList;

/* renamed from: cd.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1595a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f19825a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f19826b;

    public C1595a(Integer num, ArrayList arrayList) {
        this.f19825a = num;
        this.f19826b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1595a)) {
            return false;
        }
        C1595a c1595a = (C1595a) obj;
        return Objects.equals(this.f19825a, c1595a.f19825a) && Objects.equals(this.f19826b, c1595a.f19826b);
    }

    public final int hashCode() {
        return Objects.hash(this.f19825a, this.f19826b);
    }
}
