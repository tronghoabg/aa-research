package androidx.credentials.provider;

import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Bundle;
import android.support.v7.widget.be$$ExternalSyntheticApiModelOutline0;
import androidx.credentials.provider.CallingAppInfo;
import androidx.credentials.provider.utils.PrivilegedApp;
import androidx.credentials.provider.utils.RequestValidationUtil;
import h.a.c;
import h.a.i;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CallingAppInfo {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_CREDENTIAL_REQUEST_ORIGIN = "androidx.credentials.provider.extra.CREDENTIAL_REQUEST_ORIGIN";
    private static final String EXTRA_CREDENTIAL_REQUEST_PACKAGE_NAME = "androidx.credentials.provider.extra.CREDENTIAL_REQUEST_PACKAGE_NAME";
    private static final String EXTRA_CREDENTIAL_REQUEST_SIGNATURES = "androidx.credentials.provider.extra.CREDENTIAL_REQUEST_SIGNATURES";
    private static final String EXTRA_CREDENTIAL_REQUEST_SIGNING_INFO = "androidx.credentials.provider.extra.CREDENTIAL_REQUEST_SIGNING_INFO";
    private final String origin;
    private final String packageName;
    private SigningInfo signingInfo;
    private final SigningInfoCompat signingInfoCompat;

    /* compiled from: WazeSource */
    final class SignatureVerifier {
        private final SigningInfoCompat signingInfoCompat;

        public SignatureVerifier(SigningInfoCompat signingInfoCompat) {
            x.f(signingInfoCompat, "signingInfoCompat");
            this.signingInfoCompat = signingInfoCompat;
        }

        private final Set<String> convertToFingerprints(List<? extends Signature> list) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<? extends Signature> it = list.iterator();
            while (it.hasNext()) {
                byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(it.next().toByteArray());
                x.c(bArrDigest);
                linkedHashSet.add(c.aC(bArrDigest, ":", null, null, new l() { // from class: androidx.credentials.provider.CallingAppInfo$SignatureVerifier$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return CallingAppInfo.SignatureVerifier.convertToFingerprints$lambda$0(((Byte) obj).byteValue());
                    }
                }, 30));
            }
            return linkedHashSet;
        }

        static final CharSequence convertToFingerprints$lambda$0(byte b2) {
            String str = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1));
            x.e(str, "format(...)");
            return str;
        }

        private final Set<String> getSignatureFingerprints() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            SigningInfoCompat signingInfoCompat = this.signingInfoCompat;
            List<Signature> apkContentsSigners = signingInfoCompat.getApkContentsSigners();
            if (signingInfoCompat.hasMultipleSigners() && !apkContentsSigners.isEmpty()) {
                linkedHashSet.addAll(convertToFingerprints(apkContentsSigners));
                return linkedHashSet;
            }
            if (!this.signingInfoCompat.getSigningCertificateHistory().isEmpty()) {
                linkedHashSet.addAll(convertToFingerprints(i.d(this.signingInfoCompat.getSigningCertificateHistory().get(0))));
            }
            return linkedHashSet;
        }

        public final boolean verifySignatureFingerprints(Set<String> set) {
            x.f(set, "candidateSigFingerprints");
            SigningInfoCompat signingInfoCompat = this.signingInfoCompat;
            Set<String> signatureFingerprints = getSignatureFingerprints();
            return signingInfoCompat.hasMultipleSigners() ? set.containsAll(signatureFingerprints) : !i.as(set, signatureFingerprints).isEmpty();
        }
    }

    private CallingAppInfo(String str, String str2, SigningInfoCompat signingInfoCompat, SigningInfo signingInfo) {
        this.packageName = str;
        this.origin = str2;
        this.signingInfoCompat = signingInfoCompat;
        x.c(signingInfo);
        this.signingInfo = signingInfo;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("packageName must not be empty");
        }
    }

    private final boolean isAppPrivileged(List<PrivilegedApp> list) {
        for (PrivilegedApp privilegedApp : list) {
            if (x.n(privilegedApp.getPackageName(), this.packageName)) {
                return isAppPrivileged(privilegedApp.getFingerprints());
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallingAppInfo)) {
            return false;
        }
        CallingAppInfo callingAppInfo = (CallingAppInfo) obj;
        return x.n(this.packageName, callingAppInfo.packageName) && x.n(this.origin, callingAppInfo.origin) && x.n(this.signingInfoCompat, callingAppInfo.signingInfoCompat);
    }

    public final String getOrigin(String str) {
        x.f(str, "privilegedAllowlist");
        if (!RequestValidationUtil.Companion.isValidJSON(str)) {
            throw new IllegalArgumentException("privilegedAllowlist must not be empty, and must be a valid JSON");
        }
        if (this.origin == null) {
            return null;
        }
        try {
            if (isAppPrivileged(PrivilegedApp.Companion.extractPrivilegedApps$credentials(new JSONObject(str)))) {
                return this.origin;
            }
            throw new IllegalStateException("Origin is not being returned as the calling app did notmatch the privileged allowlist");
        } catch (JSONException unused) {
            throw new IllegalArgumentException("privilegedAllowlist must be formatted properly");
        }
    }

    public final String getOrigin$credentials() {
        return this.origin;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final SigningInfo getSigningInfo() {
        SigningInfo signingInfo = this.signingInfo;
        if (signingInfo != null) {
            return signingInfo;
        }
        x.j("signingInfo");
        return null;
    }

    public final SigningInfoCompat getSigningInfoCompat() {
        return this.signingInfoCompat;
    }

    public int hashCode() {
        int iHashCode = this.packageName.hashCode() * 31;
        String str = this.origin;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.signingInfoCompat.hashCode();
    }

    public final boolean isOriginPopulated() {
        return this.origin != null;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ CallingAppInfo create$default(Companion companion, String str, SigningInfo signingInfo, String str2, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                str2 = null;
            }
            return companion.create(str, signingInfo, str2);
        }

        public final CallingAppInfo create(String str, SigningInfo signingInfo, String str2) {
            x.f(str, "packageName");
            x.f(signingInfo, "signingInfo");
            return new CallingAppInfo(str, signingInfo, str2);
        }

        public final CallingAppInfo extractCallingAppInfo(Bundle bundle) {
            SigningInfo signingInfoM96m;
            x.f(bundle, "bundle");
            String string = bundle.getString(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_ORIGIN);
            String string2 = bundle.getString(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_PACKAGE_NAME);
            if (string2 == null || (signingInfoM96m = be$$ExternalSyntheticApiModelOutline0.m96m((Object) bundle.getParcelable(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_SIGNING_INFO))) == null) {
                return null;
            }
            return create(string2, signingInfoM96m, string);
        }

        public final void setCallingAppInfo$credentials(Bundle bundle, CallingAppInfo callingAppInfo) {
            x.f(bundle, "<this>");
            x.f(callingAppInfo, "info");
            bundle.putString(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_ORIGIN, callingAppInfo.getOrigin$credentials());
            bundle.putString(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_PACKAGE_NAME, callingAppInfo.getPackageName());
            bundle.putParcelable(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_SIGNING_INFO, callingAppInfo.getSigningInfo());
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public static /* synthetic */ CallingAppInfo create$default(Companion companion, String str, List list, String str2, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                str2 = null;
            }
            return companion.create(str, (List<? extends Signature>) list, str2);
        }

        public final CallingAppInfo create(String str, List<? extends Signature> list, String str2) {
            x.f(str, "packageName");
            x.f(list, "signatures");
            return new CallingAppInfo(str, list, str2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallingAppInfo(String str, List<? extends Signature> list) {
        this(str, list, (String) null, 4, (o) null);
        x.f(str, "packageName");
        x.f(list, "signatures");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallingAppInfo(String str, SigningInfo signingInfo, String str2) {
        this(str, str2, SigningInfoCompat.Companion.fromSigningInfo(signingInfo), signingInfo);
        x.f(str, "packageName");
        x.f(signingInfo, "signingInfo");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallingAppInfo(String str, List<? extends Signature> list, String str2) {
        this(str, str2, SigningInfoCompat.Companion.fromSignatures(list), null);
        x.f(str, "packageName");
        x.f(list, "signatures");
    }

    public /* synthetic */ CallingAppInfo(String str, List list, String str2, int i2, o oVar) {
        this(str, (List<? extends Signature>) list, (i2 & 4) != 0 ? null : str2);
    }

    public /* synthetic */ CallingAppInfo(String str, SigningInfo signingInfo, String str2, int i2, o oVar) {
        this(str, signingInfo, (i2 & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallingAppInfo(String str, SigningInfo signingInfo) {
        this(str, signingInfo, (String) null, 4, (o) null);
        x.f(str, "packageName");
        x.f(signingInfo, "signingInfo");
    }

    private final boolean isAppPrivileged(Set<String> set) {
        return new SignatureVerifier(this.signingInfoCompat).verifySignatureFingerprints(set);
    }
}
