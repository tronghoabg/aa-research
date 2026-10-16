package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import e.b.c;
import h.ab;
import h.c.e;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class ContinuationBroadcastReceiver extends BroadcastReceiver {
    private e<?> continuation;
    private final p<BroadcastReceiver, Intent, ab> onReceiveChecked;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationBroadcastReceiver(e<?> eVar, p<? super BroadcastReceiver, ? super Intent, ab> pVar) {
        x.f(eVar, "continuation");
        x.f(pVar, "onReceiveChecked");
        this.onReceiveChecked = pVar;
        this.continuation = eVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            this.onReceiveChecked.invoke(this, intent);
        } catch (Throwable th) {
            e<?> eVar = this.continuation;
            if (eVar == null) {
                throw th;
            }
            eVar.resumeWith(c.a(th));
            this.continuation = null;
        }
    }
}
