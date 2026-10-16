package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class aiux extends aius implements aiuf {
    private final aisu a;
    public final aisx c;
    public final aisx d;

    public aiux() {
        aisy aisyVar = aisy.a;
        this.c = new aisx(null, aisyVar);
        this.d = new aisx(null, aisyVar);
        this.a = new aisu(false, aisyVar);
    }

    private final void x() {
        ajdf ajdfVarD;
        aiuw aiuwVar = (aiuw) this.d.a;
        if (aiuwVar == null || aiuwVar.g()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (aiuwVar) {
                ajdf ajdfVarB = aiuwVar.b();
                ajdfVarD = null;
                if (ajdfVarB != null) {
                    aiuv aiuvVar = (aiuv) ajdfVarB;
                    if (jNanoTime - aiuvVar.b >= 0 && y(aiuvVar)) {
                        ajdfVarD = aiuwVar.d(0);
                    }
                }
            }
        } while (((aiuv) ajdfVarD) != null);
    }

    private final boolean y(Runnable runnable) {
        while (true) {
            aisx aisxVar = this.c;
            Object obj = aisxVar.a;
            if (v()) {
                return false;
            }
            if (obj == null) {
                if (aisxVar.d(null, runnable)) {
                    return true;
                }
            } else if (obj instanceof ajcs) {
                ajcs ajcsVar = (ajcs) obj;
                int iA = ajcsVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA != 1) {
                    return false;
                }
                aisxVar.d(obj, ajcsVar.c());
            } else {
                if (obj == aiuy.b) {
                    return false;
                }
                ajcs ajcsVar2 = new ajcs(8, true);
                ajcsVar2.a((Runnable) obj);
                ajcsVar2.a(runnable);
                if (aisxVar.d(obj, ajcsVar2)) {
                    return true;
                }
            }
        }
    }

    @Override // defpackage.aitu
    public final void a(afco afcoVar, Runnable runnable) {
        i(runnable);
    }

    @Override // defpackage.aiuf
    public final void c(long j, aitf aitfVar) {
        long jA = aiuy.a(j);
        if (jA < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            aiut aiutVar = new aiut(this, jA + jNanoTime, aitfVar);
            u(jNanoTime, aiutVar);
            ((aitg) aitfVar).A(new aiup(aiutVar, 0));
        }
    }

    public /* bridge */ aiuo h(long j, Runnable runnable, afco afcoVar) {
        return aiuc.a.h(j, runnable, afcoVar);
    }

    public void i(Runnable runnable) {
        x();
        if (y(runnable)) {
            s();
        } else {
            aiub.a.i(runnable);
        }
    }

    @Override // defpackage.aius
    public void k() {
        ajdf ajdfVarD;
        ThreadLocal threadLocal = aiwj.a;
        aiwj.a.set(null);
        this.a.c();
        boolean z = aitz.a;
        while (true) {
            aisx aisxVar = this.c;
            Object obj = aisxVar.a;
            if (obj == null) {
                if (aisxVar.d(null, aiuy.b)) {
                    break;
                }
            } else if (obj instanceof ajcs) {
                ((ajcs) obj).d();
                break;
            } else {
                if (obj == aiuy.b) {
                    break;
                }
                ajcs ajcsVar = new ajcs(8, true);
                ajcsVar.a((Runnable) obj);
                if (aisxVar.d(obj, ajcsVar)) {
                    break;
                }
            }
        }
        while (l() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            aiuw aiuwVar = (aiuw) this.d.a;
            if (aiuwVar == null) {
                return;
            }
            synchronized (aiuwVar) {
                ajdfVarD = aiuwVar.a() > 0 ? aiuwVar.d(0) : null;
            }
            aiuv aiuvVar = (aiuv) ajdfVarD;
            if (aiuvVar == null) {
                return;
            } else {
                j(jNanoTime, aiuvVar);
            }
        }
    }

    @Override // defpackage.aius
    public final long l() {
        Runnable runnable;
        aiuv aiuvVar;
        if (r()) {
            return 0L;
        }
        x();
        aisx aisxVar = this.c;
        while (true) {
            Object obj = aisxVar.a;
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof ajcs)) {
                if (obj == aiuy.b) {
                    break;
                }
                if (aisxVar.d(obj, null)) {
                    runnable = (Runnable) obj;
                    break;
                }
            } else {
                ajcs ajcsVar = (ajcs) obj;
                Object objB = ajcsVar.b();
                if (objB != ajcs.a) {
                    runnable = (Runnable) objB;
                    break;
                }
                aisxVar.d(obj, ajcsVar.c());
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        afaz afazVar = this.b;
        if (((afazVar == null || afazVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = aisxVar.a;
        if (obj2 != null) {
            if (!(obj2 instanceof ajcs)) {
                return obj2 == aiuy.b ? Long.MAX_VALUE : 0L;
            }
            if (!((ajcs) obj2).e()) {
                return 0L;
            }
        }
        aiuw aiuwVar = (aiuw) this.d.a;
        if (aiuwVar == null || (aiuvVar = (aiuv) aiuwVar.c()) == null) {
            return Long.MAX_VALUE;
        }
        long jNanoTime = aiuvVar.b - System.nanoTime();
        if (jNanoTime < 0) {
            return 0L;
        }
        return jNanoTime;
    }

    protected final aiuo t(long j, Runnable runnable) {
        long jA = aiuy.a(j);
        if (jA >= 4611686018427387903L) {
            return aivu.a;
        }
        long jNanoTime = System.nanoTime();
        aiuu aiuuVar = new aiuu(jA + jNanoTime, runnable);
        u(jNanoTime, aiuuVar);
        return aiuuVar;
    }

    public final void u(long j, aiuv aiuvVar) {
        if (!v()) {
            aisx aisxVar = this.d;
            aiuw aiuwVar = (aiuw) aisxVar.a;
            if (aiuwVar == null) {
                aisxVar.d(null, new aiuw(j));
                Object obj = aisxVar.a;
                obj.getClass();
                aiuwVar = (aiuw) obj;
            }
            synchronized (aiuvVar) {
                if (aiuvVar._heap == aiuy.a) {
                    return;
                }
                synchronized (aiuwVar) {
                    aiuv aiuvVar2 = (aiuv) aiuwVar.b();
                    if (!v()) {
                        if (aiuvVar2 == null) {
                            aiuwVar.a = j;
                        } else {
                            long j2 = aiuvVar2.b;
                            if (j2 - j < 0) {
                                j = j2;
                            }
                            long j3 = aiuwVar.a;
                            if (j - j3 > 0) {
                                aiuwVar.a = j;
                            } else {
                                j = j3;
                            }
                        }
                        if (aiuvVar.b - j < 0) {
                            aiuvVar.b = j;
                        }
                        boolean z = aitz.a;
                        aiuvVar.d(aiuwVar);
                        ajdf[] ajdfVarArr = aiuwVar.b;
                        if (ajdfVarArr == null) {
                            ajdfVarArr = new ajdf[4];
                            aiuwVar.b = ajdfVarArr;
                        } else if (aiuwVar.a() >= ajdfVarArr.length) {
                            int iA = aiuwVar.a();
                            Object[] objArrCopyOf = Arrays.copyOf(ajdfVarArr, iA + iA);
                            objArrCopyOf.getClass();
                            ajdfVarArr = (ajdf[]) objArrCopyOf;
                            aiuwVar.b = ajdfVarArr;
                        }
                        int iA2 = aiuwVar.a();
                        aiuwVar.e(iA2 + 1);
                        ajdfVarArr[iA2] = aiuvVar;
                        aiuvVar.e(iA2);
                        aiuwVar.f(iA2);
                        aiuw aiuwVar2 = (aiuw) aisxVar.a;
                        if ((aiuwVar2 != null ? (aiuv) aiuwVar2.c() : null) == aiuvVar) {
                            s();
                            return;
                        }
                        return;
                    }
                }
            }
        }
        j(j, aiuvVar);
    }

    public final boolean v() {
        return this.a.a();
    }

    protected final boolean w() {
        if (!q()) {
            return false;
        }
        aiuw aiuwVar = (aiuw) this.d.a;
        if (aiuwVar != null && !aiuwVar.g()) {
            return false;
        }
        Object obj = this.c.a;
        if (obj == null) {
            return true;
        }
        return obj instanceof ajcs ? ((ajcs) obj).e() : obj == aiuy.b;
    }
}
