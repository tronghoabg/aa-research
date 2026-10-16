package androidx.compose.ui.autofill;

import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidAutofillManager_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isAutofillable(SemanticsConfiguration semanticsConfiguration) {
        if (x.n(SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getContentDataType()), ContentDataType.Companion.getNone())) {
            return false;
        }
        return semanticsConfiguration.getProps$ui().contains(SemanticsActions.INSTANCE.getOnAutofillText()) || semanticsConfiguration.getProps$ui().contains(SemanticsActions.INSTANCE.getOnFillData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRelatedToAutoCommit(SemanticsConfiguration semanticsConfiguration) {
        return semanticsConfiguration.getProps$ui().contains(SemanticsProperties.INSTANCE.getContentType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRelatedToAutofill(SemanticsConfiguration semanticsConfiguration) {
        return semanticsConfiguration.getProps$ui().contains(SemanticsActions.INSTANCE.getOnAutofillText()) || semanticsConfiguration.getProps$ui().contains(SemanticsActions.INSTANCE.getOnFillData()) || semanticsConfiguration.getProps$ui().contains(SemanticsProperties.INSTANCE.getContentType()) || semanticsConfiguration.getProps$ui().contains(SemanticsProperties.INSTANCE.getContentDataType());
    }
}
