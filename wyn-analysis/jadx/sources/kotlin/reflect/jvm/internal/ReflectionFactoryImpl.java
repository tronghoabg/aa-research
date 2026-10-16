package kotlin.reflect.jvm.internal;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AbstractC3332c;
import kotlin.jvm.internal.AbstractC3337h;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.jvm.internal.AbstractC3344o;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.InterfaceC3333d;
import kotlin.jvm.internal.InterfaceC3336g;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.z;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.full.KClassifiers;
import kotlin.reflect.jvm.ReflectLambdaKt;

/* loaded from: classes5.dex */
public class ReflectionFactoryImpl extends I {
    public static void clearCaches() {
        CachesKt.clearCaches();
        ModuleByClassLoaderKt.clearModuleByClassLoaderCache();
    }

    private static KDeclarationContainerImpl getOwner(AbstractC3332c abstractC3332c) {
        KDeclarationContainer owner = abstractC3332c.getOwner();
        return owner instanceof KDeclarationContainerImpl ? (KDeclarationContainerImpl) owner : EmptyContainerForLocal.INSTANCE;
    }

    public KClass createKotlinClass(Class cls) {
        return new KClassImpl(cls);
    }

    @Override // kotlin.jvm.internal.I
    public KFunction function(AbstractC3337h abstractC3337h) {
        return new KFunctionImpl(getOwner(abstractC3337h), abstractC3337h.getName(), abstractC3337h.getSignature(), abstractC3337h.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.I
    public KClass getOrCreateKotlinClass(Class cls) {
        return CachesKt.getOrCreateKotlinClass(cls);
    }

    @Override // kotlin.jvm.internal.I
    public KDeclarationContainer getOrCreateKotlinPackage(Class cls, String str) {
        return CachesKt.getOrCreateKotlinPackage(cls);
    }

    @Override // kotlin.jvm.internal.I
    public KType mutableCollectionType(KType kType) {
        return TypeOfImplKt.createMutableCollectionKType(kType);
    }

    @Override // kotlin.jvm.internal.I
    public KMutableProperty0 mutableProperty0(AbstractC3344o abstractC3344o) {
        return new KMutableProperty0Impl(getOwner(abstractC3344o), abstractC3344o.getName(), abstractC3344o.getSignature(), abstractC3344o.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.I
    public KMutableProperty1 mutableProperty1(q qVar) {
        return new KMutableProperty1Impl(getOwner(qVar), qVar.getName(), qVar.getSignature(), qVar.getBoundReceiver());
    }

    public KMutableProperty2 mutableProperty2(s sVar) {
        getOwner(sVar);
        throw null;
    }

    public KType nothingType(KType kType) {
        return TypeOfImplKt.createNothingType(kType);
    }

    public KType platformType(KType kType, KType kType2) {
        return TypeOfImplKt.createPlatformKType(kType, kType2);
    }

    @Override // kotlin.jvm.internal.I
    public KProperty0 property0(v vVar) {
        return new KProperty0Impl(getOwner(vVar), vVar.getName(), vVar.getSignature(), vVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.I
    public KProperty1 property1(x xVar) {
        return new KProperty1Impl(getOwner(xVar), xVar.getName(), xVar.getSignature(), xVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.I
    public KProperty2 property2(z zVar) {
        return new KProperty2Impl(getOwner(zVar), zVar.getName(), zVar.getSignature());
    }

    @Override // kotlin.jvm.internal.I
    public String renderLambdaToString(AbstractC3343n abstractC3343n) {
        return renderLambdaToString((InterfaceC3336g) abstractC3343n);
    }

    @Override // kotlin.jvm.internal.I
    public void setUpperBounds(KTypeParameter kTypeParameter, List<KType> list) {
    }

    @Override // kotlin.jvm.internal.I
    public KType typeOf(KClassifier kClassifier, List<KTypeProjection> list, boolean z2) {
        return kClassifier instanceof InterfaceC3333d ? CachesKt.getOrCreateKType(((InterfaceC3333d) kClassifier).getJClass(), list, z2) : KClassifiers.createType(kClassifier, list, z2, Collections.EMPTY_LIST);
    }

    @Override // kotlin.jvm.internal.I
    public KTypeParameter typeParameter(Object obj, String str, KVariance kVariance, boolean z2) {
        List<KTypeParameter> typeParameters;
        if (obj instanceof KClass) {
            typeParameters = ((KClass) obj).getTypeParameters();
        } else {
            if (!(obj instanceof KCallable)) {
                throw new IllegalArgumentException("Type parameter container must be a class or a callable: " + obj);
            }
            typeParameters = ((KCallable) obj).getTypeParameters();
        }
        for (KTypeParameter kTypeParameter : typeParameters) {
            if (kTypeParameter.getName().equals(str)) {
                return kTypeParameter;
            }
        }
        throw new IllegalArgumentException("Type parameter " + str + " is not found in container: " + obj);
    }

    public KClass createKotlinClass(Class cls, String str) {
        return new KClassImpl(cls);
    }

    public KClass getOrCreateKotlinClass(Class cls, String str) {
        return CachesKt.getOrCreateKotlinClass(cls);
    }

    @Override // kotlin.jvm.internal.I
    public String renderLambdaToString(InterfaceC3336g interfaceC3336g) {
        KFunctionImpl kFunctionImplAsKFunctionImpl;
        KFunction kFunctionReflect = ReflectLambdaKt.reflect(interfaceC3336g);
        return (kFunctionReflect == null || (kFunctionImplAsKFunctionImpl = UtilKt.asKFunctionImpl(kFunctionReflect)) == null) ? super.renderLambdaToString(interfaceC3336g) : ReflectionObjectRenderer.INSTANCE.renderLambda(kFunctionImplAsKFunctionImpl.getDescriptor());
    }
}
