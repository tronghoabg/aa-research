package Mb;

import a2.v;
import aa.f;
import android.graphics.Rect;
import android.view.Window;
import com.google.protobuf.InvalidProtocolBufferException;
import com.vungle.ads.internal.util.g;
import com.vungle.ads.internal.util.j;
import java.util.HashMap;
import me.C3558a;
import s8.q;
import s9.k;
import s9.o;
import tf.l;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7616a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7617b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7618c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7621f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f7622g;

    public /* synthetic */ a(int i5, int i10, j jVar, Window window, Rect rect, l lVar) {
        this.f7617b = i5;
        this.f7618c = i10;
        this.f7619d = jVar;
        this.f7620e = window;
        this.f7621f = rect;
        this.f7622g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7616a) {
            case 0:
                g.a(this.f7617b, this.f7618c, (j) this.f7619d, (Window) this.f7620e, (Rect) this.f7621f, (l) this.f7622g);
                return;
            default:
                C3558a c3558a = (C3558a) this.f7619d;
                byte[] bArr = (byte[]) this.f7620e;
                int i5 = this.f7617b;
                int i10 = this.f7618c;
                f fVar = (f) this.f7621f;
                HashMap map = (HashMap) this.f7622g;
                c3558a.getClass();
                try {
                    k kVarR = ((v) c3558a.f40737b).r(u9.c.l(bArr));
                    kVarR.f45383d = new o(new q(i5, i10));
                    if (fVar == null || ((Boolean) fVar.apply(kVarR)).booleanValue()) {
                        synchronized (map) {
                            map.put(kVarR.f45380a, kVarR);
                        }
                        return;
                    }
                    return;
                } catch (InvalidProtocolBufferException e7) {
                    A6.c.s("MaybeDocument failed to parse: %s", e7);
                    throw null;
                }
        }
    }

    public /* synthetic */ a(C3558a c3558a, byte[] bArr, int i5, int i10, f fVar, HashMap map) {
        this.f7619d = c3558a;
        this.f7620e = bArr;
        this.f7617b = i5;
        this.f7618c = i10;
        this.f7621f = fVar;
        this.f7622g = map;
    }
}
