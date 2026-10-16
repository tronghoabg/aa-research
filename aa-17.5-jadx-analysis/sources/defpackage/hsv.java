package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class hsv {
    public final String a;
    public final long[] b;
    File[] c;
    File[] d;
    public boolean e;
    final /* synthetic */ hsw f;
    public nbu g;

    public hsv(hsw hswVar, String str) {
        this.f = hswVar;
        this.a = str;
        int i = hswVar.d;
        this.b = new long[i];
        if (hswVar.e) {
            this.c = new File[i];
            this.d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < hswVar.d; i2 = 1) {
                sb.append(0);
                this.c[0] = new File(hswVar.a, sb.toString());
                sb.append(".tmp");
                this.d[0] = new File(hswVar.a, sb.toString());
                sb.setLength(length);
            }
        }
    }

    public static final IOException d(String[] strArr) throws IOException {
        throw new IOException("unexpected journal line: ".concat(String.valueOf(Arrays.toString(strArr))));
    }

    public final String a() throws IOException {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            long[] jArr = this.b;
            if (i >= jArr.length) {
                return sb.toString();
            }
            long j = jArr[0];
            sb.append(' ');
            sb.append(j);
            i = 1;
        }
    }

    public final File c() {
        File[] fileArr = this.d;
        if (fileArr != null) {
            return fileArr[0];
        }
        return new File(this.f.a, String.valueOf(this.a).concat(".0.tmp"));
    }

    public final File e() {
        File[] fileArr = this.c;
        if (fileArr != null) {
            return fileArr[0];
        }
        return new File(this.f.a, this.a + ".0");
    }
}
