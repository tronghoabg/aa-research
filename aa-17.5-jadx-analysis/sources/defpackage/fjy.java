package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final /* synthetic */ class fjy implements dny {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ fjy(Object obj, BluetoothDevice bluetoothDevice, int i) {
        this.c = i;
        this.b = obj;
        this.a = bluetoothDevice;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [swe] */
    /* JADX WARN: Type inference failed for: r0v3, types: [afco, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [svz] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, svz] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v3, types: [afeg, java.lang.Object] */
    @Override // defpackage.dny
    public final Object a(dnw dnwVar) throws IOException {
        ?? Az;
        String str;
        int i = this.c;
        if (i == 0) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            dnwVar.a(new elt(atomicBoolean, 13), fjf.a);
            this.a.execute(new ae(atomicBoolean, dnwVar, this.b, 10, (char[]) null));
            return afak.a;
        }
        int i2 = 1;
        if (i == 1) {
            ?? r0 = this.a;
            dnwVar.a(new elt((aivh) r0.get(aivh.d), 12), fjf.a);
            return ahnc.d(ahni.b(r0), null, 1, new jye((afeg) this.b, dnwVar, (afck) null, 1), 1);
        }
        if (i == 2) {
            yph yphVar = ldw.a;
            List listAsList = Arrays.asList((svz) this.a, (svz) this.b);
            if (listAsList == null || listAsList.isEmpty()) {
                Az = spu.az(null);
            } else {
                Iterator it = listAsList.iterator();
                while (it.hasNext()) {
                    if (((svz) it.next()) == null) {
                        throw new NullPointerException("null tasks are not accepted");
                    }
                }
                Az = new swe();
                swh swhVar = new swh(listAsList.size(), Az);
                Iterator it2 = listAsList.iterator();
                while (it2.hasNext()) {
                    spu.aC((svz) it2.next(), swhVar);
                }
            }
            Az.i(zfq.a, new ljd(dnwVar, i2));
            return Az;
        }
        int i3 = 4;
        if (i == 3) {
            this.b.execute(new ojl(this.a, dnwVar, i3));
            return "isWirelessAvailableAsync";
        }
        Object obj = this.a;
        if (i != 4) {
            yph yphVar2 = oyw.a;
            ((trd) this.b).b = dnwVar;
            return "fetchUUids:".concat(String.valueOf(String.valueOf(obj)));
        }
        yph yphVar3 = orf.a;
        xya xyaVar = new xya((xyi) oit.a().b);
        try {
            BluetoothAdapter adapter = ((BluetoothManager) jfj.c((Context) this.b).getSystemService(BluetoothManager.class)).getAdapter();
            BluetoothSocket bluetoothSocketCreateRfcommSocketToServiceRecord = ((BluetoothDevice) obj).createRfcommSocketToServiceRecord(jlq.a);
            adapter.cancelDiscovery();
            xyaVar.e();
            yph yphVar4 = orf.a;
            ((ype) yphVar4.l().ai(6085)).u("Connecting Bluetooth RFCOMM socket.");
            bluetoothSocketCreateRfcommSocketToServiceRecord.connect();
            boolean zIsConnected = bluetoothSocketCreateRfcommSocketToServiceRecord.isConnected();
            ((ype) yphVar4.l().ai(6086)).ah(zIsConnected, xyaVar.c().toMillis());
            bluetoothSocketCreateRfcommSocketToServiceRecord.close();
            dnwVar.b(Boolean.valueOf(zIsConnected));
            return "RFCOMM is connectable to".concat(String.valueOf(String.valueOf(obj)));
        } catch (IOException e) {
            ype ypeVar = (ype) ((ype) ((ype) orf.a.g()).p(e)).ai(6087);
            if (xyaVar.a) {
                str = "Connecting effort duration " + xyaVar.c().toMillis() + " ms";
            } else {
                str = "";
            }
            ypeVar.y("RFCOMM connection failed. %s", str);
            dnwVar.b(false);
            return "RFCOMM is not connectable to".concat(String.valueOf(String.valueOf(obj)));
        }
    }

    public /* synthetic */ fjy(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
