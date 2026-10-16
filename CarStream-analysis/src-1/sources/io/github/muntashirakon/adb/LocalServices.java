package io.github.muntashirakon.adb;

import android.text.TextUtils;
import defpackage.ad;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class LocalServices {
    public static final int BACKUP = 14;
    public static final int CONNECT_JDWP = 10;
    public static final int FILE = 3;
    public static final int FRAMEBUFFER = 9;
    public static final int LOCAL_UNIX_SOCKET = 5;
    public static final int LOCAL_UNIX_SOCKET_ABSTRACT = 7;
    public static final int LOCAL_UNIX_SOCKET_FILE_SYSTEM = 8;
    public static final int LOCAL_UNIX_SOCKET_RESERVED = 6;
    public static final int REMOUNT = 2;
    public static final int RESTORE = 15;
    public static final int REVERSE = 13;
    static final int SERVICE_FIRST = 1;
    static final int SERVICE_LAST = 15;
    public static final int SHELL = 1;
    public static final int SYNC = 12;
    public static final int TCP_CONNECT = 4;
    public static final int TRACK_JDWP = 11;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Services {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String getDestination(int i, String... strArr) {
        StringBuilder sb = new StringBuilder(getServiceName(i));
        switch (i) {
            case 1:
                for (String str : strArr) {
                    if (str.contains("\"")) {
                        throw new IllegalArgumentException("Arguments for inline shell cannot contain double quotations.");
                    }
                    if (str.contains(" ")) {
                        sb.append("\"");
                        sb.append(str);
                        sb.append("\"");
                    } else {
                        sb.append(str);
                    }
                }
                return sb.toString();
            case 2:
                sb.append(TextUtils.join(" ", strArr));
                return sb.toString();
            case 3:
                if (strArr.length == 0) {
                    throw new IllegalArgumentException("File name must be specified.");
                }
                if (strArr.length == 1) {
                    String str2 = strArr[0];
                    Objects.requireNonNull(str2);
                    sb.append(str2);
                    return sb.toString();
                }
                throw new IllegalArgumentException("Service expects exactly one argument, " + strArr.length + " supplied.");
            case 4:
                if (strArr.length == 0) {
                    throw new IllegalArgumentException("Port number must be specified.");
                }
                if (strArr.length == 1) {
                    sb.append(strArr[0]);
                } else {
                    if (strArr.length != 2) {
                        throw new IllegalArgumentException("Invalid number of arguments supplied.");
                    }
                    String str3 = strArr[0];
                    Objects.requireNonNull(str3);
                    sb.append(str3);
                    sb.append(':');
                    String str4 = strArr[1];
                    Objects.requireNonNull(str4);
                    sb.append(str4);
                }
                return sb.toString();
            case 5:
            case 6:
            case 7:
            case 8:
                if (strArr.length == 0) {
                    throw new IllegalArgumentException("Path must be specified.");
                }
                if (strArr.length == 1) {
                    String str5 = strArr[0];
                    Objects.requireNonNull(str5);
                    sb.append(str5);
                    return sb.toString();
                }
                throw new IllegalArgumentException("Service expects exactly one argument, " + strArr.length + " supplied.");
            case 9:
            case 11:
            case 12:
            case 15:
                if (strArr.length != 0) {
                    throw new IllegalArgumentException("Service expects no arguments.");
                }
                return sb.toString();
            case 10:
                if (strArr.length == 0) {
                    throw new IllegalArgumentException("PID must be specified.");
                }
                if (strArr.length == 1) {
                    String str6 = strArr[0];
                    Objects.requireNonNull(str6);
                    sb.append(str6);
                    return sb.toString();
                }
                throw new IllegalArgumentException("Service expects exactly one argument, " + strArr.length + " supplied.");
            case 13:
                if (strArr.length == 0) {
                    throw new IllegalArgumentException("Forward command must be specified.");
                }
                if (strArr.length != 1) {
                    throw new IllegalArgumentException("Service expects exactly one argument, " + strArr.length + " supplied.");
                }
                String str7 = strArr[0];
                if (str7 == null) {
                    throw new IllegalArgumentException("Forward command is empty");
                }
                if (!"list-forward".equals(str7) && !"killforward-all".equals(strArr[0]) && !strArr[0].startsWith("forward:") && !strArr[0].startsWith("killforward:")) {
                    throw new IllegalArgumentException("Invalid forward command.");
                }
                sb.append(strArr[0]);
                return sb.toString();
            case 14:
                if (strArr.length == 0) {
                    throw new IllegalArgumentException("At least one package must be specified or use -shared/-all.");
                }
                sb.append(TextUtils.join(" ", strArr));
                return sb.toString();
            default:
                return sb.toString();
        }
    }

    public static String getServiceName(int i) {
        switch (i) {
            case 1:
                return "shell:";
            case 2:
                return "remount:";
            case 3:
                return "dev:";
            case 4:
                return "tcp:";
            case 5:
                return "local:";
            case 6:
                return "localreserved:";
            case 7:
                return "localabstract:";
            case 8:
                return "localfilesystem:";
            case 9:
                return "framebuffer:";
            case 10:
                return "jdwp:";
            case 11:
                return "track-jdwp";
            case 12:
                return "sync:";
            case 13:
                return "reverse:";
            case 14:
                return "backup:";
            case 15:
                return "restore:";
            default:
                throw new IllegalArgumentException(ad.b(i, "Invalid service: "));
        }
    }
}
