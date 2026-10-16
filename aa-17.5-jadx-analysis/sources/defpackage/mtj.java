package defpackage;

import android.support.v4.app.Fragment;
import android.view.View;

/* loaded from: classes2.dex */
public final class mtj implements afec {
    final /* synthetic */ int a;

    public mtj(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Fragment fragment = (Fragment) obj;
        fragment.getClass();
        if (fragment instanceof jvm) {
            jvm jvmVar = (jvm) fragment;
            int i = this.a;
            if (jvmVar.w != i) {
                jvmVar.w = i;
                View view = jvmVar.getView();
                if (view != null) {
                    view.requestApplyInsets();
                }
            }
        }
        return afak.a;
    }
}
