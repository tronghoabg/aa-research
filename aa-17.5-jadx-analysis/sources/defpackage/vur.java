package defpackage;

import android.app.Activity;

/* loaded from: classes3.dex */
final class vur {
    public final vky a;

    public vur(vky vkyVar) {
        this.a = vkyVar;
    }

    static vur a(Activity activity) {
        return new vur(new vky(activity.getClass().getName()));
    }

    final String b() {
        return this.a.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof vur) && b().equals(((vur) obj).b());
    }

    public final int hashCode() {
        return (b().hashCode() * 31) ^ 1231;
    }

    public final String toString() {
        return a.bq(this.a.a, "MeasurementKey{rawStringEventName=null, noPiiEventName=", ", isActivity=true}");
    }

    public vur() {
        throw null;
    }
}
