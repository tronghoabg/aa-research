package com.waze.ifs.ui;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.waze.R;
import com.waze.settings.gw;
import com.waze.settings.tree.views.SettingsTitleText;
import com.waze.view.title.TitleBar;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class w extends android.support.v4.app.ar {

    /* renamed from: a, reason: collision with root package name */
    private static final String f24585a = "com.waze.ifs.ui.w";
    private ListView q;
    private u r;
    private m s;
    private gw t;
    private View x;
    private EditText z;

    /* renamed from: b, reason: collision with root package name */
    private gw[] f24586b = null;

    /* renamed from: c, reason: collision with root package name */
    private boolean f24587c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f24588d = false;

    /* renamed from: e, reason: collision with root package name */
    private String f24589e = null;

    /* renamed from: f, reason: collision with root package name */
    private boolean f24590f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f24591g = false;

    /* renamed from: h, reason: collision with root package name */
    private String f24592h = null;

    /* renamed from: i, reason: collision with root package name */
    private String f24593i = null;

    /* renamed from: j, reason: collision with root package name */
    private String f24594j = null;

    /* renamed from: k, reason: collision with root package name */
    private boolean f24595k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f24596l = false;
    private boolean m = false;
    private String n = null;
    private int o = 0;
    private int p = 0;
    private int u = 0;
    private boolean v = false;
    private int w = -1;
    private final com.waze.shared_infra.o.a y = com.waze.shared_infra.o.b.a();

    private static float C(String str, String str2, int i2, boolean z, boolean z2) {
        float f2 = 0.5f;
        if (str2.length() == 0) {
            return i2 * 0.5f;
        }
        int iIndexOf = str.indexOf(str2.charAt(0));
        if (iIndexOf < 0) {
            return i2 > 0 ? C(str, str2.substring(1), i2 - 1, z, false) : str2.length() * (-0.5f);
        }
        if ((iIndexOf != 0 || !z) && (iIndexOf <= 0 || Character.isAlphabetic(str.charAt(iIndexOf - 1)))) {
            f2 = z2 ? 0.0f : 0.5f - (iIndexOf * 0.5f);
        }
        int i3 = iIndexOf + 1;
        float fC = C(str.substring(i3), str2.substring(1), i2, !Character.isAlphabetic(str.charAt(iIndexOf)), false);
        float f3 = fC + f2;
        if (f3 > 1.0f) {
            return f3;
        }
        float fC2 = C(str.substring(i3), str2, i2, !Character.isAlphabetic(str.charAt(iIndexOf)), z2);
        float f4 = fC2 + f2;
        if (f4 > 1.0f) {
            return f4;
        }
        return f2 + (i2 > 0 ? Math.max(fC2, Math.max(fC, C(str, str2.substring(1), i2 - 1, z, false))) : Math.max(fC2, fC));
    }

    static float a(String str, String str2) {
        if (str2.length() == 0) {
            return 1.0f;
        }
        if (str.length() == 0) {
            return 0.0f;
        }
        int iMin = Math.min(str.length(), str2.length());
        int i2 = iMin <= 2 ? 0 : 2;
        if (iMin <= 4) {
            i2 = 1;
        }
        return C(str, str2, i2, true, true);
    }

    static /* bridge */ /* synthetic */ void j(w wVar, int i2, gw gwVar, boolean z) {
        if (gwVar == null) {
            return;
        }
        int i3 = 0;
        gwVar.f37348a = false;
        if (wVar.f24591g || wVar.m) {
            com.waze.ui.x.u.j(wVar.getActivity(), (EditText) wVar.x.findViewById(R.id.omniSelectSearch));
        }
        if (wVar.f24595k) {
            if (wVar.f24596l) {
                r rVar = (r) wVar.r;
                while (true) {
                    gw[] gwVarArr = rVar.f24571a;
                    if (i3 >= gwVarArr.length) {
                        i2 = -1;
                        break;
                    } else {
                        if (gwVarArr[i3] == gwVar) {
                            i2 = i3;
                            break;
                        }
                        i3++;
                    }
                }
            } else {
                i2 = ((p) wVar.r).a(gwVar);
            }
        }
        ((s) wVar.getActivity()).bF(i2, gwVar.f37349b, gwVar.f37350c, z);
    }

    public final void A() {
        this.p = 100;
    }

    public final void B(String str) {
        this.n = str;
        this.o = R.drawable.list_icon_home;
    }

    public final void k(String str) {
        this.f24593i = str;
    }

    public final void l(boolean z) {
        this.f24596l = z;
    }

    public final void m(boolean z) {
        this.f24595k = z;
    }

    public final void n(boolean z) {
        this.f24590f = z;
    }

    public final void o(boolean z) {
        this.f24587c = z;
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (bundle != null) {
            String str = f24585a;
            this.f24590f = bundle.getBoolean(String.valueOf(str).concat(".mIsIndexed"), this.f24590f);
            this.f24591g = bundle.getBoolean(String.valueOf(str).concat(".mIsSearch"), this.f24591g);
            this.f24595k = bundle.getBoolean(String.valueOf(str).concat(".mIsFilter"), this.f24595k);
            this.f24587c = bundle.getBoolean(String.valueOf(str).concat(".mIsMultiSelect"), this.f24587c);
            this.f24588d = bundle.getBoolean(String.valueOf(str).concat(".mIsUserInput"), this.f24588d);
            this.f24589e = bundle.getString(String.valueOf(str).concat(".mUserInputFormat"), this.f24589e);
            this.f24596l = bundle.getBoolean(String.valueOf(str).concat(".mIsExpandable"), this.f24596l);
            this.m = bundle.getBoolean(String.valueOf(str).concat(".mIsAutoComplete"), this.m);
            this.f24592h = bundle.getString(String.valueOf(str).concat(".mTitleText"), this.f24592h);
            this.f24593i = bundle.getString(String.valueOf(str).concat(".mEditBoxHint"), this.f24593i);
            this.f24594j = bundle.getString(String.valueOf(str).concat(".mSubTitle"), this.f24594j);
            this.f24586b = (gw[]) bundle.getParcelableArray(String.valueOf(str).concat(".mValues"));
            this.u = bundle.getInt(String.valueOf(str).concat(".mTimesEnteredSearch"), this.u);
            this.n = bundle.getString(String.valueOf(str).concat(".mTopOptionText"), this.n);
            this.o = bundle.getInt(String.valueOf(str).concat(".mTopOptionIcon"), this.o);
            if (this.f24588d) {
                this.t = this.f24586b[r10.length - 1];
            }
        } else if (this.f24588d) {
            gw[] gwVarArr = this.f24586b;
            int length = gwVarArr.length;
            gw[] gwVarArr2 = (gw[]) Arrays.copyOf(gwVarArr, length + 1);
            this.f24586b = gwVarArr2;
            gw gwVar = new gw("", String.format(this.f24589e, ""), false);
            this.t = gwVar;
            gwVarArr2[length] = gwVar;
        }
        this.v = getResources().getConfiguration().orientation == 1;
        View viewInflate = layoutInflater.inflate(R.layout.omni_select, viewGroup, false);
        this.x = viewInflate;
        TitleBar titleBar = (TitleBar) viewInflate.findViewById(R.id.theTitleBar);
        if (this.f24587c || this.f24596l) {
            titleBar.d(this.f24592h, this.y.c(R.string.DONE, new Object[0]));
        } else {
            titleBar.c(this.f24592h);
        }
        titleBar.n(new d(this, 3));
        titleBar.m(new com.waze.design_components.c.e(this, 11));
        if (this.n != null) {
            View viewFindViewById = this.x.findViewById(R.id.omniSelectTopOption);
            viewFindViewById.setVisibility(0);
            ((TextView) this.x.findViewById(R.id.omniSelectTopOptionText)).setText(this.n);
            ((ImageView) this.x.findViewById(R.id.omniSelectTopOptionIcon)).setImageResource(this.o);
            viewFindViewById.setOnClickListener(new d(this, 4, (byte[]) null));
        }
        if (this.f24594j != null) {
            SettingsTitleText settingsTitleText = (SettingsTitleText) this.x.findViewById(R.id.subtitle);
            settingsTitleText.a(this.f24594j);
            settingsTitleText.setVisibility(0);
        }
        if (this.f24591g || this.m) {
            this.x.findViewById(R.id.omniSelectSearchLayout).setVisibility(0);
            EditText editText = (EditText) this.x.findViewById(R.id.omniSelectSearch);
            this.z = editText;
            editText.setInputType(16385);
            if (this.f24588d && this.v) {
                this.z.requestFocus();
            }
            if (this.f24588d && this.p > 0) {
                this.z.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.p)});
            }
            if (this.f24595k || this.m) {
                this.z.addTextChangedListener(new f(this, 2));
                this.z.setOnEditorActionListener(new e(this, 2));
                EditText editText2 = this.z;
                if (editText2 != null) {
                    editText2.setHint(this.f24593i);
                }
                if (this.m) {
                    m mVar = new m(getActivity());
                    this.s = mVar;
                    mVar.b(this.f24586b);
                    AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) this.z;
                    autoCompleteTextView.setAdapter(this.s);
                    autoCompleteTextView.setOnItemClickListener(new l(this, 1, null));
                }
            }
            this.z.setOnFocusChangeListener(new i(this));
        } else {
            this.x.findViewById(R.id.omniSelectSearchLayout).setVisibility(8);
        }
        boolean z = this.f24595k;
        if (z && this.f24596l) {
            this.r = new r(getActivity());
        } else if (z) {
            p pVar = new p(getActivity());
            this.r = pVar;
            pVar.f24569b = this.t;
            pVar.f(false);
        } else if (this.f24590f) {
            this.r = new t(getActivity());
        } else if (this.f24596l) {
            this.r = new v(getActivity());
        } else {
            this.r = new u(getActivity());
        }
        ListView listView = (ListView) this.x.findViewById(R.id.omniSelectList);
        this.q = listView;
        if (this.f24590f) {
            listView.setFastScrollEnabled(true);
        }
        boolean z2 = this.f24596l;
        ListView listView2 = this.q;
        if (z2) {
            listView2.setVisibility(8);
            ExpandableListView expandableListView = (ExpandableListView) this.x.findViewById(R.id.omniSelectExpandableList);
            expandableListView.setVisibility(0);
            expandableListView.setAdapter((ExpandableListAdapter) this.r);
            expandableListView.setOnGroupClickListener(new j(this, expandableListView));
            expandableListView.setOnChildClickListener(new k(this));
            this.q = expandableListView;
        } else {
            listView2.setAdapter((ListAdapter) this.r);
        }
        this.r.b(this.f24586b);
        this.q.invalidateViews();
        this.q.setOnItemClickListener(new l(this, 0));
        return this.x;
    }

    @Override // android.support.v4.app.ar
    public final void onResume() {
        super.onResume();
        EditText editText = (EditText) this.x.findViewById(R.id.omniSelectSearch);
        if (!this.f24591g && !this.m && !this.f24588d) {
            com.waze.ui.x.u.j(getActivity(), editText);
        } else if (this.f24588d && this.v) {
            com.waze.ui.x.u.k(getActivity(), editText);
        }
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onSaveInstanceState */
    public final void m47x22bc4f96(Bundle bundle) {
        String str = f24585a;
        bundle.putBoolean(String.valueOf(str).concat(".mIsIndexed"), this.f24590f);
        bundle.putBoolean(String.valueOf(str).concat(".mIsSearch"), this.f24591g);
        bundle.putBoolean(String.valueOf(str).concat(".mIsFilter"), this.f24595k);
        bundle.putBoolean(String.valueOf(str).concat(".mIsMultiSelect"), this.f24587c);
        bundle.putBoolean(String.valueOf(str).concat(".mIsUserInput"), this.f24588d);
        bundle.putString(String.valueOf(str).concat(".mUserInputFormat"), this.f24589e);
        bundle.putBoolean(String.valueOf(str).concat(".mIsExpandable"), this.f24596l);
        bundle.putBoolean(String.valueOf(str).concat(".mIsAutoComplete"), this.m);
        bundle.putString(String.valueOf(str).concat(".mTitleText"), this.f24592h);
        bundle.putString(String.valueOf(str).concat(".mEditBoxHint"), this.f24593i);
        bundle.putString(String.valueOf(str).concat(".mSubTitle"), this.f24594j);
        bundle.putParcelableArray(String.valueOf(str).concat(".mValues"), this.f24586b);
        bundle.putInt(String.valueOf(str).concat(".mTimesEnteredSearch"), this.u);
        bundle.putString(String.valueOf(str).concat(".mTopOptionText"), this.n);
        bundle.putInt(String.valueOf(str).concat(".mTopOptionIcon"), this.o);
    }

    @Override // android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        com.waze.shared_infra.g.e.d(view.findViewById(R.id.omniSelectContainer), view.findViewById(R.id.omniSelectList));
    }

    public final void p(boolean z) {
        this.f24591g = z;
    }

    public final void q(String str) {
        this.f24592h = str;
    }

    public final void r(boolean z, String str) {
        this.f24588d = z;
        this.f24589e = str;
    }

    public final void s(gw[] gwVarArr) {
        this.f24586b = gwVarArr;
    }

    public final void z() {
        this.m = true;
    }
}
