package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.auto.components.apphost.telecom.dialpad.MaterialStandardDialpadView;
import com.google.android.apps.auto.components.apphost.telecom.dialpad.StandardDialpadView;

/* loaded from: classes2.dex */
public final /* synthetic */ class jzx implements View.OnLongClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jzx(LinearLayout linearLayout, odj odjVar, int i) {
        this.c = i;
        this.a = linearLayout;
        this.b = odjVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, odj] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, odj] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, odj] */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.c;
        if (i == 0) {
            ((StandardDialpadView) this.a).f();
            ohs ohsVarJ = ebf.j();
            yxy yxyVar = yxy.GEARHEAD;
            yzz yzzVar = yzz.PHONE_DIALPAD;
            ohsVarJ.F(rrc.h(yxyVar, yzzVar, yzy.Q).l());
            ebf.j().F(rrc.h(yxyVar, yzzVar, yzy.P).l());
            this.b.q();
            return true;
        }
        if (i == 1) {
            ((MaterialStandardDialpadView) this.a).g();
            ohs ohsVarJ2 = ebf.j();
            yxy yxyVar2 = yxy.GEARHEAD;
            yzz yzzVar2 = yzz.PHONE_DIALPAD;
            ohsVarJ2.F(rrc.h(yxyVar2, yzzVar2, yzy.Q).l());
            ebf.j().F(rrc.h(yxyVar2, yzzVar2, yzy.P).l());
            this.b.q();
            return true;
        }
        if (i != 2) {
            ((zwz) this.b).h((zwv) this.a);
            return true;
        }
        ((com.google.android.apps.auto.components.telecom.dialpad.StandardDialpadView) this.b).d();
        ohs ohsVarJ3 = ebf.j();
        yxy yxyVar3 = yxy.GEARHEAD;
        yzz yzzVar3 = yzz.PHONE_DIALPAD;
        ohsVarJ3.F(rrc.h(yxyVar3, yzzVar3, yzy.Q).l());
        ebf.j().F(rrc.h(yxyVar3, yzzVar3, yzy.P).l());
        this.a.q();
        return true;
    }

    public /* synthetic */ jzx(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
