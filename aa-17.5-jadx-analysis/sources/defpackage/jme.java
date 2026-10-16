package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.companion.AssociationInfo;
import android.companion.AssociationRequest;
import android.companion.virtual.VirtualDeviceManager;
import android.content.Context;
import android.net.MacAddress;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class jme implements jlu, jmf, jmj {
    public static final jlw a = new jlw();
    public static final yph b;
    public static final tei c;
    public static final tek d;
    public static final tek e;
    public static final tek f;
    public final Context g;
    public final aitx h;
    public final rpz i;
    public final VirtualDeviceManager j;
    public final jmg k;
    private final jmm l;
    private final kny m;
    private final Map n;

    static {
        yph yphVarC = yph.c("GH.CmpnDvcCtrlImpl");
        b = yphVarC;
        Level level = Level.FINE;
        level.getClass();
        c = new tei(0, level, yphVarC, 3);
        d = new tej(2);
        e = new tej(3);
        f = new tej(1);
    }

    public jme(Context context, jmg jmgVar, aitx aitxVar, rpz rpzVar, jmm jmmVar, kny knyVar) {
        rpzVar.getClass();
        this.g = context;
        this.k = jmgVar;
        this.h = aitxVar;
        this.i = rpzVar;
        this.l = jmmVar;
        this.m = knyVar;
        List listA = jmgVar.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (affa.f(ag$$ExternalSyntheticApiModelOutline0.m67m(obj).getDeviceProfile(), "android.app.role.SYSTEM_AUTOMOTIVE_PROJECTION")) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AssociationInfo associationInfoM67m = ag$$ExternalSyntheticApiModelOutline0.m67m(it.next());
            String strC = jlw.c(associationInfoM67m, null);
            aezu aezuVar = new aezu(strC, new jmc(this, strC, associationInfoM67m.getId()));
            linkedHashMap.put(aezuVar.a, aezuVar.b);
        }
        this.n = linkedHashMap;
        this.j = awx$$ExternalSyntheticApiModelOutline0.m(this.g.getSystemService(awx$$ExternalSyntheticApiModelOutline0.m$7()));
    }

    @Override // defpackage.jlu
    public final synchronized void a(String str, jlr jlrVar) {
        Map map = this.n;
        jmc jmcVar = (jmc) map.get(str);
        if (jmcVar != null) {
            jmcVar.b(jlrVar);
            return;
        }
        jmc jmcVar2 = new jmc(this, str, 0);
        jme jmeVar = jmcVar2.f;
        jlx jlxVar = new jlx(jmcVar2, jmeVar, jlrVar);
        dsg.E(jmeVar.i, yzy.Fm);
        AssociationRequest associationRequestBuild = new AssociationRequest.Builder().setDisplayName(jmcVar2.a).setDeviceProfile("android.app.role.SYSTEM_AUTOMOTIVE_PROJECTION").setSelfManaged(true).build();
        associationRequestBuild.getClass();
        jmeVar.k.a.associate(associationRequestBuild, jlxVar, (Handler) null);
        map.put(str, jmcVar2);
    }

    @Override // defpackage.jlu
    public final synchronized void b(String str, jmh jmhVar) {
        Object obj = this.n.get(str);
        if (obj == null) {
            throw new IllegalArgumentException("Vehicle ID does not correspond to a known device.");
        }
        jmc jmcVar = (jmc) obj;
        if (jmcVar.a() != jmd.d) {
            throw new IllegalStateException("Cannot call sendDeviceDisappeared unless in state PRESENT, but state is " + jmcVar.a() + ".");
        }
        if (jmcVar.d != null) {
            throw new IllegalStateException("Cannot overwrite nonnull disappearedCallback.");
        }
        jmcVar.d = jmhVar;
        jmcVar.c(jmd.e);
    }

    @Override // defpackage.jlu
    public final synchronized void c() {
        jmg jmgVar = this.k;
        Iterator it = jmgVar.a().iterator();
        while (it.hasNext()) {
            AssociationInfo associationInfoM67m = ag$$ExternalSyntheticApiModelOutline0.m67m(it.next());
            if (affa.f("AA-GAL", associationInfoM67m.getDisplayName())) {
                ((ype) b.f()).y("Disassociating %s", associationInfoM67m);
                if (associationInfoM67m.isSelfManaged()) {
                    jmgVar.b(associationInfoM67m.getId());
                }
                jmgVar.a.disassociate(associationInfoM67m.getId());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jmf
    public final synchronized void d(AssociationInfo associationInfo) {
        zez zezVarInvoke;
        byte[] bArr = null;
        if (affa.f(associationInfo.getDeviceProfile(), "android.app.role.SYSTEM_AUTOMOTIVE_PROJECTION")) {
            dsg.E(this.i, yzy.Fp);
            Map map = this.n;
            String strC = jlw.c(associationInfo, null);
            ((ype) b.f()).K("onDeviceAppeared: %s (%d)", strC, associationInfo.getId());
            jmc jmcVar = (jmc) map.get(strC);
            if (jmcVar != null) {
                if (jmcVar.b != associationInfo.getId()) {
                    throw new IllegalArgumentException("Association ID unexpectedly changed!");
                }
                jmcVar.c(jmd.d);
            }
        } else if (aczv.ae() && associationInfo.getDeviceMacAddress() != null) {
            this.m.d(yxi.WIRELESS_BLUETOOTH_DEVICE_CDM_APPEARED);
            jmm jmmVar = this.l;
            MacAddress deviceMacAddress = associationInfo.getDeviceMacAddress();
            deviceMacAddress.getClass();
            ((ype) b.f()).K("onDeviceAppeared: %s (%d)", deviceMacAddress, associationInfo.getId());
            String string = deviceMacAddress.toString();
            string.getClass();
            String strAs = woy.as(string);
            strAs.getClass();
            BluetoothAdapter bluetoothAdapter = jmmVar.e;
            BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(strAs);
            yph yphVar = jmm.a;
            ((ype) yphVar.f()).y("Starting wireless setup with device %s", remoteDevice);
            remoteDevice.getClass();
            int i = 1;
            if (bluetoothAdapter.getProfileConnectionState(1) == 2 || bluetoothAdapter.getProfileConnectionState(2) == 2) {
                oqe oqeVar = jmmVar.c;
                Executor executor = jmmVar.b;
                zgp zgpVarF = oqeVar.f(executor, new jud(remoteDevice, i));
                kew kewVar = new kew(new grn(jmmVar, remoteDevice, 16, bArr), i);
                int i2 = zfb.c;
                zez zezVar = new zez(zgpVarF, kewVar);
                zgpVarF.c(zezVar, yrm.aK(executor, zezVar));
                zezVarInvoke = zezVar;
            } else {
                ((ype) yphVar.f()).u("A2DP/HFP are not connected to the BluetoothAdapter");
                zezVarInvoke = jmmVar.d.invoke(jmmVar.f, "com.google.android.apps.auto.carservice.companion.ACL_CONNECTED", remoteDevice, jmmVar.b);
            }
            khs khsVar = new khs(1);
            zezVarInvoke.c(new zgf(zezVarInvoke, khsVar), jmmVar.b);
        }
    }

    @Override // defpackage.jmf
    public final synchronized void e(AssociationInfo associationInfo) {
        if (affa.f(associationInfo.getDeviceProfile(), "android.app.role.SYSTEM_AUTOMOTIVE_PROJECTION")) {
            dsg.E(this.i, yzy.Fq);
            Map map = this.n;
            String strC = jlw.c(associationInfo, null);
            ((ype) b.f()).K("onDeviceDisappeared: %s (%d)", strC, associationInfo.getId());
            jmc jmcVar = (jmc) map.get(strC);
            if (jmcVar != null) {
                if (jmcVar.b != associationInfo.getId()) {
                    throw new IllegalArgumentException("Association ID unexpectedly changed!");
                }
                jmcVar.c(jmd.b);
            }
        } else if (aczv.ae() && associationInfo.getDeviceMacAddress() != null) {
            ((ype) b.f()).K("onDeviceDisappeared: %s (%d)", associationInfo.getDeviceMacAddress(), associationInfo.getId());
            this.m.d(yxi.WIRELESS_BLUETOOTH_DEVICE_CDM_DISAPPEARED);
        }
    }

    @Override // defpackage.jmj
    public final synchronized jmi f(String str) {
        jmk jmkVar;
        jme jmeVar;
        Object objA;
        Object obj = this.n.get(str);
        if (obj == null) {
            throw new IllegalArgumentException("Device ID does not correspond to a known device.");
        }
        jmc jmcVar = (jmc) obj;
        jmkVar = jmcVar.e;
        jmeVar = jmcVar.f;
        objA = jmkVar.a();
        return new jmi((VirtualDeviceManager.VirtualDevice) objA, jmeVar.g, new jly(jmkVar));
    }
}
