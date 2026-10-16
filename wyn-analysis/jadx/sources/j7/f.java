package j7;

import a.AbstractC1304a;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public final class f extends zab implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f38673a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
        this.f38673a = taskCompletionSource;
    }

    @Override // j7.d
    public final void v(Status status, i7.c cVar) {
        AbstractC1304a.O(status, cVar, this.f38673a);
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i5, Parcel parcel, Parcel parcel2, int i10) {
        if (i5 == 1) {
            zac.zab(parcel);
            throw new UnsupportedOperationException();
        }
        if (i5 == 2) {
            Status status = (Status) zac.zaa(parcel, Status.CREATOR);
            i7.c cVar = (i7.c) zac.zaa(parcel, i7.c.CREATOR);
            zac.zab(parcel);
            v(status, cVar);
            return true;
        }
        if (i5 == 3) {
            zac.zab(parcel);
            throw new UnsupportedOperationException();
        }
        if (i5 != 4) {
            return false;
        }
        zac.zab(parcel);
        throw new UnsupportedOperationException();
    }
}
