package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* loaded from: classes.dex */
final class dcm extends afde implements afeg {
    Object a;
    int b;
    final /* synthetic */ ContentResolver c;
    final /* synthetic */ Uri d;
    final /* synthetic */ dcn e;
    final /* synthetic */ aixl f;
    final /* synthetic */ Context g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcm(ContentResolver contentResolver, Uri uri, dcn dcnVar, aixl aixlVar, Context context, afck afckVar) {
        super(2, afckVar);
        this.c = contentResolver;
        this.d = uri;
        this.e = dcnVar;
        this.f = aixlVar;
        this.g = context;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        dcm dcmVar = new dcm(this.c, this.d, this.e, this.f, this.g, afckVar);
        dcmVar.h = obj;
        return dcmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #0 {all -> 0x007e, blocks: (B:7:0x000f, B:14:0x0034, B:16:0x0043, B:18:0x004b, B:10:0x0017, B:13:0x002d), top: B:28:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0071 -> B:14:0x0034). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r6.b
            r2 = 1
            if (r1 == 0) goto L1b
            java.lang.Object r3 = r6.a
            if (r1 == r2) goto L13
            java.lang.Object r1 = r6.h
            aiyl r1 = (defpackage.aiyl) r1
            defpackage.woy.dF(r7)     // Catch: java.lang.Throwable -> L7e
            goto L34
        L13:
            java.lang.Object r1 = r6.h
            aiyl r1 = (defpackage.aiyl) r1
            defpackage.woy.dF(r7)     // Catch: java.lang.Throwable -> L7e
            goto L43
        L1b:
            defpackage.woy.dF(r7)
            java.lang.Object r7 = r6.h
            r1 = r7
            aiyl r1 = (defpackage.aiyl) r1
            android.content.ContentResolver r7 = r6.c
            android.net.Uri r3 = r6.d
            r4 = 0
            dcn r5 = r6.e
            r7.registerContentObserver(r3, r4, r5)
            aixl r7 = r6.f     // Catch: java.lang.Throwable -> L7e
            aiwz r7 = r7.A()     // Catch: java.lang.Throwable -> L7e
            r3 = r7
        L34:
            r6.h = r1     // Catch: java.lang.Throwable -> L7e
            r6.a = r3     // Catch: java.lang.Throwable -> L7e
            r6.b = r2     // Catch: java.lang.Throwable -> L7e
            r7 = r3
            aiwz r7 = (defpackage.aiwz) r7     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r7 = r7.a(r6)     // Catch: java.lang.Throwable -> L7e
            if (r7 == r0) goto L80
        L43:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L7e
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L7e
            if (r7 == 0) goto L74
            r7 = r3
            aiwz r7 = (defpackage.aiwz) r7     // Catch: java.lang.Throwable -> L7e
            r7.b()     // Catch: java.lang.Throwable -> L7e
            android.content.Context r7 = r6.g     // Catch: java.lang.Throwable -> L7e
            aan r4 = defpackage.dco.a     // Catch: java.lang.Throwable -> L7e
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r4 = "animator_duration_scale"
            r5 = 1065353216(0x3f800000, float:1.0)
            float r7 = android.provider.Settings.Global.getFloat(r7, r4, r5)     // Catch: java.lang.Throwable -> L7e
            java.lang.Float r4 = new java.lang.Float     // Catch: java.lang.Throwable -> L7e
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L7e
            r6.h = r1     // Catch: java.lang.Throwable -> L7e
            r6.a = r3     // Catch: java.lang.Throwable -> L7e
            r7 = 2
            r6.b = r7     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r7 = r1.a(r4, r6)     // Catch: java.lang.Throwable -> L7e
            if (r7 != r0) goto L34
            goto L80
        L74:
            android.content.ContentResolver r7 = r6.c
            dcn r6 = r6.e
            r7.unregisterContentObserver(r6)
            afak r6 = defpackage.afak.a
            return r6
        L7e:
            r7 = move-exception
            goto L81
        L80:
            return r0
        L81:
            android.content.ContentResolver r0 = r6.c
            dcn r6 = r6.e
            r0.unregisterContentObserver(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcm.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((dcm) b((aiyl) obj, (afck) obj2)).hT(afak.a);
    }
}
