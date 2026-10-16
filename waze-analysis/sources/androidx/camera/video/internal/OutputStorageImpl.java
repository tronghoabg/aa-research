package androidx.camera.video.internal;

import android.net.Uri;
import androidx.camera.core.Logger;
import androidx.camera.video.FileDescriptorOutputOptions;
import androidx.camera.video.FileOutputOptions;
import androidx.camera.video.MediaStoreOutputOptions;
import androidx.camera.video.OutputOptions;
import androidx.camera.video.internal.utils.StorageUtil;
import h.g.b.o;
import h.g.b.x;
import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class OutputStorageImpl implements OutputStorage {
    private static final Companion Companion = new Companion(null);
    private static final String TAG = "OutputStorageImpl";
    private final OutputOptions outputOptions;

    public OutputStorageImpl(OutputOptions outputOptions) {
        x.f(outputOptions, "outputOptions");
        this.outputOptions = outputOptions;
    }

    @Override // androidx.camera.video.internal.OutputStorage
    public long getAvailableBytes() {
        try {
            OutputOptions outputOptions = this.outputOptions;
            if (outputOptions instanceof FileOutputOptions) {
                File parentFile = ((FileOutputOptions) outputOptions).getFile().getParentFile();
                x.c(parentFile);
                return StorageUtil.getAvailableBytes(parentFile);
            }
            if (outputOptions instanceof MediaStoreOutputOptions) {
                Uri collectionUri = ((MediaStoreOutputOptions) outputOptions).getCollectionUri();
                x.e(collectionUri, "getCollectionUri(...)");
                return StorageUtil.getAvailableBytesForMediaStoreUri(collectionUri);
            }
            if (outputOptions instanceof FileDescriptorOutputOptions) {
                return Long.MAX_VALUE;
            }
            throw new AssertionError("Unknown OutputOptions: " + outputOptions);
        } catch (RuntimeException e2) {
            Logger.w(TAG, "Fail to access the available bytes.", e2);
            return Long.MAX_VALUE;
        }
    }

    @Override // androidx.camera.video.internal.OutputStorage
    public OutputOptions getOutputOptions() {
        return this.outputOptions;
    }

    /* compiled from: WazeSource */
    final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
