package androidx.car.app.validation;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.content.res.Resources;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import android.util.Pair;
import androidx.car.app.HostInfo;
import androidx.car.app.utils.LogTags;
import defpackage.ad;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class HostValidator {
    public static final HostValidator ALLOW_ALL_HOSTS_VALIDATOR = new HostValidator(null, new HashMap(), true);
    public static final String TEMPLATE_RENDERER_PERMISSION = "android.car.permission.TEMPLATE_RENDERER";
    private final boolean mAllowAllHosts;
    private final Map<String, List<String>> mAllowedHosts;
    private final Map<String, Pair<Integer, Boolean>> mCallerChecked = new HashMap();
    private final PackageManager mPackageManager;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Api28Impl {
        private Api28Impl() {
        }

        public static PackageInfo getPackageInfo(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 134221824);
        }

        public static Signature[] getSignatures(PackageInfo packageInfo) {
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo == null) {
                return null;
            }
            return signingInfo.getSigningCertificateHistory();
        }
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
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

        public Builder addAllowedHosts(int i) throws Resources.NotFoundException {
            String[] stringArray = this.mContext.getResources().getStringArray(i);
            if (stringArray == null) {
                throw new IllegalArgumentException(ad.b(i, "Invalid allowlist res id: "));
            }
            for (String str : stringArray) {
                String[] strArrSplit = str.split(",", -1);
                if (strArrSplit.length != 2) {
                    throw new IllegalArgumentException(ad.d("Invalid allowed host entry: '", str, "'"));
                }
                addAllowedHost(cleanUp(strArrSplit[1]), cleanUp(strArrSplit[0]));
            }
            return this;
        }

        public HostValidator build() {
            return new HostValidator(this.mContext.getPackageManager(), this.mAllowedHosts, false);
        }
    }

    public HostValidator(PackageManager packageManager, Map<String, List<String>> map, boolean z) {
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
        StringBuilder sb = new StringBuilder((bArrDigest.length * 3) - 1);
        for (byte b : bArrDigest) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    private static MessageDigest getMessageDigest() {
        try {
            return MessageDigest.getInstance("SHA256");
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private PackageInfo getPackageInfo(String str) {
        try {
            PackageManager packageManager = this.mPackageManager;
            if (packageManager == null) {
                return null;
            }
            return Build.VERSION.SDK_INT >= 28 ? Api28Impl.getPackageInfo(packageManager, str) : packageManager.getPackageInfo(str, 4160);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private Signature[] getSignatures(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getSignatures(packageInfo);
        }
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        return signatureArr;
    }

    private static boolean hasPermissionGranted(PackageInfo packageInfo, String str) {
        if (packageInfo.requestedPermissionsFlags != null && packageInfo.requestedPermissions != null) {
            int i = 0;
            while (true) {
                int[] iArr = packageInfo.requestedPermissionsFlags;
                if (i >= iArr.length) {
                    break;
                }
                if ((iArr[i] & 2) != 0) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i < strArr.length && str.equals(strArr[i])) {
                        return true;
                    }
                }
                i++;
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
        Signature[] signatures;
        String packageName = hostInfo.getPackageName();
        PackageInfo packageInfo = getPackageInfo(packageName);
        if (packageInfo == null || (signatures = getSignatures(packageInfo)) == null || signatures.length == 0) {
            return false;
        }
        int i = packageInfo.applicationInfo.uid;
        if (i != hostInfo.getUid()) {
            throw new IllegalStateException("Host " + hostInfo + " doesn't match caller's actual UID " + i);
        }
        boolean zHasPermissionGranted = hasPermissionGranted(packageInfo, TEMPLATE_RENDERER_PERMISSION);
        boolean zIsAllowListed = isAllowListed(packageName, signatures);
        if (i == Process.myUid()) {
            Log.isLoggable(LogTags.TAG_HOST_VALIDATION, 3);
            return true;
        }
        if (zIsAllowListed) {
            Log.isLoggable(LogTags.TAG_HOST_VALIDATION, 3);
            return true;
        }
        if (i == 1000) {
            Log.isLoggable(LogTags.TAG_HOST_VALIDATION, 3);
            return true;
        }
        if (zHasPermissionGranted) {
            Log.isLoggable(LogTags.TAG_HOST_VALIDATION, 3);
            return true;
        }
        String digest = getDigest(signatures[0]);
        StringBuilder sb = new StringBuilder("Unrecognized host.\nIf this is a valid caller, please add the following to your CarAppService#createHostValidator() implementation:\nreturn new HostValidator.Builder(context)\n\t.addAllowedHost(\"");
        sb.append(packageName);
        sb.append("\", \"");
        sb.append(digest);
        sb.append("\");\n\t.build()");
        return false;
    }

    public Map<String, List<String>> getAllowedHosts() {
        return Collections.unmodifiableMap(this.mAllowedHosts);
    }

    public boolean isValidHost(HostInfo hostInfo) {
        Objects.requireNonNull(hostInfo);
        if (Log.isLoggable(LogTags.TAG_HOST_VALIDATION, 3)) {
            hostInfo.toString();
        }
        if (this.mAllowAllHosts) {
            Log.isLoggable(LogTags.TAG_HOST_VALIDATION, 3);
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
