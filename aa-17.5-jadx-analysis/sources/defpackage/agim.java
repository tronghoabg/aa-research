package defpackage;

import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class agim extends agii implements agdp {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final agdp original;
    private agel parameter;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA;
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agim(agdn agdnVar, agfk agfkVar, agcq agcqVar, agcc agccVar, boolean z, boolean z2, boolean z3, agaw agawVar, agdp agdpVar, agdx agdxVar) {
        super(agcqVar, agccVar, agdnVar, agfkVar, ahnj.special("<set-" + agdnVar.getName() + ">"), z, z2, z3, agawVar, agdxVar);
        if (agdnVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(1);
        }
        if (agcqVar == null) {
            $$$reportNull$$$0(2);
        }
        if (agccVar == null) {
            $$$reportNull$$$0(3);
        }
        if (agawVar == null) {
            $$$reportNull$$$0(4);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(5);
        }
        this.original = agdpVar == null ? this : agdpVar;
    }

    public static agiy createSetterParameter(agdp agdpVar, aigl aiglVar, agfk agfkVar) {
        if (agdpVar == null) {
            $$$reportNull$$$0(7);
        }
        if (aiglVar == null) {
            $$$reportNull$$$0(8);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(9);
        }
        return new agiy(agdpVar, null, 0, agfkVar, ahnm.IMPLICIT_SET_PARAMETER, aiglVar, false, false, false, null, agdx.NO_SOURCE);
    }

    @Override // defpackage.agbi
    public <R, D> R accept(agbk<R, D> agbkVar, D d) {
        return agbkVar.visitPropertySetterDescriptor(this, d);
    }

    @Override // defpackage.agii, defpackage.aggz, defpackage.aggy, defpackage.agbi
    public agdp getOriginal() {
        agdp agdpVar = this.original;
        if (agdpVar == null) {
            $$$reportNull$$$0(13);
        }
        return agdpVar;
    }

    @Override // defpackage.agcj, defpackage.agax, defpackage.agav
    public Collection<? extends agdp> getOverriddenDescriptors() {
        return super.getOverriddenDescriptors(false);
    }

    @Override // defpackage.agav
    public aigl getReturnType() {
        aigw unitType = ahvz.getBuiltIns(this).getUnitType();
        if (unitType == null) {
            $$$reportNull$$$0(12);
        }
        return unitType;
    }

    @Override // defpackage.agav
    public List<agel> getValueParameters() {
        agel agelVar = this.parameter;
        if (agelVar == null) {
            throw new IllegalStateException();
        }
        List<agel> listSingletonList = Collections.singletonList(agelVar);
        if (listSingletonList == null) {
            $$$reportNull$$$0(11);
        }
        return listSingletonList;
    }

    public void initialize(agel agelVar) {
        if (agelVar == null) {
            $$$reportNull$$$0(6);
        }
        this.parameter = agelVar;
    }
}
