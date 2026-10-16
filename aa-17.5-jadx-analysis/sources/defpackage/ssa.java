package defpackage;

import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
abstract class ssa extends srz {
    public ssa(sld sldVar) {
        super(sldVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ sli a(Status status) {
        return status == null ? Status.c : status;
    }
}
