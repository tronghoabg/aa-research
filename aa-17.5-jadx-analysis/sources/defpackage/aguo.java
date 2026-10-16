package defpackage;

/* loaded from: classes3.dex */
final class aguo implements agup {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "member";
                break;
            case 2:
            case 4:
            case 6:
            case 8:
                objArr[0] = "descriptor";
                break;
            case 3:
                objArr[0] = "element";
                break;
            case 5:
                objArr[0] = "field";
                break;
            case 7:
                objArr[0] = "javaClass";
                break;
            default:
                objArr[0] = "fqName";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "recordMethod";
                break;
            case 3:
            case 4:
                objArr[2] = "recordConstructor";
                break;
            case 5:
            case 6:
                objArr[2] = "recordField";
                break;
            case 7:
            case 8:
                objArr[2] = "recordClass";
                break;
            default:
                objArr[2] = "getClassResolvedFromSource";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.agup
    public agba getClassResolvedFromSource(ahnf ahnfVar) {
        if (ahnfVar != null) {
            return null;
        }
        $$$reportNull$$$0(0);
        return null;
    }

    @Override // defpackage.agup
    public void recordClass(agzj agzjVar, agba agbaVar) {
        if (agzjVar == null) {
            $$$reportNull$$$0(7);
        }
        if (agbaVar == null) {
            $$$reportNull$$$0(8);
        }
    }

    @Override // defpackage.agup
    public void recordConstructor(agzn agznVar, agbh agbhVar) {
        if (agznVar == null) {
            $$$reportNull$$$0(3);
        }
        if (agbhVar == null) {
            $$$reportNull$$$0(4);
        }
    }

    @Override // defpackage.agup
    public void recordField(agzo agzoVar, agdn agdnVar) {
        if (agzoVar == null) {
            $$$reportNull$$$0(5);
        }
        if (agdnVar == null) {
            $$$reportNull$$$0(6);
        }
    }

    @Override // defpackage.agup
    public void recordMethod(agzq agzqVar, agdv agdvVar) {
        if (agzqVar == null) {
            $$$reportNull$$$0(1);
        }
        if (agdvVar == null) {
            $$$reportNull$$$0(2);
        }
    }
}
