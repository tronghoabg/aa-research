package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.SearchCallbackDelegateImpl;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class vl {
    public final vi a;
    public String b;
    public String c;
    public boolean d;
    public ItemList e;
    public boolean f = true;
    public Action g;
    public ActionStrip h;

    public vl(vm vmVar) {
        this.a = SearchCallbackDelegateImpl.create(vmVar);
    }

    public final void a(Action action) {
        wf wfVar = wf.a;
        action.getClass();
        wfVar.a(Collections.singletonList(action));
        this.g = action;
    }
}
