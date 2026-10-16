package b4;

import A.AbstractC0213f;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: b4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1508d extends AbstractC1509e {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f19302a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19303b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19304c;

    public C1508d(Drawable drawable, boolean z2, int i5) {
        this.f19302a = drawable;
        this.f19303b = z2;
        this.f19304c = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1508d)) {
            return false;
        }
        C1508d c1508d = (C1508d) obj;
        return AbstractC3340k.a(this.f19302a, c1508d.f19302a) && this.f19303b == c1508d.f19303b && this.f19304c == c1508d.f19304c;
    }

    public final int hashCode() {
        return AbstractC0213f.f(this.f19304c) + (((this.f19302a.hashCode() * 31) + (this.f19303b ? 1231 : 1237)) * 31);
    }
}
