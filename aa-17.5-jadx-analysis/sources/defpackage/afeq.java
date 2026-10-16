package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class afeq implements Serializable, afhd, affd {
    public static final Object NO_RECEIVER = afep.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient afhd reflected;
    private final String signature;

    protected afeq(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.afhd
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.afhd
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public afhd compute() {
        afhd afhdVar = this.reflected;
        if (afhdVar != null) {
            return afhdVar;
        }
        afhd afhdVarComputeReflected = computeReflected();
        this.reflected = afhdVarComputeReflected;
        return afhdVarComputeReflected;
    }

    protected abstract afhd computeReflected();

    @Override // defpackage.affd
    public GenericDeclaration findJavaDeclaration() {
        return afez.a(getOwner(), getSignature());
    }

    @Override // defpackage.afhc
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // defpackage.afhd
    public String getName() {
        return this.name;
    }

    public afhg getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? affw.c(cls) : affw.b(cls);
    }

    @Override // defpackage.afhd
    public List<afhr> getParameters() {
        return getReflected().getParameters();
    }

    protected afhd getReflected() {
        afhd afhdVarCompute = compute();
        if (afhdVarCompute != this) {
            return afhdVarCompute;
        }
        throw new afdp();
    }

    @Override // defpackage.afhd
    public afib getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.afhd
    public List<afic> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.afhd
    public afif getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.afhd
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.afhd
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.afhd
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // defpackage.afhd
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public afeq() {
        this(NO_RECEIVER);
    }

    protected afeq(Object obj) {
        this(obj, null, null, null, false);
    }
}
