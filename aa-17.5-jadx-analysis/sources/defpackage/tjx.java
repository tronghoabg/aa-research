package defpackage;

import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes3.dex */
public final class tjx extends tju {
    private static final yob b = yob.c("com/google/android/libraries/auto/template/icons/ErrorIconFactory");
    private final IconCompat c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjx(IconCompat iconCompat, tjy tjyVar) {
        super(tjyVar);
        iconCompat.getClass();
        tjyVar.getClass();
        this.c = iconCompat;
    }

    @Override // defpackage.tjy
    public final IconCompat b(Object obj) {
        try {
            return this.a.b(obj);
        } catch (Exception e) {
            ((ynz) ((ynz) b.h()).p(e).ai(9078)).y("Failed to load icon %s", obj);
            return this.c;
        }
    }
}
