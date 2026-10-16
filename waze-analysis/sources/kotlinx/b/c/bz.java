package kotlinx.b.c;

import androidx.autofill.HintConstants;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bz implements kotlinx.b.a.q, m {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.b.a.q f51028a;

    /* renamed from: b, reason: collision with root package name */
    private final String f51029b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f51030c;

    public bz(kotlinx.b.a.q qVar) {
        h.g.b.x.f(qVar, "original");
        this.f51028a = qVar;
        this.f51029b = qVar.d() + '?';
        this.f51030c = bp.a(qVar);
    }

    @Override // kotlinx.b.a.q
    public final int a(String str) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        return this.f51028a.a(str);
    }

    @Override // kotlinx.b.a.q
    public final int b() {
        return this.f51028a.b();
    }

    @Override // kotlinx.b.a.q
    public final String c(int i2) {
        return this.f51028a.c(i2);
    }

    @Override // kotlinx.b.a.q
    public final String d() {
        return this.f51029b;
    }

    @Override // kotlinx.b.a.q
    public final List e() {
        return this.f51028a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bz) && h.g.b.x.n(this.f51028a, ((bz) obj).f51028a);
    }

    @Override // kotlinx.b.a.q
    public final List f(int i2) {
        return this.f51028a.f(i2);
    }

    @Override // kotlinx.b.a.q
    public final kotlinx.b.a.q g(int i2) {
        return this.f51028a.g(i2);
    }

    @Override // kotlinx.b.a.q
    public final kotlinx.b.a.x h() {
        return this.f51028a.h();
    }

    public final int hashCode() {
        return this.f51028a.hashCode() * 31;
    }

    @Override // kotlinx.b.a.q
    public final boolean i(int i2) {
        return this.f51028a.i(i2);
    }

    @Override // kotlinx.b.a.q
    public final boolean j() {
        return this.f51028a.j();
    }

    @Override // kotlinx.b.a.q
    public final boolean k() {
        return true;
    }

    public final kotlinx.b.a.q l() {
        return this.f51028a;
    }

    @Override // kotlinx.b.c.m
    public final Set m() {
        return this.f51030c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f51028a);
        sb.append('?');
        return sb.toString();
    }
}
