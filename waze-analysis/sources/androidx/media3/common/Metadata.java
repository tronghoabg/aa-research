package androidx.media3.common;

import a.a;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.Util;
import com.google.d.b.ab;
import com.google.d.b.an;
import com.google.d.d.bi;
import com.google.d.d.bn;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Metadata {
    private final Entry[] entries;
    public final long presentationTimeUs;

    /* compiled from: WazeSource */
    public interface Entry {

        /* compiled from: WazeSource */
        /* renamed from: androidx.media3.common.Metadata$Entry$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static byte[] $default$getWrappedMetadataBytes(Entry entry) {
                return null;
            }

            public static Format $default$getWrappedMetadataFormat(Entry entry) {
                return null;
            }

            public static void $default$populateMediaMetadata(Entry entry, MediaMetadata.Builder builder) {
            }
        }

        byte[] getWrappedMetadataBytes();

        Format getWrappedMetadataFormat();

        void populateMediaMetadata(MediaMetadata.Builder builder);
    }

    public Metadata(long j2, List<? extends Entry> list) {
        this(j2, (Entry[]) list.toArray(new Entry[0]));
    }

    private <T extends Entry> T entryIfMatches(Entry entry, Class<T> cls, ab<T> abVar) {
        if (!cls.isAssignableFrom(entry.getClass())) {
            return null;
        }
        T tCast = cls.cast(entry);
        if (abVar.apply(tCast)) {
            return tCast;
        }
        return null;
    }

    public Metadata copyWithAppendedEntries(Entry... entryArr) {
        return entryArr.length == 0 ? this : new Metadata(this.presentationTimeUs, (Entry[]) Util.nullSafeArrayConcatenation(this.entries, entryArr));
    }

    public Metadata copyWithAppendedEntriesFrom(Metadata metadata) {
        return metadata == null ? this : copyWithAppendedEntries(metadata.entries);
    }

    public Metadata copyWithPresentationTimeUs(long j2) {
        return this.presentationTimeUs == j2 ? this : new Metadata(j2, this.entries);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Metadata metadata = (Metadata) obj;
            if (Arrays.equals(this.entries, metadata.entries) && this.presentationTimeUs == metadata.presentationTimeUs) {
                return true;
            }
        }
        return false;
    }

    public Entry get(int i2) {
        return this.entries[i2];
    }

    public <T extends Entry> bn<T> getEntriesOfType(Class<T> cls) {
        int i2 = bn.f7456d;
        bi biVar = new bi();
        for (Entry entry : this.entries) {
            if (cls.isAssignableFrom(entry.getClass())) {
                biVar.g(cls.cast(entry));
            }
        }
        return biVar.f();
    }

    public <T extends Entry> T getFirstEntryOfType(Class<T> cls) {
        return (T) getFirstMatchingEntry(cls, an.j());
    }

    public <T extends Entry> T getFirstMatchingEntry(Class<T> cls, ab<T> abVar) {
        for (Entry entry : this.entries) {
            T t = (T) entryIfMatches(entry, cls, abVar);
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    public <T extends Entry> bn<T> getMatchingEntries(Class<T> cls, ab<T> abVar) {
        int i2 = bn.f7456d;
        bi biVar = new bi();
        for (Entry entry : this.entries) {
            Entry entryEntryIfMatches = entryIfMatches(entry, cls, abVar);
            if (entryEntryIfMatches != null) {
                biVar.g(entryEntryIfMatches);
            }
        }
        return biVar.f();
    }

    public int hashCode() {
        return (Arrays.hashCode(this.entries) * 31) + a.b(this.presentationTimeUs);
    }

    public int length() {
        return this.entries.length;
    }

    public String toString() {
        String str;
        long j2 = this.presentationTimeUs;
        String string = Arrays.toString(this.entries);
        if (j2 == C.TIME_UNSET) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j2;
        }
        return "entries=" + string + str;
    }

    public Metadata(long j2, Entry... entryArr) {
        this.presentationTimeUs = j2;
        this.entries = entryArr;
    }

    public Metadata(List<? extends Entry> list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(Entry... entryArr) {
        this(C.TIME_UNSET, entryArr);
    }
}
