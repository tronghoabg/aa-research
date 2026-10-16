package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class gn implements gk {
    public final ActionMode.Callback a;
    public final Context b;
    final ArrayList c = new ArrayList();
    final aat d = new aat(0);

    public gn(Context context, ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
    }

    @Override // defpackage.gk
    public final void a(gl glVar) {
        throw null;
    }

    @Override // defpackage.gk
    public final boolean b(gl glVar, MenuItem menuItem) {
        throw null;
    }

    @Override // defpackage.gk
    public final boolean c(gl glVar, Menu menu) {
        throw null;
    }

    @Override // defpackage.gk
    public final void d(gl glVar, Menu menu) {
        throw null;
    }

    public final ActionMode e(gl glVar) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            go goVar = (go) arrayList.get(i);
            if (goVar != null && goVar.b == glVar) {
                return goVar;
            }
        }
        go goVar2 = new go(this.b, glVar);
        arrayList.add(goVar2);
        return goVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Menu f(Menu menu) {
        aat aatVar = this.d;
        Menu menu2 = (Menu) aatVar.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        hv hvVar = new hv(this.b, menu);
        aatVar.put(menu, hvVar);
        return hvVar;
    }
}
