package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Binder;
import android.os.Process;
import android.os.RemoteException;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.car.bluetooth.data.CarBluetoothData;
import j$.util.Optional;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final /* synthetic */ class flt implements Callable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public flt(esy esyVar, int i) {
        this.b = i;
        this.a = esyVar;
    }

    /* JADX WARN: Type inference failed for: r12v55, types: [ackk, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() throws qrz, IOException {
        Object objA = null;
        boolean z = false;
        z = false;
        boolean z2 = false;
        z = false;
        boolean z3 = false;
        int i = 0;
        switch (this.b) {
            case 0:
                fod fodVar = ((flz) this.a).a;
                if (fodVar.b != fju.a) {
                    fjo.a().c(fma.a, String.valueOf(fodVar.c).concat(" is not in ENQUEUED state. Nothing more to do"));
                    return true;
                }
                if ((!fodVar.d() && !fodVar.c()) || System.currentTimeMillis() >= fodVar.a()) {
                    return false;
                }
                fjo.a().c(fma.a, "Delaying execution for " + fodVar.c + " because it is being executed before schedule.");
                return true;
            case 1:
                Object obj = this.a;
                ((esy) obj).e.set(true);
                try {
                    Process.setThreadPriority(10);
                    objA = ((esy) obj).a();
                    Binder.flushPendingCommands();
                    return objA;
                } finally {
                }
            case 2:
                flz flzVar = (flz) this.a;
                String str = flzVar.c;
                foe foeVar = flzVar.f;
                if (foeVar.b(str) == fju.a) {
                    foeVar.w(fju.b, str);
                    foeVar.r(str);
                    foeVar.o(str, -256);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                WorkDatabase workDatabase = (WorkDatabase) ((gjv) this.a).a;
                Long lA = workDatabase.t().a("next_job_scheduler_id");
                int iLongValue = lA != null ? (int) lA.longValue() : 0;
                dtb.d(workDatabase, iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1);
                if (iLongValue < 0) {
                    dtb.d(workDatabase, 1);
                } else {
                    i = iLongValue;
                }
                return Integer.valueOf(i);
            case 4:
                mqp mqpVarB = mqp.b((mqc) this.a);
                mqpVarB.getClass();
                return mqpVarB;
            case 5:
                kxg kxgVar = (kxg) this.a;
                byte[] bArr = kxgVar.c;
                int length = bArr.length;
                rny rnyVar = kxgVar.d;
                if (rnyVar.c != 1) {
                    throw new IllegalStateException("startRecording not called");
                }
                int i2 = sk.AUDIO_CONTENT_BUFFER_SIZE;
                int i3 = 0;
                while (i2 > 0) {
                    try {
                        int iMin = Math.min(i2, 16384);
                        qvh qvhVar = rnyVar.a;
                        qvj qvjVar = rnyVar.d;
                        if (qvhVar.k(qvjVar, iMin)) {
                            int i4 = rnyVar.b.read(bArr, i3, iMin);
                            if (i4 > 0) {
                                qvhVar.d(qvjVar, i4);
                                i3 += i4;
                                i2 -= i4;
                            } else {
                                rrd.d(5, "CAR.AUDIO.RECORD", null, "CarAudioRecord read returned %d", Integer.valueOf(i4));
                            }
                        } else {
                            rrd.d(4, "CAR.AUDIO.RECORD", null, "No data available to read %d bytes", Integer.valueOf(iMin));
                        }
                    } catch (RemoteException e) {
                        rnyVar.a(e);
                    } catch (IOException unused) {
                        rrd.b("CAR.AUDIO.RECORD", null, "CarAudioRecord error reading microphone data");
                    } catch (IllegalStateException e2) {
                        olm.f(e2);
                    }
                    i3 = -1;
                    return Integer.valueOf(i3);
                }
                return Integer.valueOf(i3);
            case 6:
                kxl kxlVar = (kxl) this.a;
                byte[] bArr2 = kxlVar.d;
                int length2 = bArr2.length;
                return Integer.valueOf(kxlVar.c.read(bArr2, 0, 8192));
            case 7:
                yph yphVar = kyw.a;
                Object obj2 = this.a;
                kwp kwpVar = new kwp(obj2, (byte[]) null);
                Pattern pattern = wez.a;
                wey weyVar = new wey((Context) obj2);
                weyVar.b("assistant");
                weyVar.c("assistant_stored_data.pb");
                return vuf.O(weyVar.a(), kwpVar);
            case 8:
                lcw lcwVar = lcy.a;
                Object obj3 = this.a;
                kwp kwpVar2 = new kwp(obj3, (byte[]) null);
                Pattern pattern2 = wez.a;
                wey weyVar2 = new wey((Context) obj3);
                weyVar2.b("csat");
                weyVar2.c("ratelimit.pb");
                return vuf.O(weyVar2.a(), kwpVar2);
            case 9:
                return dsg.B(((pgr) this.a).q);
            case 10:
                return (erb) this.a.a();
            case 11:
                qcx qcxVar = (qcx) this.a;
                if (qcxVar.j.isEmpty() && qcxVar.o()) {
                    qcxVar.l();
                }
                return null;
            case 12:
                Optional optionalOfNullable = Optional.ofNullable(((qrg) this.a).k);
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = Optional.ofNullable(((CarBluetoothData) optionalOfNullable.get()).a());
                }
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = Optional.ofNullable(((BluetoothDevice) optionalOfNullable.get()).getAddress());
                }
                return (String) optionalOfNullable.orElse(null);
            case 13:
                return Boolean.valueOf(((rhg) this.a).e());
            case 14:
                return Boolean.valueOf(((rhg) this.a).g());
            case 15:
                rgv rgvVar = ((qrg) this.a).h;
                if (rgvVar != null && rgvVar.a()) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 16:
                rgv rgvVar2 = ((qrg) this.a).h;
                if (rgvVar2 != null && rgvVar2.b()) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 17:
                return Boolean.valueOf(((rhg) this.a).h());
            case 18:
                return ((Context) ((kex) this.a).b).getSharedPreferences("com.google.geo_sdk.PREFERENCES_FILE", 0);
            case 19:
                ((BroadcastReceiver.PendingResult) this.a).finish();
                return null;
            default:
                int i5 = wdx.a;
                return ((Context) this.a).getExternalFilesDirs(null);
        }
    }

    public /* synthetic */ flt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
