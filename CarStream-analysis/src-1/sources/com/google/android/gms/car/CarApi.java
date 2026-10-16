package com.google.android.gms.car;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public interface CarApi {

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public interface CarConnectionCallback {
        void onConnected(int i);

        void onDisconnected();
    }

    int getCarConnectionType();

    CarDisplayInfoManager getCarDisplayInfoManager(int i);

    Object getCarManager(String str);

    Object getCarWindowManager(int i);

    CarVendorExtensionManager getVendorExtensionManager(String str);

    boolean isConnectedToCar();

    void registerCarConnectionListener(CarConnectionCallback carConnectionCallback);

    void unregisterCarConnectionListener(CarConnectionCallback carConnectionCallback);
}
