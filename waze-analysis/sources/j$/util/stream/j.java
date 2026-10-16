package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class j extends p5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50459b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f50460c;

    /* renamed from: d, reason: collision with root package name */
    public Object f50461d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(t5 t5Var, Predicate predicate) {
        super(t5Var);
        this.f50461d = predicate;
        this.f50460c = true;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void u(Object obj) throws Exception {
        int i2 = this.f50459b;
        t5 t5Var = this.f50576a;
        switch (i2) {
            case 0:
                if (obj == null) {
                    if (this.f50460c) {
                        return;
                    }
                    this.f50460c = true;
                    this.f50461d = null;
                    t5Var.u((t5) null);
                    return;
                }
                Object obj2 = this.f50461d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.f50461d = obj;
                    t5Var.u((t5) obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) ((g0) this.f50461d).apply((g0) obj);
                if (stream != null) {
                    try {
                        if (this.f50460c) {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!t5Var.o() && spliterator.tryAdvance(t5Var)) {
                            }
                        } else {
                            ((Stream) stream.sequential()).forEach(t5Var);
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.f50460c) {
                    boolean zTest = ((Predicate) this.f50461d).test(obj);
                    this.f50460c = zTest;
                    if (zTest) {
                        t5Var.u((t5) obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.p5, j$.util.stream.t5
    public void end() {
        switch (this.f50459b) {
            case 0:
                this.f50460c = false;
                this.f50461d = null;
                this.f50576a.end();
                break;
            default:
                super.end();
                break;
        }
    }

    @Override // j$.util.stream.p5, j$.util.stream.t5
    public final void l(long j2) {
        switch (this.f50459b) {
            case 0:
                this.f50460c = false;
                this.f50461d = null;
                this.f50576a.l(-1L);
                break;
            case 1:
                this.f50576a.l(-1L);
                break;
            default:
                this.f50576a.l(-1L);
                break;
        }
    }

    @Override // j$.util.stream.p5, j$.util.stream.t5
    public boolean o() {
        switch (this.f50459b) {
            case 1:
                this.f50460c = true;
                return this.f50576a.o();
            case 2:
                return !this.f50460c || this.f50576a.o();
            default:
                return super.o();
        }
    }

    public /* synthetic */ j(t5 t5Var) {
        super(t5Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(t5 t5Var, g0 g0Var) {
        super(t5Var);
        this.f50461d = g0Var;
    }
}
