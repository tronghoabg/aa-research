package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import androidx.car.app.AppManager;
import androidx.car.app.CarContext;
import androidx.car.app.HostCall;
import androidx.car.app.IAppHost;
import androidx.car.app.ICarHost;
import androidx.car.app.ScreenManager;
import androidx.car.app.media.OpenMicrophoneRequest;
import androidx.car.app.model.Toggle;
import androidx.car.app.navigation.model.PanModeListener;
import androidx.car.app.utils.RemoteUtils;
import androidx.core.util.Predicate;
import com.carstream.tech.launcher.AppRepo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements HostCall, RemoteUtils.HostCall, Predicate, Toggle.OnCheckedChangeListener, k0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.k0
    public ArrayList a(Context context) {
        List<AppRepo.Entry> list = (List) this.b;
        ArrayList arrayList = new ArrayList();
        for (AppRepo.Entry entry : list) {
            arrayList.add(new j0(entry.pkg, entry.label, "", entry.icon));
        }
        return arrayList;
    }

    @Override // androidx.car.app.utils.RemoteUtils.HostCall
    public Object dispatch() {
        return ((ScreenManager) this.b).getTopTemplate();
    }

    @Override // androidx.car.app.model.Toggle.OnCheckedChangeListener
    public void onCheckedChange(boolean z) {
        ((PanModeListener) this.b).onPanModeChanged(z);
    }

    @Override // androidx.core.util.Predicate
    public boolean test(Object obj) {
        return ((java.util.function.Predicate) this.b).test((ClipData.Item) obj);
    }

    @Override // androidx.car.app.HostCall
    public Object dispatch(Object obj) {
        switch (this.a) {
            case 0:
                return AppManager.lambda$openMicrophone$5((OpenMicrophoneRequest) this.b, (IAppHost) obj);
            case 1:
                return AppManager.lambda$new$6((Location) this.b, (IAppHost) obj);
            default:
                return CarContext.lambda$startCarApp$0((Intent) this.b, (ICarHost) obj);
        }
    }
}
