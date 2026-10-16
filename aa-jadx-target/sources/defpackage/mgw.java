package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mgw extends defpackage.mgy {
    public static final defpackage.yqm g = defpackage.yqm.c("GH.AuthorizationDialog");
    public boolean h = false;
    public defpackage.mfy i;
    public defpackage.mdp j;
    private android.view.View l;

    public static final boolean h() {
        boolean zEqualsIgnoreCase = "true".equalsIgnoreCase(defpackage.fzj.l("debug.car.skip_frx"));
        ((defpackage.yqj) g.l().ai((char) 4901)).y("shouldAutoAcceptFrx=%b", java.lang.Boolean.valueOf(zEqualsIgnoreCase));
        return zEqualsIgnoreCase;
    }

    @Override // defpackage.mgy, defpackage.ao, android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        i();
        if (this.h) {
            return;
        }
        defpackage.bc bcVar = ((defpackage.mgy) this).k;
        if (bcVar == null || bcVar.isFinishing()) {
            this.i.a(defpackage.zbd.bK);
            ((defpackage.yqj) ((defpackage.yqj) g.f()).ai((char) 4897)).u("Authorization dialog cancelled");
        }
    }

    @Override // android.support.v4.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        int i;
        defpackage.yqm yqmVar = g;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4898)).u("Creating authorization dialog view");
        this.l = layoutInflater.cloneInContext(defpackage.ebo.p(requireContext())).inflate(2131624013, viewGroup);
        requireContext();
        this.j = new defpackage.mdp();
        defpackage.luq.b();
        this.i = new defpackage.mfz(defpackage.zbe.PREFLIGHT_AUTHORIZATION_DIALOG);
        if (this.l == null) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4904)).u("Null root view, ending early.");
        } else {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4902)).u("showTosAndAuthorizationView");
            this.i.b(this);
            android.widget.TextView textView = (android.widget.TextView) this.l.findViewById(2131428012);
            if (defpackage.acul.m()) {
                i = defpackage.kwu.b().f() ? 2132084830 : 2132084829;
            } else {
                i = defpackage.kwu.b().f() ? 2132084826 : 2132084825;
            }
            textView.setText(i);
            ((android.widget.TextView) this.l.findViewById(2131428011)).setText(2132084813);
            com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) this.l.findViewById(2131427858);
            if (defpackage.mdp.h()) {
                materialButton.setText(2132084809);
            }
            materialButton.setOnClickListener(new defpackage.ker(this, 15));
            this.l.findViewById(2131428793).setOnClickListener(new defpackage.ker(this, 16));
            this.l.findViewById(2131428162).setOnClickListener(new defpackage.ker(this, 17));
            defpackage.mfw mfwVar = ((defpackage.mfx) defpackage.luq.b().a()).c;
            mfwVar.getClass();
            com.google.android.gms.carsetup.CarInfoInternal carInfoInternal = mfwVar.e;
            if (carInfoInternal != null) {
                java.lang.String strA = defpackage.mhj.a(carInfoInternal.a);
                if (!strA.isEmpty()) {
                    this.l.findViewById(2131428014).setVisibility(0);
                    ((android.widget.TextView) this.l.findViewById(2131428014)).setText(requireContext().getString(2132084827, strA));
                }
            }
            if (h()) {
                materialButton.performClick();
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4903)).u("FRX is automatically accepted under test harness mode.");
            }
        }
        if (defpackage.acwj.z()) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4899)).u("Broadcasting AUTHORIZATION_DIALOG_SHOWN");
            ((defpackage.mfx) defpackage.luq.b().a()).b.a(defpackage.mgt.k);
        }
        return this.l;
    }

    @Override // defpackage.ao, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.h) {
            return;
        }
        defpackage.bc bcVar = ((defpackage.mgy) this).k;
        if (bcVar == null || bcVar.isFinishing()) {
            this.i.a(defpackage.zbd.bL);
            ((defpackage.yqj) ((defpackage.yqj) g.f()).ai((char) 4900)).u("Authorization dialog dismissed");
        }
    }
}
