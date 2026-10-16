package defpackage;

/* loaded from: classes3.dex */
public final class ahep implements ahzj {
    public static final ahep INSTANCE = new ahep();

    private ahep() {
    }

    @Override // defpackage.ahzj
    public aigl create(ahjn ahjnVar, String str, aigw aigwVar, aigw aigwVar2) {
        ahjnVar.getClass();
        str.getClass();
        aigwVar.getClass();
        aigwVar2.getClass();
        return !affa.f(str, "kotlin.jvm.PlatformType") ? ailm.createErrorType(aill.ERROR_FLEXIBLE_TYPE, str, aigwVar.toString(), aigwVar2.toString()) : ahjnVar.hasExtension(ahmh.isRaw) ? new agzc(aigwVar, aigwVar2) : aigq.flexibleType(aigwVar, aigwVar2);
    }
}
