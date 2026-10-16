package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.MutableBoolean;
import android.util.Pair;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.projection.gearhead.R;
import j$.util.Collection;
import j$.util.Map;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class jim implements jii {
    public static final yph a = yph.c("CAR.WM.ANIM");
    private static volatile float j = 1.0f;
    private static final jhx k = new jhx(j);
    private int A;
    private final izj B;
    private final izj C;
    jik f;
    jil g;
    int h;
    jid i;
    private final ContentObserver l;
    private final jkk m;
    private long v;
    private HandlerThread w;
    private jhc x;
    private jid y;
    private int z;
    private final aat n = new aat(0);
    private final aat o = new aat(0);
    private final aat p = new aat(0);
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public final ymf d = new yez(null);
    public final ymf e = new yez(null);
    private final Map q = new ArrayMap();
    private final Map r = new ArrayMap();
    private final Map s = new ArrayMap();
    private final Map t = new ArrayMap();
    private final Set u = new ArraySet();

    public jim(jkk jkkVar, izj izjVar, izj izjVar2) throws Resources.NotFoundException {
        this.C = izjVar;
        this.B = izjVar2;
        ina inaVar = (ina) jkkVar;
        D(inaVar.l);
        jij jijVar = new jij(new sss(Looper.getMainLooper(), (byte[]) null), jkkVar);
        this.l = jijVar;
        inaVar.l.getContentResolver().registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, jijVar);
        this.m = jkkVar;
        this.h = R.anim.task_open_exit;
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(inaVar.l, R.anim.task_open_enter);
        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(inaVar.l, this.h);
        animationLoadAnimation.getClass();
        animationLoadAnimation2.getClass();
        this.y = new jid(O(animationLoadAnimation, jkkVar), null, 0);
        this.i = new jid(O(animationLoadAnimation2, jkkVar), null, 0);
    }

    public static void D(Context context) {
        try {
            j = Settings.Global.getFloat(context.getContentResolver(), "transition_animation_scale");
        } catch (Settings.SettingNotFoundException unused) {
            j = 1.0f;
        }
    }

    private static Animation O(Animation animation, jkk jkkVar) {
        if (animation instanceof TranslateAnimation) {
            jhy jhyVar = new jhy((TranslateAnimation) animation);
            jhyVar.setStartOffset(animation.getStartOffset());
            jhyVar.setZAdjustment(animation.getZAdjustment());
            return jhyVar;
        }
        if (!(animation instanceof AnimationSet)) {
            return animation;
        }
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.setStartOffset(animation.getStartOffset());
        animationSet.setZAdjustment(animation.getZAdjustment());
        animationSet.setDuration(animation.getDuration());
        Iterator<Animation> it = ((AnimationSet) animation).getAnimations().iterator();
        while (it.hasNext()) {
            animationSet.addAnimation(O(it.next(), jkkVar));
        }
        return animationSet;
    }

    private final ProjectionWindowAnimationChoreography P(jhf jhfVar, int i) {
        CarRegionId carRegionIdC = jhfVar.C();
        if (carRegionIdC == null) {
            return null;
        }
        return i == 0 ? (ProjectionWindowAnimationChoreography) this.q.get(carRegionIdC) : (ProjectionWindowAnimationChoreography) this.r.get(carRegionIdC);
    }

    private final ProjectionWindowAnimationChoreography Q(jhf jhfVar, int i) {
        CarRegionId carRegionIdC = jhfVar.C();
        if (carRegionIdC == null) {
            return null;
        }
        return i == 0 ? (ProjectionWindowAnimationChoreography) this.s.get(carRegionIdC) : (ProjectionWindowAnimationChoreography) this.t.get(carRegionIdC);
    }

    private final synchronized void R() {
        while (true) {
            aat aatVar = this.n;
            if (aatVar.isEmpty()) {
                break;
            } else {
                S((jhf) aatVar.d(0), true, false, false);
            }
        }
        while (true) {
            aat aatVar2 = this.o;
            if (aatVar2.isEmpty()) {
                break;
            } else {
                S((jhf) aatVar2.d(0), false, true, false);
            }
        }
        while (true) {
            aat aatVar3 = this.p;
            if (!aatVar3.isEmpty()) {
                S((jhf) aatVar3.d(0), false, false, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[Catch: all -> 0x008d, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x0019, B:13:0x002d, B:15:0x003c, B:17:0x0050, B:18:0x0057, B:20:0x005d, B:22:0x0067, B:23:0x0078, B:25:0x007f, B:27:0x0085), top: B:35:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[Catch: all -> 0x008d, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x0019, B:13:0x002d, B:15:0x003c, B:17:0x0050, B:18:0x0057, B:20:0x005d, B:22:0x0067, B:23:0x0078, B:25:0x007f, B:27:0x0085), top: B:35:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f A[Catch: all -> 0x008d, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x0019, B:13:0x002d, B:15:0x003c, B:17:0x0050, B:18:0x0057, B:20:0x005d, B:22:0x0067, B:23:0x0078, B:25:0x007f, B:27:0x0085), top: B:35:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void S(defpackage.jhf r5, boolean r6, boolean r7, boolean r8) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.os.HandlerThread r0 = r4.w     // Catch: java.lang.Throwable -> L8d
            if (r0 != 0) goto L7
            goto L8b
        L7:
            r0 = 0
            if (r6 == 0) goto L2a
            java.util.List r6 = r4.b     // Catch: java.lang.Throwable -> L8d
            r6.remove(r5)     // Catch: java.lang.Throwable -> L8d
            aat r6 = r4.n     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r1 = r6.remove(r5)     // Catch: java.lang.Throwable -> L8d
            jhs r1 = (defpackage.jhs) r1     // Catch: java.lang.Throwable -> L8d
            if (r1 == 0) goto L2a
            r5.aN()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r1 = "startup animation cancelled for %s"
            yph r2 = defpackage.jim.a     // Catch: java.lang.Throwable -> L8d
            r3 = 2174(0x87e, float:3.046E-42)
            defpackage.a.bD(r1, r5, r3, r2)     // Catch: java.lang.Throwable -> L8d
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L8d
            goto L2b
        L2a:
            r6 = r0
        L2b:
            if (r7 == 0) goto L5b
            java.util.List r7 = r4.c     // Catch: java.lang.Throwable -> L8d
            r7.remove(r5)     // Catch: java.lang.Throwable -> L8d
            aat r7 = r4.o     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r1 = r7.remove(r5)     // Catch: java.lang.Throwable -> L8d
            android.util.Pair r1 = (android.util.Pair) r1     // Catch: java.lang.Throwable -> L8d
            if (r1 == 0) goto L5b
            r5.aN()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = "removal animation cancelled for %s"
            yph r2 = defpackage.jim.a     // Catch: java.lang.Throwable -> L8d
            r3 = 2173(0x87d, float:3.045E-42)
            defpackage.a.bD(r0, r5, r3, r2)     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r0 = r1.second     // Catch: java.lang.Throwable -> L8d
            android.util.MutableBoolean r0 = (android.util.MutableBoolean) r0     // Catch: java.lang.Throwable -> L8d
            boolean r0 = r0.value     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto L57
            jkk r0 = r4.m     // Catch: java.lang.Throwable -> L8d
            ina r0 = (defpackage.ina) r0     // Catch: java.lang.Throwable -> L8d
            r0.u(r5)     // Catch: java.lang.Throwable -> L8d
        L57:
            boolean r0 = r7.isEmpty()     // Catch: java.lang.Throwable -> L8d
        L5b:
            if (r8 == 0) goto L78
            aat r7 = r4.p     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r8 = r7.remove(r5)     // Catch: java.lang.Throwable -> L8d
            jhs r8 = (defpackage.jhs) r8     // Catch: java.lang.Throwable -> L8d
            if (r8 == 0) goto L78
            r5.aN()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r8 = "custom animation canceled for %s"
            yph r1 = defpackage.jim.a     // Catch: java.lang.Throwable -> L8d
            r2 = 2172(0x87c, float:3.044E-42)
            defpackage.a.bD(r8, r5, r2, r1)     // Catch: java.lang.Throwable -> L8d
            boolean r5 = r7.isEmpty()     // Catch: java.lang.Throwable -> L8d
            r0 = r0 & r5
        L78:
            jik r5 = r4.f     // Catch: java.lang.Throwable -> L8d
            r5.getClass()     // Catch: java.lang.Throwable -> L8d
            if (r6 == 0) goto L8b
            r6 = 2
            r5.removeMessages(r6)     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto L8b
            r6 = 1
            r5.removeMessages(r6)     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r4)
            return
        L8b:
            monitor-exit(r4)
            return
        L8d:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L8d
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jim.S(jhf, boolean, boolean, boolean):void");
    }

    private final synchronized void T(jhf jhfVar, jhs jhsVar) {
        this.p.put(jhfVar, jhsVar);
        jhfVar.aM();
        jhsVar.g();
        jhfVar.aO(jhsVar, false);
    }

    private final void U() {
        jik jikVar = this.f;
        jikVar.getClass();
        jikVar.a(0L);
    }

    private final synchronized boolean V(jhf jhfVar) {
        Pair pair = (Pair) this.o.get(jhfVar);
        if (pair == null) {
            jhfVar.aM();
            return false;
        }
        jhfVar.aM();
        jhs jhsVar = (jhs) pair.first;
        jhsVar.g();
        jhfVar.aO(jhsVar, true);
        return true;
    }

    private final synchronized boolean W(jhf jhfVar) {
        jhs jhsVar = (jhs) this.n.get(jhfVar);
        if (jhsVar == null) {
            return false;
        }
        jhfVar.aM();
        jhsVar.g();
        jhfVar.aO(jhsVar, false);
        return true;
    }

    private final boolean X(jhf jhfVar, jhs jhsVar, boolean z) {
        ProjectionWindowAnimationChoreography projectionWindowAnimationChoreographyQ;
        CarRegionId carRegionIdC = jhfVar.C();
        if (carRegionIdC == null || this.g == null || (projectionWindowAnimationChoreographyQ = Q(jhfVar, 1)) == null) {
            return false;
        }
        this.r.put(carRegionIdC, projectionWindowAnimationChoreographyQ);
        this.t.remove(carRegionIdC);
        ((ype) a.l().ai((char) 2187)).M("%s is in choreography %s, using that to remove", jhfVar.E(), projectionWindowAnimationChoreographyQ);
        this.d.t(carRegionIdC, jhfVar);
        if (!projectionWindowAnimationChoreographyQ.e) {
            this.u.add(carRegionIdC);
        }
        jil jilVar = this.g;
        jilVar.getClass();
        jilVar.a(projectionWindowAnimationChoreographyQ);
        ProjectionWindowAnimationParams projectionWindowAnimationParams = (ProjectionWindowAnimationParams) projectionWindowAnimationChoreographyQ.b().get(carRegionIdC);
        if (projectionWindowAnimationParams != null) {
            jhs jhsVar2 = (jhs) this.p.get(jhfVar);
            jhs jhsVarZ = z(jhfVar.g(), jhfVar.x(), b(((ina) this.m).l, projectionWindowAnimationParams, jhfVar.k(), jhfVar.d()));
            woy.ag(jhsVar2 == null || jhsVar2 == jhsVarZ, "%s already received a custom animation %s, can't handle choreography %s", jhfVar, jhsVar2, projectionWindowAnimationChoreographyQ);
            jhsVar = jhsVarZ;
        }
        this.o.put(jhfVar, new Pair(jhsVar, new MutableBoolean(z)));
        return true;
    }

    private final boolean Y(jhf jhfVar, jhs jhsVar) {
        ProjectionWindowAnimationChoreography projectionWindowAnimationChoreographyQ;
        CarRegionId carRegionIdC = jhfVar.C();
        if (carRegionIdC == null || this.g == null || (projectionWindowAnimationChoreographyQ = Q(jhfVar, 0)) == null) {
            return false;
        }
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai(2188)).M("interceptStartupAnimationForChoreography moving %s to pending for %s", carRegionIdC, projectionWindowAnimationChoreographyQ);
        this.q.put(carRegionIdC, projectionWindowAnimationChoreographyQ);
        this.s.remove(carRegionIdC);
        ((ype) yphVar.l().ai(2189)).M("%s is in choreography %s, using that to start", jhfVar.E(), projectionWindowAnimationChoreographyQ);
        this.e.t(carRegionIdC, jhfVar);
        if (!projectionWindowAnimationChoreographyQ.e) {
            this.u.add(carRegionIdC);
        }
        jil jilVar = this.g;
        jilVar.getClass();
        jilVar.a(projectionWindowAnimationChoreographyQ);
        ProjectionWindowAnimationParams projectionWindowAnimationParams = (ProjectionWindowAnimationParams) projectionWindowAnimationChoreographyQ.b().get(carRegionIdC);
        if (projectionWindowAnimationParams != null) {
            jhs jhsVar2 = (jhs) this.p.get(jhfVar);
            jhs jhsVarA = A(jhfVar.g(), jhfVar.x(), b(((ina) this.m).l, projectionWindowAnimationParams, jhfVar.k(), jhfVar.d()));
            woy.ag(jhsVar2 == null || jhsVar2 == jhsVarA, "%s already received a custom animation %s, can't handle choreography %s", jhfVar, jhsVar2, projectionWindowAnimationChoreographyQ);
            jhsVar = jhsVarA;
        }
        this.n.put(jhfVar, jhsVar);
        return true;
    }

    private static boolean Z(ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography) {
        if (projectionWindowAnimationChoreography != null) {
            return projectionWindowAnimationChoreography.e && !projectionWindowAnimationChoreography.f;
        }
        return true;
    }

    final jhs A(int i, jhq jhqVar, jid jidVar) {
        if (jidVar != null) {
            return new jhr(jidVar, j);
        }
        jid jidVar2 = jhqVar.i;
        if (jidVar2 != null) {
            ((ype) a.l().ai((char) 2180)).y("createStartupAnimation from layout params: %s", jidVar2);
            return new jhr(jidVar2, j);
        }
        ((ype) a.l().ai((char) 2179)).w("createStartupAnimation for layer: %d", i);
        if (i == 1) {
            return new jhr(this.y, j);
        }
        if (i == 2) {
            this.x.getClass();
            return new jih(jhs.c, 0L, 250L, -this.x.h, j);
        }
        if (i == 3) {
            this.x.getClass();
            int i2 = this.x.a.i;
            return new jih(jih.f, 0L, 400L, -jht.i(i2, 400), j);
        }
        if (i != 5) {
            if (i != 6) {
                return k;
            }
            return new jih(jih.c, 50L, 250L, jhqVar.d, j);
        }
        this.x.getClass();
        int i3 = this.x.a.i;
        return new jih(jih.f, 75L, 325L, -jht.i(i3, 240), j);
    }

    public final synchronized void B() {
        aat aatVar = this.n;
        if (!aatVar.isEmpty() || !this.o.isEmpty() || !this.p.isEmpty()) {
            jkk jkkVar = this.m;
            jkkVar.T();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            boolean z2 = false;
            for (int i = aatVar.d - 1; i >= 0; i--) {
                jhf jhfVar = (jhf) aatVar.d(i);
                jhs jhsVar = (jhs) aatVar.g(i);
                if (jhsVar.h(jElapsedRealtime) && jhfVar.aX()) {
                    jhfVar.ao();
                    jhfVar.aN();
                    this.b.remove(jhfVar);
                    CarRegionId carRegionIdC = jhfVar.C();
                    this.e.C(carRegionIdC, jhfVar);
                    aatVar.e(i);
                    if (carRegionIdC != null && this.u.remove(carRegionIdC)) {
                        Object obj = this.B.a;
                        synchronized (((ina) obj).V) {
                            ((ina) obj).ah(jhfVar, true);
                            ((ina) obj).N(jhfVar);
                        }
                    }
                    z2 = true;
                } else {
                    if (!jhsVar.h(jElapsedRealtime) && jhfVar.aX() && !jhfVar.aC()) {
                        jhfVar.ao();
                    }
                    z = true;
                }
            }
            aat aatVar2 = this.p;
            int i2 = aatVar2.d;
            while (true) {
                i2--;
                if (i2 < 0) {
                    break;
                }
                jhf jhfVar2 = (jhf) aatVar2.d(i2);
                if (((jhs) aatVar2.g(i2)).h(jElapsedRealtime) && jhfVar2.aX()) {
                    jhfVar2.aN();
                    aatVar2.e(i2);
                    z2 = true;
                } else {
                    z = true;
                }
            }
            aat aatVar3 = this.o;
            int i3 = aatVar3.d;
            while (true) {
                i3--;
                if (i3 < 0) {
                    break;
                }
                jhf jhfVar3 = (jhf) aatVar3.d(i3);
                Pair pair = (Pair) aatVar3.g(i3);
                if (((jhs) pair.first).h(jElapsedRealtime) && jhfVar3.aX()) {
                    jhfVar3.aN();
                    if (((MutableBoolean) pair.second).value) {
                        ((ina) jkkVar).u(jhfVar3);
                    }
                    this.c.remove(jhfVar3);
                    CarRegionId carRegionIdC2 = jhfVar3.C();
                    this.d.C(carRegionIdC2, jhfVar3);
                    aatVar3.e(i3);
                    if (carRegionIdC2 != null && this.u.remove(carRegionIdC2)) {
                        Object obj2 = this.B.a;
                        synchronized (((ina) obj2).V) {
                            ((ina) obj2).al(jhfVar3, null, true);
                        }
                    }
                    z2 = true;
                } else {
                    z = true;
                }
            }
            if (z2) {
                jkkVar.T();
            }
            if (z) {
                jik jikVar = this.f;
                jikVar.getClass();
                jikVar.a(this.v);
            }
        }
    }

    public final synchronized void C(jhf jhfVar) {
        ((ype) a.l().ai((char) 2184)).y("doStartStartupAnimation for %s", jhfVar.aM());
        if (W(jhfVar)) {
            U();
            jhfVar.ao();
        }
    }

    public final synchronized void E(jhf jhfVar, jid jidVar) {
        if (!L(jhfVar) && this.w != null && this.g != null) {
            aat aatVar = this.n;
            if (((jhs) aatVar.get(jhfVar)) != null) {
                ((ype) a.l().ai((char) 2194)).y("scheduleChoreographedEnterAnimationMain for currently starting window %s", jhfVar);
                return;
            }
            if (((Pair) this.o.get(jhfVar)) != null) {
                ((ype) a.l().ai((char) 2193)).y("scheduleChoreographedEnterAnimationMain for already removed window %s", jhfVar);
                return;
            }
            yph yphVar = a;
            ((ype) yphVar.l().ai((char) 2191)).y("scheduleChoreographedEnterAnimationMain %s", jhfVar.aM());
            jhs jhsVarA = A(jhfVar.g(), jhfVar.x(), jidVar);
            ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography = jidVar.b;
            projectionWindowAnimationChoreography.getClass();
            CarRegionId carRegionIdC = jhfVar.C();
            ymf ymfVar = this.e;
            carRegionIdC.getClass();
            ymfVar.t(carRegionIdC, jhfVar);
            if (!projectionWindowAnimationChoreography.e) {
                this.u.add(carRegionIdC);
            }
            c(projectionWindowAnimationChoreography);
            aatVar.put(jhfVar, jhsVarA);
            ((ype) ((ype) yphVar.f()).ai(2192)).M("scheduleChoreographedEnterAnimationMain moving %s to pending for %s", carRegionIdC, projectionWindowAnimationChoreography);
            this.q.put(carRegionIdC, projectionWindowAnimationChoreography);
            this.s.remove(carRegionIdC);
            jil jilVar = this.g;
            if (jilVar != null) {
                jilVar.a(projectionWindowAnimationChoreography);
            }
        }
    }

    public final synchronized void F(jhf jhfVar, jid jidVar, boolean z) {
        if (K(jhfVar)) {
            ((ype) a.l().ai((char) 2198)).y("scheduleChoreographedExitAnimation for currently scheduled %s", jhfVar);
            return;
        }
        if (this.w != null) {
            aat aatVar = this.o;
            Pair pair = (Pair) aatVar.get(jhfVar);
            if (pair != null) {
                ((ype) a.l().ai((char) 2197)).y("scheduleChoreographedExitAnimation for currently removing %s", jhfVar);
                ((MutableBoolean) pair.second).value |= z;
                return;
            }
            yph yphVar = a;
            ((ype) yphVar.l().ai((char) 2195)).y("scheduleChoreographedExitAnimation %s", jhfVar.aM());
            d(jhfVar);
            jhs jhsVarZ = z(jhfVar.g(), jhfVar.x(), jidVar);
            ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography = jidVar.b;
            projectionWindowAnimationChoreography.getClass();
            CarRegionId carRegionIdC = jhfVar.C();
            ymf ymfVar = this.d;
            carRegionIdC.getClass();
            ymfVar.t(carRegionIdC, jhfVar);
            if (!projectionWindowAnimationChoreography.e) {
                this.u.add(carRegionIdC);
            }
            c(projectionWindowAnimationChoreography);
            aatVar.put(jhfVar, Pair.create(jhsVarZ, new MutableBoolean(z)));
            ((ype) ((ype) yphVar.f()).ai(2196)).M("scheduleChoreographedExitAnimationMain moving %s to pending for %s", carRegionIdC, projectionWindowAnimationChoreography);
            this.r.put(carRegionIdC, projectionWindowAnimationChoreography);
            this.t.remove(carRegionIdC);
            jil jilVar = this.g;
            if (jilVar != null) {
                jilVar.a(projectionWindowAnimationChoreography);
            }
        }
    }

    public final synchronized void G(jhf jhfVar, jid jidVar, boolean z) {
        if (M(jhfVar)) {
            ((ype) a.l().ai((char) 2201)).y("scheduleContentWindowRemovalAnimation for currently scheduled %s", jhfVar);
            return;
        }
        if (this.w != null) {
            aat aatVar = this.o;
            Pair pair = (Pair) aatVar.get(jhfVar);
            if (pair != null) {
                ((ype) a.l().ai((char) 2200)).y("scheduleContentWindowRemovalAnimation for currently removing %s", jhfVar);
                ((MutableBoolean) pair.second).value |= z;
                return;
            }
            ((ype) a.l().ai((char) 2199)).y("scheduleContentWindowRemovalAnimation %s", jhfVar.aM());
            d(jhfVar);
            jhs jhsVarZ = z(jhfVar.g(), jhfVar.x(), jidVar);
            if (!X(jhfVar, jhsVarZ, z)) {
                this.c.add(jhfVar);
                aatVar.put(jhfVar, Pair.create(jhsVarZ, new MutableBoolean(z)));
                jil jilVar = this.g;
                if (jilVar != null) {
                    jilVar.b();
                }
            }
        }
    }

    public final synchronized void H(jhf jhfVar, jid jidVar) {
        if (!N(jhfVar) && this.w != null && this.g != null) {
            aat aatVar = this.n;
            if (((jhs) aatVar.get(jhfVar)) != null) {
                ((ype) a.l().ai((char) 2205)).y("scheduleContentWindowStartupAnimation for currently starting window %s", jhfVar);
                return;
            }
            if (((Pair) this.o.get(jhfVar)) != null) {
                ((ype) a.l().ai((char) 2204)).y("scheduleContentWindowStartupAnimation for already removed window %s", jhfVar);
                return;
            }
            yph yphVar = a;
            ((ype) yphVar.l().ai((char) 2202)).y("scheduleContentWindowStartupAnimation %s", jhfVar.aM());
            jhs jhsVarA = A(jhfVar.g(), jhfVar.x(), jidVar);
            if (Y(jhfVar, jhsVarA)) {
                ((ype) yphVar.l().ai((char) 2203)).y("Waiting for choreography to run animation for %s", jhfVar.aM());
                return;
            }
            this.b.add(jhfVar);
            aatVar.put(jhfVar, jhsVarA);
            jil jilVar = this.g;
            if (jilVar != null) {
                jilVar.b();
            }
        }
    }

    public final synchronized void I(boolean z, ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography) {
        boolean z2;
        if (this.w == null) {
            return;
        }
        if (projectionWindowAnimationChoreography.f && projectionWindowAnimationChoreography.e) {
            ygp ygpVar = new ygp();
            ygp ygpVar2 = new ygp();
            for (Map.Entry entry : this.d.u()) {
                if (projectionWindowAnimationChoreography.equals(this.r.get(entry.getKey()))) {
                    ygpVar2.c((jhf) entry.getValue());
                }
            }
            for (Map.Entry entry2 : this.e.u()) {
                if (projectionWindowAnimationChoreography.equals(this.q.get(entry2.getKey()))) {
                    ygpVar.c((jhf) entry2.getValue());
                }
            }
            izj izjVar = this.B;
            ygr ygrVarG = ygpVar.g();
            ygr ygrVarG2 = ygpVar2.g();
            ((ype) ina.a.l().ai(443)).M("Batch inset changes, additions: %s, removals: %s", ygrVarG, ygrVarG2);
            Object obj = izjVar.a;
            synchronized (((ina) obj).V) {
                Iterator it = ((ina) obj).X.v().iterator();
                while (it.hasNext()) {
                    ((ina) obj).O((jhf) it.next(), ygrVarG2, new HashSet(ygrVarG));
                }
            }
        }
        yph yphVar = a;
        ((ype) yphVar.l().ai(2208)).P("startChoreographedWindowAnimation(%s, %s)", z, projectionWindowAnimationChoreography);
        ArraySet arraySet = new ArraySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry3 : this.d.u()) {
            CarRegionId carRegionId = (CarRegionId) entry3.getKey();
            jhf jhfVar = (jhf) entry3.getValue();
            boolean zAX = jhfVar.aX();
            Map map = this.r;
            boolean zEquals = projectionWindowAnimationChoreography.equals((ProjectionWindowAnimationChoreography) map.get(carRegionId));
            if (zEquals && !zAX && V(jhfVar)) {
                ((ype) yphVar.l().ai((char) 2213)).y("Starting window removal animation for %s", jhfVar.aM());
                Map.EL.remove(map, carRegionId, projectionWindowAnimationChoreography);
                arrayList.add(jhfVar);
            } else {
                ((ype) yphVar.l().ai(2212)).R("Unable to start removal animation for %s-- started: %s, in choreography %s", jhfVar, Boolean.valueOf(zAX), Boolean.valueOf(zEquals));
            }
            arraySet.add(carRegionId);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry4 : this.e.u()) {
            CarRegionId carRegionId2 = (CarRegionId) entry4.getKey();
            jhf jhfVar2 = (jhf) entry4.getValue();
            boolean zAX2 = jhfVar2.aX();
            java.util.Map map2 = this.q;
            boolean zEquals2 = projectionWindowAnimationChoreography.equals((ProjectionWindowAnimationChoreography) map2.get(carRegionId2));
            if (zEquals2 && !zAX2 && W(jhfVar2)) {
                ((ype) yphVar.l().ai((char) 2211)).y("Starting window startup animation for %s", jhfVar2.aM());
                Map.EL.remove(map2, carRegionId2, projectionWindowAnimationChoreography);
                arrayList2.add(jhfVar2);
            } else {
                ((ype) yphVar.l().ai(2210)).R("Unable to start startup animation for %s-- started: %s, in choreography %s", jhfVar2, Boolean.valueOf(zAX2), Boolean.valueOf(zEquals2));
            }
            arraySet.add(carRegionId2);
        }
        if (z) {
            z2 = false;
        } else {
            yno it2 = projectionWindowAnimationChoreography.b().entrySet().iterator();
            z2 = false;
            while (it2.hasNext()) {
                Map.Entry entry5 = (Map.Entry) it2.next();
                if (!arraySet.contains(entry5.getKey())) {
                    jhf jhfVarK = ((ina) this.C.a).k((CarRegionId) entry5.getKey(), true);
                    if (jhfVarK == null) {
                        ((ype) yphVar.l().ai((char) 2219)).y("No window for %s to animate", entry5.getKey());
                    } else if (!jhfVarK.aX()) {
                        T(jhfVarK, new jhr(b(((ina) this.m).l, (ProjectionWindowAnimationParams) entry5.getValue(), jhfVarK.k(), jhfVarK.d()), j));
                        z2 = true;
                    }
                }
            }
        }
        if (!arrayList.isEmpty() || !arrayList2.isEmpty() || z2) {
            ((ype) yphVar.l().ai((char) 2209)).u("Starting animation rendering loop");
            U();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((jhf) arrayList.get(i)).L();
        }
        Collection.EL.removeIf(this.q.entrySet(), new ghp(projectionWindowAnimationChoreography, 7));
        Collection.EL.removeIf(this.r.entrySet(), new ghp(projectionWindowAnimationChoreography, 8));
        Collection.EL.removeIf(this.s.entrySet(), new ghp(projectionWindowAnimationChoreography, 9));
        Collection.EL.removeIf(this.t.entrySet(), new ghp(projectionWindowAnimationChoreography, 10));
    }

    public final synchronized void J() {
        if (this.w != null) {
            yph yphVar = a;
            ((ype) yphVar.l().ai((char) 2214)).u("startContentWindowAnimation");
            ArrayList arrayList = new ArrayList();
            for (jhf jhfVar : this.c) {
                if (!jhfVar.aX() && V(jhfVar)) {
                    ((ype) yphVar.l().ai((char) 2217)).y("Starting window removal animation for %s", jhfVar.aM());
                    arrayList.add(jhfVar);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (jhf jhfVar2 : this.b) {
                if (!jhfVar2.aX() && W(jhfVar2)) {
                    ((ype) yphVar.l().ai((char) 2216)).y("Starting window startup animation for %s", jhfVar2.aM());
                    arrayList2.add(jhfVar2);
                }
            }
            if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                ((ype) yphVar.l().ai((char) 2215)).u("Starting animation rendering loop");
                U();
            }
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((jhf) arrayList2.get(i)).ao();
            }
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((jhf) arrayList.get(i2)).L();
            }
        }
    }

    final synchronized boolean K(jhf jhfVar) {
        return this.d.z(jhfVar);
    }

    final synchronized boolean L(jhf jhfVar) {
        return this.e.z(jhfVar);
    }

    final synchronized boolean M(jhf jhfVar) {
        return this.c.contains(jhfVar);
    }

    final synchronized boolean N(jhf jhfVar) {
        return this.b.contains(jhfVar);
    }

    @Override // defpackage.jii
    public final jid a(Context context, int i) {
        return new jid(y(AnimationUtils.loadAnimation(context, i), this.z, this.A), null, 0);
    }

    @Override // defpackage.jii
    public final jid b(Context context, ProjectionWindowAnimationParams projectionWindowAnimationParams, int i, int i2) {
        Animation animationY = y(AnimationUtils.loadAnimation(context, projectionWindowAnimationParams.a), i, i2);
        return projectionWindowAnimationParams.b ? new jie(animationY, projectionWindowAnimationParams.c, projectionWindowAnimationParams.d) : new jid(animationY, projectionWindowAnimationParams.c, projectionWindowAnimationParams.d);
    }

    @Override // defpackage.jii
    public final synchronized void c(ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography) {
        ((ype) a.l().ai((char) 2171)).y("Adding pending choreography to waiting: %s", projectionWindowAnimationChoreography);
        yno it = projectionWindowAnimationChoreography.a().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            CarRegionId carRegionId = (CarRegionId) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 0) {
                this.s.put(carRegionId, projectionWindowAnimationChoreography);
            } else {
                this.t.put(carRegionId, projectionWindowAnimationChoreography);
            }
        }
    }

    @Override // defpackage.jii
    public final synchronized void d(jhf jhfVar) {
        jhfVar.aM();
        S(jhfVar, ((jhs) this.n.get(jhfVar)) != null, true, true);
    }

    @Override // defpackage.jii
    public final synchronized void e(jhf jhfVar) {
        Pair pair = (Pair) this.o.get(jhfVar);
        if (pair != null) {
            ((MutableBoolean) pair.second).value = false;
        }
        S(jhfVar, true, true, true);
    }

    @Override // defpackage.jii
    public final void f(PrintWriter printWriter) {
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
            printWriter.println("Rendering commands, now = " + System.currentTimeMillis());
            jik jikVar = this.f;
            if (jikVar != null) {
                Iterator<E> it = jikVar.a.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    printWriter.println("Command: " + String.valueOf(pair.first) + " @ " + String.valueOf(pair.second));
                }
            }
        } catch (IllegalArgumentException | ConcurrentModificationException unused) {
            printWriter.println("Concurrent Modification, unable to finish printing");
        }
    }

    @Override // defpackage.jii
    public final synchronized void g(jhc jhcVar) {
        this.v = 1000 / jhcVar.a.d;
        this.x = jhcVar;
        HandlerThread handlerThread = new HandlerThread("animation", -10);
        this.w = handlerThread;
        handlerThread.start();
        this.f = new jik(this, this.w.getLooper());
        this.g = new jil(this);
    }

    @Override // defpackage.jii
    public final synchronized void h() {
        R();
        jil jilVar = this.g;
        jilVar.getClass();
        ((ype) a.l().ai((char) 2160)).u("WindowAnimationHandler.cancelRequests()");
        jilVar.removeCallbacksAndMessages(null);
        this.g = null;
        HandlerThread handlerThread = this.w;
        handlerThread.getClass();
        handlerThread.quit();
        this.w = null;
        this.x = null;
    }

    @Override // defpackage.jii
    public final void i(jhf jhfVar, jid jidVar, boolean z) {
        jil jilVar = this.g;
        if (jilVar == null) {
            return;
        }
        jilVar.post(new isq(jilVar, jhfVar, jidVar, z, 3));
    }

    @Override // defpackage.jii
    public final void j(jhf jhfVar, jid jidVar) {
        jil jilVar = this.g;
        if (jilVar == null) {
            return;
        }
        jilVar.post(new jda((Object) jilVar, (Object) jhfVar, (Object) jidVar, 3, (char[]) null));
    }

    @Override // defpackage.jii
    public final synchronized void k(jhf jhfVar, jid jidVar, boolean z) {
        jil jilVar = this.g;
        if (jilVar == null) {
            return;
        }
        jilVar.post(new isq(jilVar, jhfVar, jidVar, z, 2));
    }

    @Override // defpackage.jii
    public final synchronized void l(jhf jhfVar, jid jidVar) {
        jil jilVar = this.g;
        if (jilVar == null) {
            return;
        }
        jilVar.post(new jda((Object) jilVar, (Object) jhfVar, (Object) jidVar, 4, (char[]) null));
    }

    @Override // defpackage.jii
    public final void m(Context context, int i) throws Resources.NotFoundException {
        if (i == 0) {
            ((ype) ((ype) a.h()).ai((char) 2207)).u("windowAnimationStyleRes is 0. Not setting default content window animations.");
            return;
        }
        Pair pairB = iue.b(context, i);
        int iIntValue = ((Integer) pairB.first).intValue();
        int iIntValue2 = ((Integer) pairB.second).intValue();
        if ((iIntValue == 0) != (iIntValue2 == 0)) {
            ((ype) ((ype) a.h()).ai((char) 2206)).u("enterAnimation and exitAnimation need to both be null or both be non-null. Not setting default content window animations.");
        } else if (iIntValue != 0) {
            this.h = iIntValue2;
            this.y = a(context, iIntValue);
            this.i = a(context, iIntValue2);
        }
    }

    @Override // defpackage.jii
    public final void n(int i, int i2) {
        this.z = i;
        this.A = i2;
        this.y.a.initialize(i, i2, i, i2);
        this.i.a.initialize(i, i2, i, i2);
    }

    @Override // defpackage.jii
    public final synchronized void o(jhf jhfVar, jid jidVar) {
        if (this.w == null) {
            return;
        }
        aat aatVar = this.n;
        if (((jhs) aatVar.get(jhfVar)) != null) {
            ((ype) a.l().ai((char) 2229)).y("startStartupAnimation for currently starting window %s", jhfVar);
            return;
        }
        if (((Pair) this.o.get(jhfVar)) != null) {
            ((ype) a.l().ai((char) 2228)).y("startStartupAnimation for already removed window %s", jhfVar);
            return;
        }
        yph yphVar = a;
        ((ype) yphVar.l().ai(2224)).M("startStartupAnimation(%s, %s)", jhfVar.aM(), jidVar);
        jhs jhsVarA = A(jhfVar.g(), jhfVar.x(), jidVar);
        if (Y(jhfVar, jhsVarA)) {
            ((ype) yphVar.l().ai((char) 2227)).y("Waiting for choreography to run animation for %s", jhfVar.aM());
            return;
        }
        ((ype) yphVar.l().ai((char) 2225)).y("startStartupAnimation %s", jhfVar.aM());
        if (jhsVarA.e() != 0) {
            aatVar.put(jhfVar, jhsVarA);
            C(jhfVar);
        } else {
            ((ype) yphVar.l().ai((char) 2226)).y("startStartupAnimation showing immediately for: %s", jhfVar.aM());
            jhfVar.ao();
            this.m.T();
        }
    }

    @Override // defpackage.jii
    public final void p() {
        ((ina) this.m).l.getContentResolver().unregisterContentObserver(this.l);
    }

    @Override // defpackage.jii
    public final synchronized boolean q(jhf jhfVar) {
        if (this.w == null) {
            return false;
        }
        if (jhfVar == null) {
            ((ype) ((ype) a.h()).ai((char) 2176)).u("cleanupIfInRemovalAnimation for null window");
            return false;
        }
        S(jhfVar, false, true, false);
        return true;
    }

    @Override // defpackage.jii
    public final boolean r(jhf jhfVar) {
        CarRegionId carRegionIdC = jhfVar.C();
        if (carRegionIdC == null) {
            return false;
        }
        return this.d.y(carRegionIdC, jhfVar) || this.e.y(carRegionIdC, jhfVar);
    }

    @Override // defpackage.jii
    public final boolean s(jhf jhfVar) {
        if (N(jhfVar)) {
            return true;
        }
        CarRegionId carRegionIdC = jhfVar.C();
        if (carRegionIdC == null) {
            return false;
        }
        return this.e.y(carRegionIdC, jhfVar);
    }

    @Override // defpackage.jii
    public final synchronized boolean t(jhf jhfVar) {
        Pair pair = (Pair) this.o.get(jhfVar);
        if (pair == null) {
            return false;
        }
        ((MutableBoolean) pair.second).value = true;
        return true;
    }

    @Override // defpackage.jii
    public final synchronized boolean u() {
        if (this.w == null) {
            return false;
        }
        return !this.c.isEmpty();
    }

    @Override // defpackage.jii
    public final boolean v(jhf jhfVar) {
        ProjectionWindowAnimationChoreography projectionWindowAnimationChoreographyP = P(jhfVar, 1);
        if (projectionWindowAnimationChoreographyP == null) {
            projectionWindowAnimationChoreographyP = Q(jhfVar, 1);
        }
        return Z(projectionWindowAnimationChoreographyP);
    }

    @Override // defpackage.jii
    public final boolean w(jhf jhfVar) {
        ProjectionWindowAnimationChoreography projectionWindowAnimationChoreographyP = P(jhfVar, 0);
        if (projectionWindowAnimationChoreographyP == null) {
            projectionWindowAnimationChoreographyP = Q(jhfVar, 0);
        }
        return Z(projectionWindowAnimationChoreographyP);
    }

    @Override // defpackage.jii
    public final synchronized boolean x(jhf jhfVar, jid jidVar, boolean z) {
        if (this.w == null) {
            return false;
        }
        aat aatVar = this.o;
        Pair pair = (Pair) aatVar.get(jhfVar);
        if (pair != null) {
            ((ype) a.l().ai((char) 2222)).y("startRemovalAnimation called twice for %s", jhfVar);
            MutableBoolean mutableBoolean = (MutableBoolean) pair.second;
            mutableBoolean.value = z | mutableBoolean.value;
            return this.d.y(jhfVar.C(), jhfVar);
        }
        yph yphVar = a;
        ((ype) yphVar.l().ai(2220)).R("startRemovalAnimation(%s, %s, %s)", jhfVar.aM(), jidVar, Boolean.valueOf(z));
        jhs jhsVarZ = z(jhfVar.g(), jhfVar.x(), jidVar);
        d(jhfVar);
        if (X(jhfVar, jhsVarZ, z)) {
            return true;
        }
        ((ype) yphVar.l().ai((char) 2221)).y("startRemovalAnimation %s", jhfVar.aM());
        if (jhsVarZ.e() == 0) {
            if (z) {
                ((ina) this.m).u(jhfVar);
            }
            this.m.T();
        } else {
            aatVar.put(jhfVar, new Pair(jhsVarZ, new MutableBoolean(z)));
            if (V(jhfVar)) {
                U();
            }
        }
        return false;
    }

    final Animation y(Animation animation, int i, int i2) {
        Animation animationO = O(animation, this.m);
        animationO.initialize(i, i2, this.z, this.A);
        return animationO;
    }

    final jhs z(int i, jhq jhqVar, jid jidVar) {
        if (jidVar != null) {
            return new jhr(jidVar, j);
        }
        jid jidVar2 = jhqVar.j;
        if (jidVar2 != null && i != 1) {
            ((ype) a.l().ai((char) 2178)).y("createRemovalAnimation from layout params: %s", jidVar2);
            return new jhr(jidVar2, j);
        }
        ((ype) a.l().ai((char) 2177)).w("createRemovalAnimation for layer: %d", i);
        if (i == 1) {
            return new jhr(this.i, j);
        }
        if (i == 3) {
            this.x.getClass();
            return new jhw(jhqVar, this.x.a.i, j);
        }
        if (i != 5) {
            return i != 6 ? k : new jic(jhqVar, j);
        }
        this.x.getClass();
        return new jib(this.x.a.i, j);
    }
}
