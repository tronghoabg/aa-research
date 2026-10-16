package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.ViewTreeObserver;
import com.android.car.libraries.apphost.internal.model.TabInternal;
import com.google.android.apps.auto.components.apphost.signin.MaterialCarRestrictedEditText;
import j$.util.Collection;
import j$.util.Map;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class jzi implements afec {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jzi(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [gku, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.ViewTreeObserver$OnWindowFocusChangeListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, vu] */
    /* JADX WARN: Type inference failed for: r6v45, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v2, types: [bwq, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int i = 17;
        int i2 = 3;
        int i3 = 0;
        switch (this.c) {
            case 0:
                ((czz) obj).getClass();
                MaterialCarRestrictedEditText materialCarRestrictedEditTextC = jyw.c(this.b);
                ViewTreeObserver viewTreeObserver = materialCarRestrictedEditTextC != null ? materialCarRestrictedEditTextC.getViewTreeObserver() : 0;
                ?? r6 = this.a;
                if (viewTreeObserver != 0) {
                    viewTreeObserver.addOnWindowFocusChangeListener(r6);
                }
                return new jzm(viewTreeObserver, r6, 0);
            case 1:
                cis cisVar = (cis) obj;
                cisVar.getClass();
                boolean zA = cisVar.a();
                ?? r0 = this.b;
                this.a.b(Boolean.valueOf(!zA && r0.c()));
                if (zA) {
                    r0.b();
                }
                return afak.a;
            case 2:
                TabInternal tabInternal = (TabInternal) obj;
                tabInternal.getClass();
                ((hlf) this.b).i.t().s(this.a, tabInternal.getContentId());
                return afak.a;
            case 3:
                ((czz) obj).getClass();
                Object obj2 = this.a;
                ?? r62 = this.b;
                r62.add(obj2);
                return new jzm(r62, obj2, 2);
            case 4:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                this.b.b(Boolean.valueOf(zBooleanValue));
                fww.H((Context) this.a, "Icon toggleButton changed: " + zBooleanValue);
                return afak.a;
            case 5:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                this.b.b(Boolean.valueOf(zBooleanValue2));
                fww.H((Context) this.a, "Filled icon toggleButton changed: " + zBooleanValue2);
                return afak.a;
            case 6:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                this.b.b(Boolean.valueOf(zBooleanValue3));
                fww.H((Context) this.a, "Filled toggleButton with icon changed: " + zBooleanValue3);
                return afak.a;
            case 7:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                this.b.b(Boolean.valueOf(zBooleanValue4));
                fww.H((Context) this.a, "Filled toggleButton changed: " + zBooleanValue4);
                return afak.a;
            case 8:
                cis cisVar2 = (cis) obj;
                cisVar2.getClass();
                if (cisVar2.a()) {
                    ahnc.d(this.b, null, 0, new gfw((bca) this.a, (afck) null, 17, (short[]) null), 3);
                }
                return afak.a;
            case 9:
                ComponentName componentName = (ComponentName) obj;
                componentName.getClass();
                if (affa.f(componentName, mkn.G) || affa.f(componentName, ((ljp) this.a).d)) {
                    z = false;
                } else {
                    ?? r63 = this.b;
                    if (!r63.isEmpty()) {
                        Iterator it = r63.iterator();
                        while (it.hasNext()) {
                            if (affa.f(((ComponentName) it.next()).getPackageName(), componentName.getPackageName())) {
                                z = false;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 10:
                lnr lnrVar = (lnr) obj;
                lnrVar.getClass();
                ((llc) this.a).k();
                Object obj3 = this.b;
                eqj eqjVarC = obj3 == null ? lnrVar.c() : lnrVar.b((String) obj3);
                eqjVarC.getClass();
                return eqjVarC;
            case 11:
                um umVar = (um) obj;
                umVar.getClass();
                sw swVar = new sw();
                Object obj4 = this.a;
                swVar.e(((lkl) obj4).e);
                swVar.d(new khe(obj4, i2));
                umVar.b(swVar.a());
                Object obj5 = this.b;
                obj5.getClass();
                umVar.a = ((Boolean) obj5).booleanValue();
                return afak.a;
            case 12:
                yva yvaVar = (yva) obj;
                yvaVar.getClass();
                boolean z = yvaVar instanceof yuy;
                Object obj6 = this.b;
                if (z) {
                    return ((lkr) obj6).a.b((lkg) ((yuy) yvaVar).a);
                }
                if (yvaVar instanceof yuz) {
                    return ((lkr) obj6).b.a((qw) this.a, (aabf) ((yuz) yvaVar).a);
                }
                throw new aezs();
            case 13:
                ((thj) obj).getClass();
                Object obj7 = this.a;
                Context context = (Context) obj7;
                return new lks(context, (mon) this.b, lnm.u(44, context), new lkd(obj7, i2));
            case 14:
                MediaSessionCompat.Token token = (MediaSessionCompat.Token) obj;
                if (token != null) {
                    ((htm) this.b).a.invoke(this.a, token);
                }
                return afak.a;
            case 15:
                lnu lnuVar = (lnu) obj;
                lnuVar.getClass();
                Object obj8 = this.a;
                Object obj9 = this.b;
                return tby.B(((llo) obj9).p, new hgf(obj9, (Object) lnuVar, obj8, 12, (char[]) null));
            case 16:
                lol lolVar = (lol) obj;
                if (!(lolVar instanceof lod)) {
                    Object obj10 = this.b;
                    if (!((loz) obj10).b) {
                        return eqy.c(eqy.a(kiu.a()), new jzi(this.a, obj10, i));
                    }
                }
                afco afcoVar = tby.a;
                return new eqm(lolVar);
            case 17:
                qrn qrnVar = (qrn) obj;
                Object obj11 = this.a;
                Object obj12 = this.b;
                if (qrnVar == null) {
                    ((ype) ((ype) loy.a.f()).ai((char) 4124)).u("Returning inactive connection since out of lifecycle");
                    low lowVar = new low(lok.f, ((loy) obj11).g(((loz) obj12).a));
                    afco afcoVar2 = tby.a;
                    return new eqm(lowVar);
                }
                ComponentName componentNameA = Collection.EL.stream(jxg.a().b(qrnVar, nyj.b())).anyMatch(new koh(obj12, 19)) ? ljp.d().a(((loz) obj12).a, qrnVar) : ((loz) obj12).a;
                if (componentNameA != null) {
                    ((ype) ((ype) loy.a.f()).ai((char) 4122)).u("Returning connection from the media browse service.");
                    return ((loy) obj11).i(componentNameA).b;
                }
                ((ype) ((ype) loy.a.f()).ai((char) 4123)).u("Returning inactive connection since no MBS to fall back to.");
                low lowVar2 = new low(lok.c, ((loy) obj11).g(((loz) obj12).a));
                afco afcoVar3 = tby.a;
                return new eqm(lowVar2);
            case 18:
                Stream stream = Collection.EL.stream((yfq) obj);
                final loz lozVar = (loz) this.b;
                llu lluVar = lozVar.c;
                final lmb lmbVar = (lmb) stream.filter(new lou(lluVar, i3)).findFirst().orElse(null);
                Object obj13 = this.a;
                if (lmbVar != null) {
                    ((ype) ((ype) loy.a.f()).ai((char) 4121)).u("Returning connection from the active media controller.");
                    final loy loyVar = (loy) obj13;
                    lol lolVar2 = (lol) Map.EL.computeIfAbsent(loyVar.f, lluVar, new Function() { // from class: lot
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo329andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj14) {
                            return new lod(lok.b, loyVar.g(lozVar.a), lmbVar);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    afco afcoVar4 = tby.a;
                    return new eqm(lolVar2);
                }
                loy loyVar2 = (loy) obj13;
                loyVar2.f.remove(lluVar);
                ((ype) ((ype) loy.a.f()).ai((char) 4120)).u("Returning inactive connection since there is no active session.");
                low lowVar3 = new low(lok.c, loyVar2.g(lozVar.a));
                afco afcoVar5 = tby.a;
                return new eqm(lowVar3);
            case 19:
                qrn qrnVar2 = (qrn) obj;
                Object obj14 = this.a;
                Object obj15 = this.b;
                if (qrnVar2 != null) {
                    return ((loy) obj15).i((ComponentName) obj14);
                }
                lok lokVar = lok.f;
                loy loyVar3 = (loy) obj15;
                ComponentName componentName2 = (ComponentName) obj14;
                lov lovVar = new lov(lokVar, loyVar3.g(componentName2));
                afco afcoVar6 = tby.a;
                return new lox(new eqm(lovVar), new eqm(new low(lokVar, loyVar3.g(componentName2))));
            default:
                return lpq.g((qrn) this.b, (List) obj, ((lpq) this.a).c);
        }
    }

    public /* synthetic */ jzi(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
