package defpackage;

import android.content.ComponentName;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class lqq implements eqn, lqn {
    static final Duration a = Duration.ofSeconds(5);
    public static final lqp b = lqp.a;
    private final ajmd h;
    public final List c = new ArrayList();
    private lqp g = b;
    public Instant d = Instant.MIN;
    public int e = 0;
    public int f = 0;

    public lqq(ajmd ajmdVar) {
        this.h = ajmdVar;
    }

    public static int b(List list, lqp lqpVar) {
        for (int i = 0; i < list.size(); i++) {
            if (((lqo) list.get(i)).b == lqpVar) {
                return i;
            }
        }
        return -1;
    }

    public static void c(List list, ComponentName componentName, lqp lqpVar, yzy yzyVar, int i) {
        int iCount = (int) Collection.EL.stream(list).filter(new lou(lqpVar, 4)).count();
        if (iCount >= i) {
            ohs ohsVarJ = ebf.j();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_AUTOPLAY, yzyVar);
            rrbVarH.p(componentName);
            rrbVarH.w((iCount - i) + 1);
            ohsVarJ.F(rrbVarH.l());
        }
    }

    public static boolean d(List list, lqp lqpVar) {
        return b(list, lqpVar) >= 0;
    }

    private final void e(lqp lqpVar, lqt lqtVar) {
        woy.aa(lqpVar != this.g, "State machine must not have self-targeting transitions");
        ((ype) lqu.a.l().ai(4200)).M("Moving to state %s, signal=%s", lqpVar, lqtVar);
        this.g = lqpVar;
        int iOrdinal = lqpVar.ordinal();
        if (iOrdinal == 2 || iOrdinal == 4 || iOrdinal == 5) {
            lqj lqjVar = new lqj(lqtVar, 3);
            if (this.e < 4) {
                lqjVar.run();
                oit.a();
                this.d = Instant.now();
                this.e++;
            } else {
                this.f++;
            }
        }
        if (lqpVar.b()) {
            ((lqu) this.h.a).b();
        }
    }

    private static boolean f(AaPlaybackState aaPlaybackState, int i) {
        return aaPlaybackState != null && aaPlaybackState.Q() == i;
    }

    @Override // defpackage.eqn
    public final /* synthetic */ void eS(Object obj) {
        lqt lqtVar = (lqt) obj;
        yph yphVar = lqu.a;
        woy.aa(!this.g.b(), "Observation should stop once a terminal state is reached");
        switch (this.g.ordinal()) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                if (f(lqtVar.a().b, 3)) {
                    e(lqp.g, lqtVar);
                } else if (lqtVar.c.c) {
                    e(lqp.h, lqtVar);
                } else if (!lqtVar.b.a()) {
                    e(lqp.b, lqtVar);
                }
                List list = this.c;
                oit.a();
                list.add(new lqo(Instant.now(), this.g, lqtVar));
                return;
            case 0:
            case 1:
            case 8:
                switch (this.g.ordinal()) {
                    case 0:
                        if (!lmi.a().e() || !lqtVar.a) {
                            if (!lqtVar.b.a()) {
                                e(lqp.b, lqtVar);
                                break;
                            } else {
                                e(lqp.c, lqtVar);
                                break;
                            }
                        } else {
                            e(lqp.i, lqtVar);
                            break;
                        }
                        break;
                    case 1:
                        if (lqtVar.b.a()) {
                            e(lqp.c, lqtVar);
                            break;
                        }
                        break;
                    case 2:
                        if (!f(lqtVar.a().b, 6)) {
                            if (lqtVar.c.a && omu.k(lqtVar.a().b, lqtVar.a().c)) {
                                e(lqp.f, lqtVar);
                                break;
                            }
                        } else {
                            e(lqp.d, lqtVar);
                            break;
                        }
                        break;
                    case 3:
                        if (f(lqtVar.a().b, 2) && lqtVar.c.b) {
                            e(lqp.e, lqtVar);
                            break;
                        }
                        break;
                    case 4:
                    case 5:
                        if (f(lqtVar.a().b, 6)) {
                            e(lqp.d, lqtVar);
                            break;
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                        throw new AssertionError("Already verified current state is not terminal");
                }
                List list2 = this.c;
                oit.a();
                list2.add(new lqo(Instant.now(), this.g, lqtVar));
                return;
            default:
                throw new RuntimeException(null, null);
        }
    }
}
