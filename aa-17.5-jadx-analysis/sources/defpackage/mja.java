package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import com.google.android.apps.auto.components.radio.RadioMediaBrowserService;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.RadioProgramSelector;
import com.google.android.gms.car.display.CarDisplay;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class mja implements kiy {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ mja(qrn qrnVar, String str, int i) {
        this.d = i;
        this.c = qrnVar;
        this.a = "driver_position_setting_key";
        this.b = str;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, qyb] */
    @Override // defpackage.kiy
    public final void a() throws Resources.NotFoundException, qrz {
        int i = this.d;
        if (i == 0) {
            yph yphVar = RadioMediaBrowserService.g;
            Object obj = this.b;
            Object obj2 = this.a;
            try {
                if (omc.c("CAR.RADIO", 3)) {
                    rrd.a("CAR.RADIO", null, "tune()");
                }
                try {
                    ((qsb) obj2).a.w((RadioProgramSelector) obj);
                    return;
                } catch (RemoteException e) {
                    olm.h(e);
                    return;
                } catch (IllegalStateException e2) {
                    olm.f(e2);
                    return;
                }
            } catch (qrz e3) {
                ((dnw) this.c).d(e3);
                throw e3;
            }
        }
        if (i != 1) {
            if (i == 2) {
                mki.a.g();
                ols.D((qrn) this.c, (String) this.a, (String) this.b);
                return;
            }
            if (i == 3) {
                yph yphVar2 = mme.a;
                mki.a.g();
                ols.D((qrn) this.c, (String) this.a, (String) this.b);
                return;
            }
            if (i == 4) {
                nso nsoVar = (nso) this.c;
                nsoVar.y((CarDisplay) this.b, nsoVar.s.c());
                lxw.E().c(nsoVar.o);
                yx yxVar = new yx((yy) nsoVar.x);
                while (yxVar.hasNext()) {
                    ((nsg) yxVar.next()).a((qrn) this.a, nsoVar);
                }
                return;
            }
            if (i != 5) {
                nog nogVarB = nsh.b((CarWindowLayoutParams) this.b, "GhNotificationCenter", (Fragment) this.c, lbh.d());
                Object obj3 = this.a;
                nogVarB.e = obj3;
                nogVarB.f = true != leh.a().b() ? sk.AUDIO_CONTENT_BUFFER_SIZE : 0;
                ((nxo) obj3).e = nogVarB.a();
                mpe.a();
                return;
            }
            yno it = ((yfy) this.b).entrySet().iterator();
            while (it.hasNext()) {
                Object obj4 = this.c;
                Map.Entry entry = (Map.Entry) it.next();
                nsn nsnVar = (nsn) entry.getKey();
                nso nsoVar2 = (nso) obj4;
                Rect rectI = nsoVar2.i(nsnVar);
                if (!((Rect) entry.getValue()).equals(rectI)) {
                    Iterator it2 = ((yby) nsoVar2.z).c(nsnVar).iterator();
                    while (it2.hasNext()) {
                        ((nsk) it2.next()).a((qrn) this.a, nsnVar, rectI);
                    }
                }
            }
            return;
        }
        ((ype) mhv.a.l().ai(4962)).y("Sending %s", this.a);
        Object obj5 = this.b;
        Object obj6 = this.c;
        try {
            synchronized (obj6) {
                rol rolVar = ((mhv) obj6).h;
                if (rolVar != null) {
                    byte[] bArrH = ((abmd) obj5).h();
                    int length = bArrH.length;
                    if (omc.c("CAR.VENDOR", 3)) {
                        rrd.d(3, "CAR.VENDOR", null, "sendData. length=%d", Integer.valueOf(length));
                    }
                    if (rolVar.c == null) {
                        if (omc.c("CAR.VENDOR", 3)) {
                            rrd.a("CAR.VENDOR", null, "No output stream. Getting an output fd from service");
                        }
                        try {
                            try {
                                rolVar.c = new ParcelFileDescriptor.AutoCloseOutputStream(rolVar.a.f(rolVar.f));
                            } catch (IllegalStateException e4) {
                                olm.f(e4);
                            }
                        } catch (RemoteException e5) {
                            rolVar.a(e5);
                        }
                    } else if (omc.c("CAR.VENDOR", 3)) {
                        rrd.a("CAR.VENDOR", null, "Using the existing output stream");
                    }
                    try {
                        try {
                            rolVar.a.l(rolVar.f, length);
                        } catch (IllegalStateException e6) {
                            olm.f(e6);
                        }
                    } catch (RemoteException e7) {
                        rolVar.a(e7);
                    }
                    int i2 = 0;
                    while (length > 0) {
                        int iMin = Math.min(length, 32768);
                        if (omc.c("CAR.VENDOR", 3)) {
                            rrd.d(3, "CAR.VENDOR", null, "sendData writing %d bytes", Integer.valueOf(iMin));
                        }
                        rolVar.c.write(bArrH, i2, iMin);
                        try {
                            try {
                                rolVar.a.j(rolVar.f, iMin);
                            } catch (IllegalStateException e8) {
                                olm.f(e8);
                            }
                        } catch (RemoteException e9) {
                            rolVar.a(e9);
                        }
                        length -= iMin;
                        i2 += iMin;
                    }
                    if (omc.c("CAR.VENDOR", 3)) {
                        rrd.a("CAR.VENDOR", null, "sendData done");
                    }
                }
            }
        } catch (IOException e10) {
            ((ype) ((ype) ((ype) mhv.a.h()).p(e10)).ai((char) 4963)).u("IO exception");
        }
    }

    public /* synthetic */ mja(Object obj, String str, Object obj2, int i) {
        this.d = i;
        this.c = obj;
        this.a = str;
        this.b = obj2;
    }

    public /* synthetic */ mja(nso nsoVar, Object obj, qrn qrnVar, int i) {
        this.d = i;
        this.c = nsoVar;
        this.b = obj;
        this.a = qrnVar;
    }

    public /* synthetic */ mja(Object obj, AbstractSafeParcelable abstractSafeParcelable, Object obj2, int i) {
        this.d = i;
        this.a = obj;
        this.b = abstractSafeParcelable;
        this.c = obj2;
    }
}
