package defpackage;

import android.content.Context;
import com.google.android.projection.gearhead.R;
import j$.util.Collection;
import j$.util.stream.Collector;
import j$.util.stream.Stream;

/* loaded from: classes2.dex */
final class kfe extends llu {
    final /* synthetic */ kff a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfe(kff kffVar) {
        super((float[]) null);
        this.a = kffVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.llu
    public final void e(String str, yfq yfqVar) {
        kff kffVar = this.a;
        kffVar.e.r(str);
        kffVar.d--;
        Integer num = (Integer) kffVar.b.get(str);
        num.getClass();
        int iIntValue = num.intValue() + 1;
        yfl yflVar = kffVar.c;
        Stream streamFilter = Collection.EL.stream(yfqVar).filter(new hmd(18));
        int i = yfq.d;
        Collector collector = ycm.a;
        yflVar.k((Iterable) streamFilter.collect(collector));
        int i2 = 19;
        if (iIntValue < 2) {
            yfq yfqVar2 = (yfq) Collection.EL.stream(yfqVar).filter(new hmd(i2)).collect(collector);
            int size = yfqVar2.size();
            for (int i3 = 0; i3 < size; i3++) {
                kffVar.b(((llu) yfqVar2.get(i3)).i(), iIntValue);
            }
        }
        if (kffVar.d <= 0) {
            yfq yfqVarG = kffVar.c.g();
            if (yfqVarG.isEmpty()) {
                kffVar.c(3, kffVar.a.getString(R.string.uri_image_validation_test_all_passed));
                return;
            }
            Context context = kffVar.a;
            yfq yfqVarG2 = (yfq) Collection.EL.stream(yfqVarG).limit(15L).map(new jxe(i2)).collect(collector);
            int i4 = ((yls) yfqVarG).c;
            if (i4 > 15) {
                yfl yflVar2 = new yfl(4);
                yflVar2.k(yfqVarG2);
                yflVar2.i(kffVar.a.getString(R.string.uri_image_validation_test_failed_extra_invalid_icons, Integer.valueOf(i4 - 15)));
                yfqVarG2 = yflVar2.g();
            }
            kffVar.c(2, context.getString(R.string.uri_image_validation_test_failed_icons_found, new xxd(", ").b(yfqVarG2)));
        }
    }

    @Override // defpackage.llu
    public final void f(String str) {
        kff kffVar = this.a;
        kffVar.c(1, kffVar.a.getString(R.string.uri_image_validation_test_failed_subscription_on_error, str));
    }
}
