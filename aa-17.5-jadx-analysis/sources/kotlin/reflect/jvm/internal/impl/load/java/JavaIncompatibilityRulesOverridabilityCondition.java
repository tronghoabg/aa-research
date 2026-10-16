package kotlin.reflect.jvm.internal.impl.load.java;

import defpackage.affa;
import defpackage.afye;
import defpackage.agav;
import defpackage.agax;
import defpackage.agba;
import defpackage.agcj;
import defpackage.agsb;
import defpackage.agsw;
import defpackage.agtu;
import defpackage.agtw;
import defpackage.agua;
import defpackage.aguz;
import defpackage.ahfp;
import defpackage.ahnj;
import defpackage.ahsu;
import defpackage.ahsv;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;

/* loaded from: classes3.dex */
public final class JavaIncompatibilityRulesOverridabilityCondition implements ExternalOverridabilityCondition {
    public static final agsw Companion = new agsw(null);

    private final boolean isIncompatibleInAccordanceWithBuiltInOverridabilityRules(agav agavVar, agav agavVar2, agba agbaVar) {
        if (!(agavVar instanceof agax) || !(agavVar2 instanceof agcj) || afye.isBuiltIn(agavVar2)) {
            return false;
        }
        agsb agsbVar = agsb.INSTANCE;
        agcj agcjVar = (agcj) agavVar2;
        ahnj name = agcjVar.getName();
        name.getClass();
        if (!agsbVar.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            agtw agtwVar = agua.Companion;
            ahnj name2 = agcjVar.getName();
            name2.getClass();
            if (!agtwVar.getSameAsRenamedInJvmBuiltin(name2)) {
                return false;
            }
        }
        agax overriddenSpecialBuiltin = agtu.getOverriddenSpecialBuiltin((agax) agavVar);
        boolean z = agavVar instanceof agcj;
        agcj agcjVar2 = z ? (agcj) agavVar : null;
        if ((agcjVar2 == null || agcjVar.isHiddenToOvercomeSignatureClash() != agcjVar2.isHiddenToOvercomeSignatureClash()) && (overriddenSpecialBuiltin == null || !agcjVar.isHiddenToOvercomeSignatureClash())) {
            return true;
        }
        if (!(agbaVar instanceof aguz) || agcjVar.getInitialSignatureDescriptor() != null || overriddenSpecialBuiltin == null || agtu.hasRealKotlinSuperClassWithOverrideOf(agbaVar, overriddenSpecialBuiltin)) {
            return false;
        }
        if ((overriddenSpecialBuiltin instanceof agcj) && z && agsb.getOverriddenBuiltinFunctionWithErasedValueParametersInJava((agcj) overriddenSpecialBuiltin) != null) {
            String strComputeJvmDescriptor$default = ahfp.computeJvmDescriptor$default(agcjVar, false, false, 2, null);
            agcj original = ((agcj) agavVar).getOriginal();
            original.getClass();
            if (affa.f(strComputeJvmDescriptor$default, ahfp.computeJvmDescriptor$default(original, false, false, 2, null))) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ahsu getContract() {
        return ahsu.CONFLICTS_ONLY;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ahsv isOverridable(agav agavVar, agav agavVar2, agba agbaVar) {
        agavVar.getClass();
        agavVar2.getClass();
        return (isIncompatibleInAccordanceWithBuiltInOverridabilityRules(agavVar, agavVar2, agbaVar) || Companion.doesJavaOverrideHaveIncompatibleValueParameterKinds(agavVar, agavVar2)) ? ahsv.INCOMPATIBLE : ahsv.UNKNOWN;
    }
}
