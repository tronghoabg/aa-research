package aa;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f17477c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f17478a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17479b;

    public o(Context context, String str) {
        this.f17478a = context;
        this.f17479b = str;
    }

    public final synchronized void a() {
        this.f17478a.deleteFile(this.f17479b);
    }
}
