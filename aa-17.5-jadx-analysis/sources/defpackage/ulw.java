package defpackage;

import android.opengl.GLES20;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ulw extends umb {
    private final uwm[] A;
    private List B;
    private boolean C;
    private List D;
    public ush a;
    public int b;
    public boolean c;
    private final Object y;
    private final Set z;

    public ulw(utf utfVar, ute uteVar) {
        super(utfVar, uteVar);
        this.y = new Object();
        this.z = new HashSet();
        this.A = new uwm[8];
        this.B = new ArrayList();
        this.D = new ArrayList();
        this.c = false;
    }

    private final void q(uwm uwmVar) throws IOException {
        if (uwmVar == null || this.l == null) {
            return;
        }
        Set set = this.z;
        if (set.contains(uwmVar)) {
            return;
        }
        uwmVar.b(this.l);
        set.add(uwmVar);
    }

    @Override // defpackage.umb, defpackage.utj, defpackage.uth
    public final void H(uth uthVar, uth uthVar2, usy usyVar) {
        if (this.l != null) {
            GLES20.glEnable(2884);
            GLES20.glCullFace(1029);
            synchronized (this.y) {
                int size = this.D.size();
                this.b = 0;
                while (this.b < size) {
                    super.H(uthVar, uthVar2, usyVar);
                    this.b++;
                }
            }
            GLES20.glDisable(2884);
        }
    }

    public final ulv c() {
        return (ulv) this.D.get(this.b);
    }

    @Override // defpackage.utj, defpackage.uth
    @ResultIgnorabilityUnspecified
    public final uwm d(int i) throws IOException {
        uud uudVar;
        uwc uwcVarD = null;
        if (i >= 0 && i < 8) {
            uwm uwmVar = this.A[i];
            if (uwmVar != null) {
                q(uwmVar);
                return uwmVar;
            }
            if (!this.D.isEmpty()) {
                usf usfVar = ((ulv) this.D.get(this.b)).a[i];
                ush ushVar = this.a;
                uwc uwcVarM = (ushVar == null || usfVar == null || usfVar.a()) ? null : ushVar.m(usfVar);
                if (uwcVarM == null && (uudVar = this.l) != null) {
                    if (i == 1 || i == 2) {
                        uwcVarD = uudVar.d(R.drawable.client_injected_default_cap);
                    } else if (i == 3) {
                        uwcVarD = uudVar.d(R.drawable.white_pixel);
                    }
                    uwcVarM = uwcVarD;
                }
                q(uwcVarM);
                return uwcVarM;
            }
        }
        return null;
    }

    @Override // defpackage.utj, defpackage.uth
    public final void e(boolean z) {
        super.e(z);
        Set set = this.z;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((uwm) it.next()).c(z);
        }
        set.clear();
    }

    public final void f(float f) {
        int i;
        Iterator it = this.B.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            ujf ujfVarG = ((ukf) it.next()).g((int) f);
            iMax = Math.max(iMax, (this.C ? ujfVarG.n : ujfVarG.o).length);
        }
        ArrayList arrayList = new ArrayList(iMax);
        int size = this.B.size();
        for (int i2 = 0; i2 < iMax && i2 < 4; i2++) {
            ulv ulvVar = new ulv();
            arrayList.add(ulvVar);
            uke ukeVar = null;
            for (int i3 = 0; i3 < size && i3 < 8; i3++) {
                ujf ujfVarG2 = ((ukf) this.B.get(i3)).g((int) f);
                uke[] ukeVarArr = this.C ? ujfVarG2.n : ujfVarG2.o;
                int length = ukeVarArr.length;
                if (length > 0 && i2 < length) {
                    uke ukeVar2 = ukeVarArr[i2];
                    float[] fArr = ulvVar.b;
                    float f2 = ukeVar2.d;
                    fArr[i3] = f2;
                    if (f2 != BitmapDescriptorFactory.HUE_RED) {
                        ukeVar = ukeVar2;
                    }
                }
            }
            if (ukeVar != null) {
                int i4 = ukeVar.g;
                while (true) {
                    i = ukeVar.f;
                    if (i / i4 <= 64) {
                        break;
                    } else {
                        i4 += i4;
                    }
                }
                ulvVar.d = i4;
                ulvVar.c = i == 0 ? 1.0f : i;
                usf usfVar = ukeVar.j;
                usf usfVar2 = ukeVar.k;
                usf usfVar3 = ukeVar.i;
                usf[] usfVarArr = ulvVar.a;
                usfVarArr[1] = usfVar;
                usfVarArr[2] = usfVar2;
                usfVarArr[3] = usfVar3;
                ulvVar.e = ukeVar.b;
                ulvVar.f = ukeVar.c;
            }
        }
        synchronized (this.y) {
            this.D = arrayList;
        }
    }

    public final void g(List list, boolean z) {
        this.B = list;
        this.C = z;
        boolean z2 = false;
        if (list.size() == 1) {
            ukf ukfVar = (ukf) list.get(0);
            if (ukfVar.b() == 1) {
                ujf ujfVarD = ukfVar.d();
                uke[] ukeVarArr = this.C ? ujfVarD.n : ujfVarD.o;
                int length = ukeVarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z2 = true;
                        break;
                    }
                    uke ukeVar = ukeVarArr[i];
                    if (ukeVar.d != BitmapDescriptorFactory.HUE_RED && (ukeVar.c() || ukeVar.i != usf.a)) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.c = z2;
    }

    @Override // defpackage.utj
    public final void z(int i, uwm uwmVar) throws IOException {
        if (this.r) {
            uvr uvrVar = uvr.a;
            uwm uwmVar2 = this.A[i];
            if (uwmVar2 == uwmVar) {
                return;
            }
            if (uwmVar2 != null) {
                Set set = this.z;
                if (set.contains(uwmVar2)) {
                    set.remove(uwmVar2);
                    uwmVar2.c(false);
                }
            }
            this.z.add(uwmVar);
            uud uudVar = this.l;
            uudVar.getClass();
            uwmVar.b(uudVar);
        }
        this.A[i] = uwmVar;
    }
}
