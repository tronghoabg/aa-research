package com.qonversion.android.sdk.internal;

import com.qonversion.android.sdk.dto.QFallbackObject;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.Nullable;
import tf.a;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/qonversion/android/sdk/dto/QFallbackObject;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QRemoteConfigManager$fallbackData$2 extends AbstractC3343n implements a {
    final /* synthetic */ QRemoteConfigManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRemoteConfigManager$fallbackData$2(QRemoteConfigManager qRemoteConfigManager) {
        super(0);
        this.this$0 = qRemoteConfigManager;
    }

    @Override // tf.a
    @Nullable
    public final QFallbackObject invoke() {
        return this.this$0.fallbacksService.obtainFallbackData();
    }
}
