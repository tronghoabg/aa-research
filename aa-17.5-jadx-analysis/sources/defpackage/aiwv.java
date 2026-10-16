package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class aiwv extends aiww implements aiuf {
    public final Handler a;
    public final aiwv b;
    private final String c;
    private final boolean d;

    public aiwv(Handler handler, String str, boolean z) {
        this.a = handler;
        this.c = str;
        this.d = z;
        this.b = z ? this : new aiwv(handler, str, true);
    }

    private final void j(afco afcoVar, Runnable runnable) {
        affx.e(afcoVar, new CancellationException(a.bm(this, "The task was rejected, the handler underlying the dispatcher '", "' was closed")));
        aitu aituVar = aium.a;
        ajdk.a.a(afcoVar, runnable);
    }

    @Override // defpackage.aitu
    public final void a(afco afcoVar, Runnable runnable) {
        if (this.a.post(runnable)) {
            return;
        }
        j(afcoVar, runnable);
    }

    @Override // defpackage.aiuf
    public final void c(long j, aitf aitfVar) {
        final adyc adycVar = new adyc(aitfVar, this, 4);
        if (this.a.postDelayed(adycVar, afpt.i(j, 4611686018427387903L))) {
            aitfVar.d(new afec() { // from class: aiwu
                @Override // defpackage.afec
                public final Object invoke(Object obj) {
                    this.a.a.removeCallbacks(adycVar);
                    return afak.a;
                }
            });
        } else {
            j(((aitg) aitfVar).b, adycVar);
        }
    }

    @Override // defpackage.aitu
    public final boolean eQ(afco afcoVar) {
        if (this.d) {
            return !affa.f(Looper.myLooper(), this.a.getLooper());
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aiwv)) {
            return false;
        }
        aiwv aiwvVar = (aiwv) obj;
        return aiwvVar.a == this.a && aiwvVar.d == this.d;
    }

    @Override // defpackage.aiww, defpackage.aiuf
    public final aiuo h(long j, Runnable runnable, afco afcoVar) {
        if (this.a.postDelayed(runnable, afpt.i(j, 4611686018427387903L))) {
            return new aiwt(this, runnable, 0);
        }
        j(afcoVar, runnable);
        return aivu.a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a) ^ (true != this.d ? 1237 : 1231);
    }

    @Override // defpackage.aivr
    public final /* synthetic */ aivr i() {
        return this.b;
    }

    @Override // defpackage.aivr, defpackage.aitu
    public final String toString() {
        String strE = e();
        if (strE == null) {
            strE = this.c;
            if (strE == null) {
                strE = this.a.toString();
            }
            if (this.d) {
                return String.valueOf(strE).concat(".immediate");
            }
        }
        return strE;
    }
}
