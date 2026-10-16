package defpackage;

import com.carstream.tech.launcher.CarLauncherActivity;
import com.carstream.tech.launcher.MediaHub;
import com.carstream.tech.launcher.Speedo;
import com.carstream.tech.launcher.Weather;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class k2 implements Weather.Listener, MediaHub.Cb, Speedo.Listener {
    public final /* synthetic */ CarLauncherActivity a;

    public /* synthetic */ k2(CarLauncherActivity carLauncherActivity) {
        this.a = carLauncherActivity;
    }

    @Override // com.carstream.tech.launcher.MediaHub.Cb
    public void onMedia(MediaHub.Info info) {
        this.a.showMedia(info);
    }

    @Override // com.carstream.tech.launcher.Speedo.Listener
    public void onSpeed(float f, float f2) {
        this.a.hienToc(f, f2);
    }

    @Override // com.carstream.tech.launcher.Weather.Listener
    public void onWeather(String str, int i) {
        this.a.lambda$onCreate$3(str, i);
    }
}
