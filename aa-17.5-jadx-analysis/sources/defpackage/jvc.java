package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes2.dex */
public final class jvc extends FrameLayout implements gfh {
    public final geu a;
    public final gfy b;
    private final kmj c;
    private final bwq d;

    public jvc(geu geuVar) {
        super(geuVar, null, 0);
        this.a = geuVar;
        this.b = new gfy(null, geuVar);
        Context context = getContext();
        context.getClass();
        kmj kmjVar = new kmj(context);
        this.c = kmjVar;
        this.d = new ParcelableSnapshotMutableState(new jvb(0, 0, 0, 0), bxp.c);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(kmjVar);
        kmjVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        kmjVar.a(new cct(-1167077897, true, new juy(this, 3)));
    }

    @Override // defpackage.gfh
    /* renamed from: b */
    public final gfy getA() {
        return this.b;
    }

    @Override // defpackage.gfh
    public final /* synthetic */ void c() {
        fwl.j(this);
    }

    @Override // defpackage.gfh
    public final /* synthetic */ void d(hju hjuVar, String str) {
        fwl.k(this, hjuVar, str);
    }

    @Override // defpackage.gfh
    public final /* synthetic */ void e(gzc gzcVar) {
        fwl.l(this, gzcVar);
    }

    public final jvb f() {
        return (jvb) this.d.a();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.d.b(new jvb(i, i2, i3, i4));
    }

    @Override // defpackage.gfh
    public final View a() {
        return this;
    }
}
