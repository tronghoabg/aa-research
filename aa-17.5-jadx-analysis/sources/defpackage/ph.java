package defpackage;

import android.content.Intent;
import androidx.activity.result.ActivityResult;

/* loaded from: classes.dex */
public final class ph extends pf {
    @Override // defpackage.pf
    public final /* synthetic */ Object a(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }

    @Override // defpackage.pf
    public final /* bridge */ /* synthetic */ Intent b(Object obj) {
        Intent intent = (Intent) obj;
        intent.getClass();
        return intent;
    }
}
