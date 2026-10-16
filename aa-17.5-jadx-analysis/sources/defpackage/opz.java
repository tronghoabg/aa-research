package defpackage;

import android.appwidget.AppWidgetProviderInfo;
import j$.time.Duration;

/* loaded from: classes2.dex */
public final class opz extends afde implements afeg {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opz(Object obj, boolean z, Duration duration, afck afckVar, int i) {
        super(2, afckVar);
        this.f = i;
        this.c = obj;
        this.b = z;
        this.d = duration;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        if (this.f != 0) {
            opz opzVar = new opz(this.c, this.b, (Duration) this.d, afckVar, 1);
            opzVar.e = obj;
            return opzVar;
        }
        Object obj2 = this.c;
        mva mvaVar = (mva) obj2;
        opz opzVar2 = new opz(mvaVar, (AppWidgetProviderInfo) this.d, this.b, afckVar, 0);
        opzVar2.e = obj;
        return opzVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r2 != 2) goto L15;
     */
    /* JADX WARN: Path cross not found for [B:15:0x0040, B:19:0x0056], limit reached: 34 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0054 -> B:19:0x0056). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            int r0 = r9.f
            r1 = 1
            if (r0 == 0) goto L72
            afcr r0 = defpackage.afcr.a
            int r2 = r9.a
            r3 = 2
            if (r2 == 0) goto L20
            if (r2 == r1) goto L18
            java.lang.Object r1 = r9.e
            sx r1 = (defpackage.sx) r1
            defpackage.woy.dF(r10)
            if (r2 == r3) goto L56
            goto L40
        L18:
            java.lang.Object r1 = r9.e
            sx r1 = (defpackage.sx) r1
            defpackage.woy.dF(r10)
            goto L40
        L20:
            defpackage.woy.dF(r10)
            java.lang.Object r10 = r9.e
            sx r10 = (defpackage.sx) r10
            java.lang.Object r2 = r9.c
            com.google.android.apps.auto.components.media.compat.AaPlaybackState r2 = (com.google.android.apps.auto.components.media.compat.AaPlaybackState) r2
            int r2 = defpackage.omu.a(r2)
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r2)
            r9.e = r10
            r9.a = r1
            java.lang.Object r1 = r10.t(r4, r9)
            if (r1 != r0) goto L3f
            goto L6e
        L3f:
            r1 = r10
        L40:
            boolean r10 = r9.b
            if (r10 == 0) goto L6f
            java.lang.Object r10 = r9.d
            j$.time.Duration r10 = (j$.time.Duration) r10
            long r4 = r10.toMillis()
            r9.e = r1
            r9.a = r3
            java.lang.Object r10 = defpackage.aiow.c(r4, r9)
            if (r10 == r0) goto L6e
        L56:
            java.lang.Object r10 = r9.c
            com.google.android.apps.auto.components.media.compat.AaPlaybackState r10 = (com.google.android.apps.auto.components.media.compat.AaPlaybackState) r10
            int r10 = defpackage.omu.a(r10)
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r10)
            r9.e = r1
            r10 = 3
            r9.a = r10
            java.lang.Object r10 = r1.t(r2, r9)
            if (r10 != r0) goto L40
        L6e:
            return r0
        L6f:
            afak r9 = defpackage.afak.a
            return r9
        L72:
            afcr r0 = defpackage.afcr.a
            int r2 = r9.a
            if (r2 == 0) goto L80
            java.lang.Object r9 = r9.e
            bxd r9 = (defpackage.bxd) r9
            defpackage.woy.dF(r10)
            goto Lac
        L80:
            defpackage.woy.dF(r10)
            java.lang.Object r10 = r9.e
            bxd r10 = (defpackage.bxd) r10
            java.lang.Object r2 = r9.c
            if (r2 != 0) goto Lb0
            mkk r2 = defpackage.mkm.a
            aitu r2 = r2.d()
            java.lang.Object r3 = r9.d
            boolean r4 = r9.b
            kvr r5 = new kvr
            android.appwidget.AppWidgetProviderInfo r3 = (android.appwidget.AppWidgetProviderInfo) r3
            r6 = 0
            r7 = 4
            r5.<init>(r3, r4, r6, r7)
            r9.e = r10
            r9.a = r1
            java.lang.Object r9 = defpackage.ahnc.a(r2, r5, r9)
            if (r9 != r0) goto La9
            return r0
        La9:
            r8 = r10
            r10 = r9
            r9 = r8
        Lac:
            r2 = r10
            mva r2 = (defpackage.mva) r2
            r10 = r9
        Lb0:
            r10.b(r2)
            afak r9 = defpackage.afak.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.opz.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((opz) b((sx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((opz) b((bxd) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opz(mva mvaVar, AppWidgetProviderInfo appWidgetProviderInfo, boolean z, afck afckVar, int i) {
        super(2, afckVar);
        this.f = i;
        this.c = mvaVar;
        this.d = appWidgetProviderInfo;
        this.b = z;
    }
}
