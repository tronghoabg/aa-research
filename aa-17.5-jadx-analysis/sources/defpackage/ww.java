package defpackage;

import androidx.car.app.model.ActionStrip;
import androidx.car.app.navigation.model.MapController;
import androidx.car.app.navigation.model.MapWithContentTemplate;

/* loaded from: classes2.dex */
public final class ww {
    public MapController a;
    public wb b = new wv();
    public ActionStrip c;

    public final MapWithContentTemplate a() {
        xk.b.a(this.b);
        return new MapWithContentTemplate(this);
    }

    public final void b(ActionStrip actionStrip) {
        wf.c.a(actionStrip.getActions());
        this.c = actionStrip;
    }
}
