package M8;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f7550b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f7551c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xa.d f7552d;

    public /* synthetic */ e(f fVar, Runnable runnable, xa.d dVar, int i5) {
        this.f7549a = i5;
        this.f7550b = fVar;
        this.f7551c = runnable;
        this.f7552d = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7549a) {
            case 0:
                f fVar = this.f7550b;
                final xa.d dVar = this.f7552d;
                final Runnable runnable = this.f7551c;
                final int i5 = 0;
                fVar.f7553a.execute(new Runnable() { // from class: M8.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i5) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) dVar.f47873b).j(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) dVar.f47873b).j(e10);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) dVar.f47873b;
                                try {
                                    runnable2.run();
                                    hVar.i(null);
                                    return;
                                } catch (Exception e11) {
                                    hVar.j(e11);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                f fVar2 = this.f7550b;
                final xa.d dVar2 = this.f7552d;
                final Runnable runnable2 = this.f7551c;
                final int i10 = 2;
                fVar2.f7553a.execute(new Runnable() { // from class: M8.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) dVar2.f47873b).j(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) dVar2.f47873b).j(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) dVar2.f47873b;
                                try {
                                    runnable22.run();
                                    hVar.i(null);
                                    return;
                                } catch (Exception e11) {
                                    hVar.j(e11);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                f fVar3 = this.f7550b;
                final xa.d dVar3 = this.f7552d;
                final Runnable runnable3 = this.f7551c;
                final int i11 = 1;
                fVar3.f7553a.execute(new Runnable() { // from class: M8.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) dVar3.f47873b).j(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) dVar3.f47873b).j(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) dVar3.f47873b;
                                try {
                                    runnable22.run();
                                    hVar.i(null);
                                    return;
                                } catch (Exception e11) {
                                    hVar.j(e11);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
