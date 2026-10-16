package j$.time.format;

import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes2.dex */
final class q {

    /* renamed from: a, reason: collision with root package name */
    private DateTimeFormatter f37608a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f37609b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f37610c = true;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f37611d;

    q(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.f37611d = arrayList;
        this.f37608a = dateTimeFormatter;
        arrayList.add(new x());
    }

    final q c() {
        q qVar = new q(this.f37608a);
        qVar.f37609b = this.f37609b;
        qVar.f37610c = this.f37610c;
        return qVar;
    }

    final Locale h() {
        return this.f37608a.c();
    }

    final w f() {
        return this.f37608a.b();
    }

    final j$.time.chrono.m g() {
        j$.time.chrono.m mVar = d().f37624c;
        if (mVar != null) {
            return mVar;
        }
        j$.time.chrono.m mVarA = this.f37608a.a();
        return mVarA == null ? j$.time.chrono.t.f37543d : mVarA;
    }

    final boolean a(char c10, char c11) {
        if (this.f37609b) {
            return c10 == c11;
        }
        return b(c10, c11);
    }

    final boolean j() {
        return this.f37609b;
    }

    final void l(boolean z2) {
        this.f37609b = z2;
    }

    final boolean r(CharSequence charSequence, int i5, CharSequence charSequence2, int i10, int i11) {
        if (i5 + i11 <= charSequence.length() && i10 + i11 <= charSequence2.length()) {
            if (this.f37609b) {
                for (int i12 = 0; i12 < i11; i12++) {
                    if (charSequence.charAt(i5 + i12) == charSequence2.charAt(i10 + i12)) {
                    }
                }
                return true;
            }
            for (int i13 = 0; i13 < i11; i13++) {
                char cCharAt = charSequence.charAt(i5 + i13);
                char cCharAt2 = charSequence2.charAt(i10 + i13);
                if (cCharAt == cCharAt2 || Character.toUpperCase(cCharAt) == Character.toUpperCase(cCharAt2) || Character.toLowerCase(cCharAt) == Character.toLowerCase(cCharAt2)) {
                }
            }
            return true;
        }
        return false;
    }

    static boolean b(char c10, char c11) {
        return c10 == c11 || Character.toUpperCase(c10) == Character.toUpperCase(c11) || Character.toLowerCase(c10) == Character.toLowerCase(c11);
    }

    final boolean k() {
        return this.f37610c;
    }

    final void p(boolean z2) {
        this.f37610c = z2;
    }

    final void q() {
        ArrayList arrayList = this.f37611d;
        x xVarD = d();
        xVarD.getClass();
        x xVar = new x();
        xVar.f37622a.putAll(xVarD.f37622a);
        xVar.f37623b = xVarD.f37623b;
        xVar.f37624c = xVarD.f37624c;
        xVar.f37625d = xVarD.f37625d;
        arrayList.add(xVar);
    }

    final void e(boolean z2) {
        ArrayList arrayList = this.f37611d;
        if (z2) {
            arrayList.remove(arrayList.size() - 2);
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    private x d() {
        return (x) this.f37611d.get(r0.size() - 1);
    }

    final TemporalAccessor s(y yVar) {
        x xVarD = d();
        xVarD.f37624c = g();
        ZoneId zoneId = xVarD.f37623b;
        if (zoneId == null) {
            this.f37608a.getClass();
            zoneId = null;
        }
        xVarD.f37623b = zoneId;
        xVarD.m(yVar);
        return xVarD;
    }

    final Long i(j$.time.temporal.a aVar) {
        return (Long) d().f37622a.get(aVar);
    }

    final int n(j$.time.temporal.q qVar, long j8, int i5, int i10) {
        Objects.requireNonNull(qVar, "field");
        Long l10 = (Long) d().f37622a.put(qVar, Long.valueOf(j8));
        return (l10 == null || l10.longValue() == j8) ? i10 : ~i5;
    }

    final void m(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        d().f37623b = zoneId;
    }

    final void o() {
        d().f37625d = true;
    }

    public final String toString() {
        return d().toString();
    }
}
