package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import androidx.car.app.IStartCarApp;
import j$.util.Collection;
import java.security.InvalidParameterException;

/* loaded from: classes2.dex */
public final class lnh extends IStartCarApp.Stub {
    private static final yph a = yph.c("GH.MediaSettingsStub");
    private final ComponentName b;

    public lnh(ComponentName componentName) {
        this.b = componentName;
    }

    @Override // androidx.car.app.IStartCarApp
    public final int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.IStartCarApp
    public final void startCarApp(Intent intent) {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 4054)).u("Validating Intent...");
        ComponentName component = intent.getComponent();
        if (component != null) {
            ComponentName componentName = this.b;
            if (componentName.getPackageName().equals(component.getPackageName())) {
                if (Collection.EL.stream(jzc.a().b(kio.b().e(), nyj.a())).map(new lka(7)).noneMatch(new koh(component, 16))) {
                    throw new InvalidParameterException("Intent target not a valid settings template");
                }
                ((ype) yphVar.l().ai((char) 4055)).y("Starting template (%s) from Intent...", component.flattenToShortString());
                intent.putExtra("com.google.android.apps.auto.components.apphost.EXTRA_START_COMPONENT_ON_FINISH", componentName);
                mpe.a().i(intent);
                return;
            }
        }
        throw new InvalidParameterException("Intent does not target expected package.");
    }
}
