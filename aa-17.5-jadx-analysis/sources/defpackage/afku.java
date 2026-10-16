package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class afku extends afko implements afew, afnc, afui {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(afku.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0)};
    private final aezr caller$delegate;
    private final aezr callerWithDefaults$delegate;
    private final afrj container;
    private final afup descriptor$delegate;
    private final Object rawBoundReceiver;
    private final String signature;

    private afku(afrj afrjVar, String str, String str2, agcj agcjVar, Object obj, afpq afpqVar) {
        super(afpqVar);
        this.container = afrjVar;
        this.signature = str2;
        this.rawBoundReceiver = obj;
        this.descriptor$delegate = afus.lazySoft(agcjVar, new afkq(this, str));
        this.caller$delegate = woy.dH(2, new afkr(this));
        this.callerWithDefaults$delegate = woy.dH(2, new afks(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.afwf callerWithDefaults_delegate$lambda$0(defpackage.afku r14) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afku.callerWithDefaults_delegate$lambda$0(afku):afwf");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afwf caller_delegate$lambda$0(afku afkuVar) throws NoSuchMethodException, SecurityException {
        Object constructor;
        afwf<?> afwfVarCreateInstanceMethodCaller;
        afpi afpiVarMapSignature = afvg.INSTANCE.mapSignature(afkuVar.getDescriptor());
        if (afpiVarMapSignature instanceof afpg) {
            if (afuh.isAnnotationConstructor(afkuVar)) {
                Class<?> jClass = afkuVar.getContainer().getJClass();
                List<afhr> parameters = afkuVar.getParameters();
                ArrayList arrayList = new ArrayList(woy.bp(parameters, 10));
                Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    String name = ((afhr) it.next()).getName();
                    name.getClass();
                    arrayList.add(name);
                }
                return new afvy(jClass, arrayList, afvw.POSITIONAL_CALL, afvx.KOTLIN, null, 16, null);
            }
            constructor = afkuVar.getContainer().findConstructorBySignature(((afpg) afpiVarMapSignature).getConstructorDesc());
        } else if (afpiVarMapSignature instanceof afph) {
            afph afphVar = (afph) afpiVarMapSignature;
            constructor = afkuVar.getContainer().findMethodBySignature(afphVar.getMethodName(), afphVar.getMethodDesc());
        } else if (afpiVarMapSignature instanceof afpf) {
            constructor = ((afpf) afpiVarMapSignature).getMethod();
            constructor.getClass();
        } else {
            if (!(afpiVarMapSignature instanceof afpe)) {
                if (!(afpiVarMapSignature instanceof afpd)) {
                    throw new aezs();
                }
                List<Method> methods = ((afpd) afpiVarMapSignature).getMethods();
                Class<?> jClass2 = afkuVar.getContainer().getJClass();
                ArrayList arrayList2 = new ArrayList(woy.bp(methods, 10));
                Iterator<T> it2 = methods.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Method) it2.next()).getName());
                }
                return new afvy(jClass2, arrayList2, afvw.POSITIONAL_CALL, afvx.JAVA, methods);
            }
            constructor = ((afpe) afpiVarMapSignature).getConstructor();
            constructor.getClass();
        }
        if (constructor instanceof Constructor) {
            afwfVarCreateInstanceMethodCaller = afkuVar.createConstructorCaller((Constructor) constructor, afkuVar.getDescriptor(), false);
        } else {
            if (!(constructor instanceof Method)) {
                throw new aftw("Could not compute caller for function: " + afkuVar.getDescriptor() + " (member = " + constructor + ')');
            }
            Method method = (Method) constructor;
            afwfVarCreateInstanceMethodCaller = !Modifier.isStatic(method.getModifiers()) ? afkuVar.createInstanceMethodCaller(method) : afkuVar.getDescriptor().getAnnotations().findAnnotation(afvu.getJVM_STATIC()) != null ? afkuVar.createJvmStaticInObjectCaller(method) : afkuVar.createStaticMethodCaller(method, false);
        }
        return afxm.createValueClassAwareCallerIfNeeded(afwfVarCreateInstanceMethodCaller, afkuVar, false, afbe.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type computeReturnType$lambda$0(afku afkuVar) {
        Type typeExtractContinuationArgument = afuj.extractContinuationArgument(afkuVar);
        return typeExtractContinuationArgument == null ? afkuVar.getCaller().getReturnType() : typeExtractContinuationArgument;
    }

    private final afxe<Constructor<?>> createConstructorCaller(Constructor<?> constructor, agcj agcjVar, boolean z) {
        return (z || !ahwb.shouldHideConstructorDueToValueClassTypeValueParameters(agcjVar)) ? afuh.isBound(this) ? new afwi(constructor, afuh.getBoundReceiver(this)) : new afwk(constructor) : afuh.isBound(this) ? new afwg(constructor, afuh.getBoundReceiver(this)) : new afwh(constructor);
    }

    private final afxd createInstanceMethodCaller(Method method) {
        return afuh.isBound(this) ? new afwx(method, afuh.getBoundReceiver(this)) : new afxa(method);
    }

    private final afxd createJvmStaticInObjectCaller(Method method) {
        return afuh.isBound(this) ? new afwy(method) : new afxb(method);
    }

    private final afwf<?> createStaticMethodCaller(Method method, boolean z) {
        if (afuh.isBound(this)) {
            return new afwz(method, z, useBoxedBoundReceiver(method) ? getRawBoundReceiver() : afuh.getBoundReceiver(this));
        }
        return new afxc(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agcj descriptor_delegate$lambda$0(afku afkuVar, String str) {
        return afkuVar.getContainer().findFunctionDescriptor(str, afkuVar.getSignature());
    }

    private final afui getFunctionWithDefaultParametersForValueClassOverride(afui afuiVar) {
        List<afhr> listD = afir.d(afuiVar);
        Object obj = null;
        if (!listD.isEmpty()) {
            for (afhr afhrVar : listD) {
                aful afulVar = afhrVar instanceof aful ? (aful) afhrVar : null;
                if (afulVar != null && afulVar.getDeclaresDefaultValue()) {
                    return null;
                }
            }
        }
        afhg container = afuiVar.getContainer();
        afhe afheVar = container instanceof afhe ? (afhe) container : null;
        if (afheVar == null || !afheVar.isValue()) {
            return null;
        }
        Member memberMo61getMember = getCaller().mo61getMember();
        memberMo61getMember.getClass();
        if (!Modifier.isStatic(memberMo61getMember.getModifiers())) {
            return null;
        }
        Iterator<T> it = afuiVar.getOverridden().iterator();
        loop1: while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            List<afhr> listD2 = afir.d((afui) next);
            if (!listD2.isEmpty()) {
                for (afhr afhrVar2 : listD2) {
                    aful afulVar2 = afhrVar2 instanceof aful ? (aful) afhrVar2 : null;
                    if (afulVar2 != null && afulVar2.getDeclaresDefaultValue()) {
                        obj = next;
                        break loop1;
                    }
                }
            }
        }
        return (afui) obj;
    }

    private final boolean useBoxedBoundReceiver(Method method) {
        aigl type;
        agdq dispatchReceiverParameter = getDescriptor().getDispatchReceiverParameter();
        if (dispatchReceiverParameter == null || (type = dispatchReceiverParameter.getType()) == null || !ahsw.isInlineClassType(type)) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        Class cls = (Class) woy.cV(parameterTypes);
        return cls != null && cls.isInterface();
    }

    @Override // defpackage.afko
    protected aiqp computeReturnType() {
        aigl returnType = getDescriptor().getReturnType();
        returnType.getClass();
        return new aiqp(returnType, new afkt(this));
    }

    public GenericDeclaration default$findJavaDeclaration() {
        return afez.a(getContainer(), getSignature());
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21, Object obj22) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22);
    }

    public boolean equals(Object obj) {
        afui afuiVarAsReflectFunction = afvu.asReflectFunction(obj);
        return afuiVarAsReflectFunction != null && affa.f(getContainer(), afuiVarAsReflectFunction.getContainer()) && affa.f(getName(), afuiVarAsReflectFunction.getName()) && affa.f(getSignature(), afuiVarAsReflectFunction.getSignature()) && affa.f(getRawBoundReceiver(), afuiVarAsReflectFunction.getRawBoundReceiver());
    }

    @Override // defpackage.affd
    public /* bridge */ GenericDeclaration findJavaDeclaration() {
        return default$findJavaDeclaration();
    }

    @Override // defpackage.afew
    public int getArity() {
        return afxf.getArity(getCaller());
    }

    @Override // defpackage.afue
    public afwf<?> getCaller() {
        return (afwf) this.caller$delegate.a();
    }

    @Override // defpackage.afue
    public afwf<?> getCallerWithDefaults() {
        return (afwf) this.callerWithDefaults$delegate.a();
    }

    @Override // defpackage.afue
    public afrj getContainer() {
        return this.container;
    }

    @Override // defpackage.afko
    public agcj getDescriptor() {
        T value = this.descriptor$delegate.getValue(this, $$delegatedProperties[0]);
        value.getClass();
        return (agcj) value;
    }

    @Override // defpackage.afhd
    public String getName() {
        String strAsString = getDescriptor().getName().asString();
        strAsString.getClass();
        return strAsString;
    }

    @Override // defpackage.afui
    public Collection<afui> getOverridden() {
        Collection<? extends agcj> overriddenDescriptors = getDescriptor().getOverriddenDescriptors();
        overriddenDescriptors.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(overriddenDescriptors, 10));
        for (agcj agcjVar : overriddenDescriptors) {
            agbi containingDeclaration = agcjVar.getContainingDeclaration();
            containingDeclaration.getClass();
            Class<?> javaClass = afvu.toJavaClass((agba) containingDeclaration);
            if (javaClass == null) {
                toString();
                throw new aftw("Unknown container class for overridden function: ".concat(toString()));
            }
            afhe afheVarL = affa.l(javaClass);
            afheVarL.getClass();
            agcjVar.getClass();
            arrayList.add(new afku((afqw) afheVarL, agcjVar, null, 4, null));
        }
        return arrayList;
    }

    @Override // defpackage.afue
    public Object getRawBoundReceiver() {
        return this.rawBoundReceiver;
    }

    @Override // defpackage.afui
    public String getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return (((getContainer().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // defpackage.afdr
    public /* bridge */ Object invoke() {
        return default$invoke();
    }

    @Override // defpackage.afhh
    public boolean isExternal() {
        return getOverriddenStorage().getForceIsExternal() || getDescriptor().isExternal();
    }

    @Override // defpackage.afhh
    public boolean isInfix() {
        return getOverriddenStorage().getForceIsInfix() || getDescriptor().isInfix();
    }

    @Override // defpackage.afhh
    public boolean isInline() {
        return getOverriddenStorage().getForceIsInline() || getDescriptor().isInline();
    }

    @Override // defpackage.afhh
    public boolean isOperator() {
        return getOverriddenStorage().getForceIsOperator() || getDescriptor().isOperator();
    }

    @Override // defpackage.afui
    public boolean isPrimaryConstructor() {
        agcj descriptor = getDescriptor();
        agbh agbhVar = descriptor instanceof agbh ? (agbh) descriptor : null;
        return agbhVar != null && agbhVar.isPrimary();
    }

    @Override // defpackage.afhd
    public boolean isSuspend() {
        return getDescriptor().isSuspend();
    }

    @Override // defpackage.afue
    public afku shallowCopy(afrj afrjVar, afpq afpqVar) {
        afrjVar.getClass();
        afpqVar.getClass();
        return new afku(afrjVar, getDescriptor(), afpqVar);
    }

    public String toString() {
        return afvf.INSTANCE.renderFunction(this);
    }

    @Override // defpackage.afec
    public /* bridge */ Object invoke(Object obj) {
        return default$invoke(obj);
    }

    @Override // defpackage.afeg
    public /* bridge */ Object invoke(Object obj, Object obj2) {
        return default$invoke(obj, obj2);
    }

    @Override // defpackage.afeh
    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3) {
        return default$invoke(obj, obj2, obj3);
    }

    @Override // defpackage.afei
    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return default$invoke(obj, obj2, obj3, obj4);
    }

    @Override // defpackage.afej
    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return default$invoke(obj, obj2, obj3, obj4, obj5);
    }

    @Override // defpackage.afek
    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // defpackage.afem
    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    @Override // defpackage.afen
    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12);
    }

    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13);
    }

    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14);
    }

    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15);
    }

    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16);
    }

    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17);
    }

    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18);
    }

    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19);
    }

    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20);
    }

    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21);
    }

    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21, Object obj22) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public afku(afrj afrjVar, String str, String str2, Object obj) {
        this(afrjVar, str, str2, null, obj, afpq.EMPTY);
        afrjVar.getClass();
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public afku(afrj afrjVar, agcj agcjVar, afpq afpqVar) {
        afrjVar.getClass();
        agcjVar.getClass();
        afpqVar.getClass();
        String strAsString = agcjVar.getName().asString();
        strAsString.getClass();
        this(afrjVar, strAsString, afvg.INSTANCE.mapSignature(agcjVar).asString(), agcjVar, afeq.NO_RECEIVER, afpqVar);
    }

    public /* synthetic */ afku(afrj afrjVar, agcj agcjVar, afpq afpqVar, int i, afeu afeuVar) {
        this(afrjVar, agcjVar, (i & 4) != 0 ? afpq.EMPTY : afpqVar);
    }

    public Object default$invoke(Object obj) {
        return call(obj);
    }

    public Object default$invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21);
    }

    public Object default$invoke() {
        return call(new Object[0]);
    }
}
