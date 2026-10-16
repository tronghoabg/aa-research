package nd;

import android.content.Context;
import android.util.Log;
import md.AbstractC3554w;
import md.AbstractC3556y;
import md.S;
import md.T;
import pd.h;
import pd.i;

/* renamed from: nd.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3617c extends AbstractC3554w {

    /* renamed from: a, reason: collision with root package name */
    public final h f41018a;

    /* renamed from: b, reason: collision with root package name */
    public Context f41019b;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    static {
        try {
            try {
                ((T) i.class.asSubclass(T.class).getConstructor(new Class[0]).newInstance(new Object[0])).getClass();
            } catch (Exception e7) {
                Log.w("AndroidChannelBuilder", "Failed to construct OkHttpChannelProvider", e7);
            }
        } catch (ClassCastException e10) {
            Log.w("AndroidChannelBuilder", "Couldn't cast OkHttpChannelProvider to ManagedChannelProvider", e10);
        }
    }

    public C3617c(h hVar) {
        this.f41018a = hVar;
    }

    @Override // md.AbstractC3553v, md.AbstractC3556y
    public final S a() {
        return new C3616b(this.f41018a.a(), this.f41019b);
    }

    @Override // md.AbstractC3553v
    public final AbstractC3556y m() {
        return this.f41018a;
    }
}
