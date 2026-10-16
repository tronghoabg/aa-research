package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KProperty0;

/* renamed from: kotlin.jvm.internal.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3344o extends t implements KMutableProperty0 {
    @Override // kotlin.jvm.internal.AbstractC3332c
    public KCallable computeReflected() {
        return H.f39741a.mutableProperty0(this);
    }

    @Override // kotlin.reflect.KProperty0
    public Object getDelegate() {
        return ((KMutableProperty0) getReflected()).getDelegate();
    }

    @Override // kotlin.reflect.KMutableProperty0, kotlin.reflect.KProperty0, tf.a
    public Object invoke() {
        return get();
    }

    @Override // kotlin.reflect.KProperty
    public KProperty0.Getter getGetter() {
        return ((KMutableProperty0) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.KMutableProperty
    public KMutableProperty0.Setter getSetter() {
        return ((KMutableProperty0) getReflected()).getSetter();
    }
}
