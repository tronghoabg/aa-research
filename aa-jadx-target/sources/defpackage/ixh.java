package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ixh extends defpackage.qvw implements defpackage.jbv {
    private static final defpackage.yqm i = defpackage.yqm.c("CAR.AUDIO");
    public defpackage.ixi c;
    protected final defpackage.jfe d;
    volatile defpackage.ldx h;
    private int j;
    private defpackage.ixe k;
    private final defpackage.jfd l;
    private final defpackage.ilj m;
    private final android.content.Context n;
    private final defpackage.jfo o;
    private final defpackage.irt p;
    public final java.util.List a = new java.util.ArrayList();
    protected final java.util.concurrent.ScheduledExecutorService b = java.util.concurrent.Executors.newScheduledThreadPool(1);
    public final defpackage.jfu e = new defpackage.jfu("GearheadCarAudioService");
    public final java.util.Set f = new java.util.concurrent.CopyOnWriteArraySet();
    public final defpackage.ixd g = new defpackage.ixg(this, 0);

    public ixh(defpackage.jfd jfdVar, defpackage.ilj iljVar, defpackage.jfe jfeVar, defpackage.jfo jfoVar, android.content.Context context, defpackage.irt irtVar) {
        this.l = jfdVar;
        this.m = iljVar;
        this.d = jfeVar;
        this.o = jfoVar;
        this.p = irtVar;
        android.content.Context contextC = defpackage.jfr.c(context);
        this.n = contextC;
        if (iljVar.l()) {
            ((defpackage.yqj) ((defpackage.yqj) i.f()).ai((char) 1511)).u("Clean up existing raw audio data on device");
            java.io.File fileB = defpackage.ill.b(contextC);
            defpackage.yqm yqmVar = iwc.a;
            if (fileB == null) {
                ((defpackage.yqj) ((defpackage.yqj) iwc.a.g()).ai((char) 1434)).u("Failed to get directory");
                return;
            }
            if (!fileB.isDirectory()) {
                ((defpackage.yqj) ((defpackage.yqj) iwc.a.g()).ai((char) 1433)).y("File %s is not directory", fileB.getPath());
                return;
            }
            long jB = acoi.b();
            java.io.File[] fileArrListFiles = fileB.listFiles();
            long length = 0;
            if (fileArrListFiles != null) {
                for (java.io.File file : fileArrListFiles) {
                    length += file.length();
                }
            }
            defpackage.yqm yqmVar2 = iwc.a;
            ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai(1435)).R("Directory %s has size (in bytes): %d, clean up limit: %d", fileB.getPath(), java.lang.Long.valueOf(length), java.lang.Long.valueOf(jB));
            if (length > jB) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai((char) 1432)).y("Remove all contents from directory: %s", fileB.getPath());
                java.io.File[] fileArrListFiles2 = fileB.listFiles();
                if (fileArrListFiles2 != null) {
                    for (java.io.File file2 : fileArrListFiles2) {
                        file2.delete();
                    }
                }
            }
        }
    }

    @Override // defpackage.jbv
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.izd a(defpackage.xpa xpaVar) {
        defpackage.xlq xlqVar = xpaVar.g;
        if (xlqVar == null) {
            xlqVar = defpackage.xlq.a;
        }
        byte[] bArr = null;
        if ((xlqVar.b & 2) == 0) {
            return null;
        }
        defpackage.xlq xlqVar2 = xpaVar.g;
        if (xlqVar2 == null) {
            xlqVar2 = defpackage.xlq.a;
        }
        defpackage.xig xigVar = xlqVar2.d;
        if (xigVar == null) {
            xigVar = defpackage.xig.a;
        }
        if (this.h != null) {
            ((defpackage.yqj) i.l().ai((char) 1515)).u("car microphone already discovered.");
        }
        java.lang.String strZ = defpackage.tna.Z(xigVar);
        if (strZ != null) {
            this.l.ax(defpackage.zaj.PROTOCOL_WRONG_CONFIGURATION, defpackage.zak.BAD_MIC_AUDIO_CONFIG, strZ);
            return null;
        }
        com.google.android.gms.car.CarAudioConfiguration[] carAudioConfigurationArr = new com.google.android.gms.car.CarAudioConfiguration[1];
        int i2 = xigVar.e;
        if (xigVar.d != 16) {
            ((defpackage.yqj) ((defpackage.yqj) i.h()).ai(1514)).w("Audio config received has wrong number of bits %d", xigVar.d);
        }
        carAudioConfigurationArr[0] = new com.google.android.gms.car.CarAudioConfiguration(xigVar.c, i2 == 2 ? 12 : 16, 2);
        this.h = new defpackage.ldx(carAudioConfigurationArr);
        boolean z = this.m.c.getBoolean("car_save_mic", false);
        android.content.Context context = this.n;
        defpackage.yqm yqmVar = defpackage.isn.a;
        defpackage.isl islVar = new defpackage.isl();
        islVar.c = new defpackage.izq(this, bArr);
        islVar.d = new defpackage.fbl(this.o);
        islVar.a = this.b;
        islVar.b = 1000L;
        defpackage.ysr.bk(islVar.c != null, "listener is required");
        defpackage.ysr.bk(islVar.d != null, "diagnosticsLogger is required");
        defpackage.ysr.bk(islVar.a != null, "executor is required");
        defpackage.ysr.bk(islVar.b > 0, "publishingPeriodMillis is required");
        defpackage.ixi ixiVar = new defpackage.ixi(context, z, new defpackage.isn(islVar));
        this.c = ixiVar;
        ixiVar.c = carAudioConfigurationArr;
        return ixiVar;
    }

    @Override // defpackage.qvx
    public final int b(int i2, int i3) {
        this.d.aj();
        defpackage.ldx ldxVar = this.h;
        if (i2 != 0 || ldxVar == null) {
            throw new java.lang.IllegalStateException("CarNotSupported");
        }
        defpackage.ysr.aY(i3 == 0, "index out of range");
        com.google.android.gms.car.CarAudioConfiguration carAudioConfiguration = ((com.google.android.gms.car.CarAudioConfiguration[]) ldxVar.a)[i3];
        int i4 = carAudioConfiguration.a;
        int i5 = 2048;
        if (i4 != 44100 && i4 != 48000) {
            i5 = 1024;
        }
        int i6 = carAudioConfiguration.b;
        int i7 = i5 + i5;
        return (i6 == 12 || i6 == 12) ? i7 + i7 : i7;
    }

    @Override // defpackage.qvx
    public final int c(int i2, int i3) {
        defpackage.gjz.g(this.d);
        throw new java.lang.IllegalStateException("CarNotSupported");
    }

    @Override // defpackage.qvx
    public final com.google.android.gms.car.CarAudioConfiguration d(int i2, int i3) {
        this.d.aj();
        defpackage.ldx ldxVar = this.h;
        if (i2 != 0 || ldxVar == null) {
            throw new java.lang.IllegalStateException("CarNotSupported");
        }
        defpackage.ysr.aY(i3 == 0, "index out of range");
        return ((com.google.android.gms.car.CarAudioConfiguration[]) ldxVar.a)[0];
    }

    @Override // defpackage.qvx
    public final com.google.android.gms.car.CarAudioConfiguration f(int i2, int i3) {
        defpackage.gjz.g(this.d);
        throw new java.lang.IllegalStateException("CarNotSupported");
    }

    @Override // defpackage.qvx
    public final void g(qwj qwjVar) {
        this.d.al();
        try {
            this.p.ev(qwjVar);
        } catch (android.os.RemoteException e) {
            throw defpackage.tna.aS(e);
        }
    }

    @Override // defpackage.qvx
    public final void h(qyc qycVar) {
        this.d.al();
        qycVar.getClass();
        if (this.e.c(qycVar, new ixf(qycVar, 0))) {
            ((defpackage.yqj) i.l().ai((char) 1513)).y("Added listener %s", qycVar);
        } else {
            ((defpackage.yqj) ((defpackage.yqj) i.h()).ai((char) 1512)).y("Failed to add listener %s", qycVar);
        }
    }

    final void i() {
        this.d.aj();
    }

    final void j(defpackage.ixe ixeVar) {
        boolean zIsEmpty;
        defpackage.ixb ixbVar = ixeVar.c;
        if (ixbVar != null) {
            java.util.List list = ixbVar.d;
            synchronized (list) {
                list.remove(ixeVar);
                zIsEmpty = list.isEmpty();
            }
            if (zIsEmpty) {
                ixbVar.f.I(ixbVar);
            }
        }
    }

    @Override // defpackage.qvx
    public final void k(qwj qwjVar) {
        this.d.al();
        try {
            this.p.b(qwjVar);
        } catch (android.os.RemoteException | java.lang.IllegalStateException unused) {
        }
    }

    @Override // defpackage.qvx
    public final void l(qyc qycVar) {
        this.d.al();
        this.e.b(qycVar);
        ((defpackage.yqj) i.l().ai((char) 1516)).y("Removed listener %s", qycVar);
    }

    @Override // defpackage.qvx
    public final boolean m(long j) {
        this.d.aj();
        return true;
    }

    @Override // defpackage.qvx
    public final boolean n(long j) {
        this.d.aj();
        return true;
    }

    @Override // defpackage.qvx
    public final int[] o() {
        this.d.aj();
        return this.h == null ? new int[0] : new int[]{0};
    }

    @Override // defpackage.qvx
    public final int[] p() {
        defpackage.gjz.g(this.d);
        throw new java.lang.IllegalStateException("CarNotSupported");
    }

    @Override // defpackage.qvx
    public final com.google.android.gms.car.CarAudioConfiguration[] q(int i2) {
        this.d.aj();
        defpackage.ldx ldxVar = this.h;
        if (i2 != 0 || ldxVar == null) {
            throw new java.lang.IllegalStateException("CarNotSupported");
        }
        return (com.google.android.gms.car.CarAudioConfiguration[]) ldxVar.a;
    }

    @Override // defpackage.qvx
    public final com.google.android.gms.car.CarAudioConfiguration[] r(int i2) {
        defpackage.gjz.g(this.d);
        throw new java.lang.IllegalStateException("CarNotSupported");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.qvx
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final qwd s(qwa qwaVar, int i2) {
        defpackage.ixb ixbVar;
        defpackage.ixb ixbVar2;
        defpackage.ixi ixiVar;
        java.util.List list;
        defpackage.ixe ixeVar;
        this.d.aj();
        if (i2 != 0 || this.h == null) {
            throw new java.lang.IllegalStateException("CarNotSupported");
        }
        java.util.List list2 = this.a;
        synchronized (list2) {
            synchronized (list2) {
                java.util.Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        ixbVar = null;
                        break;
                    }
                    ixbVar = (defpackage.ixb) it.next();
                    if (ixbVar.b.asBinder() == qwaVar.asBinder()) {
                        break;
                    }
                }
            }
            ixbVar2 = ixbVar;
            ixiVar = this.c;
            ixiVar.getClass();
            list = ixbVar2.d;
            synchronized (list) {
                java.lang.String str = java.lang.String.format(java.util.Locale.US, "AudioRecord/Client#%d/Service#%d", java.lang.Integer.valueOf(ixbVar2.c), java.lang.Integer.valueOf(ixbVar2.e));
                ixbVar2.e++;
                defpackage.ixe ixeVar2 = new defpackage.ixe(ixbVar2, this, ixiVar, ixbVar2.a, str);
                list.add(ixeVar2);
            }
            this.k = ixeVar2;
            if (defpackage.acnf.H() && (ixeVar = this.k) != null) {
                ixeVar.e.add(this.g);
            }
            return this.k;
        }
        if (ixbVar == null) {
            ixbVar = new defpackage.ixb(this.n, qwaVar, new ajnd(this), this.j);
            this.j++;
            try {
                ixbVar.b.asBinder().linkToDeath(ixbVar, 0);
                this.a.add(ixbVar);
            } catch (android.os.RemoteException unused) {
                throw new java.lang.IllegalArgumentException("invalid callback");
            }
        }
        ixbVar2 = ixbVar;
        ixiVar = this.c;
        ixiVar.getClass();
        list = ixbVar2.d;
        synchronized (list) {
            java.lang.String str2 = java.lang.String.format(java.util.Locale.US, "AudioRecord/Client#%d/Service#%d", java.lang.Integer.valueOf(ixbVar2.c), java.lang.Integer.valueOf(ixbVar2.e));
            ixbVar2.e++;
            defpackage.ixe ixeVar3 = new defpackage.ixe(ixbVar2, this, ixiVar, ixbVar2.a, str2);
            list.add(ixeVar3);
            this.k = ixeVar3;
            if (defpackage.acnf.H()) {
                ixeVar.e.add(this.g);
            }
            return this.k;
        }
    }

    @Override // defpackage.qvx
    public final qwk t() {
        defpackage.gjz.g(this.d);
        throw new java.lang.UnsupportedOperationException();
    }
}
