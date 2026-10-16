package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
final class aker implements akfn, akfl {
    public final akfn[] a;
    public final akfl[] b;
    private final int c;
    private final int d;

    public aker(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            Object obj = list.get(i);
            if (obj instanceof aker) {
                e(arrayList, ((aker) obj).a);
            } else {
                arrayList.add(obj);
            }
            Object obj2 = list.get(i + 1);
            if (obj2 instanceof aker) {
                e(arrayList2, ((aker) obj2).b);
            } else {
                arrayList2.add(obj2);
            }
        }
        if (arrayList.contains(null) || arrayList.isEmpty()) {
            this.a = null;
            this.c = 0;
        } else {
            int size2 = arrayList.size();
            this.a = new akfn[size2];
            int iB = 0;
            for (int i2 = 0; i2 < size2; i2++) {
                akfn akfnVar = (akfn) arrayList.get(i2);
                iB += akfnVar.b();
                this.a[i2] = akfnVar;
            }
            this.c = iB;
        }
        if (arrayList2.contains(null) || arrayList2.isEmpty()) {
            this.b = null;
            this.d = 0;
            return;
        }
        int size3 = arrayList2.size();
        this.b = new akfl[size3];
        int iA = 0;
        for (int i3 = 0; i3 < size3; i3++) {
            akfl akflVar = (akfl) arrayList2.get(i3);
            iA += akflVar.a();
            this.b[i3] = akflVar;
        }
        this.d = iA;
    }

    private static final void e(List list, Object[] objArr) {
        if (objArr != null) {
            for (Object obj : objArr) {
                list.add(obj);
            }
        }
    }

    @Override // defpackage.akfl
    public final int a() {
        return this.d;
    }

    @Override // defpackage.akfn
    public final int b() {
        return this.c;
    }

    @Override // defpackage.akfl
    public final int c(akfh akfhVar, CharSequence charSequence, int i) {
        akfl[] akflVarArr = this.b;
        if (akflVarArr == null) {
            throw new UnsupportedOperationException();
        }
        for (int i2 = 0; i2 < akflVarArr.length && i >= 0; i2++) {
            i = akflVarArr[i2].c(akfhVar, charSequence, i);
        }
        return i;
    }

    @Override // defpackage.akfn
    public final void d(Appendable appendable, long j, akcd akcdVar, int i, akcl akclVar, Locale locale) throws IOException {
        akfn[] akfnVarArr = this.a;
        if (akfnVarArr == null) {
            throw new UnsupportedOperationException();
        }
        Locale locale2 = locale == null ? Locale.getDefault() : locale;
        for (akfn akfnVar : akfnVarArr) {
            akfnVar.d(appendable, j, akcdVar, i, akclVar, locale2);
        }
    }
}
