package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class kmb extends czd implements rae, mnd {
    private final yph a;
    private final Set b;
    private final fbf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.a = new yph(yqn.d("AbsCarComposeView"));
        this.b = new LinkedHashSet();
        this.c = new fbf((byte[]) null);
    }

    @Override // defpackage.czd
    public final void b(bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(2120159843);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 3;
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(kmc.c.b(this.c));
            arrayList.add(kmc.b.b(this.b));
            affx.a(w(), arrayList);
            czz.an((bxe[]) arrayList.toArray(new bxe[arrayList.size()]), bxc.i(-659601629, true, new cuz(this, 8), buxVarC), buxVarC, 48);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kda(this, i, i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        int iDiff = getContext().getResources().getConfiguration().diff(configuration);
        int i = iDiff & (-617);
        yph yphVar = this.a;
        if (i == 0) {
            yphVar.l().K("Ignored config change %s, %d", configuration, iDiff);
            return;
        }
        yphVar.l().y("newConfig: %s", configuration);
        yphVar.l().y("currentConfig: %s", getContext().getResources().getConfiguration());
        super.dispatchConfigurationChanged(getContext().getResources().getConfiguration());
    }

    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        printWriter.getClass();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((mnd) it.next()).h(printWriter);
        }
    }

    public abstract void q(bux buxVar, int i);

    @Override // defpackage.rae
    public /* synthetic */ boolean r(View view, MotionEvent motionEvent) {
        return view.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // defpackage.rae
    public /* synthetic */ boolean s(View view, int i, Rect rect) {
        throw null;
    }

    @Override // defpackage.rae
    public /* synthetic */ boolean t(View view) {
        return view.requestFocusFromTouch();
    }

    @Override // defpackage.rae
    public /* synthetic */ boolean u(View view) {
        throw null;
    }

    @Override // defpackage.rae
    public boolean v(View view, int i, boolean z) {
        view.getClass();
        this.c.g(z);
        return false;
    }

    protected bxe[] w() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bwq, java.lang.Object] */
    @Override // defpackage.rae
    public final void x(boolean z) {
        fbf fbfVar = this.c;
        fbfVar.a.b(Boolean.valueOf(z));
        if (z) {
            return;
        }
        fbfVar.g(false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kmb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kmb(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ kmb(Context context, AttributeSet attributeSet, int i, int i2, afeu afeuVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
