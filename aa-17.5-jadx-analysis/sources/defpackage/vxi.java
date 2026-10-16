package defpackage;

import j$.util.Collection;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;

/* loaded from: classes3.dex */
public final class vxi extends vmc {
    public vxi(vmb vmbVar, ajgu ajguVar) {
        super(vmbVar, ajguVar);
    }

    private final Stream i() {
        Stream streamEmpty;
        ajgu ajguVar = this.a;
        if ((ajguVar.b & 4096) != 0) {
            ajfr ajfrVar = ajguVar.o;
            if (ajfrVar == null) {
                ajfrVar = ajfr.a;
            }
            streamEmpty = Stream.CC.of(ajfrVar);
        } else {
            streamEmpty = Stream.CC.empty();
        }
        return Stream.CC.concat(streamEmpty, Collection.EL.stream(ajguVar.v).filter(new vxj(1)).map(new uzr(10)));
    }

    @Override // defpackage.vmc
    protected final String e() {
        return (String) i().map(new uzr(9)).collect(Collectors.joining("\n\n"));
    }

    @Override // defpackage.vmc
    protected final String g() {
        return "Traces: ".concat(String.valueOf((String) i().map(new uzr(8)).collect(Collectors.joining(", "))));
    }

    @Override // defpackage.vmc
    protected final boolean h() {
        return i().count() != 0;
    }
}
