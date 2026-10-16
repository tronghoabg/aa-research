package androidx.compose.foundation.text.contextmenu;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope_androidKt;
import androidx.compose.foundation.text.contextmenu.data.ProcessTextKey;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.ui.text.TextRange;
import h.ab;
import h.g.a.l;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ProcessText_androidKt {
    /* renamed from: addProcessedTextContextMenuItems-UAq72N0, reason: not valid java name */
    public static final void m3431addProcessedTextContextMenuItemsUAq72N0(TextContextMenuBuilderScope textContextMenuBuilderScope, Context context, final boolean z, final CharSequence charSequence, final long j2) {
        if (!ComposeFoundationFlags.isSmartSelectionEnabled || TextRange.m10540getCollapsedimpl(j2) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List<ResolveInfo> listQueryProcessTextActivities = ProcessTextApi23Impl.INSTANCE.queryProcessTextActivities(context2);
        if (listQueryProcessTextActivities.isEmpty()) {
            return;
        }
        textContextMenuBuilderScope.separator();
        int size = listQueryProcessTextActivities.size();
        int i2 = 0;
        while (i2 < size) {
            final ResolveInfo resolveInfo = listQueryProcessTextActivities.get(i2);
            TextContextMenuBuilderScope_androidKt.item$default(textContextMenuBuilderScope, new ProcessTextKey(i2), resolveInfo.loadLabel(packageManager).toString(), 0, new l() { // from class: androidx.compose.foundation.text.contextmenu.ProcessText_androidKt$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return ProcessText_androidKt.addProcessedTextContextMenuItems_UAq72N0$lambda$0$0(context2, resolveInfo, z, charSequence, j2, (TextContextMenuSession) obj);
                }
            }, 4, null);
            i2++;
            context2 = context;
        }
        textContextMenuBuilderScope.separator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab addProcessedTextContextMenuItems_UAq72N0$lambda$0$0(Context context, ResolveInfo resolveInfo, boolean z, CharSequence charSequence, long j2, TextContextMenuSession textContextMenuSession) {
        ProcessTextApi23Impl.INSTANCE.getOnClickProcessTextItem().invoke(context, resolveInfo, Boolean.valueOf(z), charSequence, TextRange.m10534boximpl(j2));
        textContextMenuSession.close();
        return ab.f48028a;
    }
}
