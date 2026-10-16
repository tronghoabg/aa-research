package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bgh {
    public final defpackage.bgb a;
    public final defpackage.afer b;
    private final defpackage.afer c;
    private final android.view.View d;

    public bgh(defpackage.bgb bgbVar, defpackage.afer aferVar, defpackage.afer aferVar2, android.view.View view) {
        this.a = bgbVar;
        this.c = aferVar;
        this.b = aferVar2;
        this.d = view;
    }

    public final boolean a(android.view.Menu menu) {
        int i;
        int i2;
        java.lang.Object objInvoke = this.c.invoke();
        int i3 = 0;
        if (defpackage.afga.f(objInvoke, null)) {
            return false;
        }
        menu.clear();
        java.util.List list = ((defpackage.bfx) objInvoke).b;
        int size = list.size();
        int i4 = 0;
        int i5 = 1;
        int i6 = 1;
        while (i4 < size) {
            final defpackage.bfw bfwVar = (defpackage.bfw) list.get(i4);
            if (bfwVar instanceof defpackage.bfy) {
                i = i5 + 1;
                java.lang.Object obj = bfwVar.a;
                if (defpackage.afga.f(obj, defpackage.bfz.a)) {
                    i2 = android.R.id.cut;
                } else if (defpackage.afga.f(obj, defpackage.bfz.b)) {
                    i2 = android.R.id.copy;
                } else if (defpackage.afga.f(obj, defpackage.bfz.c)) {
                    i2 = android.R.id.paste;
                } else if (defpackage.afga.f(obj, defpackage.bfz.d)) {
                    i2 = android.R.id.selectAll;
                } else {
                    i2 = defpackage.afga.f(obj, defpackage.bfz.e) ? android.R.id.autofill : i5;
                }
                android.view.MenuItem menuItemAdd = menu.add(i6, i2, i5, ((defpackage.bfy) bfwVar).b);
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() { // from class: bgg
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                        ((defpackage.bfy) bfwVar).d.invoke(this.a);
                        return true;
                    }
                });
            } else {
                if (bfwVar instanceof defpackage.bgc) {
                    i = i5 + 1;
                    final android.content.Context context = this.d.getContext();
                    defpackage.bgc bgcVar = (defpackage.bgc) bfwVar;
                    final android.view.textclassifier.TextClassification textClassification = bgcVar.b;
                    int i7 = bgcVar.c;
                    android.graphics.drawable.Drawable drawable = bgcVar.d;
                    if (i7 < 0) {
                        android.view.MenuItem menuItemAdd2 = menu.add(android.R.id.textAssist, android.R.id.textAssist, i5, textClassification.getLabel());
                        menuItemAdd2.setShowAsAction(2);
                        menuItemAdd2.setIcon(drawable);
                        menuItemAdd2.setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() { // from class: bgz
                            @Override // android.view.MenuItem.OnMenuItemClickListener
                            public final boolean onMenuItemClick(android.view.MenuItem menuItem) throws android.app.PendingIntent.CanceledException {
                                defpackage.axd.W(context, textClassification);
                                return true;
                            }
                        });
                    } else {
                        final android.app.RemoteAction remoteActionM = defpackage.a$$ExternalSyntheticApiModelOutline1.m(textClassification.getActions().get(i7));
                        java.lang.CharSequence title = remoteActionM.getTitle();
                        if (i7 == 0) {
                            i3 = 16908353;
                        }
                        android.view.MenuItem menuItemAdd3 = menu.add(android.R.id.textAssist, i3, i5, title);
                        menuItemAdd3.setShowAsAction(i7 != 0 ? 0 : 2);
                        if (drawable != null) {
                            menuItemAdd3.setIcon(drawable);
                        }
                        menuItemAdd3.setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() { // from class: bha
                            @Override // android.view.MenuItem.OnMenuItemClickListener
                            public final boolean onMenuItemClick(android.view.MenuItem menuItem) throws android.app.PendingIntent.CanceledException {
                                defpackage.axd.V(remoteActionM.getActionIntent());
                                return true;
                            }
                        });
                    }
                } else if (bfwVar instanceof defpackage.bga) {
                    i6++;
                }
                i4++;
                i3 = 0;
            }
            i5 = i;
            i4++;
            i3 = 0;
        }
        return true;
    }
}
