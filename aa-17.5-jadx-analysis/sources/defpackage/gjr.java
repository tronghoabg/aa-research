package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.Header;
import androidx.car.app.model.InputCallbackDelegateImpl;
import com.android.car.libraries.apphost.external.model.DialpadTemplate;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class gjr {
    public Header a;
    public String b;
    public final Action c;
    public gkl d;
    public final uc e;
    public final Map f;

    @Deprecated
    public gjr() {
        sw swVar = new sw();
        swVar.c(CarIcon.ERROR);
        Action actionA = swVar.a();
        this.f = new HashMap(13);
        DialpadTemplate.KEYPAD_TEMPLATE_ACTION_CONSTRAINTS.a(Collections.singletonList(actionA));
        this.c = actionA;
        this.e = InputCallbackDelegateImpl.create(new gjq());
    }

    public final DialpadTemplate a() {
        Action startHeaderAction;
        Header header = this.a;
        if (header != null && (startHeaderAction = header.getStartHeaderAction()) != null) {
            DialpadTemplate.HEADER_ACTION_CONSTRAINT.a(Collections.singletonList(startHeaderAction));
        }
        return new DialpadTemplate(this, null);
    }
}
