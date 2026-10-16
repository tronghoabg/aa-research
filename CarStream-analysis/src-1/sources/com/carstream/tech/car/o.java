package com.carstream.tech.car;

import android.view.View;
import defpackage.s2;
import defpackage.w6;
import defpackage.z4;
import defpackage.z6;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class o implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                CarScreen carScreen = ((s2) ((z4) this.b).b).a;
                w6 w6VarG = z6.g(carScreen.carHooks);
                if (w6VarG != null && w6VarG.d) {
                    ((e) carScreen.webPlayer).r();
                    break;
                } else {
                    ((e) carScreen.webPlayer).t();
                    break;
                }
                break;
            case 1:
                ((e) ((s2) ((z4) this.b).b).a.webPlayer).l();
                break;
            default:
                a aVar = (a) this.b;
                a.b(aVar);
                CarScreen carScreen2 = ((s2) aVar.b).a;
                carScreen2.leaveLauncher();
                carScreen2.searchBar.f(true);
                break;
        }
    }
}
