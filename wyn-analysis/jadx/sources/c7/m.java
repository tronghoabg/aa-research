package C7;

import a.AbstractC1304a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.safetynet.zzad;
import com.google.android.gms.internal.safetynet.zzd;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class m extends zzd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f1904a;

    public m(TaskCompletionSource taskCompletionSource) {
        this.f1904a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.safetynet.zzd, com.google.android.gms.internal.safetynet.zzg
    public final void zzb(Status status, boolean z2) {
        zzad zzadVar = new zzad(status, z2);
        f fVar = new f();
        fVar.f421a = zzadVar;
        AbstractC1304a.J(status, fVar, this.f1904a);
    }
}
