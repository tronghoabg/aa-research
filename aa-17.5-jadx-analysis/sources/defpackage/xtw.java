package defpackage;

import java.util.UUID;

/* loaded from: classes3.dex */
public final class xtw extends xtn {
    public static final UUID a;
    public static final String b;

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        a = uuidRandomUUID;
        b = xtj.gQ(uuidRandomUUID);
    }

    private xtw(xtw xtwVar, String str, xue xueVar, nrd nrdVar) {
        super(str, xtwVar, xueVar, nrdVar);
    }

    @Override // defpackage.xuk
    public final xue i() {
        return xud.a;
    }

    @Override // defpackage.xuk
    public final xuk m(String str, xue xueVar, nrd nrdVar) {
        return new xtw(this, str, xueVar, nrdVar);
    }

    public xtw(String str, UUID uuid, String str2, xue xueVar, nrd nrdVar) {
        super(str, uuid, str2, xueVar, nrdVar);
    }

    @Override // defpackage.xuk
    public final void j() {
    }

    @Override // defpackage.xuk
    public final void k() {
    }

    @Override // defpackage.xuk
    public final void l() {
    }
}
