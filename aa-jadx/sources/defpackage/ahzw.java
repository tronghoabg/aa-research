package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahzw implements defpackage.ahzx {
    public static final defpackage.ahzw INSTANCE = new defpackage.ahzw();

    private ahzw() {
    }

    @Override // defpackage.ahzx
    public boolean getAllowUnstableDependencies() {
        return false;
    }

    @Override // defpackage.ahzx
    public defpackage.ahmc getMetadataVersion() {
        return defpackage.ahmc.INSTANCE;
    }

    @Override // defpackage.ahzx
    public boolean getPreserveDeclarationsOrdering() {
        return false;
    }

    @Override // defpackage.ahzx
    public boolean getReportErrorsOnPreReleaseDependencies() {
        return false;
    }

    @Override // defpackage.ahzx
    public boolean getSkipMetadataVersionCheck() {
        return false;
    }

    @Override // defpackage.ahzx
    public boolean getSkipPrereleaseCheck() {
        return false;
    }

    @Override // defpackage.ahzx
    public boolean getTypeAliasesAllowed() {
        return true;
    }
}
