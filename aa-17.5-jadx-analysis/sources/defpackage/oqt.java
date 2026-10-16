package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class oqt extends eqj {
    public final BroadcastReceiver a = new oqs(this);
    private final Context h;

    public oqt(Context context) {
        this.h = context;
    }

    public static oqt a() {
        return (oqt) mki.a.i(oqt.class);
    }

    @Override // defpackage.eqj
    protected final void c() {
        dup.e(this.h, this.a, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"), null, 2);
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
            m(10);
        } else {
            m(12);
        }
    }

    @Override // defpackage.eqj
    protected final void d() {
        this.h.unregisterReceiver(this.a);
    }
}
