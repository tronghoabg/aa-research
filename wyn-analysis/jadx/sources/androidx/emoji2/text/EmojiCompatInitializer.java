package androidx.emoji2.text;

import G4.c;
import android.content.Context;
import androidx.lifecycle.AbstractC1451o;
import androidx.lifecycle.InterfaceC1457v;
import androidx.lifecycle.ProcessLifecycleInitializer;
import h4.C2774a;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import r3.C3913a;
import r3.InterfaceC3914b;
import y1.C4526g;
import y1.C4530k;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC3914b {
    public final void a(Context context) {
        Object objB;
        C3913a c3913aC = C3913a.c(context);
        c3913aC.getClass();
        synchronized (C3913a.f44324e) {
            try {
                objB = c3913aC.f44325a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = c3913aC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC1451o lifecycle = ((InterfaceC1457v) objB).getLifecycle();
        lifecycle.a(new C2774a(this, lifecycle));
    }

    @Override // r3.InterfaceC3914b
    public final Object create(Context context) {
        C4530k c4530k = new C4530k(new c(context, 5));
        c4530k.f47947b = 1;
        if (C4526g.f47922j == null) {
            synchronized (C4526g.f47921i) {
                try {
                    if (C4526g.f47922j == null) {
                        C4526g.f47922j = new C4526g(c4530k);
                    }
                } finally {
                }
            }
        }
        a(context);
        return Boolean.TRUE;
    }

    @Override // r3.InterfaceC3914b
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
