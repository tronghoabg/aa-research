package defpackage;

import android.os.Process;

/* loaded from: classes3.dex */
public final class uug implements utz {
    private static final int[] c = {34962, 34963};
    private final uuf[] a;
    private uud b = null;

    public uug() {
        int[] iArr = c;
        this.a = new uuf[2];
        for (int i = 0; i < 2; i++) {
            this.a[i] = new uuf(iArr[i]);
        }
    }

    public static uue e(int i, uud uudVar, String str, int i2) {
        if (i == 0) {
            throw null;
        }
        switch (i) {
            case 34962:
                uue uueVarQ = uudVar.Q();
                uudVar.g(uueVarQ);
                uudVar.o(i, i2, null, 35044);
                return uueVarQ;
            case 34963:
                uue uueVarO = uudVar.O();
                uudVar.e(uueVarO);
                uudVar.o(i, i2, null, 35044);
                return uueVarO;
            default:
                throw new RuntimeException(null, null);
        }
    }

    public static final int f(int i) {
        if (i == -3) {
            return 34963;
        }
        if (i == -2) {
            return 34962;
        }
        return c[i >> 30];
    }

    private final void g(uud uudVar) {
        uud uudVar2 = this.b;
        if (uudVar2 == null) {
            this.b = uudVar;
            uudVar2 = uudVar;
        }
        woy.Z(uudVar2 == uudVar);
        woy.Z(Process.myTid() == uudVar.c);
    }

    @Override // defpackage.utz
    public final void a(uud uudVar, uue uueVar) {
        g(uudVar);
        if (!uueVar.h) {
            uudVar.h(uueVar);
            return;
        }
        synchronized (this) {
            uuf[] uufVarArr = this.a;
            for (int i = 0; i < 2; i++) {
                uuf uufVar = uufVarArr[i];
                if (uufVar.b.d == uueVar.d) {
                    woy.Z(uufVar.c > 0);
                    int i2 = uufVar.c - 1;
                    uufVar.c = i2;
                    if (i2 == 0) {
                        uudVar.h(uufVar.b);
                        uufVar.b = uue.a;
                    }
                    uudVar.t(uueVar);
                    return;
                }
            }
            throw new IllegalArgumentException("Tried to release a handle from the wrong arena");
        }
    }

    @Override // defpackage.utz
    public final synchronized void b() {
        this.b = null;
        int i = 0;
        while (true) {
            uuf[] uufVarArr = this.a;
            if (i < 2) {
                uuf uufVar = uufVarArr[i];
                uufVar.c = 0;
                uufVar.b = uue.a;
                i++;
            }
        }
    }

    @Override // defpackage.utz
    public final synchronized int c(int i, int i2) {
        int i3;
        int i4 = 0;
        while (true) {
            int[] iArr = c;
            if (i4 >= 2) {
                throw new IllegalArgumentException("Unexpected type ".concat(std.A(i)));
            }
            if (iArr[i4] == i) {
                uuf uufVar = this.a[i4];
                if (uufVar.b != uue.a) {
                    throw new IllegalStateException("Tried to reserve more arena space after the arena was already made live");
                }
                if (i2 > 2097152) {
                    i3 = -1;
                } else {
                    int i5 = uufVar.a;
                    uufVar.a = ((i2 + 3) & (-4)) + i5;
                    i3 = i5;
                }
                if (i3 < 0) {
                    return i != 34962 ? -3 : -2;
                }
                return (1073741823 & i3) | (i4 << 30);
            }
            i4++;
        }
    }

    public final uue d(int i, uud uudVar, String str, int i2) {
        uue uueVar;
        g(uudVar);
        if (i == -2 || i == -3) {
            return e(f(i), uudVar, str, i2);
        }
        synchronized (this) {
            uuf uufVar = this.a[i >> 30];
            if (uufVar.c == 0) {
                uufVar.b = e(uufVar.d, uudVar, "arena", uufVar.a);
            }
            uufVar.c++;
            uue uueVar2 = uufVar.b;
            int i3 = i & 1073741823;
            woy.N(i2 > 0);
            woy.N(i2 + i3 <= uueVar2.e);
            uueVar = new uue(uueVar2.d);
            uueVar.e = i2;
            uueVar.f = i3;
            uueVar.h = true;
            uueVar.a(uueVar2, uueVar2.c);
            int i4 = uufVar.d;
            if (i4 == 0) {
                throw null;
            }
            switch (i4) {
                case 34962:
                    uudVar.g(uueVar);
                    break;
                case 34963:
                    uudVar.e(uueVar);
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected type ".concat(std.A(i4)));
            }
        }
        return uueVar;
    }
}
