package defpackage;

import android.content.ComponentName;
import android.graphics.drawable.Icon;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.SearchTemplate;
import com.android.car.libraries.apphost.external.model.MenuSection;
import com.android.car.libraries.apphost.external.model.MenuTemplate;
import com.google.android.projection.gearhead.R;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class llf implements afec {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ llf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v36, types: [java.lang.Object, vm] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        SpannedString spannedString;
        int i = 0;
        int i2 = 2;
        int i3 = 12;
        int i4 = 1;
        switch (this.b) {
            case 0:
                lmd lmdVar = (lmd) obj;
                lmdVar.getClass();
                if (lmdVar.O("com.google.android.apps.auto.radio.DTS_AUTOSTAGE_ENRICHED") != 1) {
                    return null;
                }
                Object obj2 = this.a;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ((llg) obj2).b(spannableStringBuilder, R.drawable.dts_logo, null);
                return new SpannedString(spannableStringBuilder);
            case 1:
                tj tjVar = (tj) obj;
                tjVar.getClass();
                Object obj3 = this.a;
                if (obj3 != null) {
                    kru kruVar = ksa.a;
                    krr krrVar = (krr) obj3;
                    tjVar.a(CarColor.createCustom(krrVar.e(kruVar.a().c()), krrVar.c(kruVar.a().c())));
                }
                return afak.a;
            case 2:
                lmd lmdVar2 = (lmd) obj;
                lmdVar2.getClass();
                int iO = (int) lmdVar2.O("com.google.android.apps.auto.radio.HD_RADIO_SIGNAL_MODE");
                Object obj4 = this.a;
                if (iO == 1) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    krr krrVar2 = krr.D;
                    llg llgVar = (llg) obj4;
                    llgVar.b(spannableStringBuilder2, R.drawable.hd_radio_logo_colored, krrVar2);
                    spannableStringBuilder2.append((CharSequence) " ");
                    llgVar.b(spannableStringBuilder2, R.drawable.hd_radio_logo_tintable_text, krrVar2);
                    spannedString = new SpannedString(spannableStringBuilder2);
                } else if (iO != 2) {
                    spannedString = null;
                } else {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    llg llgVar2 = (llg) obj4;
                    llgVar2.b(spannableStringBuilder3, R.drawable.hd_radio_logo_colored, null);
                    spannableStringBuilder3.append((CharSequence) " ");
                    llgVar2.b(spannableStringBuilder3, R.drawable.hd_radio_logo_tintable_text, krr.C);
                    spannedString = new SpannedString(spannableStringBuilder3);
                }
                if (spannedString instanceof CharSequence) {
                    return spannedString;
                }
                return null;
            case 3:
                lod lodVar = (lod) obj;
                lodVar.getClass();
                return tby.d(lodVar.f, lodVar.e, new kus(this.a, 9));
            case 4:
                if (affa.f((Boolean) obj, true)) {
                    Object obj5 = this.a;
                    ((ynz) llg.a.e().ai(3994)).u("Switching to browse to hide Nothing Playing playback view");
                    ohs ohsVarJ = ebf.j();
                    rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.gO);
                    llg llgVar3 = (llg) obj5;
                    rrbVarH.p(llgVar3.c.a);
                    ohsVarJ.F(rrbVarH.l());
                    llgVar3.e.invoke();
                }
                return afak.a;
            case 5:
                ComponentName componentName = (ComponentName) obj;
                componentName.getClass();
                boolean zF = affa.f(componentName, mkn.G);
                Object obj6 = this.a;
                return zF ? new lts((eqj) obj6) : new llm((eqj) obj6);
            case 6:
                lod lodVar2 = (lod) obj;
                lodVar2.getClass();
                return tby.d(lodVar2.g, lodVar2.e, new kus(this.a, 11));
            case 7:
                loi loiVar = (loi) obj;
                loiVar.getClass();
                int iA = loiVar.a() - 1;
                Object obj7 = this.a;
                if (iA != 1) {
                    if (iA != 2 && iA != 3) {
                        return null;
                    }
                    ((llc) obj7).j();
                    return afbe.a;
                }
                if (!(loiVar instanceof log)) {
                    throw new IllegalStateException("LOADED subscription must be Loaded type");
                }
                llc llcVar = (llc) obj7;
                if (llcVar.j) {
                    llcVar.i(((log) loiVar).a, yzy.iU);
                }
                return llcVar.g(((log) loiVar).a);
            case 8:
                wb wbVar = (wb) obj;
                wbVar.getClass();
                if (!(wbVar instanceof MenuTemplate)) {
                    throw new IllegalStateException("Template returned by ItemsTemplateConverter must be menu template");
                }
                vl vlVar = new vl(this.a);
                vlVar.a(Action.BACK);
                MenuTemplate menuTemplate = (MenuTemplate) wbVar;
                if (!menuTemplate.getSections().isEmpty()) {
                    ug ugVar = new ug();
                    List<MenuSection> sections = menuTemplate.getSections();
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = sections.iterator();
                    while (it.hasNext()) {
                        woy.cq(arrayList, ((MenuSection) it.next()).getItems());
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ugVar.b((uf) it2.next());
                    }
                    ItemList itemListA = ugVar.a();
                    wk.c.a(itemListA);
                    vlVar.e = itemListA;
                }
                return new SearchTemplate(vlVar);
            case 9:
                return ((loy) this.a).b((ComponentName) obj);
            case 10:
                lol lolVar = (lol) obj;
                boolean z = lolVar instanceof lod;
                loe loeVar = lof.a;
                lod lodVar3 = z ? (lod) lolVar : null;
                if (lodVar3 != null) {
                    return tby.d(lodVar3.e, lodVar3.f, new kus(this.a, i3));
                }
                afco afcoVar = tby.a;
                return new eqm(null);
            case 11:
                Map map = (Map) obj;
                lon lonVar = loo.a;
                map.getClass();
                return (Icon) map.get(this.a);
            case 12:
                lni lniVar = (lni) obj;
                Optional optional = lniVar.b;
                yph yphVar = loy.a;
                boolean zIsPresent = optional.isPresent();
                Object obj8 = this.a;
                if (!zIsPresent) {
                    return new lov(lniVar.a, (ljx) obj8);
                }
                lok lokVar = lniVar.a;
                llu lluVar = (llu) optional.get();
                return lluVar.n().getBoolean("android.media.browse.SEARCH_SUPPORTED", false) ? new lnu(lokVar, (ljx) obj8, lluVar) : new lnr(lokVar, (ljx) obj8, lluVar);
            case 13:
                lni lniVar2 = (lni) obj;
                Optional optional2 = lniVar2.c;
                yph yphVar2 = loy.a;
                boolean zIsPresent2 = optional2.isPresent();
                Object obj9 = this.a;
                if (zIsPresent2) {
                    return new lod(lniVar2.a, (ljx) obj9, (lmb) optional2.get());
                }
                return new low(lniVar2.a, (ljx) obj9);
            case 14:
                yph yphVar3 = lpq.a;
                Stream streamDistinct = Collection.EL.stream((List) obj).map(new gjm(this.a, 20)).filter(new kxo(10)).distinct();
                int i5 = yfq.d;
                return (yfq) streamDistinct.collect(ycm.a);
            case 15:
                return tby.w(eqy.a(((lpq) this.a).b), new llf((qrn) obj, 16));
            case 16:
                yph yphVar4 = lpq.a;
                ComponentName componentName2 = ((loz) obj).a;
                if (loh.c((qrn) this.a, componentName2.getPackageName()).contains(componentName2)) {
                    return componentName2;
                }
                return null;
            case 17:
                yph yphVar5 = lpz.a;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj10 = this.a;
                if (zBooleanValue) {
                    ((ype) lpz.a.l().ai((char) 4178)).u("Use Assistant media suggestions");
                    eqj eqjVarC = tby.C(kiu.a(), new lpx(obj10, i));
                    int i6 = yfq.d;
                    return eqy.c(tby.F(eqy.a(tby.c(eqjVarC, yls.a)), new kok(obj10, 5)), new lpx(obj10, i4));
                }
                if (obj10 != null) {
                    ((ype) lpz.a.l().ai((char) 4177)).u("Use Gearhead media browse suggestions");
                    return lpz.a((ComponentName) obj10);
                }
                ((ype) ((ype) lpz.a.h()).ai((char) 4176)).y("Did not attempt to use either Assistant or App browser suggestions for %s", null);
                int i7 = yfq.d;
                yfq yfqVar = yls.a;
                afco afcoVar2 = tby.a;
                return new eqm(yfqVar);
            case 18:
                tah tahVar = (tah) obj;
                yph yphVar6 = lpz.a;
                if (tahVar == null) {
                    ((ype) ((ype) lpz.a.h()).ai(4182)).y("Assistant media suggestion request failed for %s", this.a);
                    int i8 = yfq.d;
                    return yls.a;
                }
                Stream streamFilter = Collection.EL.stream(tahVar.b).map(new lka(i3)).filter(new kxo(i3));
                int i9 = yfq.d;
                return (yfq) streamFilter.collect(ycm.a);
            case 19:
                yph yphVar7 = lpz.a;
                Object obj11 = this.a;
                ComponentName componentNameA = ljp.d().a((ComponentName) obj11, (qrn) obj);
                if (componentNameA != null) {
                    obj11 = componentNameA;
                }
                return tby.C(tby.v(loy.j().b((ComponentName) obj11), new lmv(i3)), new lmv(13));
            default:
                yph yphVar8 = lpz.a;
                Stream map2 = Collection.EL.stream((yfq) obj).map(new lpc(this.a, i2));
                int i10 = yfq.d;
                return (yfq) map2.collect(ycm.a);
        }
    }
}
