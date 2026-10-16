package androidx.camera.core;

import android.util.Size;
import androidx.camera.core.ImageProxy;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ImageProxyDownsampler {

    /* compiled from: WazeSource */
    enum DownsamplingMethod {
        NEAREST_NEIGHBOR,
        AVERAGING
    }

    /* compiled from: WazeSource */
    final class ForwardingImageProxyImpl extends ForwardingImageProxy {
        private final int mDownsampledHeight;
        private final ImageProxy.PlaneProxy[] mDownsampledPlanes;
        private final int mDownsampledWidth;

        ForwardingImageProxyImpl(ImageProxy imageProxy, ImageProxy.PlaneProxy[] planeProxyArr, int i2, int i3) {
            super(imageProxy);
            this.mDownsampledPlanes = planeProxyArr;
            this.mDownsampledWidth = i2;
            this.mDownsampledHeight = i3;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public int getHeight() {
            return this.mDownsampledHeight;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public ImageProxy.PlaneProxy[] getPlanes() {
            return this.mDownsampledPlanes;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public int getWidth() {
            return this.mDownsampledWidth;
        }
    }

    private ImageProxyDownsampler() {
    }

    private static ImageProxy.PlaneProxy createPlaneProxy(int i2, int i3, byte[] bArr) {
        return new ImageProxy.PlaneProxy(bArr, i2, i3) { // from class: androidx.camera.core.ImageProxyDownsampler.1
            final ByteBuffer mBuffer;
            final /* synthetic */ byte[] val$data;
            final /* synthetic */ int val$pixelStride;
            final /* synthetic */ int val$rowStride;

            {
                this.val$data = bArr;
                this.val$rowStride = i2;
                this.val$pixelStride = i3;
                this.mBuffer = ByteBuffer.wrap(bArr);
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public ByteBuffer getBuffer() {
                return this.mBuffer;
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public int getPixelStride() {
                return this.val$pixelStride;
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public int getRowStride() {
                return this.val$rowStride;
            }
        };
    }

    static ForwardingImageProxy downsample(ImageProxy imageProxy, int i2, int i3, DownsamplingMethod downsamplingMethod) {
        byte[] bArr;
        int i4;
        byte[] bArr2;
        if (imageProxy.getFormat() != 35) {
            throw new UnsupportedOperationException("Only YUV_420_888 format is currently supported.");
        }
        if (imageProxy.getWidth() < i2 || imageProxy.getHeight() < i3) {
            throw new IllegalArgumentException("Downsampled dimension " + new Size(i2, i3) + " is not <= original dimension " + new Size(imageProxy.getWidth(), imageProxy.getHeight()) + ".");
        }
        if (imageProxy.getWidth() == i2 && imageProxy.getHeight() == i3) {
            return new ForwardingImageProxyImpl(imageProxy, imageProxy.getPlanes(), i2, i3);
        }
        int[] iArr = {imageProxy.getWidth(), imageProxy.getWidth() / 2, imageProxy.getWidth() / 2};
        int[] iArr2 = {imageProxy.getHeight(), imageProxy.getHeight() / 2, imageProxy.getHeight() / 2};
        int i5 = i2 / 2;
        int[] iArr3 = {i2, i5, i5};
        int i6 = i3 / 2;
        int[] iArr4 = {i3, i6, i6};
        ImageProxy.PlaneProxy[] planeProxyArr = new ImageProxy.PlaneProxy[3];
        for (int i7 = 0; i7 < 3; i7++) {
            ImageProxy.PlaneProxy planeProxy = imageProxy.getPlanes()[i7];
            ByteBuffer buffer = planeProxy.getBuffer();
            byte[] bArr3 = new byte[iArr3[i7] * iArr4[i7]];
            int iOrdinal = downsamplingMethod.ordinal();
            if (iOrdinal == 0) {
                bArr = bArr3;
                int i8 = iArr[i7];
                int pixelStride = planeProxy.getPixelStride();
                int rowStride = planeProxy.getRowStride();
                i4 = 1;
                resizeNearestNeighbor(buffer, i8, pixelStride, rowStride, iArr2[i7], bArr, iArr3[i7], iArr4[i7]);
            } else if (iOrdinal != 1) {
                bArr2 = bArr3;
                i4 = 1;
                planeProxyArr[i7] = createPlaneProxy(iArr3[i7], i4, bArr2);
            } else {
                bArr = bArr3;
                int i9 = iArr[i7];
                int pixelStride2 = planeProxy.getPixelStride();
                int rowStride2 = planeProxy.getRowStride();
                i4 = 1;
                resizeAveraging(buffer, i9, pixelStride2, rowStride2, iArr2[i7], bArr, iArr3[i7], iArr4[i7]);
            }
            bArr2 = bArr;
            planeProxyArr[i7] = createPlaneProxy(iArr3[i7], i4, bArr2);
        }
        return new ForwardingImageProxyImpl(imageProxy, planeProxyArr, i2, i3);
    }

    private static void resizeAveraging(ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, byte[] bArr, int i6, int i7) {
        byte[] bArr2 = new byte[i4];
        byte[] bArr3 = new byte[i4];
        int[] iArr = new int[i6];
        float f2 = i5 / i7;
        int i8 = 0;
        for (int i9 = 0; i9 < i6; i9++) {
            iArr[i9] = ((int) (i9 * (i2 / i6))) * i3;
        }
        synchronized (byteBuffer) {
            byteBuffer.rewind();
            int i10 = 0;
            while (i10 < i7) {
                int i11 = (int) (i10 * f2);
                int i12 = i5 - 1;
                int iMin = Math.min(i11, i12) * i4;
                int iMin2 = Math.min(i11 + 1, i12) * i4;
                int i13 = i10 * i6;
                byteBuffer.position(iMin);
                byteBuffer.get(bArr2, i8, Math.min(i4, byteBuffer.remaining()));
                byteBuffer.position(iMin2);
                byteBuffer.get(bArr3, i8, Math.min(i4, byteBuffer.remaining()));
                for (int i14 = i8; i14 < i6; i14++) {
                    int i15 = iArr[i14];
                    int i16 = i15 + i3;
                    bArr[i13 + i14] = (byte) (((((bArr2[i15] & 255) + (bArr2[i16] & 255)) + (bArr3[i15] & 255)) + (bArr3[i16] & 255)) >> 2);
                }
                i10++;
                i8 = 0;
            }
        }
    }

    private static void resizeNearestNeighbor(ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, byte[] bArr, int i6, int i7) {
        byte[] bArr2 = new byte[i4];
        int[] iArr = new int[i6];
        float f2 = i5 / i7;
        for (int i8 = 0; i8 < i6; i8++) {
            iArr[i8] = ((int) (i8 * (i2 / i6))) * i3;
        }
        synchronized (byteBuffer) {
            byteBuffer.rewind();
            for (int i9 = 0; i9 < i7; i9++) {
                int i10 = i9 * i6;
                byteBuffer.position(Math.min((int) (i9 * f2), i5 - 1) * i4);
                byteBuffer.get(bArr2, 0, Math.min(i4, byteBuffer.remaining()));
                for (int i11 = 0; i11 < i6; i11++) {
                    bArr[i10 + i11] = bArr2[iArr[i11]];
                }
            }
        }
    }
}
