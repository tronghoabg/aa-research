package defpackage;

import android.content.Context;
import com.google.android.projection.gearhead.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class kry implements krv {
    public static final kry a;
    public static final kry b;
    private static final /* synthetic */ kry[] d;
    public final krt c;
    private final int e;

    static {
        kry kryVar = new kry("DEFAULT", 0, R.style.ThemeOverlay_Palette_Default, new krt(abzz.b(3768063), abzz.b(2591686), abzz.b(1935675), abzz.b(7829367), abzz.b(7698550)));
        a = kryVar;
        kry kryVar2 = new kry("GREEN", 1, R.style.ThemeOverlay_Palette_Green, krn.a(5227083));
        b = kryVar2;
        kry[] kryVarArr = {kryVar, kryVar2};
        d = kryVarArr;
        affa.p(kryVarArr);
    }

    private kry(String str, int i, int i2, krt krtVar) {
        this.e = i2;
        this.c = krtVar;
    }

    public static kry valueOf(String str) {
        return (kry) Enum.valueOf(kry.class, str);
    }

    public static kry[] values() {
        return (kry[]) d.clone();
    }

    @Override // defpackage.krv
    public final Context a(Context context) {
        Context baseContext;
        krw krwVar = context instanceof krw ? (krw) context : null;
        if (krwVar != null && (baseContext = krwVar.getBaseContext()) != null) {
            context = baseContext;
        }
        return new krw(context, this.e);
    }

    @Override // defpackage.krv
    public final krt b() {
        return this.c;
    }

    @Override // defpackage.krv
    public final void d(Context context) {
        context.getTheme().applyStyle(this.e, true);
    }

    @Override // defpackage.krv
    public final void c() {
    }
}
