package com.waze.settings;

import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i extends android.support.v7.widget.fe {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f37397b = 0;

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CustomPromptsRecordingActivity f37398a;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f37399c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f37400d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CustomPromptsRecordingActivity customPromptsRecordingActivity, View view) {
        super(view);
        h.g.b.x.f(view, "itemView");
        this.f37398a = customPromptsRecordingActivity;
        View viewFindViewById = view.findViewById(R.id.lblActionName);
        h.g.b.x.e(viewFindViewById, "findViewById(...)");
        this.f37399c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.lblSubtitle);
        h.g.b.x.e(viewFindViewById2, "findViewById(...)");
        this.f37400d = (TextView) viewFindViewById2;
    }

    public final void a(Object obj) {
        h.g.b.x.f(obj, "action");
        if (obj == CustomPromptsRecordingActivity.f36669k) {
            TextView textView = this.f37399c;
            CustomPromptsRecordingActivity customPromptsRecordingActivity = this.f37398a;
            textView.setTextColor(ContextCompat.getColor(customPromptsRecordingActivity, R.color.alarming_variant));
            textView.setText(customPromptsRecordingActivity.z.c(R.string.CUSTOM_PROMPTS_REMOVE_ALL, new Object[0]));
            this.f37400d.setVisibility(8);
            this.itemView.setOnClickListener(new g(customPromptsRecordingActivity, 3));
            return;
        }
        if (!(obj instanceof k)) {
            if (obj == CustomPromptsRecordingActivity.f36668h) {
                TextView textView2 = this.f37399c;
                CustomPromptsRecordingActivity customPromptsRecordingActivity2 = this.f37398a;
                textView2.setTextColor(ContextCompat.getColor(customPromptsRecordingActivity2, R.color.alarming_variant));
                textView2.setText(customPromptsRecordingActivity2.z.c(R.string.VOICE_PROMPT_DELETE_VOICE, new Object[0]));
                this.f37400d.setVisibility(8);
                this.itemView.setOnClickListener(new g(customPromptsRecordingActivity2, 5));
                return;
            }
            return;
        }
        TextView textView3 = this.f37399c;
        CustomPromptsRecordingActivity customPromptsRecordingActivity3 = this.f37398a;
        textView3.setTextColor(ContextCompat.getColor(customPromptsRecordingActivity3, R.color.content_default));
        textView3.setText(customPromptsRecordingActivity3.z.c(R.string.CUSTOM_PROMPTS_FALLBACK_VOICE, new Object[0]));
        String strA = ((k) obj).a();
        TextView textView4 = this.f37400d;
        if (strA == null) {
            textView4.setVisibility(8);
        } else {
            textView4.setText(strA);
            textView4.setVisibility(0);
        }
        this.itemView.setOnClickListener(new g(customPromptsRecordingActivity3, 4));
    }
}
