package defpackage;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.view.View;
import androidx.car.app.model.CarText;
import com.google.android.apps.auto.components.apphost.telecom.dialpad.MaterialStandardDialpadView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView;
import com.google.android.gms.car.control.CarControlGroup;
import com.google.android.projection.gearhead.R;
import j$.time.LocalDate;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class kaa implements afec {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kaa(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v60, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v62, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v77, types: [afdr, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int i = 20;
        int i2 = 1;
        switch (this.b) {
            case 0:
                krz krzVar = (krz) obj;
                Object obj2 = this.a;
                krr krrVar = krr.E;
                geu geuVar = ((hlf) obj2).i;
                geuVar.getClass();
                krzVar.getClass();
                int iB = krrVar.b(geuVar, krzVar);
                krr krrVar2 = krr.F;
                geuVar.getClass();
                int iB2 = krrVar2.b(geuVar, krzVar);
                krr krrVar3 = krr.I;
                geuVar.getClass();
                int iB3 = krrVar3.b(geuVar, krzVar);
                krr krrVar4 = krr.J;
                geuVar.getClass();
                int iB4 = krrVar4.b(geuVar, krzVar);
                krr krrVar5 = krr.s;
                geuVar.getClass();
                int iB5 = krrVar5.b(geuVar, krzVar);
                MaterialStandardDialpadView materialStandardDialpadView = ((kab) obj2).a;
                materialStandardDialpadView.h = geuVar;
                materialStandardDialpadView.i = iB;
                materialStandardDialpadView.j = iB2;
                materialStandardDialpadView.k = iB3;
                materialStandardDialpadView.l = iB4;
                materialStandardDialpadView.m = iB5;
                materialStandardDialpadView.f();
                return afak.a;
            case 1:
                ((dlg) obj).getClass();
                return new dlo(((dlo) this.a.a()).a);
            case 2:
                ComponentName componentName = (ComponentName) obj;
                kca kcaVar = (kca) this.a;
                kcaVar.p = componentName;
                ((lmu) kcaVar.q).l(componentName);
                return afak.a;
            case 3:
                if (affa.f((Boolean) obj, true)) {
                    Object obj3 = this.a;
                    kca kcaVar2 = (kca) obj3;
                    kcaVar2.d.setVisibility(8);
                    kcaVar2.a.setVisibility(0);
                    kcaVar2.e.setVisibility(8);
                    kcaVar2.b.setVisibility(8);
                    geu geuVar2 = ((hlf) obj3).i;
                    CarText carTextCreate = CarText.create(geuVar2.getString(R.string.nothing_to_play));
                    CarTextView carTextView = kcaVar2.c;
                    carTextView.a(geuVar2, carTextCreate);
                    carTextView.setVisibility(0);
                    ohs ohsVarJ = ebf.j();
                    rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.gR);
                    rrbVarH.p(kcaVar2.q.a().a);
                    ohsVarJ.F(rrbVarH.l());
                    ((ype) kcaVar2.s.f()).u("Switching to browse view. PBV load timeout.");
                }
                return afak.a;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                boolean zBooleanValue = bool.booleanValue();
                kcu kcuVar = (kcu) this.a;
                kcuVar.a = zBooleanValue;
                kcuVar.s();
                return afak.a;
            case 5:
                int i3 = kgl.f;
                ((eqj) this.a).m((String) obj);
                return afak.a;
            case 6:
                int i4 = kgl.f;
                ((eqj) this.a).m((List) obj);
                return afak.a;
            case 7:
                int i5 = kgl.f;
                ((eqj) this.a).m((List) obj);
                return afak.a;
            case 8:
                ((qw) this.a).j();
                return afak.a;
            case 9:
                int i6 = khj.a;
                kfl.a();
                khl khlVar = new khl(1);
                return new kfi(R.id.calendar_events_query_live_data_id, (ContentResolver) this.a, (kfk) obj, khlVar);
            case 10:
                yfq yfqVar = khm.a;
                kfl.a();
                khl khlVar2 = new khl(0);
                return new kfi(R.id.calendar_reminders_query_live_data_id, (ContentResolver) this.a, (kfk) obj, khlVar2);
            case 11:
                dzi dziVar = (dzi) obj;
                Long l = (Long) dziVar.a;
                Long l2 = (Long) dziVar.b;
                qco qcoVar = kwo.b().d;
                qcoVar.d();
                qcoVar.f().d();
                return eqy.b(new khu((khx) this.a, l, l2), new jxa(i));
            case 12:
                qco qcoVar2 = kwo.b().d;
                qcoVar2.d();
                qcoVar2.f().d();
                return eqy.b(new khv((khx) this.a, (LocalDate) obj), new jxa(i));
            case 13:
                qco qcoVar3 = kwo.b().d;
                qcoVar3.d();
                qcoVar3.f().d();
                return eqy.b(new khw((khx) this.a, (Long) obj), new kki(i2));
            case 14:
                CarControlGroup carControlGroup = (CarControlGroup) obj;
                carControlGroup.getClass();
                return ((kjq) this.a).e(carControlGroup).a;
            case 15:
                kkf kkfVar = (kkf) obj;
                kkfVar.getClass();
                if (kkfVar instanceof kkc) {
                    return new kkc(this.a.invoke(((kkc) kkfVar).a));
                }
                kkd kkdVar = kkd.a;
                if (affa.f(kkfVar, kkdVar)) {
                    return kkdVar;
                }
                kke kkeVar = kke.a;
                if (affa.f(kkfVar, kkeVar)) {
                    return kkeVar;
                }
                throw new aezs();
            case 16:
                Context context = (Context) obj;
                context.getClass();
                View view = (View) this.a.invoke(context);
                view.setTag(kmm.a);
                return view;
            case 17:
                Object obj4 = this.a;
                ((kmj) obj4).post(new kea(obj4, 13));
                return afak.a;
            case 18:
                ogz ogzVar = (ogz) obj;
                ogzVar.getClass();
                return Boolean.valueOf(affa.f(ogzVar.b, ((ogz) this.a).b));
            case 19:
                ogz ogzVar2 = (ogz) obj;
                ogzVar2.getClass();
                return Boolean.valueOf(affa.f(ogzVar2.b, this.a));
            default:
                if (((Float) obj).floatValue() == 1.0f) {
                    this.a.invoke();
                }
                return afak.a;
        }
    }
}
