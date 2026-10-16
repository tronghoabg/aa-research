package j$.util.stream;

import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class k extends p5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50483b;

    /* renamed from: c, reason: collision with root package name */
    public Object f50484c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(t5 t5Var, Object obj, int i2) {
        super(t5Var);
        this.f50483b = i2;
        this.f50484c = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f50483b) {
            case 0:
                if (!((HashSet) this.f50484c).contains(obj)) {
                    ((HashSet) this.f50484c).add(obj);
                    this.f50576a.accept((t5) obj);
                    break;
                }
                break;
            case 1:
                ((Consumer) this.f50484c).accept(obj);
                this.f50576a.accept((t5) obj);
                break;
            case 2:
                if (((Predicate) this.f50484c).test(obj)) {
                    this.f50576a.accept((t5) obj);
                    break;
                }
                break;
            case 3:
                this.f50576a.accept((t5) ((Function) this.f50484c).apply(obj));
                break;
            case 4:
                this.f50576a.accept(((ToIntFunction) this.f50484c).applyAsInt(obj));
                break;
            case 5:
                this.f50576a.accept(((ToLongFunction) this.f50484c).applyAsLong(obj));
                break;
            default:
                this.f50576a.accept(((ToDoubleFunction) this.f50484c).applyAsDouble(obj));
                break;
        }
    }

    @Override // j$.util.stream.p5, j$.util.stream.t5
    public void end() {
        switch (this.f50483b) {
            case 0:
                this.f50484c = null;
                this.f50576a.end();
                break;
            default:
                super.end();
                break;
        }
    }

    @Override // j$.util.stream.p5, j$.util.stream.t5
    public void l(long j2) {
        switch (this.f50483b) {
            case 0:
                this.f50484c = new HashSet();
                this.f50576a.l(-1L);
                break;
            case 1:
            default:
                super.l(j2);
                break;
            case 2:
                this.f50576a.l(-1L);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(t5 t5Var) {
        super(t5Var);
        this.f50483b = 0;
    }
}
