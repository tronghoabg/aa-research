package j$.nio.file;

import j$.util.function.Function$CC;
import java.nio.file.DirectoryStream;
import java.util.function.Function;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class s implements DirectoryStream.Filter, Function {
    public static final s a = new s();

    @Override // java.nio.file.DirectoryStream.Filter
    /* renamed from: accept */
    public boolean mo326accept(Object obj) {
        return true;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public /* synthetic */ Function mo329andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        int i = Files.a;
        return ((o) obj).b;
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
