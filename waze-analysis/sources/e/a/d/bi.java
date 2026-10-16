package e.a.d;

import j$.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f46668a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f46669b;

    bi(bh bhVar, int i2) {
        this.f46669b = i2;
        Objects.requireNonNull(bhVar);
        this.f46668a = bhVar;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [e.a.d.gd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [e.a.d.gd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [e.a.d.gd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [e.a.d.ai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [e.a.d.ai, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = true;
        switch (this.f46669b) {
            case 0:
                this.f46668a.a(true);
                return;
            case 1:
                ((bh) this.f46668a).f46663h.b();
                return;
            case 2:
                this.f46668a.a(false);
                return;
            case 3:
                this.f46668a.d();
                return;
            case 4:
                this.f46668a.b();
                return;
            case 5:
                this.f46668a.a();
                return;
            case 6:
                Object obj = this.f46668a;
                synchronized (obj) {
                    if (((el) obj).f46891l != 6) {
                        ((el) obj).f46891l = 6;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    ((el) this.f46668a).m.d();
                    return;
                }
                return;
            default:
                Object obj2 = this.f46668a;
                synchronized (obj2) {
                    ((el) obj2).f46886g = null;
                    if (((el) obj2).f46891l == 2) {
                        ((el) obj2).f46891l = 4;
                        ((el) obj2).f46885f = ((el) obj2).f46882c.schedule(((el) obj2).f46887h, ((el) obj2).f46890k, TimeUnit.NANOSECONDS);
                    } else {
                        if (((el) obj2).f46891l == 3) {
                            ((el) obj2).f46886g = ((el) obj2).f46882c.schedule(((el) obj2).f46888i, ((el) obj2).f46889j - ((el) obj2).f46883d.a(TimeUnit.NANOSECONDS), TimeUnit.NANOSECONDS);
                            ((el) obj2).f46891l = 2;
                        }
                        z = false;
                    }
                }
                if (z) {
                    ((el) this.f46668a).m.e();
                    return;
                }
                return;
        }
    }

    bi(ai aiVar, int i2) {
        this.f46669b = i2;
        this.f46668a = aiVar;
    }

    bi(el elVar, int i2) {
        this.f46669b = i2;
        Objects.requireNonNull(elVar);
        this.f46668a = elVar;
    }

    bi(bm bmVar, gd gdVar, int i2) {
        this.f46669b = i2;
        this.f46668a = gdVar;
        Objects.requireNonNull(bmVar);
    }

    bi(el elVar, int i2, byte[] bArr) {
        this.f46669b = i2;
        Objects.requireNonNull(elVar);
        this.f46668a = elVar;
    }

    bi(bm bmVar, gd gdVar, int i2, byte[] bArr) {
        this.f46669b = i2;
        this.f46668a = gdVar;
        Objects.requireNonNull(bmVar);
    }

    bi(bm bmVar, gd gdVar, int i2, char[] cArr) {
        this.f46669b = i2;
        this.f46668a = gdVar;
        Objects.requireNonNull(bmVar);
    }
}
