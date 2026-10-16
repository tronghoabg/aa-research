package androidx.credentials.provider;

import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import h.a.c;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.security.PublicKey;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SigningInfoCompat {
    public static final Companion Companion = new Companion(null);
    private final List<Signature> apkContentsSigners;
    private final boolean hasMultipleSigners;
    private final boolean hasPastSigningCertificates;
    private final Collection<PublicKey> publicKeys;
    private final int schemeVersion;
    private final List<Signature> signingCertificateHistory;

    /* JADX WARN: Multi-variable type inference failed */
    public SigningInfoCompat(List<? extends Signature> list, List<? extends Signature> list2, Collection<? extends PublicKey> collection, int i2, boolean z, boolean z2) {
        x.f(list, "signingCertificateHistory");
        x.f(list2, "apkContentsSigners");
        x.f(collection, "publicKeys");
        this.signingCertificateHistory = list;
        this.apkContentsSigners = list2;
        this.publicKeys = collection;
        this.schemeVersion = i2;
        this.hasPastSigningCertificates = z;
        this.hasMultipleSigners = z2;
    }

    public static final SigningInfoCompat fromSignatures(List<? extends Signature> list) {
        return Companion.fromSignatures(list);
    }

    public static final SigningInfoCompat fromSigningInfo(SigningInfo signingInfo) {
        return Companion.fromSigningInfo(signingInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SigningInfoCompat)) {
            return false;
        }
        SigningInfoCompat signingInfoCompat = (SigningInfoCompat) obj;
        return x.n(this.signingCertificateHistory, signingInfoCompat.signingCertificateHistory) && x.n(this.apkContentsSigners, signingInfoCompat.apkContentsSigners) && x.n(this.publicKeys, signingInfoCompat.publicKeys) && this.schemeVersion == signingInfoCompat.schemeVersion && this.hasPastSigningCertificates == signingInfoCompat.hasPastSigningCertificates && this.hasMultipleSigners == signingInfoCompat.hasMultipleSigners;
    }

    public final List<Signature> getApkContentsSigners() {
        return this.apkContentsSigners;
    }

    public final Collection<PublicKey> getPublicKeys() {
        return this.publicKeys;
    }

    public final int getSchemeVersion() {
        return this.schemeVersion;
    }

    public final List<Signature> getSigningCertificateHistory() {
        return this.signingCertificateHistory;
    }

    public final boolean hasMultipleSigners() {
        return this.hasMultipleSigners;
    }

    public final boolean hasPastSigningCertificates() {
        return this.hasPastSigningCertificates;
    }

    public int hashCode() {
        int iHashCode = (((this.signingCertificateHistory.hashCode() * 31) + this.apkContentsSigners.hashCode()) * 31) + this.publicKeys.hashCode();
        boolean z = this.hasMultipleSigners;
        return (((((iHashCode * 31) + this.schemeVersion) * 31) + SigningInfoCompat$$ExternalSyntheticBackport0.m(this.hasPastSigningCertificates)) * 31) + SigningInfoCompat$$ExternalSyntheticBackport0.m(z);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final SigningInfoCompat fromSignatures(List<? extends Signature> list) {
            x.f(list, "signatures");
            throw new IllegalArgumentException("Use SigningInfoCompat.fromSigningInfo(SigningInfo) instead");
        }

        public final SigningInfoCompat fromSigningInfo(SigningInfo signingInfo) {
            Set setP;
            x.f(signingInfo, "signingInfo");
            Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
            List listR = apkContentsSigners != null ? c.R(apkContentsSigners) : i.h();
            if (Build.VERSION.SDK_INT < 35 || (setP = signingInfo.getPublicKeys()) == null) {
                setP = e.c.d.a.p();
            }
            Collection collection = setP;
            int schemeVersion = Build.VERSION.SDK_INT >= 35 ? signingInfo.getSchemeVersion() : 0;
            Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            return new SigningInfoCompat(signingCertificateHistory != null ? c.R(signingCertificateHistory) : i.h(), listR, collection, schemeVersion, signingInfo.hasPastSigningCertificates(), signingInfo.hasMultipleSigners());
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
