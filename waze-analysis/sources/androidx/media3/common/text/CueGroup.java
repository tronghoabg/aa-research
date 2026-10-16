package androidx.media3.common.text;

import android.os.Bundle;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.Util;
import com.google.d.b.t;
import com.google.d.d.bi;
import com.google.d.d.bn;
import com.google.d.d.eq;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CueGroup {
    private static final eq<Cue> CUES_PRIORITY_COMPARATOR = eq.d().e(new t() { // from class: androidx.media3.common.text.CueGroup$$ExternalSyntheticLambda0
        @Override // com.google.d.b.t
        public final Object apply(Object obj) {
            return Integer.valueOf(((Cue) obj).zIndex);
        }
    });
    public static final CueGroup EMPTY_TIME_ZERO = new CueGroup(bn.p(), 0);
    private static final String FIELD_CUES = Util.intToStringMaxRadix(0);
    private static final String FIELD_PRESENTATION_TIME_US = Util.intToStringMaxRadix(1);
    public final bn<Cue> cues;
    public final long presentationTimeUs;

    public CueGroup(List<Cue> list, long j2) {
        this.cues = bn.x(CUES_PRIORITY_COMPARATOR, list);
        this.presentationTimeUs = j2;
    }

    private static bn<Cue> filterOutBitmapCues(List<Cue> list) {
        int i2 = bn.f7456d;
        bi biVar = new bi();
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (list.get(i3).bitmap == null) {
                biVar.g(list.get(i3));
            }
        }
        return biVar.f();
    }

    public static CueGroup fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_CUES);
        return new CueGroup(parcelableArrayList == null ? bn.p() : BundleCollectionUtil.fromBundleList(new t() { // from class: androidx.media3.common.text.CueGroup$$ExternalSyntheticLambda1
            @Override // com.google.d.b.t
            public final Object apply(Object obj) {
                return Cue.fromBundle((Bundle) obj);
            }
        }, parcelableArrayList), bundle.getLong(FIELD_PRESENTATION_TIME_US));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(FIELD_CUES, BundleCollectionUtil.toBundleArrayList(filterOutBitmapCues(this.cues), new t() { // from class: androidx.media3.common.text.CueGroup$$ExternalSyntheticLambda2
            @Override // com.google.d.b.t
            public final Object apply(Object obj) {
                return ((Cue) obj).toBinderBasedBundle();
            }
        }));
        bundle.putLong(FIELD_PRESENTATION_TIME_US, this.presentationTimeUs);
        return bundle;
    }
}
