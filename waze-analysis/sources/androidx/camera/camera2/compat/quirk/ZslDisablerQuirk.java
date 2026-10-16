package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import h.a.i;
import h.g.b.x;
import h.n.o;
import java.util.List;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ZslDisablerQuirk implements Quirk {
    public static final Companion Companion = new Companion(null);
    private static final List<String> AFFECTED_SAMSUNG_MODEL = i.i("SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1", "SM-F721U1", "SM-S928U1");
    private static final List<String> AFFECTED_XIAOMI_MODEL = i.d("MI 8");

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final boolean isAffectedModel(List<String> list) {
            for (String str : list) {
                String str2 = Build.MODEL;
                x.e(str2, "MODEL");
                String upperCase = str2.toUpperCase(Locale.ROOT);
                x.e(upperCase, "toUpperCase(...)");
                if (o.ah(upperCase, str)) {
                    return true;
                }
            }
            return false;
        }

        private final boolean isAffectedSamsungDevices() {
            return Device.INSTANCE.isSamsungDevice() && isAffectedModel(ZslDisablerQuirk.AFFECTED_SAMSUNG_MODEL);
        }

        private final boolean isAffectedXiaoMiDevices() {
            return Device.INSTANCE.isXiaomiDevice() && isAffectedModel(ZslDisablerQuirk.AFFECTED_XIAOMI_MODEL);
        }

        public final boolean load() {
            return isAffectedSamsungDevices() || isAffectedXiaoMiDevices();
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
