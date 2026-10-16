package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.window.DialogProperties;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.NavDestinationDsl;
import androidx.navigation.NavType;
import androidx.navigation.compose.DialogNavigator;
import h.ab;
import h.g.a.q;
import h.l.c;
import h.l.s;
import java.util.Map;

/* compiled from: WazeSource */
@NavDestinationDsl
/* loaded from: classes3.dex */
public final class DialogNavigatorDestinationBuilder extends NavDestinationBuilder<DialogNavigator.Destination> {
    public static final int $stable = 8;
    private final q<NavBackStackEntry, Composer, Integer, ab> content;
    private final DialogNavigator dialogNavigator;
    private final DialogProperties dialogProperties;

    /* JADX WARN: Multi-variable type inference failed */
    public DialogNavigatorDestinationBuilder(DialogNavigator dialogNavigator, String str, DialogProperties dialogProperties, q<? super NavBackStackEntry, ? super Composer, ? super Integer, ab> qVar) {
        super(dialogNavigator, str);
        this.dialogNavigator = dialogNavigator;
        this.dialogProperties = dialogProperties;
        this.content = qVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.navigation.NavDestinationBuilder
    public DialogNavigator.Destination instantiateDestination() {
        return new DialogNavigator.Destination(this.dialogNavigator, this.dialogProperties, this.content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DialogNavigatorDestinationBuilder(DialogNavigator dialogNavigator, c<?> cVar, Map<s, NavType<?>> map, DialogProperties dialogProperties, q<? super NavBackStackEntry, ? super Composer, ? super Integer, ab> qVar) {
        super(dialogNavigator, cVar, map);
        this.dialogNavigator = dialogNavigator;
        this.dialogProperties = dialogProperties;
        this.content = qVar;
    }
}
