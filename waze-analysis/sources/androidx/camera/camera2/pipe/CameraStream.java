package androidx.camera.camera2.pipe;

import android.util.Size;
import androidx.camera.camera2.pipe.OutputStream;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraStream {
    private final int id;
    private final List<OutputStream> outputs;

    /* JADX WARN: Multi-variable type inference failed */
    private CameraStream(int i2, List<? extends OutputStream> list) {
        x.f(list, "outputs");
        this.id = i2;
        this.outputs = list;
    }

    /* renamed from: getId-ptHMqGs, reason: not valid java name */
    public final int m578getIdptHMqGs() {
        return this.id;
    }

    public final List<OutputStream> getOutputs() {
        return this.outputs;
    }

    public String toString() {
        return StreamId.m979toStringimpl(this.id);
    }

    /* compiled from: WazeSource */
    public final class Config {
        public static final Companion Companion = new Companion(null);
        private final ImageSourceConfig imageSourceConfig;
        private final List<OutputStream.Config> outputs;

        /* JADX WARN: Multi-variable type inference failed */
        public Config(List<? extends OutputStream.Config> list, ImageSourceConfig imageSourceConfig) {
            x.f(list, "outputs");
            this.outputs = list;
            this.imageSourceConfig = imageSourceConfig;
            OutputStream.Config config = (OutputStream.Config) i.P(list);
            List<? extends OutputStream.Config> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return;
            }
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (!StreamFormat.m922equalsimpl0(((OutputStream.Config) it.next()).m765getFormat8FPWQzE(), config.m765getFormat8FPWQzE())) {
                    throw new IllegalStateException("All outputs must have the same format!");
                }
            }
        }

        public final ImageSourceConfig getImageSourceConfig() {
            return this.imageSourceConfig;
        }

        public final List<OutputStream.Config> getOutputs() {
            return this.outputs;
        }

        public String toString() {
            return "CameraStream.Config(outputs=" + this.outputs + ", imageSourceConfig=" + this.imageSourceConfig + ")";
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public static /* synthetic */ Config create$default(Companion companion, OutputStream.Config config, ImageSourceConfig imageSourceConfig, int i2, Object obj) {
                if ((i2 & 2) != 0) {
                    imageSourceConfig = null;
                }
                return companion.create(config, imageSourceConfig);
            }

            /* renamed from: create-LbzH4Vg$default, reason: not valid java name */
            public static /* synthetic */ Config m579createLbzH4Vg$default(Companion companion, Size size, int i2, String str, OutputStream.OutputType outputType, OutputStream.MirrorMode mirrorMode, OutputStream.TimestampBase timestampBase, OutputStream.DynamicRangeProfile dynamicRangeProfile, OutputStream.StreamUseCase streamUseCase, OutputStream.StreamUseHint streamUseHint, List list, ImageSourceConfig imageSourceConfig, int i3, Object obj) {
                ImageSourceConfig imageSourceConfig2;
                Companion companion2;
                Size size2;
                int i4;
                OutputStream.OutputType surface = (i3 & 8) != 0 ? OutputStream.OutputType.Companion.getSURFACE() : outputType;
                OutputStream.MirrorMode mirrorMode2 = (i3 & 16) != 0 ? null : mirrorMode;
                OutputStream.TimestampBase timestampBase2 = (i3 & 32) != 0 ? null : timestampBase;
                OutputStream.DynamicRangeProfile dynamicRangeProfile2 = (i3 & 64) != 0 ? null : dynamicRangeProfile;
                OutputStream.StreamUseCase streamUseCase2 = (i3 & 128) != 0 ? null : streamUseCase;
                OutputStream.StreamUseHint streamUseHint2 = (i3 & 256) != 0 ? null : streamUseHint;
                List listH = (i3 & 512) != 0 ? i.h() : list;
                String str2 = (i3 & 4) != 0 ? null : str;
                if ((i3 & 1024) != 0) {
                    imageSourceConfig2 = null;
                    size2 = size;
                    i4 = i2;
                    companion2 = companion;
                } else {
                    imageSourceConfig2 = imageSourceConfig;
                    companion2 = companion;
                    size2 = size;
                    i4 = i2;
                }
                return companion2.m580createLbzH4Vg(size2, i4, str2, surface, mirrorMode2, timestampBase2, dynamicRangeProfile2, streamUseCase2, streamUseHint2, listH, imageSourceConfig2);
            }

            public final Config create(OutputStream.Config config, ImageSourceConfig imageSourceConfig) {
                x.f(config, "output");
                return new Config(i.d(config), imageSourceConfig);
            }

            /* renamed from: create-LbzH4Vg, reason: not valid java name */
            public final Config m580createLbzH4Vg(Size size, int i2, String str, OutputStream.OutputType outputType, OutputStream.MirrorMode mirrorMode, OutputStream.TimestampBase timestampBase, OutputStream.DynamicRangeProfile dynamicRangeProfile, OutputStream.StreamUseCase streamUseCase, OutputStream.StreamUseHint streamUseHint, List<OutputStream.SensorPixelMode> list, ImageSourceConfig imageSourceConfig) {
                x.f(size, "size");
                x.f(outputType, "outputType");
                x.f(list, "sensorPixelModes");
                return create(OutputStream.Config.Companion.m772createvBYXiEU(size, i2, str, outputType, mirrorMode, timestampBase, dynamicRangeProfile, streamUseCase, streamUseHint, list), imageSourceConfig);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }

            public static /* synthetic */ Config create$default(Companion companion, List list, ImageSourceConfig imageSourceConfig, int i2, Object obj) {
                if ((i2 & 2) != 0) {
                    imageSourceConfig = null;
                }
                return companion.create((List<? extends OutputStream.Config>) list, imageSourceConfig);
            }

            public final Config create(List<? extends OutputStream.Config> list, ImageSourceConfig imageSourceConfig) {
                x.f(list, "outputs");
                return new Config(list, imageSourceConfig);
            }
        }

        public /* synthetic */ Config(List list, ImageSourceConfig imageSourceConfig, int i2, o oVar) {
            this(list, (i2 & 2) != 0 ? null : imageSourceConfig);
        }
    }

    public /* synthetic */ CameraStream(int i2, List list, o oVar) {
        this(i2, list);
    }
}
