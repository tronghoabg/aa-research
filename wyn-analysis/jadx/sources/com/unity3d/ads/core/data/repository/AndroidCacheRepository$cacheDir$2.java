package com.unity3d.ads.core.data.repository;

import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.a;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidCacheRepository$cacheDir$2 extends AbstractC3343n implements a {
    final /* synthetic */ AndroidCacheRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCacheRepository$cacheDir$2(AndroidCacheRepository androidCacheRepository) {
        super(0);
        this.this$0 = androidCacheRepository;
    }

    @Override // tf.a
    @NotNull
    public final File invoke() {
        return this.this$0.initCacheDir(UnityAdsConstants.DefaultUrls.CACHE_DIR_NAME);
    }
}
