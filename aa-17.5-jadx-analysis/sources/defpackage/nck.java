package defpackage;

import android.content.ComponentName;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final /* synthetic */ class nck implements afec {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ nck(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int i = this.e;
        if (i == 0) {
            ComponentName componentName = (ComponentName) obj;
            Object obj2 = this.d;
            ncp.d((eqj) this.a, (eqj) this.b, (eqj) this.c, (ncp) obj2, componentName, null, 0, 96);
            return afak.a;
        }
        if (i == 1) {
            ComponentName componentName2 = (ComponentName) obj;
            Object obj3 = this.d;
            ((View) this.a).setOnClickListener(new jmq(componentName2, obj3, 11));
            ((View) this.b).setOnClickListener(new jmq(componentName2, obj3, 12));
            ((TextView) this.c).setEnabled(componentName2 != null);
            return afak.a;
        }
        if (i == 2) {
            ncg ncgVar = (ncg) obj;
            Object obj4 = this.d;
            ncp.d((eqj) this.a, (eqj) this.b, (eqj) this.c, (ncp) obj4, null, ncgVar, 0, 80);
            return afak.a;
        }
        Integer num = (Integer) obj;
        num.getClass();
        int iIntValue = num.intValue();
        Object obj5 = this.d;
        ncp.d((eqj) this.a, (eqj) this.b, (eqj) this.c, (ncp) obj5, null, null, iIntValue, 48);
        return afak.a;
    }
}
