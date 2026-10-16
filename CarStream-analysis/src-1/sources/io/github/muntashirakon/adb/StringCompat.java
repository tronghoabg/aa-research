package io.github.muntashirakon.adb;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
final class StringCompat {
    public static byte[] getBytes(String str, String str2) {
        return str.getBytes(Charset.forName(str2));
    }
}
