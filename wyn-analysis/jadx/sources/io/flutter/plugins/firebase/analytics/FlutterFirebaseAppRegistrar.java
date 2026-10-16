package io.flutter.plugins.firebase.analytics;

import L8.b;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import ic.d;
import java.util.Collections;
import java.util.List;

@Keep
/* loaded from: classes5.dex */
public class FlutterFirebaseAppRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        return Collections.singletonList(d.m("flutter-fire-analytics", "11.4.0"));
    }
}
