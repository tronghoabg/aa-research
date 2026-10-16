package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final IntentFilter f18702a;

    /* renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f18703b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18704c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18705d;

    public a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f18702a = intentFilter;
        this.f18703b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("Receiver{");
        sb2.append(this.f18703b);
        sb2.append(" filter=");
        sb2.append(this.f18702a);
        if (this.f18705d) {
            sb2.append(" DEAD");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
