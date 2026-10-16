package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class qig implements lbs {
    public static final yph a = yph.c("GH.RatingPromptManager");
    static final long b = 28800000;
    public static final long c = 14400000;
    static final long d = 5184000000L;
    public static final Pattern e = Pattern.compile("^(\\d+\\.\\d+)\\.");
    final ohv f;
    public final Context g;
    public final SharedPreferences h;
    public Boolean i;
    public long j = -1;

    public qig(Context context) {
        context.getClass();
        this.g = context;
        this.h = context.getSharedPreferences("GH.RatingPromptManager", 0);
        this.f = new qif(this);
    }

    @Override // defpackage.lhg
    public final void c() {
        ((ype) a.l().ai((char) 7335)).u("Starting RatingPromptManager.");
        olm.d().d(this.f, Arrays.asList(yxc.UI, yxc.NON_UI));
    }

    @Override // defpackage.lhg
    public final void d() {
        ((ype) a.l().ai((char) 7336)).u("Stopping RatingPromptManager.");
        olm.d().f(this.f);
    }
}
