package defpackage;

import androidx.car.app.model.CarColor;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class aia implements afec {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aia(int i, Object obj, int i2) {
        this.c = i2;
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r11v23, types: [gkl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v25, types: [gkl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v27, types: [java.lang.Object, ta] */
    /* JADX WARN: Type inference failed for: r11v29, types: [java.lang.Object, uy] */
    /* JADX WARN: Type inference failed for: r11v31, types: [java.lang.Object, rg] */
    /* JADX WARN: Type inference failed for: r11v33, types: [java.lang.Object, rg] */
    /* JADX WARN: Type inference failed for: r11v35, types: [java.lang.Object, rg] */
    /* JADX WARN: Type inference failed for: r11v37, types: [gkl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v53, types: [afec, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        lwr lwrVar;
        switch (this.c) {
            case 0:
                sjg sjgVar = (sjg) obj;
                int i = this.a;
                sjgVar.a = i;
                List list = ((aib) this.b).b;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ahs ahsVar = (ahs) list.get(i2);
                    sjgVar.g(ahsVar.b, (int) (i * ahsVar.a)).b = ahsVar.c;
                }
                break;
            case 1:
                sjg sjgVar2 = (sjg) obj;
                int i3 = this.a;
                sjgVar2.a = i3;
                List list2 = ((ahz) this.b).b;
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ahs ahsVar2 = (ahs) list2.get(i4);
                    sjgVar2.g(ahsVar2.b, (int) (i3 * ahsVar2.a)).b = ahsVar2.c;
                }
                break;
            case 2:
                cun cunVar = (cun) obj;
                Object obj2 = this.b;
                if (obj2 != null) {
                    int i5 = this.a;
                    float f = brb.a;
                    cuo cuoVar = (cuo) obj2;
                    cunVar.x(cuoVar, 0, (i5 - cuoVar.b) / 2);
                }
                break;
            case 3:
                cfy cfyVar = bsd.a;
                ((cun) obj).r((cuo) this.b, -this.a, 0, BitmapDescriptorFactory.HUE_RED);
                break;
            case 4:
                cfy cfyVar2 = bsd.a;
                ((cun) obj).r((cuo) this.b, 0, -this.a, BitmapDescriptorFactory.HUE_RED);
                break;
            case 5:
                Boolean boolValueOf = Boolean.valueOf(((ciu) obj).k(this.a));
                affv affvVar = (affv) this.b;
                affvVar.a = boolValueOf;
                Boolean bool = (Boolean) affvVar.a;
                bool.booleanValue();
                break;
            case 6:
                gej gejVar = (gej) obj;
                gejVar.getClass();
                this.b.sendKeyDown(this.a, gejVar);
                break;
            case 7:
                gej gejVar2 = (gej) obj;
                gejVar2.getClass();
                this.b.sendKeyLongPress(this.a, gejVar2);
                break;
            case 8:
                gej gejVar3 = (gej) obj;
                gejVar3.getClass();
                this.b.sendCancel(this.a, gejVar3);
                break;
            case 9:
                gej gejVar4 = (gej) obj;
                gejVar4.getClass();
                this.b.sendSelected(this.a, gejVar4);
                break;
            case 10:
                gej gejVar5 = (gej) obj;
                gejVar5.getClass();
                this.b.sendKeyDown(this.a, gejVar5);
                break;
            case 11:
                gej gejVar6 = (gej) obj;
                gejVar6.getClass();
                this.b.sendKeyUp(this.a, gejVar6);
                break;
            case 12:
                gej gejVar7 = (gej) obj;
                gejVar7.getClass();
                this.b.sendKeyLongPress(this.a, gejVar7);
                break;
            case 13:
                gej gejVar8 = (gej) obj;
                gejVar8.getClass();
                this.b.sendKeyUp(this.a, gejVar8);
                break;
            case 14:
                cun cunVar2 = (cun) obj;
                float f2 = hfz.a;
                cunVar2.getClass();
                cunVar2.x((cuo) this.b, 0, this.a);
                break;
            case 15:
                tj tjVar = (tj) obj;
                int i6 = lld.a;
                tjVar.getClass();
                if (((ogz) this.b).a == lky.a) {
                    int i7 = this.a;
                    tjVar.a(CarColor.createCustom(i7, i7));
                }
                break;
            case 16:
                yfq yfqVar = ((log) obj).a;
                yph yphVar = lpz.a;
                Stream streamLimit = Collection.EL.stream(yfqVar).limit(2L);
                Object obj3 = this.b;
                final int i8 = this.a;
                final lnr lnrVar = (lnr) obj3;
                yfq yfqVar2 = (yfq) streamLimit.map(new Function() { // from class: lpy
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo329andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj4) {
                        llu lluVar = (llu) obj4;
                        yph yphVar2 = lpz.a;
                        if (lluVar.k()) {
                            yfq yfqVarQ = yfq.q(lluVar);
                            afco afcoVar = tby.a;
                            return new eqm(yfqVarQ);
                        }
                        if (lluVar.j()) {
                            int i9 = i8;
                            lnr lnrVar2 = lnrVar;
                            return lpz.c(lnrVar2, lnrVar2.b(lluVar.i()), i9 + 1);
                        }
                        int i10 = yfq.d;
                        yfq yfqVar3 = yls.a;
                        afco afcoVar2 = tby.a;
                        return new eqm(yfqVar3);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(ycm.a);
                yfqVar2.isEmpty();
                break;
            case 17:
                List<jqz> list3 = (List) obj;
                lwn lwnVar = lwo.a;
                list3.getClass();
                ArrayList arrayList = new ArrayList(woy.bp(list3, 10));
                for (jqz jqzVar : list3) {
                    String str = jqzVar.b;
                    if (str != null) {
                        String string = UUID.randomUUID().toString();
                        string.getClass();
                        lwrVar = new lwr(string, lwq.c, str, 1.0d, new lwp(null, null, null, jqzVar.a), true);
                    } else {
                        String string2 = UUID.randomUUID().toString();
                        string2.getClass();
                        String str2 = jqzVar.a;
                        lwq lwqVar = lwq.b;
                        str2.getClass();
                        lwrVar = new lwr(string2, lwqVar, str2, 1.0d, new lwp(null, null, null, null), true);
                    }
                    arrayList.add(lwrVar);
                }
                lwo.c.l().R("Returning %d insights for %s %d", Integer.valueOf(arrayList.size()), this.b, Integer.valueOf(this.a));
                break;
            case 18:
                cie cieVar = (cie) obj;
                yph yphVar2 = myv.a;
                cieVar.getClass();
                cieVar.a(this.a == ((bbt) this.b).j());
                break;
            default:
                this.b.invoke(syy.p(this.a, (tar) obj));
                break;
        }
        return afak.a;
    }

    public /* synthetic */ aia(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }
}
