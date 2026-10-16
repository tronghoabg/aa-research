package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Set;

/* loaded from: classes2.dex */
final class n implements f {

    /* renamed from: c, reason: collision with root package name */
    private static volatile AbstractMap.SimpleImmutableEntry f37594c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile AbstractMap.SimpleImmutableEntry f37595d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37596a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f37597b;

    public /* synthetic */ n(int i5, Object obj) {
        this.f37596a = i5;
        this.f37597b = obj;
    }

    @Override // j$.time.format.f
    public final boolean o(t tVar, StringBuilder sb2) {
        switch (this.f37596a) {
            case 0:
                sb2.append((String) this.f37597b);
                break;
            default:
                ZoneId zoneId = (ZoneId) tVar.f((C2904a) this.f37597b);
                if (zoneId != null) {
                    sb2.append(zoneId.n());
                    break;
                }
                break;
        }
        return true;
    }

    @Override // j$.time.format.f
    public final int q(q qVar, CharSequence charSequence, int i5) {
        int i10;
        switch (this.f37596a) {
            case 0:
                if (i5 > charSequence.length() || i5 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                String str = (String) this.f37597b;
                return !qVar.r(charSequence, i5, str, 0, str.length()) ? ~i5 : str.length() + i5;
            default:
                int length = charSequence.length();
                if (i5 > length) {
                    throw new IndexOutOfBoundsException();
                }
                if (i5 != length) {
                    char cCharAt = charSequence.charAt(i5);
                    if (cCharAt != '+' && cCharAt != '-') {
                        int i11 = i5 + 2;
                        if (length >= i11) {
                            char cCharAt2 = charSequence.charAt(i5 + 1);
                            if (qVar.a(cCharAt, 'U') && qVar.a(cCharAt2, 'T')) {
                                int i12 = i5 + 3;
                                if (length >= i12 && qVar.a(charSequence.charAt(i11), 'C')) {
                                    return a(qVar, charSequence, i5, i12, j.f37584f);
                                }
                                return a(qVar, charSequence, i5, i11, j.f37584f);
                            }
                            if (qVar.a(cCharAt, 'G') && length >= (i10 = i5 + 3) && qVar.a(cCharAt2, 'M') && qVar.a(charSequence.charAt(i11), 'T')) {
                                int i13 = i5 + 4;
                                if (length >= i13 && qVar.a(charSequence.charAt(i10), '0')) {
                                    qVar.m(ZoneId.of("GMT0"));
                                    return i13;
                                }
                                return a(qVar, charSequence, i5, i10, j.f37584f);
                            }
                        }
                        Set setA = j$.time.zone.j.a();
                        int size = setA.size();
                        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = qVar.j() ? f37594c : f37595d;
                        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                            synchronized (this) {
                                try {
                                    simpleImmutableEntry = qVar.j() ? f37594c : f37595d;
                                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), l.e(setA, qVar));
                                        if (qVar.j()) {
                                            f37594c = simpleImmutableEntry;
                                        } else {
                                            f37595d = simpleImmutableEntry;
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        l lVar = (l) simpleImmutableEntry.getValue();
                        ParsePosition parsePosition = new ParsePosition(i5);
                        String strC = lVar.c(charSequence, parsePosition);
                        if (strC == null) {
                            if (qVar.a(cCharAt, 'Z')) {
                                qVar.m(ZoneOffset.UTC);
                                return i5 + 1;
                            }
                        } else {
                            qVar.m(ZoneId.of(strC));
                            return parsePosition.getIndex();
                        }
                    } else {
                        return a(qVar, charSequence, i5, i5, j.f37583e);
                    }
                }
                return ~i5;
        }
    }

    private static int a(q qVar, CharSequence charSequence, int i5, int i10, j jVar) {
        String upperCase = charSequence.subSequence(i5, i10).toString().toUpperCase();
        if (i10 >= charSequence.length()) {
            qVar.m(ZoneId.of(upperCase));
            return i10;
        }
        if (charSequence.charAt(i10) == '0' || qVar.a(charSequence.charAt(i10), 'Z')) {
            qVar.m(ZoneId.of(upperCase));
            return i10;
        }
        q qVarC = qVar.c();
        int iQ = jVar.q(qVarC, charSequence, i10);
        try {
            if (iQ < 0) {
                if (jVar == j.f37583e) {
                    return ~i5;
                }
                qVar.m(ZoneId.of(upperCase));
                return i10;
            }
            qVar.m(ZoneId.U(upperCase, ZoneOffset.c0((int) qVarC.i(j$.time.temporal.a.OFFSET_SECONDS).longValue())));
            return iQ;
        } catch (j$.time.c unused) {
            return ~i5;
        }
    }

    public final String toString() {
        switch (this.f37596a) {
            case 0:
                return "'" + ((String) this.f37597b).replace("'", "''") + "'";
            default:
                return "ZoneRegionId()";
        }
    }
}
