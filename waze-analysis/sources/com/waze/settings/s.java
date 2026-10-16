package com.waze.settings;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.waze.R;
import com.waze.settings.tree.views.SettingsFreeText;
import com.waze.settings.tree.views.SettingsTitleText;
import com.waze.sound.PromptDefinition;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class s extends android.support.v7.widget.eb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CustomPromptsRecordingActivity f37457a;

    public s(CustomPromptsRecordingActivity customPromptsRecordingActivity) {
        this.f37457a = customPromptsRecordingActivity;
    }

    @Override // android.support.v7.widget.eb
    public final int getItemCount() {
        return this.f37457a.o.size();
    }

    @Override // android.support.v7.widget.eb
    public final int getItemViewType(int i2) {
        Object obj = this.f37457a.o.get(i2);
        if (obj == CustomPromptsRecordingActivity.f36667g) {
            return 3;
        }
        if (obj instanceof String) {
            return 0;
        }
        return !(obj instanceof PromptDefinition) ? 2 : 1;
    }

    @Override // android.support.v7.widget.eb
    public final void onBindViewHolder(android.support.v7.widget.fe feVar, int i2) throws IOException {
        h.g.b.x.f(feVar, "holder");
        CustomPromptsRecordingActivity customPromptsRecordingActivity = this.f37457a;
        Object obj = customPromptsRecordingActivity.o.get(i2);
        if (feVar instanceof j) {
            h.g.b.x.d(obj, "null cannot be cast to non-null type kotlin.String");
            ((j) feVar).a((String) obj);
        } else {
            if (feVar instanceof l) {
                ((l) feVar).a(customPromptsRecordingActivity.z.c(R.string.CUSTOM_PROMPTS_DESCRIPTION_HEADER, new Object[0]));
                return;
            }
            if (feVar instanceof r) {
                h.g.b.x.d(obj, "null cannot be cast to non-null type com.waze.sound.PromptDefinition");
                ((r) feVar).a((PromptDefinition) obj);
            } else if (feVar instanceof i) {
                ((i) feVar).a(obj);
            }
        }
    }

    @Override // android.support.v7.widget.eb
    public final android.support.v7.widget.fe onCreateViewHolder(ViewGroup viewGroup, int i2) {
        h.g.b.x.f(viewGroup, "parent");
        if (i2 == 0) {
            return new j(new SettingsTitleText(viewGroup.getContext(), null));
        }
        if (i2 == 2) {
            CustomPromptsRecordingActivity customPromptsRecordingActivity = this.f37457a;
            View viewInflate = LayoutInflater.from(customPromptsRecordingActivity).inflate(R.layout.custom_prompt_action_item, (ViewGroup) null);
            h.g.b.x.e(viewInflate, "inflate(...)");
            return new i(customPromptsRecordingActivity, viewInflate);
        }
        if (i2 == 3) {
            return new l(new SettingsFreeText(viewGroup.getContext(), null));
        }
        CustomPromptsRecordingActivity customPromptsRecordingActivity2 = this.f37457a;
        View viewInflate2 = LayoutInflater.from(customPromptsRecordingActivity2).inflate(R.layout.custom_prompt_item_view, (ViewGroup) null);
        h.g.b.x.e(viewInflate2, "inflate(...)");
        return new r(customPromptsRecordingActivity2, viewInflate2);
    }
}
