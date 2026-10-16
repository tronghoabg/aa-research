package h.g.b;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class j implements Serializable, h.l.b {
    public static final Object NO_RECEIVER = i.f48121a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient h.l.b reflected;
    private final String signature;

    protected j(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // h.l.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // h.l.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public h.l.b compute() {
        h.l.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        h.l.b bVarComputeReflected = computeReflected();
        this.reflected = bVarComputeReflected;
        return bVarComputeReflected;
    }

    protected abstract h.l.b computeReflected();

    public GenericDeclaration findJavaDeclaration() {
        return o.a(getOwner(), getSignature());
    }

    @Override // h.l.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // h.l.b
    public String getName() {
        return this.name;
    }

    public h.l.e getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            int i2 = ar.f48106a;
            return new af(cls);
        }
        int i3 = ar.f48106a;
        return new m(cls);
    }

    @Override // h.l.b
    public List getParameters() {
        return getReflected().getParameters();
    }

    protected h.l.b getReflected() {
        h.l.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute;
        }
        throw new h.g.b();
    }

    @Override // h.l.b
    public h.l.s getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // h.l.b
    public List<h.l.t> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // h.l.b
    public h.l.v getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // h.l.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // h.l.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // h.l.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // h.l.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public j() {
        this(NO_RECEIVER);
    }

    protected j(Object obj) {
        this(obj, null, null, null, false);
    }
}
