package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class mmz extends mnk {
    private final yfq a;
    private final yfq b;
    private final int c;
    private final boolean d;
    private final String e;
    private final boolean f;
    private volatile transient yfq g;

    public mmz(yfq yfqVar, yfq yfqVar2, int i, boolean z, String str, boolean z2) {
        if (yfqVar == null) {
            throw new NullPointerException("Null columns");
        }
        this.a = yfqVar;
        if (yfqVar2 == null) {
            throw new NullPointerException("Null rows");
        }
        this.b = yfqVar2;
        this.c = i;
        this.d = z;
        this.e = str;
        this.f = z2;
    }

    @Override // defpackage.mnk
    public final int a() {
        return this.c;
    }

    @Override // defpackage.mnk
    public final yfq b() {
        return this.a;
    }

    @Override // defpackage.mnk
    public final yfq c() {
        return this.b;
    }

    @Override // defpackage.mnk
    public final String d() {
        return this.e;
    }

    @Override // defpackage.mnk
    public final boolean e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof mnk) {
            mnk mnkVar = (mnk) obj;
            if (yrm.W(this.a, mnkVar.b()) && yrm.W(this.b, mnkVar.c())) {
                mnkVar.j();
                if (this.c == mnkVar.a() && this.d == mnkVar.f() && ((str = this.e) != null ? str.equals(mnkVar.d()) : mnkVar.d() == null)) {
                    mnkVar.k();
                    if (this.f == mnkVar.e()) {
                        mnkVar.h();
                        mnkVar.i();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.mnk
    public final boolean f() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mnk
    public final yfq g() {
        int length;
        if (this.g == null) {
            synchronized (this) {
                if (this.g == null) {
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    while (true) {
                        yfq yfqVar = this.a;
                        if (i >= ((yls) yfqVar).c) {
                            break;
                        }
                        mnh mnhVar = (mnh) yfqVar.get(i);
                        if (mnhVar.d) {
                            String str = mnhVar.a;
                            length = str != null ? str.length() : 0;
                            yfq yfqVar2 = this.b;
                            int i2 = ((yls) yfqVar2).c;
                            for (int i3 = 0; i3 < i2; i3++) {
                                Object obj = ((List) yfqVar2.get(i3)).get(i);
                                length = Math.max(length, obj == null ? 0 : obj.toString().length());
                            }
                        } else {
                            length = 0;
                        }
                        arrayList.add(Integer.valueOf(mnk.n(length, mnhVar.b)));
                        i++;
                    }
                    int size = arrayList.size();
                    int iIntValue = 0;
                    for (int i4 = 0; i4 < size; i4++) {
                        iIntValue += ((Integer) arrayList.get(i4)).intValue();
                    }
                    int iN = mnk.n(iIntValue, this.c);
                    if (iIntValue != iN) {
                        float f = iN / iIntValue;
                        for (int i5 = 0; i5 < arrayList.size(); i5++) {
                            arrayList.set(i5, Integer.valueOf(Math.round(((Integer) arrayList.get(i5)).intValue() * f)));
                        }
                    }
                    this.g = yfq.o(arrayList);
                    if (this.g == null) {
                        throw new NullPointerException("columnWidths() cannot return null");
                    }
                }
            }
        }
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        String str = this.e;
        return (((((((((((iHashCode * (-721379959)) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ 1237) * 1000003) ^ (true != this.f ? 1237 : 1231)) * (-721379959)) ^ 1237;
    }

    public final String toString() {
        yfq yfqVar = this.b;
        return "TablePrinter{columns=" + this.a.toString() + ", rows=" + yfqVar.toString() + ", minWidth=0, maxWidth=" + this.c + ", showColumnNames=" + this.d + ", emptyMessage=" + this.e + ", useEllipsis=false, isMultiline=" + this.f + ", headerBorder=\u0000, hideEmptyColumns=false}";
    }

    @Override // defpackage.mnk
    public final void h() {
    }

    @Override // defpackage.mnk
    public final void i() {
    }

    @Override // defpackage.mnk
    public final void j() {
    }

    @Override // defpackage.mnk
    public final void k() {
    }
}
