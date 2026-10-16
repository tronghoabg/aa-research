package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class aggt extends aggz implements agee {
    private final aiec<aigw> defaultType;
    private final int index;
    private final boolean reified;
    private final aiei storageManager;
    private final aiec<aiid> typeConstructor;
    private final aijg variance;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected aggt(aiei aieiVar, agbi agbiVar, agfk agfkVar, ahnj ahnjVar, aijg aijgVar, boolean z, int i, agdx agdxVar, agec agecVar) {
        super(agbiVar, agfkVar, ahnjVar, agdxVar);
        if (aieiVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agbiVar == null) {
            $$$reportNull$$$0(1);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(2);
        }
        if (ahnjVar == null) {
            $$$reportNull$$$0(3);
        }
        if (aijgVar == null) {
            $$$reportNull$$$0(4);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(5);
        }
        if (agecVar == null) {
            $$$reportNull$$$0(6);
        }
        this.variance = aijgVar;
        this.reified = z;
        this.index = i;
        this.typeConstructor = aieiVar.createLazyValue(new aggp(this, aieiVar, agecVar));
        this.defaultType = aieiVar.createLazyValue(new aggr(this, ahnjVar));
        this.storageManager = aieiVar;
    }

    @Override // defpackage.agbi
    public <R, D> R accept(agbk<R, D> agbkVar, D d) {
        return agbkVar.visitTypeParameterDescriptor(this, d);
    }

    @Override // defpackage.agbd
    public aigw getDefaultType() {
        aigw aigwVarInvoke = this.defaultType.invoke();
        if (aigwVarInvoke == null) {
            $$$reportNull$$$0(10);
        }
        return aigwVarInvoke;
    }

    @Override // defpackage.agee
    public int getIndex() {
        return this.index;
    }

    @Override // defpackage.agee
    public aiei getStorageManager() {
        aiei aieiVar = this.storageManager;
        if (aieiVar == null) {
            $$$reportNull$$$0(14);
        }
        return aieiVar;
    }

    @Override // defpackage.agee, defpackage.agbd
    public final aiid getTypeConstructor() {
        aiid aiidVarInvoke = this.typeConstructor.invoke();
        if (aiidVarInvoke == null) {
            $$$reportNull$$$0(9);
        }
        return aiidVarInvoke;
    }

    @Override // defpackage.agee
    public List<aigl> getUpperBounds() {
        List<aigl> listMo89getSupertypes = ((aggs) getTypeConstructor()).mo89getSupertypes();
        if (listMo89getSupertypes == null) {
            $$$reportNull$$$0(8);
        }
        return listMo89getSupertypes;
    }

    @Override // defpackage.agee
    public aijg getVariance() {
        aijg aijgVar = this.variance;
        if (aijgVar == null) {
            $$$reportNull$$$0(7);
        }
        return aijgVar;
    }

    @Override // defpackage.agee
    public boolean isCapturedFromOuterDeclaration() {
        return false;
    }

    @Override // defpackage.agee
    public boolean isReified() {
        return this.reified;
    }

    protected List<aigl> processBoundsWithoutCycles(List<aigl> list) {
        if (list == null) {
            $$$reportNull$$$0(12);
        }
        if (list == null) {
            $$$reportNull$$$0(13);
        }
        return list;
    }

    /* renamed from: reportSupertypeLoopError */
    protected abstract void mo92reportSupertypeLoopError(aigl aiglVar);

    protected abstract List<aigl> resolveUpperBounds();

    @Override // defpackage.aggz, defpackage.aggy, defpackage.agbi
    public agee getOriginal() {
        return this;
    }
}
