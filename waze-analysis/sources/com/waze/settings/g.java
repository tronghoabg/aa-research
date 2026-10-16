package com.waze.settings;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f37288a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f37289b;

    public /* synthetic */ g(Object obj, int i2) {
        this.f37289b = i2;
        this.f37288a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i2 = 0;
        switch (this.f37289b) {
            case 0:
                CustomPromptsRecordingActivity.C((CustomPromptsRecordingActivity) this.f37288a);
                break;
            case 1:
                CustomPromptsRecordingActivity.B((CustomPromptsRecordingActivity) this.f37288a);
                break;
            case 2:
                CustomPromptsRecordingActivity.E((CustomPromptsRecordingActivity) this.f37288a);
                break;
            case 3:
                Object obj = this.f37288a;
                int i3 = i.f37397b;
                com.waze.ab.o oVar = new com.waze.ab.o();
                CustomPromptsRecordingActivity customPromptsRecordingActivity = (CustomPromptsRecordingActivity) obj;
                oVar.Q(customPromptsRecordingActivity.z.c(R.string.CUSTOM_PROMPTS_REMOVE_ALL_TITLE, new Object[0]));
                oVar.P("");
                oVar.f13808a = new h(customPromptsRecordingActivity, 2);
                oVar.M(customPromptsRecordingActivity.z.c(R.string.REMOVE, new Object[0]));
                oVar.N(customPromptsRecordingActivity.z.c(R.string.CANCEL, new Object[0]));
                com.waze.z.a.d.ai.q(oVar);
                break;
            case 4:
                int i4 = i.f37397b;
                Object obj2 = this.f37288a;
                CustomPromptsRecordingActivity customPromptsRecordingActivity2 = (CustomPromptsRecordingActivity) obj2;
                customPromptsRecordingActivity2.F().j();
                customPromptsRecordingActivity2.startActivity(new Intent((Context) obj2, (Class<?>) CustomVoicesFallbackVoicePickerActivity.class));
                break;
            case 5:
                Object obj3 = this.f37288a;
                int i5 = i.f37397b;
                com.waze.ab.o oVar2 = new com.waze.ab.o();
                CustomPromptsRecordingActivity customPromptsRecordingActivity3 = (CustomPromptsRecordingActivity) obj3;
                oVar2.Q(customPromptsRecordingActivity3.z.c(R.string.VOICE_PROMPTS_DELETE_SET_TITLE, new Object[0]));
                oVar2.P("");
                oVar2.f13808a = new h(customPromptsRecordingActivity3, i2);
                oVar2.M(customPromptsRecordingActivity3.z.c(R.string.DELETE, new Object[0]));
                oVar2.N(customPromptsRecordingActivity3.z.c(R.string.CANCEL, new Object[0]));
                com.waze.z.a.d.ai.q(oVar2);
                break;
            case 6:
                ba.I((ba) this.f37288a);
                break;
            case 7:
                ba.J((ba) this.f37288a);
                break;
            case 8:
                ba.K((ba) this.f37288a);
                break;
            case 9:
                ba.L((ba) this.f37288a);
                break;
            case 10:
                ba.M((ba) this.f37288a);
                break;
            case 11:
                dc.q((dc) this.f37288a, view);
                break;
            case 12:
                ((com.waze.view.popups.t) this.f37288a).d();
                break;
            case 13:
                ((com.waze.view.popups.t) this.f37288a).d();
                break;
            case 14:
                ((com.waze.view.popups.a.h) this.f37288a).f45196b.b(com.waze.view.popups.b.f.f45256a);
                break;
            case 15:
                ((com.waze.view.popups.a.h) this.f37288a).f45196b.b(com.waze.view.popups.b.g.f45257a);
                break;
            case 16:
                com.waze.view.popups.a.h.v((com.waze.view.popups.a.h) this.f37288a);
                break;
            case 17:
                ((com.waze.view.popups.a.h) this.f37288a).K();
                break;
            case 18:
                ((ImageView) this.f37288a).performClick();
                break;
            case 19:
                com.waze.view.popups.a.h.z((com.waze.view.popups.a.h) this.f37288a);
                break;
            default:
                com.waze.view.popups.a.h.p((com.waze.view.popups.a.h) this.f37288a);
                break;
        }
    }
}
