package androidx.media3.exoplayer.source.preload;

import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.d.b.aj;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface MediaSourceFactorySupplier extends aj<MediaSource.Factory> {
    MediaSourceFactorySupplier setCache(Cache cache);

    MediaSourceFactorySupplier setDataSourceFactory(DataSource.Factory factory);
}
