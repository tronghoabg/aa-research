package defpackage;

import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public enum mqy implements nma {
    FIRST_RUN(R.string.applauncher_education_first_run, false, acai.d, yzz.USER_EDUCATION_LAUNCHER_FIRST_RUN),
    NTH_RUN(R.string.applauncher_education_nth_run, acxy.F(), acai.e, yzz.USER_EDUCATION_LAUNCHER_NTH_RUN);

    private final odd d;

    mqy(int i, boolean z, acai acaiVar, yzz yzzVar) {
        this.d = new odd(i, 0, z, acaiVar, yzzVar);
    }

    @Override // defpackage.nma
    public final nlz a() {
        return nlz.a;
    }

    @Override // defpackage.nge
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        return this.d.a((oco) obj, this);
    }

    @Override // defpackage.nge
    public final String c() {
        return "launcher";
    }

    @Override // defpackage.nge
    public final String d() {
        return name();
    }
}
