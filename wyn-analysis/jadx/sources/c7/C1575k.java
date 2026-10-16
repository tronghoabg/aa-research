package c7;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: c7.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1575k {

    /* renamed from: a, reason: collision with root package name */
    public final int f19699a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f19700b = new TaskCompletionSource();

    /* renamed from: c, reason: collision with root package name */
    public final int f19701c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f19702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19703e;

    public C1575k(int i5, int i10, Bundle bundle, int i11) {
        this.f19703e = i11;
        this.f19699a = i5;
        this.f19701c = i10;
        this.f19702d = bundle;
    }

    public final boolean a() {
        switch (this.f19703e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(Ya.a aVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + aVar.toString());
        }
        this.f19700b.setException(aVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.f19700b.setResult(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f19701c + " id=" + this.f19699a + " oneWay=" + a() + "}";
    }
}
