package defpackage;

import com.google.android.gms.common.Feature;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class smf {
    public final slr a;
    public final Feature b;

    public smf(slr slrVar, Feature feature) {
        this.a = slrVar;
        this.b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof smf) {
            smf smfVar = (smf) obj;
            if (Objects.equals(this.a, smfVar.a) && Objects.equals(this.b, smfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        thg.w("key", this.a, arrayList);
        thg.w("feature", this.b, arrayList);
        return thg.v(arrayList, this);
    }
}
