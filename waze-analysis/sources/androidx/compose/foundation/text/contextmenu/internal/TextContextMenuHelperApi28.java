package androidx.compose.foundation.text.contextmenu.internal;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.j$$ExternalSyntheticApiModelOutline1;
import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuTextClassificationItem;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextContextMenuHelperApi28 {
    public static final TextContextMenuHelperApi28 INSTANCE = new TextContextMenuHelperApi28();

    private TextContextMenuHelperApi28() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconBox(final Drawable drawable, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(257732500);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(drawable) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(257732500, i3, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.IconBox (DefaultTextContextMenuDropdownProvider.android.kt:263)");
            }
            Modifier modifierM2822size3ABfNKs = SizeKt.m2822size3ABfNKs(Modifier.Companion, ContextMenuSpec.INSTANCE.m2102getIconSizeD9Ej5fM());
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(drawable);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28$$ExternalSyntheticLambda4
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return TextContextMenuHelperApi28.IconBox$lambda$0$0(drawable, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BoxKt.Box(DrawModifierKt.drawBehind(modifierM2822size3ABfNKs, (l) objRememberedValue), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28$$ExternalSyntheticLambda5
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TextContextMenuHelperApi28.IconBox$lambda$1(this.f$0, drawable, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab IconBox$lambda$0$0(Drawable drawable, DrawScope drawScope) {
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32)), (int) Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
        drawable.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        return ab.f48028a;
    }

    static final ab IconBox$lambda$1(TextContextMenuHelperApi28 textContextMenuHelperApi28, Drawable drawable, int i2, Composer composer, int i3) {
        textContextMenuHelperApi28.IconBox(drawable, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final String textClassificationItem$lambda$0(TextClassification textClassification, Composer composer, int i2) {
        composer.startReplaceGroup(950061013);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(950061013, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:248)");
        }
        String strValueOf = String.valueOf(textClassification.getLabel());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strValueOf;
    }

    static final ab textClassificationItem$lambda$2(Context context, TextClassification textClassification) throws PendingIntent.CanceledException {
        TextClassificationHelperApi28.INSTANCE.sendLegacyIntent(context, textClassification);
        return ab.f48028a;
    }

    static final String textClassificationItem$lambda$3(RemoteAction remoteAction, Composer composer, int i2) {
        composer.startReplaceGroup(-1376593684);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1376593684, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:255)");
        }
        String string = remoteAction.getTitle().toString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return string;
    }

    static final ab textClassificationItem$lambda$5(RemoteAction remoteAction) throws PendingIntent.CanceledException {
        TextClassificationHelperApi28.INSTANCE.sendPendingIntent(remoteAction.getActionIntent());
        return ab.f48028a;
    }

    public final void textClassificationItem(ContextMenuScope contextMenuScope, final Context context, TextContextMenuTextClassificationItem textContextMenuTextClassificationItem) {
        if (context == null) {
            return;
        }
        int index = textContextMenuTextClassificationItem.getIndex();
        final TextClassification textClassification = textContextMenuTextClassificationItem.getTextClassification();
        final Drawable icon = textContextMenuTextClassificationItem.getIcon();
        if (index < 0) {
            ContextMenuScope.item$default(contextMenuScope, new p() { // from class: androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TextContextMenuHelperApi28.textClassificationItem$lambda$0(textClassification, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, null, false, icon != null ? ComposableLambdaKt.composableLambdaInstance(-1123224187, true, new q<Color, Composer, Integer, ab>() { // from class: androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28$textClassificationItem$2$1
                @Override // h.g.a.q
                public /* bridge */ /* synthetic */ ab invoke(Color color, Composer composer, Integer num) {
                    m3446invokeek8zF_U(color.m8238unboximpl(), composer, num.intValue());
                    return ab.f48028a;
                }

                /* renamed from: invoke-ek8zF_U, reason: not valid java name */
                public final void m3446invokeek8zF_U(long j2, Composer composer, int i2) {
                    if (!composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1123224187, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous>.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:249)");
                    }
                    TextContextMenuHelperApi28.INSTANCE.IconBox(icon, composer, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }) : null, new a() { // from class: androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28$$ExternalSyntheticLambda1
                @Override // h.g.a.a
                public final Object invoke() {
                    return TextContextMenuHelperApi28.textClassificationItem$lambda$2(context, textClassification);
                }
            }, 6, null);
        } else {
            final RemoteAction remoteActionM = j$$ExternalSyntheticApiModelOutline1.m(textClassification.getActions().get(index));
            ContextMenuScope.item$default(contextMenuScope, new p() { // from class: androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TextContextMenuHelperApi28.textClassificationItem$lambda$3(remoteActionM, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, null, false, icon != null ? ComposableLambdaKt.composableLambdaInstance(1106162332, true, new q<Color, Composer, Integer, ab>() { // from class: androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28$textClassificationItem$5$1
                @Override // h.g.a.q
                public /* bridge */ /* synthetic */ ab invoke(Color color, Composer composer, Integer num) {
                    m3447invokeek8zF_U(color.m8238unboximpl(), composer, num.intValue());
                    return ab.f48028a;
                }

                /* renamed from: invoke-ek8zF_U, reason: not valid java name */
                public final void m3447invokeek8zF_U(long j2, Composer composer, int i2) {
                    if (!composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1106162332, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous>.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:256)");
                    }
                    TextContextMenuHelperApi28.INSTANCE.IconBox(icon, composer, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }) : null, new a() { // from class: androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28$$ExternalSyntheticLambda3
                @Override // h.g.a.a
                public final Object invoke() {
                    return TextContextMenuHelperApi28.textClassificationItem$lambda$5(remoteActionM);
                }
            }, 6, null);
        }
    }
}
