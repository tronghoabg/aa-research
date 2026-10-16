package E5;

import android.net.Uri;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3406H;

/* renamed from: E5.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0440a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f3282a;

    /* renamed from: b, reason: collision with root package name */
    public final List f3283b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC3409K f3284c;

    public C0440a0(Uri uri, xg.g gVar, List list, AbstractC3409K abstractC3409K) {
        this.f3282a = uri;
        this.f3283b = list;
        this.f3284c = abstractC3409K;
        C3406H c3406hI = AbstractC3409K.i();
        for (int i5 = 0; i5 < abstractC3409K.size(); i5++) {
            ((C0444c0) abstractC3409K.get(i5)).getClass();
            c3406hI.a(new C0444c0());
        }
        c3406hI.g();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0440a0)) {
            return false;
        }
        C0440a0 c0440a0 = (C0440a0) obj;
        if (!this.f3282a.equals(c0440a0.f3282a)) {
            return false;
        }
        int i5 = u6.v.f46721a;
        return u6.v.a(null, null) && this.f3283b.equals(c0440a0.f3283b) && this.f3284c.equals(c0440a0.f3284c);
    }

    public final int hashCode() {
        return (this.f3284c.hashCode() + ((this.f3283b.hashCode() + (this.f3282a.hashCode() * 923521)) * 961)) * 31;
    }
}
