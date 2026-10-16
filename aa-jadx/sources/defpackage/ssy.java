package defpackage;

/* JADX INFO: loaded from: classes2.dex */
abstract class ssy extends defpackage.ssx {
    public ssy(defpackage.slz slzVar) {
        super(slzVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ defpackage.sme a(com.google.android.gms.common.api.Status status) {
        return status == null ? com.google.android.gms.common.api.Status.c : status;
    }
}
