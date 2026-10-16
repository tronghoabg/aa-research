package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.surveys.internal.model.QuestionMetrics;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class wik extends wjm {
    public QuestionMetrics d;
    public aacq e;
    private boolean[] j;
    private ViewGroup k;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.wii
    public final abye c() {
        abnp abnpVarN = abye.a.n();
        if (this.d.c()) {
            abnp abnpVarN2 = abxz.a.n();
            abyt abytVar = this.a;
            abxm abxmVar = (abytVar.c == 5 ? (abyl) abytVar.d : abyl.a).c;
            if (abxmVar == null) {
                abxmVar = abxm.a;
            }
            aboh abohVar = abxmVar.b;
            int i = 0;
            while (true) {
                boolean[] zArr = (boolean[]) this.e.a;
                if (i >= zArr.length) {
                    break;
                }
                if (zArr[i]) {
                    Object obj = ((abxl) abohVar.get(i)).e;
                    int iAz = a.az(((abxl) abohVar.get(i)).c);
                    int i2 = 4;
                    if (iAz != 0 && iAz == 4 && !TextUtils.isEmpty(this.e.b)) {
                        obj = this.e.b;
                    }
                    abnp abnpVarN3 = abyc.a.n();
                    int i3 = ((abxl) abohVar.get(i)).d;
                    abnpVarN3.t();
                    ((abyc) abnpVarN3.b).c = i3;
                    abnpVarN3.t();
                    abyc abycVar = (abyc) abnpVarN3.b;
                    obj.getClass();
                    abycVar.d = (String) obj;
                    int iAz2 = a.az(((abxl) abohVar.get(i)).c);
                    if (iAz2 == 0) {
                        iAz2 = 1;
                    }
                    int i4 = iAz2 - 2;
                    if (i4 == 1) {
                        i2 = 3;
                    } else if (i4 != 2) {
                        i2 = i4 != 3 ? 2 : 5;
                    }
                    abnpVarN3.t();
                    ((abyc) abnpVarN3.b).b = aclh.c(i2);
                    abnpVarN2.am((abyc) abnpVarN3.q());
                    this.d.a();
                }
                int i5 = this.a.e;
                abnpVarN.t();
                ((abye) abnpVarN.b).d = i5;
                abxz abxzVar = (abxz) abnpVarN2.q();
                abnpVarN.t();
                abye abyeVar = (abye) abnpVarN.b;
                abxzVar.getClass();
                abyeVar.c = abxzVar;
                abyeVar.b = 3;
                i++;
            }
        }
        return (abye) abnpVarN.q();
    }

    @Override // defpackage.wii
    public final void d() {
        if (this.k != null) {
            int i = 0;
            while (i < this.k.getChildCount()) {
                View childAt = this.k.getChildAt(i);
                childAt.setAlpha(BitmapDescriptorFactory.HUE_RED);
                i++;
                childAt.animate().alpha(1.0f).setDuration(150L).setStartDelay(i * 80);
            }
        }
    }

    @Override // defpackage.wjm, defpackage.wii
    public final void e() {
        super.e();
        this.d.b();
        wjy wjyVarB = b();
        if (wjyVarB != null) {
            wjyVarB.f(i(), this);
        }
    }

    @Override // defpackage.wjm
    public final View g() {
        this.k = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.survey_scrollable_answer_content_container, (ViewGroup) null).findViewById(R.id.survey_answers_container);
        wio wioVar = new wio(getContext());
        wioVar.c = new wiz(this, 1);
        abyt abytVar = this.a;
        wioVar.a(abytVar.c == 5 ? (abyl) abytVar.d : abyl.a, this.j);
        this.k.addView(wioVar);
        return this.k;
    }

    @Override // defpackage.wjm
    public final String h() {
        boolean zIsEmpty = this.a.g.isEmpty();
        abyt abytVar = this.a;
        return zIsEmpty ? abytVar.f : abytVar.g;
    }

    public final boolean i() {
        aacq aacqVar = this.e;
        if (aacqVar == null) {
            return false;
        }
        return aacqVar.o();
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onActivityCreated */
    public final void m105lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        super.m105lambda$performActivityCreated$8$androidsupportv4appFragment(bundle);
        b().f(i(), this);
    }

    @Override // defpackage.wii, android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle != null) {
            this.d = (QuestionMetrics) bundle.getParcelable("QuestionMetrics");
            this.j = bundle.getBooleanArray("ResponsesAsArray");
        }
        if (this.d == null) {
            this.d = new QuestionMetrics();
        }
        boolean[] zArr = this.j;
        if (zArr == null) {
            abyt abytVar = this.a;
            abxm abxmVar = (abytVar.c == 5 ? (abyl) abytVar.d : abyl.a).c;
            if (abxmVar == null) {
                abxmVar = abxm.a;
            }
            this.j = new boolean[abxmVar.b.size()];
            return;
        }
        abyt abytVar2 = this.a;
        abxm abxmVar2 = (abytVar2.c == 5 ? (abyl) abytVar2.d : abyl.a).c;
        if (abxmVar2 == null) {
            abxmVar2 = abxm.a;
        }
        if (zArr.length != abxmVar2.b.size()) {
            Log.e("SurveyMultiSelectFrag", "Saved instance state responses had incorrect length: " + this.j.length);
            abyt abytVar3 = this.a;
            abxm abxmVar3 = (abytVar3.c == 5 ? (abyl) abytVar3.d : abyl.a).c;
            if (abxmVar3 == null) {
                abxmVar3 = abxm.a;
            }
            this.j = new boolean[abxmVar3.b.size()];
        }
    }

    @Override // defpackage.wjm, android.support.v4.app.Fragment
    /* renamed from: onSaveInstanceState */
    public final void m117x22bc4f96(Bundle bundle) {
        super.m117x22bc4f96(bundle);
        bundle.putParcelable("QuestionMetrics", this.d);
        bundle.putBooleanArray("ResponsesAsArray", this.j);
    }
}
