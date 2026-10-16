package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import e.c.d.a;
import h.g.b.o;
import h.g.b.x;
import java.util.Locale;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FlashAvailabilityBufferUnderflowQuirk implements Quirk {
    public static final Companion Companion = new Companion(null);
    private static final Set<DeviceInfo> KNOWN_AFFECTED_MODELS = a.r(DeviceInfo.Companion.invoke("sprd", "lemp"), DeviceInfo.Companion.invoke("sprd", "DM20C"));

    /* compiled from: WazeSource */
    public final class DeviceInfo {
        public static final Companion Companion = new Companion(null);
        private final String manufacturer;
        private final String model;

        private DeviceInfo(String str, String str2) {
            this.manufacturer = str;
            this.model = str2;
        }

        public static /* synthetic */ DeviceInfo copy$default(DeviceInfo deviceInfo, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = deviceInfo.manufacturer;
            }
            if ((i2 & 2) != 0) {
                str2 = deviceInfo.model;
            }
            return deviceInfo.copy(str, str2);
        }

        public final String component1() {
            return this.manufacturer;
        }

        public final String component2() {
            return this.model;
        }

        public final DeviceInfo copy(String str, String str2) {
            x.f(str, "manufacturer");
            x.f(str2, "model");
            return new DeviceInfo(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeviceInfo)) {
                return false;
            }
            DeviceInfo deviceInfo = (DeviceInfo) obj;
            return x.n(this.manufacturer, deviceInfo.manufacturer) && x.n(this.model, deviceInfo.model);
        }

        public final String getManufacturer() {
            return this.manufacturer;
        }

        public final String getModel() {
            return this.model;
        }

        public int hashCode() {
            return (this.manufacturer.hashCode() * 31) + this.model.hashCode();
        }

        public String toString() {
            return "DeviceInfo(manufacturer=" + this.manufacturer + ", model=" + this.model + ")";
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final DeviceInfo invoke(String str, String str2) {
                x.f(str, "manufacturer");
                x.f(str2, "model");
                Locale locale = Locale.US;
                x.e(locale, "US");
                String lowerCase = str.toLowerCase(locale);
                x.e(lowerCase, "toLowerCase(...)");
                Locale locale2 = Locale.US;
                x.e(locale2, "US");
                String lowerCase2 = str2.toLowerCase(locale2);
                x.e(lowerCase2, "toLowerCase(...)");
                return new DeviceInfo(lowerCase, lowerCase2, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ DeviceInfo(String str, String str2, o oVar) {
            this(str, str2);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean isEnabled() {
            Set set = FlashAvailabilityBufferUnderflowQuirk.KNOWN_AFFECTED_MODELS;
            DeviceInfo.Companion companion = DeviceInfo.Companion;
            String str = Build.MANUFACTURER;
            x.e(str, "MANUFACTURER");
            String str2 = Build.MODEL;
            x.e(str2, "MODEL");
            return set.contains(companion.invoke(str, str2));
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
