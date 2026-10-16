package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import j$.time.Instant;

/* loaded from: classes.dex */
public final class vrc implements ackr {
    private final acku a;
    private final /* synthetic */ int b;

    public vrc(acku ackuVar, int i) {
        this.b = i;
        this.a = ackuVar;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() throws PackageManager.NameNotFoundException {
        Looper looper;
        switch (this.b) {
            case 0:
                return new vrb((ajgu) ((acks) this.a).b);
            case 1:
                return new vqq((Context) ((acks) this.a).b);
            case 2:
                return new vrw(ackq.b(this.a));
            case 3:
                Context context = (Context) ((acks) this.a).b;
                int i = sjw.c;
                return Integer.valueOf(skm.a(context));
            case 4:
                Context context2 = (Context) ((acks) this.a).b;
                PackageManager packageManager = context2.getPackageManager();
                String packageName = context2.getPackageName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                    return new abmz(packageInfo.versionName, packageInfo.versionCode);
                } catch (PackageManager.NameNotFoundException e) {
                    ((ynz) ((ynz) ((ynz) vlj.a.h()).p(e)).ai((char) 9801)).y("Failed to get PackageInfo for: %s", packageName);
                    return new abmz((String) null, 0);
                }
            case 5:
                return new vsg((xyi) this.a.a());
            case 6:
                Object ympVar = a.O() ? new ymp((vsa) this.a.a()) : yly.a;
                ympVar.getClass();
                return ympVar;
            case 7:
                return !((xxh) ((acks) this.a).b).f() ? new vuf() : new vuf();
            case 8:
                return !((xxh) ((acks) this.a).b).f() ? new vuf() : new vuf();
            case 9:
                xxh xxhVar = (xxh) ((acks) this.a).b;
                if (xxhVar.f()) {
                    looper = (Looper) xxhVar.b();
                } else {
                    HandlerThread handlerThread = new HandlerThread("Primes-Jank", 10);
                    handlerThread.start();
                    looper = handlerThread.getLooper();
                }
                return new Handler(looper);
            case 10:
                return new vuq((ajgu) ((acks) this.a).b);
            case 11:
                return new vvl((ajgu) ((acks) this.a).b);
            case 12:
                return new vwa((ajgu) ((acks) this.a).b);
            case 13:
                xxh xxhVar2 = (xxh) ((acks) this.a).b;
                xvy xvyVar = xvy.a;
                return (vwg) xxhVar2.d(new vwg(xvyVar, xvyVar));
            case 14:
                return new vwl((ajgu) ((acks) this.a).b);
            case 15:
                return new ymp((vsa) this.a.a());
            case 16:
                return new vwr((ajgu) ((acks) this.a).b);
            case 17:
                return new vxf((ajgu) ((acks) this.a).b);
            case 18:
                return new vxo((ajgu) ((acks) this.a).b);
            default:
                final tmb tmbVar = (tmb) this.a.a();
                return new zeq() { // from class: vxv
                    @Override // defpackage.zeq
                    public final Instant a() {
                        return Instant.ofEpochMilli(tmbVar.a());
                    }
                };
        }
    }
}
