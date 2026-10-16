package androidx.car.app.managers;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.car.app.CarAppMetadataHolderService;
import androidx.car.app.CarContext;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public interface ResultManager extends Manager {
    static ResultManager create(CarContext carContext) throws ClassNotFoundException {
        try {
            Bundle bundle = CarAppMetadataHolderService.getServiceInfo(carContext).metaData;
            String string = bundle != null ? bundle.getString("androidx.car.app.CarAppMetadataHolderService.RESULT_MANAGER") : null;
            if (string != null) {
                return (ResultManager) Class.forName(string).getConstructor(null).newInstance(null);
            }
            throw new ClassNotFoundException("ResultManager metadata could not be found");
        } catch (PackageManager.NameNotFoundException | ReflectiveOperationException unused) {
            throw new IllegalStateException("ResultManager not configured. Did you forget to add a dependency on the app-automotive artifact?");
        }
    }

    ComponentName getCallingComponent();

    void setCarAppResult(int i, Intent intent);
}
