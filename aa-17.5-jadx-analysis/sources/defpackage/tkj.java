package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
final /* synthetic */ class tkj implements ter, afev {
    public static final tkj a = new tkj();

    @Override // defpackage.ter
    public final /* synthetic */ Object b(Context context) {
        return new tkm(context);
    }

    @Override // defpackage.afev
    public final aezn eV() {
        return new afey(1, tkm.class, "<init>", "<init>(Landroid/content/Context;)V", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ter) && (obj instanceof afev)) {
            return affa.f(new afey(1, tkm.class, "<init>", "<init>(Landroid/content/Context;)V", 0), ((afev) obj).eV());
        }
        return false;
    }

    public final int hashCode() {
        return new afey(1, tkm.class, "<init>", "<init>(Landroid/content/Context;)V", 0).hashCode();
    }
}
