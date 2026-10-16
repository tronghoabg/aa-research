package u5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import t6.q;

/* renamed from: u5.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4254e {

    /* renamed from: a, reason: collision with root package name */
    public final q f46656a;

    /* renamed from: b, reason: collision with root package name */
    public final C4253d f46657b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f46658c;

    public C4254e(Context context, C4253d c4253d) {
        q qVar = new q(context, 4);
        this.f46658c = new HashMap();
        this.f46656a = qVar;
        this.f46657b = c4253d;
    }

    public final synchronized InterfaceC4255f a(String str) {
        if (this.f46658c.containsKey(str)) {
            return (InterfaceC4255f) this.f46658c.get(str);
        }
        CctBackendFactory cctBackendFactoryG = this.f46656a.g(str);
        if (cctBackendFactoryG == null) {
            return null;
        }
        C4253d c4253d = this.f46657b;
        InterfaceC4255f interfaceC4255fCreate = cctBackendFactoryG.create(new C4251b(c4253d.f46653a, c4253d.f46654b, c4253d.f46655c, str));
        this.f46658c.put(str, interfaceC4255fCreate);
        return interfaceC4255fCreate;
    }
}
