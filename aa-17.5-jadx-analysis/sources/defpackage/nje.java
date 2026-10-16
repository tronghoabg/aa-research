package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.telecom.Call;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.auto.components.system.facetbar.hotseat.RailHotseatItemView;
import com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment;
import com.google.android.projection.gearhead.R;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class nje implements afec {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ nje(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v14, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r9v0, types: [afec, afeu, byte[]] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.view.View] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int paddingStart;
        boolean z;
        int paddingStart2;
        int paddingEnd;
        boolean z2;
        boolean z3;
        int i = 4;
        int i2 = 2;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        ?? r9 = 0;
        thk thkVar = null;
        TextView textView = null;
        int i3 = 0;
        switch (this.c) {
            case 0:
                ComponentName componentName = (ComponentName) obj;
                ?? r2 = this.a;
                if (componentName == null) {
                    componentName = r2;
                }
                if (componentName == null) {
                    return kgq.l();
                }
                return ((njp) this.b).k(componentName, njk.e, true, false, false);
            case 1:
                njv njvVar = (njv) obj;
                Object obj2 = this.b;
                niy niyVar = (niy) obj2;
                niyVar.L.add(njvVar);
                njvVar.getClass();
                int i4 = njvVar.b;
                if (i4 == 2) {
                    niy.b.l().u("Using two app vertical hotseat");
                    niyVar.i();
                    njp njpVar = niyVar.c;
                    eqn eqnVar = niyVar.O;
                    njpVar.e().k(eqnVar);
                    njpVar.g().k(niyVar.P);
                    RailHotseatItemView railHotseatItemView = niyVar.J;
                    if (railHotseatItemView == null) {
                        affa.d("hotseatThree");
                        railHotseatItemView = null;
                    }
                    railHotseatItemView.setVisibility(8);
                    njpVar.b().fE(((Fragment) obj2).getViewLifecycleOwner(), eqnVar);
                } else if (i4 != 3) {
                    niy.b.l().u("Using four app vertical hotseat");
                } else {
                    niy.b.l().u("Using three app vertical hotseat");
                    niyVar.i();
                }
                Object obj3 = this.a;
                if (njvVar.c) {
                    niy.b.l().u("Bottom aligning vertical hotseat");
                    ViewGroup viewGroup = niyVar.A;
                    if (viewGroup == null) {
                        affa.d("dockContainer");
                        viewGroup = null;
                    }
                    int id = viewGroup.getId();
                    View view = niyVar.w;
                    if (view == null) {
                        affa.d("assistantIconContainer");
                        view = null;
                    }
                    int id2 = view.getId();
                    ConstraintLayout constraintLayout = (ConstraintLayout) ((View) obj3).findViewById(R.id.rail);
                    drx drxVar = new drx();
                    drxVar.e(constraintLayout);
                    drxVar.g(id, 4, id2, 3);
                    drxVar.d(id, 3);
                    drxVar.c(constraintLayout);
                } else {
                    niy.b.l().u("Center aligning vertical hotseat");
                }
                if (niyVar.j) {
                    TransitionManager.beginDelayedTransition((ViewGroup) obj3);
                }
                niyVar.j = true;
                w wVar = new w(((Fragment) obj2).getChildFragmentManager());
                wVar.q(R.id.status_bar, new RailStatusBarFragment(njvVar.d, r9, i2, r9), null);
                wVar.i(false, true);
                return afak.a;
            case 2:
                nok nokVar = (nok) obj;
                njj njjVar = njp.a;
                nokVar.getClass();
                Object obj4 = this.b;
                eqj eqjVar = (eqj) this.a;
                nokVar.a(tby.a(eqjVar, (eqj) obj4), njk.b);
                nokVar.a(eqjVar, njk.c);
                return new eqm(njk.a);
            case 3:
                njk njkVar = (njk) obj;
                njkVar.getClass();
                int iOrdinal = njkVar.ordinal();
                Object obj5 = this.a;
                Object obj6 = this.b;
                if (iOrdinal == 4) {
                    eqj eqjVar2 = ((njp) obj6).i;
                    eqjVar2.getClass();
                    return tby.v(eqjVar2, new nje(obj5, obj6, i3));
                }
                if (iOrdinal == 5) {
                    eqj eqjVar3 = ((njp) obj6).i;
                    eqjVar3.getClass();
                    return tby.v(eqjVar3, new njf(obj5, obj6, (Object) njkVar, (int) (z5 ? 1 : 0)));
                }
                if (iOrdinal != 7) {
                    Objects.toString(njkVar);
                    throw new IllegalStateException("Cannot show nav hotseat for type ".concat(njkVar.toString()));
                }
                eqj eqjVar4 = ((njp) obj6).i;
                eqjVar4.getClass();
                return tby.v(eqjVar4, new njf(obj5, obj6, njkVar, i3));
            case 4:
                cis cisVar = (cis) obj;
                int i5 = nni.a;
                cisVar.getClass();
                if (cisVar.b()) {
                    this.a.b(this.b);
                }
                return afak.a;
            case 5:
                cis cisVar2 = (cis) obj;
                int i6 = nny.a;
                cisVar2.getClass();
                if (cisVar2.b()) {
                    this.a.b(this.b);
                }
                return afak.a;
            case 6:
                nok nokVar2 = (nok) obj;
                nokVar2.getClass();
                nokVar2.a((eqj) this.a, new nqb(z6 ? 1 : 0, i2, i));
                return ((nqd) this.b).d;
            case 7:
                ((affu) this.b).a = 0L;
                ((affq) this.a).a = false;
                return afak.a;
            case 8:
                dzi dziVar = (dzi) obj;
                dziVar.getClass();
                boolean zBooleanValue = ((Boolean) dziVar.a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) dziVar.b).booleanValue();
                RailStatusBarFragment railStatusBarFragment = (RailStatusBarFragment) this.b;
                nso nsoVar = railStatusBarFragment.d;
                Object obj7 = this.a;
                if (!nsoVar.J() || nsoVar.F()) {
                    if (zBooleanValue2) {
                        paddingStart = ((View) obj7).getPaddingStart();
                        z = true;
                    } else {
                        paddingStart = 0;
                        z = false;
                    }
                    if (zBooleanValue) {
                        paddingStart2 = paddingStart;
                        paddingEnd = 0;
                        z2 = z;
                    } else {
                        paddingStart2 = paddingStart;
                        paddingEnd = ((View) obj7).getPaddingEnd();
                        z4 = false;
                        z2 = z;
                    }
                } else {
                    if (zBooleanValue) {
                        z3 = true;
                        paddingStart2 = 0;
                    } else {
                        paddingStart2 = ((View) obj7).getPaddingStart();
                        z3 = false;
                    }
                    if (zBooleanValue2) {
                        paddingEnd = ((View) obj7).getPaddingEnd();
                        z4 = z3;
                        z2 = true;
                    } else {
                        z4 = z3;
                        paddingEnd = 0;
                        z2 = false;
                    }
                }
                View view2 = (View) obj7;
                view2.setPaddingRelative(paddingStart2, view2.getPaddingTop(), paddingEnd, view2.getPaddingBottom());
                view2.setVisibility((z4 || z2) ? 0 : 8);
                if (railStatusBarFragment.l) {
                    if (view2.getVisibility() == 0 && nsoVar.F() && !railStatusBarFragment.e) {
                        TextView textView2 = railStatusBarFragment.f;
                        if (textView2 == null) {
                            affa.d("clock");
                        } else {
                            textView = textView2;
                        }
                        textView.setPaddingRelative(0, view2.getContext().getResources().getDimensionPixelSize(R.dimen.status_bar_icons_item_margin), 0, 0);
                    } else if (nsoVar.F()) {
                        TextView textView3 = railStatusBarFragment.f;
                        if (textView3 == null) {
                            affa.d("clock");
                        } else {
                            r9 = textView3;
                        }
                        r9.setPadding(0, 0, 0, 0);
                    }
                }
                return afak.a;
            case 9:
                Object obj8 = this.a;
                aabf aabfVar = (aabf) obj;
                ohh ohhVar = (ohh) this.b;
                ajmd ajmdVar = ohhVar.d;
                Call call = (Call) obj8;
                ohe oheVar = new ohe(ajmdVar, call);
                ohg ohgVar = new ohg((Object) oheVar, 1, (byte[]) null);
                ohg ohgVar2 = new ohg(oheVar, 0);
                ?? r3 = aabfVar.d;
                aabfVar.m(new cxm(new dyt(r3, ohgVar, ohgVar2), 14));
                aabfVar.m(new cxm(new dxj((Context) aabfVar.c, r3, new ohg(new ogz(ajmdVar, call), 2, (char[]) null)), 15));
                Map map = ohhVar.c;
                ohb ohbVar = new ohb(ajmdVar, call, map);
                dyr dyrVar = new dyr(r3, new ohg(ohbVar, 3, (short[]) null), new dww(null, 0));
                aabfVar.m(new cxm(dyrVar, 13));
                map.put(obj8, new ohf(dyrVar));
                aabfVar.b = new ofo(dyrVar, ohhVar, call, ohbVar, (afck) null, 2);
                return afak.a;
            case 10:
                opj opjVar = (opj) obj;
                opjVar.getClass();
                ((kwp) this.b).q(0);
                this.a.b(opjVar);
                return afak.a;
            case 11:
                axl axlVar = (axl) obj;
                axlVar.getClass();
                ?? r22 = this.a;
                axlVar.a(r22.size(), null, new nxj(r22, 5), new cct(802480018, true, new opd(r22, this.b)));
                return afak.a;
            case 12:
                pbn pbnVar = (pbn) obj;
                oze ozeVar = ozf.a;
                pbnVar.getClass();
                abnp abnpVarK = pbnVar.K();
                abnpVarK.getClass();
                DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((pbn) abnpVarK.b).b)).getClass();
                abnp abnpVarN = pbm.a.n();
                abnpVarN.getClass();
                abnpVarN.t();
                pbm pbmVar = (pbm) abnpVarN.b;
                pbmVar.b |= 1;
                ozy ozyVar = (ozy) this.a;
                pbmVar.c = ozyVar.a;
                abnpVarN.t();
                pbm pbmVar2 = (pbm) abnpVarN.b;
                pbmVar2.b = 2 | pbmVar2.b;
                pbmVar2.d = ozyVar.c;
                abnpVarN.t();
                pbm pbmVar3 = (pbm) abnpVarN.b;
                pbmVar3.f = ozyVar.d.m;
                pbmVar3.b = 8 | pbmVar3.b;
                abnpVarN.t();
                pbm pbmVar4 = (pbm) abnpVarN.b;
                pbmVar4.b |= 4;
                pbmVar4.e = ozyVar.b;
                Iterator it = ozyVar.e.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    DesugarCollections.unmodifiableList(((pbm) abnpVarN.b).g).getClass();
                    abnpVarN.t();
                    pbm pbmVar5 = (pbm) abnpVarN.b;
                    abod abodVar = pbmVar5.g;
                    if (!abodVar.c()) {
                        pbmVar5.g = abnv.G(abodVar);
                    }
                    pbmVar5.g.g(iIntValue);
                }
                Object obj9 = this.b;
                abnv abnvVarQ = abnpVarN.q();
                abnvVarQ.getClass();
                abnpVarK.t();
                ((pbn) abnpVarK.b).b().put(obj9, (pbm) abnvVarQ);
                return osq.K(abnpVarK);
            case 13:
                pbn pbnVar2 = (pbn) obj;
                oze ozeVar2 = ozf.a;
                pbnVar2.getClass();
                abnp abnpVarK2 = pbnVar2.K();
                abnpVarK2.getClass();
                DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((pbn) abnpVarK2.b).c)).getClass();
                abnp abnpVarN2 = pbo.a.n();
                abnpVarN2.getClass();
                xpu xpuVar = (xpu) this.a;
                String str = xpuVar.c;
                str.getClass();
                abnpVarN2.t();
                pbo pboVar = (pbo) abnpVarN2.b;
                pboVar.b |= 1;
                pboVar.c = str;
                int i7 = xpuVar.d;
                abnpVarN2.t();
                pbo pboVar2 = (pbo) abnpVarN2.b;
                pboVar2.b |= 2;
                pboVar2.d = i7;
                abnv abnvVarQ2 = abnpVarN2.q();
                abnvVarQ2.getClass();
                abnpVarK2.t();
                ((pbn) abnpVarK2.b).c().put(this.b, (pbo) abnvVarQ2);
                return osq.K(abnpVarK2);
            case 14:
                afco afcoVar = tby.a;
                if (obj != null) {
                    affv affvVar = (affv) this.b;
                    ((eqj) this.a).m(affvVar.a);
                    affvVar.a = obj;
                }
                return afak.a;
            case 15:
                List list = (List) obj;
                list.getClass();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object obj10 = this.b;
                        ?? next = it2.next();
                        if (affa.f(((thk) next).e, obj10)) {
                            thkVar = next;
                        }
                    }
                }
                thk thkVar2 = thkVar;
                if (thkVar2 == null) {
                    thkVar2 = (thk) woy.bH(list);
                }
                if (thkVar2 != null) {
                    Object obj11 = this.a;
                    String str2 = thkVar2.e;
                    aabf aabfVar2 = (aabf) obj11;
                    if (!affa.f(str2, aabfVar2.b)) {
                        aabfVar2.b = str2;
                        thkVar2.f.invoke();
                    }
                }
                return thkVar2;
            case 16:
                obj.getClass();
                return ((thn) this.b).b(obj).a((qw) this.a, obj);
            case 17:
                thk thkVar3 = (thk) obj;
                if (thkVar3 == null) {
                    afco afcoVar2 = tby.a;
                    return new eqm(null);
                }
                Object obj12 = this.a;
                Object obj13 = this.b;
                Object obj14 = thkVar3.d;
                return eqy.b(obj14 instanceof eqj ? eqy.c((eqj) obj14, new nje(obj13, obj12, 16, r9)) : ((thn) obj13).b(obj14).a((qw) obj12, obj14), new tbm(thkVar3, i));
            case 18:
                affq affqVar = (affq) this.a;
                if (!affqVar.a) {
                    ?? r0 = this.b;
                    affqVar.a = true;
                    ahnc.d(r0, null, 0, new opu(affqVar, (afck) null, 3), 3);
                }
                return afak.a;
            case 19:
                xri xriVar = (xri) obj;
                xriVar.getClass();
                xrj xrjVar = (xrj) this.a;
                Map mapA = xrjVar.d.a();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapA.entrySet()) {
                    ?? r5 = this.b;
                    if (r5.contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Map map2 = xrjVar.e;
                    Object key = entry2.getKey();
                    key.getClass();
                    Object value = entry2.getValue();
                    value.getClass();
                    arrayList.add(new xrc((xsy) key, value, (aes) map2.get(entry2.getKey())));
                }
                xriVar.d.addAll(arrayList);
                return afak.a;
            default:
                xrf xrfVar = (xrf) obj;
                xrfVar.getClass();
                xrfVar.b = null;
                Object obj15 = this.a;
                xrfVar.a = ((xre) obj15).a;
                for (xrj xrjVar2 : ((xrf) obj15).a()) {
                    Object obj16 = this.b;
                    long j = xrjVar2.a;
                    long j2 = xrjVar2.b;
                    aes aesVar = xrjVar2.c;
                    nje njeVar = new nje(xrjVar2, obj16, 19);
                    aesVar.getClass();
                    xri xriVar2 = new xri(j, j2, aesVar);
                    njeVar.invoke(xriVar2);
                    xrfVar.c.add(new xrg(xriVar2.a, xriVar2.b, xriVar2.c, xriVar2.d));
                }
                return afak.a;
        }
    }

    public /* synthetic */ nje(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
