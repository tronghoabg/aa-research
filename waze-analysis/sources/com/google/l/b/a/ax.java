package com.google.l.b.a;

import java.io.IOException;
import java.util.Locale;
import java.util.StringTokenizer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ax extends com.google.l.u {
    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ Object b(com.google.l.d.b bVar) throws IOException {
        if (bVar.r() == 9) {
            bVar.m();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(bVar.h(), "_");
        String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ void d(com.google.l.d.c cVar, Object obj) throws IOException {
        Locale locale = (Locale) obj;
        cVar.l(locale == null ? null : locale.toString());
    }
}
