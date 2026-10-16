package nd;

import Va.Y7;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: nd.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3615a extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41010a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f41011b = false;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41012c;

    public /* synthetic */ C3615a(Object obj, int i5) {
        this.f41010a = i5;
        this.f41012c = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f41010a) {
            case 0:
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                boolean z2 = this.f41011b;
                boolean z10 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
                this.f41011b = z10;
                if (z10 && !z2) {
                    ((C3616b) this.f41012c).f41013a.j();
                    break;
                }
                break;
            default:
                Y7 y72 = (Y7) this.f41012c;
                boolean zG = y72.g();
                if (y72.g() && !this.f41011b) {
                    y72.i(true);
                } else if (!zG && this.f41011b) {
                    y72.i(false);
                }
                this.f41011b = zG;
                break;
        }
    }
}
