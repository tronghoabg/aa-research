package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.TabCallbackDelegateImpl;
import androidx.car.app.model.TabContents;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class vz {
    public final vu a;
    public boolean b;
    public Action c;
    public final List d = new ArrayList();
    public TabContents e;
    public String f;

    public vz(wa waVar) {
        this.a = TabCallbackDelegateImpl.create(waVar);
    }
}
