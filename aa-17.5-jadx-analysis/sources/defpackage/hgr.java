package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.car.app.model.Action;
import androidx.car.app.model.TemplateWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class hgr extends hld {
    public hlo a;
    private String b;
    private final epz c;

    public hgr(geu geuVar, TemplateWrapper templateWrapper, gzc gzcVar) {
        super(geuVar, templateWrapper, gzcVar);
        qy qyVar = new qy(this, 3);
        this.c = qyVar;
        this.j.c(qyVar);
    }

    @Override // defpackage.hlf
    protected final View a() {
        return r().getVisibility() == 0 ? r() : u();
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void b() {
        super.b();
        this.j.d(this.c);
        this.a = null;
        this.b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0128  */
    @Override // defpackage.hlf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hgr.d():void");
    }

    @Override // defpackage.hld
    public final void fa(Rect rect, Rect rect2) {
        hlo hloVar = this.a;
        hld hldVar = hloVar instanceof hld ? (hld) hloVar : null;
        if (hldVar == null) {
            return;
        }
        Rect rect3 = new Rect(rect);
        rect3.top = 0;
        Rect rect4 = new Rect(rect2);
        rect4.top = 0;
        hldVar.fa(rect3, rect4);
        rect.top = rect.top + rect3.top + r().getTop();
        rect2.top = rect2.top + rect3.top + r().getTop();
        rect.right = rect3.right;
        rect2.right = rect4.right;
        rect.left = rect3.left;
        rect2.left = rect3.left;
    }

    protected abstract View r();

    public abstract View s();

    protected abstract View t();

    public abstract View u();

    protected abstract void v(View view);

    protected abstract void w(Action action);

    protected abstract void x(List list, String str, vu vuVar);
}
