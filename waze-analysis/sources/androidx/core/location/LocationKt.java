package androidx.core.location;

import android.location.Location;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class LocationKt {
    public static final double component1(Location location) {
        x.f(location, "<this>");
        return location.getLatitude();
    }

    public static final double component2(Location location) {
        x.f(location, "<this>");
        return location.getLongitude();
    }
}
