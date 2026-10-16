package defpackage;

import j$.util.Collection;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;

/* loaded from: classes3.dex */
public final class vxk extends vmc {
    public vxk(vmb vmbVar, ajgu ajguVar) {
        super(vmbVar, ajguVar);
    }

    public static final String i(ajhb ajhbVar) {
        for (ajha ajhaVar : ajhbVar.c) {
            if (ajhaVar.d == -1) {
                return ajhaVar.c;
            }
        }
        return "unknown";
    }

    private final Stream j() {
        Stream streamEmpty;
        ajgu ajguVar = this.a;
        if ((ajguVar.b & 2048) != 0) {
            ajhb ajhbVar = ajguVar.n;
            if (ajhbVar == null) {
                ajhbVar = ajhb.a;
            }
            streamEmpty = Stream.CC.of(ajhbVar);
        } else {
            streamEmpty = Stream.CC.empty();
        }
        return Stream.CC.concat(streamEmpty, Collection.EL.stream(ajguVar.v).filter(new vxj(0)).map(new uzr(11)));
    }

    @Override // defpackage.vmc
    protected final String e() {
        return (String) j().map(new uzr(12)).collect(Collectors.joining("\n\n"));
    }

    @Override // defpackage.vmc
    protected final String g() {
        return "Traces: ".concat(String.valueOf((String) j().map(new uzr(13)).collect(Collectors.joining(", "))));
    }

    @Override // defpackage.vmc
    protected final boolean h() {
        return j().count() != 0;
    }
}
