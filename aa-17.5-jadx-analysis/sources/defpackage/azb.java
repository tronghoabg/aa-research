package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
final class azb {
    public dle b;
    public int c;
    public int d;
    public int f;
    public int g;
    final /* synthetic */ azd h;
    public aza[] a = aze.a;
    public int e = 1;

    public azb(azd azdVar) {
        this.h = azdVar;
    }

    public final void a(axk axkVar, aitx aitxVar, cji cjiVar, int i, int i2, int i3) {
        aza[] azaVarArr;
        aza[] azaVarArr2 = this.a;
        int length = azaVarArr2.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                this.f = i;
                this.g = i2;
                break;
            } else {
                aza azaVar = azaVarArr2[i4];
                if (azaVar != null && azaVar.f) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        List list = axkVar.b;
        int size = list.size();
        int length2 = this.a.length;
        while (true) {
            azaVarArr = this.a;
            if (size >= length2) {
                break;
            }
            aza azaVar2 = azaVarArr[size];
            if (azaVar2 != null) {
                azaVar2.c();
            }
            size++;
        }
        if (azaVarArr.length != list.size()) {
            Object[] objArrCopyOf = Arrays.copyOf(this.a, list.size());
            objArrCopyOf.getClass();
            this.a = (aza[]) objArrCopyOf;
        }
        this.b = new dle(axkVar.g);
        this.c = i3;
        this.d = 0;
        this.e = 1;
        int size2 = list.size();
        azd azdVar = this.h;
        for (int i5 = 0; i5 < size2; i5++) {
            Object objG = ((cuo) list.get(i5)).g();
            ayo ayoVar = objG instanceof ayo ? (ayo) objG : null;
            aza[] azaVarArr3 = this.a;
            if (ayoVar == null) {
                aza azaVar3 = azaVarArr3[i5];
                if (azaVar3 != null) {
                    azaVar3.c();
                }
                this.a[i5] = null;
            } else {
                aza azaVar4 = azaVarArr3[i5];
                if (azaVar4 == null) {
                    azaVar4 = new aza(aitxVar, cjiVar, new alg(azdVar, 17));
                    this.a[i5] = azaVar4;
                }
                azaVar4.c = ayoVar.a;
                azaVar4.d = ayoVar.b;
                azaVar4.e = ayoVar.c;
            }
        }
    }
}
