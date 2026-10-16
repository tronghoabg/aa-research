package defpackage;

import android.view.Surface;
import androidx.activity.ComponentActivity;
import androidx.activity.ComponentDialog;
import androidx.car.app.CarAppService;
import androidx.car.app.CarContext;
import androidx.car.app.navigation.NavigationManager;
import androidx.car.app.navigation.NavigationManagerCallback;
import com.carstream.tech.launcher.AppRepo;
import com.carstream.tech.launcher.MediaHub;
import com.carstream.tech.launcher.Weather;
import com.carstream.tech.mirror.MirrorServer;
import io.github.muntashirakon.adb.AdbConnection;
import java.io.IOException;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.a) {
            case 0:
                ((AdbConnection) this.b).lambda$createConnectionThread$0();
                break;
            case 1:
                ((CarAppService) this.b).lambda$dump$1();
                break;
            case 2:
                ((CarContext) this.b).lambda$new$11();
                break;
            case 3:
                ((ComponentActivity) this.b).invalidateMenu();
                break;
            case 4:
                ComponentDialog.m0onBackPressedDispatcher$lambda1((ComponentDialog) this.b);
                break;
            case 5:
                ((MediaHub) this.b).lambda$emit$0();
                break;
            case 6:
                MirrorServer.I((Surface) this.b);
                break;
            case 7:
                ((NavigationManagerCallback) this.b).onAutoDriveEnabled();
                break;
            case 8:
                ((NavigationManager) this.b).lambda$onStopNavigation$3();
                break;
            case 9:
                ((qa) this.b).d();
                AppRepo.baoLai();
                break;
            default:
                ((Weather) this.b).nap();
                break;
        }
    }
}
