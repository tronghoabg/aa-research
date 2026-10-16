package defpackage;

import androidx.car.app.model.CarText;
import java.util.List;

/* loaded from: classes2.dex */
public final class gcs implements gmo {
    public final List a;
    public final List b;
    public final transient CarText c;

    public gcs(List list, List list2, CarText carText) {
        this.a = list;
        this.b = list2;
        this.c = carText;
    }

    public static final CarText a(gcs gcsVar) {
        if (gcsVar == null) {
            return null;
        }
        String str = (String) woy.bH(gcsVar.a);
        if (str == null) {
            str = "";
        }
        CarText carText = gcsVar.c;
        return carText == null ? new CarText.Builder(str).build() : carText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcs)) {
            return false;
        }
        gcs gcsVar = (gcs) obj;
        return affa.f(this.a, gcsVar.a) && affa.f(this.b, gcsVar.b) && affa.f(this.c, gcsVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        CarText carText = this.c;
        return (iHashCode * 31) + (carText == null ? 0 : carText.hashCode());
    }

    public final String toString() {
        return "CarTextInternalModel(texts=" + this.a + ", spans=" + this.b + ", legacyOriginalText=" + this.c + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public gcs() {
        afbe afbeVar = afbe.a;
        this(afbeVar, afbeVar, null);
    }
}
