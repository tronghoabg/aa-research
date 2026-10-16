package defpackage;

import androidx.car.app.model.CarText;
import java.util.List;

/* loaded from: classes2.dex */
public final class grr {
    public final List a;
    public final CharSequence b;
    public final int c;
    public final uy d;
    public final uw e;
    public final gkf f;
    public final CarText g;
    public final gkg h;
    private final xs i;

    public grr(List list, xs xsVar, CharSequence charSequence, int i, uy uyVar, uw uwVar, gkf gkfVar, CarText carText, gkg gkgVar) {
        list.getClass();
        xsVar.getClass();
        gkfVar.getClass();
        gkgVar.getClass();
        this.a = list;
        this.i = xsVar;
        this.b = charSequence;
        this.c = i;
        this.d = uyVar;
        this.e = uwVar;
        this.f = gkfVar;
        this.g = carText;
        this.h = gkgVar;
    }

    public static /* synthetic */ grr c(grr grrVar, List list) {
        xs xsVar = grrVar.i;
        CharSequence charSequence = grrVar.b;
        int i = grrVar.c;
        uy uyVar = grrVar.d;
        uw uwVar = grrVar.e;
        gkf gkfVar = grrVar.f;
        CarText carText = grrVar.g;
        gkg gkgVar = grrVar.h;
        list.getClass();
        return new grr(list, xsVar, charSequence, i, uyVar, uwVar, gkfVar, carText, gkgVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.geu r5, defpackage.afck r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.grp
            if (r0 == 0) goto L13
            r0 = r6
            grp r0 = (defpackage.grp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            grp r0 = new grp
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            grr r4 = r0.d
            defpackage.woy.dF(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.woy.dF(r6)
            xs r6 = r4.i
            hel r2 = defpackage.hel.a
            r0.d = r4
            r0.c = r3
            r3 = 100
            java.lang.Object r6 = r2.a(r6, r5, r3, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.util.List r6 = (java.util.List) r6
            grr r4 = c(r4, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.grr.a(geu, afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.geu r5, defpackage.afck r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.grq
            if (r0 == 0) goto L13
            r0 = r6
            grq r0 = (defpackage.grq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            grq r0 = new grq
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            grr r4 = r0.d
            defpackage.woy.dF(r6)
            goto L44
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.woy.dF(r6)
            xs r6 = r4.i
            r0.d = r4
            r0.c = r3
            r2 = 0
            r3 = 100
            java.lang.Object r6 = defpackage.hel.b(r6, r5, r2, r3, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            java.util.List r6 = (java.util.List) r6
            grr r4 = c(r4, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.grr.b(geu, afck):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof grr)) {
            return false;
        }
        grr grrVar = (grr) obj;
        return affa.f(this.a, grrVar.a) && affa.f(this.i, grrVar.i) && affa.f(this.b, grrVar.b) && this.c == grrVar.c && affa.f(this.d, grrVar.d) && affa.f(this.e, grrVar.e) && this.f == grrVar.f && affa.f(this.g, grrVar.g) && this.h == grrVar.h;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.i.hashCode();
        CharSequence charSequence = this.b;
        int iHashCode2 = ((((iHashCode * 31) + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + this.c) * 31;
        uy uyVar = this.d;
        int iHashCode3 = (iHashCode2 + (uyVar == null ? 0 : uyVar.hashCode())) * 31;
        uw uwVar = this.e;
        int iHashCode4 = (((iHashCode3 + (uwVar == null ? 0 : uwVar.hashCode())) * 31) + this.f.hashCode()) * 31;
        CarText carText = this.g;
        return ((iHashCode4 + (carText != null ? carText.hashCode() : 0)) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "MenuSectionInternal(items=" + this.a + ", itemsDelegate=" + this.i + ", noItemsMessage=" + ((Object) this.b) + ", selectedIndex=" + this.c + ", onSelectedListener=" + this.d + ", onItemVisibilityChangedListener=" + this.e + ", itemSize=" + this.f + ", header=" + this.g + ", textAlign=" + this.h + ")";
    }

    public /* synthetic */ grr(List list, xs xsVar, CharSequence charSequence, gkf gkfVar, CarText carText) {
        this(list, xsVar, charSequence, 0, null, null, gkfVar, carText, (gkfVar == gkf.d || gkfVar == gkf.c) ? gkg.b : gkg.a);
    }
}
