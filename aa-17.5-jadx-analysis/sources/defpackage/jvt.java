package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import android.util.Pair;
import androidx.car.app.hardware.ICarHardwareHost;
import androidx.car.app.hardware.ICarHardwareResult;
import androidx.car.app.serialization.Bundleable;

/* loaded from: classes2.dex */
public final class jvt extends ICarHardwareHost.Stub {
    public final /* synthetic */ jvu a;

    public jvt(jvu jvuVar) {
        this.a = jvuVar;
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.Map] */
    public final void a(int i, Bundleable bundleable, ICarHardwareResult iCarHardwareResult, String str) {
        jvv jwgVar;
        if (str != null) {
            jvu jvuVar = this.a;
            ComponentName componentNameA = jvuVar.a();
            Context contextA = jvuVar.a.a();
            if (contextA == null) {
                ((ype) ((ype) jvu.c.g()).ai((char) 2776)).u("App configuration context is null");
                throw new IllegalStateException("Invalid App Configuration.");
            }
            try {
                mt.k(contextA, str);
            } catch (SecurityException e) {
                ((ype) ((ype) ((ype) jvu.c.g()).p(e)).ai((char) 2775)).y("App %s trying to access surface when the permission was not granted", componentNameA);
                throw new SecurityException(e);
            }
        }
        boolean z = true;
        try {
            Integer num = (Integer) (bundleable == null ? 1 : bundleable.a());
            jvv jvvVarF = this.a.e.f(i, num.intValue());
            if (jvvVarF != null) {
                jwa.a().e(jvvVarF);
            }
            jwa jwaVarA = jwa.a();
            int iIntValue = num.intValue();
            ruj rujVar = new ruj(this, i, iCarHardwareResult);
            jvv jvvVar = null;
            if (jwaVarA.b) {
                roj rojVar = jwaVarA.c;
                if (rojVar == null) {
                    ((ype) ((ype) jwa.a.g()).ai((char) 2793)).u("createSensorEventListener without carSensorManager");
                    jwaVarA.b(jvy.c, jvx.c, i);
                } else if (jwa.d.i(i)) {
                    int i2 = 3;
                    try {
                        if (i == 3) {
                            jwgVar = new jwg(i, iIntValue, rujVar);
                        } else if (i == 4) {
                            roj rojVar2 = jwaVarA.c;
                            int[] iArrE = rojVar2 == null ? null : rojVar2.e();
                            if (iArrE == null || iArrE.length != 1 || iArrE[0] != 10) {
                                z = false;
                            }
                            jwgVar = new jwc(i, iIntValue, rujVar, z);
                        } else if (i == 5) {
                            jwgVar = new jwf(i, iIntValue, rujVar);
                        } else if (i != 6) {
                            switch (i) {
                                case 20:
                                    jwgVar = new jvp(i, iIntValue, rujVar);
                                    break;
                                case 21:
                                    jwgVar = new jwb(i, iIntValue, rujVar);
                                    break;
                                case 22:
                                    jwgVar = new jwd(i, iIntValue, rujVar);
                                    break;
                                case 23:
                                    jwgVar = new jvw(i, iIntValue, rujVar);
                                    break;
                            }
                        } else {
                            jwgVar = new jwe(i, iIntValue, rujVar);
                        }
                        int i3 = jwgVar.a;
                        if (rojVar.d(i3)) {
                            if (iIntValue == 3) {
                                i2 = 0;
                            }
                            rojVar.f(jwgVar, i3, i2);
                            jwaVarA.b(jvy.c, jvx.a, i);
                            jvvVar = jwgVar;
                        } else {
                            jwaVarA.b(jvy.c, jvx.f, i);
                        }
                    } catch (qrz unused) {
                        jwaVarA.b(jvy.c, jvx.c, i);
                    }
                } else {
                    ((ype) ((ype) jwa.a.f()).ai((char) 2792)).w("createSensorEventListener not allowed for type %d", i);
                    jwaVarA.b(jvy.c, jvx.d, i);
                }
            } else {
                ((ype) ((ype) jwa.a.h()).ai((char) 2794)).u("createSensorEventListener called while not started");
                jwaVarA.b(jvy.c, jvx.b, i);
            }
            if (jvvVar == null) {
                c(i, iCarHardwareResult);
                return;
            }
            gms gmsVar = this.a.e;
            num.intValue();
            gmsVar.a.put(new Pair(Integer.valueOf(i), num), jvvVar);
        } catch (xr e2) {
            throw new IllegalArgumentException("Incorrect format for parameter.", e2);
        }
    }

    public final void b(final int i, final Object obj, final ICarHardwareResult iCarHardwareResult) {
        ((ype) ((ype) jvu.c.f()).ai((char) 2777)).w("getCarHardwareResult dispatchResult=%d", i);
        this.a.a.t().a(gnk.B, new gek() { // from class: jvq
            @Override // defpackage.gek
            public final void a(glf glfVar) throws RemoteException {
                iCarHardwareResult.onCarHardwareResult(i, true, new Bundleable(obj), new gej(this.a.a.a, glfVar));
            }
        });
    }

    public final void c(final int i, final ICarHardwareResult iCarHardwareResult) {
        this.a.a.t().a(gnk.B, new gek() { // from class: jvr
            @Override // defpackage.gek
            public final void a(glf glfVar) throws RemoteException {
                iCarHardwareResult.onCarHardwareResult(i, false, new Bundleable((Object) (-1)), new gej(this.a.a.a, glfVar));
            }
        });
    }

    @Override // androidx.car.app.hardware.ICarHardwareHost
    public final void getCarHardwareResult(final int i, Bundleable bundleable, final ICarHardwareResult iCarHardwareResult) {
        this.a.n("getCarHardwareResult", new Runnable() { // from class: jvs
            /* JADX WARN: Removed duplicated region for block: B:24:0x0082 A[Catch: qrz -> 0x012e, TryCatch #0 {qrz -> 0x012e, blocks: (B:17:0x0071, B:24:0x0082, B:26:0x0085, B:31:0x0094, B:33:0x0097, B:34:0x009d, B:36:0x00a0, B:38:0x00a6, B:49:0x00c2, B:50:0x00cc, B:52:0x00db, B:54:0x00e1, B:56:0x00e4, B:57:0x00ea, B:59:0x00ed, B:60:0x00ef, B:74:0x0114, B:75:0x011e, B:76:0x0126, B:51:0x00d4, B:21:0x007b), top: B:113:0x0071, inners: #3, #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0094 A[Catch: qrz -> 0x012e, TryCatch #0 {qrz -> 0x012e, blocks: (B:17:0x0071, B:24:0x0082, B:26:0x0085, B:31:0x0094, B:33:0x0097, B:34:0x009d, B:36:0x00a0, B:38:0x00a6, B:49:0x00c2, B:50:0x00cc, B:52:0x00db, B:54:0x00e1, B:56:0x00e4, B:57:0x00ea, B:59:0x00ed, B:60:0x00ef, B:74:0x0114, B:75:0x011e, B:76:0x0126, B:51:0x00d4, B:21:0x007b), top: B:113:0x0071, inners: #3, #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:51:0x00d4 A[Catch: qrz -> 0x012e, TryCatch #0 {qrz -> 0x012e, blocks: (B:17:0x0071, B:24:0x0082, B:26:0x0085, B:31:0x0094, B:33:0x0097, B:34:0x009d, B:36:0x00a0, B:38:0x00a6, B:49:0x00c2, B:50:0x00cc, B:52:0x00db, B:54:0x00e1, B:56:0x00e4, B:57:0x00ea, B:59:0x00ed, B:60:0x00ef, B:74:0x0114, B:75:0x011e, B:76:0x0126, B:51:0x00d4, B:21:0x007b), top: B:113:0x0071, inners: #3, #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:76:0x0126 A[Catch: qrz -> 0x012e, TRY_LEAVE, TryCatch #0 {qrz -> 0x012e, blocks: (B:17:0x0071, B:24:0x0082, B:26:0x0085, B:31:0x0094, B:33:0x0097, B:34:0x009d, B:36:0x00a0, B:38:0x00a6, B:49:0x00c2, B:50:0x00cc, B:52:0x00db, B:54:0x00e1, B:56:0x00e4, B:57:0x00ea, B:59:0x00ed, B:60:0x00ef, B:74:0x0114, B:75:0x011e, B:76:0x0126, B:51:0x00d4, B:21:0x007b), top: B:113:0x0071, inners: #3, #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:81:0x014a  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x014e  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 542
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.jvs.run():void");
            }
        });
    }

    @Override // androidx.car.app.hardware.ICarHardwareHost
    public final int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.hardware.ICarHardwareHost
    public final void subscribeCarHardwareResult(int i, Bundleable bundleable, ICarHardwareResult iCarHardwareResult) {
        this.a.n("subscribeCarHardwareResult", new isp(this, i, bundleable, iCarHardwareResult, 4));
    }

    @Override // androidx.car.app.hardware.ICarHardwareHost
    public final void unsubscribeCarHardwareResult(int i, Bundleable bundleable) {
        jvu jvuVar = this.a;
        if (!jvuVar.b) {
            ((ype) ((ype) jvu.c.h()).ai((char) 2781)).u("Accessed unsubscribeCarHardwareResult after host became invalidated");
        }
        ((ype) ((ype) jvu.c.f()).ai(2780)).K("%s unsubscribed to car hardware result with bundle type=%d", jvuVar.b(), i);
        if (i != 3 && i != 4 && i != 5 && i != 6) {
            switch (i) {
                case 20:
                case 21:
                case 22:
                case 23:
                    break;
                default:
                    throw new IllegalArgumentException("Attempted to unsubscribe from unsupported car hardware property.");
            }
        }
        try {
            jvv jvvVarF = jvuVar.e.f(i, ((Integer) (bundleable == null ? 1 : bundleable.a())).intValue());
            if (jvvVarF != null) {
                jwa.a().e(jvvVarF);
            }
        } catch (xr e) {
            throw new IllegalArgumentException("Incorrect format for parameter.", e);
        }
    }
}
