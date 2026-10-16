package ya;

import android.content.Context;
import androidx.fragment.app.X;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final L8.b f48058b;

    /* renamed from: a, reason: collision with root package name */
    public final Context f48059a;

    static {
        L8.a aVarB = L8.b.b(k.class);
        aVarB.c(L8.l.d(g.class));
        aVarB.c(L8.l.d(Context.class));
        aVarB.f6989g = new X(16);
        f48058b = aVarB.d();
    }

    public k(Context context) {
        this.f48059a = context;
    }

    public final synchronized String a() {
        String string = this.f48059a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        this.f48059a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }
}
