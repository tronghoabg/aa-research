package bd;

import android.graphics.drawable.ColorDrawable;
import j$.util.Objects;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final d f19446a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorDrawable f19447b;

    /* renamed from: c, reason: collision with root package name */
    public final c f19448c;

    /* renamed from: d, reason: collision with root package name */
    public final c f19449d;

    /* renamed from: e, reason: collision with root package name */
    public final c f19450e;

    /* renamed from: f, reason: collision with root package name */
    public final c f19451f;

    public b(d dVar, ColorDrawable colorDrawable, c cVar, c cVar2, c cVar3, c cVar4) {
        this.f19446a = dVar;
        this.f19447b = colorDrawable;
        this.f19448c = cVar;
        this.f19449d = cVar2;
        this.f19450e = cVar3;
        this.f19451f = cVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f19446a == bVar.f19446a) {
            ColorDrawable colorDrawable = bVar.f19447b;
            ColorDrawable colorDrawable2 = this.f19447b;
            if (((colorDrawable2 == null && colorDrawable == null) || colorDrawable2.getColor() == colorDrawable.getColor()) && Objects.equals(this.f19448c, bVar.f19448c) && Objects.equals(this.f19449d, bVar.f19449d) && Objects.equals(this.f19450e, bVar.f19450e) && Objects.equals(this.f19451f, bVar.f19451f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        ColorDrawable colorDrawable = this.f19447b;
        return Objects.hash(colorDrawable == null ? null : Integer.valueOf(colorDrawable.getColor()), this.f19448c, this.f19449d, this.f19450e, this.f19451f);
    }
}
