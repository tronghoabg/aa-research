package com.waze.modules.b;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.waze.config.ConfigValues;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f implements com.waze.stats.b {
    @Override // com.waze.stats.b
    public final int a() {
        return (int) ConfigValues.CONFIG_VALUE_STATS_MOBILE_METRICS_BACKOFF_RETRY_BACKOFF_MULTIPLIER.b().longValue();
    }

    @Override // com.waze.stats.b
    public final int b() {
        return (int) ConfigValues.CONFIG_VALUE_STATS_MOBILE_METRICS_MAX_NUMBER_OF_RETRIES.b().longValue();
    }

    @Override // com.waze.stats.b
    public final String c() {
        Long lB = ConfigValues.CONFIG_VALUE_STATS_MOBILE_METRICS_BACKOFF_RETRY_INITIAL_BACKOFF_IN_SECONDS.b();
        Objects.toString(lB);
        return lB.toString().concat(CmcdData.STREAMING_FORMAT_SS);
    }

    @Override // com.waze.stats.b
    public final String d() {
        Long lB = ConfigValues.CONFIG_VALUE_STATS_MOBILE_METRICS_BACKOFF_RETRY_MAX_BACKOFF_IN_SECONDS.b();
        Objects.toString(lB);
        return lB.toString().concat(CmcdData.STREAMING_FORMAT_SS);
    }
}
