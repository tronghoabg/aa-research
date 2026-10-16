package androidx.datastore.core;

import h.g.b.x;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DirectBootUsageException extends IOException {
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectBootUsageException(Exception exc) {
        super(exc);
        x.f(exc, "ex");
        this.message = "Encountered a [" + exc.getMessage() + "]. If you are trying to use DataStore during direct boot, this exception likely indicates that your DataStore file is not located in the Device Encrypted Storage and therefore is not available for write access during direct boot mode. DataStore to be used during direct boot must be initialized using `DataStoreFactory.createInDeviceProtectedStorage()`.";
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
