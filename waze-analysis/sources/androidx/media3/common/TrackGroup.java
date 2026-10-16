package androidx.media3.common;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.google.d.b.an;
import com.google.d.b.t;
import com.google.d.d.bn;
import com.waze.strings.DisplayStrings;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class TrackGroup {
    private static final String FIELD_FORMATS = Util.intToStringMaxRadix(0);
    private static final String FIELD_ID = Util.intToStringMaxRadix(1);
    private static final String TAG = "TrackGroup";
    private final Format[] formats;
    private int hashCode;
    public final String id;
    public final int length;
    public final int type;

    public TrackGroup(String str, Format... formatArr) {
        int length = formatArr.length;
        an.l(length > 0);
        this.id = str;
        this.formats = formatArr;
        this.length = length;
        String str2 = formatArr[0].sampleMimeType;
        this.type = TextUtils.isEmpty(str2) ? MimeTypes.getTrackType(formatArr[0].containerMimeType) : MimeTypes.getTrackType(str2);
        verifyCorrectness();
    }

    public static TrackGroup fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_FORMATS);
        return new TrackGroup(bundle.getString(FIELD_ID, ""), (Format[]) (parcelableArrayList == null ? bn.p() : BundleCollectionUtil.fromBundleList(new t() { // from class: androidx.media3.common.TrackGroup$$ExternalSyntheticLambda0
            @Override // com.google.d.b.t
            public final Object apply(Object obj) {
                return Format.fromBundle((Bundle) obj);
            }
        }, parcelableArrayList)).toArray(new Format[0]));
    }

    private static void logErrorMessage(String str, String str2, String str3, int i2) {
        Log.e(TAG, "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i2 + ")"));
    }

    private static String normalizeLanguage(String str) {
        return (str == null || str.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str;
    }

    private static int normalizeRoleFlags(int i2) {
        return i2 | 16384;
    }

    private void verifyCorrectness() {
        Format format = this.formats[0];
        String strNormalizeLanguage = normalizeLanguage(format.language);
        int iNormalizeRoleFlags = normalizeRoleFlags(format.roleFlags);
        int i2 = 1;
        while (true) {
            Format[] formatArr = this.formats;
            if (i2 >= formatArr.length) {
                return;
            }
            Format format2 = formatArr[i2];
            String str = format2.language;
            if (!strNormalizeLanguage.equals(normalizeLanguage(str))) {
                logErrorMessage("languages", formatArr[0].language, str, i2);
                return;
            } else {
                if (iNormalizeRoleFlags != normalizeRoleFlags(format2.roleFlags)) {
                    logErrorMessage("role flags", Integer.toBinaryString(formatArr[0].roleFlags), Integer.toBinaryString(this.formats[i2].roleFlags), i2);
                    return;
                }
                i2++;
            }
        }
    }

    public TrackGroup copyWithId(String str) {
        return new TrackGroup(str, this.formats);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TrackGroup trackGroup = (TrackGroup) obj;
            if (this.id.equals(trackGroup.id) && Arrays.equals(this.formats, trackGroup.formats)) {
                return true;
            }
        }
        return false;
    }

    public Format getFormat(int i2) {
        return this.formats[i2];
    }

    public int hashCode() {
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = ((this.id.hashCode() + DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL) * 31) + Arrays.hashCode(this.formats);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    public int indexOf(Format format) {
        int i2 = 0;
        while (true) {
            Format[] formatArr = this.formats;
            if (i2 >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i2]) {
                return i2;
            }
            i2++;
        }
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.formats.length);
        for (Format format : this.formats) {
            arrayList.add(format.toBundle());
        }
        bundle.putParcelableArrayList(FIELD_FORMATS, arrayList);
        bundle.putString(FIELD_ID, this.id);
        return bundle;
    }

    public String toString() {
        return this.id + ": " + Arrays.toString(this.formats);
    }

    public TrackGroup(Format... formatArr) {
        this("", formatArr);
    }
}
