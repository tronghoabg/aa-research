package defpackage;

import android.bluetooth.BluetoothDevice;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class pcl implements ozc {
    final /* synthetic */ kzt a;

    public pcl(kzt kztVar) {
        this.a = kztVar;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // defpackage.ozc
    public final void a(BluetoothDevice bluetoothDevice) {
        Object objB;
        pcm pcmVar;
        Object objPutIfAbsent;
        ?? r8 = this.a.a;
        Object objA = r8.get(bluetoothDevice);
        if (objA == null && (objPutIfAbsent = r8.putIfAbsent(bluetoothDevice, (objA = ajac.a(new pcm(false, false, false, true))))) != null) {
            objA = objPutIfAbsent;
        }
        ajab ajabVar = (ajab) objA;
        do {
            objB = ajabVar.b();
            pcmVar = (pcm) objB;
        } while (!ajabVar.e(objB, new pcm(true, pcmVar.b, pcmVar.c, bluetoothDevice.getBondState() == 12)));
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // defpackage.ozc
    public final void b(BluetoothDevice bluetoothDevice) {
        Object objB;
        pcm pcmVar;
        Object objPutIfAbsent;
        ?? r5 = this.a.a;
        Object objA = r5.get(bluetoothDevice);
        if (objA == null && (objPutIfAbsent = r5.putIfAbsent(bluetoothDevice, (objA = ajac.a(new pcm(false, false, false, true))))) != null) {
            objA = objPutIfAbsent;
        }
        ajab ajabVar = (ajab) objA;
        do {
            objB = ajabVar.b();
            pcmVar = (pcm) objB;
        } while (!ajabVar.e(objB, new pcm(false, pcmVar.b, pcmVar.c, pcmVar.d)));
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // defpackage.ozc
    public final void c(BluetoothDevice bluetoothDevice) {
        Object objB;
        pcm pcmVar;
        Object objPutIfAbsent;
        ?? r5 = this.a.a;
        Object objA = r5.get(bluetoothDevice);
        if (objA == null && (objPutIfAbsent = r5.putIfAbsent(bluetoothDevice, (objA = ajac.a(new pcm(false, false, false, true))))) != null) {
            objA = objPutIfAbsent;
        }
        ajab ajabVar = (ajab) objA;
        do {
            objB = ajabVar.b();
            pcmVar = (pcm) objB;
        } while (!ajabVar.e(objB, new pcm(pcmVar.a, pcmVar.b, pcmVar.c, false)));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // defpackage.ozc
    public final void d(ygr ygrVar, ygu yguVar) {
        Object objPutIfAbsent;
        yno it = ygrVar.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            ?? r2 = this.a.a;
            BluetoothDevice bluetoothDevice = (BluetoothDevice) next;
            Object objA = r2.get(bluetoothDevice);
            if (objA == null && (objPutIfAbsent = r2.putIfAbsent(bluetoothDevice, (objA = ajac.a(new pcm(false, false, false, true))))) != null) {
                objA = objPutIfAbsent;
            }
            ((ajab) objA).d(new pcm(true, yguVar.c(1).contains(bluetoothDevice), yguVar.c(2).contains(bluetoothDevice), true));
        }
        ((ajab) this.a.c).d(true);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.ozc
    public final void e() {
        kzt kztVar = this.a;
        ((ajab) kztVar.c).d(false);
        Iterator it = kztVar.a.entrySet().iterator();
        while (it.hasNext()) {
            ((ajab) ((Map.Entry) it.next()).getValue()).d(new pcm(false, false, false, true));
        }
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // defpackage.ozc
    public final void f(BluetoothDevice bluetoothDevice, int i) {
        boolean z;
        boolean z2;
        Object objB;
        pcm pcmVar;
        boolean z3;
        Object objPutIfAbsent;
        bluetoothDevice.getClass();
        ?? r7 = this.a.a;
        Object objA = r7.get(bluetoothDevice);
        if (objA == null && (objPutIfAbsent = r7.putIfAbsent(bluetoothDevice, (objA = ajac.a(new pcm(false, false, false, true))))) != null) {
            objA = objPutIfAbsent;
        }
        ajab ajabVar = (ajab) objA;
        do {
            z = i != 2;
            z2 = i == 2;
            objB = ajabVar.b();
            pcmVar = (pcm) objB;
            z3 = pcmVar.a;
            boolean z4 = pcmVar.b;
        } while (!ajabVar.e(objB, new pcm(z3, z2, pcmVar.c, (!z) | pcmVar.d)));
    }
}
