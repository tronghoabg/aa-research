package androidx.navigation;

import androidx.autofill.HintConstants;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final /* synthetic */ class NamedNavArgumentKt__NamedNavArgumentKt {
    public static final NamedNavArgument navArgument(String str, l<? super NavArgumentBuilder, ab> lVar) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(lVar, "builder");
        NavArgumentBuilder navArgumentBuilder = new NavArgumentBuilder();
        lVar.invoke(navArgumentBuilder);
        return new NamedNavArgument(str, navArgumentBuilder.build());
    }
}
