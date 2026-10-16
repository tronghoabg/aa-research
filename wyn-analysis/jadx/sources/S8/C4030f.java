package s8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import x.C4411d;

/* renamed from: s8.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4030f extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f45325b = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final Context f45326a;

    public C4030f(Context context) {
        this.f45326a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (g.k) {
            try {
                Iterator it = ((C4411d) g.f45327l.values()).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f45326a.unregisterReceiver(this);
    }
}
