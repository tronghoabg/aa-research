package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class go implements defpackage.gl {
    public final android.view.ActionMode.Callback a;
    public final android.content.Context b;
    final java.util.ArrayList c = new java.util.ArrayList();
    final defpackage.aba d = new defpackage.aba(0);

    public go(android.content.Context context, android.view.ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
    }

    @Override // defpackage.gl
    public final void a(defpackage.gm gmVar) {
        throw null;
    }

    @Override // defpackage.gl
    public final boolean b(defpackage.gm gmVar, android.view.MenuItem menuItem) {
        throw null;
    }

    @Override // defpackage.gl
    public final boolean c(defpackage.gm gmVar, android.view.Menu menu) {
        throw null;
    }

    @Override // defpackage.gl
    public final void d(defpackage.gm gmVar, android.view.Menu menu) {
        throw null;
    }

    public final android.view.ActionMode e(defpackage.gm gmVar) {
        java.util.ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            defpackage.gp gpVar = (defpackage.gp) arrayList.get(i);
            if (gpVar != null && gpVar.b == gmVar) {
                return gpVar;
            }
        }
        defpackage.gp gpVar2 = new defpackage.gp(this.b, gmVar);
        arrayList.add(gpVar2);
        return gpVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final android.view.Menu f(android.view.Menu menu) {
        defpackage.aba abaVar = this.d;
        android.view.Menu menu2 = (android.view.Menu) abaVar.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        defpackage.hw hwVar = new defpackage.hw(this.b, menu);
        abaVar.put(menu, hwVar);
        return hwVar;
    }
}
