package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class dmt implements bvn {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public dmt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [bva, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [afec, java.lang.Object] */
    @Override // defpackage.bvn
    public final void a() {
        int i = this.b;
        if (i == 0) {
            dnm dnmVar = (dnm) this.a;
            dnmVar.dismiss();
            dnmVar.c.e();
            return;
        }
        if (i == 1) {
            this.a.d();
            return;
        }
        if (i != 2) {
            ?? r2 = this.a;
            if (i != 3) {
                r2.invoke(false);
                return;
            } else {
                ((hmx) r2).i.invoke();
                return;
            }
        }
        Object obj = this.a;
        ((czd) obj).e();
        View view = (View) obj;
        ecw.e(view, null);
        ((dnq) obj).b.removeViewImmediate(view);
    }
}
