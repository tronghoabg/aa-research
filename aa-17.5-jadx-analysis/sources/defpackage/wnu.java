package defpackage;

import android.view.View;

/* loaded from: classes3.dex */
final class wnu extends wop {
    final /* synthetic */ int a;
    final /* synthetic */ woa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnu(woa woaVar, int i, int i2) {
        super(i);
        this.a = i2;
        this.b = woaVar;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    protected final void X(ml mlVar, int[] iArr) {
        int i = this.a;
        woa woaVar = this.b;
        if (i == 0) {
            iArr[0] = woaVar.f.getWidth();
            iArr[1] = woaVar.f.getWidth();
        } else {
            iArr[0] = woaVar.f.getHeight();
            iArr[1] = woaVar.f.getHeight();
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.lz
    public final View fV(int i, me meVar, ml mlVar) {
        return null;
    }
}
