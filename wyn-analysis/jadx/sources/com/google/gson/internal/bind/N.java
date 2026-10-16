package com.google.gson.internal.bind;

import com.qonversion.android.sdk.internal.Constants;
import java.io.IOException;
import java.util.Locale;
import java.util.StringTokenizer;
import ra.C3962a;
import ra.C3963b;

/* loaded from: classes4.dex */
public class N extends la.z {
    @Override // la.z
    public final Object b(C3962a c3962a) {
        if (c3962a.e0() == 9) {
            c3962a.a0();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(c3962a.c0(), Constants.USER_ID_SEPARATOR);
        String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        Locale locale = (Locale) obj;
        c3963b.Y(locale == null ? null : locale.toString());
    }
}
