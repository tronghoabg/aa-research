package Pd;

import ff.w;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import wa.C4398a;

/* loaded from: classes5.dex */
public final class b {

    @NotNull
    private volatile /* synthetic */ Object current = w.f35433a;

    static {
        AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "current");
    }

    public final Object a(C4398a key) {
        AbstractC3340k.e(key, "key");
        return ((Map) this.current).get(key);
    }
}
