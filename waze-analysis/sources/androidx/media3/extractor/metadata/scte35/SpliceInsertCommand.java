package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.C;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public final boolean autoReturn;
    public final int availNum;
    public final int availsExpected;
    public final long breakDurationUs;
    public final List<ComponentSplice> componentSpliceList;
    public final boolean outOfNetworkIndicator;
    public final boolean programSpliceFlag;
    public final long programSplicePlaybackPositionUs;
    public final long programSplicePts;
    public final boolean spliceEventCancelIndicator;
    public final long spliceEventId;
    public final boolean spliceImmediateFlag;
    public final int uniqueProgramId;

    /* compiled from: WazeSource */
    public final class ComponentSplice {
        public final long componentSplicePlaybackPositionUs;
        public final long componentSplicePts;
        public final int componentTag;

        private ComponentSplice(int i2, long j2, long j3) {
            this.componentTag = i2;
            this.componentSplicePts = j2;
            this.componentSplicePlaybackPositionUs = j3;
        }
    }

    private SpliceInsertCommand(long j2, boolean z, boolean z2, boolean z3, boolean z4, long j3, long j4, List<ComponentSplice> list, boolean z5, long j5, int i2, int i3, int i4) {
        this.spliceEventId = j2;
        this.spliceEventCancelIndicator = z;
        this.outOfNetworkIndicator = z2;
        this.programSpliceFlag = z3;
        this.spliceImmediateFlag = z4;
        this.programSplicePts = j3;
        this.programSplicePlaybackPositionUs = j4;
        this.componentSpliceList = DesugarCollections.unmodifiableList(list);
        this.autoReturn = z5;
        this.breakDurationUs = j5;
        this.uniqueProgramId = i2;
        this.availNum = i3;
        this.availsExpected = i4;
    }

    static SpliceInsertCommand parseFromSection(ParsableByteArray parsableByteArray, long j2, TimestampAdjuster timestampAdjuster) {
        List list;
        boolean z;
        boolean z2;
        boolean z3;
        long j3;
        boolean z4;
        long j4;
        int i2;
        int unsignedByte;
        int unsignedByte2;
        boolean z5;
        long unsignedInt;
        long unsignedInt2 = parsableByteArray.readUnsignedInt();
        int unsignedByte3 = parsableByteArray.readUnsignedByte() & 128;
        List list2 = Collections.EMPTY_LIST;
        boolean z6 = unsignedByte3 != 0;
        if (z6) {
            list = list2;
            z = false;
            z2 = false;
            z3 = false;
            j3 = C.TIME_UNSET;
            z4 = false;
            j4 = C.TIME_UNSET;
            i2 = 0;
            unsignedByte = 0;
            unsignedByte2 = 0;
        } else {
            int unsignedByte4 = parsableByteArray.readUnsignedByte();
            boolean z7 = (unsignedByte4 & 128) != 0;
            boolean z8 = (unsignedByte4 & 64) != 0;
            int i3 = unsignedByte4 & 32;
            boolean z9 = (unsignedByte4 & 16) != 0;
            long spliceTime = (!z8 || z9) ? C.TIME_UNSET : TimeSignalCommand.parseSpliceTime(parsableByteArray, j2);
            if (!z8) {
                int unsignedByte5 = parsableByteArray.readUnsignedByte();
                ArrayList arrayList = new ArrayList(unsignedByte5);
                for (int i4 = 0; i4 < unsignedByte5; i4++) {
                    int unsignedByte6 = parsableByteArray.readUnsignedByte();
                    long spliceTime2 = !z9 ? TimeSignalCommand.parseSpliceTime(parsableByteArray, j2) : C.TIME_UNSET;
                    arrayList.add(new ComponentSplice(unsignedByte6, spliceTime2, timestampAdjuster.adjustTsTimestamp(spliceTime2)));
                }
                list2 = arrayList;
            }
            if (i3 != 0) {
                long unsignedByte7 = parsableByteArray.readUnsignedByte();
                boolean z10 = (128 & unsignedByte7) != 0;
                unsignedInt = ((((unsignedByte7 & 1) << 32) | parsableByteArray.readUnsignedInt()) * 1000) / 90;
                z5 = z10;
            } else {
                z5 = false;
                unsignedInt = C.TIME_UNSET;
            }
            int unsignedShort = parsableByteArray.readUnsignedShort();
            long j5 = spliceTime;
            j4 = unsignedInt;
            j3 = j5;
            unsignedByte = parsableByteArray.readUnsignedByte();
            unsignedByte2 = parsableByteArray.readUnsignedByte();
            i2 = unsignedShort;
            z4 = z5;
            z3 = z9;
            z2 = z8;
            list = list2;
            z = z7;
        }
        return new SpliceInsertCommand(unsignedInt2, z6, z, z2, z3, j3, timestampAdjuster.adjustTsTimestamp(j3), list, z4, j4, i2, unsignedByte, unsignedByte2);
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.programSplicePts + ", programSplicePlaybackPositionUs= " + this.programSplicePlaybackPositionUs + " }";
    }
}
