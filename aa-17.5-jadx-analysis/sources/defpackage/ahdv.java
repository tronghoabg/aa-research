package defpackage;

import defpackage.ahdr;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class ahdv<A, S extends ahdr<? extends A>> implements ahyl<A> {
    public static final ahds Companion = new ahds(null);
    private final ahfc kotlinClassFinder;

    public ahdv(ahfc ahfcVar) {
        ahfcVar.getClass();
        this.kotlinClassFinder = ahfcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int computeJvmParameterIndexShift(defpackage.aiad r4, defpackage.ahpg r5) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof defpackage.ahif
            int r3 = r3.getContextParameterCount(r5)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L15
            ahif r5 = (defpackage.ahif) r5
            boolean r4 = defpackage.ahlg.hasReceiver(r5)
            if (r4 == 0) goto L13
            goto L3b
        L13:
            r1 = r2
            goto L3b
        L15:
            boolean r0 = r5 instanceof defpackage.ahis
            if (r0 == 0) goto L22
            ahis r5 = (defpackage.ahis) r5
            boolean r4 = defpackage.ahlg.hasReceiver(r5)
            if (r4 == 0) goto L13
            goto L3b
        L22:
            boolean r0 = r5 instanceof defpackage.ahhi
            if (r0 == 0) goto L3d
            r4.getClass()
            aiab r4 = (defpackage.aiab) r4
            ahhb r5 = r4.getKind()
            ahhb r0 = defpackage.ahhb.ENUM_CLASS
            if (r5 != r0) goto L35
            r1 = 2
            goto L3b
        L35:
            boolean r4 = r4.isInner()
            if (r4 == 0) goto L13
        L3b:
            int r3 = r3 + r1
            return r3
        L3d:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.Class r4 = r5.getClass()
            java.util.Objects.toString(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "Unsupported message: "
            java.lang.String r4 = r5.concat(r4)
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahdv.computeJvmParameterIndexShift(aiad, ahpg):int");
    }

    private final List<A> findClassAndLoadMemberAnnotations(aiad aiadVar, ahfn ahfnVar, boolean z, boolean z2, Boolean bool, boolean z3) {
        List<A> list;
        ahfj ahfjVarFindClassWithAnnotationsAndInitializers = findClassWithAnnotationsAndInitializers(aiadVar, Companion.getSpecialCaseContainerClass(aiadVar, z, z2, bool, z3, this.kotlinClassFinder, getMetadataVersion()));
        return (ahfjVarFindClassWithAnnotationsAndInitializers == null || (list = getAnnotationsContainer(ahfjVarFindClassWithAnnotationsAndInitializers).getMemberAnnotations().get(ahfnVar)) == null) ? afbe.a : list;
    }

    static /* synthetic */ List findClassAndLoadMemberAnnotations$default(ahdv ahdvVar, aiad aiadVar, ahfn ahfnVar, boolean z, boolean z2, Boolean bool, boolean z3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
        }
        boolean z4 = z & ((i & 4) == 0);
        boolean z5 = z2 & ((i & 8) == 0);
        if ((i & 16) != 0) {
            bool = null;
        }
        return ahdvVar.findClassAndLoadMemberAnnotations(aiadVar, ahfnVar, z4, z5, bool, z3 & ((i & 32) == 0));
    }

    private final int getCallableAnnotationFlags(ahpg ahpgVar, ahyh ahyhVar) {
        if (ahpgVar instanceof ahhi) {
            return ((ahhi) ahpgVar).getFlags();
        }
        if (ahpgVar instanceof ahif) {
            return ((ahif) ahpgVar).getFlags();
        }
        if (ahpgVar instanceof ahis) {
            return getPropertyFlags((ahis) ahpgVar, ahyhVar);
        }
        return 0;
    }

    public static /* synthetic */ ahfn getCallableSignature$default(ahdv ahdvVar, ahpg ahpgVar, ahld ahldVar, ahlh ahlhVar, ahyh ahyhVar, boolean z, int i, Object obj) {
        if (obj == null) {
            return ahdvVar.getCallableSignature(ahpgVar, ahldVar, ahlhVar, ahyhVar, z & ((i & 16) == 0));
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
    }

    private final int getContextParameterCount(ahpg ahpgVar) {
        if (ahpgVar instanceof ahif) {
            return ((ahif) ahpgVar).getContextParameterCount();
        }
        if (ahpgVar instanceof ahis) {
            return ((ahis) ahpgVar).getContextParameterCount();
        }
        return 0;
    }

    private final int getPropertyFlags(ahis ahisVar, ahyh ahyhVar) {
        int iOrdinal = ahyhVar.ordinal();
        return iOrdinal != 2 ? iOrdinal != 3 ? ahisVar.getFlags() : ahisVar.hasSetterFlags() ? ahisVar.getSetterFlags() : ahisVar.getFlags() : ahisVar.hasGetterFlags() ? ahisVar.getGetterFlags() : ahisVar.getFlags();
    }

    private final List<A> loadAnnotationsIfPresentInBytecode(int i, afdr<? extends List<? extends A>> afdrVar) {
        return noAnnotationsInBytecode(i) ? afbe.a : afdrVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<A> loadParameterAnnotations(aiad aiadVar, ahpg ahpgVar, ahyh ahyhVar, int i) {
        ahfn callableSignature$default = getCallableSignature$default(this, ahpgVar, aiadVar.getNameResolver(), aiadVar.getTypeTable(), ahyhVar, false, 16, null);
        return callableSignature$default == null ? afbe.a : findClassAndLoadMemberAnnotations$default(this, aiadVar, ahfn.Companion.fromMethodSignatureAndParameterIndex(callableSignature$default, i), false, false, null, false, 60, null);
    }

    private final List<A> loadPropertyAnnotations(aiad aiadVar, ahis ahisVar, ahdt ahdtVar) {
        Boolean bool = ahla.IS_CONST.get(ahisVar.getFlags());
        bool.booleanValue();
        boolean zIsMovedFromInterfaceCompanion = ahmt.isMovedFromInterfaceCompanion(ahisVar);
        if (ahdtVar == ahdt.PROPERTY) {
            ahfn propertySignature = ahdw.getPropertySignature(ahisVar, aiadVar.getNameResolver(), aiadVar.getTypeTable(), false & ((40 & 8) == 0), true & ((40 & 16) == 0), false | (!((40 & 32) == 0)));
            if (propertySignature != null) {
                return findClassAndLoadMemberAnnotations$default(this, aiadVar, propertySignature, true, false, bool, zIsMovedFromInterfaceCompanion, 8, null);
            }
        } else {
            ahfn propertySignature2 = ahdw.getPropertySignature(ahisVar, aiadVar.getNameResolver(), aiadVar.getTypeTable(), true & ((40 & 8) == 0), false & ((40 & 16) == 0), false | (!((40 & 32) == 0)));
            if (propertySignature2 != null) {
                if (afyh.u(propertySignature2.getSignature(), "$delegate", false) == (ahdtVar == ahdt.DELEGATE_FIELD)) {
                    return findClassAndLoadMemberAnnotations(aiadVar, propertySignature2, true, true, bool, zIsMovedFromInterfaceCompanion);
                }
            }
        }
        return afbe.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List loadPropertyBackingFieldAnnotations$lambda$0(ahdv ahdvVar, aiad aiadVar, ahis ahisVar) {
        return ahdvVar.loadPropertyAnnotations(aiadVar, ahisVar, ahdt.BACKING_FIELD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List loadPropertyDelegateFieldAnnotations$lambda$0(ahdv ahdvVar, aiad aiadVar, ahis ahisVar) {
        return ahdvVar.loadPropertyAnnotations(aiadVar, ahisVar, ahdt.DELEGATE_FIELD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List loadValueParameterAnnotations$lambda$0(ahdv ahdvVar, aiad aiadVar, ahpg ahpgVar, ahyh ahyhVar, int i) {
        return ahdvVar.loadParameterAnnotations(aiadVar, ahpgVar, ahyhVar, i + ahdvVar.computeJvmParameterIndexShift(aiadVar, ahpgVar));
    }

    private final boolean noAnnotationsInBytecode(int i) {
        return !ahla.HAS_ANNOTATIONS.get(i).booleanValue();
    }

    private final ahfj toBinaryClass(aiab aiabVar) {
        agdx source = aiabVar.getSource();
        ahfl ahflVar = source instanceof ahfl ? (ahfl) source : null;
        if (ahflVar != null) {
            return ahflVar.getBinaryClass();
        }
        return null;
    }

    protected final ahfj findClassWithAnnotationsAndInitializers(aiad aiadVar, ahfj ahfjVar) {
        aiadVar.getClass();
        if (ahfjVar != null) {
            return ahfjVar;
        }
        if (aiadVar instanceof aiab) {
            return toBinaryClass((aiab) aiadVar);
        }
        return null;
    }

    protected abstract S getAnnotationsContainer(ahfj ahfjVar);

    protected byte[] getCachedFileContent(ahfj ahfjVar) {
        ahfjVar.getClass();
        return null;
    }

    protected final ahfn getCallableSignature(ahpg ahpgVar, ahld ahldVar, ahlh ahlhVar, ahyh ahyhVar, boolean z) throws IOException {
        ahpgVar.getClass();
        ahldVar.getClass();
        ahlhVar.getClass();
        ahyhVar.getClass();
        if (ahpgVar instanceof ahhi) {
            ahfm ahfmVar = ahfn.Companion;
            ahmm jvmConstructorSignature = ahmt.INSTANCE.getJvmConstructorSignature((ahhi) ahpgVar, ahldVar, ahlhVar);
            if (jvmConstructorSignature == null) {
                return null;
            }
            return ahfmVar.fromJvmMemberSignature(jvmConstructorSignature);
        }
        if (ahpgVar instanceof ahif) {
            ahfm ahfmVar2 = ahfn.Companion;
            ahmm jvmMethodSignature = ahmt.INSTANCE.getJvmMethodSignature((ahif) ahpgVar, ahldVar, ahlhVar);
            if (jvmMethodSignature == null) {
                return null;
            }
            return ahfmVar2.fromJvmMemberSignature(jvmMethodSignature);
        }
        if (!(ahpgVar instanceof ahis)) {
            return null;
        }
        ahop<ahis, ahly> ahopVar = ahmh.propertySignature;
        ahopVar.getClass();
        ahly ahlyVar = (ahly) ahlf.getExtensionOrNull((ahon) ahpgVar, ahopVar);
        if (ahlyVar == null) {
            return null;
        }
        int iOrdinal = ahyhVar.ordinal();
        if (iOrdinal == 1) {
            return ahdw.getPropertySignature((ahis) ahpgVar, ahldVar, ahlhVar, true, true, z);
        }
        if (iOrdinal == 2) {
            if (!ahlyVar.hasGetter()) {
                return null;
            }
            ahfm ahfmVar3 = ahfn.Companion;
            ahlv getter = ahlyVar.getGetter();
            getter.getClass();
            return ahfmVar3.fromMethod(ahldVar, getter);
        }
        if (iOrdinal != 3 || !ahlyVar.hasSetter()) {
            return null;
        }
        ahfm ahfmVar4 = ahfn.Companion;
        ahlv setter = ahlyVar.getSetter();
        setter.getClass();
        return ahfmVar4.fromMethod(ahldVar, setter);
    }

    protected final ahfc getKotlinClassFinder() {
        return this.kotlinClassFinder;
    }

    public abstract ahlc getMetadataVersion();

    protected final boolean isImplicitRepeatableContainer(ahnd ahndVar) {
        ahfj ahfjVarFindKotlinClass;
        ahndVar.getClass();
        return ahndVar.getOuterClassId() != null && affa.f(ahndVar.getShortClassName().asString(), "Container") && (ahfjVarFindKotlinClass = ahfd.findKotlinClass(this.kotlinClassFinder, ahndVar, getMetadataVersion())) != null && afxo.INSTANCE.isAnnotatedWithContainerMetaAnnotation(ahfjVarFindKotlinClass);
    }

    protected abstract ahfe loadAnnotation(ahnd ahndVar, agdx agdxVar, List<A> list);

    @Override // defpackage.ahyl
    public abstract A loadAnnotation(ahgx ahgxVar, ahld ahldVar);

    protected final ahfe loadAnnotationIfNotSpecial(ahnd ahndVar, agdx agdxVar, List<A> list) {
        ahndVar.getClass();
        agdxVar.getClass();
        list.getClass();
        if (afxo.INSTANCE.getSPECIAL_ANNOTATIONS().contains(ahndVar)) {
            return null;
        }
        return loadAnnotation(ahndVar, agdxVar, list);
    }

    @Override // defpackage.ahyl
    public List<A> loadCallableAnnotations(aiad aiadVar, ahpg ahpgVar, ahyh ahyhVar) {
        aiadVar.getClass();
        ahpgVar.getClass();
        ahyhVar.getClass();
        if (!noAnnotationsInBytecode(getCallableAnnotationFlags(ahpgVar, ahyhVar))) {
            if (ahyhVar == ahyh.PROPERTY) {
                return loadPropertyAnnotations(aiadVar, (ahis) ahpgVar, ahdt.PROPERTY);
            }
            ahfn callableSignature$default = getCallableSignature$default(this, ahpgVar, aiadVar.getNameResolver(), aiadVar.getTypeTable(), ahyhVar, false, 16, null);
            if (callableSignature$default != null) {
                return findClassAndLoadMemberAnnotations$default(this, aiadVar, callableSignature$default, false, false, null, false, 60, null);
            }
        }
        return afbe.a;
    }

    @Override // defpackage.ahyl
    public List<A> loadClassAnnotations(aiab aiabVar) {
        aiabVar.getClass();
        if (noAnnotationsInBytecode(aiabVar.getClassProto().getFlags())) {
            return afbe.a;
        }
        ahfj binaryClass = toBinaryClass(aiabVar);
        if (binaryClass != null) {
            ArrayList arrayList = new ArrayList(1);
            binaryClass.loadClassAnnotations(new ahdu(this, arrayList), getCachedFileContent(binaryClass));
            return arrayList;
        }
        ahnf ahnfVarDebugFqName = aiabVar.debugFqName();
        Objects.toString(ahnfVarDebugFqName);
        throw new IllegalStateException("Class for loading annotations is not found: ".concat(String.valueOf(ahnfVarDebugFqName)));
    }

    @Override // defpackage.ahyl
    public List<A> loadContextParameterAnnotations(aiad aiadVar, ahpg ahpgVar, ahyh ahyhVar, int i, ahkb ahkbVar) {
        aiadVar.getClass();
        ahpgVar.getClass();
        ahyhVar.getClass();
        return loadAnnotationsIfPresentInBytecode(ahkbVar != null ? ahkbVar.getFlags() : 0, new ahdq(this, aiadVar, ahpgVar, ahyhVar, i));
    }

    @Override // defpackage.ahyl
    public List<A> loadEnumEntryAnnotations(aiad aiadVar, ahhx ahhxVar) {
        aiadVar.getClass();
        ahhxVar.getClass();
        return findClassAndLoadMemberAnnotations$default(this, aiadVar, ahfn.Companion.fromFieldNameAndDesc(aiadVar.getNameResolver().getString(ahhxVar.getName()), ahmj.mapClass(((aiab) aiadVar).getClassId().asString())), false, false, null, false, 60, null);
    }

    @Override // defpackage.ahyl
    public List<A> loadExtensionReceiverParameterAnnotations(aiad aiadVar, ahpg ahpgVar, ahyh ahyhVar) {
        aiadVar.getClass();
        ahpgVar.getClass();
        ahyhVar.getClass();
        return loadParameterAnnotations(aiadVar, ahpgVar, ahyhVar, getContextParameterCount(ahpgVar));
    }

    @Override // defpackage.ahyl
    public List<A> loadPropertyBackingFieldAnnotations(aiad aiadVar, ahis ahisVar) {
        aiadVar.getClass();
        ahisVar.getClass();
        return loadAnnotationsIfPresentInBytecode(ahisVar.getFlags(), new ahdn(this, aiadVar, ahisVar));
    }

    @Override // defpackage.ahyl
    public List<A> loadPropertyDelegateFieldAnnotations(aiad aiadVar, ahis ahisVar) {
        aiadVar.getClass();
        ahisVar.getClass();
        return loadAnnotationsIfPresentInBytecode(ahisVar.getFlags(), new ahdo(this, aiadVar, ahisVar));
    }

    @Override // defpackage.ahyl
    public List<A> loadTypeAnnotations(ahjn ahjnVar, ahld ahldVar) {
        ahjnVar.getClass();
        ahldVar.getClass();
        List<ahgx> annotationList = ahjnVar.getAnnotationList();
        annotationList.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(annotationList, 10));
        for (ahgx ahgxVar : annotationList) {
            ahgxVar.getClass();
            arrayList.add(loadAnnotation(ahgxVar, ahldVar));
        }
        return arrayList;
    }

    @Override // defpackage.ahyl
    public List<A> loadTypeParameterAnnotations(ahjv ahjvVar, ahld ahldVar) {
        ahjvVar.getClass();
        ahldVar.getClass();
        List<ahgx> annotationList = ahjvVar.getAnnotationList();
        annotationList.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(annotationList, 10));
        for (ahgx ahgxVar : annotationList) {
            ahgxVar.getClass();
            arrayList.add(loadAnnotation(ahgxVar, ahldVar));
        }
        return arrayList;
    }

    @Override // defpackage.ahyl
    public List<A> loadValueParameterAnnotations(aiad aiadVar, ahpg ahpgVar, ahyh ahyhVar, int i, ahkb ahkbVar) {
        aiadVar.getClass();
        ahpgVar.getClass();
        ahyhVar.getClass();
        ahkbVar.getClass();
        return loadAnnotationsIfPresentInBytecode(ahkbVar.getFlags(), new ahdp(this, aiadVar, ahpgVar, ahyhVar, i));
    }
}
