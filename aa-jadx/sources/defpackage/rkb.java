package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rkb extends com.google.android.gms.common.api.internal.BasePendingResult {
    public rkb(android.os.Looper looper) {
        super(looper);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ defpackage.sme a(com.google.android.gms.common.api.Status status) {
        return new defpackage.rkd(status, (java.io.InputStream) null, 0);
    }
}
