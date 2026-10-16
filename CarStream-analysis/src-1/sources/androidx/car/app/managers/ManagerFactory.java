package androidx.car.app.managers;

import androidx.car.app.managers.Manager;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public interface ManagerFactory<T extends Manager> {
    T create();
}
