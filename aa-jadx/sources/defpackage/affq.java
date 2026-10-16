package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class affq implements java.io.Serializable, defpackage.afid, defpackage.afgd {
    public static final java.lang.Object NO_RECEIVER = defpackage.affp.a;
    private final boolean isTopLevel;
    private final java.lang.String name;
    private final java.lang.Class owner;
    protected final java.lang.Object receiver;
    private transient defpackage.afid reflected;
    private final java.lang.String signature;

    protected affq(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.afid
    public java.lang.Object call(java.lang.Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.afid
    public java.lang.Object callBy(java.util.Map map) {
        return getReflected().callBy(map);
    }

    public defpackage.afid compute() {
        defpackage.afid afidVar = this.reflected;
        if (afidVar != null) {
            return afidVar;
        }
        defpackage.afid afidVarComputeReflected = computeReflected();
        this.reflected = afidVarComputeReflected;
        return afidVarComputeReflected;
    }

    protected abstract defpackage.afid computeReflected();

    @Override // defpackage.afgd
    public java.lang.reflect.GenericDeclaration findJavaDeclaration() {
        return defpackage.afjk.h(getOwner(), getSignature());
    }

    @Override // defpackage.afic
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public java.lang.Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // defpackage.afid
    public java.lang.String getName() {
        return this.name;
    }

    public defpackage.afig getOwner() {
        java.lang.Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? defpackage.afgw.c(cls) : defpackage.afgw.b(cls);
    }

    @Override // defpackage.afid
    public java.util.List<defpackage.afir> getParameters() {
        return getReflected().getParameters();
    }

    protected defpackage.afid getReflected() {
        defpackage.afid afidVarCompute = compute();
        if (afidVarCompute != this) {
            return afidVarCompute;
        }
        throw new defpackage.afep();
    }

    @Override // defpackage.afid
    public defpackage.afjb getReturnType() {
        return getReflected().getReturnType();
    }

    public java.lang.String getSignature() {
        return this.signature;
    }

    @Override // defpackage.afid
    public java.util.List<defpackage.afjc> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.afid
    public defpackage.afjf getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.afid
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.afid
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.afid
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // defpackage.afid
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public affq() {
        this(NO_RECEIVER);
    }

    protected affq(java.lang.Object obj) {
        this(obj, null, null, null, false);
    }
}
