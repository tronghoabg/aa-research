package androidx.media3.extractor.metadata.emsg;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import com.google.d.b.an;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class EventMessageDecoder extends SimpleMetadataDecoder {
    public EventMessage decode(ParsableByteArray parsableByteArray) {
        String nullTerminatedString = parsableByteArray.readNullTerminatedString();
        an.B(nullTerminatedString);
        String nullTerminatedString2 = parsableByteArray.readNullTerminatedString();
        an.B(nullTerminatedString2);
        return new EventMessage(nullTerminatedString, nullTerminatedString2, parsableByteArray.readLong(), parsableByteArray.readLong(), Arrays.copyOfRange(parsableByteArray.getData(), parsableByteArray.getPosition(), parsableByteArray.limit()));
    }

    @Override // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    protected Metadata decode(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        return new Metadata(decode(new ParsableByteArray(byteBuffer.array(), byteBuffer.limit())));
    }
}
