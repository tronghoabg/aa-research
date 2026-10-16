package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.stream.Stream;

/* loaded from: classes2.dex */
public final class kxr {
    public final yph a = yph.c("GH.BtHeadsetManager");
    public final AudioManager b;
    public final BluetoothAdapter c;
    public BluetoothHeadset d;
    public ygr e;
    private final Context f;
    private ygr g;
    private final ora h;
    private final oqy i;
    private final kxy j;
    private final eqn k;
    private final eqn l;
    private final eqn m;
    private final BroadcastReceiver n;
    private final sf o;

    public kxr(Context context) {
        BluetoothAdapter defaultAdapter;
        yly ylyVar = yly.a;
        this.e = ylyVar;
        this.g = ylyVar;
        kqc kqcVar = new kqc(this, 4);
        this.k = kqcVar;
        kqc kqcVar2 = new kqc(this, 5);
        this.l = kqcVar2;
        kqc kqcVar3 = new kqc(this, 6);
        this.m = kqcVar3;
        kxp kxpVar = new kxp(this);
        this.n = kxpVar;
        this.f = context;
        this.b = (AudioManager) context.getSystemService("audio");
        if (spu.d()) {
            BluetoothManager bluetoothManager = (BluetoothManager) context.getApplicationContext().getSystemService(BluetoothManager.class);
            bluetoothManager.getClass();
            defaultAdapter = bluetoothManager.getAdapter();
        } else {
            defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        }
        this.c = defaultAdapter;
        ora oraVarA = ora.a();
        this.h = oraVarA;
        ygr ygrVar = oqy.a;
        oqy oqyVar = (oqy) mki.a.i(oqy.class);
        this.i = oqyVar;
        kxy kxyVar = (kxy) mki.a.i(kxy.class);
        this.j = kxyVar;
        this.o = new sf((byte[]) null);
        oqyVar.i(kqcVar);
        oraVarA.i(kqcVar2);
        kxyVar.i(kqcVar3);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
        intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
        dup.e(context, kxpVar, intentFilter, null, 2);
    }

    private final void e(ygr ygrVar) {
        ((ype) this.a.l().ai(3514)).y("Connected headsets: %s", ygrVar);
        this.g = ygrVar;
    }

    private final boolean f() {
        BluetoothAdapter bluetoothAdapter = this.c;
        return bluetoothAdapter != null && bluetoothAdapter.isEnabled();
    }

    private final boolean g() {
        return (!f() || this.d == null || this.g.isEmpty()) ? false : true;
    }

    public final synchronized void a(yfs yfsVar) {
        ((ype) this.a.l().ai(3513)).y("Connected bluetooth devices %s", yfsVar.d());
        yfq yfqVarA = yfsVar.c(1);
        int i = 2;
        yfq yfqVarA2 = yfsVar.c(2);
        Stream stream = Collection.EL.stream(yfqVarA);
        yfqVarA2.getClass();
        yfq yfqVar = (yfq) stream.filter(new koh(yfqVarA2, 10)).collect(ycm.a);
        if (yfqVar.isEmpty() || !f()) {
            e(yly.a);
            return;
        }
        ygp ygpVar = new ygp();
        Iterable$EL.forEach(yfqVar, new kqa(this, ygpVar, i));
        e(ygpVar.g());
    }

    public final synchronized void b() {
        d();
        this.i.k(this.k);
        this.h.k(this.l);
        this.j.k(this.m);
        try {
            this.f.unregisterReceiver(this.n);
        } catch (IllegalStateException e) {
            ((ype) ((ype) ((ype) this.a.h()).p(e)).ai((char) 3516)).u("Failed to unregister audio state listener");
        }
    }

    public final synchronized void c() {
        if (g()) {
            kxq kxqVar = null;
            if (!this.g.isEmpty()) {
                kxw kxwVar = (kxw) Collection.EL.stream(this.e).filter(new kxo(0)).findFirst().orElse(null);
                if (kxwVar == null) {
                    ((ype) this.a.l().ai(3512)).y("No supported audio devices? Connected headsets: %s ", this.g);
                } else {
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) Collection.EL.stream(this.g).filter(new koh(kxwVar, 9)).findFirst().orElse(null);
                    if (bluetoothDevice == null) {
                        ((ype) this.a.l().ai(3511)).M("No active headset? Connected headsets: %s, Device info: %s ", this.g, kxwVar);
                    } else {
                        kxqVar = new kxq(bluetoothDevice, kxwVar);
                    }
                }
            }
            if (kxqVar == null) {
                ((ype) this.a.l().ai(3515)).y("No active headset? Connected headsets: %s", this.g);
                return;
            }
            sf sfVar = this.o;
            BluetoothHeadset bluetoothHeadset = this.d;
            bluetoothHeadset.getClass();
            AudioManager audioManager = this.b;
            audioManager.getClass();
            kxt kxtVar = new kxt(bluetoothHeadset, kxqVar.a);
            BluetoothDevice bluetoothDevice2 = kxtVar.b;
            if (kxtVar.a.startVoiceRecognition(bluetoothDevice2)) {
                ((ype) kxtVar.c.l().ai(3522)).y("Started voice recognition mode on %s", bluetoothDevice2.getName());
                sfVar.a = kxtVar;
                return;
            }
            ((ype) kxtVar.c.l().ai(3521)).y("Failed to start voice recognition mode on %s", bluetoothDevice2.getName());
            if (spu.d()) {
                kxu kxuVar = new kxu(audioManager, kxqVar.b.c);
                AudioManager audioManager2 = kxuVar.a;
                AudioDeviceInfo audioDeviceInfo = kxuVar.b;
                if (audioManager2.setCommunicationDevice(audioDeviceInfo)) {
                    ((ype) kxuVar.c.l().ai(3525)).y("Started virtual voice call on %s", audioDeviceInfo.getProductName());
                    sfVar.a = kxuVar;
                    return;
                }
                ((ype) kxuVar.c.l().ai(3524)).y("Failed to start virtual voice call on %s", audioDeviceInfo.getProductName());
            }
            kxs kxsVar = new kxs(audioManager);
            ((ype) kxsVar.b.l().ai(3518)).u("Starting Bluetooth SCO");
            kxsVar.a.startBluetoothSco();
            sfVar.a = kxsVar;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kxn] */
    public final synchronized void d() {
        sf sfVar;
        ?? r1;
        if (!g() || (r1 = (sfVar = this.o).a) == 0) {
            return;
        }
        r1.a();
        sfVar.a = null;
    }
}
