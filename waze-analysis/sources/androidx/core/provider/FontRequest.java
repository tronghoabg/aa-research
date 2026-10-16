package androidx.core.provider;

import android.util.Base64;
import androidx.core.util.Preconditions;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FontRequest {
    private final List<List<byte[]>> mCertificates;
    private final int mCertificatesArray;
    private final String mIdentifier;
    private final String mProviderAuthority;
    private final String mProviderPackage;
    private final String mQuery;
    private final String mSystemFont;
    private final String mVariationSettings;

    public FontRequest(String str, String str2, String str3, List<List<byte[]>> list, String str4, String str5) {
        Preconditions.checkNotNull(str);
        this.mProviderAuthority = str;
        Preconditions.checkNotNull(str2);
        this.mProviderPackage = str2;
        Preconditions.checkNotNull(str3);
        this.mQuery = str3;
        Preconditions.checkNotNull(list);
        this.mCertificates = list;
        this.mCertificatesArray = 0;
        this.mSystemFont = str4;
        this.mVariationSettings = str5;
        this.mIdentifier = createIdentifier(str, str2, str3, str4, str5);
    }

    private String createIdentifier(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        sb.append("-");
        sb.append(str4);
        if (str5 != null && !FontRequest$$ExternalSyntheticBackport0.m(str5)) {
            sb.append("-VF");
        }
        return sb.toString();
    }

    public List<List<byte[]>> getCertificates() {
        return this.mCertificates;
    }

    public int getCertificatesArrayResId() {
        return this.mCertificatesArray;
    }

    String getId() {
        return this.mIdentifier;
    }

    @Deprecated
    public String getIdentifier() {
        return this.mIdentifier;
    }

    public String getProviderAuthority() {
        return this.mProviderAuthority;
    }

    public String getProviderPackage() {
        return this.mProviderPackage;
    }

    public String getQuery() {
        return this.mQuery;
    }

    public String getSystemFont() {
        return this.mSystemFont;
    }

    public String getVariationSettings() {
        return this.mVariationSettings;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.mProviderAuthority + ", mProviderPackage: " + this.mProviderPackage + ", mQuery: " + this.mQuery + ", mSystemFont: " + this.mSystemFont + ", mVariationSettings: " + this.mVariationSettings + ", mCertificates:");
        for (int i2 = 0; i2 < this.mCertificates.size(); i2++) {
            sb.append(" [");
            List<byte[]> list = this.mCertificates.get(i2);
            for (int i3 = 0; i3 < list.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.mCertificatesArray);
        return sb.toString();
    }

    public FontRequest(String str, String str2, String str3, int i2, String str4) {
        this(str, str2, str3, i2, (String) null, str4);
    }

    private FontRequest(String str, String str2, String str3, int i2, String str4, String str5) {
        Preconditions.checkNotNull(str);
        this.mProviderAuthority = str;
        Preconditions.checkNotNull(str2);
        this.mProviderPackage = str2;
        Preconditions.checkNotNull(str3);
        this.mQuery = str3;
        this.mCertificates = null;
        Preconditions.checkArgument(i2 != 0);
        this.mCertificatesArray = i2;
        this.mSystemFont = str4;
        this.mVariationSettings = str5;
        this.mIdentifier = createIdentifier(str, str2, str3, null, str5);
    }

    public FontRequest(String str, String str2, String str3, List<List<byte[]>> list) {
        this(str, str2, str3, list, (String) null, (String) null);
    }

    public FontRequest(String str, String str2, String str3, List<List<byte[]>> list, String str4) {
        this(str, str2, str3, list, (String) null, str4);
    }

    public FontRequest(String str, String str2, String str3, int i2) {
        this(str, str2, str3, i2, (String) null, (String) null);
    }
}
