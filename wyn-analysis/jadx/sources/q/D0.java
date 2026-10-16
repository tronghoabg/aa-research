package q;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
public final class D0 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43622b;

    public /* synthetic */ D0(Object obj, int i5) {
        this.f43621a = i5;
        this.f43622b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f43621a) {
            case 0:
                F0 f02 = (F0) this.f43622b;
                if (f02.f43651z.isShowing()) {
                    f02.show();
                    break;
                }
                break;
            default:
                b1 b1Var = (b1) this.f43622b;
                b1Var.f43964a = true;
                b1Var.notifyDataSetChanged();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f43621a) {
            case 0:
                ((F0) this.f43622b).dismiss();
                break;
            default:
                b1 b1Var = (b1) this.f43622b;
                b1Var.f43964a = false;
                b1Var.notifyDataSetInvalidated();
                break;
        }
    }
}
