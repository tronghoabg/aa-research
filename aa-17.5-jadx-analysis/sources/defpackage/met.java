package defpackage;

import android.content.ComponentName;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class met extends jrw {
    @Override // defpackage.jrw
    protected final mqb a(Intent intent) {
        ComponentName componentName = mkn.d;
        componentName.getClass();
        return mpl.b(componentName);
    }

    @Override // defpackage.mov
    protected final boolean d(Intent intent, qql qqlVar) {
        intent.getClass();
        return affa.f(intent.getAction(), "phone.incall.show_in_call");
    }
}
