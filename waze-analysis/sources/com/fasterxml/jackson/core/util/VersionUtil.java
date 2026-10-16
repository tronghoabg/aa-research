package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class VersionUtil {
    private static final Pattern V_SEP = Pattern.compile("[-_./;:]");

    public static Version parseVersion(String str, String str2, String str3) {
        String[] strArrSplit = V_SEP.split("2.19.2");
        int versionPart = parseVersionPart(strArrSplit[0]);
        int length = strArrSplit.length;
        return new Version(versionPart, length > 1 ? parseVersionPart(strArrSplit[1]) : 0, length > 2 ? parseVersionPart(strArrSplit[2]) : 0, length > 3 ? strArrSplit[3] : null, str2, str3);
    }

    protected static int parseVersionPart(String str) {
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt > '9' || cCharAt < '0') {
                break;
            }
            i2 = (i2 * 10) + (cCharAt - '0');
        }
        return i2;
    }

    public static final void throwInternal() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }

    public static final <T> T throwInternalReturnAny() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }

    public static Version versionFor(Class<?> cls) throws ClassNotFoundException {
        Version version = null;
        try {
            Class<?> cls2 = Class.forName(cls.getPackage().getName() + ".PackageVersion", true, cls.getClassLoader());
            try {
                version = ((Versioned) cls2.getDeclaredConstructor(null).newInstance(null)).version();
            } catch (Exception unused) {
                throw new IllegalArgumentException("Failed to get Versioned out of " + String.valueOf(cls2));
            }
        } catch (Exception unused2) {
        }
        return version == null ? Version.unknownVersion() : version;
    }
}
