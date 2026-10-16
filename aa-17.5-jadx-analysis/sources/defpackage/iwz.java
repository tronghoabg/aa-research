package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.car.CarAudioConfiguration;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class iwz extends qva implements jbo {
    private static final yph i = yph.c("CAR.AUDIO");
    public ixa c;
    protected final jew d;
    volatile lds h;
    private int j;
    private iww k;
    private final jev l;
    private final ikz m;
    private final Context n;
    private final jfg o;
    private final irl p;
    public final List a = new ArrayList();
    protected final ScheduledExecutorService b = Executors.newScheduledThreadPool(1);
    public final jfm e = new jfm("GearheadCarAudioService");
    public final Set f = new CopyOnWriteArraySet();
    public final iwv g = new iwy(this, 0);

    public iwz(jev jevVar, ikz ikzVar, jew jewVar, jfg jfgVar, Context context, irl irlVar) {
        this.l = jevVar;
        this.m = ikzVar;
        this.d = jewVar;
        this.o = jfgVar;
        this.p = irlVar;
        Context contextC = jfj.c(context);
        this.n = contextC;
        if (ikzVar.l()) {
            ((ype) ((ype) i.f()).ai((char) 1511)).u("Clean up existing raw audio data on device");
            File fileB = ilb.b(contextC);
            yph yphVar = ivu.a;
            if (fileB == null) {
                ((ype) ((ype) ivu.a.g()).ai((char) 1434)).u("Failed to get directory");
                return;
            }
            if (!fileB.isDirectory()) {
                ((ype) ((ype) ivu.a.g()).ai((char) 1433)).y("File %s is not directory", fileB.getPath());
                return;
            }
            long jB = acng.b();
            File[] fileArrListFiles = fileB.listFiles();
            long length = 0;
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    length += file.length();
                }
            }
            yph yphVar2 = ivu.a;
            ((ype) ((ype) yphVar2.f()).ai(1435)).R("Directory %s has size (in bytes): %d, clean up limit: %d", fileB.getPath(), Long.valueOf(length), Long.valueOf(jB));
            if (length > jB) {
                ((ype) ((ype) yphVar2.f()).ai((char) 1432)).y("Remove all contents from directory: %s", fileB.getPath());
                File[] fileArrListFiles2 = fileB.listFiles();
                if (fileArrListFiles2 != null) {
                    for (File file2 : fileArrListFiles2) {
                        file2.delete();
                    }
                }
            }
        }
    }

    @Override // defpackage.jbo
    @ResultIgnorabilityUnspecified
    public final iyw a(xnz xnzVar) {
        xkp xkpVar = xnzVar.g;
        if (xkpVar == null) {
            xkpVar = xkp.a;
        }
        if ((xkpVar.b & 2) == 0) {
            return null;
        }
        xkp xkpVar2 = xnzVar.g;
        if (xkpVar2 == null) {
            xkpVar2 = xkp.a;
        }
        xhf xhfVar = xkpVar2.d;
        if (xhfVar == null) {
            xhfVar = xhf.a;
        }
        if (this.h != null) {
            ((ype) i.l().ai((char) 1515)).u("car microphone already discovered.");
        }
        String strP = roc.P(xhfVar);
        if (strP != null) {
            this.l.ax(yze.PROTOCOL_WRONG_CONFIGURATION, yzf.BAD_MIC_AUDIO_CONFIG, strP);
            return null;
        }
        CarAudioConfiguration[] carAudioConfigurationArr = new CarAudioConfiguration[1];
        int i2 = xhfVar.e;
        if (xhfVar.d != 16) {
            ((ype) ((ype) i.h()).ai(1514)).w("Audio config received has wrong number of bits %d", xhfVar.d);
        }
        carAudioConfigurationArr[0] = new CarAudioConfiguration(xhfVar.c, i2 == 2 ? 12 : 16, 2);
        this.h = new lds(carAudioConfigurationArr, (byte[]) null);
        boolean z = this.m.c.getBoolean("car_save_mic", false);
        Context context = this.n;
        yph yphVar = isf.a;
        isd isdVar = new isd();
        isdVar.c = new izj(this, null);
        isdVar.d = new fbf(this.o);
        isdVar.a = this.b;
        isdVar.b = 1000L;
        woy.aa(isdVar.c != null, "listener is required");
        woy.aa(isdVar.d != null, "diagnosticsLogger is required");
        woy.aa(isdVar.a != null, "executor is required");
        woy.aa(isdVar.b > 0, "publishingPeriodMillis is required");
        ixa ixaVar = new ixa(context, z, new isf(isdVar));
        this.c = ixaVar;
        ixaVar.c = carAudioConfigurationArr;
        return ixaVar;
    }

    @Override // defpackage.qvb
    public final int b(int i2, int i3) {
        this.d.aj();
        lds ldsVar = this.h;
        if (i2 != 0 || ldsVar == null) {
            throw new IllegalStateException("CarNotSupported");
        }
        woy.O(i3 == 0, "index out of range");
        CarAudioConfiguration carAudioConfiguration = ((CarAudioConfiguration[]) ldsVar.a)[i3];
        int i4 = carAudioConfiguration.a;
        int i5 = 2048;
        if (i4 != 44100 && i4 != 48000) {
            i5 = 1024;
        }
        int i6 = carAudioConfiguration.b;
        int i7 = i5 + i5;
        return (i6 == 12 || i6 == 12) ? i7 + i7 : i7;
    }

    @Override // defpackage.qvb
    public final int c(int i2, int i3) {
        dlz.H(this.d);
        throw new IllegalStateException("CarNotSupported");
    }

    @Override // defpackage.qvb
    public final CarAudioConfiguration d(int i2, int i3) {
        this.d.aj();
        lds ldsVar = this.h;
        if (i2 != 0 || ldsVar == null) {
            throw new IllegalStateException("CarNotSupported");
        }
        woy.O(i3 == 0, "index out of range");
        return ((CarAudioConfiguration[]) ldsVar.a)[0];
    }

    @Override // defpackage.qvb
    public final CarAudioConfiguration f(int i2, int i3) {
        dlz.H(this.d);
        throw new IllegalStateException("CarNotSupported");
    }

    @Override // defpackage.qvb
    public final void g(qvn qvnVar) {
        this.d.al();
        try {
            this.p.fn(qvnVar);
        } catch (RemoteException e) {
            throw roc.aI(e);
        }
    }

    @Override // defpackage.qvb
    public final void h(qxg qxgVar) {
        this.d.al();
        qxgVar.getClass();
        if (this.e.c(qxgVar, new iwx(qxgVar, 0))) {
            ((ype) i.l().ai((char) 1513)).y("Added listener %s", qxgVar);
        } else {
            ((ype) ((ype) i.h()).ai((char) 1512)).y("Failed to add listener %s", qxgVar);
        }
    }

    final void i() {
        this.d.aj();
    }

    final void j(iww iwwVar) {
        boolean zIsEmpty;
        iwt iwtVar = iwwVar.c;
        if (iwtVar != null) {
            List list = iwtVar.d;
            synchronized (list) {
                list.remove(iwwVar);
                zIsEmpty = list.isEmpty();
            }
            if (zIsEmpty) {
                iwtVar.f.G(iwtVar);
            }
        }
    }

    @Override // defpackage.qvb
    public final void k(qvn qvnVar) {
        this.d.al();
        try {
            this.p.b(qvnVar);
        } catch (RemoteException | IllegalStateException unused) {
        }
    }

    @Override // defpackage.qvb
    public final void l(qxg qxgVar) {
        this.d.al();
        this.e.b(qxgVar);
        ((ype) i.l().ai((char) 1516)).y("Removed listener %s", qxgVar);
    }

    @Override // defpackage.qvb
    public final boolean m(long j) {
        this.d.aj();
        return true;
    }

    @Override // defpackage.qvb
    public final boolean n(long j) {
        this.d.aj();
        return true;
    }

    @Override // defpackage.qvb
    public final int[] o() {
        this.d.aj();
        return this.h == null ? new int[0] : new int[]{0};
    }

    @Override // defpackage.qvb
    public final int[] p() {
        dlz.H(this.d);
        throw new IllegalStateException("CarNotSupported");
    }

    @Override // defpackage.qvb
    public final CarAudioConfiguration[] q(int i2) {
        this.d.aj();
        lds ldsVar = this.h;
        if (i2 != 0 || ldsVar == null) {
            throw new IllegalStateException("CarNotSupported");
        }
        return (CarAudioConfiguration[]) ldsVar.a;
    }

    @Override // defpackage.qvb
    public final CarAudioConfiguration[] r(int i2) {
        dlz.H(this.d);
        throw new IllegalStateException("CarNotSupported");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.qvb
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.qvh s(defpackage.qve r10, int r11) {
        /*
            r9 = this;
            jew r0 = r9.d
            r0.aj()
            if (r11 != 0) goto Lb7
            lds r11 = r9.h
            if (r11 == 0) goto Lb7
            java.util.List r11 = r9.a
            monitor-enter(r11)
            monitor-enter(r11)     // Catch: java.lang.Throwable -> Lb3
            java.util.Iterator r0 = r11.iterator()     // Catch: java.lang.Throwable -> Laf
        L13:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Laf
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Laf
            iwt r1 = (defpackage.iwt) r1     // Catch: java.lang.Throwable -> Laf
            qve r2 = r1.b     // Catch: java.lang.Throwable -> Laf
            android.os.IBinder r2 = r2.asBinder()     // Catch: java.lang.Throwable -> Laf
            android.os.IBinder r3 = r10.asBinder()     // Catch: java.lang.Throwable -> Laf
            if (r2 != r3) goto L13
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Laf
            goto L2f
        L2d:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Laf
            r1 = 0
        L2f:
            r0 = 0
            r2 = 1
            if (r1 == 0) goto L36
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Lb3
        L34:
            r4 = r1
            goto L59
        L36:
            iwt r1 = new iwt     // Catch: java.lang.Throwable -> Lb3
            android.content.Context r3 = r9.n     // Catch: java.lang.Throwable -> Lb3
            ajmd r4 = new ajmd     // Catch: java.lang.Throwable -> Lb3
            r4.<init>(r9)     // Catch: java.lang.Throwable -> Lb3
            int r5 = r9.j     // Catch: java.lang.Throwable -> Lb3
            r1.<init>(r3, r10, r4, r5)     // Catch: java.lang.Throwable -> Lb3
            int r10 = r9.j     // Catch: java.lang.Throwable -> Lb3
            int r10 = r10 + r2
            r9.j = r10     // Catch: java.lang.Throwable -> Lb3
            qve r10 = r1.b     // Catch: android.os.RemoteException -> La7 java.lang.Throwable -> Lb3
            android.os.IBinder r10 = r10.asBinder()     // Catch: android.os.RemoteException -> La7 java.lang.Throwable -> Lb3
            r10.linkToDeath(r1, r0)     // Catch: android.os.RemoteException -> La7 java.lang.Throwable -> Lb3
            java.util.List r10 = r9.a     // Catch: java.lang.Throwable -> Lb3
            r10.add(r1)     // Catch: java.lang.Throwable -> Lb3
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Lb3
            goto L34
        L59:
            ixa r6 = r9.c
            r6.getClass()
            java.util.List r10 = r4.d
            monitor-enter(r10)
            java.util.Locale r11 = java.util.Locale.US     // Catch: java.lang.Throwable -> La3
            java.lang.String r1 = "AudioRecord/Client#%d/Service#%d"
            int r3 = r4.c     // Catch: java.lang.Throwable -> La3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> La3
            int r5 = r4.e     // Catch: java.lang.Throwable -> La3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> La3
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> La3
            r7[r0] = r3     // Catch: java.lang.Throwable -> La3
            r7[r2] = r5     // Catch: java.lang.Throwable -> La3
            java.lang.String r8 = java.lang.String.format(r11, r1, r7)     // Catch: java.lang.Throwable -> La3
            int r11 = r4.e     // Catch: java.lang.Throwable -> La3
            int r11 = r11 + r2
            r4.e = r11     // Catch: java.lang.Throwable -> La3
            iww r3 = new iww     // Catch: java.lang.Throwable -> La3
            android.content.Context r7 = r4.a     // Catch: java.lang.Throwable -> La3
            r5 = r9
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> La3
            r10.add(r3)     // Catch: java.lang.Throwable -> La3
            monitor-exit(r10)     // Catch: java.lang.Throwable -> La3
            r5.k = r3
            boolean r9 = defpackage.acmd.G()
            if (r9 == 0) goto La0
            iww r9 = r5.k
            if (r9 == 0) goto La0
            iwv r10 = r5.g
            java.util.Set r9 = r9.e
            r9.add(r10)
        La0:
            iww r9 = r5.k
            return r9
        La3:
            r0 = move-exception
            r9 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> La3
            throw r9
        La7:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r10 = "invalid callback"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> Lb3
            throw r9     // Catch: java.lang.Throwable -> Lb3
        Laf:
            r0 = move-exception
            r9 = r0
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Laf
            throw r9     // Catch: java.lang.Throwable -> Lb3
        Lb3:
            r0 = move-exception
            r9 = r0
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Lb3
            throw r9
        Lb7:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "CarNotSupported"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iwz.s(qve, int):qvh");
    }

    @Override // defpackage.qvb
    public final qvo t() {
        dlz.H(this.d);
        throw new UnsupportedOperationException();
    }
}
