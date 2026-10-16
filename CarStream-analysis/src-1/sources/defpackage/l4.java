package defpackage;

import android.view.View;
import com.carstream.tech.car.CarScreen;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class l4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q4 b;

    public /* synthetic */ l4(q4 q4Var, int i) {
        this.a = i;
        this.b = q4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.e();
                break;
            default:
                q4 q4Var = this.b;
                q4Var.e();
                CarScreen carScreen = ((s2) q4Var.b).a;
                carScreen.leaveGames();
                carScreen.showHome();
                break;
        }
    }
}
