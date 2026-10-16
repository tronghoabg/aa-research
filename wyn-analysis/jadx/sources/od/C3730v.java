package od;

import java.util.Arrays;
import md.C3534b;
import md.C3557z;

/* renamed from: od.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3730v {

    /* renamed from: a, reason: collision with root package name */
    public String f42108a;

    /* renamed from: b, reason: collision with root package name */
    public C3534b f42109b;

    /* renamed from: c, reason: collision with root package name */
    public C3557z f42110c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3730v)) {
            return false;
        }
        C3730v c3730v = (C3730v) obj;
        return this.f42108a.equals(c3730v.f42108a) && this.f42109b.equals(c3730v.f42109b) && Fe.b.v(null, null) && Fe.b.v(this.f42110c, c3730v.f42110c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42108a, this.f42109b, null, this.f42110c});
    }
}
