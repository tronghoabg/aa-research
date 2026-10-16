package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class kfr extends kfx {
    final /* synthetic */ Bitmap a;
    final /* synthetic */ kfs b;
    final /* synthetic */ kft c;

    public kfr(kft kftVar, Bitmap bitmap, kfs kfsVar) {
        this.a = bitmap;
        this.b = kfsVar;
        this.c = kftVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    @Override // defpackage.kfx
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap doInBackground(defpackage.kfw... r6) {
        /*
            r5 = this;
            android.graphics.Bitmap r0 = r5.a
            if (r0 == 0) goto L5
            return r0
        L5:
            android.graphics.Bitmap r0 = super.doInBackground(r6)
            if (r0 == 0) goto L4b
            kft r1 = r5.c
            r2 = 0
            r6 = r6[r2]
            kfu r5 = r5.d
            boolean r5 = r5.a
            java.lang.String r6 = r6.a()
            int r2 = r0.getHeight()
            java.lang.String r6 = defpackage.kft.b(r6, r2)
            android.util.LruCache r1 = r1.e
            java.lang.Object r2 = r1.get(r6)
            admq r2 = (defpackage.admq) r2
            if (r2 == 0) goto L43
            java.lang.Object r2 = r2.b
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            int r3 = r2.getWidth()
            int r4 = r0.getWidth()
            if (r3 < r4) goto L43
            int r2 = r2.getHeight()
            int r3 = r0.getHeight()
            if (r2 < r3) goto L43
            goto L4b
        L43:
            admq r2 = new admq
            r2.<init>(r0, r5)
            r1.put(r6, r2)
        L4b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfr.doInBackground(kfw[]):android.graphics.Bitmap");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.kfx
    /* renamed from: b */
    public final void onPostExecute(Bitmap bitmap) {
        kfs kfsVar = this.b;
        lna lnaVar = kfsVar.c.g;
        if (lnaVar == null) {
            ((ype) lnb.a.l().ai((char) 4017)).u("The callback comes after we finish");
        } else {
            lnaVar.sendMessage(lnaVar.obtainMessage(2, kfsVar.b, 0, bitmap));
        }
    }

    @Override // defpackage.kfx, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return doInBackground((kfw[]) objArr);
    }

    @Override // defpackage.kfx, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((Bitmap) obj);
    }
}
