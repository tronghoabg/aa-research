package defpackage;

import android.view.View;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.car.a;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class t0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ t0(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                a aVar = this.b;
                aVar.h = true;
                aVar.c.animate().translationX(0.0f).setDuration(220L).start();
                aVar.d.setVisibility(0);
                aVar.e.setVisibility(8);
                aVar.d.bringToFront();
                aVar.c.bringToFront();
                break;
            case 1:
                this.b.d();
                break;
            case 2:
                a aVar2 = this.b;
                a.b(aVar2);
                CarScreen carScreen = ((s2) aVar2.b).a;
                carScreen.hideSettings();
                carScreen.showHome();
                break;
            case 3:
                a aVar3 = this.b;
                a.b(aVar3);
                CarScreen carScreen2 = ((s2) aVar3.b).a;
                carScreen2.hideSettings();
                carScreen2.showGames();
                break;
            case 4:
                a aVar4 = this.b;
                a.b(aVar4);
                CarScreen carScreen3 = ((s2) aVar4.b).a;
                carScreen3.hideSettings();
                carScreen3.showLauncher();
                break;
            default:
                a aVar5 = this.b;
                a.b(aVar5);
                ((s2) aVar5.b).a.setSettingsVisible(true);
                break;
        }
    }
}
