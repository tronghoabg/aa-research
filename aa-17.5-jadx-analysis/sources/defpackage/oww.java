package defpackage;

import android.view.View;
import androidx.car.app.model.Alert;
import com.google.android.apps.auto.sdk.ui.AutoTunedRecyclerView;

/* loaded from: classes2.dex */
public final class oww extends lg {
    private final AutoTunedRecyclerView c;
    private int d = 0;
    private int e;

    public oww(AutoTunedRecyclerView autoTunedRecyclerView) {
        this.e = 2;
        this.c = autoTunedRecyclerView;
        aclh.r();
        this.e = aclh.r()[2];
    }

    @Override // defpackage.lg, defpackage.mb
    public final int a(lz lzVar, int i, int i2) {
        this.d = i2;
        return super.a(lzVar, i, i2);
    }

    @Override // defpackage.lg, defpackage.mb
    public final View b(lz lzVar) {
        lp lpVar = new lp(lzVar);
        int iAv = lzVar.av();
        View view = null;
        if (iAv == 0 || lzVar.aE() != null) {
            return null;
        }
        int iJ = lpVar.j();
        int i = this.e;
        int i2 = 0;
        if (i == 2) {
            int i3 = this.d;
            if (i3 > 0) {
                while (i2 < iAv) {
                    View viewAD = lzVar.aD(i2);
                    viewAD.getClass();
                    if (lpVar.d(viewAD) >= iJ) {
                        return viewAD;
                    }
                    i2++;
                }
            } else {
                if (i3 >= 0) {
                    return null;
                }
                while (i2 < iAv) {
                    View viewAD2 = lzVar.aD(i2);
                    viewAD2.getClass();
                    if (lpVar.a(viewAD2) > iJ) {
                        return viewAD2;
                    }
                    i2++;
                }
            }
        } else if (i == 1) {
            int i4 = Alert.DURATION_SHOW_INDEFINITELY;
            while (i2 < iAv) {
                View viewAD3 = lzVar.aD(i2);
                viewAD3.getClass();
                int iAbs = Math.abs(lpVar.d(viewAD3) - iJ);
                int i5 = iAbs < i4 ? iAbs : i4;
                if (iAbs < i4) {
                    view = viewAD3;
                }
                i2++;
                i4 = i5;
            }
        }
        return view;
    }

    @Override // defpackage.lg, defpackage.mb
    public final int[] c(lz lzVar, View view) {
        return new int[]{0, new lp(lzVar).d(view)};
    }

    @Override // defpackage.mb
    public final /* bridge */ /* synthetic */ mk d(lz lzVar) {
        return h();
    }

    @Override // defpackage.mb
    protected final /* synthetic */ mk g(lz lzVar) {
        return h();
    }

    protected final owv h() {
        return new owv(this.c.getContext());
    }
}
