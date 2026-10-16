package com.waze.uid.f;

import android.graphics.Bitmap;
import android.support.v4.app.ar;
import android.view.View;
import android.widget.ImageView;
import com.waze.R;
import com.waze.sharedui.views.i;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class e implements com.waze.sharedui.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f44509a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44510b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f44511c;

    public /* synthetic */ e(Object obj, Object obj2, int i2) {
        this.f44511c = i2;
        this.f44509a = obj;
        this.f44510b = obj2;
    }

    @Override // com.waze.sharedui.g
    public final void a(Bitmap bitmap) {
        if (this.f44511c == 0) {
            f.f((f) this.f44509a, (c) this.f44510b, bitmap);
        } else if (bitmap != null) {
            ar arVar = (ar) this.f44509a;
            if (arVar.getActivity() == null || arVar.requireActivity().isFinishing() || !arVar.isAdded() || arVar.isRemoving() || arVar.isDetached()) {
                return;
            }
            ((ImageView) ((View) this.f44510b).findViewById(R.id.accountExistsImage)).setImageDrawable(new i(bitmap, 0));
        }
    }
}
