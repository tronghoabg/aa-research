package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class agvd extends defpackage.ahty {
    final /* synthetic */ defpackage.aiah val$errorReporter;
    final /* synthetic */ boolean val$isStaticContext;
    final /* synthetic */ java.util.Set val$result;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
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
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public agvd(defpackage.aiah aiahVar, java.util.Set set, boolean z) {
        this.val$errorReporter = aiahVar;
        this.val$result = set;
        this.val$isStaticContext = z;
    }

    @Override // defpackage.ahtz
    public void addFakeOverride(defpackage.agbx agbxVar) {
        if (agbxVar == null) {
            $$$reportNull$$$0(0);
        }
        defpackage.ahuj.resolveUnknownVisibilityForMember(agbxVar, new defpackage.agvc(this));
        this.val$result.add(agbxVar);
    }

    @Override // defpackage.ahty
    public void conflict(defpackage.agbx agbxVar, defpackage.agbx agbxVar2) {
        if (agbxVar == null) {
            $$$reportNull$$$0(1);
        }
        if (agbxVar2 == null) {
            $$$reportNull$$$0(2);
        }
    }

    @Override // defpackage.ahtz
    public void setOverriddenDescriptors(defpackage.agbx agbxVar, java.util.Collection<? extends defpackage.agbx> collection) {
        if (agbxVar == null) {
            $$$reportNull$$$0(3);
        }
        if (collection == null) {
            $$$reportNull$$$0(4);
        }
        if (!this.val$isStaticContext || agbxVar.getKind() == defpackage.agbw.FAKE_OVERRIDE) {
            super.setOverriddenDescriptors(agbxVar, collection);
        }
    }
}
