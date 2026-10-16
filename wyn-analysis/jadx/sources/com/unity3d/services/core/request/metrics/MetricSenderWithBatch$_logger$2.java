package com.unity3d.services.core.request.metrics;

import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.misc.Utilities;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3343n;
import tf.a;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/log/Logger;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MetricSenderWithBatch$_logger$2 extends AbstractC3343n implements a {
    public static final MetricSenderWithBatch$_logger$2 INSTANCE = new MetricSenderWithBatch$_logger$2();

    public MetricSenderWithBatch$_logger$2() {
        super(0);
    }

    @Override // tf.a
    public final Logger invoke() {
        return (Logger) Utilities.getService(Logger.class);
    }
}
