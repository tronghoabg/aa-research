package defpackage;

import android.content.ContentResolver;

/* loaded from: classes2.dex */
final class sxm extends sxo {
    public sxm(String str, Boolean bool) {
        super(str, bool);
    }

    @Override // defpackage.sxo
    public final /* bridge */ /* synthetic */ Object a() {
        ContentResolver contentResolver = sxo.a;
        boolean zBooleanValue = ((Boolean) this.c).booleanValue();
        return Boolean.valueOf(sxf.a.a(contentResolver, this.b, zBooleanValue));
    }
}
