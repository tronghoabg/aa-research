package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes.dex */
public final class teu {
    private static final ThreadLocal f = new tet();
    public final long a;
    public final String b;
    public String c;
    public Object[] d;
    public final int e;
    private String g;

    public teu(long j, int i, String str, String str2, Object[] objArr) {
        this.a = j;
        this.e = i;
        this.b = str;
        this.c = str2;
        this.d = objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053 A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:9:0x0010, B:11:0x0014, B:13:0x0020, B:16:0x0026, B:18:0x0029, B:20:0x002d, B:22:0x0031, B:30:0x0053, B:31:0x0055, B:25:0x003b, B:27:0x0049, B:32:0x0059, B:35:0x005f, B:36:0x0066, B:38:0x006c, B:40:0x0077, B:42:0x007f, B:44:0x0085, B:45:0x008a, B:47:0x008e, B:48:0x0091, B:49:0x0093, B:50:0x0095, B:52:0x009b, B:54:0x009f, B:55:0x00a3, B:56:0x00a6, B:57:0x00ae), top: B:67:0x0010, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a() {
        /*
            Method dump skipped, instructions count: 193
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.teu.a():void");
    }

    public final synchronized String b() {
        String str = ((SimpleDateFormat) f.get()).format(new Date(this.a));
        int i = this.e;
        char c = i != 2 ? i != 3 ? i != 4 ? i != 5 ? 'E' : 'W' : 'I' : 'D' : 'V';
        String str2 = str + " " + c + " " + this.b + " : ";
        String str3 = this.g;
        if (str3 != null) {
            return str2.concat(str3);
        }
        String str4 = this.c;
        if (str4 == null) {
            return str2;
        }
        return str2.concat(String.valueOf(spu.aR(str4, this.d)));
    }

    public final String toString() {
        return b();
    }
}
