package defpackage;

import android.content.SharedPreferences;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class fzr implements afec {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ fzr(long j, ckv ckvVar, int i) {
        this.c = i;
        this.a = j;
        this.b = ckvVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [gaq, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        SharedPreferences.Editor editorPutString;
        SharedPreferences.Editor editorPutLong;
        int i = this.c;
        int i2 = 1;
        if (i == 0) {
            cgz cgzVar = (cgz) obj;
            cgzVar.getClass();
            return cgzVar.q(new chk(new fzr(this.b, this.a, i2), i2));
        }
        if (i == 1) {
            cmd cmdVar = (cmd) obj;
            cmdVar.getClass();
            czz.aJ(cmdVar, new cjm(this.b.a((int) cjd.a(cmdVar.o()))), this.a, null, 60);
            return afak.a;
        }
        if (i == 2) {
            cmd cmdVar2 = (cmd) obj;
            cmdVar2.getClass();
            long j = this.a;
            long jM = cjn.m(cjv.d(j), cjv.c(j), cjv.b(j), 0.5f);
            if (affa.f(this.b, bcr.a)) {
                czz.aH(cmdVar2, jM, BitmapDescriptorFactory.HUE_RED, 0L, null, 126);
            } else {
                czz.I(cmdVar2, jM, 0L, 0L, BitmapDescriptorFactory.HUE_RED, null, 126);
            }
            return afak.a;
        }
        SharedPreferences sharedPreferences = (SharedPreferences) obj;
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (editorEdit == null || (editorPutString = editorEdit.putString("zb", (String) this.b)) == null || (editorPutLong = editorPutString.putLong("zb_lut", this.a)) == null) {
            return null;
        }
        editorPutLong.commit();
        return null;
    }

    public /* synthetic */ fzr(Object obj, long j, int i) {
        this.c = i;
        this.b = obj;
        this.a = j;
    }
}
