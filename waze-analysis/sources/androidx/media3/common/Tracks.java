package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.Util;
import com.google.d.b.an;
import com.google.d.b.t;
import com.google.d.d.bn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Tracks {
    public static final Tracks EMPTY = new Tracks(bn.p());
    private static final String FIELD_TRACK_GROUPS = Util.intToStringMaxRadix(0);
    private final bn<Group> groups;

    public Tracks(List<Group> list) {
        this.groups = bn.n(list);
    }

    public static Tracks fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_TRACK_GROUPS);
        return new Tracks(parcelableArrayList == null ? bn.p() : BundleCollectionUtil.fromBundleList(new t() { // from class: androidx.media3.common.Tracks$$ExternalSyntheticLambda1
            @Override // com.google.d.b.t
            public final Object apply(Object obj) {
                return Tracks.Group.fromBundle((Bundle) obj);
            }
        }, parcelableArrayList));
    }

    public boolean containsType(int i2) {
        for (int i3 = 0; i3 < this.groups.size(); i3++) {
            if (this.groups.get(i3).getType() == i2) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.groups.equals(((Tracks) obj).groups);
    }

    public bn<Group> getGroups() {
        return this.groups;
    }

    public int hashCode() {
        return this.groups.hashCode();
    }

    public boolean isEmpty() {
        return this.groups.isEmpty();
    }

    public boolean isTypeSelected(int i2) {
        for (int i3 = 0; i3 < this.groups.size(); i3++) {
            Group group = this.groups.get(i3);
            if (group.isSelected() && group.getType() == i2) {
                return true;
            }
        }
        return false;
    }

    public boolean isTypeSupported(int i2, boolean z) {
        for (int i3 = 0; i3 < this.groups.size(); i3++) {
            if (this.groups.get(i3).getType() == i2 && this.groups.get(i3).isSupported(z)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public boolean isTypeSupportedOrEmpty(int i2, boolean z) {
        return !containsType(i2) || isTypeSupported(i2, z);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(FIELD_TRACK_GROUPS, BundleCollectionUtil.toBundleArrayList(this.groups, new t() { // from class: androidx.media3.common.Tracks$$ExternalSyntheticLambda0
            @Override // com.google.d.b.t
            public final Object apply(Object obj) {
                return ((Tracks.Group) obj).toBundle();
            }
        }));
        return bundle;
    }

    /* compiled from: WazeSource */
    public final class Group {
        private final boolean adaptiveSupported;
        public final int length;
        private final TrackGroup mediaTrackGroup;
        private final boolean[] trackSelected;
        private final int[] trackSupport;
        private static final String FIELD_TRACK_GROUP = Util.intToStringMaxRadix(0);
        private static final String FIELD_TRACK_SUPPORT = Util.intToStringMaxRadix(1);
        private static final String FIELD_TRACK_SELECTED = Util.intToStringMaxRadix(3);
        private static final String FIELD_ADAPTIVE_SUPPORTED = Util.intToStringMaxRadix(4);

        public Group(TrackGroup trackGroup, boolean z, int[] iArr, boolean[] zArr) {
            int i2 = trackGroup.length;
            this.length = i2;
            an.l(i2 == iArr.length && i2 == zArr.length);
            this.mediaTrackGroup = trackGroup;
            this.adaptiveSupported = z && i2 > 1;
            this.trackSupport = (int[]) iArr.clone();
            this.trackSelected = (boolean[]) zArr.clone();
        }

        public static Group fromBundle(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(FIELD_TRACK_GROUP);
            an.B(bundle2);
            TrackGroup trackGroupFromBundle = TrackGroup.fromBundle(bundle2);
            return new Group(trackGroupFromBundle, bundle.getBoolean(FIELD_ADAPTIVE_SUPPORTED, false), (int[]) an.I(bundle.getIntArray(FIELD_TRACK_SUPPORT), new int[trackGroupFromBundle.length]), (boolean[]) an.I(bundle.getBooleanArray(FIELD_TRACK_SELECTED), new boolean[trackGroupFromBundle.length]));
        }

        public Group copyWithId(String str) {
            return new Group(this.mediaTrackGroup.copyWithId(str), this.adaptiveSupported, this.trackSupport, this.trackSelected);
        }

        public Group copyWithMediaTrackGroup(TrackGroup trackGroup) {
            return new Group(trackGroup, this.adaptiveSupported, this.trackSupport, this.trackSelected);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                Group group = (Group) obj;
                if (this.adaptiveSupported == group.adaptiveSupported && this.mediaTrackGroup.equals(group.mediaTrackGroup) && Arrays.equals(this.trackSupport, group.trackSupport) && Arrays.equals(this.trackSelected, group.trackSelected)) {
                    return true;
                }
            }
            return false;
        }

        public TrackGroup getMediaTrackGroup() {
            return this.mediaTrackGroup;
        }

        public Format getTrackFormat(int i2) {
            return this.mediaTrackGroup.getFormat(i2);
        }

        public int getTrackSupport(int i2) {
            return this.trackSupport[i2];
        }

        public int getType() {
            return this.mediaTrackGroup.type;
        }

        public int hashCode() {
            return (((((this.mediaTrackGroup.hashCode() * 31) + (this.adaptiveSupported ? 1 : 0)) * 31) + Arrays.hashCode(this.trackSupport)) * 31) + Arrays.hashCode(this.trackSelected);
        }

        public boolean isAdaptiveSupported() {
            return this.adaptiveSupported;
        }

        public boolean isSelected() {
            for (boolean z : this.trackSelected) {
                if (z) {
                    return true;
                }
            }
            return false;
        }

        public boolean isSupported(boolean z) {
            for (int i2 = 0; i2 < this.trackSupport.length; i2++) {
                if (isTrackSupported(i2, z)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isTrackSelected(int i2) {
            return this.trackSelected[i2];
        }

        public boolean isTrackSupported(int i2, boolean z) {
            int i3 = this.trackSupport[i2];
            if (i3 != 4) {
                return z && i3 == 3;
            }
            return true;
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(FIELD_TRACK_GROUP, this.mediaTrackGroup.toBundle());
            bundle.putIntArray(FIELD_TRACK_SUPPORT, this.trackSupport);
            bundle.putBooleanArray(FIELD_TRACK_SELECTED, this.trackSelected);
            bundle.putBoolean(FIELD_ADAPTIVE_SUPPORTED, this.adaptiveSupported);
            return bundle;
        }

        public boolean isTrackSupported(int i2) {
            return isTrackSupported(i2, false);
        }

        public boolean isSupported() {
            return isSupported(false);
        }
    }

    @Deprecated
    public boolean isTypeSupportedOrEmpty(int i2) {
        return isTypeSupportedOrEmpty(i2, false);
    }

    public boolean isTypeSupported(int i2) {
        return isTypeSupported(i2, false);
    }
}
