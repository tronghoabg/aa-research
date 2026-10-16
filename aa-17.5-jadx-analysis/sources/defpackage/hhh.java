package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class hhh extends hhm {
    public final yfq a;
    public final yfq b;
    public final boolean c;
    public final String d;
    private final int e;
    private final boolean f;
    private volatile transient yfq g;

    public hhh(yfq yfqVar, yfq yfqVar2, int i, boolean z, String str, boolean z2) {
        if (yfqVar == null) {
            throw new NullPointerException("Null columns");
        }
        this.a = yfqVar;
        if (yfqVar2 == null) {
            throw new NullPointerException("Null rows");
        }
        this.b = yfqVar2;
        this.e = i;
        this.c = z;
        this.d = str;
        this.f = z2;
    }

    @Override // defpackage.hhm
    public final int a() {
        return this.e;
    }

    @Override // defpackage.hhm
    public final yfq b() {
        return this.a;
    }

    @Override // defpackage.hhm
    public final yfq c() {
        return this.b;
    }

    @Override // defpackage.hhm
    public final String d() {
        return this.d;
    }

    @Override // defpackage.hhm
    public final boolean e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof hhm) {
            hhm hhmVar = (hhm) obj;
            if (yrm.W(this.a, hhmVar.b()) && yrm.W(this.b, hhmVar.c())) {
                hhmVar.j();
                if (this.e == hhmVar.a() && this.c == hhmVar.f() && ((str = this.d) != null ? str.equals(hhmVar.d()) : hhmVar.d() == null)) {
                    hhmVar.k();
                    if (this.f == hhmVar.e()) {
                        hhmVar.h();
                        hhmVar.i();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.hhm
    public final boolean f() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hhm
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
                        hhj hhjVar = (hhj) yfqVar.get(i);
                        if (hhjVar.d) {
                            String str = hhjVar.a;
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
                        arrayList.add(Integer.valueOf(hhm.m(length, hhjVar.b)));
                        i++;
                    }
                    int size = arrayList.size();
                    int iIntValue = 0;
                    for (int i4 = 0; i4 < size; i4++) {
                        iIntValue += ((Integer) arrayList.get(i4)).intValue();
                    }
                    int iM = hhm.m(iIntValue, this.e);
                    if (iIntValue != iM) {
                        float f = iM / iIntValue;
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
        String str = this.d;
        return (((((((((((iHashCode * (-721379959)) ^ this.e) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ 1237) * 1000003) ^ (true != this.f ? 1237 : 1231)) * (-721379959)) ^ 1237;
    }

    public final String toString() {
        yfq yfqVar = this.b;
        return "TablePrinter{columns=" + this.a.toString() + ", rows=" + yfqVar.toString() + ", minWidth=0, maxWidth=" + this.e + ", showColumnNames=" + this.c + ", emptyMessage=" + this.d + ", useEllipsis=false, isMultiline=" + this.f + ", headerBorder=\u0000, hideEmptyColumns=false}";
    }

    @Override // defpackage.hhm
    public final void h() {
    }

    @Override // defpackage.hhm
    public final void i() {
    }

    @Override // defpackage.hhm
    public final void j() {
    }

    @Override // defpackage.hhm
    public final void k() {
    }
}
