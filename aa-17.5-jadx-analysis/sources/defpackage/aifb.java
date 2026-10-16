package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
final class aifb {
    private final Collection<aigl> allSupertypes;
    private List<? extends aigl> supertypesWithoutCycles;

    /* JADX WARN: Multi-variable type inference failed */
    public aifb(Collection<? extends aigl> collection) {
        collection.getClass();
        this.allSupertypes = collection;
        this.supertypesWithoutCycles = woy.bg(ailm.INSTANCE.getErrorTypeForLoopInSupertypes());
    }

    public final Collection<aigl> getAllSupertypes() {
        return this.allSupertypes;
    }

    public final List<aigl> getSupertypesWithoutCycles() {
        return this.supertypesWithoutCycles;
    }

    public final void setSupertypesWithoutCycles(List<? extends aigl> list) {
        list.getClass();
        this.supertypesWithoutCycles = list;
    }
}
