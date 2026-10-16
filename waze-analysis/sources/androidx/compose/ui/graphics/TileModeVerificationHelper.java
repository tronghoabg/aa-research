package androidx.compose.ui.graphics;

import android.graphics.Shader;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TileModeVerificationHelper {
    public static final TileModeVerificationHelper INSTANCE = new TileModeVerificationHelper();

    private TileModeVerificationHelper() {
    }

    /* renamed from: getComposeTileModeDecal-3opZhB0, reason: not valid java name */
    public final int m8657getComposeTileModeDecal3opZhB0() {
        return TileMode.Companion.m8654getDecal3opZhB0();
    }

    public final Shader.TileMode getFrameworkTileModeDecal() {
        return Shader.TileMode.DECAL;
    }
}
