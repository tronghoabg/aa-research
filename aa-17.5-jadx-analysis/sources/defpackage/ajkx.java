package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final /* synthetic */ class ajkx implements afdr {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ajkx(Object obj, int i, int i2, int i3) {
        this.d = i3;
        this.c = obj;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.afdr
    public final Object invoke() throws IOException {
        int i = this.d;
        if (i == 0) {
            int i2 = this.b;
            int i3 = this.a;
            Object obj = this.c;
            try {
                ((ajlc) obj).l(i3, i2);
            } catch (IOException e) {
                ((ajlc) obj).c(e);
            }
            return afak.a;
        }
        if (i != 1) {
            ((ajlc) this.c).g(true, this.a, this.b);
            return afak.a;
        }
        int i4 = this.a;
        yph yphVar = myv.a;
        bbt bbtVar = (bbt) this.c;
        return Boolean.valueOf(((float) mcd.n(bbtVar.j(), i4)) + bbtVar.c() > ((float) afpt.e(this.b + (-1), 0)) + 0.2f);
    }
}
