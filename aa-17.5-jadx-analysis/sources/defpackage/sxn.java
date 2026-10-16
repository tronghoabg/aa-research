package defpackage;

import android.content.ContentResolver;

/* loaded from: classes2.dex */
public final class sxn extends sxo {
    public sxn(Integer num) {
        super("gms:feedback_client:feedback_options_max_data_size", num);
    }

    @Override // defpackage.sxo
    public final /* bridge */ /* synthetic */ Object a() throws sxk, NumberFormatException {
        int iIntValue;
        ContentResolver contentResolver = sxo.a;
        Integer num = (Integer) this.c;
        int iIntValue2 = num.intValue();
        sxh sxhVar = sxf.a;
        sxl sxlVar = (sxl) sxhVar;
        sxlVar.f(contentResolver);
        sxlVar.d(contentResolver);
        sxlVar.e.lock();
        String str = this.b;
        try {
            Object obj = ((sxl) sxhVar).i;
            Integer numValueOf = (Integer) ((sxl) sxhVar).c(((sxl) sxhVar).g, str, num, sxl.b);
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                String strB = sxlVar.b(contentResolver, str);
                if (strB != null) {
                    try {
                        int i = Integer.parseInt(strB);
                        numValueOf = Integer.valueOf(i);
                        iIntValue2 = i;
                    } catch (NumberFormatException unused) {
                    }
                }
                sxlVar.e(obj, sxlVar.g, str, numValueOf, sxl.b);
                iIntValue = iIntValue2;
            }
            return Integer.valueOf(iIntValue);
        } finally {
            sxlVar.e.unlock();
        }
    }
}
