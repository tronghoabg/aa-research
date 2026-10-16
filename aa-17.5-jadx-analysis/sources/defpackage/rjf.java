package defpackage;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class rjf extends BasePendingResult {
    public rjf(Looper looper) {
        super(looper);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ sli a(Status status) {
        return new rjh(status, (InputStream) null, 0);
    }
}
