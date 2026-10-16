package io.flutter.plugins.firebase.core;

import L8.b;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import ic.d;
import java.util.Collections;
import java.util.List;

@Keep
/* loaded from: classes5.dex */
public class FlutterFirebaseCoreRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        return Collections.singletonList(d.m("flutter-fire-core", "3.10.0"));
    }
}
