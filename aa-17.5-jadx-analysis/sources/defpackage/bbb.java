package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import j$.time.Duration;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class bbb implements afec {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ bbb(Object obj, boolean z, Object obj2, int i) {
        this.d = i;
        this.c = obj;
        this.a = z;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.d;
        if (i == 0) {
            dec decVar = (dec) obj;
            Object obj2 = this.c;
            Object obj3 = this.b;
            if (this.a) {
                decVar.a(ddq.y, new ddf(null, new aiy(obj3, obj2, 5)));
                decVar.a(ddq.A, new ddf(null, new aiy(obj3, obj2, 6)));
            } else {
                decVar.a(ddq.z, new ddf(null, new aiy(obj3, obj2, 7)));
                decVar.a(ddq.B, new ddf(null, new aiy(obj3, obj2, 8)));
            }
            return afak.a;
        }
        if (i != 1) {
            if (i != 2) {
                Object obj4 = this.b;
                return nni.a((nnl) this.c, this.a, (cil) obj4, (cie) obj);
            }
            gjo gjoVar = (gjo) obj;
            gjoVar.getClass();
            Uri uri = gjoVar.b;
            Bitmap bitmap = gjoVar.d;
            return eqy.b(dtx.p((1 & 1) != 0 ? afcp.a : null, (1 & 2) != 0 ? 5000L : 0L, new ltm(uri, this.c, gjoVar.c, this.a, bitmap, (Duration) this.b, null)), new lpx(gjoVar, 14));
        }
        cun cunVar = (cun) obj;
        ?? r0 = this.b;
        int size = r0.size();
        int i2 = 0;
        while (true) {
            z = this.a;
            if (i2 >= size) {
                break;
            }
            ((axk) r0.get(i2)).d(cunVar, z);
            i2++;
        }
        ?? r8 = this.c;
        int size2 = r8.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((axk) r8.get(i3)).d(cunVar, z);
        }
        return afak.a;
    }

    public /* synthetic */ bbb(List list, List list2, boolean z, int i) {
        this.d = i;
        this.b = list;
        this.c = list2;
        this.a = z;
    }

    public /* synthetic */ bbb(boolean z, bbt bbtVar, aitx aitxVar, int i) {
        this.d = i;
        this.a = z;
        this.b = bbtVar;
        this.c = aitxVar;
    }
}
