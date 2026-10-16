package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class zxg implements Runnable {
    public final /* synthetic */ zxh a;
    public final /* synthetic */ tng b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    private final /* synthetic */ int e;

    public /* synthetic */ zxg(zxh zxhVar, tng tngVar, long j, long j2, int i) {
        this.e = i;
        this.a = zxhVar;
        this.b = tngVar;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        zxh zxhVar = this.a;
        if (i != 0) {
            sij sijVarA = sij.a(ysi.F(zxhVar.d, null, zxhVar.b.getPackageName()));
            Object obj = this.b.h.a;
            ((sic) obj).a(((sie) obj).g.a(this.c), sijVarA);
            long j = this.d;
            if (adeq.c()) {
                long j2 = j - zxhVar.j;
                uxn uxnVar = zxhVar.i;
                synchronized (uxnVar) {
                    int i2 = zxhVar.o;
                    if (i2 != 1) {
                        if (!zxhVar.l) {
                            int i3 = i2 - 1;
                            if (i2 == 0) {
                                throw null;
                            }
                            if (i3 == 1) {
                                uxnVar.k(aahu.MAP_COLD_START_WITH_CACHES_TO_FULL_DISPLAY, (int) j2);
                            } else if (i3 == 2) {
                                uxnVar.k(aahu.MAP_COLD_START_WITHOUT_CACHES_TO_FULL_DISPLAY, (int) j2);
                            } else if (i3 == 3) {
                                uxnVar.k(aahu.MAP_WARM_START_TO_FULL_DISPLAY, (int) j2);
                            } else if (i3 == 4) {
                                uxnVar.k(aahu.MAP_HOT_START_TO_FULL_DISPLAY, (int) j2);
                            }
                            zxhVar.l = true;
                        }
                        zxhVar.a();
                    }
                }
                return;
            }
            return;
        }
        sij sijVarA2 = sij.a(ysi.F(zxhVar.d, null, zxhVar.b.getPackageName()));
        Object obj2 = this.b.g.a;
        ((sic) obj2).a(((sie) obj2).g.a(this.c), sijVarA2);
        long j3 = this.d;
        if (adeq.c()) {
            long j4 = j3 - zxhVar.j;
            uxn uxnVar2 = zxhVar.i;
            synchronized (uxnVar2) {
                int i4 = zxhVar.o;
                if (i4 != 1) {
                    if (!zxhVar.m) {
                        int i5 = i4 - 1;
                        if (i4 == 0) {
                            throw null;
                        }
                        if (i5 == 1) {
                            uxnVar2.k(aahu.MAP_COLD_START_WITH_CACHES_TO_MAP_LOAD, (int) j4);
                        } else if (i5 == 2) {
                            uxnVar2.k(aahu.MAP_COLD_START_WITHOUT_CACHES_TO_MAP_LOAD, (int) j4);
                        } else if (i5 == 3) {
                            uxnVar2.k(aahu.MAP_WARM_START_TO_MAP_LOAD, (int) j4);
                        } else if (i5 == 4) {
                            uxnVar2.k(aahu.MAP_HOT_START_TO_MAP_LOAD, (int) j4);
                        }
                        zxhVar.m = true;
                    }
                    zxhVar.a();
                }
            }
        }
    }
}
