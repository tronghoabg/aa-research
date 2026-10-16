package e.a;

import j$.util.Objects;
import java.util.IdentityHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f46513a;

    /* renamed from: b, reason: collision with root package name */
    private static final IdentityHashMap f46514b;

    /* renamed from: c, reason: collision with root package name */
    private final IdentityHashMap f46515c;

    static {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        f46514b = identityHashMap;
        f46513a = new c(identityHashMap);
    }

    private c(IdentityHashMap identityHashMap) {
        this.f46515c = identityHashMap;
    }

    public static a a() {
        return new a(f46513a);
    }

    public final a b() {
        return new a(this);
    }

    public final Object c(b bVar) {
        return this.f46515c.get(bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IdentityHashMap identityHashMap = this.f46515c;
        IdentityHashMap identityHashMap2 = ((c) obj).f46515c;
        if (identityHashMap.size() != identityHashMap2.size()) {
            return false;
        }
        for (Map.Entry entry : identityHashMap.entrySet()) {
            if (!identityHashMap2.containsKey(entry.getKey()) || !Objects.equals(entry.getValue(), identityHashMap2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHash = 0;
        for (Map.Entry entry : this.f46515c.entrySet()) {
            iHash += Objects.hash(entry.getKey(), entry.getValue());
        }
        return iHash;
    }

    public final String toString() {
        return this.f46515c.toString();
    }

    /* synthetic */ c(IdentityHashMap identityHashMap, byte[] bArr) {
        this(identityHashMap);
    }
}
