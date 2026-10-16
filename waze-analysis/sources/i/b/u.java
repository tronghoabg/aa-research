package i.b;

import com.google.v.eg;
import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum u implements eg {
    UNKNOWN_DEVICE_TYPE(0),
    SYMBIAN_NO_TOUCH_SCREEN_DEVICE(10),
    SYMBIAN_TOUCH_SCREEN_DEVICE(11),
    IPHONE_DEVICE(21),
    CE_NO_TOUCH_SCREEN_DEVICE(30),
    CE_TOUCH_SCREEN_DEVICE(31),
    ANDROID_DEVICE(50),
    WP8_DEVICE(80),
    LINUX_DEVICE(90),
    WEB(100);


    /* renamed from: l, reason: collision with root package name */
    private final int f49298l;

    u(int i2) {
        this.f49298l = i2;
    }

    public static ei a() {
        return k.f48524f;
    }

    public static u b(int i2) {
        if (i2 == 0) {
            return UNKNOWN_DEVICE_TYPE;
        }
        if (i2 == 21) {
            return IPHONE_DEVICE;
        }
        if (i2 == 50) {
            return ANDROID_DEVICE;
        }
        if (i2 == 80) {
            return WP8_DEVICE;
        }
        if (i2 == 90) {
            return LINUX_DEVICE;
        }
        if (i2 == 100) {
            return WEB;
        }
        if (i2 == 10) {
            return SYMBIAN_NO_TOUCH_SCREEN_DEVICE;
        }
        if (i2 == 11) {
            return SYMBIAN_TOUCH_SCREEN_DEVICE;
        }
        if (i2 == 30) {
            return CE_NO_TOUCH_SCREEN_DEVICE;
        }
        if (i2 != 31) {
            return null;
        }
        return CE_TOUCH_SCREEN_DEVICE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49298l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49298l);
    }
}
