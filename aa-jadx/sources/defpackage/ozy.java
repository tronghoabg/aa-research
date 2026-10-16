package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ozy implements defpackage.paa {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.BtConnectionTracker");
    public final android.content.Context b;
    public final android.os.Handler c;
    public final java.util.List d;
    public final android.bluetooth.BluetoothAdapter e;
    public final defpackage.ozw f;
    public final java.util.Map g;
    public java.util.Set h;
    public java.util.Set i;
    public final java.util.Map j;
    public java.util.Set k;
    public final android.content.IntentFilter l;
    public final java.util.List m;
    public final defpackage.gkc n;
    public final defpackage.gkc o;
    private final android.os.Handler p;

    public ozy(android.content.Context context, android.os.Handler handler) {
        context.getClass();
        handler.getClass();
        this.b = context;
        this.c = handler;
        this.d = defpackage.afga.ac(1, 2);
        this.e = ((android.bluetooth.BluetoothManager) defpackage.jfr.c(context).getSystemService(android.bluetooth.BluetoothManager.class)).getAdapter();
        this.f = new defpackage.ozw(this);
        this.g = new java.util.LinkedHashMap();
        this.p = new android.os.Handler(android.os.Looper.getMainLooper());
        this.h = new java.util.LinkedHashSet();
        this.i = new java.util.LinkedHashSet();
        this.j = new java.util.LinkedHashMap();
        this.k = defpackage.afcg.a;
        this.n = new defpackage.gkc(new defpackage.ozv(1));
        this.o = new defpackage.gkc(new defpackage.ozv(0));
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        this.l = intentFilter;
        this.m = new java.util.ArrayList();
    }

    @Override // defpackage.paa
    public final defpackage.zhs a(defpackage.ozz ozzVar) {
        ozzVar.getClass();
        b(ozzVar);
        return defpackage.ysr.cp(java.lang.Boolean.TRUE);
    }

    public final void b(defpackage.ozz ozzVar) {
        this.c.post(new defpackage.oft(this, ozzVar, 8, null));
    }

    public final void c(defpackage.ozz ozzVar) {
        defpackage.yhx yhxVarAy = defpackage.ysr.ay(this.h);
        defpackage.yhy yhyVar = new defpackage.yhy();
        yhyVar.c(1, this.i);
        defpackage.yia yiaVarA = yhyVar.a();
        yiaVarA.getClass();
        ozzVar.d(yhxVarAy, yiaVarA);
    }

    public final void d() {
        defpackage.osa osaVar = new defpackage.osa(this, 9);
        defpackage.gkc gkcVar = this.n;
        java.lang.Runnable runnable = (java.lang.Runnable) gkcVar.u();
        android.os.Handler handler = this.c;
        handler.removeCallbacks(runnable);
        handler.removeCallbacks((java.lang.Runnable) this.o.u());
        gkcVar.v(osaVar);
        handler.post(osaVar);
    }

    public final void e() {
        java.util.Set<android.bluetooth.BluetoothDevice> bondedDevices;
        if (f()) {
            try {
                bondedDevices = this.e.getBondedDevices();
                if (bondedDevices == null) {
                    bondedDevices = defpackage.afcg.a;
                }
            } catch (java.lang.SecurityException e) {
                ((defpackage.yqj) a.h()).u("Missing Bluetooth permissions: bonded devices.");
                if (!defpackage.adax.aE()) {
                    throw e;
                }
                bondedDevices = defpackage.afcg.a;
            }
            java.util.Set<android.bluetooth.BluetoothDevice> setK = defpackage.afga.K(this.k, bondedDevices);
            this.k = bondedDevices;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : bondedDevices) {
                if (((android.bluetooth.BluetoothDevice) obj).isConnected()) {
                    arrayList.add(obj);
                }
            }
            java.util.Set setBf = defpackage.afga.bf(arrayList);
            java.util.Set<android.bluetooth.BluetoothDevice> setK2 = defpackage.afga.K(setBf, this.h);
            java.util.Set<android.bluetooth.BluetoothDevice> setK3 = defpackage.afga.K(this.h, setBf);
            this.h = defpackage.afga.be(setBf);
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            for (android.bluetooth.BluetoothProfile bluetoothProfile : this.j.values()) {
                try {
                    if (defpackage.adax.ay()) {
                        java.util.List<android.bluetooth.BluetoothDevice> connectedDevices = bluetoothProfile.getConnectedDevices();
                        connectedDevices.getClass();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (java.lang.Object obj2 : connectedDevices) {
                            if (this.h.contains((android.bluetooth.BluetoothDevice) obj2)) {
                                arrayList2.add(obj2);
                            }
                        }
                        linkedHashSet.addAll(arrayList2);
                    } else {
                        java.util.List<android.bluetooth.BluetoothDevice> connectedDevices2 = bluetoothProfile.getConnectedDevices();
                        connectedDevices2.getClass();
                        linkedHashSet.addAll(connectedDevices2);
                    }
                    java.util.List<android.bluetooth.BluetoothDevice> devicesMatchingConnectionStates = bluetoothProfile.getDevicesMatchingConnectionStates(new int[]{1});
                    devicesMatchingConnectionStates.getClass();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    for (java.lang.Object obj3 : devicesMatchingConnectionStates) {
                        if (this.h.contains((android.bluetooth.BluetoothDevice) obj3)) {
                            arrayList3.add(obj3);
                        }
                    }
                    linkedHashSet.addAll(arrayList3);
                } catch (java.lang.SecurityException e2) {
                    ((defpackage.yqj) a.h()).u("Missing Bluetooth permissions: profile devices.");
                    if (!defpackage.adax.aE()) {
                        throw e2;
                    }
                }
            }
            java.util.Set<android.bluetooth.BluetoothDevice> setK4 = defpackage.afga.K(linkedHashSet, this.i);
            java.util.Set<android.bluetooth.BluetoothDevice> setK5 = defpackage.afga.K(this.i, linkedHashSet);
            this.i = defpackage.afga.be(linkedHashSet);
            for (android.bluetooth.BluetoothDevice bluetoothDevice : setK3) {
                ((defpackage.yqj) a.f()).y("acl connection removed. device = %s", bluetoothDevice);
                for (defpackage.ozz ozzVar : this.m) {
                    bluetoothDevice.getClass();
                    ozzVar.b(bluetoothDevice);
                }
            }
            for (android.bluetooth.BluetoothDevice bluetoothDevice2 : setK2) {
                ((defpackage.yqj) a.f()).y("acl connection added. device = %s", bluetoothDevice2);
                for (defpackage.ozz ozzVar2 : this.m) {
                    bluetoothDevice2.getClass();
                    ozzVar2.a(bluetoothDevice2);
                }
            }
            for (android.bluetooth.BluetoothDevice bluetoothDevice3 : setK5) {
                ((defpackage.yqj) a.f()).y("profile connection removed. device = %s", bluetoothDevice3);
                java.util.Iterator it = this.m.iterator();
                while (it.hasNext()) {
                    ((defpackage.ozz) it.next()).f(bluetoothDevice3, 0);
                }
            }
            for (android.bluetooth.BluetoothDevice bluetoothDevice4 : setK4) {
                ((defpackage.yqj) a.f()).y("profile connection added. device = %s", bluetoothDevice4);
                java.util.Iterator it2 = this.m.iterator();
                while (it2.hasNext()) {
                    ((defpackage.ozz) it2.next()).f(bluetoothDevice4, 2);
                }
            }
            for (android.bluetooth.BluetoothDevice bluetoothDevice5 : setK) {
                ((defpackage.yqj) a.f()).y("device unbonded. device = %s", bluetoothDevice5);
                for (defpackage.ozz ozzVar3 : this.m) {
                    bluetoothDevice5.getClass();
                    ozzVar3.c(bluetoothDevice5);
                }
            }
            if (defpackage.adax.s() >= 0) {
                this.p.post(new defpackage.osa(this, 10));
            }
        }
    }

    public final boolean f() {
        return !this.g.isEmpty();
    }

    @Override // defpackage.paa
    public final void g(defpackage.ozz ozzVar) {
        this.c.post(new defpackage.oft(this, ozzVar, 9, null));
    }
}
