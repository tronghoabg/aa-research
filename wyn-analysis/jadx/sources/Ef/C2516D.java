package ef;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: ef.D, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2516D implements InterfaceC2525i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public tf.a f34654a;

    /* renamed from: b, reason: collision with root package name */
    public Object f34655b;

    @Override // ef.InterfaceC2525i
    public final Object getValue() {
        if (this.f34655b == C2541y.f34690a) {
            tf.a aVar = this.f34654a;
            AbstractC3340k.b(aVar);
            this.f34655b = aVar.invoke();
            this.f34654a = null;
        }
        return this.f34655b;
    }

    @Override // ef.InterfaceC2525i
    public final boolean isInitialized() {
        return this.f34655b != C2541y.f34690a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
