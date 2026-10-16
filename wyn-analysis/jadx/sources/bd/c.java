package bd;

import android.graphics.drawable.ColorDrawable;
import j$.util.Objects;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ColorDrawable f19452a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorDrawable f19453b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC1524a f19454c;

    /* renamed from: d, reason: collision with root package name */
    public final Double f19455d;

    public c(ColorDrawable colorDrawable, ColorDrawable colorDrawable2, EnumC1524a enumC1524a, Double d3) {
        this.f19452a = colorDrawable;
        this.f19453b = colorDrawable2;
        this.f19454c = enumC1524a;
        this.f19455d = d3;
    }

    public final Float a() {
        Double d3 = this.f19455d;
        if (d3 == null) {
            return null;
        }
        return Float.valueOf(d3.floatValue());
    }

    public final boolean equals(Object obj) {
        ColorDrawable colorDrawable;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        ColorDrawable colorDrawable2 = this.f19452a;
        if (((colorDrawable2 == null && cVar.f19452a == null) || colorDrawable2.getColor() == cVar.f19452a.getColor()) && (((colorDrawable = this.f19453b) == null && cVar.f19453b == null) || colorDrawable.getColor() == cVar.f19453b.getColor())) {
            if (Objects.equals(this.f19455d, cVar.f19455d) && Objects.equals(this.f19454c, cVar.f19454c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        ColorDrawable colorDrawable = this.f19452a;
        Integer numValueOf = colorDrawable == null ? null : Integer.valueOf(colorDrawable.getColor());
        ColorDrawable colorDrawable2 = this.f19453b;
        return Objects.hash(numValueOf, colorDrawable2 != null ? Integer.valueOf(colorDrawable2.getColor()) : null, this.f19455d, this.f19454c);
    }
}
