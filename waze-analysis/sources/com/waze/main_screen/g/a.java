package com.waze.main_screen.g;

import android.view.View;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class a implements View.OnLongClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f26342a;

    public /* synthetic */ a(b bVar) {
        this.f26342a = bVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        com.waze.shared_infra.o.a aVarD = com.waze.design_components.g.b.d(view);
        b bVar = this.f26342a;
        new com.waze.sharedui.d.a.d(bVar.getContext(), aVarD.c(R.string.AUDIO_SDK_POPUP_REMOVE_BUTTON_TITLE, new Object[0]), aVarD.c(R.string.AUDIO_SDK_POPUP_REMOVE_BUTTON_MESSAGE, new Object[0]), aVarD.c(R.string.AUDIO_SDK_POPUP_REMOVE_BUTTON_MAIN_BUTTON_TITLE, new Object[0]), new com.waze.inbox.e(4), Integer.valueOf(bVar.getResources().getColor(R.color.primary_variant)), aVarD.c(R.string.AUDIO_SDK_POPUP_REMOVE_BUTTON_SECONDARY_BUTTON_TITLE, new Object[0]), new com.waze.inbox.e(5), null, true, null).show();
        return true;
    }
}
