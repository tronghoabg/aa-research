package e.a.b.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.waze.car_lib.be;
import e.a.el;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class x extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ y f46453a;

    x(y yVar) {
        Objects.requireNonNull(yVar);
        this.f46453a = yVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final y yVar = this.f46453a;
        el elVar = yVar.f46460h;
        Objects.requireNonNull(yVar);
        elVar.c(new Runnable() { // from class: e.a.b.a.w
            @Override // java.lang.Runnable
            public final void run() {
                yVar.m();
            }
        });
        Executor executor = yVar.f46458f;
        el elVar2 = yVar.f46460h;
        Objects.requireNonNull(elVar2);
        executor.execute(new be(elVar2, 18));
    }
}
