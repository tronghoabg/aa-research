package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.C;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.d.b.an;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Mp4WebvttParser implements SubtitleParser {
    private static final int BOX_HEADER_SIZE = 8;
    public static final int CUE_REPLACEMENT_BEHAVIOR = 2;
    private static final int TYPE_payl = 1885436268;
    private static final int TYPE_sttg = 1937011815;
    private static final int TYPE_vttc = 1987343459;
    private final ParsableByteArray parsableByteArray = new ParsableByteArray();

    private static Cue parseVttCueBox(ParsableByteArray parsableByteArray, int i2) {
        CharSequence cueText = null;
        Cue.Builder cueSettingsList = null;
        while (i2 > 0) {
            an.m(i2 >= 8, "Incomplete vtt cue box header found.");
            int i3 = parsableByteArray.readInt();
            int i4 = parsableByteArray.readInt();
            int i5 = i2 - 8;
            int i6 = i3 - 8;
            String strFromUtf8Bytes = Util.fromUtf8Bytes(parsableByteArray.getData(), parsableByteArray.getPosition(), i6);
            parsableByteArray.skipBytes(i6);
            if (i4 == TYPE_sttg) {
                cueSettingsList = WebvttCueParser.parseCueSettingsList(strFromUtf8Bytes);
            } else if (i4 == TYPE_payl) {
                cueText = WebvttCueParser.parseCueText(null, strFromUtf8Bytes.trim(), Collections.EMPTY_LIST);
            }
            i2 = i5 - i6;
        }
        if (cueText == null) {
            cueText = "";
        }
        if (cueSettingsList == null) {
            return WebvttCueParser.newCueForText(cueText);
        }
        cueSettingsList.setText(cueText);
        return cueSettingsList.build();
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 2;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i2, int i3, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        this.parsableByteArray.reset(bArr, i3 + i2);
        this.parsableByteArray.setPosition(i2);
        ArrayList arrayList = new ArrayList();
        while (this.parsableByteArray.bytesLeft() > 0) {
            an.m(this.parsableByteArray.bytesLeft() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            ParsableByteArray parsableByteArray = this.parsableByteArray;
            int i4 = parsableByteArray.readInt() - 8;
            int i5 = parsableByteArray.readInt();
            ParsableByteArray parsableByteArray2 = this.parsableByteArray;
            if (i5 == TYPE_vttc) {
                arrayList.add(parseVttCueBox(parsableByteArray2, i4));
            } else {
                parsableByteArray2.skipBytes(i4);
            }
        }
        consumer.accept(new CuesWithTiming(arrayList, C.TIME_UNSET, C.TIME_UNSET));
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public /* synthetic */ Subtitle parseToLegacySubtitle(byte[] bArr, int i2, int i3) {
        return SubtitleParser.CC.$default$parseToLegacySubtitle(this, bArr, i2, i3);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public /* synthetic */ void reset() {
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public /* synthetic */ void parse(byte[] bArr, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        parse(bArr, 0, bArr.length, outputOptions, consumer);
    }
}
