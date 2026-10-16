package com.qonversion.android.sdk.internal;

import com.qonversion.android.sdk.dto.QPurchaseOptions;
import ff.AbstractC2640A;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.a;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QProductCenterManager$processingPurchaseOptions$2 extends AbstractC3343n implements a {
    final /* synthetic */ QProductCenterManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QProductCenterManager$processingPurchaseOptions$2(QProductCenterManager qProductCenterManager) {
        super(0);
        this.this$0 = qProductCenterManager;
    }

    @Override // tf.a
    @NotNull
    public final Map<String, QPurchaseOptions> invoke() {
        return AbstractC2640A.a0(this.this$0.purchasesCache.loadProcessingPurchasesOptions());
    }
}
