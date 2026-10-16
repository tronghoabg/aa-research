package defpackage;

import android.os.RemoteException;
import android.util.Log;
import android.view.animation.AnimationUtils;
import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class aadr {
    public static final String a = "aadr";
    public final zrt b;
    public final ztv c;
    public aadp d;
    public int e;
    private final Executor f;
    private final aacz g;

    public aadr(ztv ztvVar, aacz aaczVar) {
        Executor executorB = zrz.b();
        zrt zrtVar = zrt.a;
        this.c = ztvVar;
        this.g = aaczVar;
        this.f = executorB;
        zkt.n(zrtVar, "UI ThreadChecker cannot be null.");
        this.b = zrtVar;
        synchronized (this) {
            this.d = null;
            this.e = 0;
        }
    }

    public final void a(aadp aadpVar, Object obj) {
        aadp aadpVar2;
        int i;
        this.b.a();
        ysi.X(obj, "worldModelState");
        int i2 = 0;
        if (aadpVar != null) {
            ztv ztvVar = this.c;
            int iA = aadpVar.a();
            ztvVar.c.a();
            synchronized (ztvVar) {
                ztvVar.g++;
            }
            int i3 = ztvVar.f;
            boolean z = i3 != iA;
            boolean z2 = i3 != iA && ztvVar.g();
            boolean z3 = z && iA != -4;
            ztvVar.f = iA;
            ztvVar.d = true;
            if (iA == 1) {
                ztvVar.e = true;
            }
            vff vffVar = ztvVar.h;
            if (vffVar != null && z2) {
                try {
                    vffVar.e();
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            }
            if (z3) {
                Iterator it = ztvVar.j.iterator();
                while (it.hasNext()) {
                    ((ztu) it.next()).a();
                }
                vfl vflVar = ztvVar.i;
                if (vflVar != null) {
                    try {
                        if (iA == 1) {
                            i = 1;
                        } else if (iA == 2) {
                            i = 2;
                        } else {
                            if (iA != 3) {
                                throw new IllegalStateException("Unknown camera state");
                            }
                            i = 3;
                        }
                        vflVar.e(i);
                    } catch (RemoteException e2) {
                        throw new RuntimeRemoteException(e2);
                    }
                }
            }
            CameraPosition cameraPositionD = aadpVar.d();
            if (cameraPositionD != null) {
                if (obj instanceof aaet) {
                    ((aaet) obj).t(cameraPositionD);
                } else {
                    aaem aaemVar = (aaem) obj;
                    aaemVar.j();
                    ((aaet) aaemVar.b).t(cameraPositionD);
                }
            }
        }
        synchronized (this) {
            String str = a;
            if (zrn.e(str, 3)) {
                Log.d(str, String.format("onAnimation(%s => %s)", this.d, aadpVar));
            }
            aadpVar2 = this.d;
            this.d = aadpVar;
            if (aadpVar != null) {
                i2 = 1;
            }
            this.e = i2;
        }
        if (aadpVar2 != null) {
            aadpVar2.g(true);
            if (addm.a.gu().q()) {
                this.c.b();
            }
        }
    }

    public final synchronized void b() {
        int i;
        this.b.b();
        if (this.d != null) {
            int i2 = this.e;
            if (i2 == 1 || i2 == 2) {
                ztv ztvVar = this.c;
                ztvVar.c.b();
                ztvVar.b.execute(new zte(ztvVar, 2));
            }
            if (this.e == 2) {
                this.e = 3;
                this.f.execute(new zww(this, this.d, 6));
                ztv ztvVar2 = this.c;
                ztvVar2.c.b();
                synchronized (ztvVar2) {
                    i = ztvVar2.g;
                }
                ztvVar2.b.execute(new rgm(ztvVar2, i, 18, null));
            }
        }
    }

    public final synchronized void c(aadv aadvVar, aaet aaetVar) {
        this.b.b();
        aadp aadpVar = this.d;
        if (aadpVar != null && this.e == 1) {
            aadvVar.a = true;
            aadvVar.b = aadpVar.i();
            CameraPosition cameraPositionC = aadpVar.c(aaetVar, AnimationUtils.currentAnimationTimeMillis());
            if (cameraPositionC != null) {
                CameraPosition cameraPositionB = this.g.b(cameraPositionC, aaetVar);
                boolean z = cameraPositionB != cameraPositionC;
                aadvVar.e = z;
                if (!z || this.d.j(cameraPositionB, aaetVar)) {
                    cameraPositionC = cameraPositionB;
                } else {
                    aadvVar.f = true;
                    cameraPositionC = null;
                }
            }
            if (this.d.h()) {
                aadvVar.g = true;
                this.e = 2;
            }
            if (cameraPositionC == null) {
                aadvVar.c = aaetVar.g();
                aadvVar.d = aaetVar.c();
                return;
            } else {
                aadvVar.c = cameraPositionC;
                this.d.k();
                aadvVar.d = null;
                return;
            }
        }
        aadvVar.c = aaetVar.g();
        aadvVar.d = aaetVar.c();
    }

    public final synchronized boolean d() {
        return this.e == 0;
    }

    public final synchronized zwj e() {
        aadp aadpVar = this.d;
        zro zroVarE = aadpVar == null ? null : aadpVar.e();
        if (zroVarE == null) {
            return null;
        }
        return new zwj(aaaw.b((CameraPosition) zroVarE.a, null), ((Long) zroVarE.b).longValue());
    }
}
