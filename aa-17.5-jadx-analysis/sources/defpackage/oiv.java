package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class oiv {
    public final Context a;
    public oiu b;
    public oix c;
    private final Executor d;

    public oiv(Context context, Executor executor) {
        this.a = context;
        this.d = executor;
    }

    public static oiv a() {
        return (oiv) mki.a.i(oiv.class);
    }

    public final rxi b() {
        return new rxi(this.a, this.d);
    }
}
