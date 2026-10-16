package defpackage;

/* loaded from: classes3.dex */
public final class ahyw implements ahyx {
    public static final ahyw INSTANCE = new ahyw();

    private ahyw() {
    }

    @Override // defpackage.ahyx
    public boolean getAllowUnstableDependencies() {
        return false;
    }

    @Override // defpackage.ahyx
    public ahlc getMetadataVersion() {
        return ahlc.INSTANCE;
    }

    @Override // defpackage.ahyx
    public boolean getPreserveDeclarationsOrdering() {
        return false;
    }

    @Override // defpackage.ahyx
    public boolean getReportErrorsOnPreReleaseDependencies() {
        return false;
    }

    @Override // defpackage.ahyx
    public boolean getSkipMetadataVersionCheck() {
        return false;
    }

    @Override // defpackage.ahyx
    public boolean getSkipPrereleaseCheck() {
        return false;
    }

    @Override // defpackage.ahyx
    public boolean getTypeAliasesAllowed() {
        return true;
    }
}
