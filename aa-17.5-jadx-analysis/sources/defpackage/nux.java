package defpackage;

import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public enum nux implements nma {
    FIRST_RUN(R.string.notification_education_tooltip_first_run, acxy.H(), acai.f, yzz.USER_EDUCATION_NOTIFICATION_FIRST_RUN),
    NEW_NOTIFICATION(R.string.notification_education_tooltip_new, false, acai.g, yzz.USER_EDUCATION_NOTIFICATION_NEW_NOTIFICATION),
    NEW_NOTIFICATION_NTH_RUN(R.string.notification_education_tooltip_new, acxy.J(), acai.h, yzz.USER_EDUCATION_NOTIFICATION_NEW_NOTIFICATION);

    private final odd e;

    nux(int i, boolean z, acai acaiVar, yzz yzzVar) {
        this.e = new odd(i, 0, z, acaiVar, yzzVar);
    }

    @Override // defpackage.nma
    public final nlz a() {
        return nlz.b;
    }

    @Override // defpackage.nge
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        return this.e.a((oco) obj, this);
    }

    @Override // defpackage.nge
    public final String c() {
        return "notification";
    }

    @Override // defpackage.nge
    public final String d() {
        return name();
    }
}
