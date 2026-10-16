package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class lma implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ lma(Object obj, long j, int i) {
        this.c = i;
        this.b = obj;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                ((AbstractC0001do) ((llu) this.b).b).j(this.a);
                return;
            case 1:
                ((jqj) this.b).e.b(this.a);
                return;
            case 2:
                ((AbstractC0001do) ((llu) this.b).b).e(this.a);
                return;
            case 3:
                ((ynz) ((ynz) ((ynz) pmy.a.g()).p((Throwable) this.b)).ai(6793)).y("ClientParametersBlocked on main thread for %s ms.", new vps(this.a));
                return;
            case 4:
                ((ynz) ((ynz) ((ynz) pmy.a.g()).p((Throwable) this.b)).ai(6794)).y("ClientParametersBlocked on background thread for %s ms.", new vps(this.a));
                return;
            case 5:
                Object obj = this.b;
                uxn uxnVar = ((zxh) obj).i;
                long j = this.a;
                synchronized (uxnVar) {
                    if (((zxh) obj).o == 1) {
                        ((zxh) obj).j = j;
                        ((zxh) obj).o = 5;
                    }
                }
                return;
            case 6:
                Object obj2 = this.b;
                uxn uxnVar2 = ((zxh) obj2).i;
                long j2 = this.a;
                synchronized (uxnVar2) {
                    int i = ((zxh) obj2).o;
                    if (i != 1) {
                        if (!((zxh) obj2).k) {
                            int i2 = i - 1;
                            if (i == 0) {
                                throw null;
                            }
                            if (i2 == 1) {
                                uxnVar2.k(aahu.MAP_COLD_START_WITH_CACHES_TO_INITIAL_DISPLAY, (int) j2);
                            } else if (i2 == 2) {
                                uxnVar2.k(aahu.MAP_COLD_START_WITHOUT_CACHES_TO_INITIAL_DISPLAY, (int) j2);
                            } else if (i2 == 3) {
                                uxnVar2.k(aahu.MAP_WARM_START_TO_INITIAL_DISPLAY, (int) j2);
                            } else if (i2 == 4) {
                                uxnVar2.k(aahu.MAP_HOT_START_TO_INITIAL_DISPLAY, (int) j2);
                            }
                            ((zxh) obj2).k = true;
                        }
                        ((zxh) obj2).a();
                    }
                }
                return;
            case 7:
                Object obj3 = this.b;
                uxn uxnVar3 = ((zxh) obj3).i;
                long j3 = this.a;
                synchronized (uxnVar3) {
                    if (((zxh) obj3).o == 1) {
                        ((zxh) obj3).j = j3;
                        ((zxh) obj3).o = 4;
                    }
                }
                return;
            default:
                if (addm.l()) {
                    return;
                }
                ((aaev) this.b).g(this.a);
                return;
        }
    }

    public lma(jqj jqjVar, long j, int i) {
        this.c = i;
        this.a = j;
        this.b = jqjVar;
    }
}
