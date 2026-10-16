package u8;

import O9.b;
import android.content.Context;
import java.util.HashMap;
import t8.C4149c;

/* renamed from: u8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4262a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f46734a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f46735b;

    /* renamed from: c, reason: collision with root package name */
    public final b f46736c;

    public C4262a(Context context, b bVar) {
        this.f46735b = context;
        this.f46736c = bVar;
    }

    public final synchronized C4149c a(String str) {
        try {
            if (!this.f46734a.containsKey(str)) {
                this.f46734a.put(str, new C4149c(this.f46736c, str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C4149c) this.f46734a.get(str);
    }
}
