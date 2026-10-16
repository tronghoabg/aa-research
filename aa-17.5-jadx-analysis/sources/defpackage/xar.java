package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;

/* loaded from: classes3.dex */
final class xar implements exl {
    final /* synthetic */ xas a;
    private final exl b;

    public xar(xas xasVar, exl exlVar) {
        this.a = xasVar;
        this.b = exlVar;
    }

    @Override // defpackage.exl
    public final boolean a(Preference preference, Object obj) {
        yzy yzyVar;
        String str = preference.t;
        yzy yzyVar2 = yzy.a;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        xas xasVar = this.a;
        if (!zIsEmpty && (yzyVar = (yzy) xasVar.l().get(str)) != null) {
            yzyVar2 = yzyVar;
        }
        xasVar.p(yzyVar2);
        if (Boolean.TRUE.equals(obj)) {
            xasVar.p(xas.q(xasVar.n(), preference.t));
        } else if (Boolean.FALSE.equals(obj)) {
            xasVar.p(xas.q(xasVar.m(), preference.t));
        }
        xasVar.p(yzy.cH);
        return this.b.a(preference, obj);
    }
}
