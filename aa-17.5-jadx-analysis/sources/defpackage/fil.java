package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class fil implements fik {
    public final fit b;

    public /* synthetic */ fil() {
        this.b = Build.VERSION.SDK_INT >= 34 ? fiu.b : fiu.a;
        new ArrayList(new afay(new Integer[]{1, 2, 4, 8, 16, 32, 64, 128}, true));
    }

    @Override // defpackage.fik
    public final fii a(Context context) {
        return (Build.VERSION.SDK_INT >= 34 ? fiw.a : Build.VERSION.SDK_INT >= 30 ? fiw.b : fiw.c).a(context, this.b);
    }
}
