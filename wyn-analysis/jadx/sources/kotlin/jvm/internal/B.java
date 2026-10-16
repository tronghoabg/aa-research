package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public abstract class B extends AbstractC3332c implements KProperty {
    private final boolean syntheticJavaProperty;

    public B(Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, (i5 & 1) == 1);
        this.syntheticJavaProperty = (i5 & 2) == 2;
    }

    @Override // kotlin.jvm.internal.AbstractC3332c
    public KCallable compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof B) {
            B b5 = (B) obj;
            return getOwner().equals(b5.getOwner()) && getName().equals(b5.getName()) && getSignature().equals(b5.getSignature()) && AbstractC3340k.a(getBoundReceiver(), b5.getBoundReceiver());
        }
        if (obj instanceof KProperty) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.KProperty
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // kotlin.reflect.KProperty
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        KCallable kCallableCompute = compute();
        if (kCallableCompute != this) {
            return kCallableCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.AbstractC3332c
    public KProperty getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        KCallable kCallableCompute = compute();
        if (kCallableCompute != this) {
            return (KProperty) kCallableCompute;
        }
        throw new Ef.G(2);
    }

    public B() {
        super(AbstractC3332c.NO_RECEIVER, null, null, null, false);
        this.syntheticJavaProperty = false;
    }
}
