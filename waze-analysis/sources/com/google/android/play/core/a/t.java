package com.google.android.play.core.a;

import android.content.Context;
import com.waze.navigate.di;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private static d f6961a;

    t() {
        new di("IntegrityDialogWrapper");
    }

    public static f d(Context context) {
        return (f) e(context).f6931e.get();
    }

    static synchronized d e(Context context) {
        d dVarA;
        dVarA = f6961a;
        if (dVarA == null) {
            c cVar = new c();
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            cVar.b(context);
            dVarA = cVar.a();
            f6961a = dVarA;
        }
        return dVarA;
    }

    public void a(Object obj) {
        throw null;
    }

    public void c(Object obj) {
        throw null;
    }

    public t(byte[] bArr, byte[] bArr2) {
    }

    t(byte[] bArr) {
    }

    t(g.a.a aVar, g.a.a aVar2) {
    }
}
