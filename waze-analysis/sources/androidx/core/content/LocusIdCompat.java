package androidx.core.content;

import android.content.LocusId;
import androidx.core.util.Preconditions;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class LocusIdCompat {
    private final String mId;
    private final LocusId mWrapped;

    /* compiled from: WazeSource */
    class Api29Impl {
        private Api29Impl() {
        }

        static LocusId create(String str) {
            return new LocusId(str);
        }

        static String getId(LocusId locusId) {
            return locusId.getId();
        }
    }

    public LocusIdCompat(String str) {
        Preconditions.checkStringNotEmpty(str, "id cannot be empty");
        this.mId = str;
        this.mWrapped = Api29Impl.create(str);
    }

    private String getSanitizedId() {
        return this.mId.length() + "_chars";
    }

    public static LocusIdCompat toLocusIdCompat(LocusId locusId) {
        Preconditions.checkNotNull(locusId, "locusId cannot be null");
        String id = Api29Impl.getId(locusId);
        Preconditions.checkStringNotEmpty(id, "id cannot be empty");
        return new LocusIdCompat(id);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LocusIdCompat locusIdCompat = (LocusIdCompat) obj;
        String str = this.mId;
        return str == null ? locusIdCompat.mId == null : str.equals(locusIdCompat.mId);
    }

    public String getId() {
        return this.mId;
    }

    public int hashCode() {
        String str = this.mId;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public LocusId toLocusId() {
        return this.mWrapped;
    }

    public String toString() {
        return "LocusIdCompat[" + getSanitizedId() + "]";
    }
}
