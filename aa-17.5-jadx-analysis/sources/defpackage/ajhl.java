package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ajhl {
    private final boolean a;
    private String[] b;
    private String[] c;
    private boolean d;

    public ajhl(ajhm ajhmVar) {
        this.a = ajhmVar.c;
        this.b = ajhmVar.e;
        this.c = ajhmVar.f;
        this.d = ajhmVar.d;
    }

    public final ajhm a() {
        return new ajhm(this.a, this.d, this.b, this.c);
    }

    public final void b(String... strArr) {
        strArr.getClass();
        if (!this.a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        int length = strArr.length;
        if (length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        Object[] objArrCopyOf = Arrays.copyOf(strArr, length);
        objArrCopyOf.getClass();
        this.b = (String[]) objArrCopyOf;
    }

    public final void c() {
        if (!this.a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        this.d = true;
    }

    public final void d(String... strArr) {
        strArr.getClass();
        if (!this.a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        int length = strArr.length;
        if (length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        Object[] objArrCopyOf = Arrays.copyOf(strArr, length);
        objArrCopyOf.getClass();
        this.c = (String[]) objArrCopyOf;
    }

    public final void e(ajhk... ajhkVarArr) {
        ajhkVarArr.getClass();
        if (!this.a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(ajhkVarArr.length);
        for (ajhk ajhkVar : ajhkVarArr) {
            arrayList.add(ajhkVar.s);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void f(ajij... ajijVarArr) {
        if (!this.a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(ajijVarArr.length);
        for (ajij ajijVar : ajijVarArr) {
            arrayList.add(ajijVar.f);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        d((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public ajhl(boolean z) {
        this.a = z;
    }
}
