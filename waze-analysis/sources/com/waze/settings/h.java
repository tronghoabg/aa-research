package com.waze.settings;

import android.support.v7.widget.RecyclerView;
import com.waze.NativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class h implements com.waze.ab.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CustomPromptsRecordingActivity f37370a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f37371b;

    public /* synthetic */ h(CustomPromptsRecordingActivity customPromptsRecordingActivity, int i2) {
        this.f37371b = i2;
        this.f37370a = customPromptsRecordingActivity;
    }

    @Override // com.waze.ab.q
    public final void onClick(boolean z) {
        int i2 = this.f37371b;
        int i3 = 1;
        if (i2 == 0) {
            int i4 = i.f37397b;
            if (z) {
                NativeManager.Post(new m(this.f37370a, i3));
                return;
            }
            return;
        }
        if (i2 == 1) {
            CustomPromptsRecordingActivity.y(this.f37370a, z);
            return;
        }
        int i5 = i.f37397b;
        if (z) {
            CustomPromptsRecordingActivity customPromptsRecordingActivity = this.f37370a;
            customPromptsRecordingActivity.q = true;
            customPromptsRecordingActivity.F().f();
            RecyclerView recyclerView = customPromptsRecordingActivity.f36670l;
            if (recyclerView == null) {
                h.g.b.x.j("recycler");
                recyclerView = null;
            }
            android.support.v7.widget.eb ebVarJ = recyclerView.j();
            if (ebVarJ != null) {
                ebVarJ.notifyDataSetChanged();
            }
        }
    }
}
