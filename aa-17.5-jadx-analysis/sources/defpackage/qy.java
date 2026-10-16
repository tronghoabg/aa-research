package defpackage;

import android.util.Log;
import com.android.car.libraries.apphost.view.MicrophoneRecordingView;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class qy implements epf {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public qy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.epf
    public final void fL(eqa eqaVar) {
        int i = this.b;
        if (i == 0) {
            ((qz) this.a).a.e(epr.ON_STOP);
            return;
        }
        if (i == 1) {
            qw qwVar = (qw) ((qx) this.a).a.peek();
            if (qwVar == null) {
                Log.e("CarApp", "Screen stack was empty during lifecycle onStop");
                return;
            } else {
                qwVar.i(epr.ON_STOP);
                return;
            }
        }
        if (i == 2) {
            hlo hloVar = ((gnv) this.a).a;
            if (hloVar != null) {
                hloVar.n();
                return;
            }
            return;
        }
        Object obj = this.a;
        if (i != 3) {
            hlo hloVar2 = ((hli) obj).a;
            if (hloVar2 != null) {
                hloVar2.n();
                return;
            }
            return;
        }
        hlo hloVar3 = ((hgr) obj).a;
        if (hloVar3 != null) {
            hloVar3.n();
        }
    }

    @Override // defpackage.epf
    public final void fM() {
        int i = this.b;
        if (i == 0) {
            ((qz) this.a).a.e(epr.ON_PAUSE);
            return;
        }
        if (i == 1) {
            qw qwVar = (qw) ((qx) this.a).a.peek();
            if (qwVar == null) {
                Log.e("CarApp", "Screen stack was empty during lifecycle onPause");
                return;
            } else {
                qwVar.i(epr.ON_PAUSE);
                return;
            }
        }
        if (i == 2) {
            hlo hloVar = ((gnv) this.a).a;
            if (hloVar != null) {
                hloVar.A();
                return;
            }
            return;
        }
        Object obj = this.a;
        if (i != 3) {
            hlo hloVar2 = ((hli) obj).a;
            if (hloVar2 != null) {
                hloVar2.A();
                return;
            }
            return;
        }
        hlo hloVar3 = ((hgr) obj).a;
        if (hloVar3 != null) {
            hloVar3.A();
        }
    }

    @Override // defpackage.epf
    public final void fv(eqa eqaVar) {
        int i = this.b;
        if (i == 0) {
            ((qz) this.a).a.e(epr.ON_CREATE);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                hlo hloVar = ((gnv) this.a).a;
                if (hloVar != null) {
                    hloVar.F();
                    return;
                }
                return;
            }
            Object obj = this.a;
            if (i == 3) {
                hlo hloVar2 = ((hgr) obj).a;
                if (hloVar2 != null) {
                    hloVar2.F();
                    return;
                }
                return;
            }
            hli hliVar = (hli) obj;
            geu geuVar = hliVar.c;
            geuVar.getClass();
            gdu gduVar = (gdu) geuVar.l(gdu.class);
            gduVar.getClass();
            MicrophoneRecordingView microphoneRecordingViewJ = hliVar.j();
            microphoneRecordingViewJ.a.a.setTint(hliVar.c.d().g().d);
            microphoneRecordingViewJ.setOnClickListener(new ie(gduVar, 4, null));
            gduVar.a.fE(eqaVar, hliVar.f);
        }
    }

    @Override // defpackage.epf
    public final void fw(eqa eqaVar) {
        ept lifecycle;
        eps epsVarA;
        hlo hloVar;
        int i = this.b;
        if (i == 0) {
            ((qz) this.a).a.e(epr.ON_DESTROY);
            eqaVar.getLifecycle().d(this);
            return;
        }
        if (i == 1) {
            Deque deque = ((qx) this.a).a;
            Iterator it = new ArrayDeque(deque).iterator();
            while (it.hasNext()) {
                qx.h((qw) it.next(), true);
            }
            deque.clear();
            eqaVar.getLifecycle().d(this);
            return;
        }
        if (i == 2) {
            gnv gnvVar = (gnv) this.a;
            hlo hloVar2 = gnvVar.a;
            if (hloVar2 == null || (lifecycle = hloVar2.getLifecycle()) == null || (epsVarA = lifecycle.a()) == null || !epsVarA.a(eps.c) || (hloVar = gnvVar.a) == null) {
                return;
            }
            hloVar.b();
            return;
        }
        Object obj = this.a;
        if (i != 3) {
            hlo hloVar3 = ((hli) obj).a;
            if (hloVar3 != null) {
                hloVar3.b();
                return;
            }
            return;
        }
        hlo hloVar4 = ((hgr) obj).a;
        if (hloVar4 != null) {
            hloVar4.b();
        }
    }

    @Override // defpackage.epf
    public final void fx(eqa eqaVar) {
        int i = this.b;
        if (i == 0) {
            ((qz) this.a).a.e(epr.ON_RESUME);
            return;
        }
        if (i == 1) {
            qw qwVar = (qw) ((qx) this.a).a.peek();
            if (qwVar == null) {
                Log.e("CarApp", "Screen stack was empty during lifecycle onResume");
                return;
            } else {
                qwVar.i(epr.ON_RESUME);
                return;
            }
        }
        if (i == 2) {
            hlo hloVar = ((gnv) this.a).a;
            if (hloVar != null) {
                hloVar.B();
                return;
            }
            return;
        }
        Object obj = this.a;
        if (i != 3) {
            hlo hloVar2 = ((hli) obj).a;
            if (hloVar2 != null) {
                hloVar2.B();
                return;
            }
            return;
        }
        hlo hloVar3 = ((hgr) obj).a;
        if (hloVar3 != null) {
            hloVar3.B();
        }
    }

    @Override // defpackage.epf
    public final void fy(eqa eqaVar) {
        int i = this.b;
        if (i == 0) {
            ((qz) this.a).a.e(epr.ON_START);
            return;
        }
        if (i == 1) {
            qw qwVar = (qw) ((qx) this.a).a.peek();
            if (qwVar == null) {
                Log.e("CarApp", "Screen stack was empty during lifecycle onStart");
                return;
            } else {
                qwVar.i(epr.ON_START);
                return;
            }
        }
        if (i == 2) {
            hlo hloVar = ((gnv) this.a).a;
            if (hloVar != null) {
                hloVar.c();
                return;
            }
            return;
        }
        Object obj = this.a;
        if (i != 3) {
            hlo hloVar2 = ((hli) obj).a;
            if (hloVar2 != null) {
                hloVar2.c();
                return;
            }
            return;
        }
        hlo hloVar3 = ((hgr) obj).a;
        if (hloVar3 != null) {
            hloVar3.c();
        }
    }
}
