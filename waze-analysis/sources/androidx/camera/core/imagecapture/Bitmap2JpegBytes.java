package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class Bitmap2JpegBytes implements Operation<In, Packet<byte[]>> {

    /* compiled from: WazeSource */
    class Api34Impl {
        private Api34Impl() {
        }

        static boolean hasGainmap(Bitmap bitmap) {
            return bitmap.hasGainmap();
        }
    }

    /* compiled from: WazeSource */
    public abstract class In {
        public static In of(Packet<Bitmap> packet, int i2) {
            return new AutoValue_Bitmap2JpegBytes_In(packet, i2);
        }

        abstract int getJpegQuality();

        abstract Packet<Bitmap> getPacket();
    }

    private static int getOutputFormat(Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 34 || !Api34Impl.hasGainmap(bitmap)) ? 256 : 4101;
    }

    @Override // androidx.camera.core.processing.Operation
    public Packet<byte[]> apply(In in) {
        Packet<Bitmap> packet = in.getPacket();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        packet.getData().compress(Bitmap.CompressFormat.JPEG, in.getJpegQuality(), byteArrayOutputStream);
        return Packet.of(byteArrayOutputStream.toByteArray(), (Exif) Objects.requireNonNull(packet.getExif()), getOutputFormat(packet.getData()), packet.getSize(), packet.getCropRect(), packet.getRotationDegrees(), packet.getSensorToBufferTransform(), packet.getCameraCaptureResult());
    }
}
