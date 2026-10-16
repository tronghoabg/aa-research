package defpackage;

import java.util.Set;

/* loaded from: classes3.dex */
final class aghf extends ahsy {
    final /* synthetic */ aghg this$1;
    final /* synthetic */ Set val$result;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public aghf(aghg aghgVar, Set set) {
        this.this$1 = aghgVar;
        this.val$result = set;
    }

    @Override // defpackage.ahsz
    public void addFakeOverride(agax agaxVar) {
        if (agaxVar == null) {
            $$$reportNull$$$0(0);
        }
        ahtj.resolveUnknownVisibilityForMember(agaxVar, null);
        this.val$result.add(agaxVar);
    }

    @Override // defpackage.ahsy
    protected void conflict(agax agaxVar, agax agaxVar2) {
        if (agaxVar == null) {
            $$$reportNull$$$0(1);
        }
        if (agaxVar2 == null) {
            $$$reportNull$$$0(2);
        }
    }
}
