package u0;

import Va.X7;
import android.graphics.Rect;
import android.util.Log;
import ba.C1521a;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import uc.InterfaceC4265b;
import uc.InterfaceC4267d;
import uc.InterfaceC4277n;
import w.AbstractC4346a;
import zg.C4683w;
import zg.InterfaceC4667f;

/* loaded from: classes.dex */
public final class w0 implements InterfaceC4267d, Callback {

    /* renamed from: a, reason: collision with root package name */
    public Object f46405a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f46406b;

    public /* synthetic */ w0(Serializable serializable, Object obj) {
        this.f46405a = obj;
        this.f46406b = serializable;
    }

    public void a(int i5, int i10, int i11, int i12) {
        AbstractC4346a abstractC4346a = (AbstractC4346a) this.f46406b;
        abstractC4346a.f47255d.set(i5, i10, i11, i12);
        Rect rect = abstractC4346a.f47254c;
        super/*android.widget.FrameLayout*/.setPadding(i5 + rect.left, i10 + rect.top, i11 + rect.right, i12 + rect.bottom);
    }

    @Override // uc.InterfaceC4267d
    public void d(ByteBuffer byteBuffer, mc.g gVar) {
        X7 x72 = (X7) this.f46406b;
        try {
            ((InterfaceC4265b) this.f46405a).e(((InterfaceC4277n) x72.f13843c).b(byteBuffer), new C1521a(26, this, gVar));
        } catch (RuntimeException e7) {
            Log.e("BasicMessageChannel#" + ((String) x72.f13842b), "Failed to handle message", e7);
            gVar.a(null);
        }
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        try {
            ((InterfaceC4667f) this.f46405a).onFailure((C4683w) this.f46406b, iOException);
        } catch (Throwable th) {
            zg.a0.o(th);
            th.printStackTrace();
        }
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        InterfaceC4667f interfaceC4667f = (InterfaceC4667f) this.f46405a;
        C4683w c4683w = (C4683w) this.f46406b;
        try {
            try {
                interfaceC4667f.onResponse(c4683w, c4683w.c(response));
            } catch (Throwable th) {
                zg.a0.o(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            zg.a0.o(th2);
            try {
                interfaceC4667f.onFailure(c4683w, th2);
            } catch (Throwable th3) {
                zg.a0.o(th3);
                th3.printStackTrace();
            }
        }
    }

    public /* synthetic */ w0(Object obj, Object obj2) {
        this.f46406b = obj;
        this.f46405a = obj2;
    }

    public w0() {
        this.f46405a = new P.d(new Reference[16]);
        this.f46406b = new ReferenceQueue();
    }

    public w0(AbstractC4346a abstractC4346a) {
        this.f46406b = abstractC4346a;
    }
}
