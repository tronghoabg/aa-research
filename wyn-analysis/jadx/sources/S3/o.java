package S3;

import A.AbstractC0213f;
import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public String f10974a;

    /* renamed from: b, reason: collision with root package name */
    public int f10975b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return AbstractC3340k.a(this.f10974a, oVar.f10974a) && this.f10975b == oVar.f10975b;
    }

    public final int hashCode() {
        return AbstractC0213f.f(this.f10975b) + (this.f10974a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f10974a + ", state=" + AbstractC0279p0.B(this.f10975b) + ')';
    }
}
