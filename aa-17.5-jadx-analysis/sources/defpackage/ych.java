package defpackage;

import j$.util.function.Function$CC;
import java.util.Collections;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class ych implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ ych(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((yfl) obj).g();
            case 1:
                ?? r7 = ((oct) obj).a;
                yfl yflVar = new yfl(r7.size());
                ylp ylpVar = ylp.a;
                Collections.sort(r7, ylo.a);
                yht yhtVarAh = yrm.ah(r7.iterator());
                while (yhtVarAh.hasNext()) {
                    ylp ylpVar2 = (ylp) yhtVarAh.next();
                    while (yhtVarAh.hasNext()) {
                        ylp ylpVar3 = (ylp) yhtVarAh.a();
                        woy.W(((ylpVar2.b.compareTo(ylpVar3.b) < 0 || ylpVar2.c.compareTo(ylpVar3.c) > 0) ? ylpVar3 : ylpVar2).b(), "Overlapping ranges not permitted but found %s overlapping %s", ylpVar2, ylpVar3);
                        ylp ylpVar4 = (ylp) yhtVarAh.next();
                        ydn ydnVar = ylpVar4.b;
                        ydn ydnVar2 = ylpVar4.c;
                    }
                    yflVar.i(ylpVar2);
                }
                yfq yfqVarG = yflVar.g();
                return yfqVarG.isEmpty() ? ygo.a : (((yls) yfqVarG).c == 1 && ((ylp) yrm.ao(yfqVarG)).equals(ylp.a)) ? ygo.b : new ygo(yfqVarG);
            case 2:
                return ((ygp) obj).g();
            case 3:
                EnumMap enumMap = ((ycl) obj).a;
                return enumMap == null ? ylx.a : yfi.a(enumMap);
            case 4:
                return ((yfu) obj).b();
            case 5:
                return yfy.j((LinkedHashMap) obj);
            case 6:
                return ((Map.Entry) obj).getKey();
            default:
                return ((Map.Entry) obj).getValue();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
