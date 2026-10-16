package defpackage;

import android.os.Bundle;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Set;

/* loaded from: classes2.dex */
public final class qoz implements sku {
    public static final qoz a = new qoz(new Bundle());
    public final Bundle b;

    public qoz(Bundle bundle) {
        this.b = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qoz)) {
            return false;
        }
        Bundle bundle = this.b;
        Bundle bundle2 = ((qoz) obj).b;
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> setKeySet = bundle.keySet();
        if (!setKeySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            if (!Objects.equals(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }
}
