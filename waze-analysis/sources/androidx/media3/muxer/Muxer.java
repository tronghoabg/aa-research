package androidx.media3.muxer;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import com.google.d.d.bn;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface Muxer extends AutoCloseable {

    /* compiled from: WazeSource */
    public interface Factory {

        /* compiled from: WazeSource */
        /* renamed from: androidx.media3.muxer.Muxer$Factory$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static boolean $default$supportsWritingNegativeTimestampsInEditList(Factory factory) {
                return false;
            }
        }

        Muxer create(String str);

        bn<String> getSupportedSampleMimeTypes(int i2);

        boolean supportsWritingNegativeTimestampsInEditList();
    }

    void addMetadataEntry(Metadata.Entry entry);

    int addTrack(Format format);

    @Override // java.lang.AutoCloseable
    void close();

    void writeSampleData(int i2, ByteBuffer byteBuffer, BufferInfo bufferInfo);
}
