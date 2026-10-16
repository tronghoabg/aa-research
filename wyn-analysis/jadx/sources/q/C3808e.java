package q;

import ac.C1346a;
import android.content.Context;
import android.view.View;
import com.wynauto.wyn.R;
import p.SubMenuC3749D;

/* renamed from: q.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3808e extends p.v {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f43759l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C3816i f43760m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3808e(C3816i c3816i, Context context, p.k kVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, kVar, true);
        this.f43760m = c3816i;
        this.f43111f = 8388613;
        C1346a c1346a = c3816i.f43811w;
        this.f43113h = c1346a;
        p.s sVar = this.f43114i;
        if (sVar != null) {
            sVar.c(c1346a);
        }
    }

    @Override // p.v
    public final void c() {
        switch (this.f43759l) {
            case 0:
                C3816i c3816i = this.f43760m;
                c3816i.f43808t = null;
                c3816i.getClass();
                super.c();
                break;
            default:
                C3816i c3816i2 = this.f43760m;
                p.k kVar = c3816i2.f43792c;
                if (kVar != null) {
                    kVar.c(true);
                }
                c3816i2.f43807s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3808e(C3816i c3816i, Context context, SubMenuC3749D subMenuC3749D, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC3749D, false);
        this.f43760m = c3816i;
        if ((subMenuC3749D.f42979A.f43090x & 32) != 32) {
            View view2 = c3816i.f43798i;
            this.f43110e = view2 == null ? (View) c3816i.f43797h : view2;
        }
        C1346a c1346a = c3816i.f43811w;
        this.f43113h = c1346a;
        p.s sVar = this.f43114i;
        if (sVar != null) {
            sVar.c(c1346a);
        }
    }
}
