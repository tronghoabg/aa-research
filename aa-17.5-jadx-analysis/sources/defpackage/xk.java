package defpackage;

import androidx.car.app.model.GridTemplate;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.SearchTemplate;
import androidx.car.app.model.SectionedItemTemplate;

/* loaded from: classes2.dex */
public final class xk {
    public static final xk a = new xk(ygr.r(GridTemplate.class, MessageTemplate.class, ListTemplate.class, PaneTemplate.class));
    public static final xk b = new xk(ygr.s(GridTemplate.class, MessageTemplate.class, ListTemplate.class, PaneTemplate.class, SectionedItemTemplate.class));
    private final ygr c;

    static {
        ygr.s(ListTemplate.class, PaneTemplate.class, GridTemplate.class, MessageTemplate.class, SearchTemplate.class);
    }

    private xk(ygr ygrVar) {
        this.c = ygrVar;
    }

    public final void a(wb wbVar) {
        if (!this.c.contains(wbVar.getClass())) {
            throw new IllegalArgumentException(String.valueOf(wbVar.getClass().getSimpleName()).concat(" is not allowed as content within the parent template"));
        }
    }
}
