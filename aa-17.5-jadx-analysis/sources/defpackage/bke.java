package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class bke {
    public final Context a;
    public final bki b;
    public TextClassifier c;
    private final afco f;
    private final dkd g;
    public final ajdz e = new ajdz();
    private final bwq h = new ParcelableSnapshotMutableState(null, bxp.c);
    public final Object d = new Object();

    public bke(afco afcoVar, Context context, bki bkiVar, dkd dkdVar) {
        this.f = afcoVar;
        this.a = context;
        this.b = bkiVar;
        this.g = dkdVar;
    }

    public final LocaleList a() {
        dkd dkdVar = this.g;
        if (dkdVar == null) {
            return new LocaleList(dke.a.a().a().a);
        }
        ArrayList arrayList = new ArrayList(woy.bp(dkdVar, 10));
        Iterator<E> it = dkdVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((dkc) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }

    public final blg b(CharSequence charSequence, long j, TextClassification textClassification) {
        Icon icon;
        int size = textClassification.getActions().size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            Object obj = textClassification.getActions().get(i);
            RemoteAction remoteActionM = a$$ExternalSyntheticApiModelOutline0.m(obj);
            Drawable drawableLoadDrawable = null;
            if (i != 0 && !remoteActionM.shouldShowIcon()) {
                obj = null;
            }
            RemoteAction remoteActionM2 = a$$ExternalSyntheticApiModelOutline0.m(obj);
            if (remoteActionM2 != null && (icon = remoteActionM2.getIcon()) != null) {
                drawableLoadDrawable = icon.loadDrawable(this.a);
            }
            arrayList.add(drawableLoadDrawable);
        }
        return new blg(charSequence, j, textClassification, arrayList);
    }

    public final blg c() {
        return (blg) this.h.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a9, code lost:
    
        if (r6.b(r0) != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.CharSequence r6, long r7, android.view.textclassifier.TextClassifier r9, defpackage.afck r10) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r10 instanceof defpackage.bjz
            if (r0 == 0) goto L13
            r0 = r10
            bjz r0 = (defpackage.bjz) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            bjz r0 = new bjz
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.d
            afcr r1 = defpackage.afcr.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4f
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.b
            ajdz r6 = (defpackage.ajdz) r6
            java.lang.Object r7 = r0.a
            blg r7 = (defpackage.blg) r7
            defpackage.woy.dF(r10)
            goto Lab
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            long r7 = r0.c
            ajdz r6 = r0.g
            java.lang.Object r9 = r0.b
            android.view.textclassifier.TextClassifier r9 = defpackage.a$$ExternalSyntheticApiModelOutline0.m11m(r9)
            java.lang.Object r2 = r0.a
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            defpackage.woy.dF(r10)
            r10 = r6
            r6 = r2
            goto L64
        L4f:
            defpackage.woy.dF(r10)
            ajdz r10 = r5.e
            r0.a = r6
            r0.b = r9
            r0.g = r10
            r0.c = r7
            r0.f = r4
            java.lang.Object r2 = r10.b(r0)
            if (r2 == r1) goto Lbe
        L64:
            blg r2 = r5.c()     // Catch: java.lang.Throwable -> Lb9
            if (r2 == 0) goto L76
            boolean r2 = defpackage.bkg.a(r2, r6, r7)     // Catch: java.lang.Throwable -> Lb9
            if (r2 != r4) goto L76
            afak r5 = defpackage.afak.a     // Catch: java.lang.Throwable -> Lb9
            r10.d()
            return r5
        L76:
            r10.d()
            android.view.textclassifier.TextClassification$Request$Builder r10 = new android.view.textclassifier.TextClassification$Request$Builder
            int r2 = defpackage.dfv.d(r7)
            int r4 = defpackage.dfv.c(r7)
            r10.<init>(r6, r2, r4)
            android.os.LocaleList r2 = r5.a()
            android.view.textclassifier.TextClassification$Request$Builder r10 = defpackage.hg$$ExternalSyntheticApiModelOutline0.m(r10, r2)
            android.view.textclassifier.TextClassification$Request r10 = defpackage.hg$$ExternalSyntheticApiModelOutline0.m(r10)
            android.view.textclassifier.TextClassification r9 = defpackage.hg$$ExternalSyntheticApiModelOutline0.m(r9, r10)
            blg r7 = r5.b(r6, r7, r9)
            ajdz r6 = r5.e
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
            afak r5 = defpackage.afak.a
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bke.d(java.lang.CharSequence, long, android.view.textclassifier.TextClassifier, afck):java.lang.Object");
    }

    public final Object e(CharSequence charSequence, long j, afck afckVar) {
        return (charSequence.length() == 0 || dfv.i(j)) ? afak.a : f(new bka(this, charSequence, j, null), afckVar);
    }

    public final Object f(afeg afegVar, afck afckVar) {
        return ahnc.a(this.f, new bkc(this, afegVar, null), afckVar);
    }

    public final void g(blg blgVar) {
        this.h.b(blgVar);
    }
}
