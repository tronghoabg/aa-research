package com.waze.shared_infra.coordinators;

import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class AapCoordinatorNonFatalException$MainScreenPopToRoot extends a {
    private final List<o<?, ?, ?>> subCoordinators;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AapCoordinatorNonFatalException$MainScreenPopToRoot(List<? extends o<?, ?, ?>> list) {
        super("MainScreenPopToRoot", list, null);
        x.f(list, "subCoordinators");
        this.subCoordinators = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AapCoordinatorNonFatalException$MainScreenPopToRoot copy$default(AapCoordinatorNonFatalException$MainScreenPopToRoot aapCoordinatorNonFatalException$MainScreenPopToRoot, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = aapCoordinatorNonFatalException$MainScreenPopToRoot.subCoordinators;
        }
        return aapCoordinatorNonFatalException$MainScreenPopToRoot.copy(list);
    }

    public final List<o<?, ?, ?>> component1() {
        return this.subCoordinators;
    }

    public final AapCoordinatorNonFatalException$MainScreenPopToRoot copy(List<? extends o<?, ?, ?>> list) {
        x.f(list, "subCoordinators");
        return new AapCoordinatorNonFatalException$MainScreenPopToRoot(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AapCoordinatorNonFatalException$MainScreenPopToRoot) && x.n(this.subCoordinators, ((AapCoordinatorNonFatalException$MainScreenPopToRoot) obj).subCoordinators);
    }

    public final List<o<?, ?, ?>> getSubCoordinators() {
        return this.subCoordinators;
    }

    public int hashCode() {
        return this.subCoordinators.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "MainScreenPopToRoot(subCoordinators=" + this.subCoordinators + ")";
    }
}
