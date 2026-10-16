package androidx.navigation.fragment;

import android.os.Bundle;
import android.support.v4.app.ar;
import androidx.navigation.NavArgs;
import androidx.navigation.NavArgsLazy;
import h.g.a.a;
import h.g.b.m;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FragmentNavArgsLazyKt {
    public static final /* synthetic */ <Args extends NavArgs> NavArgsLazy<Args> navArgs(final ar arVar) {
        x.f(arVar, "<this>");
        x.i();
        int i2 = h.g.b.ar.f48106a;
        return new NavArgsLazy<>(new m(NavArgs.class), new a<Bundle>() { // from class: androidx.navigation.fragment.FragmentNavArgsLazyKt.navArgs.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // h.g.a.a
            public final Bundle invoke() {
                Bundle arguments = arVar.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                throw new IllegalStateException("Fragment " + arVar + " has null arguments");
            }
        });
    }
}
