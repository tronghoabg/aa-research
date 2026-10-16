package ef;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: ef.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2532p implements InterfaceC2525i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public tf.a f34678a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f34679b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f34680c;

    public C2532p(tf.a initializer) {
        AbstractC3340k.e(initializer, "initializer");
        this.f34678a = initializer;
        this.f34679b = C2541y.f34690a;
        this.f34680c = this;
    }

    @Override // ef.InterfaceC2525i
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f34679b;
        C2541y c2541y = C2541y.f34690a;
        if (obj != c2541y) {
            return obj;
        }
        synchronized (this.f34680c) {
            objInvoke = this.f34679b;
            if (objInvoke == c2541y) {
                tf.a aVar = this.f34678a;
                AbstractC3340k.b(aVar);
                objInvoke = aVar.invoke();
                this.f34679b = objInvoke;
                this.f34678a = null;
            }
        }
        return objInvoke;
    }

    @Override // ef.InterfaceC2525i
    public final boolean isInitialized() {
        return this.f34679b != C2541y.f34690a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
