package androidx.camera.common.internal;

import android.util.Size;
import androidx.camera.common.internal.StreamSizeImpl;
import h.g.b.o;
import h.g.b.x;
import h.i;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class StreamSize {
    public static final Companion Companion = new Companion(null);
    public static final StreamSize VGA = new StreamSizeImpl.Absolute(AbsoluteSizeEnum.VGA);
    public static final StreamSize XGA = new StreamSizeImpl.Absolute(AbsoluteSizeEnum.XGA);
    public static final StreamSize S720P_16_9 = new StreamSizeImpl.Absolute(AbsoluteSizeEnum.S720P_16_9);
    public static final StreamSize PREVIEW = new StreamSizeImpl.Abstract(AbstractSizeEnum.PREVIEW);
    public static final StreamSize S1080P_4_3 = new StreamSizeImpl.Absolute(AbsoluteSizeEnum.S1080P_4_3);
    public static final StreamSize S1080P_16_9 = new StreamSizeImpl.Absolute(AbsoluteSizeEnum.S1080P_16_9);
    public static final StreamSize S1440P_4_3 = new StreamSizeImpl.Absolute(AbsoluteSizeEnum.S1440P_4_3);
    public static final StreamSize S1440P_16_9 = new StreamSizeImpl.Absolute(AbsoluteSizeEnum.S1440P_16_9);
    public static final StreamSize UHD = new StreamSizeImpl.Absolute(AbsoluteSizeEnum.UHD);
    public static final StreamSize RECORD = new StreamSizeImpl.Abstract(AbstractSizeEnum.RECORD);
    public static final StreamSize MAXIMUM = new StreamSizeImpl.Abstract(AbstractSizeEnum.MAXIMUM);
    public static final StreamSize MAXIMUM_4_3 = new StreamSizeImpl.Abstract(AbstractSizeEnum.MAXIMUM_4_3);
    public static final StreamSize MAXIMUM_16_9 = new StreamSizeImpl.Abstract(AbstractSizeEnum.MAXIMUM_16_9);
    public static final StreamSize ULTRA_MAXIMUM = new StreamSizeImpl.Abstract(AbstractSizeEnum.ULTRA_MAXIMUM);

    public static final StreamSize from(Size size) {
        return Companion.from(size);
    }

    public abstract Size getAbsoluteSize();

    /* compiled from: WazeSource */
    public final class Companion {

        /* compiled from: WazeSource */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AbsoluteSizeEnum.values().length];
                try {
                    iArr[AbsoluteSizeEnum.VGA.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AbsoluteSizeEnum.XGA.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AbsoluteSizeEnum.S720P_16_9.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AbsoluteSizeEnum.S1080P_4_3.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AbsoluteSizeEnum.S1080P_16_9.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AbsoluteSizeEnum.S1440P_4_3.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AbsoluteSizeEnum.S1440P_16_9.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[AbsoluteSizeEnum.UHD.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public final StreamSize from(Size size) {
            AbsoluteSizeEnum next;
            x.f(size, "size");
            Iterator<AbsoluteSizeEnum> it = AbsoluteSizeEnum.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (x.n(next.getSize(), size)) {
                    break;
                }
            }
            AbsoluteSizeEnum absoluteSizeEnum = next;
            if (absoluteSizeEnum == null) {
                return new StreamSizeImpl.Custom(size);
            }
            switch (absoluteSizeEnum.ordinal()) {
                case 0:
                    return StreamSize.VGA;
                case 1:
                    return StreamSize.XGA;
                case 2:
                    return StreamSize.S720P_16_9;
                case 3:
                    return StreamSize.S1080P_4_3;
                case 4:
                    return StreamSize.S1080P_16_9;
                case 5:
                    return StreamSize.S1440P_4_3;
                case 6:
                    return StreamSize.S1440P_16_9;
                case 7:
                    return StreamSize.UHD;
                default:
                    throw new i();
            }
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
