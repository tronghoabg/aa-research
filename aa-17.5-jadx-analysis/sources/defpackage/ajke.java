package defpackage;

import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class ajke {
    public final ajjm a;
    public final ajid b;
    public final scz c;
    private final List d;
    private final int e;
    private int f;

    public ajke(ajjm ajjmVar, List list, int i, scz sczVar, ajid ajidVar) {
        this.a = ajjmVar;
        this.d = list;
        this.e = i;
        this.c = sczVar;
        this.b = ajidVar;
    }

    public static /* synthetic */ ajke b(ajke ajkeVar, int i, scz sczVar, ajid ajidVar, int i2) {
        if ((i2 & 1) != 0) {
            i = ajkeVar.e;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            sczVar = ajkeVar.c;
        }
        scz sczVar2 = sczVar;
        if ((i2 & 4) != 0) {
            ajidVar = ajkeVar.b;
        }
        ajid ajidVar2 = ajidVar;
        ajidVar2.getClass();
        return new ajke(ajkeVar.a, ajkeVar.d, i3, sczVar2, ajidVar2);
    }

    public final ajif a(ajid ajidVar) throws IOException {
        ajidVar.getClass();
        List list = this.d;
        int i = this.e;
        if (i >= list.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.f++;
        scz sczVar = this.c;
        if (sczVar != null) {
            if (!((ajji) sczVar.d).f.e(ajidVar.a)) {
                throw new IllegalStateException("network interceptor " + list.get(i - 1) + " must retain the same host and port");
            }
            if (this.f != 1) {
                throw new IllegalStateException("network interceptor " + list.get(i - 1) + " must call proceed() exactly once");
            }
        }
        int i2 = i + 1;
        ajke ajkeVarB = b(this, i2, null, ajidVar, 58);
        ajhy ajhyVar = (ajhy) list.get(i);
        ajif ajifVarA = ajhyVar.a(ajkeVarB);
        if (sczVar == null || i2 >= list.size() || ajkeVarB.f == 1) {
            return ajifVarA;
        }
        throw new IllegalStateException(a.bm(ajhyVar, "network interceptor ", " must call proceed() exactly once"));
    }
}
