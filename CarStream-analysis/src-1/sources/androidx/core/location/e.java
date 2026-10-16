package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.lang.ref.WeakReference;
import java.util.function.Predicate;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        WeakReference weakReference = (WeakReference) obj;
        switch (this.a) {
            case 0:
                return LocationManagerCompat.LocationListenerTransport.lambda$register$0(weakReference);
            default:
                return LocationManagerCompat.LocationListenerTransport.lambda$unregister$1(weakReference);
        }
    }
}
