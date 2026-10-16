package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.reflect.KCallable;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KParameter;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.jvm.internal.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3332c implements KCallable, Serializable, InterfaceC3342m {
    public static final Object NO_RECEIVER = C3331b.f39753a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient KCallable reflected;
    private final String signature;

    public AbstractC3332c(Object obj, Class cls, String str, String str2, boolean z2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z2;
    }

    @Override // kotlin.reflect.KCallable
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // kotlin.reflect.KCallable
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public KCallable compute() {
        KCallable kCallable = this.reflected;
        if (kCallable != null) {
            return kCallable;
        }
        KCallable kCallableComputeReflected = computeReflected();
        this.reflected = kCallableComputeReflected;
        return kCallableComputeReflected;
    }

    public abstract KCallable computeReflected();

    @Override // kotlin.jvm.internal.InterfaceC3342m
    @Nullable
    public GenericDeclaration findJavaDeclaration() throws SecurityException {
        KDeclarationContainer owner = getOwner();
        String signature = getSignature();
        AbstractC3340k.e(signature, "signature");
        if (!(owner instanceof InterfaceC3333d)) {
            return null;
        }
        String strP0 = Bf.k.P0(signature, '(');
        if (strP0.equals("<init>")) {
            throw new UnsupportedOperationException("Generic Java constructors are not supported: " + owner + '/' + signature);
        }
        Method[] declaredMethods = ((InterfaceC3333d) owner).getJClass().getDeclaredMethods();
        AbstractC3340k.d(declaredMethods, "getDeclaredMethods(...)");
        for (Method method : declaredMethods) {
            if (AbstractC3340k.a(method.getName(), strP0)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(method.getName());
                sb2.append("(");
                Class<?>[] parameterTypes = method.getParameterTypes();
                AbstractC3340k.d(parameterTypes, "getParameterTypes(...)");
                for (Class<?> cls : parameterTypes) {
                    AbstractC3340k.b(cls);
                    AbstractC3339j.a(sb2, cls);
                }
                sb2.append(")");
                Class<?> returnType = method.getReturnType();
                AbstractC3340k.d(returnType, "getReturnType(...)");
                AbstractC3339j.a(sb2, returnType);
                if (AbstractC3340k.a(sb2.toString(), signature)) {
                    return method;
                }
            }
        }
        return null;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // kotlin.reflect.KCallable
    public String getName() {
        return this.name;
    }

    public KDeclarationContainer getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? H.f39741a.getOrCreateKotlinPackage(cls, "") : H.f39741a.getOrCreateKotlinClass(cls);
    }

    @Override // kotlin.reflect.KCallable
    public List<KParameter> getParameters() {
        return getReflected().getParameters();
    }

    public abstract KCallable getReflected();

    @Override // kotlin.reflect.KCallable
    public KType getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // kotlin.reflect.KCallable
    public List<KTypeParameter> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // kotlin.reflect.KCallable
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
