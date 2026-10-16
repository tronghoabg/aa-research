package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class egm extends java.io.IOException {
    private final java.lang.String a;

    public egm(java.lang.Exception exc) {
        super(exc);
        this.a = "Encountered a [" + exc.getMessage() + "]. If you are trying to use DataStore during direct boot, this exception likely indicates that your DataStore file is not located in the Device Encrypted Storage and therefore is not available for write access during direct boot mode. DataStore to be used during direct boot must be initialized using `DataStoreFactory.createInDeviceProtectedStorage()`.";
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return this.a;
    }
}
