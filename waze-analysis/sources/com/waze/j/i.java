package com.waze.j;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Filter;
import android.widget.Filterable;
import com.waze.NativeManager;
import com.waze.config.ConfigValues;
import com.waze.design_components.text_view.WazeTextView;
import com.waze.menus.p;
import com.waze.mo;
import com.waze.navigate.AddressItem;
import com.waze.navigate.AutocompleteSearchActivity;
import com.waze.web.r;
import h.g.b.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l.a.bjz;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i extends ArrayAdapter implements Filterable {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f24902b = 0;

    /* renamed from: a, reason: collision with root package name */
    public String f24903a;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f24904c;

    /* renamed from: d, reason: collision with root package name */
    private List f24905d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f24906e;

    /* renamed from: f, reason: collision with root package name */
    private final AddressItem[] f24907f;

    /* renamed from: g, reason: collision with root package name */
    private final View f24908g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f24909h;

    /* renamed from: i, reason: collision with root package name */
    private int f24910i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f24911j;

    /* renamed from: k, reason: collision with root package name */
    private final int f24912k;

    /* renamed from: l, reason: collision with root package name */
    private final AutocompleteSearchActivity f24913l;

    public i(Context context, AddressItem[] addressItemArr, View view, AutocompleteSearchActivity autocompleteSearchActivity, int i2) {
        super(context, R.layout.simple_dropdown_item_1line);
        this.f24903a = null;
        this.f24906e = context;
        this.f24913l = autocompleteSearchActivity;
        this.f24907f = addressItemArr;
        this.f24908g = view;
        this.f24910i = NativeManager.getInstance().getAutoCompleteFeatures();
        this.f24912k = i2;
        this.f24904c = ConfigValues.CONFIG_VALUE_ND4C_ALGO_TRANSPARENCY_FEATURE_ENABLED.b().booleanValue();
    }

    public static /* synthetic */ void d(i iVar, String str, List list, int i2) {
        iVar.f24903a = str;
        if (!iVar.f24909h) {
            iVar.f24909h = true;
            com.waze.search.d.a.b.f().e(str.length(), list.size(), i2, null, null, null, null, bjz.MOBILE_ANDROID);
        }
        if (list.isEmpty()) {
            iVar.notifyDataSetInvalidated();
            iVar.f24905d = null;
        } else {
            iVar.f24905d = list;
            iVar.notifyDataSetChanged();
        }
    }

    private final boolean k() {
        boolean z;
        String str;
        List list = this.f24905d;
        mo moVar = new mo(8);
        x.f(list, "<this>");
        x.f(moVar, "predicate");
        if ((list instanceof Collection) && list.isEmpty()) {
            z = true;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((Boolean) moVar.invoke(it.next())).booleanValue()) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        return (!this.f24904c || (str = this.f24903a) == null || str.isEmpty() || this.f24905d.isEmpty() || z) ? false : true;
    }

    public final int b() {
        return this.f24910i;
    }

    public final d c(int i2) {
        return (d) this.f24905d.get(i2);
    }

    public final void e(String str) {
        String strValueOf = String.valueOf(str);
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) this.f24908g;
        autoCompleteTextView.setText(strValueOf.concat(" "));
        autoCompleteTextView.setSelection(str.length() + 1);
    }

    public final void f() {
        ((InputMethodManager) this.f24906e.getSystemService("input_method")).hideSoftInputFromWindow(this.f24908g.getWindowToken(), 0);
    }

    public final void g(int i2) {
        this.f24910i = i2;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        List list = this.f24905d;
        if (list == null) {
            return 0;
        }
        return list.size() + (k() ? 1 : 0);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public final Filter getFilter() {
        return p.a(new h(this), new com.waze.menus.o() { // from class: com.waze.j.g
            @Override // com.waze.menus.o
            public final void a(String str, List list, int i2) {
                i.d(this.f24900a, str, list, i2);
            }
        });
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i2) {
        if (i2 == this.f24905d.size()) {
            return com.waze.shared_infra.o.b.a().c(com.waze.R.string.ND4C_ALGO_TRANSPARENCY_LINK_SEARCH_TITLE, new Object[0]);
        }
        String strB = ((d) this.f24905d.get(i2)).b();
        return strB != null ? strB : this.f24903a;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i2) {
        return 1;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        if (k() && i2 == this.f24905d.size()) {
            WazeTextView wazeTextView = new WazeTextView(viewGroup.getContext());
            r.a(wazeTextView, com.waze.R.string.ND4C_ALGO_TRANSPARENCY_LINK_SEARCH_TITLE, new mo(7));
            return wazeTextView;
        }
        d dVar = (d) this.f24905d.get(i2);
        if (!(view instanceof com.waze.destination_cell.view.c)) {
            view = com.waze.destination_cell.view.c.a(getContext());
        }
        com.waze.destination_cell.view.c cVar = (com.waze.destination_cell.view.c) view;
        com.waze.destination_cell.b.h hVar = new com.waze.destination_cell.b.h(cVar, this.f24913l, this.f24912k, this);
        cVar.l(hVar);
        hVar.b(dVar);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 2;
    }

    public final void j() {
        this.f24911j = true;
    }
}
