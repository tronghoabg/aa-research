package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xaa extends defpackage.lw {
    public final android.content.Context a;
    public java.util.List e;
    public boolean f;

    public xaa(android.content.Context context) {
        this.a = context;
    }

    private final int b() {
        return (this.f ? 1 : 0) + 1;
    }

    @Override // defpackage.lw
    public final int a() {
        return this.e.size() + b();
    }

    @Override // defpackage.lw
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            if (this.f) {
                return 1;
            }
            i = 1;
        }
        return ((defpackage.wzt) ((defpackage.wzs) this.e.get(i - b())).d).g;
    }

    @Override // defpackage.lw
    public final /* synthetic */ defpackage.mr f(android.view.ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new defpackage.wzz(this, android.view.LayoutInflater.from(this.a).inflate(com.google.android.projection.gearhead.R.layout.parallax_header, viewGroup, false));
        }
        if (i == 1) {
            return new defpackage.mr(android.view.LayoutInflater.from(this.a).inflate(com.google.android.projection.gearhead.R.layout.connect_banner, viewGroup, false));
        }
        if (i == 2) {
            return new defpackage.wzw(android.view.LayoutInflater.from(this.a).inflate(com.google.android.projection.gearhead.R.layout.companion_app_card_normal, viewGroup, false));
        }
        if (i == 3) {
            return new defpackage.wzv(android.view.LayoutInflater.from(this.a).inflate(com.google.android.projection.gearhead.R.layout.companion_app_card_icon, viewGroup, false));
        }
        if (i == 4) {
            return new defpackage.wzu(android.view.LayoutInflater.from(this.a).inflate(com.google.android.projection.gearhead.R.layout.companion_app_card_background, viewGroup, false));
        }
        if (i != 6) {
            return null;
        }
        return new defpackage.wzx(android.view.LayoutInflater.from(this.a).inflate(com.google.android.projection.gearhead.R.layout.companion_app_card_two_actions, viewGroup, false));
    }

    @Override // defpackage.lw
    public final /* bridge */ /* synthetic */ void n(defpackage.mr mrVar, int i) {
        int iD = d(i);
        if (iD == 0 || iD == 1) {
            return;
        }
        mrVar.D((defpackage.wzs) this.e.get(i - b()));
    }
}
