package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahec extends aheb {
    final /* synthetic */ agba $annotationClass;
    final /* synthetic */ ahnd $annotationClassId;
    final /* synthetic */ List<agfc> $result;
    final /* synthetic */ agdx $source;
    private final HashMap<ahnj, ahuh<?>> arguments;
    final /* synthetic */ ahed this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahec(ahed ahedVar, agba agbaVar, ahnd ahndVar, List<agfc> list, agdx agdxVar) {
        super(ahedVar);
        this.this$0 = ahedVar;
        this.$annotationClass = agbaVar;
        this.$annotationClassId = ahndVar;
        this.$result = list;
        this.$source = agdxVar;
        this.arguments = new HashMap<>();
    }

    @Override // defpackage.aheb
    public void visitArrayValue(ahnj ahnjVar, ArrayList<ahuh<?>> arrayList) {
        arrayList.getClass();
        if (ahnjVar == null) {
            return;
        }
        agel annotationParameterByName = ague.getAnnotationParameterByName(ahnjVar, this.$annotationClass);
        if (annotationParameterByName != null) {
            HashMap<ahnj, ahuh<?>> map = this.arguments;
            ahuj ahujVar = ahuj.INSTANCE;
            List<? extends ahuh<?>> listCompact = aiow.compact(arrayList);
            aigl type = annotationParameterByName.getType();
            type.getClass();
            map.put(ahnjVar, ahujVar.createArrayValue(listCompact, type));
            return;
        }
        if (this.this$0.isImplicitRepeatableContainer(this.$annotationClassId) && affa.f(ahnjVar.asString(), "value")) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof ahub) {
                    arrayList2.add(obj);
                }
            }
            List<agfc> list = this.$result;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                list.add((agfc) ((ahub) it.next()).getValue());
            }
        }
    }

    @Override // defpackage.aheb
    public void visitConstantValue(ahnj ahnjVar, ahuh<?> ahuhVar) {
        ahuhVar.getClass();
        if (ahnjVar != null) {
            this.arguments.put(ahnjVar, ahuhVar);
        }
    }

    @Override // defpackage.ahfe
    public void visitEnd() {
        if (this.this$0.isRepeatableWithImplicitContainer(this.$annotationClassId, this.arguments) || this.this$0.isImplicitRepeatableContainer(this.$annotationClassId)) {
            return;
        }
        List<agfc> list = this.$result;
        agba agbaVar = this.$annotationClass;
        list.add(new agfd(agbaVar.getDefaultType(), this.arguments, this.$source));
    }
}
