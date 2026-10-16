package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Size;
import android.view.VelocityTracker;
import com.google.android.gms.car.ProjectionWindowDragParams;
import java.util.List;

/* loaded from: classes2.dex */
public final class jhp {
    public static final yph a = yph.c("CAR.WM.Drag");
    public static final jhn b = new jhn();
    public final ProjectionWindowDragParams c;
    public final qzy d;
    public final jho e;
    public final List f;
    public final List g;
    public final int h;
    public final float i;
    public int j;
    public Point k;
    public Point l;
    public boolean m;
    public VelocityTracker n;
    public int o;
    public int p;
    public emp q;
    public int r;
    public int s;
    private final Size t;
    private final int u;

    /* JADX WARN: Multi-variable type inference failed */
    public jhp(Context context, ProjectionWindowDragParams projectionWindowDragParams, jho jhoVar, Size size, int i, int i2) {
        qzy qzwVar;
        context.getClass();
        projectionWindowDragParams.getClass();
        IBinder iBinder = projectionWindowDragParams.c;
        if (iBinder == null) {
            qzwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.IProjectionWindowDragCallback");
            qzwVar = iInterfaceQueryLocalInterface instanceof qzy ? (qzy) iInterfaceQueryLocalInterface : new qzw(iBinder);
        }
        this.c = projectionWindowDragParams;
        this.d = qzwVar;
        this.e = jhoVar;
        this.t = size;
        this.u = i;
        yfq yfqVarD = d();
        yfqVarD.getClass();
        this.f = woy.cb(yfqVarD);
        yfq yfqVarD2 = d();
        yfqVarD2.getClass();
        this.g = woy.cc(yfqVarD2, afcf.a);
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.densityDpi = i;
        configuration.screenWidthDp = (int) dlz.G(size.getWidth(), i);
        configuration.screenHeightDp = (int) dlz.G(size.getHeight(), i);
        context.createConfigurationContext(configuration).getClass();
        this.h = (int) dlz.F(16, i);
        this.i = (i / 160.0f) * 100.0f;
        this.j = -1;
        this.k = new Point(0, 0);
        this.l = new Point(0, 0);
        yfq yfqVarD3 = d();
        yfqVarD3.getClass();
        Integer num = !yfqVarD3.isEmpty() ? (Integer) d().get(afpt.e(i2, 0)) : 0;
        num.getClass();
        this.o = num.intValue();
        this.s = -1;
    }

    public final float a(float f) {
        float f2 = this.i;
        return (f * f2) / (f + f2);
    }

    public final float b(float f) {
        float f2 = this.i;
        float fC = afpt.c(f, (-0.001f) + f2);
        return (fC * f2) / (f2 - fC);
    }

    public final int c() {
        return d().indexOf(Integer.valueOf(this.r));
    }

    public final yfq d() {
        return this.c.a();
    }

    public final void e(int i) {
        emp empVar = new emp(this, b, i);
        emq emqVar = empVar.s;
        if (emqVar != null) {
            emqVar.e(200.0f);
        }
        emq emqVar2 = empVar.s;
        if (emqVar2 != null) {
            emqVar2.c(1.0f);
        }
        empVar.g(new jhm(this, i, 1));
        empVar.e();
        this.q = empVar;
    }

    public final void f() {
        if (Math.abs(this.o - this.s) > 10) {
            try {
                qzy qzyVar = this.d;
                if (qzyVar != null) {
                    qzyVar.f(this.o);
                }
                this.s = this.o;
            } catch (RemoteException unused) {
                ((ype) a.h()).u("RemoteException when notifying client of drag progress");
            }
        }
    }

    public final void g(int i) {
        this.e.aH();
        try {
            qzy qzyVar = this.d;
            if (qzyVar != null) {
                qzyVar.e(i);
            }
        } catch (RemoteException unused) {
            ((ype) a.h()).u("RemoteException when notifying client of drag");
        }
    }

    public final int h() {
        int i = this.c.a;
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 1;
        }
        throw new IllegalArgumentException();
    }
}
