package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavType;
import h.g.b.x;
import java.util.Map;
import kotlinx.b.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class RouteDeserializerKt {
    public static final <T> T decodeArguments(b<T> bVar, Bundle bundle, Map<String, ? extends NavType> map) {
        x.f(bVar, "<this>");
        x.f(bundle, "bundle");
        x.f(map, "typeMap");
        return (T) new RouteDecoder(bundle, (Map<String, ? extends NavType<?>>) map).decodeRouteWithArgs$navigation_common(bVar);
    }

    public static final <T> T decodeArguments(b<T> bVar, SavedStateHandle savedStateHandle, Map<String, ? extends NavType> map) {
        x.f(bVar, "<this>");
        x.f(savedStateHandle, "handle");
        x.f(map, "typeMap");
        return (T) new RouteDecoder(savedStateHandle, (Map<String, ? extends NavType<?>>) map).decodeRouteWithArgs$navigation_common(bVar);
    }
}
