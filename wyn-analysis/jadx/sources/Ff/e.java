package Ff;

import Ef.A;
import Ef.C0499l0;
import Ef.C0502n;
import Ef.E0;
import Ef.InterfaceC0501m0;
import Ef.M;
import Ef.M0;
import Ef.S;
import Ef.U;
import Jf.n;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class e extends A implements M {

    /* renamed from: b, reason: collision with root package name */
    public final Handler f4114b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4115c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4116d;

    /* renamed from: e, reason: collision with root package name */
    public final e f4117e;

    public e(Handler handler, String str, boolean z2) {
        this.f4114b = handler;
        this.f4115c = str;
        this.f4116d = z2;
        this.f4117e = z2 ? this : new e(handler, str, true);
    }

    @Override // Ef.M
    public final U b(long j8, final M0 m02, InterfaceC3108h interfaceC3108h) {
        if (j8 > 4611686018427387903L) {
            j8 = 4611686018427387903L;
        }
        if (this.f4114b.postDelayed(m02, j8)) {
            return new U() { // from class: Ff.c
                @Override // Ef.U
                public final void dispose() {
                    this.f4109a.f4114b.removeCallbacks(m02);
                }
            };
        }
        z(interfaceC3108h, m02);
        return E0.f3662a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.f4114b == this.f4114b && eVar.f4116d == this.f4116d;
    }

    @Override // Ef.M
    public final void h(long j8, C0502n c0502n) {
        C8.d dVar = new C8.d(8, c0502n, this);
        if (j8 > 4611686018427387903L) {
            j8 = 4611686018427387903L;
        }
        if (this.f4114b.postDelayed(dVar, j8)) {
            c0502n.v(new d(0, this, dVar));
        } else {
            z(c0502n.f3755e, dVar);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f4114b) ^ (this.f4116d ? 1231 : 1237);
    }

    @Override // Ef.A
    public final void i(InterfaceC3108h interfaceC3108h, Runnable runnable) {
        if (this.f4114b.post(runnable)) {
            return;
        }
        z(interfaceC3108h, runnable);
    }

    @Override // Ef.A
    public final String toString() {
        e eVar;
        String str;
        Lf.e eVar2 = S.f3698a;
        e eVar3 = n.f6132a;
        if (this == eVar3) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = eVar3.f4117e;
            } catch (UnsupportedOperationException unused) {
                eVar = null;
            }
            str = this == eVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f4115c;
        if (string == null) {
            string = this.f4114b.toString();
        }
        return this.f4116d ? N0.a.f(string, ".immediate") : string;
    }

    @Override // Ef.A
    public final boolean w(InterfaceC3108h interfaceC3108h) {
        return (this.f4116d && AbstractC3340k.a(Looper.myLooper(), this.f4114b.getLooper())) ? false : true;
    }

    public final void z(InterfaceC3108h interfaceC3108h, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC0501m0 interfaceC0501m0 = (InterfaceC0501m0) interfaceC3108h.get(C0499l0.f3748a);
        if (interfaceC0501m0 != null) {
            interfaceC0501m0.cancel(cancellationException);
        }
        Lf.e eVar = S.f3698a;
        Lf.d.f7120b.i(interfaceC3108h, runnable);
    }

    public e(Handler handler) {
        this(handler, null, false);
    }
}
