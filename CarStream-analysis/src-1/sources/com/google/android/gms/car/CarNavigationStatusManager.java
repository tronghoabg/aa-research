package com.google.android.gms.car;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public interface CarNavigationStatusManager {

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public interface CarNavigationStatusListener {
        void onStart(int i, int i2, int i3, int i4, int i5);

        void onStop();
    }

    void registerListener(CarNavigationStatusListener carNavigationStatusListener);

    boolean sendNavigationStatus(int i);

    boolean sendNavigationTurnDistanceEvent(int i, int i2, int i3, int i4);

    boolean sendNavigationTurnEvent(int i, String str, int i2, int i3, byte[] bArr, int i4);

    void unregisterListener();
}
