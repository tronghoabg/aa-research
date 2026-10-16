package okhttp3.internal.f;

import java.io.IOException;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class q extends okhttp3.internal.b.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f56205a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f56206b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f56207c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, w wVar, int i2, List list) {
        super(str);
        this.f56205a = wVar;
        this.f56206b = i2;
        this.f56207c = list;
    }

    @Override // okhttp3.internal.b.a
    public final long b() {
        w wVar = this.f56205a;
        wVar.f56231k.b(this.f56207c);
        int i2 = this.f56206b;
        try {
            wVar.q().i(i2, b.f56147i);
            synchronized (wVar) {
                wVar.x.remove(Integer.valueOf(i2));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
