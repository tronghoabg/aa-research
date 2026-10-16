package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bki {
    public final android.content.Context a;
    public final defpackage.bkm b;
    public android.view.textclassifier.TextClassifier c;
    private final defpackage.afdo f;
    private final defpackage.dkl g;
    public final ajey e = new ajey();
    private final defpackage.bwx h = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.bxv.c);
    public final java.lang.Object d = new java.lang.Object();

    public bki(defpackage.afdo afdoVar, android.content.Context context, defpackage.bkm bkmVar, defpackage.dkl dklVar) {
        this.f = afdoVar;
        this.a = context;
        this.b = bkmVar;
        this.g = dklVar;
    }

    public final android.os.LocaleList a() {
        defpackage.dkl dklVar = this.g;
        if (dklVar == null) {
            return new android.os.LocaleList(defpackage.dkm.a.a().a().a);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(dklVar, 10));
        java.util.Iterator<E> it = dklVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((defpackage.dkk) it.next()).a);
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        return new android.os.LocaleList((java.util.Locale[]) java.util.Arrays.copyOf(localeArr, localeArr.length));
    }

    public final defpackage.bll b(java.lang.CharSequence charSequence, long j, android.view.textclassifier.TextClassification textClassification) {
        android.graphics.drawable.Icon iconM;
        int size = hh$.ExternalSyntheticApiModelOutline0.m(textClassification).size();
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        for (int i = 0; i < size; i++) {
            java.lang.Object obj = hh$.ExternalSyntheticApiModelOutline0.m(textClassification).get(i);
            android.app.RemoteAction remoteActionM = a$.ExternalSyntheticApiModelOutline1.m(obj);
            android.graphics.drawable.Drawable drawableLoadDrawable = null;
            if (i != 0 && !hh$.ExternalSyntheticApiModelOutline0.m(remoteActionM)) {
                obj = null;
            }
            android.app.RemoteAction remoteActionM2 = a$.ExternalSyntheticApiModelOutline1.m(obj);
            if (remoteActionM2 != null && (iconM = a$.ExternalSyntheticApiModelOutline1.m(remoteActionM2)) != null) {
                drawableLoadDrawable = iconM.loadDrawable(this.a);
            }
            arrayList.add(drawableLoadDrawable);
        }
        return new defpackage.bll(charSequence, j, textClassification, arrayList);
    }

    public final defpackage.bll c() {
        return (defpackage.bll) this.h.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a9, code lost:
    
        if (r6.b(r0) != r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.CharSequence r6, long r7, android.view.textclassifier.TextClassifier r9, defpackage.afdk r10) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r10 instanceof defpackage.bkd
            if (r0 == 0) goto L13
            r0 = r10
            bkd r0 = (defpackage.bkd) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            bkd r0 = new bkd
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.d
            afdr r1 = defpackage.afdr.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4f
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.b
            ajey r6 = (ajey) r6
            java.lang.Object r7 = r0.a
            bll r7 = (defpackage.bll) r7
            defpackage.afga.cz(r10)
            goto Lab
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            long r7 = r0.c
            ajey r6 = r0.g
            java.lang.Object r9 = r0.b
            android.view.textclassifier.TextClassifier r9 = a$.ExternalSyntheticApiModelOutline1.m(r9)
            java.lang.Object r2 = r0.a
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            defpackage.afga.cz(r10)
            r10 = r6
            r6 = r2
            goto L64
        L4f:
            defpackage.afga.cz(r10)
            ajey r10 = r5.e
            r0.a = r6
            r0.b = r9
            r0.g = r10
            r0.c = r7
            r0.f = r4
            java.lang.Object r2 = r10.b(r0)
            if (r2 == r1) goto Lbe
        L64:
            bll r2 = r5.c()     // Catch: java.lang.Throwable -> Lb9
            if (r2 == 0) goto L76
            boolean r2 = defpackage.bkk.a(r2, r6, r7)     // Catch: java.lang.Throwable -> Lb9
            if (r2 != r4) goto L76
            afbk r5 = defpackage.afbk.a     // Catch: java.lang.Throwable -> Lb9
            r10.d()
            return r5
        L76:
            r10.d()
            android.view.textclassifier.TextClassification$Request$Builder r10 = new android.view.textclassifier.TextClassification$Request$Builder
            int r2 = defpackage.dgc.d(r7)
            int r4 = defpackage.dgc.c(r7)
            r10.<init>(r6, r2, r4)
            android.os.LocaleList r2 = r5.a()
            android.view.textclassifier.TextClassification$Request$Builder r10 = hh$.ExternalSyntheticApiModelOutline0.m(r10, r2)
            android.view.textclassifier.TextClassification$Request r10 = hh$.ExternalSyntheticApiModelOutline0.m(r10)
            android.view.textclassifier.TextClassification r9 = hh$.ExternalSyntheticApiModelOutline0.m(r9, r10)
            bll r7 = r5.b(r6, r7, r9)
            ajey r6 = r5.e
            r0.a = r7
            r0.b = r6
            r8 = 0
            r0.g = r8
            r0.f = r3
            java.lang.Object r8 = r6.b(r0)
            if (r8 == r1) goto Lbe
        Lab:
            r5.g(r7)     // Catch: java.lang.Throwable -> Lb4
            r6.d()
            afbk r5 = defpackage.afbk.a
            return r5
        Lb4:
            r5 = move-exception
            r6.d()
            throw r5
        Lb9:
            r5 = move-exception
            r10.d()
            throw r5
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bki.d(java.lang.CharSequence, long, android.view.textclassifier.TextClassifier, afdk):java.lang.Object");
    }

    public final java.lang.Object e(java.lang.CharSequence charSequence, long j, defpackage.afdk afdkVar) {
        return (charSequence.length() == 0 || defpackage.dgc.i(j)) ? defpackage.afbk.a : f(new defpackage.bke(this, charSequence, j, null), afdkVar);
    }

    public final java.lang.Object f(defpackage.affg affgVar, defpackage.afdk afdkVar) {
        return ahoc.a(this.f, new defpackage.bkg(this, affgVar, null), afdkVar);
    }

    public final void g(defpackage.bll bllVar) {
        this.h.b(bllVar);
    }
}
