package defpackage;

import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public enum ldj implements nma {
    a(yzz.USER_EDUCATION_FEEDBACK);

    private final odd c;

    ldj(yzz yzzVar) {
        this.c = new odd(R.string.long_press_to_send_feedback_education, 0, z, acaiVar, yzzVar);
    }

    @Override // defpackage.nma
    public final nlz a() {
        return nlz.a;
    }

    @Override // defpackage.nge
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        return this.c.a((oco) obj, this);
    }

    @Override // defpackage.nge
    public final String c() {
        return "longPressToSendFeedback";
    }

    @Override // defpackage.nge
    public final String d() {
        return name();
    }
}
