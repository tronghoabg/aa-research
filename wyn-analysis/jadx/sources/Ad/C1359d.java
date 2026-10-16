package ad;

import j$.util.Objects;
import x6.C4470a;

/* renamed from: ad.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1359d {

    /* renamed from: a, reason: collision with root package name */
    public final int f17565a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17566b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17567c;

    public C1359d(C4470a c4470a) {
        this.f17565a = c4470a.a();
        this.f17566b = c4470a.f47722c;
        this.f17567c = c4470a.f47721b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1359d)) {
            return false;
        }
        C1359d c1359d = (C1359d) obj;
        if (this.f17565a == c1359d.f17565a && this.f17566b.equals(c1359d.f17566b)) {
            return this.f17567c.equals(c1359d.f17567c);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f17565a), this.f17566b, this.f17567c);
    }

    public C1359d(int i5, String str, String str2) {
        this.f17565a = i5;
        this.f17566b = str;
        this.f17567c = str2;
    }
}
