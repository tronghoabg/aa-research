package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes3.dex */
public final class uve implements uvo {
    private static final yob c = yob.c("com/google/android/libraries/geo/mapcore/renderer/LayeredRenderBin");
    public final Comparator a;
    public final uvz[] b;
    private final uvd d;

    public uve(int i, uvd uvdVar, Comparator comparator) {
        this.d = uvdVar;
        this.a = comparator;
        if (i <= 0) {
            ((ynz) c.a(uys.a).ai(9676)).w("Invalid numBins: %d", 0);
            this.b = new uvz[0];
        } else {
            this.b = new uvz[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.b[i2] = new uvz(comparator);
            }
        }
    }

    private final uvz i(uth uthVar) {
        uvz[] uvzVarArr = this.b;
        int length = uvzVarArr.length;
        if (length == 1) {
            return uvzVarArr[0];
        }
        int iA = this.d.a(uthVar);
        if (iA < length && iA >= 0) {
            return uvzVarArr[iA];
        }
        ((ynz) c.a(uys.a).ai(9677)).B("layerIndex is: %d , while numBins is: %d", iA, length);
        return uvzVarArr[0];
    }

    @Override // defpackage.uvo
    public final int a() {
        int i = 0;
        int iA = 0;
        while (true) {
            uvz[] uvzVarArr = this.b;
            if (i >= uvzVarArr.length) {
                return iA;
            }
            iA += uvzVarArr[i].a();
            i++;
        }
    }

    @Override // defpackage.uvo
    @ResultIgnorabilityUnspecified
    public final List b(uud uudVar) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            uvz[] uvzVarArr = this.b;
            if (i >= uvzVarArr.length) {
                return arrayList;
            }
            arrayList.addAll(uvzVarArr[i].b(uudVar));
            i++;
        }
    }

    @Override // defpackage.uvo
    public final void c(uth uthVar) {
        i(uthVar).c(uthVar);
    }

    public final void d(usy usyVar) {
        int i = 0;
        while (true) {
            uvz[] uvzVarArr = this.b;
            int length = uvzVarArr.length;
            if (i >= length) {
                String[] strArr = vaq.a;
                fdi.a("drawnSortedRenderBins", length);
                return;
            } else {
                uvzVarArr[i].d(usyVar);
                i++;
            }
        }
    }

    @Override // defpackage.uvo
    public final void e(uth uthVar) {
        if (this.a != null) {
            i(uthVar).i();
        }
    }

    @Override // defpackage.uvo
    public final void f() {
        int i = 0;
        while (true) {
            uvz[] uvzVarArr = this.b;
            if (i >= uvzVarArr.length) {
                return;
            }
            uvzVarArr[i].f();
            i++;
        }
    }

    @Override // defpackage.uvo
    public final void g(long j) {
        for (uvz uvzVar : this.b) {
            uvzVar.g(j);
        }
    }

    @Override // defpackage.uvo
    @ResultIgnorabilityUnspecified
    public final boolean h(uth uthVar) {
        return i(uthVar).h(uthVar);
    }
}
