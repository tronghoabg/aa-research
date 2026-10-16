package androidx.media3.datasource;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.BitmapLoader;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import com.google.d.b.aj;
import com.google.d.b.an;
import com.google.d.m.a.bm;
import com.google.d.m.a.bn;
import com.google.d.m.a.cf;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DataSourceBitmapLoader implements BitmapLoader {
    public static final aj<bn> DEFAULT_EXECUTOR_SERVICE = an.a(new aj() { // from class: androidx.media3.datasource.DataSourceBitmapLoader$$ExternalSyntheticLambda0
        @Override // com.google.d.b.aj
        public final Object get() {
            return cf.w(Executors.newSingleThreadExecutor());
        }
    });
    private final DataSource.Factory dataSourceFactory;
    private final bn listeningExecutorService;
    private final boolean makeShared;
    private final int maximumOutputDimension;
    private final BitmapFactory.Options options;

    /* compiled from: WazeSource */
    public final class Builder {
        private final Context context;
        private DataSource.Factory dataSourceFactory;
        private bn listeningExecutorService;
        private boolean makeShared;
        private int maximumOutputDimension = -1;
        private BitmapFactory.Options options;

        public Builder(Context context) {
            this.context = context;
        }

        public DataSourceBitmapLoader build() {
            return new DataSourceBitmapLoader(this);
        }

        public Builder setBitmapFactoryOptions(BitmapFactory.Options options) {
            this.options = options;
            return this;
        }

        public Builder setDataSourceFactory(DataSource.Factory factory) {
            this.dataSourceFactory = factory;
            return this;
        }

        public Builder setExecutorService(bn bnVar) {
            this.listeningExecutorService = bnVar;
            return this;
        }

        public Builder setMakeShared(boolean z) {
            this.makeShared = z;
            return this;
        }

        public Builder setMaximumOutputDimension(int i2) {
            this.maximumOutputDimension = i2;
            return this;
        }
    }

    private DataSourceBitmapLoader(Builder builder) {
        bn bnVar;
        this.dataSourceFactory = builder.dataSourceFactory != null ? builder.dataSourceFactory : new DefaultDataSource.Factory(builder.context);
        if (builder.listeningExecutorService != null) {
            bnVar = builder.listeningExecutorService;
        } else {
            bnVar = DEFAULT_EXECUTOR_SERVICE.get();
            an.B(bnVar);
        }
        this.listeningExecutorService = bnVar;
        this.options = builder.options;
        this.maximumOutputDimension = builder.maximumOutputDimension;
        this.makeShared = builder.makeShared;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bitmap lambda$decodeBitmap$0(byte[] bArr) throws IOException {
        return maybeAsShared(this.makeShared, BitmapUtil.decode(bArr, bArr.length, this.options, this.maximumOutputDimension));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bitmap lambda$loadBitmap$0(Uri uri) {
        return load(this.dataSourceFactory.createDataSource(), uri, this.options, this.maximumOutputDimension, this.makeShared);
    }

    private static Bitmap load(DataSource dataSource, Uri uri, BitmapFactory.Options options, int i2, boolean z) {
        try {
            dataSource.open(new DataSpec(uri));
            byte[] toEnd = DataSourceUtil.readToEnd(dataSource);
            return maybeAsShared(z, BitmapUtil.decode(toEnd, toEnd.length, options, i2));
        } finally {
            dataSource.close();
        }
    }

    private static Bitmap maybeAsShared(boolean z, Bitmap bitmap) {
        return z ? BitmapUtil.makeShared(bitmap) : bitmap;
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public bm<Bitmap> decodeBitmap(final byte[] bArr) {
        return this.listeningExecutorService.submit(new Callable() { // from class: androidx.media3.datasource.DataSourceBitmapLoader$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.lambda$decodeBitmap$0(bArr);
            }
        });
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public bm<Bitmap> loadBitmap(final Uri uri) {
        return this.listeningExecutorService.submit(new Callable() { // from class: androidx.media3.datasource.DataSourceBitmapLoader$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.lambda$loadBitmap$0(uri);
            }
        });
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public /* synthetic */ bm loadBitmapFromMetadata(MediaMetadata mediaMetadata) {
        return BitmapLoader.CC.$default$loadBitmapFromMetadata(this, mediaMetadata);
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public boolean supportsMimeType(String str) {
        return Util.isBitmapFactorySupportedMimeType(str);
    }

    @Deprecated
    public DataSourceBitmapLoader(bn bnVar, DataSource.Factory factory, BitmapFactory.Options options, int i2) {
        this.listeningExecutorService = bnVar;
        this.dataSourceFactory = factory;
        this.options = options;
        this.maximumOutputDimension = i2;
        this.makeShared = false;
    }

    @Deprecated
    public DataSourceBitmapLoader(Context context) {
        this(new Builder(context));
    }

    @Deprecated
    public DataSourceBitmapLoader(bn bnVar, DataSource.Factory factory) {
        this(bnVar, factory, null);
    }

    @Deprecated
    public DataSourceBitmapLoader(Context context, int i2) {
        Builder builder = new Builder(context);
        builder.setMaximumOutputDimension(i2);
        this(builder);
    }

    @Deprecated
    public DataSourceBitmapLoader(bn bnVar, DataSource.Factory factory, BitmapFactory.Options options) {
        this(bnVar, factory, options, -1);
    }
}
