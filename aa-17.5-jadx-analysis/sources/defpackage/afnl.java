package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class afnl extends afug implements afew, afnc, afui {
    private final aezr caller$delegate;
    private final aezr callerWithDefaults$delegate;
    private final afqw<?> klass;
    private final List<Method> methods;
    private final aezr parameters$delegate;
    private final aezr returnType$delegate;
    private final aezr signature$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afnl(afqw<?> afqwVar) throws SecurityException {
        super(afpq.EMPTY);
        afqwVar.getClass();
        this.klass = afqwVar;
        Method[] declaredMethods = affa.h(afqwVar).getDeclaredMethods();
        declaredMethods.getClass();
        this.methods = woy.db(declaredMethods, new afnk());
        this.signature$delegate = woy.dH(2, new afne(this));
        this.returnType$delegate = woy.dH(2, new afnf(this));
        this.parameters$delegate = woy.dH(2, new afng(this));
        this.caller$delegate = woy.dH(2, new afnh(this));
        this.callerWithDefaults$delegate = woy.dH(2, new afni(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afvy callerWithDefaults_delegate$lambda$0(afnl afnlVar) {
        Class clsH = affa.h(afnlVar.klass);
        List<Method> list = afnlVar.methods;
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getName());
        }
        return new afvy(clsH, arrayList, afvw.CALL_BY_NAME, afvx.JAVA, afnlVar.methods);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afvy caller_delegate$lambda$0(afnl afnlVar) {
        Class clsH = affa.h(afnlVar.klass);
        List<Method> list = afnlVar.methods;
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getName());
        }
        return new afvy(clsH, arrayList, afvw.POSITIONAL_CALL, afvx.JAVA, afnlVar.methods);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List parameters_delegate$lambda$0(afnl afnlVar) {
        Iterable<afbh> iterableBD = woy.bD(afnlVar.methods);
        ArrayList arrayList = new ArrayList(woy.bp(iterableBD, 10));
        for (afbh afbhVar : iterableBD) {
            int i = afbhVar.a;
            Method method = (Method) afbhVar.b;
            method.getClass();
            arrayList.add(new afnn(afnlVar, method, i));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afib returnType_delegate$lambda$0(afnl afnlVar) {
        return afir.b(afnlVar.klass);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String signature_delegate$lambda$0(afnl afnlVar) {
        return woy.cu(afnlVar.getParameters(), "", "<init>(", ")V", afnj.INSTANCE, 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence signature_delegate$lambda$0$0(afhr afhrVar) {
        afhrVar.getClass();
        return agkc.getDesc(affa.h(afir.f(afhrVar.getType())));
    }

    public GenericDeclaration default$findJavaDeclaration() {
        return afez.a(getContainer(), getSignature());
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21, Object obj22) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22);
    }

    public boolean equals(Object obj) {
        afui afuiVarAsReflectFunction = afvu.asReflectFunction(obj);
        return afuiVarAsReflectFunction != null && affa.f(getContainer(), afuiVarAsReflectFunction.getContainer()) && affa.f(getName(), afuiVarAsReflectFunction.getName()) && affa.f(getSignature(), afuiVarAsReflectFunction.getSignature()) && affa.f(null, afuiVarAsReflectFunction.getRawBoundReceiver());
    }

    @Override // defpackage.affd
    public /* bridge */ GenericDeclaration findJavaDeclaration() {
        return default$findJavaDeclaration();
    }

    @Override // defpackage.afue
    public List<afhr> getAllParameters() {
        return getParameters();
    }

    @Override // defpackage.afhc
    public List<Annotation> getAnnotations() {
        return afbe.a;
    }

    @Override // defpackage.afew
    public int getArity() {
        return this.methods.size();
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
        return this.klass;
    }

    @Override // defpackage.afue
    public agox getModality() {
        return agox.FINAL;
    }

    @Override // defpackage.afhd
    public String getName() {
        return "<init>";
    }

    @Override // defpackage.afui
    public Collection<afui> getOverridden() {
        return afbe.a;
    }

    @Override // defpackage.afhd
    public List<afhr> getParameters() {
        return (List) this.parameters$delegate.a();
    }

    @Override // defpackage.afue
    public Object getRawBoundReceiver() {
        return null;
    }

    @Override // defpackage.afhd
    public afib getReturnType() {
        return (afib) this.returnType$delegate.a();
    }

    @Override // defpackage.afui
    public String getSignature() {
        return (String) this.signature$delegate.a();
    }

    @Override // defpackage.afhd
    public List<afic> getTypeParameters() {
        return afbe.a;
    }

    @Override // defpackage.afhd
    public afif getVisibility() {
        return afjs.computeVisibilityForJavaModifiers(affa.h(this.klass).getModifiers());
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
        return false;
    }

    @Override // defpackage.afhh
    public boolean isInfix() {
        return false;
    }

    @Override // defpackage.afhh
    public boolean isInline() {
        return false;
    }

    @Override // defpackage.afhh
    public boolean isOperator() {
        return false;
    }

    @Override // defpackage.afue
    public boolean isPackagePrivate() {
        return afvu.isPackagePrivate(affa.h(this.klass).getModifiers());
    }

    @Override // defpackage.afui
    public boolean isPrimaryConstructor() {
        return true;
    }

    @Override // defpackage.afhd
    public boolean isSuspend() {
        return false;
    }

    @Override // defpackage.afue
    public afue<Object> shallowCopy(afrj afrjVar, afpq afpqVar) {
        afrjVar.getClass();
        afpqVar.getClass();
        if (affa.f(afpqVar, afpq.EMPTY)) {
            return new afnl(this.klass);
        }
        toString();
        throw new IllegalArgumentException("Constructors cannot have fake overrides: ".concat(toString()));
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
