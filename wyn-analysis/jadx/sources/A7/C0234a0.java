package A7;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.gms.common.internal.AbstractC1732v;

/* renamed from: A7.a0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0234a0 implements U1.D, u6.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f792a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f793b;

    /* renamed from: c, reason: collision with root package name */
    public long f794c;

    /* renamed from: d, reason: collision with root package name */
    public long f795d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f796e;

    /* renamed from: f, reason: collision with root package name */
    public Object f797f;

    public C0234a0(Z z2, String str, long j8) {
        this.f792a = 0;
        this.f797f = z2;
        AbstractC1732v.f(str);
        this.f796e = str;
        this.f794c = j8;
    }

    @Override // u6.j
    public void a(E5.r0 r0Var) {
        if (this.f793b) {
            b(g());
        }
        this.f797f = r0Var;
    }

    public void b(long j8) {
        switch (this.f792a) {
            case 1:
                this.f794c = j8;
                if (this.f793b) {
                    ((Q1.q) this.f796e).getClass();
                    this.f795d = SystemClock.elapsedRealtime();
                    break;
                }
                break;
            default:
                this.f794c = j8;
                if (this.f793b) {
                    ((u6.q) this.f796e).getClass();
                    this.f795d = SystemClock.elapsedRealtime();
                    break;
                }
                break;
        }
    }

    public void c() {
        switch (this.f792a) {
            case 1:
                if (!this.f793b) {
                    ((Q1.q) this.f796e).getClass();
                    this.f795d = SystemClock.elapsedRealtime();
                    this.f793b = true;
                    break;
                }
                break;
            default:
                if (!this.f793b) {
                    ((u6.q) this.f796e).getClass();
                    this.f795d = SystemClock.elapsedRealtime();
                    this.f793b = true;
                    break;
                }
                break;
        }
    }

    public long d() {
        if (!this.f793b) {
            this.f793b = true;
            this.f795d = ((Z) this.f797f).l0().getLong((String) this.f796e, this.f794c);
        }
        return this.f795d;
    }

    @Override // u6.j
    public E5.r0 e() {
        return (E5.r0) this.f797f;
    }

    public void f(long j8) {
        SharedPreferences.Editor editorEdit = ((Z) this.f797f).l0().edit();
        editorEdit.putLong((String) this.f796e, j8);
        editorEdit.apply();
        this.f795d = j8;
    }

    @Override // U1.D, u6.j
    public long g() {
        switch (this.f792a) {
            case 1:
                long j8 = this.f794c;
                if (!this.f793b) {
                    return j8;
                }
                ((Q1.q) this.f796e).getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f795d;
                return j8 + (((N1.F) this.f797f).f8032a == 1.0f ? Q1.x.K(jElapsedRealtime) : jElapsedRealtime * r4.f8034c);
            default:
                long j10 = this.f794c;
                if (!this.f793b) {
                    return j10;
                }
                ((u6.q) this.f796e).getClass();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - this.f795d;
                return j10 + (((E5.r0) this.f797f).f3535a == 1.0f ? u6.v.y(jElapsedRealtime2) : jElapsedRealtime2 * r4.f3537c);
        }
    }

    @Override // U1.D
    public /* synthetic */ boolean n() {
        return false;
    }

    @Override // U1.D
    public void q(N1.F f10) {
        if (this.f793b) {
            b(g());
        }
        this.f797f = f10;
    }

    @Override // U1.D
    /* renamed from: e, reason: collision with other method in class */
    public N1.F mo3e() {
        return (N1.F) this.f797f;
    }

    public C0234a0(u6.q qVar) {
        this.f792a = 2;
        this.f796e = qVar;
        this.f797f = E5.r0.f3534d;
    }

    public C0234a0(Q1.q qVar) {
        this.f792a = 1;
        this.f796e = qVar;
        this.f797f = N1.F.f8031d;
    }
}
