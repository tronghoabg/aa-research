package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.Background;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class ua {
    public final List a = new ArrayList();
    public Action b;
    public CarText c;
    public CarText d;
    public Background e;
    public CarIcon f;

    public final Header a() {
        if (CarText.isNullOrEmpty(this.c) && this.b == null) {
            throw new IllegalStateException("Either the title or start header action must be set");
        }
        return new Header(this);
    }

    public final void b(Action action) {
        action.getClass();
        this.a.add(action);
    }

    public final void c(Action action) {
        wf wfVar = wf.a;
        action.getClass();
        wfVar.a(Collections.singletonList(action));
        this.b = action;
    }

    public final void d(CarText carText) {
        this.c = carText;
        wi.d.a(this.c);
    }

    public final void e(CharSequence charSequence) {
        d(CarText.create(charSequence));
    }
}
