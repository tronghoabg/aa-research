package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes3.dex */
public final class tjz implements tjy {
    public final int a;
    public final Integer b;
    public final tjx c;
    public final tki d;
    private final tkf e;
    private final IconCompat f;
    private final tkf g;
    private final tkf h;
    private final lkx i;
    private final tkc j;
    private final htm k;
    private final htm l;

    public tjz(Context context, ept eptVar, String str, int i, Integer num, htm htmVar, htm htmVar2, tke tkeVar) {
        this.a = i;
        this.b = num;
        this.k = htmVar;
        this.l = htmVar2;
        tkc tkcVar = new tkc(1);
        this.j = tkcVar;
        this.e = new tkf(new lku(this, context, new tjw(1)), tkeVar);
        IconCompat iconCompatK = IconCompat.k(Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888));
        this.f = iconCompatK;
        tkf tkfVar = new tkf(new tkb(context, new lku(this, context, new tkc(context, 2)), Integer.valueOf(i)), tkeVar);
        this.g = tkfVar;
        this.c = new tjx(iconCompatK, tkfVar);
        tkf tkfVar2 = new tkf(new tkb(context, new lku(this, context, tkcVar), Integer.valueOf(i)), tkeVar);
        this.h = tkfVar2;
        this.d = new tki(context, eptVar, new tjx(iconCompatK, tkfVar2), str + ":" + i);
        this.i = new lkx(this);
    }

    @Override // defpackage.tjy
    public final /* bridge */ /* synthetic */ Uri a(Object obj) {
        throw new IllegalStateException("Cannot be encoded");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001c A[PHI: r0
  0x001c: PHI (r0v17 java.lang.Boolean) = (r0v8 java.lang.Boolean), (r0v11 java.lang.Boolean), (r0v14 java.lang.Boolean) binds: [B:5:0x001a, B:11:0x002d, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.tjy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ androidx.core.graphics.drawable.IconCompat b(java.lang.Object r6) {
        /*
            r5 = this;
            lkw r6 = (defpackage.lkw) r6
            r6.getClass()
            java.lang.Integer r0 = r5.b
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L42
            lmc r0 = r6.a
            htm r3 = new htm
            android.os.Bundle r0 = r0.n()
            r3.<init>(r0)
            java.lang.Boolean r0 = r3.m()
            if (r0 == 0) goto L21
        L1c:
            boolean r0 = r0.booleanValue()
            goto L3f
        L21:
            htm r0 = r5.k
            if (r0 == 0) goto L2c
            boolean r3 = r6.b
            java.lang.Boolean r0 = r0.n(r3)
            goto L2d
        L2c:
            r0 = r2
        L2d:
            if (r0 == 0) goto L30
            goto L1c
        L30:
            htm r0 = r5.l
            if (r0 == 0) goto L3b
            boolean r3 = r6.b
            java.lang.Boolean r0 = r0.n(r3)
            goto L3c
        L3b:
            r0 = r2
        L3c:
            if (r0 == 0) goto L42
            goto L1c
        L3f:
            if (r0 == 0) goto L42
            r1 = 1
        L42:
            lmc r6 = r6.a
            android.graphics.Bitmap r0 = r6.O()
            if (r0 == 0) goto L56
            tkf r3 = r5.e
            lkv r4 = new lkv
            r4.<init>(r1, r0)
            androidx.core.graphics.drawable.IconCompat r0 = r3.b(r4)
            goto L57
        L56:
            r0 = r2
        L57:
            if (r0 != 0) goto L75
            android.net.Uri r6 = r6.P()
            if (r6 == 0) goto L6a
            lkx r5 = r5.i
            lkv r0 = new lkv
            r0.<init>(r1, r6)
            androidx.core.graphics.drawable.IconCompat r2 = r5.b(r0)
        L6a:
            if (r2 == 0) goto L6d
            return r2
        L6d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Expected media icon bitmap or uri"
            r5.<init>(r6)
            throw r5
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tjz.b(java.lang.Object):androidx.core.graphics.drawable.IconCompat");
    }

    @Override // defpackage.tjy
    public final /* synthetic */ IconCompat c(Uri uri) {
        return szp.y(this, uri);
    }

    @Override // defpackage.tjy
    public final /* bridge */ /* synthetic */ Object d(Uri uri) {
        throw new IllegalStateException("Cannot be decoded");
    }

    public /* synthetic */ tjz(Context context, ept eptVar, String str, int i, Integer num, htm htmVar, htm htmVar2, int i2) {
        this(context, eptVar, str, i, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : htmVar, (i2 & 64) != 0 ? null : htmVar2, tke.b);
    }
}
