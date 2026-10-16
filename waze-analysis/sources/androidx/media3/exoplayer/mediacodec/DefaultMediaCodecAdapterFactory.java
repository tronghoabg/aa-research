package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import android.os.Build;
import android.os.HandlerThread;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter;
import com.google.d.b.aj;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DefaultMediaCodecAdapterFactory implements MediaCodecAdapter.Factory {
    private static final int MODE_DEFAULT = 0;
    private static final int MODE_DISABLED = 2;
    private static final int MODE_ENABLED = 1;
    private static final String TAG = "DMCodecAdapterFactory";
    private boolean asyncCryptoFlagEnabled;
    private boolean asyncCryptoSynchronizationEnabled;
    private int asynchronousMode;
    private final aj<HandlerThread> callbackThreadSupplier;
    private final Context context;
    private final aj<HandlerThread> queueingThreadSupplier;

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface Mode {
    }

    public DefaultMediaCodecAdapterFactory(Context context, aj<HandlerThread> ajVar, aj<HandlerThread> ajVar2) {
        this.context = context;
        this.asynchronousMode = 0;
        this.asyncCryptoFlagEnabled = true;
        this.callbackThreadSupplier = ajVar;
        this.queueingThreadSupplier = ajVar2;
    }

    private boolean shouldUseAsynchronousAdapterInDefaultMode() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        Context context = this.context;
        return context != null && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
    public MediaCodecAdapter createAdapter(MediaCodecAdapter.Configuration configuration) {
        aj<HandlerThread> ajVar;
        int i2 = this.asynchronousMode;
        if (i2 != 1 && (i2 != 0 || !shouldUseAsynchronousAdapterInDefaultMode())) {
            return new SynchronousMediaCodecAdapter.Factory().createAdapter(configuration);
        }
        int trackType = MimeTypes.getTrackType(configuration.format.sampleMimeType);
        Log.i(TAG, "Creating an asynchronous MediaCodec adapter for track type ".concat(Util.getTrackTypeString(trackType)));
        aj<HandlerThread> ajVar2 = this.callbackThreadSupplier;
        AsynchronousMediaCodecAdapter.Factory factory = (ajVar2 == null || (ajVar = this.queueingThreadSupplier) == null) ? new AsynchronousMediaCodecAdapter.Factory(trackType) : new AsynchronousMediaCodecAdapter.Factory(ajVar2, ajVar);
        factory.setAsyncCryptoFlagEnabled(this.asyncCryptoFlagEnabled);
        factory.setAsyncCryptoSynchronizationEnabled(this.asyncCryptoSynchronizationEnabled);
        return factory.createAdapter(configuration);
    }

    public DefaultMediaCodecAdapterFactory forceDisableAsynchronous() {
        this.asynchronousMode = 2;
        return this;
    }

    public DefaultMediaCodecAdapterFactory forceEnableAsynchronous() {
        this.asynchronousMode = 1;
        return this;
    }

    public DefaultMediaCodecAdapterFactory setAsyncCryptoFlagEnabled(boolean z) {
        this.asyncCryptoFlagEnabled = z;
        return this;
    }

    public DefaultMediaCodecAdapterFactory setAsyncCryptoSynchronizationEnabled(boolean z) {
        this.asyncCryptoSynchronizationEnabled = z;
        return this;
    }

    @Deprecated
    public DefaultMediaCodecAdapterFactory() {
        this.asynchronousMode = 0;
        this.context = null;
        this.callbackThreadSupplier = null;
        this.queueingThreadSupplier = null;
    }

    public DefaultMediaCodecAdapterFactory(Context context) {
        this(context, null, null);
    }
}
