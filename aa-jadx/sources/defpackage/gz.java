package defpackage;

/* JADX INFO: loaded from: classes2.dex */
class gz {
    final android.content.Context a;
    public defpackage.aba b;

    public gz(android.content.Context context) {
        this.a = context;
    }

    final android.view.MenuItem a(android.view.MenuItem menuItem) {
        if (!(menuItem instanceof defpackage.dwb)) {
            return menuItem;
        }
        defpackage.dwb dwbVar = (defpackage.dwb) menuItem;
        defpackage.aba abaVar = this.b;
        if (abaVar == null) {
            abaVar = new defpackage.aba(0);
            this.b = abaVar;
        }
        android.view.MenuItem menuItem2 = (android.view.MenuItem) abaVar.get(dwbVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        defpackage.ho hoVar = new defpackage.ho(this.a, dwbVar);
        this.b.put(dwbVar, hoVar);
        return hoVar;
    }
}
