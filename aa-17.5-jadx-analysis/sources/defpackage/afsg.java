package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class afsg extends afry implements afew, afnc, afui {
    private final aezr allParameters$delegate;
    private final aezr caller$delegate;
    private final aezr callerWithDefaults$delegate;
    private final afrj container;
    private final aezr parameters$delegate;
    private final Object rawBoundReceiver;
    private final String signature;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afsg(afrj afrjVar, String str, Object obj, afpq afpqVar) {
        super(afpqVar);
        afrjVar.getClass();
        str.getClass();
        afpqVar.getClass();
        this.container = afrjVar;
        this.signature = str;
        this.rawBoundReceiver = obj;
        this.allParameters$delegate = woy.dH(2, new afsc(this));
        this.parameters$delegate = woy.dH(2, new afsd(this));
        this.caller$delegate = woy.dH(2, new afse(this));
        this.callerWithDefaults$delegate = woy.dH(2, new afsf(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List allParameters_delegate$lambda$0(afsg afsgVar) {
        return afrz.computeParameters(afsgVar, afsgVar.getContextParameters(), afsgVar.getExtensionReceiverType(), afsgVar.getValueParameters(), afsgVar.getTypeParameterTable(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afwf callerWithDefaults_delegate$lambda$0(afsg afsgVar) {
        GenericDeclaration genericDeclarationFindDefaultMethod;
        if (!afuh.isConstructor(afsgVar) && !(afsgVar.getContainer() instanceof afrt)) {
            throw new IllegalArgumentException("Only constructors and top-level functions are supported for now: " + afsgVar.getContainer() + '/' + afsgVar.getName() + ' ' + afsgVar.getSignature());
        }
        agqp jvmSignature = afsgVar.getJvmSignature();
        ArrayList arrayList = new ArrayList();
        if (!afuh.isConstructor(afsgVar) || afsgVar.isInlineClass(afsgVar.getContainer())) {
            afmn afmnVarPatchJvmDescriptorByExtraBoxing = afuj.patchJvmDescriptorByExtraBoxing(afsgVar, jvmSignature.getDescriptor());
            arrayList.addAll(afmnVarPatchJvmDescriptorByExtraBoxing.getBoxedIndices());
            afrj container = afsgVar.getContainer();
            String name = jvmSignature.getName();
            String newDescriptor = afmnVarPatchJvmDescriptorByExtraBoxing.getNewDescriptor();
            Member memberMo61getMember = afsgVar.getCaller().mo61getMember();
            memberMo61getMember.getClass();
            boolean z = !Modifier.isStatic(memberMo61getMember.getModifiers());
            List<afhr> allParameters = afsgVar.getAllParameters();
            boolean z2 = false;
            if (!(allParameters instanceof Collection) || !allParameters.isEmpty()) {
                Iterator<T> it = allParameters.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((afhr) it.next()).getKind() == afhq.c) {
                        z2 = true;
                        break;
                    }
                }
            }
            genericDeclarationFindDefaultMethod = container.findDefaultMethod(name, newDescriptor, z, z2);
        } else {
            if (afuh.isAnnotationConstructor(afsgVar)) {
                Class<?> jClass = afsgVar.getContainer().getJClass();
                List<afhr> parameters = afsgVar.getParameters();
                ArrayList arrayList2 = new ArrayList(woy.bp(parameters, 10));
                Iterator<T> it2 = parameters.iterator();
                while (it2.hasNext()) {
                    String name2 = ((afhr) it2.next()).getName();
                    name2.getClass();
                    arrayList2.add(name2);
                }
                return new afvy(jClass, arrayList2, afvw.CALL_BY_NAME, afvx.KOTLIN, null, 16, null);
            }
            afmn afmnVarPatchJvmDescriptorByExtraBoxing2 = afuj.patchJvmDescriptorByExtraBoxing(afsgVar, afsgVar.getJvmSignature().getDescriptor());
            arrayList.addAll(afmnVarPatchJvmDescriptorByExtraBoxing2.getBoxedIndices());
            genericDeclarationFindDefaultMethod = afsgVar.getContainer().findDefaultConstructor(afmnVarPatchJvmDescriptorByExtraBoxing2.getNewDescriptor());
        }
        afwf<?> afwfVarCreateConstructorCaller = genericDeclarationFindDefaultMethod instanceof Constructor ? afsgVar.createConstructorCaller((Constructor) genericDeclarationFindDefaultMethod, true) : genericDeclarationFindDefaultMethod instanceof Method ? afsgVar.createStaticMethodCaller((Method) genericDeclarationFindDefaultMethod, afsgVar.getCaller().isBoundInstanceCallWithValueClasses()) : null;
        if (afwfVarCreateConstructorCaller != null) {
            return afxm.createValueClassAwareCallerIfNeeded(afwfVarCreateConstructorCaller, afsgVar, true, arrayList);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afwf caller_delegate$lambda$0(afsg afsgVar) throws NoSuchMethodException, SecurityException {
        GenericDeclaration genericDeclarationFindMethodBySignature;
        afwf<?> afwfVarCreateStaticMethodCaller;
        if (!afuh.isConstructor(afsgVar) && !(afsgVar.getContainer() instanceof afrt)) {
            throw new IllegalArgumentException("Only constructors and top-level functions are supported for now: " + afsgVar.getContainer() + '/' + afsgVar.getName() + ' ' + afsgVar.getSignature());
        }
        agqp jvmSignature = afsgVar.getJvmSignature();
        if (!afuh.isConstructor(afsgVar) || afsgVar.isInlineClass(afsgVar.getContainer())) {
            genericDeclarationFindMethodBySignature = afsgVar.getContainer().findMethodBySignature(jvmSignature.getName(), jvmSignature.getDescriptor());
        } else {
            if (afuh.isAnnotationConstructor(afsgVar)) {
                Class<?> jClass = afsgVar.getContainer().getJClass();
                List<afhr> parameters = afsgVar.getParameters();
                ArrayList arrayList = new ArrayList(woy.bp(parameters, 10));
                Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    String name = ((afhr) it.next()).getName();
                    name.getClass();
                    arrayList.add(name);
                }
                return new afvy(jClass, arrayList, afvw.POSITIONAL_CALL, afvx.KOTLIN, null, 16, null);
            }
            genericDeclarationFindMethodBySignature = afsgVar.getContainer().findConstructorBySignature(jvmSignature.getDescriptor());
        }
        if (genericDeclarationFindMethodBySignature instanceof Constructor) {
            afwfVarCreateStaticMethodCaller = afsgVar.createConstructorCaller((Constructor) genericDeclarationFindMethodBySignature, false);
        } else {
            if (!(genericDeclarationFindMethodBySignature instanceof Method)) {
                Objects.toString(afsgVar);
                throw new aftw("Could not compute caller for function: ".concat(String.valueOf(afsgVar)));
            }
            afwfVarCreateStaticMethodCaller = afsgVar.createStaticMethodCaller((Method) genericDeclarationFindMethodBySignature, false);
        }
        return afxm.createValueClassAwareCallerIfNeeded(afwfVarCreateStaticMethodCaller, afsgVar, false, afbe.a);
    }

    private final afxe<Constructor<?>> createConstructorCaller(Constructor<?> constructor, boolean z) {
        return (!z && (this instanceof afsb) && shouldHideConstructorDueToValueClassTypeValueParameters((afsb) this)) ? afuh.isBound(this) ? new afwg(constructor, afuh.getBoundReceiver(this)) : new afwh(constructor) : afuh.isBound(this) ? new afwi(constructor, afuh.getBoundReceiver(this)) : new afwk(constructor);
    }

    private final afwf<?> createStaticMethodCaller(Method method, boolean z) {
        if (!afuh.isBound(this)) {
            return new afxc(method);
        }
        useBoxedBoundReceiver(method);
        return new afwz(method, z, afuh.getBoundReceiver(this));
    }

    private final boolean isInlineClass(afrj afrjVar) {
        return (afrjVar instanceof afqw) && ((afqw) afrjVar).isValue();
    }

    private final boolean isValueClassThatRequiresMangling(afhe<?> afheVar) {
        return afheVar.isValue() && !affa.f(afheVar, affw.b(aezw.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List parameters_delegate$lambda$0(afsg afsgVar) {
        return afuh.isBound(afsgVar) ? afrz.computeParameters(afsgVar, afsgVar.getContextParameters(), afsgVar.getExtensionReceiverType(), afsgVar.getValueParameters(), afsgVar.getTypeParameterTable(), false) : afsgVar.getAllParameters();
    }

    private final boolean shouldHideConstructorDueToValueClassTypeValueParameters(afsb afsbVar) {
        if (afsbVar.getVisibility() != afif.d) {
            List<afhr> parameters = afsbVar.getParameters();
            if ((parameters instanceof Collection) && parameters.isEmpty()) {
                return false;
            }
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                if (isValueClassThatRequiresMangling(afir.f(((afhr) it.next()).getType()))) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean useBoxedBoundReceiver(Method method) {
        if (getContainer() instanceof afrt) {
            return false;
        }
        throw new IllegalArgumentException("Only top-level functions are supported for now: " + getContainer() + '/' + getName() + ' ' + getSignature());
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

    @Override // defpackage.afue
    public List<afhr> getAllParameters() {
        return (List) this.allParameters$delegate.a();
    }

    @Override // defpackage.afhc
    public List<Annotation> getAnnotations() {
        Member memberMo61getMember = getCaller().mo61getMember();
        AnnotatedElement annotatedElement = memberMo61getMember instanceof AnnotatedElement ? (AnnotatedElement) memberMo61getMember : null;
        if (annotatedElement == null) {
            return afbe.a;
        }
        Annotation[] annotations = annotatedElement.getAnnotations();
        annotations.getClass();
        return afvu.unwrapKotlinRepeatableAnnotations(woy.df(annotations));
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

    protected abstract List<agoq> getContextParameters();

    protected abstract agol getExtensionReceiverType();

    protected abstract agqp getJvmSignature();

    @Override // defpackage.afui
    public Collection<afui> getOverridden() {
        if (getContainer() instanceof afrt) {
            return afbe.a;
        }
        throw new IllegalArgumentException("Only top-level functions are supported for now: " + getContainer() + '/' + getName() + ' ' + getSignature());
    }

    @Override // defpackage.afhd
    public List<afhr> getParameters() {
        return (List) this.parameters$delegate.a();
    }

    @Override // defpackage.afue
    public Object getRawBoundReceiver() {
        return this.rawBoundReceiver;
    }

    @Override // defpackage.afui
    public String getSignature() {
        return this.signature;
    }

    protected abstract afvq getTypeParameterTable();

    @Override // defpackage.afhd
    public List<afic> getTypeParameters() {
        return getTypeParameterTable().getOwnTypeParameters();
    }

    protected abstract List<agoq> getValueParameters();

    public int hashCode() {
        return (((getContainer().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // defpackage.afdr
    public /* bridge */ Object invoke() {
        return default$invoke();
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
