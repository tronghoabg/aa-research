package kotlin.reflect.jvm.internal.impl.load.java;

import defpackage.affa;
import defpackage.agav;
import defpackage.agba;
import defpackage.agdn;
import defpackage.agwf;
import defpackage.ahsu;
import defpackage.ahsv;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;

/* loaded from: classes3.dex */
public final class FieldOverridabilityCondition implements ExternalOverridabilityCondition {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ahsu getContract() {
        return ahsu.BOTH;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ahsv isOverridable(agav agavVar, agav agavVar2, agba agbaVar) {
        agavVar.getClass();
        agavVar2.getClass();
        if ((agavVar2 instanceof agdn) && (agavVar instanceof agdn)) {
            agdn agdnVar = (agdn) agavVar2;
            agdn agdnVar2 = (agdn) agavVar;
            if (affa.f(agdnVar.getName(), agdnVar2.getName())) {
                if (agwf.isJavaField(agdnVar) && agwf.isJavaField(agdnVar2)) {
                    return ahsv.OVERRIDABLE;
                }
                if (agwf.isJavaField(agdnVar) || agwf.isJavaField(agdnVar2)) {
                    return ahsv.INCOMPATIBLE;
                }
            }
        }
        return ahsv.UNKNOWN;
    }
}
