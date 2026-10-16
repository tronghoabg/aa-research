package androidx.media3.extractor.metadata.vorbis;

import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import com.google.d.b.an;
import com.google.d.l.j;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class VorbisComment implements Metadata.Entry {
    public final String key;
    public final String value;

    public VorbisComment(String str, String str2) {
        this.key = an.L(str);
        this.value = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VorbisComment vorbisComment = (VorbisComment) obj;
            if (this.key.equals(vorbisComment.key) && this.value.equals(vorbisComment.value)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return null;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public /* synthetic */ Format getWrappedMetadataFormat() {
        return null;
    }

    public int hashCode() {
        return ((this.key.hashCode() + DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL) * 31) + this.value.hashCode();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.media3.common.Metadata.Entry
    public void populateMediaMetadata(MediaMetadata.Builder builder) {
        Integer numL;
        Integer numL2;
        Integer numL3;
        Integer numL4;
        String str = this.key;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS") && (numL = j.l(this.value)) != null) {
                    builder.setTotalTrackCount(numL);
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS") && (numL2 = j.l(this.value)) != null) {
                    builder.setTotalDiscCount(numL2);
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER") && (numL3 = j.l(this.value)) != null) {
                    builder.setTrackNumber(numL3);
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    builder.setAlbumTitle(this.value);
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    builder.setGenre(this.value);
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    builder.setTitle(this.value);
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    builder.setDescription(this.value);
                    break;
                }
                break;
            case 905239725:
                if (str.equals("DISCSUBTITLE")) {
                    builder.setDiscSubtitle(this.value);
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER") && (numL4 = j.l(this.value)) != null) {
                    builder.setDiscNumber(numL4);
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    builder.setAlbumArtist(this.value);
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    builder.setArtist(this.value);
                    break;
                }
                break;
        }
    }

    public String toString() {
        return "VC: " + this.key + "=" + this.value;
    }
}
