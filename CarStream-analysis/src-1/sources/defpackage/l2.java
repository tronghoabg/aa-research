package defpackage;

import android.view.View;
import com.carstream.tech.launcher.CarLauncherActivity;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class l2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CarLauncherActivity b;

    public /* synthetic */ l2(CarLauncherActivity carLauncherActivity, int i) {
        this.a = i;
        this.b = carLauncherActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.lambda$header$5(view);
                break;
            case 1:
                this.b.lambda$mediaCard$7(view);
                break;
            case 2:
                this.b.lambda$mediaCard$8(view);
                break;
            case 3:
                this.b.lambda$mediaCard$9(view);
                break;
            default:
                this.b.lambda$mediaCard$10(view);
                break;
        }
    }
}
