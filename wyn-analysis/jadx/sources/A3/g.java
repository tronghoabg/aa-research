package A3;

import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import tf.l;

/* loaded from: classes.dex */
public final class g extends A6.h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f292a;

    /* renamed from: b, reason: collision with root package name */
    public final int f293b;

    /* renamed from: c, reason: collision with root package name */
    public final a f294c;

    public g(Object value, int i5, a aVar) {
        AbstractC3340k.e(value, "value");
        AbstractC3256n.m(i5, "verificationMode");
        this.f292a = value;
        this.f293b = i5;
        this.f294c = aVar;
    }

    @Override // A6.h
    public final A6.h I(String str, l lVar) {
        Object obj = this.f292a;
        return ((Boolean) lVar.invoke(obj)).booleanValue() ? this : new f(obj, str, this.f294c, this.f293b);
    }

    @Override // A6.h
    public final Object m() {
        return this.f292a;
    }
}
