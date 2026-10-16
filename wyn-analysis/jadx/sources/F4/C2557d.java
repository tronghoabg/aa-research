package f4;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: f4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2557d {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f34811a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f34812b;

    public C2557d(Bitmap bitmap, Map map) {
        this.f34811a = bitmap;
        this.f34812b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2557d)) {
            return false;
        }
        C2557d c2557d = (C2557d) obj;
        return AbstractC3340k.a(this.f34811a, c2557d.f34811a) && AbstractC3340k.a(this.f34812b, c2557d.f34812b);
    }

    public final int hashCode() {
        return this.f34812b.hashCode() + (this.f34811a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.f34811a + ", extras=" + this.f34812b + ')';
    }
}
