package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
final class zzw implements hqy {
    final /* synthetic */ zzz a;
    private final /* synthetic */ int b;

    public zzw(zzz zzzVar, int i) {
        this.b = i;
        this.a = zzzVar;
    }

    @Override // defpackage.hqy
    public final /* synthetic */ void b(Object obj) {
        int i = this.b;
        if (i == 0) {
            String strReplace = ((String) obj).replace("[", "").replace("]", "").replace("\"", "").replace(",", ", ");
            zzz zzzVar = this.a;
            zzzVar.n = ("©" + zzzVar.e.get(1) + " " + strReplace).trim();
            zzzVar.c();
            return;
        }
        zzz zzzVar2 = this.a;
        if (i != 1) {
            zzzVar2.o = (Bitmap) obj;
            if (zzzVar2.h.a) {
                zzzVar2.c();
                return;
            }
            return;
        }
        zzzVar2.m = (Bitmap) obj;
        ztc ztcVar = zzzVar2.h;
        if (ztcVar == null || !ztcVar.a) {
            zzzVar2.c();
        }
    }
}
