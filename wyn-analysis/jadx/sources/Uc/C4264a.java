package uc;

import Va.X7;
import android.util.Log;
import java.nio.ByteBuffer;

/* renamed from: uc.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4264a implements InterfaceC4268e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46747a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f46748b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f46749c;

    public /* synthetic */ C4264a(int i5, Object obj, Object obj2) {
        this.f46747a = i5;
        this.f46749c = obj;
        this.f46748b = obj2;
    }

    @Override // uc.InterfaceC4268e
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f46747a) {
            case 0:
                X7 x72 = (X7) this.f46749c;
                try {
                    ((InterfaceC4266c) this.f46748b).c(((InterfaceC4277n) x72.f13843c).b(byteBuffer));
                    break;
                } catch (RuntimeException e7) {
                    Log.e("BasicMessageChannel#" + ((String) x72.f13842b), "Failed to handle message reply", e7);
                    return;
                }
            default:
                C4281r c4281r = (C4281r) this.f46749c;
                InterfaceC4280q interfaceC4280q = (InterfaceC4280q) this.f46748b;
                try {
                    if (byteBuffer == null) {
                        interfaceC4280q.c();
                    } else {
                        try {
                            interfaceC4280q.a(c4281r.f46763c.c(byteBuffer));
                        } catch (C4274k e10) {
                            interfaceC4280q.b(e10.f46755a, e10.getMessage(), e10.f46756b);
                        }
                    }
                    break;
                } catch (RuntimeException e11) {
                    Log.e("MethodChannel#" + c4281r.f46762b, "Failed to handle method call result", e11);
                    return;
                }
        }
    }
}
