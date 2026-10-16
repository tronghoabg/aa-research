package defpackage;

import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class agwl implements agvg {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(agwl.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0), new affn(agwl.class, RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0), new affn(agwl.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0)};
    private final aiec allValueArguments$delegate;
    private final agvu c;
    private final aied fqName$delegate;
    private final boolean isFreshlySupportedTypeUseAnnotation;
    private final boolean isIdeExternalAnnotation;
    private final agzf javaAnnotation;
    private final agzd source;
    private final aiec type$delegate;

    public agwl(agvu agvuVar, agzf agzfVar, boolean z) {
        agvuVar.getClass();
        agzfVar.getClass();
        this.c = agvuVar;
        this.javaAnnotation = agzfVar;
        this.fqName$delegate = agvuVar.getStorageManager().createNullableLazyValue(new agwi(this));
        this.type$delegate = agvuVar.getStorageManager().createLazyValue(new agwj(this));
        this.source = agvuVar.getComponents().getSourceElementFactory().source(agzfVar);
        this.allValueArguments$delegate = agvuVar.getStorageManager().createLazyValue(new agwk(this));
        this.isIdeExternalAnnotation = agzfVar.isIdeExternalAnnotation();
        boolean zIsFreshlySupportedTypeUseAnnotation = agzfVar.isFreshlySupportedTypeUseAnnotation();
        boolean z2 = true;
        if (!zIsFreshlySupportedTypeUseAnnotation && !z) {
            z2 = false;
        }
        this.isFreshlySupportedTypeUseAnnotation = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map allValueArguments_delegate$lambda$0(agwl agwlVar) {
        Collection<agzg> arguments = agwlVar.javaAnnotation.getArguments();
        ArrayList arrayList = new ArrayList();
        for (agzg agzgVar : arguments) {
            ahnj name = agzgVar.getName();
            if (name == null) {
                name = agti.DEFAULT_ANNOTATION_MEMBER_NAME;
            }
            ahuh<?> ahuhVarResolveAnnotationArgument = agwlVar.resolveAnnotationArgument(agzgVar);
            aezu aezuVar = ahuhVarResolveAnnotationArgument != null ? new aezu(name, ahuhVarResolveAnnotationArgument) : null;
            if (aezuVar != null) {
                arrayList.add(aezuVar);
            }
        }
        return woy.bc(arrayList);
    }

    private final agba createTypeForMissingDependencies(ahnf ahnfVar) {
        return agch.findNonGenericClassAcrossDependencies(this.c.getModule(), ahnd.Companion.topLevel(ahnfVar), this.c.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahnf fqName_delegate$lambda$0(agwl agwlVar) {
        ahnd classId = agwlVar.javaAnnotation.getClassId();
        if (classId != null) {
            return classId.asSingleFqName();
        }
        return null;
    }

    private final ahuh<?> resolveAnnotationArgument(agzg agzgVar) {
        if (agzgVar instanceof agla) {
            return ahuj.createConstantValue$default(ahuj.INSTANCE, ((agla) agzgVar).getValue(), null, 2, null);
        }
        if (agzgVar instanceof agky) {
            agky agkyVar = (agky) agzgVar;
            return resolveFromEnumValue(agkyVar.getEnumClassId(), agkyVar.getEntryName());
        }
        if (!(agzgVar instanceof agkj)) {
            if (agzgVar instanceof agkg) {
                return resolveFromAnnotation(((agkg) agzgVar).getAnnotation());
            }
            if (agzgVar instanceof agku) {
                return resolveFromJavaClassObjectType(((agku) agzgVar).getReferencedType());
            }
            return null;
        }
        agkj agkjVar = (agkj) agzgVar;
        ahnj name = agkjVar.getName();
        if (name == null) {
            name = agti.DEFAULT_ANNOTATION_MEMBER_NAME;
        }
        name.getClass();
        return resolveFromArray(name, agkjVar.getElements());
    }

    private final ahuh<?> resolveFromAnnotation(agzf agzfVar) {
        return new ahub(new agwl(this.c, agzfVar, false, 4, null));
    }

    private final ahuh<?> resolveFromArray(ahnj ahnjVar, List<? extends agzg> list) {
        aigl arrayType;
        if (aigr.isError(getType())) {
            return null;
        }
        agba annotationClass = ahvz.getAnnotationClass(this);
        annotationClass.getClass();
        agel annotationParameterByName = ague.getAnnotationParameterByName(ahnjVar, annotationClass);
        if (annotationParameterByName == null || (arrayType = annotationParameterByName.getType()) == null) {
            arrayType = this.c.getComponents().getModule().getBuiltIns().getArrayType(aijg.INVARIANT, ailm.createErrorType(aill.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
            arrayType.getClass();
        }
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ahuh<?> ahuhVarResolveAnnotationArgument = resolveAnnotationArgument((agzg) it.next());
            if (ahuhVarResolveAnnotationArgument == null) {
                ahuhVarResolveAnnotationArgument = new ahve();
            }
            arrayList.add(ahuhVarResolveAnnotationArgument);
        }
        return ahuj.INSTANCE.createArrayValue(arrayList, arrayType);
    }

    private final ahuh<?> resolveFromEnumValue(ahnd ahndVar, ahnj ahnjVar) {
        if (ahndVar == null || ahnjVar == null) {
            return null;
        }
        return new ahul(ahndVar, ahnjVar);
    }

    private final ahuh<?> resolveFromJavaClassObjectType(agzw agzwVar) {
        return ahvc.Companion.create(this.c.getTypeResolver().transformJavaType(agzwVar, agys.toAttributes$default(aija.COMMON, false, false, null, 7, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aigw type_delegate$lambda$0(agwl agwlVar) {
        ahnf fqName = agwlVar.getFqName();
        if (fqName == null) {
            return ailm.createErrorType(aill.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, agwlVar.javaAnnotation.toString());
        }
        agba agbaVarMapJavaToKotlin$default = afzr.mapJavaToKotlin$default(afzr.INSTANCE, fqName, agwlVar.c.getModule().getBuiltIns(), null, 4, null);
        if (agbaVarMapJavaToKotlin$default == null) {
            agzj agzjVarResolve = agwlVar.javaAnnotation.resolve();
            agbaVarMapJavaToKotlin$default = agzjVarResolve != null ? agwlVar.c.getComponents().getModuleClassResolver().resolveClass(agzjVarResolve) : null;
            if (agbaVarMapJavaToKotlin$default == null) {
                agbaVarMapJavaToKotlin$default = agwlVar.createTypeForMissingDependencies(fqName);
            }
        }
        return agbaVarMapJavaToKotlin$default.getDefaultType();
    }

    @Override // defpackage.agfc
    public Map<ahnj, ahuh<?>> getAllValueArguments() {
        return (Map) aieh.getValue(this.allValueArguments$delegate, this, $$delegatedProperties[2]);
    }

    @Override // defpackage.agfc
    public ahnf getFqName() {
        return (ahnf) aieh.getValue(this.fqName$delegate, this, $$delegatedProperties[0]);
    }

    @Override // defpackage.agfc
    public aigw getType() {
        return (aigw) aieh.getValue(this.type$delegate, this, $$delegatedProperties[1]);
    }

    public final boolean isFreshlySupportedTypeUseAnnotation() {
        return this.isFreshlySupportedTypeUseAnnotation;
    }

    @Override // defpackage.agvg
    public boolean isIdeExternalAnnotation() {
        return this.isIdeExternalAnnotation;
    }

    public String toString() {
        return ahre.renderAnnotation$default(ahre.FQ_NAMES_IN_TYPES, this, null, 2, null);
    }

    @Override // defpackage.agfc
    public agzd getSource() {
        return this.source;
    }

    public /* synthetic */ agwl(agvu agvuVar, agzf agzfVar, boolean z, int i, afeu afeuVar) {
        this(agvuVar, agzfVar, z & ((i & 4) == 0));
    }
}
