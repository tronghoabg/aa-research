package V6;

import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class d implements e {

    /* renamed from: c, reason: collision with root package name */
    public static final d f13157c;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13158a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13159b;

    static {
        S3.c cVar = new S3.c(27, false);
        cVar.f10936b = Boolean.FALSE;
        f13157c = new d(cVar);
    }

    public d(S3.c cVar) {
        this.f13158a = ((Boolean) cVar.f10936b).booleanValue();
        this.f13159b = (String) cVar.f10937c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        dVar.getClass();
        return AbstractC1732v.m(null, null) && this.f13158a == dVar.f13158a && AbstractC1732v.m(this.f13159b, dVar.f13159b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f13158a), this.f13159b});
    }
}
