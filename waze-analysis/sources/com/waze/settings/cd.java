package com.waze.settings;

import android.view.View;
import android.view.ViewGroup;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.settings.tree.views.WazeSettingsView;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cd extends android.support.v7.widget.eb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SettingsHOVSearchActivity f36960a;

    cd(SettingsHOVSearchActivity settingsHOVSearchActivity) {
        Objects.requireNonNull(settingsHOVSearchActivity);
        this.f36960a = settingsHOVSearchActivity;
    }

    @Override // android.support.v7.widget.eb
    public final int getItemCount() {
        return this.f36960a.f36688h.size();
    }

    @Override // android.support.v7.widget.eb
    public final void onBindViewHolder(android.support.v7.widget.fe feVar, int i2) {
        SettingsHOVSearchActivity settingsHOVSearchActivity = this.f36960a;
        final NativeManager.HOVPermitDescriptor hOVPermitDescriptor = (NativeManager.HOVPermitDescriptor) settingsHOVSearchActivity.f36688h.get(i2);
        final WazeSettingsView wazeSettingsView = ((cc) feVar).f36959a;
        wazeSettingsView.A(hOVPermitDescriptor.name);
        wazeSettingsView.u(i2 == 0 ? 1 : i2 == settingsHOVSearchActivity.f36688h.size() + (-1) ? 2 : 0);
        wazeSettingsView.x(SettingsHOVActivity.l(settingsHOVSearchActivity, settingsHOVSearchActivity.f36689k.indexOf(hOVPermitDescriptor.id) != -1));
        wazeSettingsView.setOnClickListener(new View.OnClickListener() { // from class: com.waze.settings.ca
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final cd cdVar = this.f36953a;
                final NativeManager.HOVPermitDescriptor hOVPermitDescriptor2 = hOVPermitDescriptor;
                SettingsHOVSearchActivity settingsHOVSearchActivity2 = cdVar.f36960a;
                int iIndexOf = settingsHOVSearchActivity2.f36689k.indexOf(hOVPermitDescriptor2.id);
                final WazeSettingsView wazeSettingsView2 = wazeSettingsView;
                if (iIndexOf == -1) {
                    SettingsHOVSearchActivity.q(settingsHOVSearchActivity2, hOVPermitDescriptor2.id);
                    wazeSettingsView2.x(SettingsHOVActivity.l(settingsHOVSearchActivity2, true));
                    SettingsHOVSearchActivity.p(settingsHOVSearchActivity2, true);
                    return;
                }
                String strC = settingsHOVSearchActivity2.n.c(R.string.HOV_PERMITS_REMOVE_Q_TITLE_PS, wazeSettingsView2.k());
                String strC2 = settingsHOVSearchActivity2.n.c(R.string.HOV_PERMITS_REMOVE_Q_BODY_PS, wazeSettingsView2.k());
                com.waze.ab.o oVar = new com.waze.ab.o();
                oVar.Q(strC);
                oVar.P(strC2);
                oVar.f13808a = new com.waze.ab.q() { // from class: com.waze.settings.cb
                    @Override // com.waze.ab.q
                    public final void onClick(boolean z) {
                        if (z) {
                            WazeSettingsView wazeSettingsView3 = wazeSettingsView2;
                            NativeManager.HOVPermitDescriptor hOVPermitDescriptor3 = hOVPermitDescriptor2;
                            SettingsHOVSearchActivity settingsHOVSearchActivity3 = cdVar.f36960a;
                            SettingsHOVSearchActivity.q(settingsHOVSearchActivity3, hOVPermitDescriptor3.id);
                            wazeSettingsView3.x(SettingsHOVActivity.l(settingsHOVSearchActivity3, false));
                            SettingsHOVSearchActivity.p(settingsHOVSearchActivity3, false);
                        }
                    }
                };
                oVar.M(settingsHOVSearchActivity2.n.c(R.string.HOV_PERMITS_REMOVE_Q_YES, new Object[0]));
                oVar.N(settingsHOVSearchActivity2.n.c(R.string.HOV_PERMITS_REMOVE_Q_NO, new Object[0]));
                com.waze.z.a.d.ai.q(oVar);
            }
        });
    }

    @Override // android.support.v7.widget.eb
    public final android.support.v7.widget.fe onCreateViewHolder(ViewGroup viewGroup, int i2) {
        WazeSettingsView wazeSettingsView = new WazeSettingsView(this.f36960a);
        wazeSettingsView.B(0);
        wazeSettingsView.K(R.drawable.pass_placeolder_icon);
        wazeSettingsView.setLayoutParams(new android.support.v7.widget.eo(-1, -2));
        return new cc(this, wazeSettingsView);
    }
}
