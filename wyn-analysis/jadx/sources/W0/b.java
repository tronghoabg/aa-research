package w0;

import Va.M6;
import android.content.res.Resources;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Resources.Theme f47270a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47271b;

    public b(Resources.Theme theme, int i5) {
        this.f47270a = theme;
        this.f47271b = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return AbstractC3340k.a(this.f47270a, bVar.f47270a) && this.f47271b == bVar.f47271b;
    }

    public final int hashCode() {
        return (this.f47270a.hashCode() * 31) + this.f47271b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Key(theme=");
        sb2.append(this.f47270a);
        sb2.append(", id=");
        return M6.r(sb2, this.f47271b, ')');
    }
}
