package defpackage;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class pca implements ozc {
    public static final yph a = yph.c("GH.CurrentCarTracker");
    public final Handler b = new Handler(Looper.getMainLooper());
    public final Set c = new HashSet();
    public final Set d = new HashSet();
    public final Object e = new Object();
    public zit f;
    private final boolean g;
    private final Supplier h;
    private final ajdr i;

    public pca(ajdr ajdrVar, Supplier supplier, boolean z) {
        this.i = ajdrVar;
        this.h = supplier;
        this.g = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, oqe] */
    private final boolean h() {
        wer.c();
        ajdr ajdrVar = this.i;
        ?? r1 = ajdrVar.a;
        r1.getClass();
        zit zitVar = this.f;
        zitVar.getClass();
        if (r1.j((BluetoothDevice) zitVar.c)) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) ((eqj) ajdrVar.c).e();
            Set set = this.c;
            if (!set.contains(this.f.c)) {
                return false;
            }
            if (bluetoothDevice == null || this.d.contains(bluetoothDevice)) {
                return true;
            }
            return aczv.ac() && set.contains(bluetoothDevice);
        }
        if (this.d.contains(this.f.c)) {
            return true;
        }
        if (!this.c.contains(this.f.c)) {
            return false;
        }
        if (this.g) {
            return true;
        }
        Object obj = this.f.c;
        wer.c();
        if (!aczv.aU()) {
            try {
                if (((Optional) ((ozf) this.h.get()).f((BluetoothDevice) obj).get()).isPresent()) {
                    return true;
                }
            } catch (InterruptedException | ExecutionException e) {
                ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 6298)).u("Failed to check WPP data in datastore");
            }
        }
        return false;
    }

    @Override // defpackage.ozc
    public final void a(BluetoothDevice bluetoothDevice) {
        this.b.post(new ojl(this, bluetoothDevice, 9));
    }

    @Override // defpackage.ozc
    public final void b(BluetoothDevice bluetoothDevice) {
        this.b.post(new ojl(this, bluetoothDevice, 10));
    }

    @Override // defpackage.ozc
    public final void d(ygr ygrVar, ygu yguVar) {
        this.b.post(new oey(this, ygrVar, yguVar, 10, (short[]) null));
    }

    @Override // defpackage.ozc
    public final void e() {
        this.b.post(new oyy(this, 17));
    }

    @Override // defpackage.ozc
    public final void f(BluetoothDevice bluetoothDevice, int i) {
        this.b.post(new oa(this, i, bluetoothDevice, 14));
    }

    public final void g() {
        wer.c();
        zit zitVar = this.f;
        if (zitVar == null) {
            return;
        }
        int i = zitVar.b;
        if (i == 0) {
            throw null;
        }
        if (i == 1 && !h()) {
            ((ype) ((ype) a.f()).ai(6296)).y("current car bluetooth connection is lost: %s", this.f.c);
            this.f.b = 2;
            this.b.postDelayed(new oyy(this, 18), this.e, aczv.d());
            return;
        }
        int i2 = this.f.b;
        if (i2 == 0) {
            throw null;
        }
        if (i2 == 1 || !h()) {
            return;
        }
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai(6294)).y("current car is bluetooth connected: %s", this.f.c);
        zit zitVar2 = this.f;
        int i3 = zitVar2.b;
        zitVar2.b = 1;
        this.b.removeCallbacksAndMessages(this.e);
        if (i3 == 0) {
            throw null;
        }
        if (i3 == 3) {
            ((ype) ((ype) yphVar.f()).ai(6295)).y("current car is bluetooth re-appeared: %s", this.f.c);
            zit zitVar3 = this.f;
            ((ajmd) zitVar3.a).g((BluetoothDevice) zitVar3.c);
        }
    }

    @Override // defpackage.ozc
    public final void c(BluetoothDevice bluetoothDevice) {
    }
}
