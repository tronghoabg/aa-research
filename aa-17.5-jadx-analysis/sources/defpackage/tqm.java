package defpackage;

import android.net.Network;
import com.google.android.gms.auth.aang.GetTokenRequest;
import com.google.android.gms.auth.aang.GoogleAccount;

/* loaded from: classes3.dex */
public final class tqm {
    public int a;
    public byte b;
    public int c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    private boolean j;
    private boolean k;

    public tqm(tqn tqnVar) {
        xvy xvyVar = xvy.a;
        this.f = xvyVar;
        this.g = xvyVar;
        this.h = xvyVar;
        this.d = tqnVar.a;
        this.i = tqnVar.j;
        this.e = tqnVar.b;
        this.j = tqnVar.c;
        this.a = tqnVar.d;
        this.c = tqnVar.i;
        this.f = tqnVar.e;
        this.g = tqnVar.f;
        this.h = tqnVar.g;
        this.k = tqnVar.h;
        this.b = (byte) 7;
    }

    public final tqn a() {
        Object obj;
        int i;
        Object obj2 = this.d;
        if (obj2 == null) {
            throw new IllegalStateException();
        }
        abcs abcsVar = (abcs) obj2;
        tql tqlVar = new tql(abcsVar);
        this.i = tqlVar;
        if (this.b != 7 || (obj = this.e) == null || (i = this.c) == 0) {
            throw new IllegalStateException();
        }
        return new tqn(abcsVar, tqlVar, (abdl) obj, this.j, this.a, i, (xxh) this.f, (xxh) this.g, (xxh) this.h, this.k);
    }

    public final void b(boolean z) {
        this.k = z;
        this.b = (byte) (this.b | 4);
    }

    public final void c(int i) {
        this.a = i;
        this.b = (byte) (this.b | 2);
    }

    public final void d(boolean z) {
        this.j = z;
        this.b = (byte) (this.b | 1);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    public final GetTokenRequest e() {
        Object obj = this.g;
        if (obj == null && this.d == null) {
            throw new IllegalArgumentException("#setAccount or #setObfuscatedGaiaId must be called.");
        }
        if (obj != null && this.d != null) {
            throw new IllegalArgumentException("Both setObfuscatedGaiaId and setAccount cannot be called.");
        }
        if (this.e == null) {
            throw new IllegalArgumentException("A token type must be specified.");
        }
        if (this.h != null && f() == 0) {
            throw new IllegalArgumentException("Please provide a delegation type for the user id.");
        }
        if (f() == 1 && this.h == null) {
            throw new IllegalArgumentException("Please provide a delegatee user ID.");
        }
        if (this.b != 31) {
            StringBuilder sb = new StringBuilder();
            if ((1 & this.b) == 0) {
                sb.append(" delegationType");
            }
            if ((this.b & 2) == 0) {
                sb.append(" handleNotification");
            }
            if ((this.b & 4) == 0) {
                sb.append(" suppressProgressScreen");
            }
            if ((this.b & 8) == 0) {
                sb.append(" useNewExceptions");
            }
            if ((this.b & 16) == 0) {
                sb.append(" clientVersion");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        Object obj2 = this.g;
        Object obj3 = this.d;
        ?? r5 = this.e;
        int i = this.c;
        Object obj4 = this.h;
        Object obj5 = this.f;
        String str = (String) obj4;
        String str2 = (String) obj3;
        return new GetTokenRequest((GoogleAccount) obj2, str2, r5, null, null, null, i, str, false, null, (String) obj5, this.k, (Network) this.i, this.j, this.a);
    }

    public final int f() {
        if ((this.b & 1) != 0) {
            return this.c;
        }
        throw new IllegalStateException("Property \"delegationType\" has not been set");
    }

    public final void g(int i) {
        this.c = i;
        this.b = (byte) (this.b | 1);
    }

    public final void h(boolean z) {
        this.k = z;
        this.b = (byte) (this.b | 4);
    }

    public final void i(boolean z) {
        this.j = z;
        this.b = (byte) (this.b | 8);
    }

    public tqm() {
        xvy xvyVar = xvy.a;
        this.f = xvyVar;
        this.g = xvyVar;
        this.h = xvyVar;
    }

    public tqm(byte[] bArr) {
    }
}
