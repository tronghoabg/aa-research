package com.waze.settings;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.waze.R;
import com.waze.design_components.button.WazeButton;
import com.waze.sound.PromptDefinition;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class r extends android.support.v7.widget.fe {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f37450b = 0;

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CustomPromptsRecordingActivity f37451a;

    /* renamed from: c, reason: collision with root package name */
    private PromptDefinition f37452c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f37453d;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f37454e;

    /* renamed from: f, reason: collision with root package name */
    private final WazeButton f37455f;

    /* renamed from: g, reason: collision with root package name */
    private final WazeButton f37456g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(final CustomPromptsRecordingActivity customPromptsRecordingActivity, View view) {
        super(view);
        h.g.b.x.f(view, "itemView");
        this.f37451a = customPromptsRecordingActivity;
        View viewFindViewById = view.findViewById(R.id.lblItemName);
        h.g.b.x.e(viewFindViewById, "findViewById(...)");
        this.f37453d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.lblMaxDuration);
        h.g.b.x.e(viewFindViewById2, "findViewById(...)");
        this.f37454e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.btnDeleteItem);
        h.g.b.x.e(viewFindViewById3, "findViewById(...)");
        WazeButton wazeButton = (WazeButton) viewFindViewById3;
        this.f37455f = wazeButton;
        View viewFindViewById4 = view.findViewById(R.id.btnPreviewItem);
        h.g.b.x.e(viewFindViewById4, "findViewById(...)");
        WazeButton wazeButton2 = (WazeButton) viewFindViewById4;
        this.f37456g = wazeButton2;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.waze.settings.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                r.b(customPromptsRecordingActivity, this);
            }
        };
        view.setOnClickListener(true == customPromptsRecordingActivity.s ? onClickListener : new View.OnClickListener() { // from class: com.waze.settings.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                r.c(customPromptsRecordingActivity, this);
            }
        });
        if (customPromptsRecordingActivity.s) {
            wazeButton.setVisibility(8);
        } else {
            wazeButton.setOnClickListener(new View.OnClickListener() { // from class: com.waze.settings.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    r.d(customPromptsRecordingActivity, this);
                }
            });
        }
        wazeButton2.setOnClickListener(onClickListener);
    }

    static final void b(CustomPromptsRecordingActivity customPromptsRecordingActivity, r rVar) {
        x xVarF = customPromptsRecordingActivity.F();
        PromptDefinition promptDefinition = rVar.f37452c;
        if (promptDefinition == null) {
            h.g.b.x.j("data");
            promptDefinition = null;
        }
        xVarF.h(promptDefinition);
    }

    static final void c(CustomPromptsRecordingActivity customPromptsRecordingActivity, r rVar) {
        if (customPromptsRecordingActivity.p != null) {
            return;
        }
        CustomPromptsRecordingActivity customPromptsRecordingActivity2 = customPromptsRecordingActivity;
        PromptDefinition promptDefinition = rVar.f37452c;
        if (promptDefinition == null) {
            h.g.b.x.j("data");
            promptDefinition = null;
        }
        customPromptsRecordingActivity.p = com.waze.sound.cw.o(customPromptsRecordingActivity2, promptDefinition, new q(customPromptsRecordingActivity));
    }

    static final void d(CustomPromptsRecordingActivity customPromptsRecordingActivity, r rVar) {
        customPromptsRecordingActivity.q = true;
        x xVarF = customPromptsRecordingActivity.F();
        PromptDefinition promptDefinition = rVar.f37452c;
        RecyclerView recyclerView = null;
        if (promptDefinition == null) {
            h.g.b.x.j("data");
            promptDefinition = null;
        }
        xVarF.g(promptDefinition);
        RecyclerView recyclerView2 = customPromptsRecordingActivity.f36670l;
        if (recyclerView2 == null) {
            h.g.b.x.j("recycler");
        } else {
            recyclerView = recyclerView2;
        }
        android.support.v7.widget.eb ebVarJ = recyclerView.j();
        if (ebVarJ != null) {
            ebVarJ.notifyDataSetChanged();
        }
    }

    public final void a(PromptDefinition promptDefinition) {
        h.g.b.x.f(promptDefinition, "data");
        this.f37452c = promptDefinition;
        String displayText = promptDefinition.getDisplayText();
        TextView textView = this.f37453d;
        textView.setText(displayText);
        CustomPromptsRecordingActivity customPromptsRecordingActivity = this.f37451a;
        Locale locale = Locale.US;
        String strC = customPromptsRecordingActivity.z.c(R.string.CUSTOM_PROMPTS_X_SECONDS_MAX, new Object[0]);
        PromptDefinition promptDefinition2 = this.f37452c;
        if (promptDefinition2 == null) {
            h.g.b.x.j("data");
            promptDefinition2 = null;
        }
        String str = String.format(locale, strC, Arrays.copyOf(new Object[]{Integer.valueOf(promptDefinition2.getMaxSeconds())}, 1));
        h.g.b.x.e(str, "format(...)");
        TextView textView2 = this.f37454e;
        textView2.setText(str);
        boolean zM = customPromptsRecordingActivity.F().m(promptDefinition);
        if (!customPromptsRecordingActivity.s) {
            WazeButton wazeButton = this.f37455f;
            if (zM) {
                wazeButton.setVisibility(0);
                this.f37456g.setVisibility(0);
                return;
            } else {
                wazeButton.setVisibility(4);
                this.f37456g.setVisibility(4);
                return;
            }
        }
        this.f37455f.setVisibility(8);
        float f2 = true != zM ? 0.5f : 1.0f;
        textView.setAlpha(f2);
        textView2.setAlpha(f2);
        WazeButton wazeButton2 = this.f37456g;
        if (zM) {
            wazeButton2.setVisibility(0);
        } else {
            wazeButton2.setVisibility(8);
        }
    }
}
