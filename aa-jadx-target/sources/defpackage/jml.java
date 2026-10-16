package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jml implements defpackage.jmb, defpackage.jmm, defpackage.jmq {
    public static final defpackage.jmd a = new defpackage.jmd();
    public static final defpackage.yqm b;
    public static final defpackage.tfe c;
    public static final defpackage.tfg d;
    public static final defpackage.tfg e;
    public static final defpackage.tfg f;
    public final android.content.Context g;
    public final aiuw h;
    public final defpackage.rqt i;
    public final android.companion.virtual.VirtualDeviceManager j;
    public final defpackage.jmn k;
    private final defpackage.jmt l;
    private final defpackage.kof m;
    private final java.util.Map n;

    static {
        defpackage.yqm yqmVarC = defpackage.yqm.c("GH.CmpnDvcCtrlImpl");
        b = yqmVarC;
        java.util.logging.Level level = java.util.logging.Level.FINE;
        level.getClass();
        c = new defpackage.tfe(0, level, yqmVarC, 3);
        d = new defpackage.tff(2);
        e = new defpackage.tff(3);
        f = new defpackage.tff(1);
    }

    public jml(android.content.Context context, defpackage.jmn jmnVar, aiuw aiuwVar, defpackage.rqt rqtVar, defpackage.jmt jmtVar, defpackage.kof kofVar) {
        rqtVar.getClass();
        this.g = context;
        this.k = jmnVar;
        this.h = aiuwVar;
        this.i = rqtVar;
        this.l = jmtVar;
        this.m = kofVar;
        java.util.List listA = jmnVar.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listA) {
            if (defpackage.afga.f(ag$.ExternalSyntheticApiModelOutline0.m(ag$.ExternalSyntheticApiModelOutline0.m(obj)), "android.app.role.SYSTEM_AUTOMOTIVE_PROJECTION")) {
                arrayList.add(obj);
            }
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            android.companion.AssociationInfo associationInfoM = ag$.ExternalSyntheticApiModelOutline0.m(it.next());
            java.lang.String strC = defpackage.jmd.c(associationInfoM, null);
            defpackage.afau afauVar = new defpackage.afau(strC, new defpackage.jmj(this, strC, ag$.ExternalSyntheticApiModelOutline0.m(associationInfoM)));
            linkedHashMap.put(afauVar.a, afauVar.b);
        }
        this.n = linkedHashMap;
        this.j = axd$.ExternalSyntheticApiModelOutline0.m(this.g.getSystemService(axd$.ExternalSyntheticApiModelOutline0.m$7()));
    }

    @Override // defpackage.jmb
    public final synchronized void a(java.lang.String str, defpackage.jly jlyVar) {
        java.util.Map map = this.n;
        defpackage.jmj jmjVar = (defpackage.jmj) map.get(str);
        if (jmjVar != null) {
            jmjVar.b(jlyVar);
            return;
        }
        defpackage.jmj jmjVar2 = new defpackage.jmj(this, str, 0);
        defpackage.jml jmlVar = jmjVar2.f;
        defpackage.jme jmeVar = new defpackage.jme(jmjVar2, jmlVar, jlyVar);
        defpackage.ebq.r(jmlVar.i, defpackage.zbd.Fq);
        android.companion.AssociationRequest associationRequestM = ep$.ExternalSyntheticApiModelOutline1.m(ag$.ExternalSyntheticApiModelOutline0.m(a$.ExternalSyntheticApiModelOutline0.m(ag$.ExternalSyntheticApiModelOutline0.m(new android.companion.AssociationRequest.Builder(), jmjVar2.a), "android.app.role.SYSTEM_AUTOMOTIVE_PROJECTION"), true));
        associationRequestM.getClass();
        ep$.ExternalSyntheticApiModelOutline1.m(jmlVar.k.a, associationRequestM, jmeVar, (android.os.Handler) null);
        map.put(str, jmjVar2);
    }

    @Override // defpackage.jmb
    public final synchronized void b(java.lang.String str, jmo jmoVar) {
        java.lang.Object obj = this.n.get(str);
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("Vehicle ID does not correspond to a known device.");
        }
        defpackage.jmj jmjVar = (defpackage.jmj) obj;
        if (jmjVar.a() != defpackage.jmk.d) {
            throw new java.lang.IllegalStateException("Cannot call sendDeviceDisappeared unless in state PRESENT, but state is " + jmjVar.a() + ".");
        }
        if (jmjVar.d != null) {
            throw new java.lang.IllegalStateException("Cannot overwrite nonnull disappearedCallback.");
        }
        jmjVar.d = jmoVar;
        jmjVar.c(defpackage.jmk.e);
    }

    @Override // defpackage.jmb
    public final synchronized void c() {
        defpackage.jmn jmnVar = this.k;
        java.util.Iterator it = jmnVar.a().iterator();
        while (it.hasNext()) {
            android.companion.AssociationInfo associationInfoM = ag$.ExternalSyntheticApiModelOutline0.m(it.next());
            if (defpackage.afga.f("AA-GAL", ag$.ExternalSyntheticApiModelOutline0.m(associationInfoM))) {
                ((defpackage.yqj) b.f()).y("Disassociating %s", associationInfoM);
                if (hz$.ExternalSyntheticApiModelOutline2.m(associationInfoM)) {
                    jmnVar.b(ag$.ExternalSyntheticApiModelOutline0.m(associationInfoM));
                }
                ag$.ExternalSyntheticApiModelOutline0.m(jmnVar.a, ag$.ExternalSyntheticApiModelOutline0.m(associationInfoM));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [zhs] */
    @Override // defpackage.jmm
    public final synchronized void d(android.companion.AssociationInfo associationInfo) {
        ?? Invoke;
        byte[] bArr = null;
        if (defpackage.afga.f(ag$.ExternalSyntheticApiModelOutline0.m(associationInfo), "android.app.role.SYSTEM_AUTOMOTIVE_PROJECTION")) {
            defpackage.ebq.r(this.i, defpackage.zbd.Ft);
            java.util.Map map = this.n;
            java.lang.String strC = defpackage.jmd.c(associationInfo, null);
            ((defpackage.yqj) b.f()).K("onDeviceAppeared: %s (%d)", strC, ag$.ExternalSyntheticApiModelOutline0.m(associationInfo));
            defpackage.jmj jmjVar = (defpackage.jmj) map.get(strC);
            if (jmjVar != null) {
                if (jmjVar.b != ag$.ExternalSyntheticApiModelOutline0.m(associationInfo)) {
                    throw new java.lang.IllegalArgumentException("Association ID unexpectedly changed!");
                }
                jmjVar.c(defpackage.jmk.d);
            }
        } else if (defpackage.adax.ae() && ag$.ExternalSyntheticApiModelOutline0.m(associationInfo) != null) {
            this.m.d(defpackage.yyn.WIRELESS_BLUETOOTH_DEVICE_CDM_APPEARED);
            defpackage.jmt jmtVar = this.l;
            android.net.MacAddress macAddressM = ag$.ExternalSyntheticApiModelOutline0.m(associationInfo);
            macAddressM.getClass();
            ((defpackage.yqj) b.f()).K("onDeviceAppeared: %s (%d)", macAddressM, ag$.ExternalSyntheticApiModelOutline0.m(associationInfo));
            java.lang.String strM = hh$.ExternalSyntheticApiModelOutline0.m(macAddressM);
            strM.getClass();
            java.lang.String strBC = defpackage.ysr.bC(strM);
            strBC.getClass();
            android.bluetooth.BluetoothAdapter bluetoothAdapter = jmtVar.e;
            android.bluetooth.BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(strBC);
            defpackage.yqm yqmVar = defpackage.jmt.a;
            ((defpackage.yqj) yqmVar.f()).y("Starting wireless setup with device %s", remoteDevice);
            remoteDevice.getClass();
            int i = 1;
            if (bluetoothAdapter.getProfileConnectionState(1) == 2 || bluetoothAdapter.getProfileConnectionState(2) == 2) {
                defpackage.oqy oqyVar = jmtVar.c;
                java.util.concurrent.Executor executor = jmtVar.b;
                defpackage.zhs zhsVarF = oqyVar.f(executor, new defpackage.juh(remoteDevice, i));
                defpackage.key keyVar = new defpackage.key(new defpackage.grw(jmtVar, remoteDevice, 20, bArr), 1);
                int i2 = defpackage.zgh.c;
                defpackage.zgf zgfVar = new defpackage.zgf(zhsVarF, keyVar);
                zhsVarF.c(zgfVar, defpackage.ysr.ch(executor, zgfVar));
                Invoke = zgfVar;
            } else {
                ((defpackage.yqj) yqmVar.f()).u("A2DP/HFP are not connected to the BluetoothAdapter");
                Invoke = jmtVar.d.invoke(jmtVar.f, "com.google.android.apps.auto.carservice.companion.ACL_CONNECTED", remoteDevice, jmtVar.b);
            }
            defpackage.khw khwVar = new defpackage.khw(1);
            Invoke.c(new defpackage.zhi(Invoke, khwVar), jmtVar.b);
        }
    }

    @Override // defpackage.jmm
    public final synchronized void e(android.companion.AssociationInfo associationInfo) {
        if (defpackage.afga.f(ag$.ExternalSyntheticApiModelOutline0.m(associationInfo), "android.app.role.SYSTEM_AUTOMOTIVE_PROJECTION")) {
            defpackage.ebq.r(this.i, defpackage.zbd.Fu);
            java.util.Map map = this.n;
            java.lang.String strC = defpackage.jmd.c(associationInfo, null);
            ((defpackage.yqj) b.f()).K("onDeviceDisappeared: %s (%d)", strC, ag$.ExternalSyntheticApiModelOutline0.m(associationInfo));
            defpackage.jmj jmjVar = (defpackage.jmj) map.get(strC);
            if (jmjVar != null) {
                if (jmjVar.b != ag$.ExternalSyntheticApiModelOutline0.m(associationInfo)) {
                    throw new java.lang.IllegalArgumentException("Association ID unexpectedly changed!");
                }
                jmjVar.c(defpackage.jmk.b);
            }
        } else if (defpackage.adax.ae() && ag$.ExternalSyntheticApiModelOutline0.m(associationInfo) != null) {
            ((defpackage.yqj) b.f()).K("onDeviceDisappeared: %s (%d)", ag$.ExternalSyntheticApiModelOutline0.m(associationInfo), ag$.ExternalSyntheticApiModelOutline0.m(associationInfo));
            this.m.d(defpackage.yyn.WIRELESS_BLUETOOTH_DEVICE_CDM_DISAPPEARED);
        }
    }

    @Override // defpackage.jmq
    public final synchronized defpackage.jmp f(java.lang.String str) {
        defpackage.jmr jmrVar;
        defpackage.jml jmlVar;
        java.lang.Object objA;
        java.lang.Object obj = this.n.get(str);
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("Device ID does not correspond to a known device.");
        }
        defpackage.jmj jmjVar = (defpackage.jmj) obj;
        jmrVar = jmjVar.e;
        jmlVar = jmjVar.f;
        objA = jmrVar.a();
        return new defpackage.jmp((android.companion.virtual.VirtualDeviceManager.VirtualDevice) objA, jmlVar.g, new defpackage.jmf(jmrVar));
    }
}
