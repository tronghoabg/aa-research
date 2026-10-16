package androidx.camera.core.internal.compat.quirk;

import android.support.v4.a.a.a;
import android.support.v4.a.a.b;
import android.support.v4.a.a.e;
import androidx.camera.core.impl.Quirk;
import h.f;
import h.g;
import h.g.b.o;
import h.g.b.x;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class BackportedFixQuirk implements Quirk {
    public static final Companion Companion = new Companion(null);
    private static final f<a> backportedFixManager$delegate = g.a(new h.g.a.a() { // from class: androidx.camera.core.internal.compat.quirk.BackportedFixQuirk$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return BackportedFixQuirk.backportedFixManager_delegate$lambda$0();
        }
    });

    static final a backportedFixManager_delegate$lambda$0() {
        return new a();
    }

    public abstract b getKnownIssue();

    public final boolean hasIssue() {
        a backportedFixManager = Companion.getBackportedFixManager();
        b knownIssue = getKnownIssue();
        x.f(knownIssue, "ki");
        e eVarA = backportedFixManager.a(knownIssue);
        e eVar = e.f82a;
        int iOrdinal = eVarA.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2) {
                return false;
            }
            if (iOrdinal != 3) {
                throw new i();
            }
        }
        return true;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final a getBackportedFixManager() {
            return (a) BackportedFixQuirk.backportedFixManager$delegate.getValue();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
