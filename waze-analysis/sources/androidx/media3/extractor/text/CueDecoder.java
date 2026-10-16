package androidx.media3.extractor.text;

import android.os.Bundle;
import android.os.Parcel;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.BundleCollectionUtil;
import com.google.d.b.an;
import com.google.d.b.t;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CueDecoder {
    static final String BUNDLE_FIELD_CUES = "c";
    static final String BUNDLE_FIELD_DURATION_US = "d";

    public CuesWithTiming decode(long j2, byte[] bArr, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, i2, i3);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(BUNDLE_FIELD_CUES);
        an.B(parcelableArrayList);
        return new CuesWithTiming(BundleCollectionUtil.fromBundleList(new t() { // from class: androidx.media3.extractor.text.CueDecoder$$ExternalSyntheticLambda0
            @Override // com.google.d.b.t
            public final Object apply(Object obj) {
                return Cue.fromBundle((Bundle) obj);
            }
        }, parcelableArrayList), j2, bundle.getLong("d"));
    }
}
