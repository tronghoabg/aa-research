package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.car.bluetooth.data.CarBluetoothData;
import com.google.android.gms.car.diagnostics.CriticalError;
import com.google.android.gms.carsetup.CarInfoInternal;
import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class qsr extends qtg {
    public static final ypf a = ols.R("CAR.LITE");
    public final sgq b;
    public final rtf c;
    public final Handler d;
    public final qsq e;
    public final Context f;
    public long g;
    public ruw h;
    public boolean i;
    public boolean j;
    private final ria l;
    private final int m;
    private final int n;
    private final Closeable o;
    private final boolean p;
    private final CarBluetoothData q;
    private final CarInfoInternal r;
    private boolean s;

    public qsr(Context context, int i, int i2, Closeable closeable, CarInfoInternal carInfoInternal, boolean z, CarBluetoothData carBluetoothData, qsk qskVar) {
        sss sssVar = new sss(context.getMainLooper());
        ria riaVar = new ria();
        super(qskVar);
        this.c = new run(true);
        this.e = new qsq(this);
        this.f = context;
        this.d = sssVar;
        this.l = riaVar;
        riaVar.start();
        this.b = new sgx(context, new sss(riaVar), new imq(20), new wyd(this, null), carInfoInternal != null ? carInfoInternal.a : null);
        ypf ypfVar = rsi.a;
        this.m = i;
        this.n = i2;
        this.o = closeable;
        this.r = carInfoInternal;
        this.p = z;
        this.q = carBluetoothData;
    }

    @Override // defpackage.qtg, defpackage.qsk
    public final void d(PrintWriter printWriter) {
        super.d(printWriter);
        printWriter.println();
        printWriter.println("CarServiceBinderLite");
        printWriter.print("connectionType: ");
        printWriter.println(this.m);
        printWriter.print("sessionId: ");
        printWriter.println(this.g);
        printWriter.print("analyticsSessionId: ");
        printWriter.println(this.n);
        printWriter.print("userAuthorized: ");
        printWriter.println(this.j);
        printWriter.print("resumeComplete: ");
        printWriter.println(this.i);
    }

    @Override // defpackage.qtg, defpackage.qsk
    public final void f(CriticalError criticalError) {
        a.f().ai(7879).u("Car disconnected");
        this.b.a();
        p(criticalError);
    }

    @Override // defpackage.qtg, defpackage.qsk
    public final void j() {
        this.l.quit();
        super.j();
    }

    public final void m() {
        this.g = 0L;
        this.h = null;
        this.i = false;
        this.j = false;
        qsu.d();
        qsq qsqVar = this.e;
        qsqVar.a = false;
        qsqVar.b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qsr.o():void");
    }

    public final void p(CriticalError criticalError) {
        this.g = 0L;
        try {
            this.o.close();
        } catch (IOException e) {
            a.g().p(e).ai(7885).u("Impossible");
        }
        a().f(criticalError);
        m();
    }
}
