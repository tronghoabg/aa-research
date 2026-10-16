package defpackage;

import android.view.MotionEvent;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIconStyle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.List;

/* loaded from: classes.dex */
public final class tj {
    public final int a;
    public final Object b;
    public Object c;

    public tj(IconCompat iconCompat) {
        wh whVar = wh.a;
        iconCompat.getClass();
        whVar.b(iconCompat);
        this.a = 1;
        this.b = iconCompat;
        this.c = null;
    }

    @Deprecated
    public final void a(CarColor carColor) {
        wg.a.a(carColor);
        Object obj = this.c;
        if (obj == null) {
            tk tkVar = new tk();
            tkVar.b(carColor);
            this.c = tkVar.a();
        } else {
            tk tkVar2 = new tk((CarIconStyle) obj);
            tkVar2.b(carColor);
            this.c = tkVar2.a();
        }
    }

    public tj(List list, MotionEvent motionEvent, int i) {
        this.b = list;
        this.c = motionEvent;
        this.a = i;
    }
}
