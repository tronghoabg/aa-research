package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import j$.util.Collection;

/* loaded from: classes.dex */
public abstract class kzg {
    public static final yph a = yph.c("GH.AssistIntentResultPr");
    public final Context b;

    public kzg(Context context) {
        context.getClass();
        this.b = context;
    }

    public static final ComponentName b(String str) {
        return (ComponentName) Collection.EL.stream(lem.a().e(kio.b().e(), nyj.a())).map(new koj(15)).filter(new kxo(4)).map(new koj(16)).filter(new koh(str, 12)).findFirst().orElse(null);
    }

    public static final boolean c(Intent intent) {
        String str = intent.getPackage();
        if (str == null) {
            return false;
        }
        return Collection.EL.stream(lem.a().b(kio.b().e(), nyj.b())).filter(new kxo(3)).map(new koj(13)).map(new koj(14)).anyMatch(new koh(str, 11));
    }

    public abstract void a(Intent intent);
}
