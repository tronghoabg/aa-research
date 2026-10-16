package com.waze.view.popups.b;

import android.os.Bundle;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.core.os.BundleKt;
import androidx.fragment.compose.AndroidFragmentKt;
import androidx.media3.common.C;
import com.waze.NativeManager;
import h.ab;
import java.net.ProtocolException;
import java.util.Arrays;
import java.util.logging.Logger;
import okhttp3.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {
    public static final void a(m mVar, Modifier modifier, Composer composer, int i2, int i3) {
        int i4;
        h.g.b.x.f(mVar, "stateHolder");
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1057951518);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changed(mVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 3) != 2, i4 & 1)) {
            if ((i3 & 2) != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1057951518, i4, -1, "com.waze.view.popups.parking.MyParkingPhoto (MyParkingCompose.kt:10)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(mVar.a(), null, composerStartRestartGroup, 0, 1);
            i iVar = k(stateCollectAsState).f45261b;
            if (iVar != null) {
                composerStartRestartGroup.startReplaceGroup(963869274);
                l(iVar, SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(963940388);
                composerStartRestartGroup.endReplaceGroup();
            }
            j jVar = k(stateCollectAsState).f45262c;
            if (jVar != null) {
                composerStartRestartGroup.startReplaceGroup(964003194);
                m(jVar, SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(964074308);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.ui.d.l(mVar, modifier2, i2, i3, 5));
        }
    }

    static final ab b(i iVar, Modifier modifier, int i2, Composer composer) {
        l(iVar, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab c(j jVar, Modifier modifier, int i2, Composer composer) {
        m(jVar, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static final void d() {
        com.waze.view.navbar.o.d().e();
    }

    public static final void e() {
        NativeManager.getInstance().showTypingWhileDrivingWarningIfNeeded();
    }

    public static final okhttp3.internal.d.j f(String str) throws ProtocolException, NumberFormatException {
        aj ajVar;
        int i2;
        String strSubstring;
        h.g.b.x.f(str, "statusLine");
        if (h.n.o.ah(str, "HTTP/1.")) {
            i2 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                ajVar = aj.f55873a;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                ajVar = aj.f55874b;
            }
        } else {
            if (!h.n.o.ah(str, "ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            ajVar = aj.f55873a;
            i2 = 4;
        }
        int i3 = i2 + 3;
        if (str.length() < i3) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String strSubstring2 = str.substring(i2, i3);
            h.g.b.x.e(strSubstring2, "substring(...)");
            int i4 = Integer.parseInt(strSubstring2);
            if (str.length() <= i3) {
                strSubstring = "";
            } else {
                if (str.charAt(i3) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i2 + 4);
                h.g.b.x.e(strSubstring, "substring(...)");
            }
            return new okhttp3.internal.d.j(ajVar, i4, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static final String g(okhttp3.ab abVar) {
        h.g.b.x.f(abVar, "url");
        String strC = abVar.c();
        String strD = abVar.d();
        if (strD == null) {
            return strC;
        }
        return strC + "?" + strD;
    }

    public static final boolean h(String str) {
        h.g.b.x.f(str, "method");
        return (h.g.b.x.n(str, ShareTarget.METHOD_GET) || h.g.b.x.n(str, "HEAD")) ? false : true;
    }

    public static final String i(long j2) {
        String str;
        if (j2 <= -999500000) {
            str = ((j2 - 500000000) / C.NANOS_PER_SECOND) + " s ";
        } else if (j2 <= -999500) {
            str = ((j2 - 500000) / 1000000) + " ms";
        } else if (j2 <= 0) {
            str = ((j2 - 500) / 1000) + " µs";
        } else if (j2 < 999500) {
            str = ((j2 + 500) / 1000) + " µs";
        } else if (j2 < 999500000) {
            str = ((j2 + 500000) / 1000000) + " ms";
        } else {
            str = ((j2 + 500000000) / C.NANOS_PER_SECOND) + " s ";
        }
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        h.g.b.x.e(str2, "format(...)");
        return str2;
    }

    public static final /* synthetic */ void j(okhttp3.internal.b.a aVar, okhttp3.internal.b.c cVar, String str) {
        Logger logger = okhttp3.internal.b.e.f55974b;
        String strA = cVar.a();
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        h.g.b.x.e(str2, "format(...)");
        logger.fine(strA + " " + str2 + ": " + aVar.c());
    }

    private static final l k(State state) {
        return (l) state.getValue();
    }

    private static final void l(i iVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        Modifier modifier2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(2034074879);
        int i5 = 1;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(iVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2034074879, i3, -1, "com.waze.view.popups.parking.MyParkingShowPhoto (MyParkingCompose.kt:26)");
            }
            h.g.b.x.f(iVar, "descriptor");
            Bundle bundle = new Bundle();
            bundle.putString("KEY_IMAGE_FILE_PATH", iVar.f45258a);
            modifier2 = modifier;
            AndroidFragmentKt.AndroidFragment(u.class, modifier2, null, bundle, null, composerStartRestartGroup, i3 & 112, 20);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a(iVar, modifier2, i2, i5));
        }
    }

    private static final void m(j jVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        Modifier modifier2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(425830123);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(jVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        int i5 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(425830123, i3, -1, "com.waze.view.popups.parking.MyParkingTakePhoto (MyParkingCompose.kt:38)");
            }
            h.g.b.x.f(jVar, "descriptor");
            modifier2 = modifier;
            AndroidFragmentKt.AndroidFragment(z.class, modifier2, null, BundleKt.bundleOf(new h.k("KEY_SAVE_PATH", jVar.f45259a)), null, composerStartRestartGroup, i3 & 112, 20);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a(jVar, modifier2, i2, i5));
        }
    }
}
