package androidx.media3.extractor;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import com.google.d.b.ab;
import com.google.d.d.bn;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class GaplessInfoHolder {
    private static final Pattern GAPLESS_COMMENT_PATTERN = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    private static final String GAPLESS_DESCRIPTION = "iTunSMPB";
    private static final String GAPLESS_DOMAIN = "com.apple.iTunes";
    public int encoderDelay = -1;
    public int encoderPadding = -1;

    static /* synthetic */ boolean lambda$setFromMetadata$1(InternalFrame internalFrame) {
        return internalFrame.domain.equals(GAPLESS_DOMAIN) && internalFrame.description.equals(GAPLESS_DESCRIPTION);
    }

    private boolean setFromComment(String str) throws NumberFormatException {
        Matcher matcher = GAPLESS_COMMENT_PATTERN.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i2 = Util.SDK_INT;
            String str2 = strGroup;
            int i3 = Integer.parseInt(strGroup, 16);
            String strGroup2 = matcher.group(2);
            String str3 = strGroup2;
            int i4 = Integer.parseInt(strGroup2, 16);
            if (i3 <= 0 && i4 <= 0) {
                return false;
            }
            this.encoderDelay = i3;
            this.encoderPadding = i4;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean hasGaplessInfo() {
        return (this.encoderDelay == -1 || this.encoderPadding == -1) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean setFromMetadata(Metadata metadata) throws NumberFormatException {
        bn matchingEntries = metadata.getMatchingEntries(CommentFrame.class, new ab() { // from class: androidx.media3.extractor.GaplessInfoHolder$$ExternalSyntheticLambda0
            @Override // com.google.d.b.ab
            public final boolean apply(Object obj) {
                return ((CommentFrame) obj).description.equals(GaplessInfoHolder.GAPLESS_DESCRIPTION);
            }
        });
        int size = matchingEntries.size();
        int i2 = 0;
        while (i2 < size) {
            boolean fromComment = setFromComment(((CommentFrame) matchingEntries.get(i2)).text);
            i2++;
            if (fromComment) {
                return true;
            }
        }
        bn matchingEntries2 = metadata.getMatchingEntries(InternalFrame.class, new ab() { // from class: androidx.media3.extractor.GaplessInfoHolder$$ExternalSyntheticLambda1
            @Override // com.google.d.b.ab
            public final boolean apply(Object obj) {
                return GaplessInfoHolder.lambda$setFromMetadata$1((InternalFrame) obj);
            }
        });
        int size2 = matchingEntries2.size();
        int i3 = 0;
        while (i3 < size2) {
            boolean fromComment2 = setFromComment(((InternalFrame) matchingEntries2.get(i3)).text);
            i3++;
            if (fromComment2) {
                return true;
            }
        }
        return false;
    }
}
