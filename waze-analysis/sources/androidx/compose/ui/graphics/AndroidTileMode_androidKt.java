package androidx.compose.ui.graphics;

import android.graphics.Shader;
import android.os.Build;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidTileMode_androidKt {

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Shader.TileMode.values().length];
            try {
                iArr[Shader.TileMode.CLAMP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Shader.TileMode.MIRROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Shader.TileMode.REPEAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: isSupported-0vamqd0, reason: not valid java name */
    public static final boolean m8130isSupported0vamqd0(int i2) {
        return Build.VERSION.SDK_INT >= 31 || !TileMode.m8649equalsimpl0(i2, TileMode.Companion.m8654getDecal3opZhB0());
    }

    /* renamed from: toAndroidTileMode-0vamqd0, reason: not valid java name */
    public static final Shader.TileMode m8131toAndroidTileMode0vamqd0(int i2) {
        return TileMode.m8649equalsimpl0(i2, TileMode.Companion.m8653getClamp3opZhB0()) ? Shader.TileMode.CLAMP : TileMode.m8649equalsimpl0(i2, TileMode.Companion.m8656getRepeated3opZhB0()) ? Shader.TileMode.REPEAT : TileMode.m8649equalsimpl0(i2, TileMode.Companion.m8655getMirror3opZhB0()) ? Shader.TileMode.MIRROR : TileMode.m8649equalsimpl0(i2, TileMode.Companion.m8654getDecal3opZhB0()) ? Build.VERSION.SDK_INT >= 31 ? TileModeVerificationHelper.INSTANCE.getFrameworkTileModeDecal() : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }

    public static final int toComposeTileMode(Shader.TileMode tileMode) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[tileMode.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? (Build.VERSION.SDK_INT < 31 || tileMode != Shader.TileMode.DECAL) ? TileMode.Companion.m8653getClamp3opZhB0() : TileModeVerificationHelper.INSTANCE.m8657getComposeTileModeDecal3opZhB0() : TileMode.Companion.m8656getRepeated3opZhB0() : TileMode.Companion.m8655getMirror3opZhB0() : TileMode.Companion.m8653getClamp3opZhB0();
    }
}
