package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.DialogProperties;
import h.ab;
import h.g.a.a;
import h.g.a.p;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class BasicAlertDialogOverrideScope {
    public static final int $stable = 0;
    private final p<Composer, Integer, ab> content;
    private final Modifier modifier;
    private final a<ab> onDismissRequest;
    private final DialogProperties properties;

    public /* synthetic */ BasicAlertDialogOverrideScope(a aVar, Modifier.Companion companion, DialogProperties dialogProperties, p pVar, int i2, o oVar) {
        this(aVar, (i2 & 2) != 0 ? Modifier.Companion : companion, (i2 & 4) != 0 ? new DialogProperties(false, false, false, 7, (o) null) : dialogProperties, pVar);
    }

    public final p<Composer, Integer, ab> getContent() {
        return this.content;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public final a<ab> getOnDismissRequest() {
        return this.onDismissRequest;
    }

    public final DialogProperties getProperties() {
        return this.properties;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BasicAlertDialogOverrideScope(a<ab> aVar, Modifier modifier, DialogProperties dialogProperties, p<? super Composer, ? super Integer, ab> pVar) {
        this.onDismissRequest = aVar;
        this.modifier = modifier;
        this.properties = dialogProperties;
        this.content = pVar;
    }
}
