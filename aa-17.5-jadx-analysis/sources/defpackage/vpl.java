package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class vpl {
    private static final int[] h = new int[0];
    private static final String[] i = new String[0];
    public final long a;
    public final String b;
    public final String c;
    public final int d;
    public final int[] e;
    public final String[] f;
    public final vpk g;

    public vpl(String str, String str2, int i2, long j, int[] iArr, String[] strArr, vpk vpkVar) {
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.a = j;
        this.e = iArr;
        this.f = strArr;
        this.g = vpkVar;
    }

    public static boolean a(Object obj) {
        return obj == null || (obj instanceof vpu);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpl)) {
            return false;
        }
        vpl vplVar = (vpl) obj;
        return Objects.equals(this.b, vplVar.b) && Objects.equals(this.c, vplVar.c) && this.d == vplVar.d && this.a == vplVar.a && Arrays.equals(this.e, vplVar.e) && Arrays.equals(this.f, vplVar.f) && Objects.equals(this.g, vplVar.g);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, Integer.valueOf(this.d), Long.valueOf(this.a), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), this.g);
    }

    public vpl(String str, String str2, int i2, long j, vpk vpkVar) {
        this(str, str2, i2, j, h, i, vpkVar);
    }
}
