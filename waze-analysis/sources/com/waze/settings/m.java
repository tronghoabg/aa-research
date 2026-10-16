package com.waze.settings;

import android.support.v7.widget.RecyclerView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f37441a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f37442b;

    public /* synthetic */ m(Object obj, int i2) {
        this.f37442b = i2;
        this.f37441a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f37442b;
        if (i2 == 0) {
            int i3 = r.f37450b;
            RecyclerView recyclerView = ((CustomPromptsRecordingActivity) this.f37441a).f36670l;
            if (recyclerView == null) {
                h.g.b.x.j("recycler");
                recyclerView = null;
            }
            android.support.v7.widget.eb ebVarJ = recyclerView.j();
            if (ebVarJ != null) {
                ebVarJ.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (i2 == 1) {
            Object obj = this.f37441a;
            int i4 = i.f37397b;
            CustomPromptsRecordingActivity customPromptsRecordingActivity = (CustomPromptsRecordingActivity) obj;
            customPromptsRecordingActivity.F().i(customPromptsRecordingActivity.v);
            customPromptsRecordingActivity.setResult(-1);
            customPromptsRecordingActivity.finish();
            return;
        }
        if (i2 == 2) {
            ba.v((ba) this.f37441a);
            return;
        }
        if (i2 == 3) {
            ba.x((ba) this.f37441a);
            return;
        }
        if (i2 == 4) {
            cr.openVehicleDetailsSettingsJNI$lambda$0((cr) this.f37441a);
            return;
        }
        Object obj2 = this.f37441a;
        if (i2 != 5) {
            dc.s((dc) obj2);
        } else {
            cr.openLicensePlateSettingsJNI$lambda$0((cr) obj2);
        }
    }
}
