package defpackage;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.google.android.projection.gearhead.GhApplication;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class qel implements aezk {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ qel(Context context, Object obj, int i) {
        this.c = i;
        this.a = context;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.aezk, defpackage.aezj
    public final Object a() {
        String name;
        switch (this.c) {
            case 0:
                int i = qer.g;
                return new qir(this.a, (lwj) this.b.gu());
            case 1:
                Context context = this.a;
                int i2 = qer.g;
                Context applicationContext = context.getApplicationContext();
                mjv.a();
                ymp ympVar = new ymp((mjr) mki.a.b(mjr.class, new may(5)));
                applicationContext.getClass();
                ?? r7 = this.b;
                r7.getClass();
                ArrayList arrayList = new ArrayList(woy.bp(ympVar, 10));
                yno it = ympVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(((tlk) it.next()).a);
                }
                aiji.b(r7);
                wub.v(ympVar);
                String string = Settings.Global.getString(applicationContext.getContentResolver(), "device_name");
                if ((string == null || string.length() == 0) && (((string = Settings.System.getString(applicationContext.getContentResolver(), "device_name")) == null || string.length() == 0) && (((string = Settings.System.getString(applicationContext.getContentResolver(), "bluetooth_name")) == null || string.length() == 0) && ((string = Settings.Secure.getString(applicationContext.getContentResolver(), "bluetooth_name")) == null || string.length() == 0)))) {
                    if (applicationContext.checkSelfPermission("android.permission.BLUETOOTH_CONNECT") == 0) {
                        Object systemService = applicationContext.getSystemService("bluetooth");
                        systemService.getClass();
                        name = ((BluetoothManager) systemService).getAdapter().getName();
                    } else {
                        name = null;
                    }
                    string = name;
                    if (string == null || string.length() == 0) {
                        string = Build.MODEL;
                        string.getClass();
                    }
                }
                string.getClass();
                yfq yfqVarR = yfq.r(new tlt("com.google.android.libraries.car.remote.apps"), new tlt("com.google.android.libraries.car.remote.notification"));
                new tlr();
                ArrayList arrayList2 = new ArrayList(woy.bp(yfqVarR, 10));
                ynp ynpVarListIterator = yfqVarR.listIterator(0);
                while (ynpVarListIterator.hasNext()) {
                    arrayList2.add(((tlt) ynpVarListIterator.next()).a);
                }
                if (woy.cl(arrayList2).size() == ((yls) yfqVarR).c) {
                    return new tlr();
                }
                throw new IllegalArgumentException("Endpoint ids must be unique");
            case 2:
                int i3 = qer.g;
                kyk kykVar = new kyk(new laf());
                Context context2 = this.a;
                return new kyw(context2, kykVar, new kzh(context2), this.b, new ixx(context2, 3));
            case 3:
                int i4 = qer.g;
                return new mbm(this.a, (yfq) this.b);
            case 4:
                int i5 = qer.g;
                return new oql(this.a, (oqg) this.b.gu());
            case 5:
                int i6 = qer.g;
                return new oiv(this.a, this.b);
            case 6:
                int i7 = qer.g;
                return new lwg(this.a, ebf.j(), (mbp) this.b.gu());
            case 7:
                int i8 = qer.g;
                return new lvd(this.a, (Class) this.b);
            case 8:
                int i9 = qew.g;
                return new mbm(this.a, (yfq) this.b);
            case 9:
                int i10 = GhApplication.b;
                return new kmr(this.b, this.a);
            default:
                int i11 = GhApplication.b;
                return new kmr(this.b, this.a);
        }
    }

    public /* synthetic */ qel(Executor executor, Context context, int i) {
        this.c = i;
        this.b = executor;
        this.a = context;
    }
}
