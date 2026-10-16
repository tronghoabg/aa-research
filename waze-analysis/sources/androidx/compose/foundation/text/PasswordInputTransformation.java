package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextObfuscationMode;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import h.ab;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PasswordInputTransformation implements InputTransformation {
    public static final int $stable = 0;
    private final a<SplitVisibilitySettings> platformAllowsReveal;
    private final MutableIntState revealCodepointIndex$delegate = SnapshotIntStateKt.mutableIntStateOf(-1);
    private final a<ab> scheduleHide;
    private final a<TextObfuscationMode> textObfuscationMode;

    public PasswordInputTransformation(a<ab> aVar, a<TextObfuscationMode> aVar2, a<SplitVisibilitySettings> aVar3) {
        this.scheduleHide = aVar;
        this.textObfuscationMode = aVar2;
        this.platformAllowsReveal = aVar3;
    }

    private final void setRevealCodepointIndex(int i2) {
        this.revealCodepointIndex$delegate.setIntValue(i2);
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public /* synthetic */ KeyboardOptions getKeyboardOptions() {
        return null;
    }

    public final a<SplitVisibilitySettings> getPlatformAllowsReveal() {
        return this.platformAllowsReveal;
    }

    public final int getRevealCodepointIndex$foundation() {
        return this.revealCodepointIndex$delegate.getIntValue();
    }

    public final a<ab> getScheduleHide() {
        return this.scheduleHide;
    }

    public final a<TextObfuscationMode> getTextObfuscationMode() {
        return this.textObfuscationMode;
    }

    public final void hide() {
        setRevealCodepointIndex(-1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (((r2 == null || !r2.isFromHardwareSource$foundation(0)) ? androidx.compose.foundation.text.SplitVisibilitySettings.m3369getTouchimpl(r0) : androidx.compose.foundation.text.SplitVisibilitySettings.m3368getPhysicalimpl(r0)) == false) goto L29;
     */
    @Override // androidx.compose.foundation.text.input.InputTransformation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void transformInput(androidx.compose.foundation.text.input.TextFieldBuffer r7) {
        /*
            r6 = this;
            androidx.compose.foundation.text.input.TextFieldBuffer$ChangeList r0 = r7.getChanges()
            int r0 = r0.getChangeCount()
            r1 = -1
            r2 = 1
            if (r0 != r2) goto L93
            androidx.compose.foundation.text.input.TextFieldBuffer$ChangeList r0 = r7.getChanges()
            r3 = 0
            long r4 = r0.mo3481getRangejx7JFs(r3)
            int r0 = androidx.compose.ui.text.TextRange.m10542getLengthimpl(r4)
            if (r0 != r2) goto L93
            boolean r0 = r7.hasSelection()
            if (r0 == 0) goto L23
            goto L93
        L23:
            h.g.a.a<androidx.compose.foundation.text.input.TextObfuscationMode> r0 = r6.textObfuscationMode
            java.lang.Object r0 = r0.invoke()
            androidx.compose.foundation.text.input.TextObfuscationMode r0 = (androidx.compose.foundation.text.input.TextObfuscationMode) r0
            int r0 = r0.m3505unboximpl()
            androidx.compose.foundation.text.input.TextObfuscationMode$Companion r2 = androidx.compose.foundation.text.input.TextObfuscationMode.Companion
            int r2 = r2.m3507getRevealLastTypedvTwcZD0()
            boolean r2 = androidx.compose.foundation.text.input.TextObfuscationMode.m3502equalsimpl0(r0, r2)
            if (r2 == 0) goto L3c
            goto L74
        L3c:
            androidx.compose.foundation.text.input.TextObfuscationMode$Companion r2 = androidx.compose.foundation.text.input.TextObfuscationMode.Companion
            int r2 = r2.m3508getSystemvTwcZD0()
            boolean r0 = androidx.compose.foundation.text.input.TextObfuscationMode.m3502equalsimpl0(r0, r2)
            if (r0 == 0) goto L8f
            h.g.a.a<androidx.compose.foundation.text.SplitVisibilitySettings> r0 = r6.platformAllowsReveal
            java.lang.Object r0 = r0.invoke()
            androidx.compose.foundation.text.SplitVisibilitySettings r0 = (androidx.compose.foundation.text.SplitVisibilitySettings) r0
            int r0 = r0.m3372unboximpl()
            androidx.compose.foundation.text.input.TextFieldBuffer$ChangeList r2 = r7.getChanges()
            boolean r4 = r2 instanceof androidx.compose.foundation.text.input.internal.ChangeTracker
            if (r4 == 0) goto L5f
            androidx.compose.foundation.text.input.internal.ChangeTracker r2 = (androidx.compose.foundation.text.input.internal.ChangeTracker) r2
            goto L60
        L5f:
            r2 = 0
        L60:
            if (r2 == 0) goto L6d
            boolean r2 = r2.isFromHardwareSource$foundation(r3)
            if (r2 == 0) goto L6d
            boolean r0 = androidx.compose.foundation.text.SplitVisibilitySettings.m3368getPhysicalimpl(r0)
            goto L71
        L6d:
            boolean r0 = androidx.compose.foundation.text.SplitVisibilitySettings.m3369getTouchimpl(r0)
        L71:
            if (r0 != 0) goto L74
            goto L8f
        L74:
            androidx.compose.foundation.text.input.TextFieldBuffer$ChangeList r7 = r7.getChanges()
            long r0 = r7.mo3481getRangejx7JFs(r3)
            int r7 = androidx.compose.ui.text.TextRange.m10544getMinimpl(r0)
            int r0 = r6.getRevealCodepointIndex$foundation()
            if (r0 == r7) goto L8e
            h.g.a.a<h.ab> r0 = r6.scheduleHide
            r0.invoke()
            r6.setRevealCodepointIndex(r7)
        L8e:
            return
        L8f:
            r6.setRevealCodepointIndex(r1)
            return
        L93:
            r6.setRevealCodepointIndex(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.PasswordInputTransformation.transformInput(androidx.compose.foundation.text.input.TextFieldBuffer):void");
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public /* synthetic */ void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }
}
