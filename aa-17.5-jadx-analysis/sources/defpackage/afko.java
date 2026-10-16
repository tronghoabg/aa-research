package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class afko<R> extends afug<R> {
    private final afup<List<afhr>> _allParameters;
    private final afup<List<Annotation>> _annotations;
    private final afup<List<afhr>> _parameters;
    private final afup<afib> _returnType;
    private final afup<List<afrv>> _typeParameters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afko(afpq afpqVar) {
        super(afpqVar);
        afpqVar.getClass();
        this._annotations = afus.lazySoft(new afke(this));
        this._allParameters = afus.lazySoft(new afkf(this));
        this._parameters = afus.lazySoft(new afkg(this));
        this._returnType = afus.lazySoft(new afkh(this, afpqVar));
        this._typeParameters = afus.lazySoft(new afki(this, afpqVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List _allParameters$lambda$0(afko afkoVar) {
        return afkoVar.computeParameters(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List _annotations$lambda$0(afko afkoVar) {
        return afvu.computeAnnotations(afkoVar.getDescriptor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List _parameters$lambda$0(afko afkoVar) {
        return afuh.isBound(afkoVar) ? afkoVar.computeParameters(false) : afkoVar.getAllParameters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afib _returnType$lambda$0(afko afkoVar, afpq afpqVar) {
        afib afibVar = aiqu.substitute$default(afpqVar.getTypeSubstitutor(afkoVar.getTypeParameters(), afkoVar.getName()), afkoVar.computeReturnType(), null, 2, null).c;
        if (afibVar != null) {
            return afibVar;
        }
        afmz.starProjectionInTopLevelTypeIsNotPossible(afkoVar.getName());
        throw new aezp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List _typeParameters$lambda$0(afko afkoVar, afpq afpqVar) {
        List<agee> typeParameters = afkoVar.getDescriptor().getTypeParameters();
        typeParameters.getClass();
        ArrayList<afrv> arrayList = new ArrayList(woy.bp(typeParameters, 10));
        for (agee ageeVar : typeParameters) {
            afue afueVarUnbindAllReceivers = afuh.unbindAllReceivers(afkoVar);
            ageeVar.getClass();
            arrayList.add(new afrv(afueVarUnbindAllReceivers, ageeVar));
        }
        aiqu typeSubstitutor = afpqVar.getTypeSubstitutor(arrayList, afkoVar.getName());
        for (afrv afrvVar : arrayList) {
            List<afib> upperBounds = afrvVar.getUpperBounds();
            ArrayList arrayList2 = new ArrayList(woy.bp(upperBounds, 10));
            Iterator<T> it = upperBounds.iterator();
            while (it.hasNext()) {
                afib afibVar = aiqu.substitute$default(typeSubstitutor, (afib) it.next(), null, 2, null).c;
                if (afibVar == null) {
                    afmz.starProjectionInTopLevelTypeIsNotPossible(afkoVar.getName());
                    throw new aezp();
                }
                arrayList2.add(afibVar);
            }
            afrvVar.setUpperBounds(arrayList2);
        }
        return arrayList;
    }

    private final List<agel> computeContextParameters(agax agaxVar) {
        aezu aezuVar;
        agax agaxVar2 = agaxVar;
        if (agaxVar2 instanceof aicv) {
            aicv aicvVar = (aicv) agaxVar2;
            aezuVar = new aezu(aicvVar.getNameResolver(), aicvVar.getProto().getContextParameterList());
        } else if (agaxVar2 instanceof aicu) {
            aicu aicuVar = (aicu) agaxVar2;
            aezuVar = new aezu(aicuVar.getNameResolver(), aicuVar.getProto().getContextParameterList());
        } else {
            aezuVar = null;
            if (agaxVar2 instanceof agdm) {
                agdn correspondingProperty = ((agdm) agaxVar2).getCorrespondingProperty();
                aicu aicuVar2 = correspondingProperty instanceof aicu ? (aicu) correspondingProperty : null;
                if (aicuVar2 != null) {
                    aezuVar = new aezu(aicuVar2.getNameResolver(), aicuVar2.getProto().getContextParameterList());
                }
            }
        }
        if (aezuVar == null) {
            return afbe.a;
        }
        ahld ahldVar = (ahld) aezuVar.a;
        List list = (List) aezuVar.b;
        List<agdq> contextReceiverParameters = agaxVar2.getContextReceiverParameters();
        contextReceiverParameters.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(contextReceiverParameters, 10));
        int i = 0;
        for (Object obj : contextReceiverParameters) {
            int i2 = i + 1;
            if (i < 0) {
                woy.bo();
            }
            agdq agdqVar = (agdq) obj;
            agfk annotations = agdqVar.getAnnotations();
            ahnj ahnjVarGuessByFirstCharacter = ahnj.guessByFirstCharacter(ahldVar.getString(((ahkb) list.get(i)).getName()));
            aigl type = agdqVar.getType();
            type.getClass();
            agdx source = agdqVar.getSource();
            source.getClass();
            arrayList.add(new agiy(agaxVar2, null, i, annotations, ahnjVarGuessByFirstCharacter, type, false, false, false, null, source));
            agaxVar2 = agaxVar;
            i = i2;
        }
        return arrayList;
    }

    private final List<afhr> computeParameters(boolean z) {
        agax descriptor = getDescriptor();
        ArrayList arrayList = new ArrayList();
        if (z) {
            agdq instanceReceiverParameter = afvu.getInstanceReceiverParameter(this);
            if (instanceReceiverParameter != null) {
                arrayList.add(new aflj(this, arrayList.size(), afhq.a, new afkj(instanceReceiverParameter)));
            }
            List<agel> listComputeContextParameters = computeContextParameters(descriptor);
            int size = listComputeContextParameters.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new aflj(this, arrayList.size(), afhq.b, new afkk(listComputeContextParameters, i)));
            }
            agdq extensionReceiverParameter = descriptor.getExtensionReceiverParameter();
            if (extensionReceiverParameter != null) {
                arrayList.add(new aflj(this, arrayList.size(), afhq.c, new afkl(extensionReceiverParameter)));
            }
        }
        int size2 = descriptor.getValueParameters().size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(new aflj(this, arrayList.size(), afhq.d, new afkm(descriptor, i2)));
        }
        if (afuh.isAnnotationConstructor(this) && (descriptor instanceof agux) && arrayList.size() > 1) {
            woy.bs(arrayList, new afkn());
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agdk computeParameters$lambda$1(List list, int i) {
        return (agdk) list.get(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agdk computeParameters$lambda$3(agax agaxVar, int i) {
        agel agelVar = agaxVar.getValueParameters().get(i);
        agelVar.getClass();
        return agelVar;
    }

    protected abstract aiqp computeReturnType();

    @Override // defpackage.afue
    public List<afhr> getAllParameters() {
        List<afhr> listInvoke = this._allParameters.invoke();
        listInvoke.getClass();
        return listInvoke;
    }

    @Override // defpackage.afhc
    public List<Annotation> getAnnotations() {
        List<Annotation> listInvoke = this._annotations.invoke();
        listInvoke.getClass();
        return listInvoke;
    }

    public abstract agax getDescriptor();

    @Override // defpackage.afue
    public final agox getModality() {
        agox modality = getOverriddenStorage().getModality();
        if (modality != null) {
            return modality;
        }
        agcq modality2 = getDescriptor().getModality();
        modality2.getClass();
        return afkp.toMetadataModality(modality2);
    }

    @Override // defpackage.afhd
    public final List<afhr> getParameters() {
        List<afhr> listInvoke = this._parameters.invoke();
        listInvoke.getClass();
        return listInvoke;
    }

    @Override // defpackage.afhd
    public final afib getReturnType() {
        afib afibVarInvoke = this._returnType.invoke();
        afibVarInvoke.getClass();
        return afibVarInvoke;
    }

    @Override // defpackage.afhd
    public List<afic> getTypeParameters() {
        List<afrv> listInvoke = this._typeParameters.invoke();
        listInvoke.getClass();
        return listInvoke;
    }

    @Override // defpackage.afhd
    public afif getVisibility() {
        agcc visibility = getDescriptor().getVisibility();
        visibility.getClass();
        return afvu.toKVisibility(visibility);
    }

    @Override // defpackage.afue
    public final boolean isPackagePrivate() {
        return affa.f(getDescriptor().getVisibility(), agsv.PACKAGE_VISIBILITY);
    }

    static /* synthetic */ agdk accessor$DescriptorKCallable$lambda5(agdq agdqVar) {
        return agdqVar;
    }

    static /* synthetic */ agdk accessor$DescriptorKCallable$lambda7(agdq agdqVar) {
        return agdqVar;
    }

    private static final agdk computeParameters$lambda$0(agdq agdqVar) {
        return agdqVar;
    }

    private static final agdk computeParameters$lambda$2(agdq agdqVar) {
        return agdqVar;
    }
}
