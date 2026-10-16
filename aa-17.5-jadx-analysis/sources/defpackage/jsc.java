package defpackage;

import android.os.RemoteException;
import androidx.car.app.ISurfaceCallback;
import androidx.car.app.SessionInfo;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;

/* loaded from: classes2.dex */
final class jsc implements ges {
    private static final yph a = yph.c("CarApp.H");
    private final jsp b;

    public jsc(jsp jspVar) {
        this.b = jspVar;
    }

    @Override // defpackage.ges
    public final void a(float f, float f2) {
        jsp jspVar = this.b;
        mqb mqbVar = jspVar.p;
        if (mqbVar != null) {
            try {
                SessionInfo sessionInfo = jspVar.q;
                sessionInfo.getClass();
                hhz hhzVar = (hhz) jspVar.b(mqbVar, sessionInfo).a(CloudRecognizerProtocolStrings.APP);
                ISurfaceCallback iSurfaceCallback = hhzVar.e;
                if (iSurfaceCallback == null || hhzVar.a.i().c() <= 4) {
                    return;
                }
                hhzVar.a.t().m("onSurfaceClick", new glj(iSurfaceCallback, f, f2, 2));
                gks.c("CarApp.H.Tem", "SurfaceProvider: Surface click: [%f,%f]", Float.valueOf(f), Float.valueOf(f2));
            } catch (gee e) {
                ((ype) ((ype) a.l().p(e)).ai((char) 2723)).u("Ignoring click event, car host is invalidated");
            }
        }
    }

    @Override // defpackage.ges
    public final void b(float f, float f2) {
        jsp jspVar = this.b;
        mqb mqbVar = jspVar.p;
        if (mqbVar != null) {
            try {
                SessionInfo sessionInfo = jspVar.q;
                sessionInfo.getClass();
                hhz hhzVar = (hhz) jspVar.b(mqbVar, sessionInfo).a(CloudRecognizerProtocolStrings.APP);
                ISurfaceCallback iSurfaceCallback = hhzVar.e;
                if (iSurfaceCallback == null || hhzVar.a.i().c() <= 1) {
                    return;
                }
                hhzVar.a.t().m("onSurfaceFling", new glj(iSurfaceCallback, f, f2, 0));
                gks.c("CarApp.H.Tem", "SurfaceProvider: Surface fling: [%f, %f]", Float.valueOf(f), Float.valueOf(f2));
            } catch (gee e) {
                ((ype) ((ype) a.l().p(e)).ai((char) 2724)).u("Ignoring fling event, car host is invalidated");
            }
        }
    }

    @Override // defpackage.ges
    public final void c(final float f, final float f2, final float f3) {
        jsp jspVar = this.b;
        mqb mqbVar = jspVar.p;
        if (mqbVar != null) {
            try {
                SessionInfo sessionInfo = jspVar.q;
                sessionInfo.getClass();
                hhz hhzVar = (hhz) jspVar.b(mqbVar, sessionInfo).a(CloudRecognizerProtocolStrings.APP);
                final ISurfaceCallback iSurfaceCallback = hhzVar.e;
                if (iSurfaceCallback == null || hhzVar.a.i().c() <= 1) {
                    return;
                }
                hhzVar.a.t().m("onSurfaceScale", new afdr() { // from class: glk
                    @Override // defpackage.afdr
                    public final Object invoke() throws RemoteException {
                        iSurfaceCallback.onScale(f, f2, f3);
                        return afak.a;
                    }
                });
                gks.c("CarApp.H.Tem", "SurfaceProvider: Surface scale: [%f]", Float.valueOf(f3));
            } catch (gee e) {
                ((ype) ((ype) a.l().p(e)).ai((char) 2725)).u("Ignoring scale event, car host is invalidated");
            }
        }
    }

    @Override // defpackage.ges
    public final void d(float f, float f2) {
        jsp jspVar = this.b;
        mqb mqbVar = jspVar.p;
        if (mqbVar != null) {
            try {
                SessionInfo sessionInfo = jspVar.q;
                sessionInfo.getClass();
                hhz hhzVar = (hhz) jspVar.b(mqbVar, sessionInfo).a(CloudRecognizerProtocolStrings.APP);
                ISurfaceCallback iSurfaceCallback = hhzVar.e;
                if (iSurfaceCallback == null || hhzVar.a.i().c() <= 1) {
                    return;
                }
                hhzVar.a.t().m("onSurfaceScroll", new glj(iSurfaceCallback, f, f2, 1));
                gks.c("CarApp.H.Tem", "SurfaceProvider: Surface scroll: [%f, %f]", Float.valueOf(f), Float.valueOf(f2));
            } catch (gee e) {
                ((ype) ((ype) a.l().p(e)).ai((char) 2726)).u("Ignoring scroll event, car host is invalidated");
            }
        }
    }

    @Override // defpackage.ges
    public final boolean e() {
        jsp jspVar = this.b;
        if (jspVar.p == null) {
            return false;
        }
        if (!aczc.u()) {
            return true;
        }
        mqb mqbVar = jspVar.p;
        SessionInfo sessionInfo = jspVar.q;
        sessionInfo.getClass();
        kbn kbnVar = (kbn) jtq.d(jspVar.c(mqbVar, sessionInfo));
        if (kbnVar == null) {
            return true;
        }
        kbnVar.g(gsn.c);
        return kbnVar.a.c != lzb.a;
    }

    @Override // defpackage.ges
    public final boolean f() {
        jsp jspVar = this.b;
        mqb mqbVar = jspVar.p;
        if (mqbVar != null) {
            try {
                SessionInfo sessionInfo = jspVar.q;
                sessionInfo.getClass();
                return ((hhz) jspVar.b(mqbVar, sessionInfo).a(CloudRecognizerProtocolStrings.APP)).e != null;
            } catch (gee e) {
                ((ype) ((ype) a.l().p(e)).ai((char) 2722)).u("Ignoring isSurfaceCallbackRegistered event, car host is invalidated");
            }
        }
        return false;
    }
}
