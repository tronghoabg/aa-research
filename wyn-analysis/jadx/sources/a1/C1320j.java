package a1;

import android.content.res.Resources;
import j$.util.Objects;

/* renamed from: a1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1320j {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f17130a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f17131b;

    public C1320j(Resources resources, Resources.Theme theme) {
        this.f17130a = resources;
        this.f17131b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1320j.class == obj.getClass()) {
            C1320j c1320j = (C1320j) obj;
            if (this.f17130a.equals(c1320j.f17130a) && Objects.equals(this.f17131b, c1320j.f17131b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f17130a, this.f17131b);
    }
}
