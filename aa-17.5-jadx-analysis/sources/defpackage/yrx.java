package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class yrx extends yrw {
    public static final Map c;
    private final ypk d;

    static {
        EnumMap enumMap = new EnumMap(ypk.class);
        for (ypk ypkVar : ypk.values()) {
            yrx[] yrxVarArr = new yrx[10];
            for (int i = 0; i < 10; i++) {
                yrxVarArr[i] = new yrx(i, ypkVar, ypl.a);
            }
            enumMap.put((EnumMap) ypkVar, (ypk) yrxVarArr);
        }
        c = DesugarCollections.unmodifiableMap(enumMap);
    }

    public yrx(int i, ypk ypkVar, ypl yplVar) {
        super(yplVar, i);
        ypkVar.getClass();
        this.d = ypkVar;
        if (yplVar.c()) {
            return;
        }
        int i2 = ypkVar.l;
        i2 = yplVar.d() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder("%");
        yplVar.f(sb);
        sb.append((char) i2);
    }

    @Override // defpackage.yrw
    public final void a(ysa ysaVar, Object obj) throws IOException {
        ysaVar.d(obj, this.d, this.b);
    }
}
