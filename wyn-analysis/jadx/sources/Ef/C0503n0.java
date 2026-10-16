package Ef;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: Ef.n0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0503n0 extends CancellationException implements InterfaceC0518y {

    /* renamed from: a, reason: collision with root package name */
    public final transient InterfaceC0501m0 f3756a;

    public C0503n0(InterfaceC0501m0 interfaceC0501m0, String str, Throwable th) {
        super(str);
        this.f3756a = interfaceC0501m0;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // Ef.InterfaceC0518y
    public final /* bridge */ /* synthetic */ Throwable a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0503n0)) {
            return false;
        }
        C0503n0 c0503n0 = (C0503n0) obj;
        if (!AbstractC3340k.a(c0503n0.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = c0503n0.f3756a;
        if (obj2 == null) {
            obj2 = D0.f3661a;
        }
        Object obj3 = this.f3756a;
        if (obj3 == null) {
            obj3 = D0.f3661a;
        }
        return AbstractC3340k.a(obj2, obj3) && AbstractC3340k.a(c0503n0.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        AbstractC3340k.b(message);
        int iHashCode = message.hashCode() * 31;
        Object obj = this.f3756a;
        if (obj == null) {
            obj = D0.f3661a;
        }
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("; job=");
        Object obj = this.f3756a;
        if (obj == null) {
            obj = D0.f3661a;
        }
        sb2.append(obj);
        return sb2.toString();
    }
}
