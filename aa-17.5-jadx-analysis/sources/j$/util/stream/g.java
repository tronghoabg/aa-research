package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Function;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class g extends o2 {
    public final /* synthetic */ byte b = 0;
    public boolean c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(z2 z2Var, Function function) {
        super(z2Var);
        this.d = function;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                z2 z2Var = (z2) this.a;
                if (obj == null) {
                    if (this.c) {
                        return;
                    }
                    this.c = true;
                    this.d = null;
                    z2Var.accept((z2) null);
                    return;
                }
                Object obj2 = this.d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.d = obj;
                    z2Var.accept((z2) obj);
                    return;
                }
                return;
            default:
                z2 z2Var2 = (z2) this.a;
                Stream stream = (Stream) ((Function) this.d).apply(obj);
                if (stream != null) {
                    try {
                        if (this.c) {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!z2Var2.s() && spliterator.tryAdvance(z2Var2)) {
                            }
                        } else {
                            ((Stream) stream.sequential()).forEach(z2Var2);
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
        }
    }

    @Override // j$.util.stream.o2, j$.util.stream.z2
    public void end() {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                ((z2) this.a).end();
                break;
            default:
                super.end();
                break;
        }
    }

    @Override // j$.util.stream.o2, j$.util.stream.z2
    public final void p(long j) {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                ((z2) this.a).p(-1L);
                break;
            default:
                ((z2) this.a).p(-1L);
                break;
        }
    }

    @Override // j$.util.stream.o2, j$.util.stream.z2
    public boolean s() {
        switch (this.b) {
            case 1:
                this.c = true;
                return ((z2) this.a).s();
            default:
                return super.s();
        }
    }

    public /* synthetic */ g(z2 z2Var) {
        super(z2Var);
    }
}
