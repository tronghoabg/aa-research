package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class afzv implements agfy {
    private final aiec cloneable$delegate;
    private final afec<agcu, agbi> computeContainingDeclaration;
    private final agcu moduleDescriptor;
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(afzv.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0)};
    public static final afzu Companion = new afzu(null);
    private static final ahnf KOTLIN_FQ_NAME = afyo.BUILT_INS_PACKAGE_FQ_NAME;
    private static final ahnj CLONEABLE_NAME = afyn.cloneable.shortName();
    private static final ahnd CLONEABLE_CLASS_ID = ahnd.Companion.topLevel(afyn.cloneable.toSafe());

    /* JADX WARN: Multi-variable type inference failed */
    public afzv(aiei aieiVar, agcu agcuVar, afec<? super agcu, ? extends agbi> afecVar) {
        aieiVar.getClass();
        agcuVar.getClass();
        afecVar.getClass();
        this.moduleDescriptor = agcuVar;
        this.computeContainingDeclaration = afecVar;
        this.cloneable$delegate = aieiVar.createLazyValue(new afzs(this, aieiVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agbi _init_$lambda$0(agcu agcuVar) {
        agcuVar.getClass();
        List<agdc> fragments = agcuVar.getPackage(KOTLIN_FQ_NAME).getFragments();
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof afxr) {
                arrayList.add(obj);
            }
        }
        return (agbi) woy.bF(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aggw cloneable_delegate$lambda$0(afzv afzvVar, aiei aieiVar) {
        aggw aggwVar = new aggw(afzvVar.computeContainingDeclaration.invoke(afzvVar.moduleDescriptor), CLONEABLE_NAME, agcq.ABSTRACT, agbb.INTERFACE, woy.bg(afzvVar.moduleDescriptor.getBuiltIns().getAnyType()), agdx.NO_SOURCE, false, aieiVar);
        aggwVar.initialize(new afzm(aieiVar, aggwVar), afbg.a, null);
        return aggwVar;
    }

    private final aggw getCloneable() {
        return (aggw) aieh.getValue(this.cloneable$delegate, this, $$delegatedProperties[0]);
    }

    @Override // defpackage.agfy
    public agba createClass(ahnd ahndVar) {
        ahndVar.getClass();
        if (affa.f(ahndVar, CLONEABLE_CLASS_ID)) {
            return getCloneable();
        }
        return null;
    }

    @Override // defpackage.agfy
    public Collection<agba> getAllContributedClassesIfPossible(ahnf ahnfVar) {
        ahnfVar.getClass();
        return affa.f(ahnfVar, KOTLIN_FQ_NAME) ? woy.aO(getCloneable()) : afbg.a;
    }

    @Override // defpackage.agfy
    public boolean shouldCreateClass(ahnf ahnfVar, ahnj ahnjVar) {
        ahnfVar.getClass();
        ahnjVar.getClass();
        return affa.f(ahnjVar, CLONEABLE_NAME) && affa.f(ahnfVar, KOTLIN_FQ_NAME);
    }

    public /* synthetic */ afzv(aiei aieiVar, agcu agcuVar, afec afecVar, int i, afeu afeuVar) {
        this(aieiVar, agcuVar, (i & 4) != 0 ? afzt.INSTANCE : afecVar);
    }
}
