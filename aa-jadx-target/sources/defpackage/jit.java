package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jit implements defpackage.jip {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.WM.ANIM");
    private static volatile float j = 1.0f;
    private static final defpackage.jie k = new defpackage.jie(j);
    private int A;
    private final defpackage.izq B;
    private final defpackage.izq C;
    defpackage.jir f;
    defpackage.jis g;
    int h;
    defpackage.jik i;
    private final android.database.ContentObserver l;
    private final defpackage.jkr m;
    private long v;
    private android.os.HandlerThread w;
    private defpackage.jhi x;
    private defpackage.jik y;
    private int z;
    private final defpackage.aba n = new defpackage.aba(0);
    private final defpackage.aba o = new defpackage.aba(0);
    private final defpackage.aba p = new defpackage.aba(0);
    public final java.util.List b = new java.util.ArrayList();
    public final java.util.List c = new java.util.ArrayList();
    public final defpackage.ynk d = new defpackage.ygf(null);
    public final defpackage.ynk e = new defpackage.ygf(null);
    private final java.util.Map q = new android.util.ArrayMap();
    private final java.util.Map r = new android.util.ArrayMap();
    private final java.util.Map s = new android.util.ArrayMap();
    private final java.util.Map t = new android.util.ArrayMap();
    private final java.util.Set u = new android.util.ArraySet();

    public jit(defpackage.jkr jkrVar, defpackage.izq izqVar, defpackage.izq izqVar2) {
        this.C = izqVar;
        this.B = izqVar2;
        defpackage.inh inhVar = (defpackage.inh) jkrVar;
        D(inhVar.l);
        defpackage.jiq jiqVar = new defpackage.jiq(new defpackage.stq(android.os.Looper.getMainLooper(), (byte[]) null), jkrVar);
        this.l = jiqVar;
        inhVar.l.getContentResolver().registerContentObserver(android.provider.Settings.Global.getUriFor("transition_animation_scale"), false, jiqVar);
        this.m = jkrVar;
        this.h = 2130772197;
        android.view.animation.Animation animationLoadAnimation = android.view.animation.AnimationUtils.loadAnimation(inhVar.l, 2130772196);
        android.view.animation.Animation animationLoadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(inhVar.l, this.h);
        animationLoadAnimation.getClass();
        animationLoadAnimation2.getClass();
        this.y = new defpackage.jik(O(animationLoadAnimation, jkrVar), null, 0);
        this.i = new defpackage.jik(O(animationLoadAnimation2, jkrVar), null, 0);
    }

    public static void D(android.content.Context context) {
        try {
            j = android.provider.Settings.Global.getFloat(context.getContentResolver(), "transition_animation_scale");
        } catch (android.provider.Settings.SettingNotFoundException unused) {
            j = 1.0f;
        }
    }

    private static android.view.animation.Animation O(android.view.animation.Animation animation, defpackage.jkr jkrVar) {
        if (animation instanceof android.view.animation.TranslateAnimation) {
            defpackage.jif jifVar = new defpackage.jif((android.view.animation.TranslateAnimation) animation);
            jifVar.setStartOffset(animation.getStartOffset());
            jifVar.setZAdjustment(animation.getZAdjustment());
            return jifVar;
        }
        if (!(animation instanceof android.view.animation.AnimationSet)) {
            return animation;
        }
        android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(false);
        animationSet.setStartOffset(animation.getStartOffset());
        animationSet.setZAdjustment(animation.getZAdjustment());
        animationSet.setDuration(animation.getDuration());
        java.util.Iterator<android.view.animation.Animation> it = ((android.view.animation.AnimationSet) animation).getAnimations().iterator();
        while (it.hasNext()) {
            animationSet.addAnimation(O(it.next(), jkrVar));
        }
        return animationSet;
    }

    private final com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography P(defpackage.jhl jhlVar, int i) {
        com.google.android.gms.car.display.CarRegionId carRegionIdD = jhlVar.D();
        if (carRegionIdD == null) {
            return null;
        }
        return i == 0 ? (com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography) this.q.get(carRegionIdD) : (com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography) this.r.get(carRegionIdD);
    }

    private final com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography Q(defpackage.jhl jhlVar, int i) {
        com.google.android.gms.car.display.CarRegionId carRegionIdD = jhlVar.D();
        if (carRegionIdD == null) {
            return null;
        }
        return i == 0 ? (com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography) this.s.get(carRegionIdD) : (com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography) this.t.get(carRegionIdD);
    }

    private final synchronized void R() {
        while (true) {
            defpackage.aba abaVar = this.n;
            if (abaVar.isEmpty()) {
                break;
            } else {
                S((defpackage.jhl) abaVar.d(0), true, false, false);
            }
        }
        while (true) {
            defpackage.aba abaVar2 = this.o;
            if (abaVar2.isEmpty()) {
                break;
            } else {
                S((defpackage.jhl) abaVar2.d(0), false, true, false);
            }
        }
        while (true) {
            defpackage.aba abaVar3 = this.p;
            if (!abaVar3.isEmpty()) {
                S((defpackage.jhl) abaVar3.d(0), false, false, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    private final synchronized void S(defpackage.jhl jhlVar, boolean z, boolean z2, boolean z3) {
        boolean zIsEmpty;
        if (this.w != null) {
            boolean zIsEmpty2 = false;
            if (z) {
                this.b.remove(jhlVar);
                defpackage.aba abaVar = this.n;
                if (((defpackage.jhz) abaVar.remove(jhlVar)) != null) {
                    jhlVar.aP();
                    ((defpackage.yqj) a.l().ai((char) 2175)).y("startup animation cancelled for %s", jhlVar);
                    zIsEmpty = abaVar.isEmpty();
                } else {
                    zIsEmpty = false;
                }
            } else {
                zIsEmpty = false;
            }
            if (z2) {
                this.c.remove(jhlVar);
                defpackage.aba abaVar2 = this.o;
                android.util.Pair pair = (android.util.Pair) abaVar2.remove(jhlVar);
                if (pair != null) {
                    jhlVar.aP();
                    ((defpackage.yqj) a.l().ai((char) 2174)).y("removal animation cancelled for %s", jhlVar);
                    if (((android.util.MutableBoolean) pair.second).value) {
                        ((defpackage.inh) this.m).u(jhlVar);
                    }
                    zIsEmpty2 = abaVar2.isEmpty();
                }
            }
            if (z3) {
                defpackage.aba abaVar3 = this.p;
                if (((defpackage.jhz) abaVar3.remove(jhlVar)) != null) {
                    jhlVar.aP();
                    ((defpackage.yqj) a.l().ai((char) 2173)).y("custom animation canceled for %s", jhlVar);
                    zIsEmpty2 &= abaVar3.isEmpty();
                }
            }
            defpackage.jir jirVar = this.f;
            jirVar.getClass();
            if (zIsEmpty) {
                jirVar.removeMessages(2);
                if (zIsEmpty2) {
                    jirVar.removeMessages(1);
                }
            }
        }
    }

    private final synchronized void T(defpackage.jhl jhlVar, defpackage.jhz jhzVar) {
        this.p.put(jhlVar, jhzVar);
        jhlVar.aO();
        jhzVar.g();
        jhlVar.aQ(jhzVar, false);
    }

    private final void U() {
        defpackage.jir jirVar = this.f;
        jirVar.getClass();
        jirVar.a(0L);
    }

    private final synchronized boolean V(defpackage.jhl jhlVar) {
        android.util.Pair pair = (android.util.Pair) this.o.get(jhlVar);
        if (pair == null) {
            jhlVar.aO();
            return false;
        }
        jhlVar.aO();
        defpackage.jhz jhzVar = (defpackage.jhz) pair.first;
        jhzVar.g();
        jhlVar.aQ(jhzVar, true);
        return true;
    }

    private final synchronized boolean W(defpackage.jhl jhlVar) {
        defpackage.jhz jhzVar = (defpackage.jhz) this.n.get(jhlVar);
        if (jhzVar == null) {
            return false;
        }
        jhlVar.aO();
        jhzVar.g();
        jhlVar.aQ(jhzVar, false);
        return true;
    }

    private final boolean X(defpackage.jhl jhlVar, defpackage.jhz jhzVar, boolean z) {
        com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography projectionWindowAnimationChoreographyQ;
        com.google.android.gms.car.display.CarRegionId carRegionIdD = jhlVar.D();
        if (carRegionIdD == null || this.g == null || (projectionWindowAnimationChoreographyQ = Q(jhlVar, 1)) == null) {
            return false;
        }
        this.r.put(carRegionIdD, projectionWindowAnimationChoreographyQ);
        this.t.remove(carRegionIdD);
        ((defpackage.yqj) a.l().ai((char) 2188)).M("%s is in choreography %s, using that to remove", jhlVar.F(), projectionWindowAnimationChoreographyQ);
        this.d.t(carRegionIdD, jhlVar);
        if (!projectionWindowAnimationChoreographyQ.e) {
            this.u.add(carRegionIdD);
        }
        defpackage.jis jisVar = this.g;
        jisVar.getClass();
        jisVar.a(projectionWindowAnimationChoreographyQ);
        com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams = (com.google.android.gms.car.animation.ProjectionWindowAnimationParams) projectionWindowAnimationChoreographyQ.b().get(carRegionIdD);
        if (projectionWindowAnimationParams != null) {
            defpackage.jhz jhzVar2 = (defpackage.jhz) this.p.get(jhlVar);
            defpackage.jhz jhzVarZ = z(jhlVar.g(), jhlVar.y(), b(((defpackage.inh) this.m).l, projectionWindowAnimationParams, jhlVar.k(), jhlVar.d()));
            defpackage.ysr.bq(jhzVar2 == null || jhzVar2 == jhzVarZ, "%s already received a custom animation %s, can't handle choreography %s", jhlVar, jhzVar2, projectionWindowAnimationChoreographyQ);
            jhzVar = jhzVarZ;
        }
        this.o.put(jhlVar, new android.util.Pair(jhzVar, new android.util.MutableBoolean(z)));
        return true;
    }

    private final boolean Y(defpackage.jhl jhlVar, defpackage.jhz jhzVar) {
        com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography projectionWindowAnimationChoreographyQ;
        com.google.android.gms.car.display.CarRegionId carRegionIdD = jhlVar.D();
        if (carRegionIdD == null || this.g == null || (projectionWindowAnimationChoreographyQ = Q(jhlVar, 0)) == null) {
            return false;
        }
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(2189)).M("interceptStartupAnimationForChoreography moving %s to pending for %s", carRegionIdD, projectionWindowAnimationChoreographyQ);
        this.q.put(carRegionIdD, projectionWindowAnimationChoreographyQ);
        this.s.remove(carRegionIdD);
        ((defpackage.yqj) yqmVar.l().ai(2190)).M("%s is in choreography %s, using that to start", jhlVar.F(), projectionWindowAnimationChoreographyQ);
        this.e.t(carRegionIdD, jhlVar);
        if (!projectionWindowAnimationChoreographyQ.e) {
            this.u.add(carRegionIdD);
        }
        defpackage.jis jisVar = this.g;
        jisVar.getClass();
        jisVar.a(projectionWindowAnimationChoreographyQ);
        com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams = (com.google.android.gms.car.animation.ProjectionWindowAnimationParams) projectionWindowAnimationChoreographyQ.b().get(carRegionIdD);
        if (projectionWindowAnimationParams != null) {
            defpackage.jhz jhzVar2 = (defpackage.jhz) this.p.get(jhlVar);
            defpackage.jhz jhzVarA = A(jhlVar.g(), jhlVar.y(), b(((defpackage.inh) this.m).l, projectionWindowAnimationParams, jhlVar.k(), jhlVar.d()));
            defpackage.ysr.bq(jhzVar2 == null || jhzVar2 == jhzVarA, "%s already received a custom animation %s, can't handle choreography %s", jhlVar, jhzVar2, projectionWindowAnimationChoreographyQ);
            jhzVar = jhzVarA;
        }
        this.n.put(jhlVar, jhzVar);
        return true;
    }

    private static boolean Z(com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography) {
        if (projectionWindowAnimationChoreography != null) {
            return projectionWindowAnimationChoreography.e && !projectionWindowAnimationChoreography.f;
        }
        return true;
    }

    final defpackage.jhz A(int i, defpackage.jhx jhxVar, defpackage.jik jikVar) {
        if (jikVar != null) {
            return new defpackage.jhy(jikVar, j);
        }
        defpackage.jik jikVar2 = jhxVar.i;
        if (jikVar2 != null) {
            ((defpackage.yqj) a.l().ai((char) 2181)).y("createStartupAnimation from layout params: %s", jikVar2);
            return new defpackage.jhy(jikVar2, j);
        }
        ((defpackage.yqj) a.l().ai((char) 2180)).w("createStartupAnimation for layer: %d", i);
        if (i == 1) {
            return new defpackage.jhy(this.y, j);
        }
        if (i == 2) {
            this.x.getClass();
            return new jio(defpackage.jhz.c, 0L, 250L, -this.x.h, j);
        }
        if (i == 3) {
            this.x.getClass();
            int i2 = this.x.a.i;
            return new jio(jio.f, 0L, 400L, -defpackage.jia.i(i2, 400), j);
        }
        if (i != 5) {
            if (i != 6) {
                return k;
            }
            return new jio(jio.c, 50L, 250L, jhxVar.d, j);
        }
        this.x.getClass();
        int i3 = this.x.a.i;
        return new jio(jio.f, 75L, 325L, -defpackage.jia.i(i3, 240), j);
    }

    public final synchronized void B() {
        try {
            defpackage.aba abaVar = this.n;
            if (!abaVar.isEmpty() || !this.o.isEmpty() || !this.p.isEmpty()) {
                defpackage.jkr jkrVar = this.m;
                jkrVar.T();
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                boolean z = false;
                boolean z2 = false;
                for (int i = abaVar.d - 1; i >= 0; i--) {
                    defpackage.jhl jhlVar = (defpackage.jhl) abaVar.d(i);
                    defpackage.jhz jhzVar = (defpackage.jhz) abaVar.g(i);
                    if (jhzVar.h(jElapsedRealtime) && jhlVar.aZ()) {
                        jhlVar.aq();
                        jhlVar.aP();
                        this.b.remove(jhlVar);
                        com.google.android.gms.car.display.CarRegionId carRegionIdD = jhlVar.D();
                        this.e.C(carRegionIdD, jhlVar);
                        abaVar.e(i);
                        if (carRegionIdD != null && this.u.remove(carRegionIdD)) {
                            java.lang.Object obj = this.B.a;
                            synchronized (((defpackage.inh) obj).V) {
                                ((defpackage.inh) obj).ah(jhlVar, true);
                                ((defpackage.inh) obj).N(jhlVar);
                            }
                        }
                        z2 = true;
                    } else {
                        if (!jhzVar.h(jElapsedRealtime) && jhlVar.aZ() && !jhlVar.aE()) {
                            jhlVar.aq();
                        }
                        z = true;
                    }
                }
                defpackage.aba abaVar2 = this.p;
                int i2 = abaVar2.d;
                while (true) {
                    i2--;
                    if (i2 < 0) {
                        break;
                    }
                    defpackage.jhl jhlVar2 = (defpackage.jhl) abaVar2.d(i2);
                    if (((defpackage.jhz) abaVar2.g(i2)).h(jElapsedRealtime) && jhlVar2.aZ()) {
                        jhlVar2.aP();
                        abaVar2.e(i2);
                        z2 = true;
                    } else {
                        z = true;
                    }
                }
                defpackage.aba abaVar3 = this.o;
                int i3 = abaVar3.d;
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        break;
                    }
                    defpackage.jhl jhlVar3 = (defpackage.jhl) abaVar3.d(i3);
                    android.util.Pair pair = (android.util.Pair) abaVar3.g(i3);
                    if (((defpackage.jhz) pair.first).h(jElapsedRealtime) && jhlVar3.aZ()) {
                        jhlVar3.aP();
                        if (((android.util.MutableBoolean) pair.second).value) {
                            ((defpackage.inh) jkrVar).u(jhlVar3);
                        }
                        this.c.remove(jhlVar3);
                        com.google.android.gms.car.display.CarRegionId carRegionIdD2 = jhlVar3.D();
                        this.d.C(carRegionIdD2, jhlVar3);
                        abaVar3.e(i3);
                        if (carRegionIdD2 != null && this.u.remove(carRegionIdD2)) {
                            java.lang.Object obj2 = this.B.a;
                            synchronized (((defpackage.inh) obj2).V) {
                                ((defpackage.inh) obj2).al(jhlVar3, null, true);
                            }
                        }
                        z2 = true;
                    } else {
                        z = true;
                    }
                }
                if (z2) {
                    jkrVar.T();
                }
                if (z) {
                    defpackage.jir jirVar = this.f;
                    jirVar.getClass();
                    jirVar.a(this.v);
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void C(defpackage.jhl jhlVar) {
        ((defpackage.yqj) a.l().ai((char) 2185)).y("doStartStartupAnimation for %s", jhlVar.aO());
        if (W(jhlVar)) {
            U();
            jhlVar.aq();
        }
    }

    public final synchronized void E(defpackage.jhl jhlVar, defpackage.jik jikVar) {
        if (!L(jhlVar) && this.w != null && this.g != null) {
            defpackage.aba abaVar = this.n;
            if (((defpackage.jhz) abaVar.get(jhlVar)) != null) {
                ((defpackage.yqj) a.l().ai((char) 2195)).y("scheduleChoreographedEnterAnimationMain for currently starting window %s", jhlVar);
                return;
            }
            if (((android.util.Pair) this.o.get(jhlVar)) != null) {
                ((defpackage.yqj) a.l().ai((char) 2194)).y("scheduleChoreographedEnterAnimationMain for already removed window %s", jhlVar);
                return;
            }
            defpackage.yqm yqmVar = a;
            ((defpackage.yqj) yqmVar.l().ai((char) 2192)).y("scheduleChoreographedEnterAnimationMain %s", jhlVar.aO());
            defpackage.jhz jhzVarA = A(jhlVar.g(), jhlVar.y(), jikVar);
            com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography = jikVar.b;
            projectionWindowAnimationChoreography.getClass();
            com.google.android.gms.car.display.CarRegionId carRegionIdD = jhlVar.D();
            defpackage.ynk ynkVar = this.e;
            carRegionIdD.getClass();
            ynkVar.t(carRegionIdD, jhlVar);
            if (!projectionWindowAnimationChoreography.e) {
                this.u.add(carRegionIdD);
            }
            c(projectionWindowAnimationChoreography);
            abaVar.put(jhlVar, jhzVarA);
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(2193)).M("scheduleChoreographedEnterAnimationMain moving %s to pending for %s", carRegionIdD, projectionWindowAnimationChoreography);
            this.q.put(carRegionIdD, projectionWindowAnimationChoreography);
            this.s.remove(carRegionIdD);
            defpackage.jis jisVar = this.g;
            if (jisVar != null) {
                jisVar.a(projectionWindowAnimationChoreography);
            }
        }
    }

    public final synchronized void F(defpackage.jhl jhlVar, defpackage.jik jikVar, boolean z) {
        if (K(jhlVar)) {
            ((defpackage.yqj) a.l().ai((char) 2199)).y("scheduleChoreographedExitAnimation for currently scheduled %s", jhlVar);
            return;
        }
        if (this.w != null) {
            defpackage.aba abaVar = this.o;
            android.util.Pair pair = (android.util.Pair) abaVar.get(jhlVar);
            if (pair != null) {
                ((defpackage.yqj) a.l().ai((char) 2198)).y("scheduleChoreographedExitAnimation for currently removing %s", jhlVar);
                ((android.util.MutableBoolean) pair.second).value |= z;
                return;
            }
            defpackage.yqm yqmVar = a;
            ((defpackage.yqj) yqmVar.l().ai((char) 2196)).y("scheduleChoreographedExitAnimation %s", jhlVar.aO());
            d(jhlVar);
            defpackage.jhz jhzVarZ = z(jhlVar.g(), jhlVar.y(), jikVar);
            com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography = jikVar.b;
            projectionWindowAnimationChoreography.getClass();
            com.google.android.gms.car.display.CarRegionId carRegionIdD = jhlVar.D();
            defpackage.ynk ynkVar = this.d;
            carRegionIdD.getClass();
            ynkVar.t(carRegionIdD, jhlVar);
            if (!projectionWindowAnimationChoreography.e) {
                this.u.add(carRegionIdD);
            }
            c(projectionWindowAnimationChoreography);
            abaVar.put(jhlVar, android.util.Pair.create(jhzVarZ, new android.util.MutableBoolean(z)));
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(2197)).M("scheduleChoreographedExitAnimationMain moving %s to pending for %s", carRegionIdD, projectionWindowAnimationChoreography);
            this.r.put(carRegionIdD, projectionWindowAnimationChoreography);
            this.t.remove(carRegionIdD);
            defpackage.jis jisVar = this.g;
            if (jisVar != null) {
                jisVar.a(projectionWindowAnimationChoreography);
            }
        }
    }

    public final synchronized void G(defpackage.jhl jhlVar, defpackage.jik jikVar, boolean z) {
        if (M(jhlVar)) {
            ((defpackage.yqj) a.l().ai((char) 2202)).y("scheduleContentWindowRemovalAnimation for currently scheduled %s", jhlVar);
            return;
        }
        if (this.w != null) {
            defpackage.aba abaVar = this.o;
            android.util.Pair pair = (android.util.Pair) abaVar.get(jhlVar);
            if (pair != null) {
                ((defpackage.yqj) a.l().ai((char) 2201)).y("scheduleContentWindowRemovalAnimation for currently removing %s", jhlVar);
                ((android.util.MutableBoolean) pair.second).value |= z;
                return;
            }
            ((defpackage.yqj) a.l().ai((char) 2200)).y("scheduleContentWindowRemovalAnimation %s", jhlVar.aO());
            d(jhlVar);
            defpackage.jhz jhzVarZ = z(jhlVar.g(), jhlVar.y(), jikVar);
            if (!X(jhlVar, jhzVarZ, z)) {
                this.c.add(jhlVar);
                abaVar.put(jhlVar, android.util.Pair.create(jhzVarZ, new android.util.MutableBoolean(z)));
                defpackage.jis jisVar = this.g;
                if (jisVar != null) {
                    jisVar.b();
                }
            }
        }
    }

    public final synchronized void H(defpackage.jhl jhlVar, defpackage.jik jikVar) {
        if (!N(jhlVar) && this.w != null && this.g != null) {
            defpackage.aba abaVar = this.n;
            if (((defpackage.jhz) abaVar.get(jhlVar)) != null) {
                ((defpackage.yqj) a.l().ai((char) 2206)).y("scheduleContentWindowStartupAnimation for currently starting window %s", jhlVar);
                return;
            }
            if (((android.util.Pair) this.o.get(jhlVar)) != null) {
                ((defpackage.yqj) a.l().ai((char) 2205)).y("scheduleContentWindowStartupAnimation for already removed window %s", jhlVar);
                return;
            }
            defpackage.yqm yqmVar = a;
            ((defpackage.yqj) yqmVar.l().ai((char) 2203)).y("scheduleContentWindowStartupAnimation %s", jhlVar.aO());
            defpackage.jhz jhzVarA = A(jhlVar.g(), jhlVar.y(), jikVar);
            if (Y(jhlVar, jhzVarA)) {
                ((defpackage.yqj) yqmVar.l().ai((char) 2204)).y("Waiting for choreography to run animation for %s", jhlVar.aO());
                return;
            }
            this.b.add(jhlVar);
            abaVar.put(jhlVar, jhzVarA);
            defpackage.jis jisVar = this.g;
            if (jisVar != null) {
                jisVar.b();
            }
        }
    }

    public final synchronized void I(boolean z, com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography) {
        boolean z2;
        if (this.w == null) {
            return;
        }
        if (projectionWindowAnimationChoreography.f && projectionWindowAnimationChoreography.e) {
            defpackage.yhv yhvVar = new defpackage.yhv();
            defpackage.yhv yhvVar2 = new defpackage.yhv();
            for (java.util.Map.Entry entry : this.d.u()) {
                if (projectionWindowAnimationChoreography.equals(this.r.get(entry.getKey()))) {
                    yhvVar2.c((defpackage.jhl) entry.getValue());
                }
            }
            for (java.util.Map.Entry entry2 : this.e.u()) {
                if (projectionWindowAnimationChoreography.equals(this.q.get(entry2.getKey()))) {
                    yhvVar.c((defpackage.jhl) entry2.getValue());
                }
            }
            defpackage.izq izqVar = this.B;
            defpackage.yhx yhxVarG = yhvVar.g();
            defpackage.yhx yhxVarG2 = yhvVar2.g();
            ((defpackage.yqj) defpackage.inh.a.l().ai(443)).M("Batch inset changes, additions: %s, removals: %s", yhxVarG, yhxVarG2);
            java.lang.Object obj = izqVar.a;
            synchronized (((defpackage.inh) obj).V) {
                java.util.Iterator it = ((defpackage.inh) obj).X.v().iterator();
                while (it.hasNext()) {
                    ((defpackage.inh) obj).O((defpackage.jhl) it.next(), yhxVarG2, new java.util.HashSet(yhxVarG));
                }
            }
        }
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai(2209)).P("startChoreographedWindowAnimation(%s, %s)", z, projectionWindowAnimationChoreography);
        android.util.ArraySet arraySet = new android.util.ArraySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry3 : this.d.u()) {
            com.google.android.gms.car.display.CarRegionId carRegionId = (com.google.android.gms.car.display.CarRegionId) entry3.getKey();
            defpackage.jhl jhlVar = (defpackage.jhl) entry3.getValue();
            boolean zAZ = jhlVar.aZ();
            java.util.Map map = this.r;
            boolean zEquals = projectionWindowAnimationChoreography.equals((com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography) map.get(carRegionId));
            if (zEquals && !zAZ && V(jhlVar)) {
                ((defpackage.yqj) yqmVar.l().ai((char) 2214)).y("Starting window removal animation for %s", jhlVar.aO());
                j$.util.Map.-EL.remove(map, carRegionId, projectionWindowAnimationChoreography);
                arrayList.add(jhlVar);
            } else {
                ((defpackage.yqj) yqmVar.l().ai(2213)).R("Unable to start removal animation for %s-- started: %s, in choreography %s", jhlVar, java.lang.Boolean.valueOf(zAZ), java.lang.Boolean.valueOf(zEquals));
            }
            arraySet.add(carRegionId);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.util.Map.Entry entry4 : this.e.u()) {
            com.google.android.gms.car.display.CarRegionId carRegionId2 = (com.google.android.gms.car.display.CarRegionId) entry4.getKey();
            defpackage.jhl jhlVar2 = (defpackage.jhl) entry4.getValue();
            boolean zAZ2 = jhlVar2.aZ();
            java.util.Map map2 = this.q;
            boolean zEquals2 = projectionWindowAnimationChoreography.equals((com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography) map2.get(carRegionId2));
            if (zEquals2 && !zAZ2 && W(jhlVar2)) {
                ((defpackage.yqj) yqmVar.l().ai((char) 2212)).y("Starting window startup animation for %s", jhlVar2.aO());
                j$.util.Map.-EL.remove(map2, carRegionId2, projectionWindowAnimationChoreography);
                arrayList2.add(jhlVar2);
            } else {
                ((defpackage.yqj) yqmVar.l().ai(2211)).R("Unable to start startup animation for %s-- started: %s, in choreography %s", jhlVar2, java.lang.Boolean.valueOf(zAZ2), java.lang.Boolean.valueOf(zEquals2));
            }
            arraySet.add(carRegionId2);
        }
        if (z) {
            z2 = false;
        } else {
            defpackage.yot it2 = projectionWindowAnimationChoreography.b().entrySet().iterator();
            z2 = false;
            while (it2.hasNext()) {
                java.util.Map.Entry entry5 = (java.util.Map.Entry) it2.next();
                if (!arraySet.contains(entry5.getKey())) {
                    defpackage.jhl jhlVarK = ((defpackage.inh) this.C.a).k((com.google.android.gms.car.display.CarRegionId) entry5.getKey(), true);
                    if (jhlVarK == null) {
                        ((defpackage.yqj) yqmVar.l().ai((char) 2220)).y("No window for %s to animate", entry5.getKey());
                    } else if (!jhlVarK.aZ()) {
                        T(jhlVarK, new defpackage.jhy(b(((defpackage.inh) this.m).l, (com.google.android.gms.car.animation.ProjectionWindowAnimationParams) entry5.getValue(), jhlVarK.k(), jhlVarK.d()), j));
                        z2 = true;
                    }
                }
            }
        }
        if (!arrayList.isEmpty() || !arrayList2.isEmpty() || z2) {
            ((defpackage.yqj) yqmVar.l().ai((char) 2210)).u("Starting animation rendering loop");
            U();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.jhl) arrayList.get(i)).M();
        }
        j$.util.Collection.-EL.removeIf(this.q.entrySet(), new defpackage.ghv(projectionWindowAnimationChoreography, 8));
        j$.util.Collection.-EL.removeIf(this.r.entrySet(), new defpackage.ghv(projectionWindowAnimationChoreography, 9));
        j$.util.Collection.-EL.removeIf(this.s.entrySet(), new defpackage.ghv(projectionWindowAnimationChoreography, 10));
        j$.util.Collection.-EL.removeIf(this.t.entrySet(), new defpackage.ghv(projectionWindowAnimationChoreography, 11));
    }

    public final synchronized void J() {
        if (this.w != null) {
            defpackage.yqm yqmVar = a;
            ((defpackage.yqj) yqmVar.l().ai((char) 2215)).u("startContentWindowAnimation");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (defpackage.jhl jhlVar : this.c) {
                if (!jhlVar.aZ() && V(jhlVar)) {
                    ((defpackage.yqj) yqmVar.l().ai((char) 2218)).y("Starting window removal animation for %s", jhlVar.aO());
                    arrayList.add(jhlVar);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (defpackage.jhl jhlVar2 : this.b) {
                if (!jhlVar2.aZ() && W(jhlVar2)) {
                    ((defpackage.yqj) yqmVar.l().ai((char) 2217)).y("Starting window startup animation for %s", jhlVar2.aO());
                    arrayList2.add(jhlVar2);
                }
            }
            if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                ((defpackage.yqj) yqmVar.l().ai((char) 2216)).u("Starting animation rendering loop");
                U();
            }
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((defpackage.jhl) arrayList2.get(i)).aq();
            }
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((defpackage.jhl) arrayList.get(i2)).M();
            }
        }
    }

    final synchronized boolean K(defpackage.jhl jhlVar) {
        return this.d.z(jhlVar);
    }

    final synchronized boolean L(defpackage.jhl jhlVar) {
        return this.e.z(jhlVar);
    }

    final synchronized boolean M(defpackage.jhl jhlVar) {
        return this.c.contains(jhlVar);
    }

    final synchronized boolean N(defpackage.jhl jhlVar) {
        return this.b.contains(jhlVar);
    }

    @Override // defpackage.jip
    public final defpackage.jik a(android.content.Context context, int i) {
        return new defpackage.jik(y(android.view.animation.AnimationUtils.loadAnimation(context, i), this.z, this.A), null, 0);
    }

    @Override // defpackage.jip
    public final defpackage.jik b(android.content.Context context, com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams, int i, int i2) {
        android.view.animation.Animation animationY = y(android.view.animation.AnimationUtils.loadAnimation(context, projectionWindowAnimationParams.a), i, i2);
        return projectionWindowAnimationParams.b ? new jil(animationY, projectionWindowAnimationParams.c, projectionWindowAnimationParams.d) : new defpackage.jik(animationY, projectionWindowAnimationParams.c, projectionWindowAnimationParams.d);
    }

    @Override // defpackage.jip
    public final synchronized void c(com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography) {
        ((defpackage.yqj) a.l().ai((char) 2172)).y("Adding pending choreography to waiting: %s", projectionWindowAnimationChoreography);
        defpackage.yot it = projectionWindowAnimationChoreography.a().entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.google.android.gms.car.display.CarRegionId carRegionId = (com.google.android.gms.car.display.CarRegionId) entry.getKey();
            if (((java.lang.Integer) entry.getValue()).intValue() == 0) {
                this.s.put(carRegionId, projectionWindowAnimationChoreography);
            } else {
                this.t.put(carRegionId, projectionWindowAnimationChoreography);
            }
        }
    }

    @Override // defpackage.jip
    public final synchronized void d(defpackage.jhl jhlVar) {
        jhlVar.aO();
        S(jhlVar, ((defpackage.jhz) this.n.get(jhlVar)) != null, true, true);
    }

    @Override // defpackage.jip
    public final synchronized void e(defpackage.jhl jhlVar) {
        android.util.Pair pair = (android.util.Pair) this.o.get(jhlVar);
        if (pair != null) {
            ((android.util.MutableBoolean) pair.second).value = false;
        }
        S(jhlVar, true, true, true);
    }

    @Override // defpackage.jip
    public final void f(java.io.PrintWriter printWriter) {
        try {
            printWriter.println("WindowAnimationController");
            printWriter.println("startupAnimationMap=" + this.n.toString());
            printWriter.println("removalAnimationMap=" + this.o.toString());
            printWriter.println("customAnimationMap=" + this.p.toString());
            printWriter.println("pendingStartupContentWindows=" + this.b.toString());
            printWriter.println("pendingRemovalContentWindows=" + this.c.toString());
            printWriter.println("pendingChoreographedRemovals=" + this.d.toString());
            printWriter.println("pendingChoreographedAdditions=" + this.e.toString());
            printWriter.println("pendingChoreographedEnterRegions=" + this.q.toString());
            printWriter.println("pendingChoreographedExitRegions=" + this.r.toString());
            printWriter.println("waitingChoreographedEnterRegions=" + this.s.toString());
            printWriter.println("waitingChoreographedExitRegions=" + this.t.toString());
            printWriter.println("regionsToHandleInsetAfterAnimation=" + this.u.toString());
            printWriter.println();
            printWriter.println("Rendering commands, now = " + java.lang.System.currentTimeMillis());
            defpackage.jir jirVar = this.f;
            if (jirVar != null) {
                for (android.util.Pair pair : jirVar.a) {
                    printWriter.println("Command: " + java.lang.String.valueOf(pair.first) + " @ " + java.lang.String.valueOf(pair.second));
                }
            }
        } catch (java.lang.IllegalArgumentException | java.util.ConcurrentModificationException unused) {
            printWriter.println("Concurrent Modification, unable to finish printing");
        }
    }

    @Override // defpackage.jip
    public final synchronized void g(defpackage.jhi jhiVar) {
        this.v = 1000 / jhiVar.a.d;
        this.x = jhiVar;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("animation", -10);
        this.w = handlerThread;
        handlerThread.start();
        this.f = new defpackage.jir(this, this.w.getLooper());
        this.g = new defpackage.jis(this);
    }

    @Override // defpackage.jip
    public final synchronized void h() {
        R();
        defpackage.jis jisVar = this.g;
        jisVar.getClass();
        ((defpackage.yqj) a.l().ai((char) 2161)).u("WindowAnimationHandler.cancelRequests()");
        jisVar.removeCallbacksAndMessages(null);
        this.g = null;
        android.os.HandlerThread handlerThread = this.w;
        handlerThread.getClass();
        handlerThread.quit();
        this.w = null;
        this.x = null;
    }

    @Override // defpackage.jip
    public final void i(defpackage.jhl jhlVar, defpackage.jik jikVar, boolean z) {
        defpackage.jis jisVar = this.g;
        if (jisVar == null) {
            return;
        }
        jisVar.post(new isy(jisVar, jhlVar, jikVar, z, 3));
    }

    @Override // defpackage.jip
    public final void j(defpackage.jhl jhlVar, defpackage.jik jikVar) {
        defpackage.jis jisVar = this.g;
        if (jisVar == null) {
            return;
        }
        jisVar.post(new defpackage.jdh(jisVar, jhlVar, jikVar, 3, (char[]) null));
    }

    @Override // defpackage.jip
    public final synchronized void k(defpackage.jhl jhlVar, defpackage.jik jikVar, boolean z) {
        defpackage.jis jisVar = this.g;
        if (jisVar == null) {
            return;
        }
        jisVar.post(new isy(jisVar, jhlVar, jikVar, z, 2));
    }

    @Override // defpackage.jip
    public final synchronized void l(defpackage.jhl jhlVar, defpackage.jik jikVar) {
        defpackage.jis jisVar = this.g;
        if (jisVar == null) {
            return;
        }
        jisVar.post(new defpackage.jdh(jisVar, jhlVar, jikVar, 4, (char[]) null));
    }

    @Override // defpackage.jip
    public final void m(android.content.Context context, int i) {
        if (i == 0) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 2208)).u("windowAnimationStyleRes is 0. Not setting default content window animations.");
            return;
        }
        android.util.Pair pairB = defpackage.ium.b(context, i);
        int iIntValue = ((java.lang.Integer) pairB.first).intValue();
        int iIntValue2 = ((java.lang.Integer) pairB.second).intValue();
        if ((iIntValue == 0) != (iIntValue2 == 0)) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 2207)).u("enterAnimation and exitAnimation need to both be null or both be non-null. Not setting default content window animations.");
        } else if (iIntValue != 0) {
            this.h = iIntValue2;
            this.y = a(context, iIntValue);
            this.i = a(context, iIntValue2);
        }
    }

    @Override // defpackage.jip
    public final void n(int i, int i2) {
        this.z = i;
        this.A = i2;
        this.y.a.initialize(i, i2, i, i2);
        this.i.a.initialize(i, i2, i, i2);
    }

    @Override // defpackage.jip
    public final synchronized void o(defpackage.jhl jhlVar, defpackage.jik jikVar) {
        if (this.w == null) {
            return;
        }
        defpackage.aba abaVar = this.n;
        if (((defpackage.jhz) abaVar.get(jhlVar)) != null) {
            ((defpackage.yqj) a.l().ai((char) 2230)).y("startStartupAnimation for currently starting window %s", jhlVar);
            return;
        }
        if (((android.util.Pair) this.o.get(jhlVar)) != null) {
            ((defpackage.yqj) a.l().ai((char) 2229)).y("startStartupAnimation for already removed window %s", jhlVar);
            return;
        }
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai(2225)).M("startStartupAnimation(%s, %s)", jhlVar.aO(), jikVar);
        defpackage.jhz jhzVarA = A(jhlVar.g(), jhlVar.y(), jikVar);
        if (Y(jhlVar, jhzVarA)) {
            ((defpackage.yqj) yqmVar.l().ai((char) 2228)).y("Waiting for choreography to run animation for %s", jhlVar.aO());
            return;
        }
        ((defpackage.yqj) yqmVar.l().ai((char) 2226)).y("startStartupAnimation %s", jhlVar.aO());
        if (jhzVarA.e() != 0) {
            abaVar.put(jhlVar, jhzVarA);
            C(jhlVar);
        } else {
            ((defpackage.yqj) yqmVar.l().ai((char) 2227)).y("startStartupAnimation showing immediately for: %s", jhlVar.aO());
            jhlVar.aq();
            this.m.T();
        }
    }

    @Override // defpackage.jip
    public final void p() {
        ((defpackage.inh) this.m).l.getContentResolver().unregisterContentObserver(this.l);
    }

    @Override // defpackage.jip
    public final synchronized boolean q(defpackage.jhl jhlVar) {
        if (this.w == null) {
            return false;
        }
        if (jhlVar == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 2177)).u("cleanupIfInRemovalAnimation for null window");
            return false;
        }
        S(jhlVar, false, true, false);
        return true;
    }

    @Override // defpackage.jip
    public final boolean r(defpackage.jhl jhlVar) {
        com.google.android.gms.car.display.CarRegionId carRegionIdD = jhlVar.D();
        if (carRegionIdD == null) {
            return false;
        }
        return this.d.y(carRegionIdD, jhlVar) || this.e.y(carRegionIdD, jhlVar);
    }

    @Override // defpackage.jip
    public final boolean s(defpackage.jhl jhlVar) {
        if (N(jhlVar)) {
            return true;
        }
        com.google.android.gms.car.display.CarRegionId carRegionIdD = jhlVar.D();
        if (carRegionIdD == null) {
            return false;
        }
        return this.e.y(carRegionIdD, jhlVar);
    }

    @Override // defpackage.jip
    public final synchronized boolean t(defpackage.jhl jhlVar) {
        android.util.Pair pair = (android.util.Pair) this.o.get(jhlVar);
        if (pair == null) {
            return false;
        }
        ((android.util.MutableBoolean) pair.second).value = true;
        return true;
    }

    @Override // defpackage.jip
    public final synchronized boolean u() {
        if (this.w == null) {
            return false;
        }
        return !this.c.isEmpty();
    }

    @Override // defpackage.jip
    public final boolean v(defpackage.jhl jhlVar) {
        com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography projectionWindowAnimationChoreographyP = P(jhlVar, 1);
        if (projectionWindowAnimationChoreographyP == null) {
            projectionWindowAnimationChoreographyP = Q(jhlVar, 1);
        }
        return Z(projectionWindowAnimationChoreographyP);
    }

    @Override // defpackage.jip
    public final boolean w(defpackage.jhl jhlVar) {
        com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography projectionWindowAnimationChoreographyP = P(jhlVar, 0);
        if (projectionWindowAnimationChoreographyP == null) {
            projectionWindowAnimationChoreographyP = Q(jhlVar, 0);
        }
        return Z(projectionWindowAnimationChoreographyP);
    }

    @Override // defpackage.jip
    public final synchronized boolean x(defpackage.jhl jhlVar, defpackage.jik jikVar, boolean z) {
        if (this.w == null) {
            return false;
        }
        defpackage.aba abaVar = this.o;
        android.util.Pair pair = (android.util.Pair) abaVar.get(jhlVar);
        if (pair != null) {
            ((defpackage.yqj) a.l().ai((char) 2223)).y("startRemovalAnimation called twice for %s", jhlVar);
            android.util.MutableBoolean mutableBoolean = (android.util.MutableBoolean) pair.second;
            mutableBoolean.value = z | mutableBoolean.value;
            return this.d.y(jhlVar.D(), jhlVar);
        }
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai(2221)).R("startRemovalAnimation(%s, %s, %s)", jhlVar.aO(), jikVar, java.lang.Boolean.valueOf(z));
        defpackage.jhz jhzVarZ = z(jhlVar.g(), jhlVar.y(), jikVar);
        d(jhlVar);
        if (X(jhlVar, jhzVarZ, z)) {
            return true;
        }
        ((defpackage.yqj) yqmVar.l().ai((char) 2222)).y("startRemovalAnimation %s", jhlVar.aO());
        if (jhzVarZ.e() == 0) {
            if (z) {
                ((defpackage.inh) this.m).u(jhlVar);
            }
            this.m.T();
        } else {
            abaVar.put(jhlVar, new android.util.Pair(jhzVarZ, new android.util.MutableBoolean(z)));
            if (V(jhlVar)) {
                U();
            }
        }
        return false;
    }

    final android.view.animation.Animation y(android.view.animation.Animation animation, int i, int i2) {
        android.view.animation.Animation animationO = O(animation, this.m);
        animationO.initialize(i, i2, this.z, this.A);
        return animationO;
    }

    final defpackage.jhz z(int i, defpackage.jhx jhxVar, defpackage.jik jikVar) {
        if (jikVar != null) {
            return new defpackage.jhy(jikVar, j);
        }
        defpackage.jik jikVar2 = jhxVar.j;
        if (jikVar2 != null && i != 1) {
            ((defpackage.yqj) a.l().ai((char) 2179)).y("createRemovalAnimation from layout params: %s", jikVar2);
            return new defpackage.jhy(jikVar2, j);
        }
        ((defpackage.yqj) a.l().ai((char) 2178)).w("createRemovalAnimation for layer: %d", i);
        if (i == 1) {
            return new defpackage.jhy(this.i, j);
        }
        if (i == 3) {
            this.x.getClass();
            return new jid(jhxVar, this.x.a.i, j);
        }
        if (i != 5) {
            return i != 6 ? k : new jij(jhxVar, j);
        }
        this.x.getClass();
        return new jii(this.x.a.i, j);
    }
}
