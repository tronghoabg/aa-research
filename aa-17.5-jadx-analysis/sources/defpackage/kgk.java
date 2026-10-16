package defpackage;

import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public enum kgk implements nma {
    a(yzz.USER_EDUCATION_BUGREPORT);

    private final odd c;

    kgk(yzz yzzVar) {
        this.c = new odd(R.string.long_press_to_request_bugreport_education, 0, z, acaiVar, yzzVar);
    }

    @Override // defpackage.nma
    public final nlz a() {
        return nlz.b;
    }

    @Override // defpackage.nge
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        return this.c.a((oco) obj, this);
    }

    @Override // defpackage.nge
    public final String c() {
        return "longPressToRequestBugreport";
    }

    @Override // defpackage.nge
    public final String d() {
        return name();
    }
}
