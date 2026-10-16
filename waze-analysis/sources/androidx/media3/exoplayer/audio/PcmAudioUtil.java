package androidx.media3.exoplayer.audio;

import androidx.camera.video.AudioStats;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PcmAudioUtil {
    private PcmAudioUtil() {
    }

    public static ByteBuffer rampUpVolume(ByteBuffer byteBuffer, int i2, int i3, int i4, int i5) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
        int iPosition = byteBuffer.position();
        while (byteBuffer.hasRemaining() && i4 < i5) {
            write32BitIntPcm(byteBufferOrder, (int) ((readAs32BitIntPcm(byteBuffer, i2) * i4) / i5), i2);
            if (byteBuffer.position() == iPosition + i3) {
                i4++;
                iPosition = byteBuffer.position();
            }
        }
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.flip();
        return byteBufferOrder;
    }

    public static int readAs32BitIntPcm(ByteBuffer byteBuffer, int i2) {
        float fConstrainValue;
        double dConstrainValue;
        if (i2 == 2) {
            return ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 24);
        }
        if (i2 == 3) {
            return (byteBuffer.get() & 255) << 24;
        }
        if (i2 != 4) {
            if (i2 == 21) {
                return ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 24);
            }
            if (i2 == 22) {
                int i3 = byteBuffer.get() & 255;
                int i4 = (byteBuffer.get() & 255) << 8;
                return i3 | i4 | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 24);
            }
            if (i2 == 268435456) {
                return ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
            }
            if (i2 == 1342177280) {
                return ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
            }
            if (i2 == 1610612736) {
                int i5 = (byteBuffer.get() & 255) << 24;
                int i6 = (byteBuffer.get() & 255) << 16;
                return i5 | i6 | ((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255);
            }
            if (i2 == 1879048192) {
                dConstrainValue = Util.constrainValue(byteBuffer.getDouble(), -1.0d, 1.0d);
                if (dConstrainValue >= AudioStats.AUDIO_AMPLITUDE_NONE) {
                    return (int) (dConstrainValue * 2.147483647E9d);
                }
            } else if (i2 == 1895825408) {
                fConstrainValue = Util.constrainValue(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt())), -1.0f, 1.0f);
                if (fConstrainValue >= 0.0f) {
                    return (int) (fConstrainValue * 2.1474836E9f);
                }
            } else {
                if (i2 != 1912602624) {
                    throw new IllegalStateException();
                }
                dConstrainValue = Util.constrainValue(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong())), -1.0d, 1.0d);
                if (dConstrainValue >= AudioStats.AUDIO_AMPLITUDE_NONE) {
                    return (int) (dConstrainValue * 2.147483647E9d);
                }
            }
            return (int) ((-dConstrainValue) * (-2.147483648E9d));
        }
        fConstrainValue = Util.constrainValue(byteBuffer.getFloat(), -1.0f, 1.0f);
        if (fConstrainValue >= 0.0f) {
            return (int) (fConstrainValue * 2.1474836E9f);
        }
        return (int) ((-fConstrainValue) * (-2.1474836E9f));
    }

    public static void write32BitIntPcm(ByteBuffer byteBuffer, int i2, int i3) {
        if (i3 == 2) {
            byteBuffer.put((byte) (i2 >> 16));
            byteBuffer.put((byte) (i2 >> 24));
            return;
        }
        if (i3 == 3) {
            byteBuffer.put((byte) (i2 >> 24));
            return;
        }
        if (i3 == 4) {
            if (i2 < 0) {
                byteBuffer.putFloat((-i2) / (-2.1474836E9f));
                return;
            } else {
                byteBuffer.putFloat(i2 / 2.1474836E9f);
                return;
            }
        }
        if (i3 == 21) {
            byteBuffer.put((byte) (i2 >> 8));
            byteBuffer.put((byte) (i2 >> 16));
            byteBuffer.put((byte) (i2 >> 24));
            return;
        }
        if (i3 == 22) {
            byteBuffer.put((byte) i2);
            byteBuffer.put((byte) (i2 >> 8));
            byteBuffer.put((byte) (i2 >> 16));
            byteBuffer.put((byte) (i2 >> 24));
            return;
        }
        if (i3 == 268435456) {
            byteBuffer.put((byte) (i2 >> 24));
            byteBuffer.put((byte) (i2 >> 16));
            return;
        }
        if (i3 == 1342177280) {
            byteBuffer.put((byte) (i2 >> 24));
            byteBuffer.put((byte) (i2 >> 16));
            byteBuffer.put((byte) (i2 >> 8));
            return;
        }
        if (i3 == 1610612736) {
            byteBuffer.put((byte) (i2 >> 24));
            byteBuffer.put((byte) (i2 >> 16));
            byteBuffer.put((byte) (i2 >> 8));
            byteBuffer.put((byte) i2);
            return;
        }
        if (i3 == 1879048192) {
            if (i2 < 0) {
                byteBuffer.putDouble((-i2) / (-2.147483648E9d));
                return;
            } else {
                byteBuffer.putDouble(i2 / 2.147483647E9d);
                return;
            }
        }
        if (i3 == 1895825408) {
            byteBuffer.putInt(Integer.reverseBytes(Float.floatToIntBits(i2 < 0 ? (-i2) / (-2.1474836E9f) : i2 / 2.1474836E9f)));
        } else {
            if (i3 != 1912602624) {
                throw new IllegalStateException();
            }
            byteBuffer.putLong(Long.reverseBytes(Double.doubleToLongBits(i2 < 0 ? (-i2) / (-2.147483648E9d) : i2 / 2.147483647E9d)));
        }
    }
}
