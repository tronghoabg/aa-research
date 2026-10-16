package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class zhe {
    private static zhe c;
    public Object a;
    public Object b;

    public zhe() {
        this.a = null;
        this.b = null;
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public static ThreadFactory b(zhe zheVar) {
        Object obj = zheVar.a;
        Object obj2 = zheVar.b;
        return new zhd(Executors.defaultThreadFactory(), (String) obj, obj != null ? new AtomicLong(0L) : null, (Boolean) obj2);
    }

    public static synchronized zhe h() {
        zhe zheVar;
        zheVar = c;
        if (zheVar == null) {
            zheVar = new zhe(null, null);
            c = zheVar;
        }
        return zheVar;
    }

    private static yfy i(zbi zbiVar) {
        return yeb.d(zbiVar.b).g(new txa(11));
    }

    public final void c() {
        this.b = true;
    }

    public final void d(String str) {
        a(str, 0);
        this.a = str;
    }

    public final void e() throws IOException {
        if (this.b == null) {
            throw new wfj("Cannot sync underlying stream");
        }
        ((OutputStream) this.a).flush();
        ((wfl) this.b).a.getFD().sync();
    }

    public final void f(ygr ygrVar) {
        if (ygrVar == null) {
            throw new NullPointerException("Null removedExtras");
        }
        this.a = ygrVar;
    }

    public final synchronized void g(zbi zbiVar) {
        yfy yfyVarI = i((zbi) this.b);
        yfy yfyVarI2 = i(zbiVar);
        abnp abnpVarN = zbi.a.n();
        yno it = yfyVarI.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (yfyVarI2.containsKey(entry.getKey())) {
                zbf zbfVar = (zbf) yfyVarI2.get(entry.getKey());
                if (zbfVar.c > ((zbf) entry.getValue()).c) {
                    abnpVarN.P(zbfVar);
                } else {
                    abnpVarN.P((zbf) entry.getValue());
                }
            } else {
                abnpVarN.P((zbf) entry.getValue());
            }
        }
        yno it2 = yfyVarI2.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            if (!yfyVarI.containsKey(entry2.getKey())) {
                abnpVarN.P((zbf) entry2.getValue());
            }
        }
        this.b = (zbi) abnpVarN.q();
    }

    public zhe(byte[] bArr) {
    }

    private zhe(byte[] bArr, byte[] bArr2) {
        this.b = zbi.a;
    }
}
