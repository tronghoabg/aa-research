package defpackage;

import java.util.Collection;
import java.util.Set;

/* loaded from: classes3.dex */
final class agud extends ahsy {
    final /* synthetic */ ahzh val$errorReporter;
    final /* synthetic */ boolean val$isStaticContext;
    final /* synthetic */ Set val$result;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i == 2) {
            objArr[0] = "fromCurrent";
        } else if (i == 3) {
            objArr[0] = "member";
        } else if (i != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else if (i == 3 || i == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public agud(ahzh ahzhVar, Set set, boolean z) {
        this.val$errorReporter = ahzhVar;
        this.val$result = set;
        this.val$isStaticContext = z;
    }

    @Override // defpackage.ahsz
    public void addFakeOverride(agax agaxVar) {
        if (agaxVar == null) {
            $$$reportNull$$$0(0);
        }
        ahtj.resolveUnknownVisibilityForMember(agaxVar, new aguc(this));
        this.val$result.add(agaxVar);
    }

    @Override // defpackage.ahsy
    public void conflict(agax agaxVar, agax agaxVar2) {
        if (agaxVar == null) {
            $$$reportNull$$$0(1);
        }
        if (agaxVar2 == null) {
            $$$reportNull$$$0(2);
        }
    }

    @Override // defpackage.ahsz
    public void setOverriddenDescriptors(agax agaxVar, Collection<? extends agax> collection) {
        if (agaxVar == null) {
            $$$reportNull$$$0(3);
        }
        if (collection == null) {
            $$$reportNull$$$0(4);
        }
        if (!this.val$isStaticContext || agaxVar.getKind() == agaw.FAKE_OVERRIDE) {
            super.setOverriddenDescriptors(agaxVar, collection);
        }
    }
}
