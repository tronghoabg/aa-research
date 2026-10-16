package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty2;

/* loaded from: classes5.dex */
public abstract class z extends B implements KProperty2 {
    @Override // kotlin.jvm.internal.AbstractC3332c
    public final KCallable computeReflected() {
        return H.f39741a.property2(this);
    }

    @Override // kotlin.reflect.KProperty2
    public final Object getDelegate(Object obj, Object obj2) {
        return ((KProperty2) getReflected()).getDelegate(obj, obj2);
    }

    @Override // kotlin.reflect.KProperty2, tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((A) this).get(obj, obj2);
    }

    @Override // kotlin.reflect.KProperty
    public final KProperty2.Getter getGetter() {
        return ((KProperty2) getReflected()).getGetter();
    }
}
