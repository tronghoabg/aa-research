package androidx.media3.extractor.metadata;

import androidx.media3.common.Metadata;
import com.google.d.b.an;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class SimpleMetadataDecoder implements MetadataDecoder {
    @Override // androidx.media3.extractor.metadata.MetadataDecoder
    public final Metadata decode(MetadataInputBuffer metadataInputBuffer) {
        ByteBuffer byteBuffer = metadataInputBuffer.data;
        an.B(byteBuffer);
        boolean z = false;
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        }
        an.l(z);
        return decode(metadataInputBuffer, byteBuffer);
    }

    protected abstract Metadata decode(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer);
}
