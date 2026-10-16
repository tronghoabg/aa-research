package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.C;
import androidx.media3.common.util.ParsableByteArray;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public final List<Event> events;

    /* compiled from: WazeSource */
    public final class ComponentSplice {
        public final int componentTag;
        public final long utcSpliceTime;

        private ComponentSplice(int i2, long j2) {
            this.componentTag = i2;
            this.utcSpliceTime = j2;
        }
    }

    /* compiled from: WazeSource */
    public final class Event {
        public final boolean autoReturn;
        public final int availNum;
        public final int availsExpected;
        public final long breakDurationUs;
        public final List<ComponentSplice> componentSpliceList;
        public final boolean outOfNetworkIndicator;
        public final boolean programSpliceFlag;
        public final boolean spliceEventCancelIndicator;
        public final long spliceEventId;
        public final int uniqueProgramId;
        public final long utcSpliceTime;

        private Event(long j2, boolean z, boolean z2, boolean z3, List<ComponentSplice> list, long j3, boolean z4, long j4, int i2, int i3, int i4) {
            this.spliceEventId = j2;
            this.spliceEventCancelIndicator = z;
            this.outOfNetworkIndicator = z2;
            this.programSpliceFlag = z3;
            this.componentSpliceList = DesugarCollections.unmodifiableList(list);
            this.utcSpliceTime = j3;
            this.autoReturn = z4;
            this.breakDurationUs = j4;
            this.uniqueProgramId = i2;
            this.availNum = i3;
            this.availsExpected = i4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Event parseFromSection(ParsableByteArray parsableByteArray) {
            ArrayList arrayList;
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            boolean z4;
            long j3;
            int i2;
            int i3;
            int unsignedByte;
            boolean z5;
            long unsignedInt;
            long unsignedInt2 = parsableByteArray.readUnsignedInt();
            int unsignedByte2 = parsableByteArray.readUnsignedByte() & 128;
            ArrayList arrayList2 = new ArrayList();
            if (unsignedByte2 != 0) {
                arrayList = arrayList2;
                z = true;
            } else {
                arrayList = arrayList2;
                z = false;
            }
            if (z) {
                z2 = false;
                z3 = false;
                j2 = C.TIME_UNSET;
                z4 = false;
                j3 = C.TIME_UNSET;
                i2 = 0;
                i3 = 0;
                unsignedByte = 0;
            } else {
                int unsignedByte3 = parsableByteArray.readUnsignedByte();
                boolean z6 = (unsignedByte3 & 128) != 0;
                boolean z7 = (unsignedByte3 & 64) != 0;
                char c2 = ' ';
                int i4 = unsignedByte3 & 32;
                long unsignedInt3 = z7 ? parsableByteArray.readUnsignedInt() : C.TIME_UNSET;
                if (!z7) {
                    int unsignedByte4 = parsableByteArray.readUnsignedByte();
                    ArrayList arrayList3 = new ArrayList(unsignedByte4);
                    int i5 = 0;
                    while (i5 < unsignedByte4) {
                        arrayList3.add(new ComponentSplice(parsableByteArray.readUnsignedByte(), parsableByteArray.readUnsignedInt()));
                        i5++;
                        c2 = c2;
                    }
                    arrayList = arrayList3;
                }
                char c3 = c2;
                if (i4 != 0) {
                    long unsignedByte5 = parsableByteArray.readUnsignedByte();
                    boolean z8 = (128 & unsignedByte5) != 0;
                    unsignedInt = ((((unsignedByte5 & 1) << c3) | parsableByteArray.readUnsignedInt()) * 1000) / 90;
                    z5 = z8;
                } else {
                    z5 = false;
                    unsignedInt = C.TIME_UNSET;
                }
                int unsignedShort = parsableByteArray.readUnsignedShort();
                int unsignedByte6 = parsableByteArray.readUnsignedByte();
                unsignedByte = parsableByteArray.readUnsignedByte();
                long j4 = unsignedInt3;
                i2 = unsignedShort;
                i3 = unsignedByte6;
                z2 = z6;
                j2 = j4;
                z4 = z5;
                z3 = z7;
                j3 = unsignedInt;
            }
            return new Event(unsignedInt2, z, z2, z3, arrayList, j2, z4, j3, i2, i3, unsignedByte);
        }
    }

    private SpliceScheduleCommand(List<Event> list) {
        this.events = DesugarCollections.unmodifiableList(list);
    }

    static SpliceScheduleCommand parseFromSection(ParsableByteArray parsableByteArray) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        ArrayList arrayList = new ArrayList(unsignedByte);
        for (int i2 = 0; i2 < unsignedByte; i2++) {
            arrayList.add(Event.parseFromSection(parsableByteArray));
        }
        return new SpliceScheduleCommand(arrayList);
    }
}
