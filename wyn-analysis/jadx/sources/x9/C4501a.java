package x9;

import java.util.ArrayList;

/* renamed from: x9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4501a {

    /* renamed from: a, reason: collision with root package name */
    public final String f47860a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f47861b;

    public C4501a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f47860a = str;
        this.f47861b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4501a)) {
            return false;
        }
        C4501a c4501a = (C4501a) obj;
        return this.f47860a.equals(c4501a.f47860a) && this.f47861b.equals(c4501a.f47861b);
    }

    public final int hashCode() {
        return ((this.f47860a.hashCode() ^ 1000003) * 1000003) ^ this.f47861b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f47860a + ", usedDates=" + this.f47861b + "}";
    }
}
