package defpackage;

import android.content.Context;
import android.hardware.usb.UsbManager;
import android.hardware.usb.UsbPort;
import android.os.Build;
import android.widget.Toast;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.DesugarCollections;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class kqq implements ryg {
    public final String d;
    private final Function g;
    private xxh h;
    private ryx i;
    public static final yph a = yph.c("GH.ResetHandler");
    public static final Executor b = Executors.newSingleThreadExecutor();
    private static final Duration e = Duration.ofMinutes(1);
    static final Duration c = Duration.ofMinutes(1);
    private static final yfy f = yfy.p(kqp.a, 0L, kqp.b, 4L, kqp.c, 16L, kqp.d, 32L, kqp.e, 8L, kqp.f, 1024L);

    public kqq(String str) {
        kqm kqmVar = new kqm(0);
        this.h = xvy.a;
        this.d = str;
        this.g = kqmVar;
    }

    static final wgx e(Context context) {
        wgg wggVarA = wgh.a();
        Pattern pattern = wez.a;
        wey weyVar = new wey(context);
        weyVar.b("connection_reset");
        weyVar.c("connection_reset.pb");
        wggVarA.d(weyVar.a());
        wggVarA.c(kqh.a);
        wggVarA.a = wgj.a;
        return vqk.f().e(wggVarA.a());
    }

    private static yxj f(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? i2 != 2 ? i2 != 3 ? yxj.CONNECTION_RESET_ORIGIN_PRE_SETUP : yxj.CONNECTION_RESET_ORIGIN_USB_MONITOR : yxj.CONNECTION_RESET_ORIGIN_CRASH_HANDLER : yxj.CONNECTION_RESET_ORIGIN_DEATH_RECIPIENT;
        }
        tss.q("GH.ResetHandler", "Origin cannot be UNKNOWN", new Object[0]);
        return yxj.CONNECTION_RESET_ORIGIN_UNSPECIFIED;
    }

    /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.Object, kqr] */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, kqr] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, kqr] */
    @Override // defpackage.ryg
    public final void a(Context context, ryf ryfVar) {
        UsbManager usbManager = (UsbManager) context.getSystemService("usb");
        usbManager.getClass();
        int i = 0;
        if (acso.g()) {
            Toast.makeText(context, String.format(Locale.ENGLISH, "USB reset triggered using method %s", ryfVar), 1).show();
        }
        switch (ryfVar.ordinal()) {
            case 1:
                if (Build.VERSION.SDK_INT >= 33) {
                    for (UsbPort usbPort : usbManager.getPorts()) {
                        ((ype) a.l().ai((char) 3410)).u("Requesting USB port reset");
                        try {
                            dsg.w(new kqn(usbPort, i)).get();
                        } catch (InterruptedException | ExecutionException e2) {
                            ((ype) ((ype) ((ype) a.h()).p(e2)).ai((char) 3411)).u("Failed to get futures");
                        }
                    }
                    break;
                } else {
                    ((ype) ((ype) a.h()).ai((char) 3393)).u("Can't call resetPort on Android S-");
                    break;
                }
            case 2:
                ((ype) a.l().ai((char) 3409)).u("Requesting USB gadget reset");
                usbManager.resetUsbGadget();
                break;
            case 3:
                for (UsbPort usbPort2 : usbManager.getPorts()) {
                    ((ype) a.l().ai((char) 3412)).u("Requesting USB roles reset");
                    usbPort2.setRoles(1, 1);
                }
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                yph yphVar = a;
                ((ype) yphVar.l().ai((char) 3407)).u("Requesting USB function reset");
                kqp kqpVar = kqp.a;
                switch (ryfVar.ordinal()) {
                    case 4:
                    case 5:
                        break;
                    case 6:
                        kqpVar = kqp.b;
                        break;
                    case 7:
                        kqpVar = kqp.c;
                        break;
                    case 8:
                        kqpVar = kqp.d;
                        break;
                    case 9:
                        kqpVar = kqp.e;
                        break;
                    case 10:
                        kqpVar = kqp.f;
                        break;
                    default:
                        ((ype) ((ype) yphVar.h()).ai((char) 3408)).y("Unknown reset method %s", ryfVar.name());
                        break;
                }
                Long l = (Long) f.get(kqpVar);
                l.getClass();
                usbManager.setCurrentFunctions(l.longValue());
                break;
            case 11:
                if (this.h.f()) {
                    this.h.b().e();
                }
                xxh xxhVarH = xxh.h((kqr) this.g.apply(context));
                this.h = xxhVarH;
                xxhVarH.b().d();
                if (this.i != null) {
                    this.h.b().a(this.i);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kqr] */
    @Override // defpackage.ryg
    public final void b(ryx ryxVar) {
        this.i = ryxVar;
        if (this.h.f()) {
            this.h.b().a(ryxVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ryg
    public final void c(Context context, long j) {
        int iZ;
        wer.c();
        if (Build.VERSION.SDK_INT < 30) {
            ((ype) a.l().ai((char) 3406)).u("USB reset not available on this version of Android, so recovery not possible");
            return;
        }
        wgx wgxVarE = e(context);
        try {
            kqh kqhVar = (kqh) wgxVarE.c().get();
            String str = this.d;
            kqi kqiVar = kqi.a;
            kqi kqiVar2 = (kqi) kqhVar.b.get(str);
            if (kqiVar2 == null) {
                kqiVar2 = kqiVar;
            }
            abpt abptVar = kqiVar2.c;
            if (abptVar == null) {
                abptVar = abpt.a;
            }
            long jA = abqu.a(abptVar);
            String str2 = kqiVar2.d;
            boolean z = kqiVar2.e;
            yph yphVar = a;
            ((ype) yphVar.l().ai(3401)).S("Reading timestamp: %d, origin: %s, recoveryRecorded: %b, callerKey: %s", Long.valueOf(jA), str2, Boolean.valueOf(z), str);
            if (jA <= 0) {
                ((ype) ((ype) yphVar.f()).ai((char) 3404)).u("Couldn't read last USB reset start");
                return;
            }
            if (z) {
                ((ype) ((ype) yphVar.f()).ai((char) 3403)).u("Recovery already recorded once, so not recording again");
                return;
            }
            wgxVarE.a(new pgv(this, kqiVar2, 1, null), zfq.a);
            Duration durationMinusMillis = Duration.ofMillis(j).minusMillis(jA);
            if (durationMinusMillis.toSeconds() > e.toSeconds()) {
                ((ype) yphVar.l().ai(3402)).x("Last start duration of %d seconds considered too old to be a successful USB recovery", durationMinusMillis.toSeconds());
                return;
            }
            woy.aa(!str2.isEmpty(), "If startMillis is set, originString must also be set");
            try {
                iZ = qrv.z(str2.toUpperCase(Locale.US));
            } catch (IllegalArgumentException | NullPointerException e2) {
                tss.r("GH.ResetHandler", e2, "Unknown origin %s", str2);
                iZ = 0;
            }
            rpz rpzVarA = rpz.a(context);
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.LIFECYCLE_RECOVERY, yzy.oT);
            rrbVarH.m(acai.G);
            rrbVarH.u(durationMinusMillis.toMillis());
            if (iZ == 0) {
                throw null;
            }
            rrbVarH.s(f(iZ));
            rpzVarA.c(rrbVarH.l());
        } catch (InterruptedException | ExecutionException e3) {
            ((ype) ((ype) ((ype) a.h()).p(e3)).ai((char) 3405)).u("Failed to read from connection reset store");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ryg
    public final void d(Context context, int i, final int i2, final ryf ryfVar) {
        wer.c();
        if (i != 1) {
            ((ype) ((ype) a.f()).ai((char) 3392)).u("Connect type is not USB so cannot schedule a reset");
            return;
        }
        final Instant instantNow = Instant.now();
        try {
            for (kqi kqiVar : DesugarCollections.unmodifiableMap(((kqh) e(context).c().get()).b).values()) {
                if ((kqiVar.b & 1) != 0 && (ryfVar.name().equals(kqiVar.f) || !qrv.y(i2).equals(kqiVar.d))) {
                    abpt abptVar = kqiVar.c;
                    if (abptVar == null) {
                        abptVar = abpt.a;
                    }
                    Duration durationBetween = Duration.between(wox.ai(abptVar), instantNow);
                    long seconds = durationBetween.toSeconds();
                    Duration duration = c;
                    if (seconds < duration.toSeconds()) {
                        ((ype) ((ype) a.f()).ai(3390)).G("Last reset was done %d seconds ago, but minimum elapsed time must be %d seconds", durationBetween.toSeconds(), duration.toSeconds());
                        return;
                    }
                }
            }
            yph yphVar = a;
            ((ype) yphVar.l().ai(3400)).R("Writing timestamp: %d, origin: %s, recoveryRecorded: false, callerKey: %s", Long.valueOf(instantNow.toEpochMilli()), qrv.y(i2), this.d);
            e(context).a(new xwx() { // from class: kqo
                @Override // defpackage.xwx
                public final Object a(Object obj) {
                    abnp abnpVarK = ((kqh) obj).K();
                    abnp abnpVarN = kqi.a.n();
                    abpt abptVarAg = wox.ag(instantNow);
                    abnpVarN.t();
                    kqi kqiVar2 = (kqi) abnpVarN.b;
                    abptVarAg.getClass();
                    kqiVar2.c = abptVarAg;
                    kqiVar2.b |= 1;
                    abnpVarN.t();
                    kqi kqiVar3 = (kqi) abnpVarN.b;
                    kqiVar3.b |= 2;
                    kqiVar3.d = qrv.y(i2);
                    abnpVarN.t();
                    kqi kqiVar4 = (kqi) abnpVarN.b;
                    kqiVar4.b |= 4;
                    kqiVar4.e = false;
                    String strName = ryfVar.name();
                    abnpVarN.t();
                    kqi kqiVar5 = (kqi) abnpVarN.b;
                    strName.getClass();
                    kqiVar5.b |= 8;
                    kqiVar5.f = strName;
                    abnpVarK.y(this.a.d, (kqi) abnpVarN.q());
                    return (kqh) abnpVarK.q();
                }
            }, zfq.a);
            rpz rpzVarA = rpz.a(context);
            yxy yxyVar = yxy.GEARHEAD;
            yzz yzzVar = yzz.LIFECYCLE_RECOVERY;
            rrb rrbVarH = rrc.h(yxyVar, yzzVar, yzy.oS);
            rrbVarH.m(acai.G);
            rrbVarH.s(f(i2));
            rpzVarA.c(rrbVarH.l());
            if (ryfVar == ryf.a) {
                ((ype) yphVar.l().ai((char) 3388)).u("No USB reset method set");
                return;
            }
            ((ype) ((ype) yphVar.f()).ai((char) 3389)).y("Requesting USB reset method %s", ryfVar);
            a(context, ryfVar);
            rpz.a(context).c(rrc.h(yxyVar, yzzVar, yzy.oV).l());
        } catch (InterruptedException | ExecutionException e2) {
            ((ype) ((ype) ((ype) a.h()).p(e2)).ai((char) 3391)).u("Failed to read from connection reset store");
        }
    }
}
