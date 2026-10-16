package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.auto.components.apphost.menu.WrapperMenuView;

/* loaded from: classes2.dex */
public final class jxk extends osq {
    final /* synthetic */ WrapperMenuView a;
    private int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxk(WrapperMenuView wrapperMenuView) {
        super(null);
        this.a = wrapperMenuView;
    }

    @Override // defpackage.osq
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 2) {
            WrapperMenuView wrapperMenuView = this.a;
            int i2 = this.c;
            geu geuVar = wrapperMenuView.d;
            if (geuVar == null) {
                affa.d("templateContext");
                geuVar = null;
            }
            ghe gheVarD = jtq.d(geuVar);
            if (gheVarD != null) {
                if (i2 < 0) {
                    gheVarD.g(gsn.e);
                } else if (i2 > 0) {
                    gheVarD.g(gsn.f);
                }
            }
            this.c = 0;
        }
    }

    @Override // defpackage.osq
    public final void b(RecyclerView recyclerView, int i, int i2) {
        this.c += i2;
    }
}
