package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;

/* loaded from: classes2.dex */
public final class ftk implements fto {
    private final Context a;

    public ftk(Context context) {
        this.a = context;
    }

    @Override // defpackage.fto
    public final Object eY(afck afckVar) {
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        fti ftiVar = new fti(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new ftn(ftiVar, ftiVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ftk) && affa.f(this.a, ((ftk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
