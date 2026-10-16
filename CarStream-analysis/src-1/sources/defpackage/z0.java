package defpackage;

import com.carstream.tech.launcher.AppRepo;
import java.util.List;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ z0(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AppRepo.fire(this.b);
                break;
            case 1:
                AppRepo.fire(this.b);
                break;
            default:
                AppRepo.fire(this.b);
                break;
        }
    }
}
