package defpackage;

import android.content.Context;
import j$.util.function.Function$CC;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes.dex */
public final class izi {
    public final Function a;
    public final Function b;
    public final Function c;
    public xyc d;
    public jae e;
    public rld f;
    public BiFunction g = new kgc(1);
    public iyq h = null;
    public Context i;
    public xyc j;
    public izz k;
    public jcx l;
    public jai m;
    public int n;
    public fbf o;
    public wyd p;

    public izi(final InputStream inputStream, final OutputStream outputStream, final Closeable closeable) {
        int i = jcr.c;
        this.n = 1;
        this.j = null;
        this.o = new fbf((byte[]) null, (byte[]) null);
        this.m = new jag();
        this.a = new Function() { // from class: izh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo329andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                izl izlVar = (izl) obj;
                izi iziVar = this.a;
                Context context = iziVar.i;
                izz izzVar = iziVar.k;
                iyq iyqVar = iziVar.h;
                BiFunction biFunction = iziVar.g;
                ypf ypfVar = izl.a;
                ypf ypfVar2 = jad.a;
                izw izwVar = new izw();
                izwVar.h = new izj(izlVar);
                izwVar.i = new wyd(izlVar, null);
                izwVar.b = biFunction;
                izwVar.c = inputStream;
                izwVar.d = outputStream;
                izwVar.e = izzVar;
                izwVar.a = iyqVar;
                izwVar.g = context;
                izwVar.f = closeable;
                if (izwVar.e == null) {
                    izwVar.e = izz.a().a();
                }
                return new jad(izwVar);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        };
        this.b = new ilq(10);
        this.c = new ilq(11);
    }
}
