package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class pvz implements pwd {
    private static final pwn c = new pwn("connectivity", Boolean.toString(true));
    public zhc a;
    final BroadcastReceiver b = new pvy(this);
    private final AtomicBoolean d = new AtomicBoolean(false);
    private final pli e;
    private final Context f;

    public pvz(Context context, pli pliVar) {
        this.e = pliVar;
        this.f = context;
    }

    @Override // defpackage.pwd
    public final pwe a() {
        return pwe.g;
    }

    @Override // defpackage.pwd
    public final pwn c() {
        if (!this.d.getAndSet(true)) {
            this.f.registerReceiver(this.b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        if (this.e.c()) {
            return c;
        }
        return null;
    }

    @Override // defpackage.pwd
    public final zgp d() {
        pwn pwnVarC = c();
        if (pwnVarC != null) {
            return wub.Y(pwnVarC);
        }
        synchronized (this) {
            zhc zhcVar = this.a;
            if (zhcVar != null) {
                return wub.Z(zhcVar);
            }
            zhc zhcVar2 = new zhc();
            this.a = zhcVar2;
            return wub.Z(zhcVar2);
        }
    }

    @Override // defpackage.pwd
    public final /* synthetic */ void e() {
    }
}
