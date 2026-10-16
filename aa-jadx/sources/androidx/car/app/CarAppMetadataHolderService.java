package androidx.car.app;

/* JADX INFO: loaded from: classes2.dex */
public class CarAppMetadataHolderService extends android.app.Service {
    private CarAppMetadataHolderService() {
    }

    public static android.content.pm.ServiceInfo a(android.content.Context context) throws android.content.pm.PackageManager.NameNotFoundException {
        return context.getPackageManager().getServiceInfo(new android.content.ComponentName(context, (java.lang.Class<?>) androidx.car.app.CarAppMetadataHolderService.class), 640);
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        throw new java.lang.UnsupportedOperationException();
    }
}
