package defpackage;

import android.content.Context;
import com.carstream.tech.launcher.AppRepo;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ b1(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AppRepo.lambda$load$1(this.b);
                break;
            default:
                AppRepo.lambda$rescan$4(this.b);
                break;
        }
    }
}
