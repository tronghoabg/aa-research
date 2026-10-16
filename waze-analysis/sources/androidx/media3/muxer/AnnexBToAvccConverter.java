package androidx.media3.muxer;

import com.google.d.d.bn;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface AnnexBToAvccConverter {
    public static final AnnexBToAvccConverter DEFAULT = new AnnexBToAvccConverter() { // from class: androidx.media3.muxer.AnnexBToAvccConverter.1
        @Override // androidx.media3.muxer.AnnexBToAvccConverter
        public ByteBuffer process(ByteBuffer byteBuffer, ByteBufferAllocator byteBufferAllocator) {
            if (!byteBuffer.hasRemaining()) {
                return byteBuffer;
            }
            bn<ByteBuffer> bnVarFindNalUnits = AnnexBUtils.findNalUnits(byteBuffer);
            int iRemaining = 0;
            for (int i2 = 0; i2 < bnVarFindNalUnits.size(); i2++) {
                iRemaining += bnVarFindNalUnits.get(i2).remaining() + 4;
            }
            ByteBuffer byteBufferAllocate = byteBufferAllocator.allocate(iRemaining);
            for (int i3 = 0; i3 < bnVarFindNalUnits.size(); i3++) {
                ByteBuffer byteBuffer2 = bnVarFindNalUnits.get(i3);
                byteBufferAllocate.putInt(byteBuffer2.remaining());
                byteBufferAllocate.put(byteBuffer2);
            }
            byteBufferAllocate.rewind();
            byteBuffer.position(byteBuffer.limit());
            return byteBufferAllocate;
        }

        @Override // androidx.media3.muxer.AnnexBToAvccConverter
        public ByteBuffer process(ByteBuffer byteBuffer) {
            return process(byteBuffer, ByteBufferAllocator.DEFAULT);
        }
    };

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.muxer.AnnexBToAvccConverter$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    ByteBuffer process(ByteBuffer byteBuffer);

    ByteBuffer process(ByteBuffer byteBuffer, ByteBufferAllocator byteBufferAllocator);
}
