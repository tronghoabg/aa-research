package com.waze.sdk;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.eb;
import android.support.v7.widget.fe;
import android.view.View;
import android.view.ViewGroup;
import com.waze.R;
import j$.util.Objects;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class v extends eb {

    /* renamed from: a, reason: collision with root package name */
    final List f35416a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ae f35417b;

    v(ae aeVar, List list) {
        Objects.requireNonNull(aeVar);
        this.f35417b = aeVar;
        this.f35416a = list;
    }

    @Override // android.support.v7.widget.eb
    public final int getItemCount() {
        return this.f35416a.size();
    }

    @Override // android.support.v7.widget.eb
    public final /* bridge */ /* synthetic */ void onBindViewHolder(fe feVar, int i2) {
        final u uVar = (u) feVar;
        final au auVar = (au) this.f35416a.get(i2);
        int i3 = u.f35407i;
        uVar.f35411d = auVar.f35258a;
        uVar.f35412e = auVar.f35259b;
        ae aeVar = uVar.f35415h.f35417b;
        uVar.f35413f = SdkConfiguration.getSystemAppIcon(aeVar.getContext(), uVar.f35411d);
        uVar.f35408a.setImageDrawable(uVar.f35413f);
        auVar.d(aeVar.getContext(), new as() { // from class: com.waze.sdk.q
            @Override // com.waze.sdk.as
            public final void a(Drawable drawable) {
                au auVar2 = auVar;
                u uVar2 = uVar;
                if (uVar2.f35411d.equals(auVar2.f35258a)) {
                    uVar2.f35413f = drawable;
                    uVar2.f35408a.setImageDrawable(uVar2.f35413f);
                }
            }
        });
        uVar.f35414g = aeVar.f35219e != null && uVar.f35411d.equals(aeVar.f35219e.T());
        uVar.f35410c.setText(uVar.f35412e);
        uVar.f35409b.setVisibility(true != uVar.f35414g ? 8 : 0);
    }

    @Override // android.support.v7.widget.eb
    public final /* bridge */ /* synthetic */ fe onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new u(this, View.inflate(this.f35417b.getContext(), R.layout.audio_panel_app_list_item, null));
    }
}
