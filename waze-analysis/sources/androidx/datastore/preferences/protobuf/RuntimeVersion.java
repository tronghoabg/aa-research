package androidx.datastore.preferences.protobuf;

import androidx.credentials.provider.CredentialEntry;
import java.util.Locale;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class RuntimeVersion {
    public static final RuntimeDomain DOMAIN;
    public static final int MAJOR = 4;
    private static final int MAX_WARNING_COUNT = 20;
    public static final int MINOR = 33;
    public static final RuntimeDomain OSS_DOMAIN;
    public static final int OSS_MAJOR = 4;
    public static final int OSS_MINOR = 33;
    public static final int OSS_PATCH = 5;
    public static final String OSS_SUFFIX = "";
    public static final int PATCH = 5;
    public static final String SUFFIX = "";
    private static final String VERSION_STRING;
    private static final Logger logger;
    static int majorWarningLoggedCount;
    static int minorWarningLoggedCount;
    static boolean preleaseRuntimeWarningLogged;

    /* compiled from: WazeSource */
    public final class ProtobufRuntimeVersionException extends RuntimeException {
        public ProtobufRuntimeVersionException(String str) {
            super(str);
        }
    }

    /* compiled from: WazeSource */
    public enum RuntimeDomain {
        GOOGLE_INTERNAL,
        PUBLIC
    }

    static {
        RuntimeDomain runtimeDomain = RuntimeDomain.PUBLIC;
        OSS_DOMAIN = runtimeDomain;
        DOMAIN = runtimeDomain;
        majorWarningLoggedCount = 0;
        minorWarningLoggedCount = 0;
        preleaseRuntimeWarningLogged = false;
        VERSION_STRING = versionString(4, 33, 5, "");
        logger = Logger.getLogger(RuntimeVersion.class.getName());
    }

    private RuntimeVersion() {
    }

    private static boolean checkDisabled() {
        String str = System.getenv("TEMPORARILY_DISABLE_PROTOBUF_VERSION_CHECK");
        return str != null && str.equals(CredentialEntry.TRUE_STRING);
    }

    public static void validateProtobufGencodeVersion(RuntimeDomain runtimeDomain, int i2, int i3, int i4, String str, String str2) {
        validateProtobufGencodeVersionImpl(runtimeDomain, i2, i3, i4, str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void validateProtobufGencodeVersionImpl(androidx.datastore.preferences.protobuf.RuntimeVersion.RuntimeDomain r16, int r17, int r18, int r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.RuntimeVersion.validateProtobufGencodeVersionImpl(androidx.datastore.preferences.protobuf.RuntimeVersion$RuntimeDomain, int, int, int, java.lang.String, java.lang.String):void");
    }

    private static String versionString(int i2, int i3, int i4, String str) {
        return String.format(Locale.US, "%d.%d.%d%s", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str);
    }
}
