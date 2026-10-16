package defpackage;

import android.os.Looper;
import android.os.WorkSource;
import android.util.Log;
import androidx.car.app.model.Alert;
import com.google.android.gms.location.LocationRequest;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class zvw extends zvt {
    static final LocationRequest a;
    public static final /* synthetic */ int e = 0;
    private static final String f = "zvw";
    public boolean b;
    public boolean c;
    public vgg d;
    private final xyc g;
    private final zvv h = new zvv(this);

    static {
        LocationRequest locationRequest = new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Alert.DURATION_SHOW_INDEFINITELY, BitmapDescriptorFactory.HUE_RED, true, 3600000L, 0, 0, false, new WorkSource(), null);
        if (locationRequest.i == locationRequest.b) {
            locationRequest.i = 5000L;
        }
        locationRequest.b = 5000L;
        locationRequest.c = 16L;
        a = locationRequest;
    }

    public zvw(xyc xycVar) {
        this.g = xycVar;
    }

    @Override // defpackage.vem
    public final void a(vgg vggVar) {
        zkt.g(this.d == null, "already activated");
        zkt.n(vggVar, "apiListener");
        this.d = vggVar;
        if (!this.b || this.c) {
            return;
        }
        d();
    }

    @Override // defpackage.vem
    public final void b() {
        zkt.g(this.d != null, "already activated");
        this.d = null;
        if (!this.b || this.c) {
            return;
        }
        f();
    }

    @Override // defpackage.zvt
    public final void c() {
        if (this.b && this.d != null) {
            d();
        }
        this.c = false;
    }

    public final void d() {
        str strVar;
        int i = 6;
        try {
            xyc xycVar = this.g;
            if (xycVar == null || (strVar = (str) xycVar.gu()) == null) {
                return;
            }
            LocationRequest locationRequest = a;
            zvv zvvVar = this.h;
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == null) {
                mainLooper = Looper.myLooper();
                spu.ax(mainLooper, "invalid null looper");
            }
            smr smrVarH = uqw.H(zvvVar, mainLooper, std.class.getSimpleName());
            stq stqVar = new stq(strVar, smrVarH, new stn(0));
            qoq qoqVar = new qoq(stqVar, locationRequest, i);
            smx smxVar = new smx();
            smxVar.a = qoqVar;
            smxVar.b = stqVar;
            smxVar.c = smrVarH;
            smxVar.f = 2436;
            strVar.x(smxVar.a());
        } catch (SecurityException e2) {
            String str = f;
            if (zrn.e(str, 6)) {
                Log.e(str, "Location unable to be retrieved: ".concat(e2.toString()));
            }
            throw e2;
        }
    }

    public final void f() {
        str strVar;
        xyc xycVar = this.g;
        if (xycVar == null || (strVar = (str) xycVar.gu()) == null) {
            return;
        }
        strVar.v(uqw.G(this.h, std.class.getSimpleName()), 2418).a(new oyd(2), new stm(1));
    }
}
