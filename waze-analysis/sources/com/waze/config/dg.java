package com.waze.config;

import android.content.DialogInterface;
import android.support.v7.widget.eb;
import android.support.v7.widget.fe;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.core.view.InputDeviceCompat;
import androidx.credentials.provider.CredentialEntry;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.waze.R;
import com.waze.view.text.WazeEditText;
import j$.util.Objects;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class dg extends eb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DebugConfigListActivity f22615a;

    /* renamed from: b, reason: collision with root package name */
    private List f22616b;

    dg(DebugConfigListActivity debugConfigListActivity, List list) {
        Objects.requireNonNull(debugConfigListActivity);
        this.f22615a = debugConfigListActivity;
        this.f22616b = list;
    }

    static /* bridge */ /* synthetic */ void a(dg dgVar, List list) {
        dgVar.f22616b = list;
        dgVar.notifyDataSetChanged();
    }

    public static /* synthetic */ void b(f fVar, da daVar) {
        com.waze.n.ac.r().g(fVar, !fVar.m());
        da.c(daVar, c(fVar));
    }

    private static final int c(f fVar) {
        if (fVar.m()) {
            return fVar.n() ? R.drawable.sticky_lock : R.drawable.locked_screen_icon;
        }
        if (fVar.n()) {
            return R.drawable.sticky;
        }
        if (fVar.o() != 2) {
            return R.drawable.popuphazardicon;
        }
        return 0;
    }

    @Override // android.support.v7.widget.eb
    public final int getItemCount() {
        return this.f22616b.size();
    }

    @Override // android.support.v7.widget.eb
    public final /* bridge */ /* synthetic */ void onBindViewHolder(fe feVar, final int i2) {
        final da daVar = (da) feVar;
        final f fVar = (f) this.f22616b.get(i2);
        final String strReplaceFirst = fVar.j().replaceFirst("^CONFIG_VALUE_", "");
        String string = fVar.b().toString();
        String strH = fVar.h();
        boolean z = fVar instanceof b;
        if (z) {
            strH = true != strH.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) ? CredentialEntry.FALSE_STRING : CredentialEntry.TRUE_STRING;
        }
        if (!strH.isEmpty() && !strH.equals(string)) {
            string = string + " (will change to " + strH + " on the next session)";
        }
        da.d(daVar, strReplaceFirst, string);
        da.c(daVar, c(fVar));
        if (i2 == 0 || fVar.g() != ((f) this.f22616b.get(i2 - 1)).g()) {
            da.e(daVar, fVar.g().toString());
        } else {
            daVar.f22600a.setVisibility(8);
        }
        if (z) {
            final b bVar = (b) fVar;
            daVar.g(null);
            da.f(daVar, DebugConfigListActivity.o(bVar), new com.waze.sharedui.views.w() { // from class: com.waze.config.dd
                @Override // com.waze.sharedui.views.w
                public final void a(boolean z2) {
                    b bVar2 = bVar;
                    boolean z3 = !DebugConfigListActivity.o(bVar2);
                    bVar2.d(Boolean.valueOf(z3));
                    com.waze.shared_infra.i.h.a("DebugConfigListActivity: Toggled '" + bVar2.j() + "' to " + z3);
                    dg dgVar = this.f22606a;
                    if (bVar2.n()) {
                        Toast.makeText(dgVar.f22615a, "Changing this config will not take effect until you restart the app", 0).show();
                    }
                    dgVar.notifyItemChanged(i2);
                }
            });
        } else {
            daVar.f22601b.B(0);
            daVar.g(new View.OnClickListener() { // from class: com.waze.config.de
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final dg dgVar = this.f22609a;
                    DebugConfigListActivity debugConfigListActivity = dgVar.f22615a;
                    com.waze.sharedui.d.a.b bVar2 = new com.waze.sharedui.d.a.b(debugConfigListActivity);
                    bVar2.k(strReplaceFirst);
                    final f fVar2 = fVar;
                    if (fVar2.o() != 2) {
                        bVar2.f("⚠️ Not a Dexter config! ⚠️");
                    }
                    final int i3 = i2;
                    final WazeEditText wazeEditText = new WazeEditText(debugConfigListActivity);
                    wazeEditText.setInputType(true == (fVar2 instanceof c) ? InputDeviceCompat.SOURCE_TOUCHSCREEN : 1);
                    wazeEditText.setText(fVar2.b().toString());
                    bVar2.l(wazeEditText);
                    bVar2.j(new DialogInterface.OnClickListener() { // from class: com.waze.config.db
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            String string2 = wazeEditText.getText().toString();
                            dg dgVar2 = dgVar;
                            f fVar3 = fVar2;
                            if (fVar3 instanceof c) {
                                c cVar = (c) fVar3;
                                try {
                                    long jLongValue = cVar.b().longValue();
                                    cVar.d(Long.valueOf(Long.parseLong(string2)));
                                    com.waze.shared_infra.i.h.a("DebugConfigListActivity: Set '" + cVar.j() + "' to " + string2 + " from " + jLongValue);
                                    if (cVar.n()) {
                                        Toast.makeText(dgVar2.f22615a, "Changing this config will not take effect until you restart the app", 0).show();
                                    }
                                } catch (NumberFormatException e2) {
                                    com.waze.shared_infra.i.h.e("DebugConfigListActivity: number format exception", e2);
                                }
                            } else if (fVar3 instanceof d) {
                                d dVar = (d) fVar3;
                                String strB = dVar.b();
                                dVar.d(string2);
                                com.waze.shared_infra.i.h.a("DebugConfigListActivity: Set '" + dVar.j() + "' to '" + string2 + "' from '" + strB + "'");
                                if (dVar.n()) {
                                    Toast.makeText(dgVar2.f22615a, "Changing this config will not take effect until you restart the app", 0).show();
                                }
                            } else {
                                com.waze.shared_infra.i.h.c("DebugConfigListActivity: invalid config type: ".concat(String.valueOf(String.valueOf(fVar3.getClass()))));
                            }
                            dgVar2.notifyItemChanged(i3);
                        }
                    });
                    bVar2.h(new dc());
                    bVar2.m();
                }
            });
        }
        daVar.h(new View.OnLongClickListener() { // from class: com.waze.config.df
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                dg.b(fVar, daVar);
                return true;
            }
        });
    }

    @Override // android.support.v7.widget.eb
    public final /* bridge */ /* synthetic */ fe onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new da((LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.debug_config_list_item, viewGroup, false));
    }
}
