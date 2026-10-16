package defpackage;

import android.content.Context;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class lvr implements lty {
    @Override // defpackage.lty
    public final String a(lue lueVar) {
        Context context = mki.a.c;
        if (!lws.d().j(lueVar)) {
            return context.getString(R.string.select_to_read_aloud);
        }
        qjl qjlVar = (qjl) yrm.an(lueVar.e());
        String str = qjlVar.c;
        return lueVar.i() ? mki.a.c.getResources().getString(R.string.sender_and_body, qjlVar.a, str) : str;
    }
}
