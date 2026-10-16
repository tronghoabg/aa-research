package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class mpi {
    public static final mpg a;
    public final Runnable b;
    public final mpg c;
    private final Context d;
    private final sab e;
    private final Rect f;
    private final int g;
    private final UUID h;
    private final List i = new ArrayList();

    static {
        yph.c("GH.ScrimWithAHole");
        mpf mpfVarQ = mpg.q();
        mpfVarQ.e(true);
        mpfVarQ.d(true);
        mpfVarQ.f(true);
        mpfVarQ.g(true);
        mpfVarQ.c(false);
        mpfVarQ.b(true);
        a = mpfVarQ.a();
    }

    public mpi(Context context, sab sabVar, Rect rect, int i, UUID uuid, Runnable runnable, mpg mpgVar) {
        this.d = context;
        this.e = sabVar;
        this.f = rect;
        this.g = i;
        this.h = uuid;
        this.b = runnable;
        this.c = mpgVar;
    }

    @ResultIgnorabilityUnspecified
    public static mpi a(Context context, sab sabVar, Rect rect, int i, UUID uuid, Runnable runnable, mpg mpgVar) {
        mpi mpiVar = new mpi(context, sabVar, rect, i, uuid, runnable, mpgVar);
        mpiVar.c(mpgVar);
        return mpiVar;
    }

    private final void d(CarWindowLayoutParams carWindowLayoutParams, final GradientDrawable.Orientation orientation) {
        rby rbyVar = new rby() { // from class: mph
            @Override // defpackage.rby
            public final View a(Context context) {
                View view = new View(context);
                mpi mpiVar = this.a;
                view.setOnTouchListener(new jzt(mpiVar, 3, null));
                if (mpiVar.c.e) {
                    GradientDrawable.Orientation orientation2 = orientation;
                    int i = true != olm.b(context) ? 255 : 0;
                    int[] iArr = {Color.argb(229, i, i, i), Color.argb(153, i, i, i), 0};
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setOrientation(orientation2);
                    if (Build.VERSION.SDK_INT >= 29) {
                        gradientDrawable.setColors(iArr, new float[]{BitmapDescriptorFactory.HUE_RED, 0.3f, 1.0f});
                    } else {
                        gradientDrawable.setColors(iArr);
                    }
                    view.setBackground(gradientDrawable);
                }
                return view;
            }
        };
        this.e.f(rbyVar, "scrim", this.d, carWindowLayoutParams, 0);
        this.i.add(rbyVar);
    }

    public final void b() {
        List list = this.i;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.e.i((rby) it.next());
        }
        list.clear();
    }

    public final void c(mpg mpgVar) {
        sab sabVar = this.e;
        sabVar.getClass();
        Point point = (Point) kgq.c(new kiz(sabVar, 3), "GH.ScrimWithAHole", yzz.SCRIM_WITH_A_HOLE_CONTEXT, yzy.lR, true, "Car no longer connected.", new Object[0]);
        int i = point.y;
        int i2 = point.x;
        int i3 = true != mpgVar.f ? 64 : 0;
        if (mpgVar.b) {
            qsw qswVar = new qsw(i2, this.f.top, this.h);
            qswVar.f = 48;
            qswVar.l = true;
            qswVar.g = this.g;
            qswVar.m = i3;
            d(qswVar.a(), GradientDrawable.Orientation.TOP_BOTTOM);
        }
        if (mpgVar.d) {
            qsw qswVar2 = new qsw(i2, i - this.f.bottom, this.h);
            qswVar2.f = 80;
            qswVar2.l = true;
            qswVar2.g = this.g;
            qswVar2.m = i3;
            d(qswVar2.a(), GradientDrawable.Orientation.BOTTOM_TOP);
        }
        if (mpgVar.a) {
            qsw qswVar3 = new qsw(this.f.left, i, this.h);
            qswVar3.f = 51;
            qswVar3.l = true;
            qswVar3.g = this.g;
            qswVar3.m = i3;
            d(qswVar3.a(), GradientDrawable.Orientation.LEFT_RIGHT);
        }
        if (mpgVar.c) {
            qsw qswVar4 = new qsw(i2 - this.f.right, i, this.h);
            qswVar4.f = 53;
            qswVar4.l = true;
            qswVar4.g = this.g;
            qswVar4.m = i3;
            d(qswVar4.a(), GradientDrawable.Orientation.RIGHT_LEFT);
        }
        this.f.toShortString();
    }
}
