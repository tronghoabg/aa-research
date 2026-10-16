package H5;

import E5.T;
import android.text.TextUtils;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f4922a;

    /* renamed from: b, reason: collision with root package name */
    public final T f4923b;

    /* renamed from: c, reason: collision with root package name */
    public final T f4924c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4925d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4926e;

    public i(String str, T t10, T t11, int i5, int i10) {
        AbstractC4256a.e(i5 == 0 || i10 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f4922a = str;
        t10.getClass();
        this.f4923b = t10;
        t11.getClass();
        this.f4924c = t11;
        this.f4925d = i5;
        this.f4926e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f4925d == iVar.f4925d && this.f4926e == iVar.f4926e && this.f4922a.equals(iVar.f4922a) && this.f4923b.equals(iVar.f4923b) && this.f4924c.equals(iVar.f4924c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4924c.hashCode() + ((this.f4923b.hashCode() + N0.a.c((((527 + this.f4925d) * 31) + this.f4926e) * 31, 31, this.f4922a)) * 31);
    }
}
