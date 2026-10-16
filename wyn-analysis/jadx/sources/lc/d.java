package lc;

import E5.C0461l;
import M.y;
import android.content.Context;
import b7.k;
import io.flutter.plugin.platform.q;
import java.util.ArrayList;
import java.util.List;
import oc.C3665d;
import uc.C4281r;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f40274a = new ArrayList();

    public d(Context context, String[] strArr) {
        C3665d c3665d = (C3665d) k.z().f19396b;
        if (c3665d.f41474b) {
            return;
        }
        c3665d.c(context.getApplicationContext());
        c3665d.a(context.getApplicationContext(), strArr);
    }

    public final C3458b a(C0461l c0461l) {
        C3458b c3458b;
        Context context = (Context) c0461l.f3454d;
        mc.a aVar = (mc.a) c0461l.f3455e;
        String str = (String) c0461l.f3456f;
        List<String> list = (List) c0461l.f3457g;
        q qVar = new q();
        boolean z2 = c0461l.f3452b;
        boolean z10 = c0461l.f3453c;
        if (aVar == null) {
            C3665d c3665d = (C3665d) k.z().f19396b;
            if (!c3665d.f41474b) {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
            aVar = new mc.a((String) ((y) c3665d.f41476d).f7228c, "main");
        }
        ArrayList arrayList = this.f40274a;
        if (arrayList.size() == 0) {
            c3458b = new C3458b(context, null, qVar, null, z2, z10);
            if (str != null) {
                ((C4281r) c3458b.f40259i.f17489b).a("setInitialRoute", str, null);
            }
            c3458b.f40253c.d(aVar, list);
        } else {
            C3458b c3458b2 = (C3458b) arrayList.get(0);
            if (!c3458b2.f40251a.isAttached()) {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
            long j8 = C3458b.f40249w;
            c3458b = new C3458b(context, c3458b2.f40251a.spawn(aVar.f40521c, aVar.f40520b, str, list, j8), qVar, null, z2, z10);
        }
        arrayList.add(c3458b);
        c3458b.f40269t.add(new c(this, c3458b));
        return c3458b;
    }
}
