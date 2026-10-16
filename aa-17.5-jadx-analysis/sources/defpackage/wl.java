package defpackage;

import androidx.car.app.dialer.InCallTemplate;
import androidx.car.app.dialer.TelephoneKeypadTemplate;
import androidx.car.app.model.GridTemplate;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.SearchTemplate;
import androidx.car.app.model.SectionedItemTemplate;
import androidx.car.app.navigation.model.NavigationTemplate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class wl {
    public static final wl a = new wl(Arrays.asList(ListTemplate.class, PaneTemplate.class, GridTemplate.class, MessageTemplate.class, SearchTemplate.class));
    public static final wl b = new wl(Arrays.asList(ListTemplate.class, PaneTemplate.class, GridTemplate.class, MessageTemplate.class, SearchTemplate.class, NavigationTemplate.class));
    public static final wl c = new wl(Arrays.asList(ListTemplate.class, PaneTemplate.class, GridTemplate.class, MessageTemplate.class, SearchTemplate.class, NavigationTemplate.class, SectionedItemTemplate.class, InCallTemplate.class, TelephoneKeypadTemplate.class));
    private final HashSet d;

    private wl(List list) {
        this.d = new HashSet(list);
    }

    public final void a(wb wbVar) {
        if (!this.d.contains(wbVar.getClass())) {
            throw new IllegalArgumentException("Type is not allowed in tabs: ".concat(String.valueOf(wbVar.getClass().getSimpleName())));
        }
    }
}
