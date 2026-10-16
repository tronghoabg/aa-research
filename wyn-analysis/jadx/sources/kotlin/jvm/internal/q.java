package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty1;

/* loaded from: classes5.dex */
public abstract class q extends t implements KMutableProperty1 {
    @Override // kotlin.jvm.internal.AbstractC3332c
    public final KCallable computeReflected() {
        return H.f39741a.mutableProperty1(this);
    }

    @Override // kotlin.reflect.KProperty1
    public final Object getDelegate(Object obj) {
        return ((KMutableProperty1) getReflected()).getDelegate(obj);
    }

    @Override // kotlin.reflect.KMutableProperty1, kotlin.reflect.KProperty1, tf.l
    public final Object invoke(Object obj) {
        return ((r) this).get(obj);
    }

    @Override // kotlin.reflect.KProperty
    public final KProperty1.Getter getGetter() {
        return ((KMutableProperty1) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.KMutableProperty
    public final KMutableProperty1.Setter getSetter() {
        return ((KMutableProperty1) getReflected()).getSetter();
    }
}
