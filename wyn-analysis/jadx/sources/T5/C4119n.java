package t5;

import A7.V0;
import Va.C1038ka;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import q5.EnumC3870e;
import v5.InterfaceC4301b;
import z5.C4616a;
import z5.C4617b;

/* renamed from: t5.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4119n implements InterfaceC4301b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45788a;

    @Override // df.InterfaceC2432a
    public final Object get() {
        switch (this.f45788a) {
            case 0:
                return new V0(Executors.newSingleThreadExecutor(), 4);
            default:
                C1038ka c1038ka = new C1038ka(15);
                HashMap map = new HashMap();
                EnumC3870e enumC3870e = EnumC3870e.f44125a;
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(enumC3870e, new C4617b(30000L, 86400000L, set));
                EnumC3870e enumC3870e2 = EnumC3870e.f44127c;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(enumC3870e2, new C4617b(1000L, 86400000L, set));
                EnumC3870e enumC3870e3 = EnumC3870e.f44126b;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(z5.d.f48377b)));
                if (setUnmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(enumC3870e3, new C4617b(86400000L, 86400000L, setUnmodifiableSet));
                if (map.keySet().size() < EnumC3870e.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new C4616a(c1038ka, map);
        }
    }
}
