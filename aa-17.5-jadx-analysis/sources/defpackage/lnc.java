package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import com.google.android.apps.auto.components.media.repository.suggestion.AppBrowserMediaSuggestionPayload;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class lnc implements eqn {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lnc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v25, types: [eqa, java.lang.Object] */
    @Override // defpackage.eqn
    public final void eS(Object obj) {
        omk omkVar;
        boolean z;
        int i = 3;
        switch (this.b) {
            case 0:
                ((lne) this.a).o = ((Boolean) obj).booleanValue();
                break;
            case 1:
                ((lnb) this.a).j = ((Boolean) obj).booleanValue();
                break;
            case 2:
                loj lojVar = (loj) obj;
                yph yphVar = lom.a;
                Object obj2 = this.a;
                if (lojVar == null) {
                    ((eqj) obj2).m(false);
                    break;
                } else {
                    int iOrdinal = lojVar.e().ordinal();
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2 || iOrdinal == 3) {
                            ((eqj) obj2).m(false);
                            break;
                        } else if (iOrdinal == 5) {
                            ((ype) ((ype) lom.a.g()).ai((char) 4101)).u("createIsBrowserSearchableData indicated car token disconnect");
                            break;
                        }
                    } else {
                        ((eqj) obj2).m(Boolean.valueOf(lojVar instanceof lor));
                        break;
                    }
                }
                break;
            case 3:
                ((eqj) this.a).m((lpf) obj);
                break;
            case 4:
                List list = (List) obj;
                Object obj3 = this.a;
                lpp lppVar = (lpp) obj3;
                yfq yfqVar = lppVar.h;
                boolean[] zArr = lppVar.i;
                List list2 = lppVar.j;
                lppVar.h = yfq.o(list);
                lppVar.i = new boolean[list.size()];
                lppVar.j = new ArrayList(Collections.nCopies(list.size(), null));
                yy yyVar = new yy(list.size());
                for (int i2 = 0; i2 < list.size(); i2++) {
                    eqj eqjVar = (eqj) list.get(i2);
                    if (yfqVar.contains(eqjVar)) {
                        int iIndexOf = yfqVar.indexOf(eqjVar);
                        lppVar.i[i2] = zArr[iIndexOf];
                        lppVar.j.set(i2, list2.get(iIndexOf));
                    } else if (!yyVar.contains(eqjVar)) {
                        ((eql) obj3).r(eqjVar, new jue(obj3, eqjVar, i));
                        yyVar.add(eqjVar);
                    }
                }
                int size = yfqVar.size();
                for (int i3 = 0; i3 < size; i3++) {
                    eqj eqjVar2 = (eqj) yfqVar.get(i3);
                    if (!list.contains(eqjVar2)) {
                        ((eql) obj3).s(eqjVar2);
                    }
                }
                if (list.isEmpty()) {
                    ((eqj) obj3).m(lppVar.a.a(new ArrayList()));
                    break;
                }
                break;
            case 5:
                ogz ogzVar = ((lod) obj).i;
                int i4 = lpv.a;
                ogzVar.d(yzz.MEDIA_CONTENT_SUGGESTION).d(((AppBrowserMediaSuggestionPayload) this.a).a, Bundle.EMPTY);
                break;
            case 6:
                ((eqj) this.a).m((lqi) obj);
                break;
            case 7:
                yph yphVar2 = lqu.a;
                Object obj4 = this.a;
                lqf lqfVar = (lqf) obj4;
                Runnable runnable = lqfVar.k;
                wer.f(runnable);
                lqfVar.i = obj;
                if (lqfVar.a.test(obj)) {
                    wer.d(runnable, lqfVar.h.toMillis());
                    break;
                } else {
                    ((eqj) obj4).m(obj);
                    lqfVar.j = true;
                    break;
                }
            case 8:
                lrn lrnVar = (lrn) obj;
                ?? r11 = this.a;
                if (lrnVar == null) {
                    lrq lrqVar = (lrq) r11;
                    lrqVar.e();
                    lrqVar.f();
                    break;
                } else {
                    lrq lrqVar2 = (lrq) r11;
                    ComponentName componentName = lrqVar2.f;
                    ComponentName componentName2 = lrnVar.a.c.a;
                    if (componentName != null && !componentName.equals(componentName2)) {
                        ((ype) ((ype) lrq.a.f()).ai(4238)).M("Canceling posted notification. New component = %s, previous = %s", componentName2, lrqVar2.f);
                        lrqVar2.e();
                        lrqVar2.f();
                    }
                    if (omu.k(lrnVar.b, lrnVar.c)) {
                        ((ype) ((ype) lrq.a.f()).ai((char) 4236)).u("Playable media detected. Cleaning up.");
                        lrqVar2.g();
                        break;
                    } else {
                        yph yphVar3 = lrq.a;
                        ((ype) ((ype) yphVar3.f()).ai((char) 4237)).u("Invalid session state detected.");
                        if (lrqVar2.f != null) {
                            ((ype) yphVar3.l().ai((char) 4231)).u("Media suggestion already posted. Not creating a new media suggestion observer.");
                            break;
                        } else if (lrqVar2.e == null) {
                            lrqVar2.e = new lro(Duration.ofMillis(3000L), tby.t(tby.v(lpz.d().b(componentName2), new lqc(11))));
                            lrqVar2.e.fE(r11, lrqVar2.c);
                            break;
                        }
                    }
                }
                break;
            case 9:
                lpt lptVar = (lpt) obj;
                yph yphVar4 = lrq.a;
                ((ype) ((ype) yphVar4.f()).ai((char) 4233)).y("Received suggestion: %s", lptVar);
                Object obj5 = this.a;
                if (acsx.K()) {
                    if (lptVar.b() != null) {
                        Bitmap bitmapB = lptVar.b();
                        bitmapB.getClass();
                        omkVar = new omk(GhIcon.l(bitmapB), false);
                    } else if (lptVar.c() != null) {
                        lrq lrqVar3 = (lrq) obj5;
                        lrqVar3.g = lptVar;
                        omm ommVar = lrqVar3.h;
                        Context context = lrqVar3.d;
                        Uri uriC = lptVar.c();
                        uriC.getClass();
                        omkVar = ommVar.a(context, uriC);
                    } else {
                        omkVar = new omk(null, false);
                    }
                    if (omm.c(omkVar)) {
                        ((lrq) obj5).a(lptVar, omkVar.a);
                    } else {
                        ((ype) ((ype) yphVar4.f()).ai((char) 4234)).u("Not creating notification with empty icon after resource loading is complete.");
                    }
                }
                ((lrq) obj5).f();
                break;
            case 10:
                Object obj6 = this.a;
                lro lroVar = (lro) obj6;
                if (lroVar.h) {
                    ((eqj) obj6).m(obj);
                    break;
                } else {
                    lroVar.i = true;
                    lroVar.a = obj;
                    break;
                }
            case 11:
                lrs lrsVar = (lrs) obj;
                if (lrsVar != null) {
                    AaPlaybackState aaPlaybackState = lrsVar.b;
                    if (aaPlaybackState.Q() != 7) {
                        Object obj7 = this.a;
                        ComponentName componentName3 = lrsVar.a;
                        lrt lrtVar = (lrt) obj7;
                        if (!Objects.equals(lrtVar.f, componentName3)) {
                            lrtVar.g = null;
                            lrtVar.f = null;
                        }
                        if (aaPlaybackState.Q() == 3) {
                            lrtVar.g = null;
                            lrtVar.f = componentName3;
                        }
                        if (aaPlaybackState.Q() != 3 && lrtVar.f != null && lrtVar.g == null) {
                            oit.a();
                            lrtVar.g = Instant.now();
                        }
                        ComponentName componentName4 = lrtVar.e;
                        Instant instant = lrtVar.g;
                        Instant instant2 = lrtVar.h;
                        instant2.getClass();
                        oit.a();
                        if (Duration.between(instant2, Instant.now()).compareTo(lrt.b) > 0) {
                            if (!Objects.equals(componentName4, componentName3) && aaPlaybackState.Q() != 3) {
                                if (instant != null) {
                                    oit.a();
                                    if (Duration.between(instant, Instant.now()).compareTo(lrt.a) <= 0) {
                                    }
                                }
                                z = false;
                            }
                            z = true;
                        } else {
                            z = false;
                        }
                        if (TextUtils.isEmpty(aaPlaybackState.W())) {
                            yfy yfyVar = lrt.c;
                            if (yfyVar.containsKey(Integer.valueOf(aaPlaybackState.P()))) {
                                lrtVar.a(lrtVar.d.getString(((Integer) yfyVar.get(Integer.valueOf(aaPlaybackState.P()))).intValue()), componentName3, z, false);
                                break;
                            }
                        } else {
                            lrtVar.a(aaPlaybackState.W().toString(), componentName3, z, true);
                            break;
                        }
                    }
                }
                break;
            case 12:
                ((lrt) this.a).e = (ComponentName) obj;
                break;
            case 13:
                ((lsc) this.a).b = (ComponentName) obj;
                break;
            case 14:
                ((lsc) this.a).c = (ComponentName) obj;
                break;
            case 15:
                ((lsc) this.a).e = ((Boolean) obj).booleanValue();
                break;
            case 16:
                ((ype) lsc.a.l().ai(4256)).y("Expiring observer keeping %s root node connection active", this.a);
                break;
            case 17:
                yph yphVar5 = lsc.a;
                lsa lsaVar = (lsa) this.a;
                Runnable runnable2 = lsaVar.i;
                wer.f(runnable2);
                lsaVar.h = obj;
                wer.d(runnable2, lsaVar.a);
                break;
            case 18:
                lsi lsiVar = (lsi) obj;
                ((lsj) this.a).a.add(new lsm(lsiVar.a, (yfq) lsiVar.b.get()));
                break;
            case 19:
                lsi lsiVar2 = (lsi) obj;
                ((lsj) this.a).a.add(new lsn(lsiVar2.a, ((Boolean) lsiVar2.b.get()).booleanValue()));
                break;
            default:
                lol lolVar = (lol) obj;
                ((lsj) this.a).a.add(new lse(lolVar.d().a, lolVar.e()));
                break;
        }
    }
}
