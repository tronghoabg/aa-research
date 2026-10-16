package defpackage;

import android.R;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import java.util.List;

/* loaded from: classes.dex */
public final class bgd {
    public final bfy a;
    public final afdr b;
    private final afdr c;
    private final View d;

    public bgd(bfy bfyVar, afdr afdrVar, afdr afdrVar2, View view) {
        this.a = bfyVar;
        this.c = afdrVar;
        this.b = afdrVar2;
        this.d = view;
    }

    public final boolean a(Menu menu) {
        int i;
        Object objInvoke = this.c.invoke();
        int i2 = 0;
        if (affa.f(objInvoke, null)) {
            return false;
        }
        menu.clear();
        List list = ((bfu) objInvoke).b;
        int size = list.size();
        int i3 = 0;
        int i4 = 1;
        int i5 = 1;
        while (i3 < size) {
            final bft bftVar = (bft) list.get(i3);
            if (bftVar instanceof bfv) {
                i = i4 + 1;
                Object obj = bftVar.a;
                MenuItem menuItemAdd = menu.add(i5, affa.f(obj, bfw.a) ? R.id.cut : affa.f(obj, bfw.b) ? R.id.copy : affa.f(obj, bfw.c) ? R.id.paste : affa.f(obj, bfw.d) ? R.id.selectAll : affa.f(obj, bfw.e) ? R.id.autofill : i4, i4, ((bfv) bftVar).b);
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: bgc
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        ((bfv) bftVar).d.invoke(this.a);
                        return true;
                    }
                });
            } else if (bftVar instanceof bfz) {
                i = i4 + 1;
                final Context context = this.d.getContext();
                bfz bfzVar = (bfz) bftVar;
                final TextClassification textClassification = bfzVar.b;
                int i6 = bfzVar.c;
                Drawable drawable = bfzVar.d;
                if (i6 < 0) {
                    MenuItem menuItemAdd2 = menu.add(R.id.textAssist, R.id.textAssist, i4, textClassification.getLabel());
                    menuItemAdd2.setShowAsAction(2);
                    menuItemAdd2.setIcon(drawable);
                    menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: bgv
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                            awx.ac(context, textClassification);
                            return true;
                        }
                    });
                } else {
                    final RemoteAction remoteActionM = a$$ExternalSyntheticApiModelOutline0.m(textClassification.getActions().get(i6));
                    CharSequence title = remoteActionM.getTitle();
                    if (i6 == 0) {
                        i2 = 16908353;
                    }
                    MenuItem menuItemAdd3 = menu.add(R.id.textAssist, i2, i4, title);
                    menuItemAdd3.setShowAsAction(i6 != 0 ? 0 : 2);
                    if (drawable != null) {
                        menuItemAdd3.setIcon(drawable);
                    }
                    menuItemAdd3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: bgw
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                            awx.ab(remoteActionM.getActionIntent());
                            return true;
                        }
                    });
                }
            } else {
                if (bftVar instanceof bfx) {
                    i5++;
                }
                i3++;
                i2 = 0;
            }
            i4 = i;
            i3++;
            i2 = 0;
        }
        return true;
    }
}
