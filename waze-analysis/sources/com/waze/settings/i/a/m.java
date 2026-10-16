package com.waze.settings.i.a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.webkit.internal.AssetHelper;
import com.waze.R;
import com.waze.car_lib.r.cq;
import com.waze.settings.CustomPromptsRecordingActivity;
import com.waze.settings.cs;
import com.waze.ui.af.ap;
import com.waze.ui.af.v;
import h.ab;
import h.g.b.x;
import java.util.Arrays;
import java.util.Objects;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m extends com.waze.app_nav.a.b implements org.a.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f37413a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f37414b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f37415c;

    /* renamed from: d, reason: collision with root package name */
    private final h.f f37416d;

    /* renamed from: e, reason: collision with root package name */
    private final ActivityResultLauncher f37417e;

    /* renamed from: f, reason: collision with root package name */
    private final h.f f37418f;

    public m() {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("VoiceSettingsFragment");
        x.e(eVarD, "create(...)");
        this.f37413a = eVarD;
        m mVar = this;
        this.f37414b = org.a.b.b.d.a(mVar);
        this.f37415c = h.g.b(h.h.f48132c, new l(mVar, new k(mVar)));
        this.f37416d = h.g.b(h.h.f48130a, new j(this));
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new h(0));
        x.e(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f37417e = activityResultLauncherRegisterForActivityResult;
        this.f37418f = h.g.a(new com.waze.bk.f(this, 11));
    }

    public static final /* synthetic */ cs c(m mVar) {
        return (cs) mVar.f37418f.getValue();
    }

    public static /* synthetic */ ab e(m mVar, State state, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(732734404, i2, -1, "com.waze.settings.voices.presentation.VoiceSettingsFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (VoiceSettingsFragment.kt:60)");
            }
            v vVarK = k(state);
            q qVarI = mVar.i();
            boolean zChangedInstance = composer.changedInstance(qVarI);
            i iVarRememberedValue = composer.rememberedValue();
            if (zChangedInstance || iVarRememberedValue == Composer.Companion.getEmpty()) {
                iVarRememberedValue = new i(qVarI);
                composer.updateRememberedValue(iVarRememberedValue);
            }
            ap.o(vVarK, (h.g.a.l) iVarRememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public static /* synthetic */ ab f(m mVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(480761344, i2, -1, "com.waze.settings.voices.presentation.VoiceSettingsFragment.onCreateView.<anonymous>.<anonymous> (VoiceSettingsFragment.kt:56)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(mVar.i().k(), null, composer, 0, 1);
            com.waze.shared_infra.i.e eVar = mVar.f37413a;
            v vVarK = k(stateCollectAsState);
            Objects.toString(vVarK);
            eVar.a("ui state: ".concat(String.valueOf(vVarK)));
            cq.k(false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(732734404, true, new com.waze.parking.f(mVar, stateCollectAsState, 6), composer, 54), composer, 196608);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public static final /* synthetic */ void g(m mVar, boolean z, boolean z2, String str, String str2) {
        Context context = mVar.getContext();
        if (context == null || context.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            mVar.f37417e.launch("android.permission.RECORD_AUDIO");
            return;
        }
        if (!z && !z2) {
            mVar.i().p();
        }
        Intent intent = new Intent(mVar.getContext(), (Class<?>) CustomPromptsRecordingActivity.class);
        intent.putExtra("EXTRA_EDIT_MODE", z);
        intent.putExtra("EXTRA_READ_ONLY_MODE", z2);
        if (str != null) {
            intent.putExtra("EXTRA_SET_NAME", str);
        }
        if (str2 != null) {
            intent.putExtra("EXTRA_SET_UUID", str2);
        }
        mVar.requireContext().startActivity(intent);
    }

    public static final /* synthetic */ void h(m mVar, String str, String str2) {
        if (str2.length() == 0) {
            return;
        }
        String str3 = String.format(str2, Arrays.copyOf(new Object[]{str}, 1));
        x.e(str3, "format(...)");
        String strC = mVar.j().c(R.string.VOICE_PROMPTS_SHARE_TEXT_PS, str3);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", strC);
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        mVar.startActivity(Intent.createChooser(intent, mVar.j().c(R.string.VOICE_PROMPTS_SEND_TO, new Object[0])));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q i() {
        return (q) this.f37415c.getValue();
    }

    private final com.waze.shared_infra.o.a j() {
        return (com.waze.shared_infra.o.a) this.f37416d.getValue();
    }

    private static final v k(State state) {
        return (v) state.getValue();
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f37414b.getValue();
    }

    @Override // org.a.a.b.a
    public final /* synthetic */ void m() {
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        x.f(layoutInflater, "inflater");
        i().o();
        Context contextRequireContext = requireContext();
        x.e(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(480761344, true, new com.waze.z.a.c.n(this, 6)));
        return composeView;
    }

    @Override // com.waze.app_nav.a.b, android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        x.f(view, "view");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        aj.z(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new o(this, (h.c.e) null, 1), 3);
    }
}
