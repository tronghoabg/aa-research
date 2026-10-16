package androidx.car.app.validation;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.os.Process;
import android.util.Log;
import android.util.Pair;
import androidx.car.app.HostInfo;
import androidx.car.app.utils.LogTags;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class HostValidator {
    public static final HostValidator ALLOW_ALL_HOSTS_VALIDATOR = new HostValidator(null, new HashMap(), true);
    public static final String TEMPLATE_RENDERER_PERMISSION = "android.car.permission.TEMPLATE_RENDERER";
    private final boolean mAllowAllHosts;
    private final Map<String, List<String>> mAllowedHosts;
    private final Map<String, Pair<Integer, Boolean>> mCallerChecked = new HashMap();
    private final PackageManager mPackageManager;

    /* compiled from: WazeSource */
    final class Api28Impl {
        private Api28Impl() {
        }

        static PackageInfo getPackageInfo(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 134221824);
        }

        static Signature[] getSignatures(PackageInfo packageInfo) {
            if (packageInfo.signingInfo == null) {
                return null;
            }
            return packageInfo.signingInfo.getSigningCertificateHistory();
        }
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private final Map<String, List<String>> mAllowedHosts = new HashMap();
        private final Context mContext;

        public Builder(Context context) {
            this.mContext = context;
        }

        private String cleanUp(String str) {
            return str.toLowerCase(Locale.US).replace(" ", "");
        }

        public Builder addAllowedHost(String str, String str2) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(str2);
            List<String> arrayList = this.mAllowedHosts.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.mAllowedHosts.put(str, arrayList);
            }
            arrayList.add(str2);
            return this;
        }

        public Builder addAllowedHosts(int i2) throws Resources.NotFoundException {
            String[] stringArray = this.mContext.getResources().getStringArray(i2);
            if (stringArray == null) {
                throw new IllegalArgumentException("Invalid allowlist res id: " + i2);
            }
            for (String str : stringArray) {
                String[] strArrSplit = str.split(",", -1);
                if (strArrSplit.length != 2) {
                    throw new IllegalArgumentException("Invalid allowed host entry: '" + str + "'");
                }
                addAllowedHost(cleanUp(strArrSplit[1]), cleanUp(strArrSplit[0]));
            }
            return this;
        }

        public HostValidator build() {
            return new HostValidator(this.mContext.getPackageManager(), this.mAllowedHosts, false);
        }
    }

    HostValidator(PackageManager packageManager, Map<String, List<String>> map, boolean z) {
        this.mPackageManager = packageManager;
        this.mAllowedHosts = map;
        this.mAllowAllHosts = z;
    }

    private Boolean checkCache(HostInfo hostInfo) {
        Pair<Integer, Boolean> pair = this.mCallerChecked.get(hostInfo.getPackageName());
        if (pair != null && ((Integer) pair.first).intValue() == hostInfo.getUid()) {
            return (Boolean) pair.second;
        }
        return null;
    }

    private String getDigest(Signature signature) {
        byte[] byteArray = signature.toByteArray();
        MessageDigest messageDigest = getMessageDigest();
        if (messageDigest == null) {
            return null;
        }
        messageDigest.update(byteArray);
        byte[] bArrDigest = messageDigest.digest();
        StringBuilder sb = new StringBuilder((r0 * 3) - 1);
        for (byte b2 : bArrDigest) {
            sb.append(String.format("%02x", Byte.valueOf(b2)));
        }
        return sb.toString();
    }

    private static MessageDigest getMessageDigest() {
        try {
            return MessageDigest.getInstance("SHA256");
        } catch (NoSuchAlgorithmException e2) {
            Log.e(LogTags.TAG_HOST_VALIDATION, "Could not find SHA256 hash algorithm", e2);
            return null;
        }
    }

    private PackageInfo getPackageInfo(String str) {
        try {
            PackageManager packageManager = this.mPackageManager;
            if (packageManager != null) {
                return Api28Impl.getPackageInfo(packageManager, str);
            }
            Log.d(LogTags.TAG_HOST_VALIDATION, "PackageManager is null. Package info cannot be found for package " + str);
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w(LogTags.TAG_HOST_VALIDATION, "Package " + str + " not found", e2);
            return null;
        }
    }

    private Signature[] getSignatures(PackageInfo packageInfo) {
        return Api28Impl.getSignatures(packageInfo);
    }

    private static boolean hasPermissionGranted(PackageInfo packageInfo, String str) {
        if (packageInfo.requestedPermissionsFlags != null && packageInfo.requestedPermissions != null) {
            for (int i2 = 0; i2 < packageInfo.requestedPermissionsFlags.length; i2++) {
                if ((packageInfo.requestedPermissionsFlags[i2] & 2) != 0 && i2 < packageInfo.requestedPermissions.length && str.equals(packageInfo.requestedPermissions[i2])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isAllowListed(String str, Signature[] signatureArr) {
        List<String> list = this.mAllowedHosts.get(str);
        if (list == null) {
            return false;
        }
        for (Signature signature : signatureArr) {
            if (list.contains(getDigest(signature))) {
                return true;
            }
        }
        return false;
    }

    private void updateCache(HostInfo hostInfo, boolean z) {
        this.mCallerChecked.put(hostInfo.getPackageName(), Pair.create(Integer.valueOf(hostInfo.getUid()), Boolean.valueOf(z)));
    }

    private boolean validateHost(HostInfo hostInfo) {
        String packageName = hostInfo.getPackageName();
        PackageInfo packageInfo = getPackageInfo(packageName);
        if (packageInfo == null) {
            Log.w(LogTags.TAG_HOST_VALIDATION, "Rejected - package name " + packageName + " not found");
            return false;
        }
        Signature[] signatures = getSignatures(packageInfo);
        if (signatures == null || signatures.length == 0) {
            Log.w(LogTags.TAG_HOST_VALIDATION, "Package " + packageName + " is not signed or it has more than one signature");
            return false;
        }
        int i2 = packageInfo.applicationInfo.uid;
        if (i2 != hostInfo.getUid()) {
            throw new IllegalStateException("Host " + hostInfo + " doesn't match caller's actual UID " + i2);
        }
        boolean zHasPermissionGranted = hasPermissionGranted(packageInfo, TEMPLATE_RENDERER_PERMISSION);
        boolean zIsAllowListed = isAllowListed(packageName, signatures);
        if (i2 == Process.myUid()) {
            if (Log.isLoggable(LogTags.TAG_HOST_VALIDATION, 3)) {
                Log.d(LogTags.TAG_HOST_VALIDATION, "Accepted - Local service call");
            }
        } else if (zIsAllowListed) {
            if (Log.isLoggable(LogTags.TAG_HOST_VALIDATION, 3)) {
                Log.d(LogTags.TAG_HOST_VALIDATION, "Accepted - Host in allow-list");
            }
        } else if (i2 == 1000) {
            if (Log.isLoggable(LogTags.TAG_HOST_VALIDATION, 3)) {
                Log.d(LogTags.TAG_HOST_VALIDATION, "Accepted - System binding");
            }
        } else {
            if (!zHasPermissionGranted) {
                Log.e(LogTags.TAG_HOST_VALIDATION, String.format("Unrecognized host.\nIf this is a valid caller, please add the following to your CarAppService#createHostValidator() implementation:\nreturn new HostValidator.Builder(context)\n\t.addAllowedHost(\"%s\", \"%s\");\n\t.build()", packageName, getDigest(signatures[0])));
                return false;
            }
            if (Log.isLoggable(LogTags.TAG_HOST_VALIDATION, 3)) {
                Log.d(LogTags.TAG_HOST_VALIDATION, "Accepted - Host has android.car.permission.TEMPLATE_RENDERER");
            }
        }
        return true;
    }

    public Map<String, List<String>> getAllowedHosts() {
        return DesugarCollections.unmodifiableMap(this.mAllowedHosts);
    }

    public boolean isValidHost(HostInfo hostInfo) {
        Objects.requireNonNull(hostInfo);
        if (Log.isLoggable(LogTags.TAG_HOST_VALIDATION, 3)) {
            java.util.Objects.toString(hostInfo);
            Log.d(LogTags.TAG_HOST_VALIDATION, "Evaluating ".concat(String.valueOf(hostInfo)));
        }
        if (this.mAllowAllHosts) {
            if (!Log.isLoggable(LogTags.TAG_HOST_VALIDATION, 3)) {
                return true;
            }
            Log.d(LogTags.TAG_HOST_VALIDATION, "Accepted - Validator disabled, all hosts allowed");
            return true;
        }
        Boolean boolCheckCache = checkCache(hostInfo);
        if (boolCheckCache != null) {
            return boolCheckCache.booleanValue();
        }
        boolean zValidateHost = validateHost(hostInfo);
        updateCache(hostInfo, zValidateHost);
        return zValidateHost;
    }
}
