package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.o;
import h.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class Brush {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long intrinsicSize;

    private Brush() {
        this.intrinsicSize = Size.Companion.m8057getUnspecifiedNHjbRc();
    }

    /* renamed from: applyTo-Pq9zytI, reason: not valid java name */
    public abstract void mo8173applyToPq9zytI(long j2, Paint paint, float f2);

    /* renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo8174getIntrinsicSizeNHjbRc() {
        return this.intrinsicSize;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m8175horizontalGradient8A3gB4$default(Companion companion, List list, float f2, float f3, int i2, int i3, Object obj) {
            if ((i3 & 8) != 0) {
                i2 = TileMode.Companion.m8653getClamp3opZhB0();
            }
            int i4 = i3 & 4;
            int i5 = i3 & 2;
            if (i4 != 0) {
                f3 = Float.POSITIVE_INFINITY;
            }
            if (i5 != 0) {
                f2 = 0.0f;
            }
            return companion.m8186horizontalGradient8A3gB4((List<Color>) list, f2, f3, i2);
        }

        /* renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ Brush m8177linearGradientmHitzGk$default(Companion companion, List list, long j2, long j3, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                j2 = Offset.Companion.m7996getZeroF1C5BW0();
            }
            long j4 = j2;
            if ((i3 & 4) != 0) {
                j3 = Offset.Companion.m7994getInfiniteF1C5BW0();
            }
            long j5 = j3;
            if ((i3 & 8) != 0) {
                i2 = TileMode.Companion.m8653getClamp3opZhB0();
            }
            return companion.m8188linearGradientmHitzGk((List<Color>) list, j4, j5, i2);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ Brush m8179radialGradientP_VxKs$default(Companion companion, List list, long j2, float f2, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                j2 = Offset.Companion.m7995getUnspecifiedF1C5BW0();
            }
            long j3 = j2;
            if ((i3 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            float f3 = f2;
            if ((i3 & 8) != 0) {
                i2 = TileMode.Companion.m8653getClamp3opZhB0();
            }
            return companion.m8190radialGradientP_VxKs((List<Color>) list, j3, f3, i2);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ Brush m8181sweepGradientUv8p0NA$default(Companion companion, List list, long j2, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j2 = Offset.Companion.m7995getUnspecifiedF1C5BW0();
            }
            return companion.m8192sweepGradientUv8p0NA((List<Color>) list, j2);
        }

        /* renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m8183verticalGradient8A3gB4$default(Companion companion, List list, float f2, float f3, int i2, int i3, Object obj) {
            if ((i3 & 8) != 0) {
                i2 = TileMode.Companion.m8653getClamp3opZhB0();
            }
            int i4 = i3 & 4;
            int i5 = i3 & 2;
            if (i4 != 0) {
                f3 = Float.POSITIVE_INFINITY;
            }
            if (i5 != 0) {
                f2 = 0.0f;
            }
            return companion.m8194verticalGradient8A3gB4((List<Color>) list, f2, f3, i2);
        }

        /* renamed from: composite-7EN7VTw, reason: not valid java name */
        public final Brush m8185composite7EN7VTw(Brush brush, Brush brush2, int i2) {
            return new CompositeShaderBrush(BrushKt.toShaderBrush(brush), BrushKt.toShaderBrush(brush2), i2, null);
        }

        /* renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m8187horizontalGradient8A3gB4(k<Float, Color>[] kVarArr, float f2, float f3, int i2) {
            k<Float, Color>[] kVarArr2 = (k[]) Arrays.copyOf(kVarArr, kVarArr.length);
            long jFloatToRawIntBits = Float.floatToRawIntBits(f2);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(f3);
            return m8189linearGradientmHitzGk(kVarArr2, (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32), (jFloatToRawIntBits3 << 32) | (Float.floatToRawIntBits(0.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), i2);
        }

        /* renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final Brush m8189linearGradientmHitzGk(k<Float, Color>[] kVarArr, long j2, long j3, int i2) {
            ArrayList arrayList = new ArrayList(kVarArr.length);
            for (k<Float, Color> kVar : kVarArr) {
                arrayList.add(Color.m8218boximpl(((Color) kVar.d()).m8238unboximpl()));
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(kVarArr.length);
            for (k<Float, Color> kVar2 : kVarArr) {
                arrayList3.add(Float.valueOf(((Number) kVar2.c()).floatValue()));
            }
            return new LinearGradient(arrayList2, arrayList3, j2, j3, i2, null);
        }

        /* renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final Brush m8191radialGradientP_VxKs(k<Float, Color>[] kVarArr, long j2, float f2, int i2) {
            ArrayList arrayList = new ArrayList(kVarArr.length);
            for (k<Float, Color> kVar : kVarArr) {
                arrayList.add(Color.m8218boximpl(((Color) kVar.d()).m8238unboximpl()));
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(kVarArr.length);
            for (k<Float, Color> kVar2 : kVarArr) {
                arrayList3.add(Float.valueOf(((Number) kVar2.c()).floatValue()));
            }
            return new RadialGradient(arrayList2, arrayList3, j2, f2, i2, null);
        }

        /* renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final Brush m8193sweepGradientUv8p0NA(k<Float, Color>[] kVarArr, long j2) {
            ArrayList arrayList = new ArrayList(kVarArr.length);
            for (k<Float, Color> kVar : kVarArr) {
                arrayList.add(Color.m8218boximpl(((Color) kVar.d()).m8238unboximpl()));
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(kVarArr.length);
            for (k<Float, Color> kVar2 : kVarArr) {
                arrayList3.add(Float.valueOf(((Number) kVar2.c()).floatValue()));
            }
            return new SweepGradient(j2, arrayList2, arrayList3, null);
        }

        /* renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m8195verticalGradient8A3gB4(k<Float, Color>[] kVarArr, float f2, float f3, int i2) {
            return m8189linearGradientmHitzGk((k[]) Arrays.copyOf(kVarArr, kVarArr.length), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), i2);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ Brush m8182sweepGradientUv8p0NA$default(Companion companion, k[] kVarArr, long j2, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j2 = Offset.Companion.m7995getUnspecifiedF1C5BW0();
            }
            return companion.m8193sweepGradientUv8p0NA((k<Float, Color>[]) kVarArr, j2);
        }

        /* renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m8176horizontalGradient8A3gB4$default(Companion companion, k[] kVarArr, float f2, float f3, int i2, int i3, Object obj) {
            if ((i3 & 8) != 0) {
                i2 = TileMode.Companion.m8653getClamp3opZhB0();
            }
            int i4 = i3 & 4;
            int i5 = i3 & 2;
            if (i4 != 0) {
                f3 = Float.POSITIVE_INFINITY;
            }
            if (i5 != 0) {
                f2 = 0.0f;
            }
            return companion.m8187horizontalGradient8A3gB4((k<Float, Color>[]) kVarArr, f2, f3, i2);
        }

        /* renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m8184verticalGradient8A3gB4$default(Companion companion, k[] kVarArr, float f2, float f3, int i2, int i3, Object obj) {
            if ((i3 & 8) != 0) {
                i2 = TileMode.Companion.m8653getClamp3opZhB0();
            }
            int i4 = i3 & 4;
            int i5 = i3 & 2;
            if (i4 != 0) {
                f3 = Float.POSITIVE_INFINITY;
            }
            if (i5 != 0) {
                f2 = 0.0f;
            }
            return companion.m8195verticalGradient8A3gB4((k<Float, Color>[]) kVarArr, f2, f3, i2);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ Brush m8180radialGradientP_VxKs$default(Companion companion, k[] kVarArr, long j2, float f2, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                j2 = Offset.Companion.m7995getUnspecifiedF1C5BW0();
            }
            long j3 = j2;
            if ((i3 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            float f3 = f2;
            if ((i3 & 8) != 0) {
                i2 = TileMode.Companion.m8653getClamp3opZhB0();
            }
            return companion.m8191radialGradientP_VxKs((k<Float, Color>[]) kVarArr, j3, f3, i2);
        }

        /* renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ Brush m8178linearGradientmHitzGk$default(Companion companion, k[] kVarArr, long j2, long j3, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                j2 = Offset.Companion.m7996getZeroF1C5BW0();
            }
            long j4 = j2;
            if ((i3 & 4) != 0) {
                j3 = Offset.Companion.m7994getInfiniteF1C5BW0();
            }
            long j5 = j3;
            if ((i3 & 8) != 0) {
                i2 = TileMode.Companion.m8653getClamp3opZhB0();
            }
            return companion.m8189linearGradientmHitzGk((k<Float, Color>[]) kVarArr, j4, j5, i2);
        }

        /* renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m8186horizontalGradient8A3gB4(List<Color> list, float f2, float f3, int i2) {
            return m8188linearGradientmHitzGk(list, (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(0.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(0.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), i2);
        }

        /* renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m8194verticalGradient8A3gB4(List<Color> list, float f2, float f3, int i2) {
            return m8188linearGradientmHitzGk(list, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), i2);
        }

        /* renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final Brush m8192sweepGradientUv8p0NA(List<Color> list, long j2) {
            return new SweepGradient(j2, list, null, null);
        }

        /* renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final Brush m8190radialGradientP_VxKs(List<Color> list, long j2, float f2, int i2) {
            return new RadialGradient(list, null, j2, f2, i2, null);
        }

        /* renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final Brush m8188linearGradientmHitzGk(List<Color> list, long j2, long j3, int i2) {
            return new LinearGradient(list, null, j2, j3, i2, null);
        }
    }

    public /* synthetic */ Brush(o oVar) {
        this();
    }
}
