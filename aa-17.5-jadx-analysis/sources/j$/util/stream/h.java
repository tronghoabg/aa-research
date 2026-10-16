package j$.util.stream;

import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class h extends o2 {
    public final /* synthetic */ byte b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(z2 z2Var, Object obj, byte b) {
        super(z2Var);
        this.b = b;
        this.c = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                if (!((HashSet) this.c).contains(obj)) {
                    ((HashSet) this.c).add(obj);
                    ((z2) this.a).accept((z2) obj);
                    break;
                }
                break;
            case 1:
                ((Consumer) this.c).accept(obj);
                ((z2) this.a).accept((z2) obj);
                break;
            case 2:
                if (((Predicate) this.c).test(obj)) {
                    ((z2) this.a).accept((z2) obj);
                    break;
                }
                break;
            case 3:
                ((z2) this.a).accept((z2) ((Function) this.c).apply(obj));
                break;
            case 4:
                ((z2) this.a).accept(((ToIntFunction) this.c).applyAsInt(obj));
                break;
            default:
                ((z2) this.a).accept(((ToLongFunction) this.c).applyAsLong(obj));
                break;
        }
    }

    @Override // j$.util.stream.o2, j$.util.stream.z2
    public void end() {
        switch (this.b) {
            case 0:
                this.c = null;
                ((z2) this.a).end();
                break;
            default:
                super.end();
                break;
        }
    }

    @Override // j$.util.stream.o2, j$.util.stream.z2
    public void p(long j) {
        switch (this.b) {
            case 0:
                this.c = new HashSet();
                ((z2) this.a).p(-1L);
                break;
            case 1:
            default:
                super.p(j);
                break;
            case 2:
                ((z2) this.a).p(-1L);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(z2 z2Var) {
        super(z2Var);
        this.b = (byte) 0;
    }
}
