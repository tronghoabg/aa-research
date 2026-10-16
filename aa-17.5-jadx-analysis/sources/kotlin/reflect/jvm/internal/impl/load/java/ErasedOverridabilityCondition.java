package kotlin.reflect.jvm.internal.impl.load.java;

import defpackage.afbe;
import defpackage.afrg;
import defpackage.agav;
import defpackage.agba;
import defpackage.agdq;
import defpackage.agdv;
import defpackage.agee;
import defpackage.agel;
import defpackage.agsi;
import defpackage.agve;
import defpackage.agza;
import defpackage.agzc;
import defpackage.ahsu;
import defpackage.ahsv;
import defpackage.ahth;
import defpackage.ahti;
import defpackage.ahtj;
import defpackage.aigl;
import defpackage.aiim;
import defpackage.airl;
import defpackage.airm;
import defpackage.airp;
import defpackage.woy;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;

/* loaded from: classes3.dex */
public final class ErasedOverridabilityCondition implements ExternalOverridabilityCondition {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ahsu getContract() {
        return ahsu.SUCCESS_ONLY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ahsv isOverridable(agav agavVar, agav agavVar2, agba agbaVar) {
        agavVar.getClass();
        agavVar2.getClass();
        if (agavVar2 instanceof agve) {
            agve agveVar = (agve) agavVar2;
            if (agveVar.getTypeParameters().isEmpty()) {
                ahti basicOverridabilityProblem = ahtj.getBasicOverridabilityProblem(agavVar, agavVar2);
                aiim aiimVar = null;
                Object[] objArr = 0;
                if ((basicOverridabilityProblem != null ? basicOverridabilityProblem.getResult() : null) == null) {
                    List<agel> valueParameters = agveVar.getValueParameters();
                    valueParameters.getClass();
                    airp airpVarQ = afrg.q(woy.cm(valueParameters), agsi.INSTANCE);
                    aigl returnType = agveVar.getReturnType();
                    returnType.getClass();
                    airp airpVarS = afrg.s(airpVarQ, returnType);
                    agdq extensionReceiverParameter = agveVar.getExtensionReceiverParameter();
                    int i = 1;
                    airl airlVar = new airl((airm) afrg.d(woy.dk(new airp[]{airpVarS, woy.cm(woy.bj(extensionReceiverParameter != null ? extensionReceiverParameter.getType() : null))})));
                    while (true) {
                        if (airlVar.hasNext()) {
                            aigl aiglVar = (aigl) airlVar.next();
                            if (!aiglVar.getArguments().isEmpty() && !(aiglVar.unwrap() instanceof agzc)) {
                                break;
                            }
                        } else {
                            agav agavVarBuild = (agav) agavVar.substitute(new agza(aiimVar, i, objArr == true ? 1 : 0).buildSubstitutor());
                            if (agavVarBuild != null) {
                                if (agavVarBuild instanceof agdv) {
                                    agdv agdvVar = (agdv) agavVarBuild;
                                    List<agee> typeParameters = agdvVar.getTypeParameters();
                                    typeParameters.getClass();
                                    if (!typeParameters.isEmpty()) {
                                        agavVarBuild = agdvVar.newCopyBuilder().setTypeParameters(afbe.a).build();
                                        agavVarBuild.getClass();
                                    }
                                }
                                ahth result = ahtj.DEFAULT.isOverridableByWithoutExternalConditions(agavVarBuild, agavVar2, false).getResult();
                                result.getClass();
                                return result.ordinal() != 0 ? ahsv.UNKNOWN : ahsv.OVERRIDABLE;
                            }
                        }
                    }
                }
            }
        }
        return ahsv.UNKNOWN;
    }
}
