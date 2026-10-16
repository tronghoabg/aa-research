package defpackage;

import android.graphics.drawable.Icon;
import android.telecom.PhoneAccount;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.TemplateWrapper;
import androidx.core.graphics.drawable.IconCompat;
import com.android.car.libraries.apphost.internal.model.GoogleListTemplate;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class juk {
    public static final yph a = yph.c("CarApp.H.Comms");
    public geu b;
    public ViewGroup c;
    public int d;
    public ofe e;
    private hlo f;
    private final ajmd g = new ajmd(this);

    private final void d() {
        hlo hloVar = this.f;
        if (hloVar != null) {
            hloVar.A();
            this.f.n();
            this.f.b();
            this.f = null;
        }
    }

    public final void a() {
        if (this.e != null) {
            this.e = null;
            off offVarA = off.a();
            if (offVarA.c == null) {
                ((ype) ((ype) off.a.h()).ai((char) 5830)).u("Attempting to unregister call account disambiguation info removed listener when none exists");
            }
            offVarA.c = null;
        }
        d();
        this.c.removeAllViews();
    }

    public final void b() {
        ofe ofeVar = this.e;
        if (ofeVar != null) {
            ((ype) ((ype) a.f()).ai((char) 2768)).u("Closing call due to dismissed phone account selection");
            ebf.A().y(ofeVar.a.a);
        }
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(ofe ofeVar) {
        this.e = ofeVar;
        off offVarA = off.a();
        ajmd ajmdVar = this.g;
        if (ajmdVar != null) {
            ((ype) ((ype) off.a.h()).ai((char) 5829)).u("Registering call account disambiguation info removed listener when one already exists.");
        }
        offVarA.c = ajmdVar;
        d();
        jui juiVar = new jui(this, this.b);
        gmm gmmVar = new gmm();
        ua uaVar = new ua();
        uaVar.c(Action.BACK);
        uaVar.e(this.b.getString(R.string.choose_sim_prompt));
        gmmVar.e = uaVar.a();
        ug ugVar = new ug();
        ofe ofeVar2 = this.e;
        ofeVar2.getClass();
        yfq yfqVar = ofeVar2.b;
        int size = yfqVar.size();
        for (int i = 0; i < size; i++) {
            PhoneAccount phoneAccount = (PhoneAccount) yfqVar.get(i);
            vf vfVar = new vf();
            vfVar.i(phoneAccount.getLabel());
            geu geuVar = this.b;
            String strR = null;
            if (phoneAccount.getAddress() != null) {
                String schemeSpecificPart = phoneAccount.getAddress().getSchemeSpecificPart();
                if (!TextUtils.isEmpty(schemeSpecificPart)) {
                    strR = odn.a().r(geuVar, schemeSpecificPart);
                }
            }
            if (strR != null) {
                vfVar.d(strR);
            }
            Icon icon = phoneAccount.getIcon();
            if (icon != null) {
                IconCompat iconCompatI = IconCompat.i(this.b, icon);
                leh.a();
                iconCompatI.p(this.d);
                vfVar.e(new CarIcon(new tj(iconCompatI)), 1);
            }
            vfVar.g(new jsu(this, phoneAccount, 2));
            ugVar.b(vfVar.a());
        }
        gmmVar.b = ugVar.a();
        gmmVar.c.clear();
        hlo hloVarA = hlq.a.a(juiVar, hmh.a.b(this.b, TemplateWrapper.wrap(new GoogleListTemplate(gmmVar))));
        hloVarA.getClass();
        this.f = hloVarA;
        hloVarA.F();
        hloVarA.c();
        hloVarA.B();
        hloVarA.e().requestFocus();
        this.c.removeAllViews();
        ViewGroup viewGroup = this.c;
        View viewE = hloVarA.e();
        viewE.getClass();
        viewGroup.addView(viewE);
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.PHONE_FACET, yzy.aE).l());
    }
}
