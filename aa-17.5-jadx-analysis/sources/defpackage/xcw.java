package defpackage;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.os.IBinder;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.auto.components.externalkeyboard.phone.PhoneKeyboardActivity;
import com.google.android.gms.car.display.CarRegionId;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public abstract class xcw extends rlz implements eqa {
    public static final /* synthetic */ int r = 0;
    private static final yph s = yph.c("GH.CarWindowImeService");
    noh g;
    public EditorInfo h;
    public CarRegionId i;
    public boolean j;
    public boolean k;
    boolean l;
    public ajmd q;
    private final String t;
    public final gjt p = new gjt(this);
    int m = -1;
    public final IBinder n = new xcv(this);
    private final lhl u = new xcu(this);
    private final lis v = new lim(this, 2);
    final ykd o = new ykd(this, null);

    public xcw(String str) {
        this.t = str;
    }

    private final void i() {
        noh nohVar = this.g;
        if (nohVar == null) {
            ((ype) ((ype) s.h()).ai((char) 10121)).u("Attempting to remove InputMethodFragment host, but is already null");
        } else {
            nohVar.d();
            this.g = null;
        }
    }

    @Override // defpackage.rlz
    public final void b() {
        Sensor sensor;
        g(false);
        lbh.c().o(this.v);
        if (mig.a().c()) {
            ykd ykdVar = this.o;
            mig migVarA = mig.a();
            wer.c();
            ykdVar.getClass();
            migVarA.b();
            CopyOnWriteArrayList copyOnWriteArrayList = migVarA.e;
            if (copyOnWriteArrayList.remove(ykdVar) && copyOnWriteArrayList.isEmpty()) {
                SensorEventListener sensorEventListener = migVarA.d;
                if (sensorEventListener != null && (sensor = migVarA.c) != null) {
                    migVarA.b.unregisterListener(sensorEventListener, sensor);
                }
                migVarA.f = 1;
            }
        }
        lbh.d().d(this.u);
        this.j = false;
        mpl.a();
        i();
    }

    @Override // defpackage.rlz
    public final void c(EditorInfo editorInfo, CarRegionId carRegionId) {
        SensorEventListener sensorEventListener;
        Sensor sensor;
        this.h = editorInfo;
        this.i = carRegionId;
        if (!this.j && !lbh.d().gN()) {
            lbh.d().gK(this.u);
            this.j = true;
            return;
        }
        if (this.g != null) {
            i();
            g(false);
        }
        xdc xdcVarE = e();
        lbh.c().j(this.v);
        if (mig.a().c()) {
            ykd ykdVar = this.o;
            mig migVarA = mig.a();
            wer.c();
            ykdVar.getClass();
            migVarA.b();
            CopyOnWriteArrayList copyOnWriteArrayList = migVarA.e;
            int size = copyOnWriteArrayList.size();
            if (copyOnWriteArrayList.addIfAbsent(ykdVar)) {
                int i = migVarA.f;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i2 != 0) {
                    if (i2 == 1 || i2 == 2) {
                        mig.d(ykdVar, i);
                    }
                } else if (size == 0 && ((sensorEventListener = migVarA.d) == null || (sensor = migVarA.c) == null || !migVarA.b.registerListener(sensorEventListener, sensor, 3, 250000))) {
                    ((ype) ((ype) mig.a.h()).ai(4975)).y("Could not register for callback on sensor %s", migVarA.c);
                    copyOnWriteArrayList.remove(ykdVar);
                }
            }
        }
        try {
            nog nogVarB = nsh.b(xdcVarE.a(carRegionId), this.t, xdcVarE, this);
            nogVarB.e = new xct(this, editorInfo);
            this.g = nogVarB.a();
        } catch (qrz | qsa unused) {
            tss.q("GH.CarWindowImeService", "Unable to start input", new Object[0]);
        }
    }

    @Override // defpackage.rlz
    public final void d() {
        f();
    }

    public abstract xdc e();

    public final xdc f() {
        noh nohVar = this.g;
        if (nohVar == null) {
            return null;
        }
        return (xdc) nohVar.a();
    }

    public final void g(boolean z) {
        xdc xdcVarF;
        this.k = false;
        this.m++;
        ajmd ajmdVar = this.q;
        if (ajmdVar != null) {
            ((ype) PhoneKeyboardActivity.m.l().ai((char) 3729)).u("Asked by projected IME to detach");
            PhoneKeyboardActivity phoneKeyboardActivity = (PhoneKeyboardActivity) ajmdVar.a;
            phoneKeyboardActivity.u.c = true;
            phoneKeyboardActivity.finish();
            this.q = null;
        }
        if (!z || (xdcVarF = f()) == null) {
            return;
        }
        xdcVarF.b(false);
    }

    @Override // defpackage.eqa
    public final ept getLifecycle() {
        return (ept) this.p.b;
    }

    public final void h() {
        if (!this.l) {
            ((ype) s.l().ai((char) 10128)).u("maybeStartExternalKeyboard External keyboard has not been requested.");
            return;
        }
        if (this.k || this.q != null) {
            ((ype) s.l().ai((char) 10122)).u("maybeStartExternalKeyboard External keyboard is already running");
            return;
        }
        xdc xdcVarF = f();
        if (xdcVarF == null) {
            ((ype) s.l().ai((char) 10127)).u("maybeStartExternalKeyboard Fragment is null.");
            return;
        }
        if (xdcVarF.c) {
            ((ype) s.l().ai((char) 10126)).u("maybeStartExternalKeyboard Keyboard is locked due to car being in motion.");
            return;
        }
        if (lbh.c().e() == lir.a) {
            ((ype) s.l().ai((char) 10123)).y("maybeStartExternalKeyboard Car is not parked, parking state is: %s", lbh.c().e().name());
            return;
        }
        boolean z = mig.a().f == 2;
        ohs ohsVarJ = ebf.j();
        yzz yzzVar = yzz.KEYBOARD_EXTERNAL;
        ohsVarJ.o(yzzVar, z ? yzy.eK : yzy.eL);
        if (z) {
            return;
        }
        this.k = true;
        Context baseContext = leh.a().b() ? mki.a.c : getBaseContext();
        Intent intent = new Intent(baseContext, (Class<?>) PhoneKeyboardActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("IMEClass", getClass().getName());
        int i = this.m + 1;
        this.m = i;
        intent.putExtra("BinderClientId", i);
        intent.putExtra("ImeOptions", this.h.imeOptions);
        intent.putExtra("ImeHint", this.h.hintText);
        if (leh.a().b()) {
            baseContext.startActivity(intent, luk.c());
        } else {
            startActivity(intent, luk.c());
        }
        ebf.j().o(yzzVar, yzy.eF);
    }

    @Override // defpackage.rlz, android.app.Service
    public IBinder onBind(Intent intent) {
        this.p.p();
        if ("external_keyboard_action".equals(intent.getAction())) {
            return this.n;
        }
        if ("com.google.android.gms.car.BIND_CAR_INPUT".equals(intent.getAction())) {
            return this.e;
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        this.p.q();
        super.onCreate();
    }

    @Override // defpackage.rlz, android.app.Service
    public final void onDestroy() {
        this.p.r();
        b();
        this.a.removeCallbacksAndMessages(null);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        this.p.s();
        return super.onStartCommand(intent, i, i2);
    }
}
