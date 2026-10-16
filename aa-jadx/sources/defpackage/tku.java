package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tku extends defpackage.tkr {
    private static final defpackage.ypg b = defpackage.ypg.c("com/google/android/libraries/auto/template/icons/ErrorIconFactory");
    private final androidx.core.graphics.drawable.IconCompat c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tku(androidx.core.graphics.drawable.IconCompat iconCompat, defpackage.tkv tkvVar) {
        super(tkvVar);
        iconCompat.getClass();
        tkvVar.getClass();
        this.c = iconCompat;
    }

    @Override // defpackage.tkv
    public final androidx.core.graphics.drawable.IconCompat b(java.lang.Object obj) {
        try {
            return this.a.b(obj);
        } catch (java.lang.Exception e) {
            ((defpackage.ype) ((defpackage.ype) b.h()).p(e).ai(9103)).y("Failed to load icon %s", obj);
            return this.c;
        }
    }
}
