package S1;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10909a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f10910b;

    /* renamed from: c, reason: collision with root package name */
    public Map f10911c;

    public v(int i5) {
        this.f10909a = i5;
        switch (i5) {
            case 1:
                this.f10910b = new HashMap();
                break;
            default:
                this.f10910b = new HashMap();
                break;
        }
    }

    private final synchronized Map b() {
        try {
            if (this.f10911c == null) {
                this.f10911c = DesugarCollections.unmodifiableMap(new HashMap(this.f10910b));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f10911c;
    }

    private final synchronized Map c() {
        try {
            if (this.f10911c == null) {
                this.f10911c = DesugarCollections.unmodifiableMap(new HashMap(this.f10910b));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f10911c;
    }

    public final synchronized Map a() {
        switch (this.f10909a) {
            case 0:
                return b();
            default:
                return c();
        }
    }
}
