package com.qonversion.android.sdk.internal;

import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import vf.AbstractC4345a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;", "", "randomizer", "Ljava/util/Random;", "(Ljava/util/Random;)V", "countDelay", "", "minDelay", "retriesCount", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IncrementalDelayCalculator {
    private static final float FACTOR = 2.4f;
    private static final float JITTER = 0.4f;
    private static final int MAX_DELAY = 1000;

    @NotNull
    private final Random randomizer;

    public IncrementalDelayCalculator(@NotNull Random randomizer) {
        AbstractC3340k.e(randomizer, "randomizer");
        this.randomizer = randomizer;
    }

    public final int countDelay(int minDelay, int retriesCount) throws IllegalArgumentException {
        float fPow = minDelay + ((float) Math.pow(FACTOR, retriesCount));
        int iH = AbstractC4345a.H(JITTER * fPow);
        if (iH != Integer.MAX_VALUE) {
            iH++;
        }
        return Math.min(AbstractC4345a.H(fPow + this.randomizer.nextInt(iH)), 1000);
    }
}
