package com.waze.gw;

import android.util.Log;
import androidx.compose.foundation.style.StylePropertiesKt;

/* loaded from: classes10.dex */
final class RoadNoticeCrypto {
    private static final boolean AVAILABLE;
    private static final String TAG = "WazeGW-RoadCrypto";
    private static final byte[] PRODUCTION_PUBLIC_KEY = {-111, 115, -109, 102, -119, -86, -9, -66, 5, -30, StylePropertiesKt.LineHeightId, StylePropertiesKt.RotationXId, -1, -95, 4, 53, 63, -86, 8, -122, -87, -33, 2, StylePropertiesKt.AlphaId, 112, -97, -86, StylePropertiesKt.ClipId, -6, 54, -74, StylePropertiesKt.RotationYId};
    private static final byte[] LEGACY_PUBLIC_KEY = {83, -80, 122, 58, 3, -38, -62, 6, 54, 5, -118, 120, -40, -115, 53, -101, -54, 79, -114, -60, -124, StylePropertiesKt.CameraDistanceId, -49, 64, StylePropertiesKt.FontSizeId, -49, -80, -87, -42, -112, StylePropertiesKt.ForegroundColorId, -82};

    private static native boolean selfTestNative();

    private static native boolean verifyEd25519Native(byte[] bArr, byte[] bArr2, byte[] bArr3);

    static {
        boolean zSelfTestNative = false;
        try {
            System.loadLibrary("wazegw");
            zSelfTestNative = selfTestNative();
            if (!zSelfTestNative) {
                Log.e(TAG, "native Ed25519 self-test failed");
            }
        } catch (Throwable th) {
            Log.w(TAG, "native Ed25519 unavailable: " + th.getClass().getSimpleName());
        }
        AVAILABLE = zSelfTestNative;
    }

    private RoadNoticeCrypto() {
    }

    static boolean verify(byte[] bArr, byte[] bArr2) {
        if (!AVAILABLE || bArr == null || bArr2 == null || bArr2.length != 64) {
            return false;
        }
        try {
            if (verifyEd25519Native(bArr, bArr2, PRODUCTION_PUBLIC_KEY)) {
                return true;
            }
            boolean zVerifyEd25519Native = verifyEd25519Native(bArr, bArr2, LEGACY_PUBLIC_KEY);
            if (zVerifyEd25519Native) {
                Log.i(TAG, "accepted dataset signed by legacy rotation key");
            }
            return zVerifyEd25519Native;
        } catch (Throwable th) {
            Log.w(TAG, "verification failed safely: " + th.getClass().getSimpleName());
            return false;
        }
    }

    static boolean available() {
        return AVAILABLE;
    }
}
