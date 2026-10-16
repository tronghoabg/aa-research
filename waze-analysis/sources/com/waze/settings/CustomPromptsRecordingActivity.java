package com.waze.settings;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.R;
import com.waze.design_components.button.WazeButton;
import com.waze.design_components.header_view.WazeHeaderView;
import com.waze.sound.PromptDefinition;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class CustomPromptsRecordingActivity extends com.waze.ifs.ui.a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f36666f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static final Object f36667g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private static final Object f36668h = new Object();

    /* renamed from: k, reason: collision with root package name */
    private static final Object f36669k = new Object();

    /* renamed from: l, reason: collision with root package name */
    private RecyclerView f36670l;
    private FrameLayout m;
    private EditText n;
    private com.waze.sound.cw p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private String u;
    private String v;
    private final List o = new ArrayList();
    private final com.waze.shared_infra.o.a z = com.waze.shared_infra.o.b.a();
    private final h.f A = h.g.b(h.h.f48132c, new z(this, 1));

    static final void B(CustomPromptsRecordingActivity customPromptsRecordingActivity) {
        customPromptsRecordingActivity.I();
    }

    static final void C(CustomPromptsRecordingActivity customPromptsRecordingActivity) {
        customPromptsRecordingActivity.H();
    }

    static final void E(CustomPromptsRecordingActivity customPromptsRecordingActivity) {
        EditText editText = customPromptsRecordingActivity.n;
        if (editText == null) {
            h.g.b.x.j("nameYourVoiceEditText");
            editText = null;
        }
        String string = editText.getText().toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        customPromptsRecordingActivity.F().l(string, customPromptsRecordingActivity.r);
        customPromptsRecordingActivity.t = true;
        customPromptsRecordingActivity.setResult(-1);
        customPromptsRecordingActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x F() {
        return (x) this.A.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(String str) {
        boolean zB = ((w) F().d().d()).b();
        List list = this.o;
        list.clear();
        if (!this.s) {
            list.add(f36667g);
        }
        PromptDefinition[] promptDefinitionArrO = F().o();
        if (promptDefinitionArrO.length != 0) {
            String category = "";
            for (PromptDefinition promptDefinition : promptDefinitionArrO) {
                boolean z = true;
                if (promptDefinition.getMode() == 1) {
                    if (zB) {
                    }
                } else {
                    z = zB;
                }
                if (promptDefinition.getMode() != 2 || !z) {
                    if (!h.g.b.x.n(category, promptDefinition.getCategory())) {
                        String category2 = promptDefinition.getCategory();
                        h.g.b.x.e(category2, "getCategory(...)");
                        list.add(category2);
                        category = promptDefinition.getCategory();
                        h.g.b.x.e(category, "getCategory(...)");
                    }
                    list.add(promptDefinition);
                }
            }
        }
        list.add("");
        list.add(new k(str));
        list.add("");
        if (!this.s) {
            list.add(f36669k);
            list.add("");
        }
        if (this.r || this.s) {
            list.add(f36668h);
            list.add("");
        }
    }

    private final void H() {
        FrameLayout frameLayout = this.m;
        if (frameLayout == null) {
            h.g.b.x.j("nameYourVoiceContainer");
            frameLayout = null;
        }
        frameLayout.setVisibility(8);
    }

    private final void I() {
        if (!F().n()) {
            Toast.makeText(this, this.z.c(R.string.VOICE_PROMPTS_MINIMUM_RECORDINGS_MESSAGE, new Object[0]), 0).show();
            return;
        }
        FrameLayout frameLayout = this.m;
        EditText editText = null;
        if (frameLayout == null) {
            h.g.b.x.j("nameYourVoiceContainer");
            frameLayout = null;
        }
        frameLayout.setVisibility(0);
        if (this.r && this.u != null) {
            EditText editText2 = this.n;
            if (editText2 == null) {
                h.g.b.x.j("nameYourVoiceEditText");
                editText2 = null;
            }
            editText2.setText(this.u);
        }
        EditText editText3 = this.n;
        if (editText3 == null) {
            h.g.b.x.j("nameYourVoiceEditText");
        } else {
            editText = editText3;
        }
        editText.requestFocus();
    }

    static final void y(CustomPromptsRecordingActivity customPromptsRecordingActivity, boolean z) {
        if (z) {
            customPromptsRecordingActivity.I();
        } else {
            customPromptsRecordingActivity.setResult(0);
            customPromptsRecordingActivity.finish();
        }
    }

    @Override // com.waze.sharedui.a.e, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        com.waze.sound.cw cwVar = this.p;
        if (cwVar != null) {
            cwVar.m();
            return;
        }
        FrameLayout frameLayout = this.m;
        if (frameLayout == null) {
            h.g.b.x.j("nameYourVoiceContainer");
            frameLayout = null;
        }
        if (frameLayout.getVisibility() == 0) {
            H();
            return;
        }
        if (!this.q) {
            super.onBackPressed();
            return;
        }
        com.waze.ab.o oVar = new com.waze.ab.o();
        com.waze.shared_infra.o.a aVar = this.z;
        oVar.Q(aVar.c(R.string.VOICE_PROMPT_CANCEL_ARE_YOU_SURE_TITLE, new Object[0]));
        int i2 = 1;
        oVar.P(aVar.c(true != this.r ? R.string.VOICE_PROMPT_CANCEL_ARE_YOU_SURE_TEXT : R.string.VOICE_PROMPT_CANCEL_EDIT_ARE_YOU_SURE_TEXT, new Object[0]));
        oVar.f13808a = new h(this, i2);
        oVar.M(aVar.c(R.string.SAVE, new Object[0]));
        oVar.N(aVar.c(R.string.VOICE_PROMPT_CANCEL_ARE_YOU_SURE_DISCARD, new Object[0]));
        com.waze.z.a.d.ai.q(oVar);
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        aE();
        super.onCreate(bundle);
        int i2 = 0;
        this.r = getIntent().getBooleanExtra("EXTRA_EDIT_MODE", false);
        this.s = getIntent().getBooleanExtra("EXTRA_READ_ONLY_MODE", false);
        this.u = getIntent().getStringExtra("EXTRA_SET_NAME");
        this.v = getIntent().getStringExtra("EXTRA_SET_UUID");
        setContentView(R.layout.settings_custom_prompts);
        RecyclerView recyclerView = null;
        G(null);
        WazeHeaderView wazeHeaderView = (WazeHeaderView) findViewById(R.id.headerView);
        com.waze.shared_infra.o.a aVar = this.z;
        wazeHeaderView.h(aVar.c(R.string.CUSTOM_PROMPTS_TITLE, new Object[0]));
        int i3 = 1;
        if (!this.s) {
            wazeHeaderView.g(com.waze.design_components.header_view.a.f23475c);
            wazeHeaderView.d(aVar.c(R.string.DONE, new Object[0]));
            wazeHeaderView.f(new g(this, i3));
        }
        View viewFindViewById = findViewById(R.id.promptsRecycler);
        h.g.b.x.e(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView2 = (RecyclerView) viewFindViewById;
        this.f36670l = recyclerView2;
        if (recyclerView2 == null) {
            h.g.b.x.j("recycler");
            recyclerView2 = null;
        }
        recyclerView2.al(new LinearLayoutManager());
        RecyclerView recyclerView3 = this.f36670l;
        if (recyclerView3 == null) {
            h.g.b.x.j("recycler");
            recyclerView3 = null;
        }
        recyclerView3.ak(new s(this));
        View viewFindViewById2 = findViewById(R.id.nameVoiceContainer);
        h.g.b.x.e(viewFindViewById2, "findViewById(...)");
        this.m = (FrameLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.nameYourVoiceEditText);
        h.g.b.x.e(viewFindViewById3, "findViewById(...)");
        EditText editText = (EditText) viewFindViewById3;
        this.n = editText;
        if (editText == null) {
            h.g.b.x.j("nameYourVoiceEditText");
            editText = null;
        }
        editText.setHint(aVar.c(R.string.VOICE_PROMPT_VOICE_NAME_MESSAGEBOX_PLACEHOLDER, new Object[0]));
        View viewFindViewById4 = findViewById(R.id.lblNameYourVoice);
        h.g.b.x.d(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById4).setText(aVar.c(R.string.VOICE_PROMPT_VOICE_NAME_MESSAGEBOX_TITLE, new Object[0]));
        View viewFindViewById5 = findViewById(R.id.lblNameYourVoiceDetails);
        h.g.b.x.d(viewFindViewById5, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById5).setText(aVar.c(R.string.VOICE_PROMPT_VOICE_NAME_MESSAGEBOX_DESCRIPTION, new Object[0]));
        WazeButton wazeButton = (WazeButton) findViewById(R.id.btnNameVoiceCancel);
        WazeButton wazeButton2 = (WazeButton) findViewById(R.id.btnNameVoiceAdd);
        wazeButton.h(aVar.c(R.string.CANCEL, new Object[0]));
        wazeButton2.h(aVar.c(true != this.r ? R.string.ADD : R.string.SAVE, new Object[0]));
        wazeButton.setOnClickListener(new g(this, i2));
        wazeButton2.setOnClickListener(new g(this, 2));
        FrameLayout frameLayout = this.m;
        if (frameLayout == null) {
            h.g.b.x.j("nameYourVoiceContainer");
            frameLayout = null;
        }
        frameLayout.setSoundEffectsEnabled(false);
        FrameLayout frameLayout2 = this.m;
        if (frameLayout2 == null) {
            h.g.b.x.j("nameYourVoiceContainer");
            frameLayout2 = null;
        }
        frameLayout2.setOnClickListener(new com.waze.inbox.e(14));
        F().k();
        kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new u(this, (h.c.e) null, 1), 3);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.root);
        h.g.b.x.c(viewGroup);
        ViewGroup viewGroup2 = viewGroup;
        RecyclerView recyclerView4 = this.f36670l;
        if (recyclerView4 == null) {
            h.g.b.x.j("recycler");
        } else {
            recyclerView = recyclerView4;
        }
        com.waze.shared_infra.g.e.d(viewGroup2, recyclerView);
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v7.app.o, android.support.v4.app.av, android.app.Activity
    protected final void onDestroy() {
        if (isFinishing() && ((this.r && !this.t) || this.s)) {
            F().e();
        }
        super.onDestroy();
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, android.app.Activity
    protected final void onPause() {
        super.onPause();
        com.waze.sound.cw cwVar = this.p;
        if (cwVar != null) {
            cwVar.m();
        }
    }
}
