package f9;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class g extends A {

    /* renamed from: d, reason: collision with root package name */
    public final String f35252d;

    /* renamed from: e, reason: collision with root package name */
    public final O9.b f35253e;

    public g(O9.b bVar, String str) {
        super(null, false, 13201);
        this.f35252d = str;
        this.f35253e = bVar;
    }

    @Override // com.google.android.gms.common.api.internal.A
    public final void b(com.google.android.gms.common.api.b bVar, TaskCompletionSource taskCompletionSource) {
        c cVar = (c) bVar;
        f fVar = new f(this.f35253e, taskCompletionSource);
        String str = this.f35252d;
        cVar.getClass();
        try {
            ((j) ((l) cVar.getService())).S(fVar, str);
        } catch (RemoteException unused) {
        }
    }
}
