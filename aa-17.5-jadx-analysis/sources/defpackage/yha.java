package defpackage;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class yha extends ygp {
    private final Comparator e;

    public yha(Comparator comparator) {
        comparator.getClass();
        this.e = comparator;
    }

    @Override // defpackage.ygp, defpackage.yfe, defpackage.yff
    public final /* synthetic */ void c(Object obj) {
        super.c(obj);
    }

    @Override // defpackage.ygp
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final yhc g() {
        yhc yhcVarW = yhc.w(this.e, this.b, this.a);
        this.b = yhcVarW.size();
        this.c = true;
        return yhcVarW;
    }

    public final void n(Object obj) {
        super.c(obj);
    }

    public final void o(Object... objArr) {
        super.j(objArr);
    }
}
