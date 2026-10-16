package com.waze.shared_infra.coordinators;

import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class AapCoordinatorNonFatalException$StartSubCoordinatorBlocked extends a {
    private final List<o<?, ?, ?>> subCoordinators;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AapCoordinatorNonFatalException$StartSubCoordinatorBlocked(List<? extends o<?, ?, ?>> list) {
        super("StartSubCoordinatorBlocked", list, null);
        x.f(list, "subCoordinators");
        this.subCoordinators = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AapCoordinatorNonFatalException$StartSubCoordinatorBlocked copy$default(AapCoordinatorNonFatalException$StartSubCoordinatorBlocked aapCoordinatorNonFatalException$StartSubCoordinatorBlocked, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = aapCoordinatorNonFatalException$StartSubCoordinatorBlocked.subCoordinators;
        }
        return aapCoordinatorNonFatalException$StartSubCoordinatorBlocked.copy(list);
    }

    public final List<o<?, ?, ?>> component1() {
        return this.subCoordinators;
    }

    public final AapCoordinatorNonFatalException$StartSubCoordinatorBlocked copy(List<? extends o<?, ?, ?>> list) {
        x.f(list, "subCoordinators");
        return new AapCoordinatorNonFatalException$StartSubCoordinatorBlocked(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AapCoordinatorNonFatalException$StartSubCoordinatorBlocked) && x.n(this.subCoordinators, ((AapCoordinatorNonFatalException$StartSubCoordinatorBlocked) obj).subCoordinators);
    }

    public final List<o<?, ?, ?>> getSubCoordinators() {
        return this.subCoordinators;
    }

    public int hashCode() {
        return this.subCoordinators.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "StartSubCoordinatorBlocked(subCoordinators=" + this.subCoordinators + ")";
    }
}
