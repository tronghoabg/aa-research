package defpackage;

import android.view.View;
import com.carstream.tech.launcher.AppRepo;
import com.carstream.tech.launcher.CarLauncherActivity;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class m2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CarLauncherActivity b;
    public final /* synthetic */ AppRepo.Entry c;

    public /* synthetic */ m2(CarLauncherActivity carLauncherActivity, AppRepo.Entry entry, int i) {
        this.a = i;
        this.b = carLauncherActivity;
        this.c = entry;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.lambda$cell$13(this.c, view);
                break;
            default:
                this.b.lambda$vienThuocApp$11(this.c, view);
                break;
        }
    }
}
