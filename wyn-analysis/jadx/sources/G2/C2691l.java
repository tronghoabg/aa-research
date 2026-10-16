package g2;

import N1.C0765n;
import com.vungle.ads.internal.protos.Sdk;
import l8.AbstractC3437s;
import l8.j0;

/* renamed from: g2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2691l {

    /* renamed from: a, reason: collision with root package name */
    public final int f35619a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35620b;

    /* renamed from: c, reason: collision with root package name */
    public final C0765n f35621c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f35622d;

    /* renamed from: e, reason: collision with root package name */
    public final String f35623e;

    public C2691l(C0765n c0765n, int i5, int i10, j0 j0Var, String str) {
        this.f35619a = i5;
        this.f35620b = i10;
        this.f35621c = c0765n;
        this.f35622d = j0.a(j0Var);
        this.f35623e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2691l.class == obj.getClass()) {
            C2691l c2691l = (C2691l) obj;
            if (this.f35619a == c2691l.f35619a && this.f35620b == c2691l.f35620b && this.f35621c.equals(c2691l.f35621c)) {
                j0 j0Var = this.f35622d;
                j0Var.getClass();
                if (AbstractC3437s.f(c2691l.f35622d, j0Var) && this.f35623e.equals(c2691l.f35623e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35623e.hashCode() + ((this.f35622d.hashCode() + ((this.f35621c.hashCode() + ((((Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.f35619a) * 31) + this.f35620b) * 31)) * 31)) * 31);
    }
}
