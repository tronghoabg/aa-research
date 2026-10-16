package defpackage;

import android.util.Log;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.MessageTemplate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class um {
    public boolean a;
    public CarText b;
    public final CarText c;
    public CarText d;
    public CarIcon e;
    public Action f;
    public ActionStrip g;
    public final List h = new ArrayList();
    public Throwable i;
    public String j;
    public Header k;

    public um(CharSequence charSequence) {
        charSequence.getClass();
        this.c = CarText.create(charSequence);
    }

    public final MessageTemplate a() {
        if (this.a && this.e != null) {
            throw new IllegalStateException("Template in a loading state can not have an icon");
        }
        if (this.c.isEmpty()) {
            throw new IllegalStateException("Message cannot be empty");
        }
        String strConcat = this.j;
        if (strConcat == null) {
            strConcat = "";
        }
        if (!strConcat.isEmpty() && this.i != null) {
            strConcat = strConcat.concat("\n");
        }
        String strConcat2 = strConcat.concat(String.valueOf(Log.getStackTraceString(this.i)));
        if (!strConcat2.isEmpty()) {
            this.d = CarText.create(strConcat2);
        }
        return new MessageTemplate(this);
    }

    public final void b(Action action) {
        List list = this.h;
        list.add(action);
        wf.b.a(list);
    }

    @Deprecated
    public final void c(Action action) {
        wf wfVar = wf.a;
        action.getClass();
        wfVar.a(Collections.singletonList(action));
        this.f = action;
    }

    public final void d(CarIcon carIcon) {
        wh whVar = wh.b;
        carIcon.getClass();
        whVar.a(carIcon);
        this.e = carIcon;
    }

    @Deprecated
    public final void e(CharSequence charSequence) {
        charSequence.getClass();
        this.b = CarText.create(charSequence);
        wi.d.a(this.b);
    }
}
