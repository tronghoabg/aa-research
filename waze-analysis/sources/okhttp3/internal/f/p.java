package okhttp3.internal.f;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class p extends okhttp3.internal.b.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f56201a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f56202b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ k.h f56203c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f56204d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, w wVar, int i2, k.h hVar, int i3) {
        super(str);
        this.f56201a = wVar;
        this.f56202b = i2;
        this.f56203c = hVar;
        this.f56204d = i3;
    }

    @Override // okhttp3.internal.b.a
    public final long b() {
        try {
            w wVar = this.f56201a;
            ai aiVar = wVar.f56231k;
            int i2 = this.f56202b;
            aiVar.a(this.f56203c, this.f56204d);
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
