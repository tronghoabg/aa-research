package defpackage;

import android.view.View;
import com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialRowContainerViewRowImpl;
import com.google.android.apps.auto.components.apphost.view.widgets.common.RowContainerViewRowImpl;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class kdy implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ kdy(hie hieVar, int i, uq uqVar, geu geuVar, int i2) {
        this.e = i2;
        this.b = hieVar;
        this.a = i;
        this.c = uqVar;
        this.d = geuVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hie, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [hie, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, uq] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, uq] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.e;
        if (i == 0) {
            int i2 = RowContainerViewRowImpl.b;
            this.b.a(this.a);
            ?? r6 = this.c;
            if (r6 != 0) {
                geu geuVar = (geu) this.d;
                ghe gheVarD = jtq.d(geuVar);
                if (gheVarD != null) {
                    gheVarD.g(gsn.c);
                }
                gca.e(geuVar, r6);
                return;
            }
            return;
        }
        if (i == 1) {
            int i3 = MaterialRowContainerViewRowImpl.b;
            this.b.a(this.a);
            ?? r62 = this.c;
            if (r62 != 0) {
                geu geuVar2 = (geu) this.d;
                ghe gheVarD2 = jtq.d(geuVar2);
                if (gheVarD2 != null) {
                    gheVarD2.g(gsn.c);
                }
                gca.e(geuVar2, r62);
                return;
            }
            return;
        }
        int i4 = 0;
        while (true) {
            View[] viewArr = (View[]) this.b;
            if (i4 >= viewArr.length) {
                view.postOnAnimationDelayed(new adpy((wjt) this.c, (List) this.d, this.a, 1), 200L);
                return;
            } else {
                View view2 = viewArr[i4];
                view2.setOnClickListener(null);
                view2.setClickable(false);
                i4++;
            }
        }
    }

    public /* synthetic */ kdy(wjt wjtVar, View[] viewArr, List list, int i, int i2) {
        this.e = i2;
        this.c = wjtVar;
        this.b = viewArr;
        this.d = list;
        this.a = i;
    }
}
