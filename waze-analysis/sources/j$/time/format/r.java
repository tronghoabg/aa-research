package j$.time.format;

import j$.time.temporal.WeekFields;
import java.util.Locale;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class r extends i {

    /* renamed from: g, reason: collision with root package name */
    public final char f49979g;

    /* renamed from: h, reason: collision with root package name */
    public final int f49980h;

    public r(char c2, int i2, int i3, int i4, int i5) {
        super(null, i3, i4, c0.NOT_NEGATIVE, i5);
        this.f49979g = c2;
        this.f49980h = i2;
    }

    @Override // j$.time.format.i
    public final i d() {
        if (this.f49952e == -1) {
            return this;
        }
        return new r(this.f49979g, this.f49980h, this.f49949b, this.f49950c, -1);
    }

    @Override // j$.time.format.i
    public final i e(int i2) {
        return new r(this.f49979g, this.f49980h, this.f49949b, this.f49950c, this.f49952e + i2);
    }

    @Override // j$.time.format.i, j$.time.format.e
    public final boolean f(w wVar, StringBuilder sb) {
        return g(wVar.f50000b.f49900b).f(wVar, sb);
    }

    public final i g(Locale locale) {
        j$.time.temporal.q qVar;
        WeekFields weekFieldsOf = WeekFields.of(locale);
        char c2 = this.f49979g;
        if (c2 == 'W') {
            qVar = weekFieldsOf.f50043d;
        } else {
            if (c2 == 'Y') {
                j$.time.temporal.q qVar2 = weekFieldsOf.f50045f;
                int i2 = this.f49980h;
                if (i2 == 2) {
                    return new o(qVar2, 2, 2, o.f49972h, this.f49952e);
                }
                return new i(qVar2, i2, 19, i2 < 4 ? c0.NORMAL : c0.EXCEEDS_PAD, this.f49952e);
            }
            if (c2 == 'c' || c2 == 'e') {
                qVar = weekFieldsOf.f50042c;
            } else {
                if (c2 != 'w') {
                    throw new IllegalStateException("unreachable");
                }
                qVar = weekFieldsOf.f50044e;
            }
        }
        return new i(qVar, this.f49949b, this.f49950c, c0.NOT_NEGATIVE, this.f49952e);
    }

    @Override // j$.time.format.i, j$.time.format.e
    public final int h(u uVar, CharSequence charSequence, int i2) {
        return g(uVar.f49990a.f49900b).h(uVar, charSequence, i2);
    }

    @Override // j$.time.format.i
    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        int i2 = this.f49980h;
        char c2 = this.f49979g;
        if (c2 != 'Y') {
            if (c2 == 'W') {
                sb.append("WeekOfMonth");
            } else if (c2 == 'c' || c2 == 'e') {
                sb.append("DayOfWeek");
            } else if (c2 == 'w') {
                sb.append("WeekOfWeekBasedYear");
            }
            sb.append(",");
            sb.append(i2);
        } else if (i2 == 1) {
            sb.append("WeekBasedYear");
        } else if (i2 == 2) {
            sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
        } else {
            sb.append("WeekBasedYear,");
            sb.append(i2);
            sb.append(",19,");
            sb.append(i2 < 4 ? c0.NORMAL : c0.EXCEEDS_PAD);
        }
        sb.append(")");
        return sb.toString();
    }
}
