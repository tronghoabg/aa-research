package defpackage;

import android.content.Context;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import j$.util.function.Function$CC;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public final class jne extends jai {
    public final Context c;
    private final AtomicReference d;

    public jne(Context context) {
        this.c = context;
        jnf.a.l().u("HerosimGalMunger started");
        this.d = new AtomicReference(new jng(this));
    }

    @Override // defpackage.jai
    public final jcn a(int i, jcn jcnVar, boolean z) {
        jcnVar.getClass();
        AtomicReference atomicReference = this.d;
        int iD = jcnVar.d();
        jcn jcnVarA = ((jnd) atomicReference.get()).a(i, jcnVar, z);
        if (jcnVarA == jcnVar) {
            jcnVarA.q(iD);
            return jcnVarA;
        }
        jcnVar.close();
        return jcnVarA;
    }

    @Override // defpackage.jai
    public final ByteBuffer b(ByteBuffer byteBuffer) {
        AtomicReference atomicReference = this.d;
        int iPosition = byteBuffer.position();
        ByteBuffer byteBufferC = ((jnd) atomicReference.get()).c(byteBuffer);
        if (byteBufferC == byteBuffer) {
            byteBufferC.position(iPosition);
        }
        return byteBufferC;
    }

    @Override // defpackage.jai
    public final void c() {
        d(jnc.a);
    }

    public final void d(final jnd jndVar) {
        jnf.a.l().y("Moving to state %s", jndVar.getClass().getName());
        ((jnd) DesugarAtomicReference.getAndUpdate(this.d, new UnaryOperator() { // from class: jnb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo329andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                jnd jndVar2 = (jnd) obj;
                return affa.f(jndVar2, jnc.a) ? jndVar2 : jndVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })).b();
    }

    public final void e(izm izmVar) {
        this.b.a(izmVar);
    }
}
