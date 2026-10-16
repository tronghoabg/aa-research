package defpackage;

import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes.dex */
public final class ivs {
    private static ivs c;
    public Object a;
    public Object b;

    public ivs(byte[] bArr) {
        this.b = new djv(dev.a, dfv.a, (dfv) null);
        djv djvVar = (djv) this.b;
        this.a = new dja(djvVar.a, djvVar.b);
    }

    public static ivs a() {
        ivs ivsVar = c;
        if (ivsVar != null) {
            return ivsVar;
        }
        ivs ivsVar2 = new ivs();
        c = ivsVar2;
        return ivsVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final djv b(List list) {
        long jT;
        diz dizVar;
        try {
            int size = list.size();
            int i = 0;
            dfv dfvVar = null;
            while (i < size) {
                try {
                    dizVar = (diz) list.get(i);
                } catch (Exception e) {
                    e = e;
                    dfvVar = dfvVar;
                }
                try {
                    dizVar.a((dja) this.a);
                    i++;
                    dfvVar = dizVar;
                } catch (Exception e2) {
                    e = e2;
                    dfvVar = dizVar;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error while applying EditCommand batch to buffer (length=" + ((dja) this.a).c() + ", composition=" + ((dja) this.a).e() + ", selection=" + dfv.f(((dja) this.a).d()) + "):");
                    sb.append('\n');
                    woy.ct(list, sb, "\n", "", "", -1, "...", new daz(dfvVar, 9));
                    throw new RuntimeException(sb.toString(), e);
                }
            }
            deu deuVar = new deu(((dja) this.a).toString());
            long jD = ((dja) this.a).d();
            dfvVar = true != dfv.j(((djv) this.b).b) ? new dfv(jD) : null;
            if (dfvVar != null) {
                jT = dfvVar.b;
            } else {
                int i2 = (int) (jD >> 32);
                int i3 = (int) (jD & 4294967295L);
                jT = czz.t(Math.max(i2, i3), Math.min(i2, i3));
            }
            djv djvVar = new djv(deuVar, jT, ((dja) this.a).e());
            this.b = djvVar;
            return djvVar;
        } catch (Exception e3) {
            e = e3;
        }
    }

    private ivs() {
        this.a = new WeakReference(null);
        this.b = new WeakReference(null);
    }
}
