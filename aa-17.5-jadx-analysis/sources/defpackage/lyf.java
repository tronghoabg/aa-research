package defpackage;

import android.content.Context;
import j$.util.Collection;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final class lyf {
    public static final yob a = yob.c("com/google/android/apps/auto/components/messaging/template/MessagingRemoteAppDescriptionFactory");
    public final Context b = mki.a.c;
    public final Function c;

    public lyf(Function function) {
        this.c = function;
    }

    public static lyf a() {
        return (lyf) mki.a.b(lyf.class, new lpu(18));
    }

    public final ygr b() {
        return (ygr) Collection.EL.stream(lup.e().b(kio.b().e(), nyj.a())).filter(new lye(1)).collect(ycm.b);
    }
}
