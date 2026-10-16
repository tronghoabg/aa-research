package com.waze.gw;

import android.content.Context;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* loaded from: classes10.dex */
final class ModBuildInfo {
    private static final String DEFAULT_VERSION = "V11 Developer Build";
    private static final String VERSION_ASSET = "wz_mod_version.txt";

    private ModBuildInfo() {
    }

    static String versionLabel(Context context) {
        String str = DEFAULT_VERSION;
        if (context == null) {
            return DEFAULT_VERSION;
        }
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getAssets().open(VERSION_ASSET);
            byte[] bArr = new byte[128];
            int i2 = inputStreamOpen.read(bArr);
            if (i2 > 0 && inputStreamOpen.read() == -1) {
                String strTrim = new String(bArr, 0, i2, StandardCharsets.UTF_8).trim();
                if (strTrim.length() != 0) {
                    str = strTrim;
                }
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th) {
                    }
                }
                return str;
            }
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th2) {
                }
            }
            return DEFAULT_VERSION;
        } catch (Throwable th3) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th4) {
                }
            }
            return DEFAULT_VERSION;
        }
    }
}
