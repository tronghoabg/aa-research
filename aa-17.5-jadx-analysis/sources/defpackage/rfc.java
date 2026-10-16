package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.RemoteException;
import android.util.Pair;
import android.util.SparseArray;
import android.view.KeyEvent;
import com.google.android.gms.car.CarWindowManagerLayoutParams;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.InputFocusChangedEvent;
import com.google.android.gms.car.KeyEventCompleteData;
import com.google.android.gms.car.control.CarPropertyState;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class rfc implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ rfc(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, rmi] */
    /* JADX WARN: Type inference failed for: r15v35, types: [afck, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, rfb] */
    /* JADX WARN: Type inference failed for: r15v45, types: [android.os.IBinder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, rfd] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.Callable] */
    @Override // java.lang.Runnable
    public final void run() throws PackageManager.NameNotFoundException {
        int i;
        Object[] objArr;
        rom romVar;
        boolean zBooleanValue;
        ror rorVar;
        Pair pairC;
        int i2 = 6;
        int i3 = 4;
        int i4 = 5;
        int i5 = 2;
        int i6 = 3;
        Rect rect = null;
        int i7 = 0;
        switch (this.c) {
            case 0:
                this.a.a((ots) this.b);
                return;
            case 1:
                ott ottVar = ((ots) this.b).f;
                if (ottVar == null) {
                    ottVar = ott.a;
                }
                int i8 = ottVar.f;
                if ((ottVar.b & 4096) != 0) {
                    otz otzVar = ottVar.o;
                    if (otzVar == null) {
                        otzVar = otz.a;
                    }
                    i = otzVar.c;
                } else {
                    i = 0;
                }
                abpt abptVar = ottVar.c;
                if (abptVar == null) {
                    abptVar = abpt.a;
                }
                rzj rzjVar = (rzj) this.a;
                rzjVar.l();
                rzj rzjVarA = rzjVar.a("start_time", abqu.f(abptVar));
                abpt abptVar2 = ottVar.d;
                if (abptVar2 == null) {
                    abptVar2 = abpt.a;
                }
                rzjVarA.a("end_time", uqw.S(abptVar2, abptVar)).a("bytes_sent", Integer.valueOf(ottVar.e)).a("frames_sent", Integer.valueOf(i8));
                if (i8 > 0) {
                    rzjVar.a("frame size", Integer.valueOf(ottVar.e / i8)).c("frames acked", "%d (%.2f%%)", Integer.valueOf(i), Float.valueOf((i * 100.0f) / i8));
                } else {
                    rzjVar.a("frames acked", Integer.valueOf(i));
                }
                rzjVar.a("acks_dropped", Integer.valueOf(ottVar.g)).a("max_unacked_frames", Integer.valueOf(ottVar.h)).a("media_underflows", Integer.valueOf(ottVar.i));
                if ((ottVar.b & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                    otz otzVar2 = ottVar.l;
                    if (otzVar2 == null) {
                        otzVar2 = otz.a;
                    }
                    rzjVar.a("encoding_time_stats", uqw.P(otzVar2));
                }
                if ((ottVar.b & 4096) != 0) {
                    otz otzVar3 = ottVar.o;
                    if (otzVar3 == null) {
                        otzVar3 = otz.a;
                    }
                    rzjVar.a("ack_latency_stats", uqw.P(otzVar3));
                }
                if ((ottVar.b & 2048) != 0) {
                    otz otzVar4 = ottVar.n;
                    if (otzVar4 == null) {
                        otzVar4 = otz.a;
                    }
                    rzjVar.a("queue_time_stats", uqw.P(otzVar4));
                }
                if ((ottVar.b & 32768) != 0) {
                    oua ouaVar = ottVar.q;
                    if (ouaVar == null) {
                        ouaVar = oua.a;
                    }
                    rzjVar.a("available_frame_count_stats", uqw.R(ouaVar));
                }
                rzjVar.d("dropped_frames_entries", ottVar.r, new rey(rzjVar, abptVar, i7));
                return;
            case 2:
                this.a.a((oub) this.b);
                return;
            case 3:
                Object obj = this.b;
                oub oubVar = (oub) obj;
                oue oueVar = oubVar.f;
                if (oueVar == null) {
                    oueVar = oue.a;
                }
                abpt abptVar3 = oueVar.c;
                if (abptVar3 == null) {
                    abptVar3 = abpt.a;
                }
                Object obj2 = this.a;
                rzj rzjVar2 = (rzj) obj2;
                rzjVar2.l();
                rzjVar2.a("session_id", Integer.valueOf(oubVar.c)).a("previous_diagnostics_message_count", Integer.valueOf(oubVar.d)).a("num_active_services", Integer.valueOf(oubVar.e)).b("stats", new rfc(obj2, obj, i3)).a("events count", Integer.valueOf(oubVar.g.size())).a("events dropped", Integer.valueOf(oubVar.h)).d("events", oubVar.g, new rey(rzjVar2, abptVar3, i5));
                return;
            case 4:
                oue oueVar2 = ((oub) this.b).f;
                if (oueVar2 == null) {
                    oueVar2 = oue.a;
                }
                Object obj3 = this.a;
                ((rzj) obj3).f("MicrophoneSessionStats", new rfc(obj3, oueVar2, i2));
                return;
            case 5:
                oue oueVar3 = (oue) this.b;
                abms abmsVar = oueVar3.j;
                if (abmsVar.B()) {
                    return;
                }
                StringBuilder sb = new StringBuilder(abmsVar.d());
                abmo it = abmsVar.iterator();
                while (it.hasNext()) {
                    if (((Byte) it.next()).byteValue() == -128) {
                        sb.append('.');
                    } else {
                        double dFloor = Math.floor(((r4 + 127) * 4.5d) / 127.0d);
                        woy.Z(dFloor >= 0.0d);
                        woy.Z(dFloor <= 9.0d);
                        sb.append(Character.forDigit((int) dFloor, 10));
                    }
                }
                rzj rzjVar3 = (rzj) this.a;
                rzjVar3.l();
                rzjVar3.c("histogram", "[%s]", sb).c("histogram raw bytes", "[%s]", new xxd(", ").b(abmsVar));
                int i9 = oueVar3.k;
                if (i9 > 0) {
                    rzjVar3.a("frames dropped from the histogram", Integer.valueOf(i9));
                    return;
                }
                return;
            case 6:
                Object obj4 = this.b;
                oue oueVar4 = (oue) obj4;
                abpt abptVar4 = oueVar4.c;
                if (abptVar4 == null) {
                    abptVar4 = abpt.a;
                }
                Object obj5 = this.a;
                rzj rzjVar4 = (rzj) obj5;
                rzjVar4.l();
                rzj rzjVarA2 = rzjVar4.a("start_time", abqu.f(abptVar4));
                abpt abptVar5 = oueVar4.d;
                if (abptVar5 == null) {
                    abptVar5 = abpt.a;
                }
                rzjVarA2.a("end_time", uqw.S(abptVar5, abptVar4)).a("bytes_received", Integer.valueOf(oueVar4.f)).a("frames_received", Integer.valueOf(oueVar4.e)).a("empty_frames_received", Integer.valueOf(oueVar4.i));
                int i10 = oueVar4.e;
                if (i10 > 0) {
                    rzjVar4.c("empty frames percentage", "%.2f%%", Float.valueOf((oueVar4.i * 100.0f) / i10)).a("frame size", Integer.valueOf(oueVar4.f / oueVar4.e));
                }
                if ((oueVar4.b & 16) != 0) {
                    otz otzVar5 = oueVar4.g;
                    if (otzVar5 == null) {
                        otzVar5 = otz.a;
                    }
                    rzjVar4.a("frame latency stats", uqw.P(otzVar5));
                }
                if ((oueVar4.b & 32) != 0) {
                    oua ouaVar2 = oueVar4.h;
                    if (ouaVar2 == null) {
                        ouaVar2 = oua.a;
                    }
                    rzjVar4.a("frame volume stats", uqw.R(ouaVar2));
                }
                rzjVar4.b("frame volume info", new rfc(obj5, obj4, 7)).d("dropped_frames_entries", oueVar4.l, new rey(rzjVar4, abptVar4, i6));
                return;
            case 7:
                Object obj6 = this.b;
                Object obj7 = this.a;
                ((rzj) obj7).e(new rfc(obj6, obj7, i4, null == true ? 1 : 0));
                return;
            case 8:
                rhg.a.l().ai(8159).u("mProfileUtil initialized");
                ((ykd) this.b).x(((rhg) this.a).o);
                return;
            case 9:
                Object obj8 = this.a;
                obj8.getClass();
                ((eqj) ((ajmd) this.b).a).m(obj8);
                return;
            case 10:
                Object obj9 = this.a;
                obj9.getClass();
                ((kkh) ((ajmd) this.b).a).a(kkg.a((CarPropertyState) obj9));
                return;
            case 11:
                this.b.getClass();
                ((rir) this.a).a.a.w(new aezw(afak.a));
                return;
            case 12:
                Object obj10 = this.a;
                if (((rmb) obj10).a) {
                    if (omc.c("CAR.CLIENT.IME", 3)) {
                        rrd.a("CAR.CLIENT.IME", null, "CarEditableListener#onUpdateSelection");
                    }
                    ((rlz) this.b).d();
                    return;
                } else {
                    if (omc.c("CAR.CLIENT.IME", 3)) {
                        rrd.d(3, "CAR.CLIENT.IME", null, "This listener (%s) is not valid.", obj10);
                        return;
                    }
                    return;
                }
            case 13:
                ((rlz) this.b).b = this.a;
                return;
            case 14:
                try {
                    ((rmk) this.b).b = ((Boolean) this.a.call()).booleanValue();
                    return;
                } catch (Exception e) {
                    ((rmk) this.b).b = false;
                    throw new RuntimeException("Input connection action failed", e);
                }
            case 15:
                SparseArray sparseArray = rnw.a;
                ror rorVar2 = ((rnw) this.a).k;
                if (rorVar2 != null) {
                    rorVar2.w(((CarWindowManagerLayoutParams) this.b).a);
                    return;
                }
                return;
            case 16:
                SparseArray sparseArray2 = rnw.a;
                qqh qqhVar = ((rnw) this.a).I;
                if (qqhVar != 0) {
                    qqhVar.s(this.b);
                    return;
                }
                return;
            case 17:
                SparseArray sparseArray3 = rnw.a;
                Object obj11 = this.a;
                rnw rnwVar = (rnw) obj11;
                if (rnwVar.y() && rnwVar.I != null) {
                    if (rnwVar.F == 5) {
                        rnwVar.n(4, false);
                        objArr = true;
                    } else {
                        objArr = false;
                    }
                    if (rnwVar.F == 4 || rnwVar.F == 3) {
                        rnwVar.I.e((Intent) this.b);
                        ols olsVar = rnwVar.K;
                    } else {
                        rrd.d(6, "CAR.PROJECTION.CAHI", null, "%s onNewIntent not sent, activity is in state: %s", rnwVar.t, rnw.a.get(rnwVar.F));
                    }
                    if (objArr != false) {
                        rnwVar.n(5, false);
                    }
                    try {
                        qxy qxyVar = ((rnw) obj11).i;
                        if (qxyVar != null) {
                            qxyVar.m();
                            return;
                        }
                        return;
                    } catch (RemoteException unused) {
                        rnwVar.t();
                        return;
                    }
                }
                return;
            case 18:
                Object obj12 = this.b;
                Object obj13 = this.a;
                if (rrd.e("CAR.PROJECTION.CAHI", 2)) {
                    SparseArray sparseArray4 = rnw.a;
                    rrd.d(2, "CAR.PROJECTION.CAHI", null, "%s onInputFocusChange() runOnMain onInputFocusChange(event:%s, callback:%b)", ((rnw) obj13).t, obj12, true);
                }
                SparseArray sparseArray5 = rnw.a;
                ((rnw) obj13).o((InputFocusChangedEvent) obj12, true);
                return;
            case 19:
                SparseArray sparseArray6 = rnw.a;
                Object obj14 = this.b;
                rnw rnwVar2 = (rnw) this.a;
                DrawingSpec drawingSpec = (DrawingSpec) obj14;
                rnwVar2.B = drawingSpec;
                if (rnwVar2.I == null) {
                    if (omc.c("CAR.PROJECTION.CAHI", 3)) {
                        rrd.d(3, "CAR.PROJECTION.CAHI", null, "%s Null activity while reattaching", rnwVar2.t);
                        return;
                    }
                    return;
                }
                rnwVar2.m(drawingSpec);
                rnwVar2.k.j();
                rnwVar2.s(drawingSpec);
                rnwVar2.b(rnwVar2.s);
                qxy qxyVar2 = rnwVar2.i;
                if (qxyVar2 != null) {
                    try {
                        qxyVar2.u();
                        return;
                    } catch (RemoteException unused2) {
                        rbe.h(rnwVar2.d);
                        return;
                    }
                }
                return;
            default:
                Object obj15 = this.a;
                rnw rnwVar3 = (rnw) obj15;
                if (rnwVar3.I != null) {
                    Object obj16 = this.b;
                    if (!rnwVar3.y() || (rorVar = rnwVar3.k) == null || (pairC = rorVar.c((KeyEvent) obj16)) == null) {
                        romVar = null;
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = ((Boolean) pairC.first).booleanValue();
                        romVar = (rom) pairC.second;
                    }
                    if (zBooleanValue) {
                        ols olsVar2 = rnwVar3.K;
                        return;
                    }
                    if (omc.c("CAR.PROJECTION.CAHI", 3)) {
                        KeyEvent keyEvent = (KeyEvent) obj16;
                        rrd.d(3, "CAR.PROJECTION.CAHI", null, "%s Couldn't inject (%d,%d)", rnwVar3.t, Integer.valueOf(keyEvent.getKeyCode()), Integer.valueOf(keyEvent.getAction()));
                    }
                    try {
                        if (((rnw) obj15).i != null) {
                            if (!((rnw) obj15).w.p(raj.L)) {
                                ((rnw) obj15).i.k(false);
                                return;
                            }
                            if (romVar != null) {
                                rect = romVar.c;
                            }
                            ((rnw) obj15).i.j(new KeyEventCompleteData(false, rect));
                            return;
                        }
                        return;
                    } catch (RemoteException unused3) {
                        rnwVar3.t();
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ rfc(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public rfc(rmk rmkVar, Callable callable, int i) {
        this.c = i;
        this.a = callable;
        this.b = rmkVar;
    }
}
