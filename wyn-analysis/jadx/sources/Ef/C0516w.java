package Ef;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: Ef.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0516w {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3781a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0496k f3782b;

    /* renamed from: c, reason: collision with root package name */
    public final tf.q f3783c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3784d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f3785e;

    public C0516w(Object obj, InterfaceC0496k interfaceC0496k, tf.q qVar, Object obj2, Throwable th) {
        this.f3781a = obj;
        this.f3782b = interfaceC0496k;
        this.f3783c = qVar;
        this.f3784d = obj2;
        this.f3785e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0516w a(C0516w c0516w, InterfaceC0496k interfaceC0496k, CancellationException cancellationException, int i5) {
        Object obj = c0516w.f3781a;
        if ((i5 & 2) != 0) {
            interfaceC0496k = c0516w.f3782b;
        }
        InterfaceC0496k interfaceC0496k2 = interfaceC0496k;
        tf.q qVar = c0516w.f3783c;
        Object obj2 = c0516w.f3784d;
        CancellationException cancellationException2 = cancellationException;
        if ((i5 & 16) != 0) {
            cancellationException2 = c0516w.f3785e;
        }
        c0516w.getClass();
        return new C0516w(obj, interfaceC0496k2, qVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0516w)) {
            return false;
        }
        C0516w c0516w = (C0516w) obj;
        return AbstractC3340k.a(this.f3781a, c0516w.f3781a) && AbstractC3340k.a(this.f3782b, c0516w.f3782b) && AbstractC3340k.a(this.f3783c, c0516w.f3783c) && AbstractC3340k.a(this.f3784d, c0516w.f3784d) && AbstractC3340k.a(this.f3785e, c0516w.f3785e);
    }

    public final int hashCode() {
        Object obj = this.f3781a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC0496k interfaceC0496k = this.f3782b;
        int iHashCode2 = (iHashCode + (interfaceC0496k == null ? 0 : interfaceC0496k.hashCode())) * 31;
        tf.q qVar = this.f3783c;
        int iHashCode3 = (iHashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Object obj2 = this.f3784d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f3785e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f3781a + ", cancelHandler=" + this.f3782b + ", onCancellation=" + this.f3783c + ", idempotentResume=" + this.f3784d + ", cancelCause=" + this.f3785e + ')';
    }

    public /* synthetic */ C0516w(Object obj, InterfaceC0496k interfaceC0496k, tf.q qVar, CancellationException cancellationException, int i5) {
        this(obj, (i5 & 2) != 0 ? null : interfaceC0496k, (i5 & 4) != 0 ? null : qVar, (Object) null, (i5 & 16) != 0 ? null : cancellationException);
    }
}
