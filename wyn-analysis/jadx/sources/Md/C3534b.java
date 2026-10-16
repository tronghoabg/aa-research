package md;

import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: md.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3534b {

    /* renamed from: b, reason: collision with root package name */
    public static final C3534b f40612b = new C3534b(new IdentityHashMap());

    /* renamed from: a, reason: collision with root package name */
    public final IdentityHashMap f40613a;

    public C3534b(IdentityHashMap identityHashMap) {
        this.f40613a = identityHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3534b.class != obj.getClass()) {
            return false;
        }
        IdentityHashMap identityHashMap = this.f40613a;
        int size = identityHashMap.size();
        IdentityHashMap identityHashMap2 = ((C3534b) obj).f40613a;
        if (size != identityHashMap2.size()) {
            return false;
        }
        for (Map.Entry entry : identityHashMap.entrySet()) {
            if (!identityHashMap2.containsKey(entry.getKey()) || !Fe.b.v(entry.getValue(), identityHashMap2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f40613a.entrySet()) {
            iHashCode += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return iHashCode;
    }

    public final String toString() {
        return this.f40613a.toString();
    }
}
