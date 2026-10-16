package defpackage;

import android.net.wifi.WifiManager;
import android.os.Build;
import com.google.android.apps.auto.components.telecom.impl.DoNotDisturbCallManagerImpl;
import com.google.android.gms.car.RadioProgramSelector;
import java.util.function.ToIntFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class mim implements ToIntFunction {
    private final /* synthetic */ int a;

    public /* synthetic */ mim(int i) {
        this.a = i;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.a) {
            case 2:
                RadioProgramSelector.RadioProgramIdentifier radioProgramIdentifier = ((RadioProgramSelector) obj).a;
                if (radioProgramIdentifier.a == 3) {
                    break;
                }
                break;
            case 4:
                RadioProgramSelector.RadioProgramIdentifier radioProgramIdentifier2 = ((RadioProgramSelector) obj).a;
                int i = radioProgramIdentifier2.a;
                woy.N(lws.j(i));
                break;
            case 5:
                RadioProgramSelector.RadioProgramIdentifier radioProgramIdentifier3 = ((RadioProgramSelector) obj).a;
                int i2 = radioProgramIdentifier3.a;
                woy.N(lws.j(i2));
                break;
            case 6:
                RadioProgramSelector.RadioProgramIdentifier radioProgramIdentifier4 = ((RadioProgramSelector) obj).a;
                int i3 = radioProgramIdentifier4.a;
                woy.N(lws.j(i3));
                break;
            case 8:
                yph yphVar = DoNotDisturbCallManagerImpl.a;
                break;
            case 9:
                yph yphVar2 = pdh.a;
                break;
            case 10:
                WifiManager wifiManager = (WifiManager) obj;
                yph yphVar3 = pdh.a;
                if (Build.VERSION.SDK_INT >= 34) {
                    break;
                }
                break;
        }
        return ((uzp) obj).a().n;
    }
}
