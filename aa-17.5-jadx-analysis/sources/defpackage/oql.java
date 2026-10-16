package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class oql extends eqj {
    public final oqk a = new oqk(this);
    private final Context h;
    private final oqg i;

    public oql(Context context, oqg oqgVar) {
        this.h = context;
        this.i = oqgVar;
    }

    @Override // defpackage.eqj
    protected final void c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        Context context = this.h;
        dup.e(context, this.a, intentFilter, null, 2);
        oqj oqjVar = new oqj(this, 1);
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && defaultAdapter.isEnabled()) {
            defaultAdapter.getProfileProxy(context, new oqn(this.i, defaultAdapter, context, oqjVar), 1);
            return;
        }
        int i = yfq.d;
        yfq yfqVar = yls.a;
        oqjVar.a(new oqq());
    }

    @Override // defpackage.eqj
    protected final void d() {
        this.h.unregisterReceiver(this.a);
    }
}
