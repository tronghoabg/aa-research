package defpackage;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class rmp implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ rmk c;

    public rmp(rmk rmkVar, String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
        this.c = rmkVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        return Boolean.valueOf(this.c.a.performPrivateCommand(this.a, this.b));
    }
}
