package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class afyp {
    private static final agid FAKE_CONTINUATION_CLASS_DESCRIPTOR;

    static {
        agid agidVar = new agid(new aghb(ailm.INSTANCE.getErrorModule(), afyo.COROUTINES_PACKAGE_FQ_NAME), agbb.INTERFACE, false, false, afyo.CONTINUATION_INTERFACE_FQ_NAME.shortName(), agdx.NO_SOURCE, aidz.NO_LOCKS);
        agidVar.setModality(agcq.ABSTRACT);
        agidVar.setVisibility(agcb.PUBLIC);
        agidVar.setTypeParameterDescriptors(woy.bg(agiu.createWithDefaultBound(agidVar, agfk.Companion.getEMPTY(), false, aijg.IN_VARIANCE, ahnj.identifier("T"), 0, aidz.NO_LOCKS)));
        agidVar.createTypeConstructor();
        FAKE_CONTINUATION_CLASS_DESCRIPTOR = agidVar;
    }

    public static final aigw transformSuspendFunctionToRuntimeFunctionType(aigl aiglVar) {
        aiglVar.getClass();
        afxy.isSuspendFunctionType(aiglVar);
        afye builtIns = aimr.getBuiltIns(aiglVar);
        agfk annotations = aiglVar.getAnnotations();
        aigl receiverTypeFromFunctionType = afxy.getReceiverTypeFromFunctionType(aiglVar);
        List<aigl> contextReceiverTypesFromFunctionType = afxy.getContextReceiverTypesFromFunctionType(aiglVar);
        List<aiin> valueParameterTypesFromFunctionType = afxy.getValueParameterTypesFromFunctionType(aiglVar);
        ArrayList arrayList = new ArrayList(woy.bp(valueParameterTypesFromFunctionType, 10));
        Iterator<T> it = valueParameterTypesFromFunctionType.iterator();
        while (it.hasNext()) {
            arrayList.add(((aiin) it.next()).getType());
        }
        aihr empty = aihr.Companion.getEmpty();
        aiid typeConstructor = FAKE_CONTINUATION_CLASS_DESCRIPTOR.getTypeConstructor();
        typeConstructor.getClass();
        List listBZ = woy.bZ(arrayList, aigq.simpleType$default(empty, typeConstructor, woy.bg(aimr.asTypeProjection(afxy.getReturnTypeFromFunctionType(aiglVar))), false, (aiju) null, 16, (Object) null));
        aigw nullableAnyType = aimr.getBuiltIns(aiglVar).getNullableAnyType();
        nullableAnyType.getClass();
        return afxy.createFunctionType(builtIns, annotations, receiverTypeFromFunctionType, contextReceiverTypesFromFunctionType, listBZ, null, nullableAnyType, false & ((128 & 128) == 0)).makeNullableAsSpecified(aiglVar.isMarkedNullable());
    }
}
