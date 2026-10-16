package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.util.ParsableByteArray;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PrivateCommand extends SpliceCommand {
    public final byte[] commandBytes;
    public final long identifier;
    public final long ptsAdjustment;

    private PrivateCommand(long j2, byte[] bArr, long j3) {
        this.ptsAdjustment = j3;
        this.identifier = j2;
        this.commandBytes = bArr;
    }

    static PrivateCommand parseFromSection(ParsableByteArray parsableByteArray, int i2, long j2) {
        int i3 = i2 - 4;
        long unsignedInt = parsableByteArray.readUnsignedInt();
        byte[] bArr = new byte[i3];
        parsableByteArray.readBytes(bArr, 0, i3);
        return new PrivateCommand(unsignedInt, bArr, j2);
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.ptsAdjustment + ", identifier= " + this.identifier + " }";
    }
}
