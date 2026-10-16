package androidx.media3.datasource.cache;

import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.CacheKeyFactory;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface CacheKeyFactory {
    public static final CacheKeyFactory DEFAULT = new CacheKeyFactory() { // from class: androidx.media3.datasource.cache.CacheKeyFactory$$ExternalSyntheticLambda0
        @Override // androidx.media3.datasource.cache.CacheKeyFactory
        public final String buildCacheKey(DataSpec dataSpec) {
            return CacheKeyFactory.CC.lambda$static$0(dataSpec);
        }
    };

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.datasource.cache.CacheKeyFactory$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ String lambda$static$0(DataSpec dataSpec) {
            String str = dataSpec.key;
            return str != null ? str : dataSpec.uri.toString();
        }
    }

    String buildCacheKey(DataSpec dataSpec);
}
