package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.projection.gearhead.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class ewo implements afec {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ ewo(affq affqVar, List list, afft afftVar, ewp ewpVar, Bundle bundle, int i) {
        this.f = i;
        this.a = affqVar;
        this.b = list;
        this.c = afftVar;
        this.d = ewpVar;
        this.e = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [dnq] */
    /* JADX WARN: Type inference failed for: r3v12, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [dlg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, tmb] */
    /* JADX WARN: Type inference failed for: r5v10, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [afdr, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        List listSubList;
        thk thkVar;
        thk next;
        thk thkVar2;
        int i = this.f;
        if (i == 0) {
            euq euqVar = (euq) obj;
            euqVar.getClass();
            ((affq) this.a).a = true;
            ?? r2 = this.b;
            int iIndexOf = r2.indexOf(euqVar);
            if (iIndexOf != -1) {
                int i2 = iIndexOf + 1;
                afft afftVar = (afft) this.c;
                listSubList = r2.subList(afftVar.a, i2);
                afftVar.a = i2;
            } else {
                listSubList = afbe.a;
            }
            ((ewp) this.d).h(euqVar.a, (Bundle) this.e, euqVar, listSubList);
            return afak.a;
        }
        int i3 = 2;
        if (i == 1) {
            Object obj2 = this.b;
            ?? r22 = (dnq) obj2;
            r22.b.addView((View) obj2, r22.c);
            r22.o(this.c, (dnu) this.a, (dlr) this.d, this.e);
            return new dmt(obj2, 2);
        }
        int i4 = 14;
        int i5 = 8;
        int i6 = 19;
        byte[] bArr = null;
        if (i == 2) {
            thj thjVar = (thj) obj;
            thjVar.getClass();
            Object obj3 = this.b;
            loy loyVarJ = loy.j();
            mon monVar = (mon) obj3;
            ComponentName componentName = monVar.a;
            eqj eqjVarF = loyVarJ.f(componentName);
            eqjVarF.getClass();
            eqj eqjVarW = tby.w(tby.v(eqjVarF, new lle(i5)), new lle(9));
            Object obj4 = this.e;
            eqjVarW.fE(thjVar, new ewg(new jzi(this.d, obj4, i4, bArr), 19));
            qn qnVar = (qn) obj4;
            qnVar.e.w(new llh(componentName, qnVar));
            Context context = (Context) obj4;
            return new llg(context, monVar, thjVar, lnm.u(44, context), this.c, new lkd(thjVar, 5), new ah(obj4, obj3, this.a, i6));
        }
        if (i == 3) {
            thj thjVar2 = (thj) obj;
            thjVar2.getClass();
            eqc eqcVar = thjVar2.b;
            eqcVar.getClass();
            Context context2 = (Context) this.e;
            int iU = lnm.u(64, context2);
            int iU2 = lnm.u(8, context2);
            lkd lkdVar = new lkd(thjVar2, 7);
            qx qxVarG = thjVar2.g();
            qxVarG.getClass();
            int iV = lnm.v(qxVarG);
            llj lljVar = new llj(i3);
            ?? r3 = this.a;
            return new llo(context2, eqcVar, (mon) this.d, iU, iU2, lkdVar, this.b, this.c, r3, iV, lljVar, null, Bundle.EMPTY);
        }
        thj thjVar3 = (thj) obj;
        thjVar3.getClass();
        eqc eqcVar2 = thjVar3.b;
        esm esmVarA = esm.a(thjVar3);
        Object obj5 = this.e;
        SharedPreferences sharedPreferences = ((qn) obj5).getSharedPreferences("CfBrowseController", 0);
        eqcVar2.getClass();
        Context context3 = (Context) obj5;
        int iC = thg.c(84, context3);
        Object obj6 = this.d;
        guk gukVar = new guk(obj6, obj5, 18, bArr);
        String string = context3.getString(R.string.calllog_favorites);
        string.getClass();
        thk thkVar3 = new thk(string, IconCompat.m(context3, R.drawable.gs_star_vd_theme_24), IconCompat.m(context3, R.drawable.gs_star_fill1_vd_theme_24), new mer(context3, eqcVar2, iC, esmVarA, gukVar), null, 48);
        eqcVar2.getClass();
        int iC2 = thg.c(64, context3);
        String string2 = context3.getString(R.string.recents);
        string2.getClass();
        thk thkVar4 = new thk(string2, IconCompat.m(context3, R.drawable.gs_history_vd_theme_24), IconCompat.m(context3, R.drawable.gs_history_fill1_vd_theme_24), new mfa(context3, eqcVar2, esmVarA, iC2), null, 48);
        eqcVar2.getClass();
        int iC3 = thg.c(64, context3);
        guk gukVar2 = new guk(obj6, obj5, i6, bArr);
        String string3 = context3.getString(R.string.calllog_contacts);
        string3.getClass();
        thk thkVar5 = new thk(string3, IconCompat.m(context3, R.drawable.gs_contacts_vd_theme_24), IconCompat.m(context3, R.drawable.gs_contacts_fill1_vd_theme_24), new mej(context3, eqcVar2, iC3, jxv.k().a(context3, esmVarA, kra.a), gukVar2, new kus(obj5, i4), oit.a().c), null, 48);
        affv affvVar = (affv) this.a;
        affvVar.a = thkVar5;
        kku kkuVar = new kku(obj6, obj5, 15);
        String string4 = context3.getString(R.string.tabs_overflow);
        string4.getClass();
        thk thkVar6 = new thk(string4, IconCompat.m(context3, R.drawable.gs_more_horiz_vd_theme_24), IconCompat.m(context3, R.drawable.gs_more_horiz_fill1_vd_theme_24), new meu(kkuVar), null, 48);
        int i7 = 4;
        aezu[] aezuVarArr = new aezu[4];
        aezuVarArr[0] = new aezu(thkVar3, yzy.A);
        aezuVarArr[1] = new aezu(thkVar4, yzy.z);
        Object obj7 = affvVar.a;
        if (obj7 == null) {
            affa.d("contactsTabModel");
            thkVar = null;
        } else {
            thkVar = (thk) obj7;
        }
        aezuVarArr[2] = new aezu(thkVar, yzy.S);
        aezuVarArr[3] = new aezu(thkVar6, null);
        Map mapBa = woy.ba(aezuVarArr);
        List listCf = woy.cf(mapBa.keySet());
        String string5 = sharedPreferences.getString("saved_node_{com.google.android.projection.gearhead/com.google.android.projection.gearhead.telecom.TelecomService}", "");
        Iterator it = listCf.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = 0;
                break;
            }
            next = it.next();
            if (affa.f(((thk) next).a, string5)) {
                break;
            }
        }
        thk thkVar7 = next;
        affq affqVar = (affq) this.b;
        if (affqVar.a) {
            Object obj8 = affvVar.a;
            if (obj8 == null) {
                affa.d("contactsTabModel");
                thkVar2 = null;
            } else {
                thkVar2 = (thk) obj8;
            }
        } else {
            thkVar2 = thkVar7 == null ? thkVar3 : thkVar7;
        }
        affq affqVar2 = new affq();
        boolean z = thkVar7 == null && !affqVar.a;
        Object obj9 = this.c;
        affqVar2.a = z;
        afco afcoVar = tby.a;
        aabf aabfVar = new aabf(new eqm(listCf), thkVar2, (IconCompat) null);
        ((eqj) aabfVar.c).fE(thjVar3, new med(new lyb(sharedPreferences, mapBa, i7, bArr), 0));
        ((affv) obj9).a = aabfVar;
        ((mer) thkVar3.d).h.fE(thjVar3, new med(new hgf((Object) affqVar2, (Object) aabfVar, (Object) thkVar4, 17, (short[]) null), 0));
        return aabfVar;
    }

    public /* synthetic */ ewo(dnq dnqVar, afdr afdrVar, dnu dnuVar, dlr dlrVar, dlg dlgVar, int i) {
        this.f = i;
        this.b = dnqVar;
        this.c = afdrVar;
        this.a = dnuVar;
        this.d = dlrVar;
        this.e = dlgVar;
    }

    public /* synthetic */ ewo(htm htmVar, qn qnVar, mon monVar, afec afecVar, afdr afdrVar, int i) {
        this.f = i;
        this.d = htmVar;
        this.e = qnVar;
        this.b = monVar;
        this.c = afecVar;
        this.a = afdrVar;
    }

    public /* synthetic */ ewo(qn qnVar, mon monVar, afdr afdrVar, afeg afegVar, afec afecVar, int i) {
        this.f = i;
        this.e = qnVar;
        this.d = monVar;
        this.b = afdrVar;
        this.c = afegVar;
        this.a = afecVar;
    }

    public /* synthetic */ ewo(qn qnVar, oct octVar, affv affvVar, affq affqVar, affv affvVar2, int i) {
        this.f = i;
        this.e = qnVar;
        this.d = octVar;
        this.a = affvVar;
        this.b = affqVar;
        this.c = affvVar2;
    }
}
