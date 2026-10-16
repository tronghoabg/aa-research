package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ozb implements ozd {
    public static final yph a = yph.c("GH.BtConnectionTracker");
    public final Context b;
    public final Handler c;
    public final List d;
    public final BluetoothAdapter e;
    public final oyz f;
    public final Map g;
    public Set h;
    public Set i;
    public final Map j;
    public Set k;
    public final IntentFilter l;
    public final List m;
    public final gjv n;
    public final gjv o;
    private final Handler p;

    public ozb(Context context, Handler handler) {
        context.getClass();
        handler.getClass();
        this.b = context;
        this.c = handler;
        this.d = woy.bi(1, 2);
        this.e = ((BluetoothManager) jfj.c(context).getSystemService(BluetoothManager.class)).getAdapter();
        this.f = new oyz(this);
        this.g = new LinkedHashMap();
        this.p = new Handler(Looper.getMainLooper());
        this.h = new LinkedHashSet();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashMap();
        this.k = afbg.a;
        this.n = new gjv(new oyx(1));
        this.o = new gjv(new oyx(0));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        this.l = intentFilter;
        this.m = new ArrayList();
    }

    @Override // defpackage.ozd
    public final zgp a(ozc ozcVar) {
        ozcVar.getClass();
        b(ozcVar);
        return wub.Y(true);
    }

    public final void b(ozc ozcVar) {
        this.c.post(new ojl(this, ozcVar, 5, null));
    }

    public final void c(ozc ozcVar) {
        ygr ygrVarV = wub.v(this.h);
        ygs ygsVar = new ygs();
        ygsVar.c(1, this.i);
        ygu yguVarA = ygsVar.a();
        yguVarA.getClass();
        ozcVar.d(ygrVarV, yguVarA);
    }

    public final void d() {
        oyy oyyVar = new oyy(this, 1);
        gjv gjvVar = this.n;
        Runnable runnable = (Runnable) gjvVar.v();
        Handler handler = this.c;
        handler.removeCallbacks(runnable);
        handler.removeCallbacks((Runnable) this.o.v());
        gjvVar.w(oyyVar);
        handler.post(oyyVar);
    }

    public final void e() {
        Set<BluetoothDevice> bondedDevices;
        int i;
        if (f()) {
            try {
                bondedDevices = this.e.getBondedDevices();
                if (bondedDevices == null) {
                    bondedDevices = afbg.a;
                }
            } catch (SecurityException e) {
                ((ype) a.h()).u("Missing Bluetooth permissions: bonded devices.");
                if (!aczv.aE()) {
                    throw e;
                }
                bondedDevices = afbg.a;
            }
            Set<BluetoothDevice> setAQ = woy.aQ(this.k, bondedDevices);
            this.k = bondedDevices;
            ArrayList arrayList = new ArrayList();
            for (Object obj : bondedDevices) {
                if (((BluetoothDevice) obj).isConnected()) {
                    arrayList.add(obj);
                }
            }
            Set setCl = woy.cl(arrayList);
            Set<BluetoothDevice> setAQ2 = woy.aQ(setCl, this.h);
            Set<BluetoothDevice> setAQ3 = woy.aQ(this.h, setCl);
            this.h = woy.ck(setCl);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (BluetoothProfile bluetoothProfile : this.j.values()) {
                try {
                    if (aczv.ay()) {
                        List<BluetoothDevice> connectedDevices = bluetoothProfile.getConnectedDevices();
                        connectedDevices.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : connectedDevices) {
                            if (this.h.contains((BluetoothDevice) obj2)) {
                                arrayList2.add(obj2);
                            }
                        }
                        linkedHashSet.addAll(arrayList2);
                    } else {
                        List<BluetoothDevice> connectedDevices2 = bluetoothProfile.getConnectedDevices();
                        connectedDevices2.getClass();
                        linkedHashSet.addAll(connectedDevices2);
                    }
                    List<BluetoothDevice> devicesMatchingConnectionStates = bluetoothProfile.getDevicesMatchingConnectionStates(new int[]{1});
                    devicesMatchingConnectionStates.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : devicesMatchingConnectionStates) {
                        if (this.h.contains((BluetoothDevice) obj3)) {
                            arrayList3.add(obj3);
                        }
                    }
                    linkedHashSet.addAll(arrayList3);
                } catch (SecurityException e2) {
                    ((ype) a.h()).u("Missing Bluetooth permissions: profile devices.");
                    if (!aczv.aE()) {
                        throw e2;
                    }
                }
            }
            Set<BluetoothDevice> setAQ4 = woy.aQ(linkedHashSet, this.i);
            Set setAQ5 = woy.aQ(this.i, linkedHashSet);
            this.i = woy.ck(linkedHashSet);
            for (BluetoothDevice bluetoothDevice : setAQ3) {
                ((ype) a.f()).y("acl connection removed. device = %s", bluetoothDevice);
                for (ozc ozcVar : this.m) {
                    bluetoothDevice.getClass();
                    ozcVar.b(bluetoothDevice);
                }
            }
            for (BluetoothDevice bluetoothDevice2 : setAQ2) {
                ((ype) a.f()).y("acl connection added. device = %s", bluetoothDevice2);
                for (ozc ozcVar2 : this.m) {
                    bluetoothDevice2.getClass();
                    ozcVar2.a(bluetoothDevice2);
                }
            }
            Iterator it = setAQ5.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                BluetoothDevice bluetoothDevice3 = (BluetoothDevice) it.next();
                ((ype) a.f()).y("profile connection removed. device = %s", bluetoothDevice3);
                Iterator it2 = this.m.iterator();
                while (it2.hasNext()) {
                    ((ozc) it2.next()).f(bluetoothDevice3, 0);
                }
            }
            for (BluetoothDevice bluetoothDevice4 : setAQ4) {
                ((ype) a.f()).y("profile connection added. device = %s", bluetoothDevice4);
                Iterator it3 = this.m.iterator();
                while (it3.hasNext()) {
                    ((ozc) it3.next()).f(bluetoothDevice4, 2);
                }
            }
            for (BluetoothDevice bluetoothDevice5 : setAQ) {
                ((ype) a.f()).y("device unbonded. device = %s", bluetoothDevice5);
                for (ozc ozcVar3 : this.m) {
                    bluetoothDevice5.getClass();
                    ozcVar3.c(bluetoothDevice5);
                }
            }
            if (aczv.s() >= 0) {
                this.p.post(new oyy(this, i));
            }
        }
    }

    public final boolean f() {
        return !this.g.isEmpty();
    }

    @Override // defpackage.ozd
    public final void g(ozc ozcVar) {
        this.c.post(new ojl(this, ozcVar, 6, null));
    }
}
