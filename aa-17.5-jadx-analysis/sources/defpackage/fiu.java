package defpackage;

import android.content.Context;
import android.view.WindowManager;

/* loaded from: classes2.dex */
public final class fiu implements fit {
    private final /* synthetic */ int c;
    public static final fiu b = new fiu(1);
    public static final fiu a = new fiu(0);

    private fiu(int i) {
        this.c = i;
    }

    @Override // defpackage.fit
    public final float a(Context context) {
        return this.c != 0 ? ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity() : context.getResources().getDisplayMetrics().density;
    }
}
