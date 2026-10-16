package V1;

import Q1.x;
import android.media.metrics.LogSessionId;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f12952a;

    /* renamed from: b, reason: collision with root package name */
    public final j f12953b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12954c;

    static {
        if (x.f9724a < 31) {
            new k("");
        } else {
            new k(j.f12950b, "");
        }
    }

    public k(String str) {
        Q1.k.g(x.f9724a < 31);
        this.f12952a = str;
        this.f12953b = null;
        this.f12954c = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Objects.equals(this.f12952a, kVar.f12952a) && Objects.equals(this.f12953b, kVar.f12953b) && Objects.equals(this.f12954c, kVar.f12954c);
    }

    public final int hashCode() {
        return Objects.hash(this.f12952a, this.f12953b, this.f12954c);
    }

    public k(LogSessionId logSessionId, String str) {
        this(new j(logSessionId), str);
    }

    public k(j jVar, String str) {
        this.f12953b = jVar;
        this.f12952a = str;
        this.f12954c = new Object();
    }
}
