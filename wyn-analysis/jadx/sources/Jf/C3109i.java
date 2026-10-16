package jf;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3340k;
import tf.p;

/* renamed from: jf.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3109i implements InterfaceC3108h, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final C3109i f38759a = new C3109i();

    @Override // jf.InterfaceC3108h
    public final InterfaceC3106f get(InterfaceC3107g key) {
        AbstractC3340k.e(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3108h minusKey(InterfaceC3107g key) {
        AbstractC3340k.e(key, "key");
        return this;
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3108h plus(InterfaceC3108h context) {
        AbstractC3340k.e(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // jf.InterfaceC3108h
    public final Object fold(Object obj, p pVar) {
        return obj;
    }
}
