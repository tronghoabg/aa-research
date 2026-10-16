package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;

/* renamed from: kotlin.jvm.internal.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3337h extends AbstractC3332c implements InterfaceC3336g, KFunction {
    private final int arity;

    public AbstractC3337h(int i5) {
        this(i5, AbstractC3332c.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.AbstractC3332c
    public KCallable computeReflected() {
        return H.f39741a.function(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3337h) {
            AbstractC3337h abstractC3337h = (AbstractC3337h) obj;
            return getName().equals(abstractC3337h.getName()) && getSignature().equals(abstractC3337h.getSignature()) && AbstractC3340k.a(getBoundReceiver(), abstractC3337h.getBoundReceiver()) && AbstractC3340k.a(getOwner(), abstractC3337h.getOwner());
        }
        if (obj instanceof KFunction) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC3336g
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.KFunction
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.AbstractC3332c, kotlin.reflect.KCallable
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        KCallable kCallableCompute = compute();
        if (kCallableCompute != this) {
            return kCallableCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public AbstractC3337h(int i5, Object obj) {
        this(i5, obj, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.AbstractC3332c
    public KFunction getReflected() {
        KCallable kCallableCompute = compute();
        if (kCallableCompute != this) {
            return (KFunction) kCallableCompute;
        }
        throw new Ef.G(2);
    }

    public AbstractC3337h(int i5, Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.arity = i5;
    }
}
