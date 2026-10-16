package defpackage;

import com.google.android.projection.gearhead.R;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class mln implements nma {
    private final odd a;

    public mln(boolean z, acai acaiVar, yzz yzzVar) {
        this.a = new odd(R.string.settings_education_tooltip, R.drawable.ic_settings_applauncher, z, acaiVar, yzzVar);
    }

    @Override // defpackage.nma
    public final nlz a() {
        return nlz.a;
    }

    @Override // defpackage.nge
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        return this.a.a((oco) obj, this);
    }

    @Override // defpackage.nge
    public final String c() {
        return "settings";
    }

    @Override // defpackage.nge
    public final String d() {
        return "START_OF_DRIVE_TOOLTIP";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mln) {
            return Objects.equals(this.a, ((mln) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }
}
