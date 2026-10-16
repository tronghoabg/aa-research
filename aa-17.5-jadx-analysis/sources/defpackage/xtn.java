package defpackage;

import java.util.UUID;

/* loaded from: classes.dex */
abstract class xtn extends xtj {
    private final xue a;

    public xtn(String str, xuk xukVar, xue xueVar, nrd nrdVar) {
        super(str, xukVar, nrdVar);
        if (!xueVar.d) {
            throw new IllegalArgumentException();
        }
        this.a = xueVar;
    }

    @Override // defpackage.xuk
    public final xue h() {
        return xue.d(this.a, i());
    }

    public xtn(String str, UUID uuid, String str2, xue xueVar, nrd nrdVar) {
        super(str, uuid, str2, nrdVar);
        if (xueVar.d) {
            this.a = xueVar;
            return;
        }
        throw new IllegalArgumentException();
    }
}
