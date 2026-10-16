package androidx.media3.common.audio;

import android.util.Pair;
import androidx.media3.common.C;
import androidx.media3.common.audio.DefaultGainProvider;
import androidx.media3.common.audio.GainProcessor;
import androidx.media3.common.util.Util;
import com.google.d.b.an;
import com.google.d.b.t;
import com.google.d.d.er;
import com.google.d.d.ft;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DefaultGainProvider implements GainProcessor.GainProvider {
    private static final float GAIN_UNSET = -3.4028235E38f;
    private final float defaultGain;
    private final ft<Long, t<Pair<Long, Integer>, Float>> gainMap;
    public static final FadeProvider FADE_IN_LINEAR = new FadeProvider() { // from class: androidx.media3.common.audio.DefaultGainProvider$$ExternalSyntheticLambda0
        @Override // androidx.media3.common.audio.DefaultGainProvider.FadeProvider
        public final float getGainFactorAt(long j2, long j3) {
            return DefaultGainProvider.lambda$static$0(j2, j3);
        }
    };
    public static final FadeProvider FADE_OUT_LINEAR = new FadeProvider() { // from class: androidx.media3.common.audio.DefaultGainProvider$$ExternalSyntheticLambda1
        @Override // androidx.media3.common.audio.DefaultGainProvider.FadeProvider
        public final float getGainFactorAt(long j2, long j3) {
            return DefaultGainProvider.lambda$static$1(j2, j3);
        }
    };
    public static final FadeProvider FADE_IN_EQUAL_POWER = new FadeProvider() { // from class: androidx.media3.common.audio.DefaultGainProvider$$ExternalSyntheticLambda2
        @Override // androidx.media3.common.audio.DefaultGainProvider.FadeProvider
        public final float getGainFactorAt(long j2, long j3) {
            return DefaultGainProvider.lambda$static$2(j2, j3);
        }
    };
    public static final FadeProvider FADE_OUT_EQUAL_POWER = new FadeProvider() { // from class: androidx.media3.common.audio.DefaultGainProvider$$ExternalSyntheticLambda3
        @Override // androidx.media3.common.audio.DefaultGainProvider.FadeProvider
        public final float getGainFactorAt(long j2, long j3) {
            return DefaultGainProvider.lambda$static$3(j2, j3);
        }
    };

    /* compiled from: WazeSource */
    public final class Builder {
        private final float defaultGain;
        private final ft<Long, t<Pair<Long, Integer>, Float>> gainMap;

        public Builder(float f2) {
            ft<Long, t<Pair<Long, Integer>, Float>> ftVarA = ft.a();
            this.gainMap = ftVarA;
            this.defaultGain = f2;
            ftVarA.e(er.b(), new t() { // from class: androidx.media3.common.audio.DefaultGainProvider$Builder$$ExternalSyntheticLambda0
                @Override // com.google.d.b.t
                public final Object apply(Object obj) {
                    return Float.valueOf(-3.4028235E38f);
                }
            });
        }

        static /* synthetic */ Float lambda$addFadeAt$0(long j2, FadeProvider fadeProvider, long j3, Pair pair) {
            int iIntValue = ((Integer) pair.second).intValue();
            return Float.valueOf(fadeProvider.getGainFactorAt(((Long) pair.first).longValue() - Util.durationUsToSampleCount(j2, iIntValue), Util.durationUsToSampleCount(j3, iIntValue)));
        }

        public Builder addFadeAt(final long j2, final long j3, final FadeProvider fadeProvider) {
            an.l(j2 >= 0);
            an.l(j3 > 1);
            this.gainMap.e(er.d(Long.valueOf(j2), Long.valueOf(j2 + j3)), new t() { // from class: androidx.media3.common.audio.DefaultGainProvider$Builder$$ExternalSyntheticLambda1
                @Override // com.google.d.b.t
                public final Object apply(Object obj) {
                    return DefaultGainProvider.Builder.lambda$addFadeAt$0(j2, fadeProvider, j3, (Pair) obj);
                }
            });
            return this;
        }

        public DefaultGainProvider build() {
            return new DefaultGainProvider(this.gainMap, this.defaultGain);
        }
    }

    /* compiled from: WazeSource */
    public interface FadeProvider {
        float getGainFactorAt(long j2, long j3);
    }

    private DefaultGainProvider(ft<Long, t<Pair<Long, Integer>, Float>> ftVar, float f2) {
        ft<Long, t<Pair<Long, Integer>, Float>> ftVarA = ft.a();
        this.gainMap = ftVarA;
        for (Map.Entry entry : ftVar.c().entrySet()) {
            ftVarA.e((er) entry.getKey(), entry.getValue());
        }
        this.defaultGain = f2;
    }

    static /* synthetic */ float lambda$static$0(long j2, long j3) {
        return j2 / j3;
    }

    static /* synthetic */ float lambda$static$1(long j2, long j3) {
        return (j3 - j2) / j3;
    }

    static /* synthetic */ float lambda$static$2(long j2, long j3) {
        return (float) Math.sin((j2 * 1.5707963267948966d) / j3);
    }

    static /* synthetic */ float lambda$static$3(long j2, long j3) {
        return (float) Math.cos((j2 * 1.5707963267948966d) / j3);
    }

    @Override // androidx.media3.common.audio.GainProcessor.GainProvider
    public float getGainFactorAtSamplePosition(long j2, int i2) {
        an.u(i2 > 0);
        an.l(j2 >= 0);
        Map.Entry entryB = this.gainMap.b(Long.valueOf(Util.sampleCountToDurationUs(j2, i2)));
        t tVar = (t) (entryB == null ? null : entryB.getValue());
        an.B(tVar);
        float fFloatValue = ((Float) tVar.apply(Pair.create(Long.valueOf(j2), Integer.valueOf(i2)))).floatValue();
        return fFloatValue == -3.4028235E38f ? this.defaultGain : fFloatValue;
    }

    @Override // androidx.media3.common.audio.GainProcessor.GainProvider
    public long isUnityUntil(long j2, int i2) {
        an.u(i2 > 0);
        an.l(j2 >= 0);
        Map.Entry entryB = this.gainMap.b(Long.valueOf(Util.sampleCountToDurationUs(j2, i2)));
        an.B(entryB);
        float fFloatValue = ((Float) ((t) entryB.getValue()).apply(Pair.create(Long.valueOf(j2), Integer.valueOf(i2)))).floatValue();
        if (fFloatValue == 1.0f) {
            return j2 + 1;
        }
        if (this.defaultGain != 1.0f || fFloatValue != -3.4028235E38f) {
            return C.TIME_UNSET;
        }
        if (((er) entryB.getKey()).h()) {
            return Util.durationUsToSampleCount(((Long) ((er) entryB.getKey()).f()).longValue(), i2);
        }
        return Long.MIN_VALUE;
    }
}
