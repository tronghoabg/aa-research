package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class dwh implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;
    final /* synthetic */ dwg c;
    final /* synthetic */ int d;

    public dwh(String str, Context context, dwg dwgVar, int i) {
        this.a = str;
        this.b = context;
        this.c = dwgVar;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        return dwk.b(this.a, this.b, rz.m(new Object[]{this.c}), this.d);
    }
}
