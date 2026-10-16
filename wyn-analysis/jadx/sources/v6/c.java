package V6;

import android.os.Bundle;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.Arrays;
import java.util.Set;

/* loaded from: classes3.dex */
public final class c implements e {

    /* renamed from: b, reason: collision with root package name */
    public static final c f13155b = new c(new Bundle());

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f13156a;

    public /* synthetic */ c(Bundle bundle) {
        this.f13156a = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        Bundle bundle = ((c) obj).f13156a;
        Bundle bundle2 = this.f13156a;
        if (bundle2 == null || bundle == null) {
            return bundle2 == bundle;
        }
        if (bundle2.size() == bundle.size()) {
            Set<String> setKeySet = bundle2.keySet();
            if (setKeySet.containsAll(bundle.keySet())) {
                for (String str : setKeySet) {
                    if (!AbstractC1732v.m(bundle2.get(str), bundle.get(str))) {
                    }
                }
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13156a});
    }
}
