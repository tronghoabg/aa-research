package defpackage;

import android.R;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.preference.Preference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class xas extends exv {
    public static final /* synthetic */ int e = 0;
    SharedPreferences c;
    SharedPreferences d;
    private xar f;
    private SharedPreferences.OnSharedPreferenceChangeListener g;
    private SharedPreferences.OnSharedPreferenceChangeListener h;

    static {
        yph.c("GH.CarPreference");
    }

    public static final yzy q(Map map, String str) {
        if (TextUtils.isEmpty(str)) {
            return yzy.a;
        }
        yzy yzyVar = (yzy) map.get(str);
        return yzyVar == null ? yzy.a : yzyVar;
    }

    private final void r(SharedPreferences sharedPreferences) {
        this.d = this.a.c();
        qiy.b(sharedPreferences.getAll(), this.d);
        SharedPreferences sharedPreferences2 = this.d;
        qix qixVar = new qix(sharedPreferences2, sharedPreferences);
        this.g = qixVar;
        sharedPreferences2.registerOnSharedPreferenceChangeListener(qixVar);
        qix qixVar2 = new qix(sharedPreferences, this.d);
        this.h = qixVar2;
        sharedPreferences.registerOnSharedPreferenceChangeListener(qixVar2);
    }

    protected abstract yzz k();

    protected abstract Map l();

    protected Map m() {
        return new HashMap();
    }

    protected Map n() {
        return new HashMap();
    }

    protected final void o() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(l().keySet());
        hashSet.addAll(n().keySet());
        hashSet.addAll(m().keySet());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Preference preferenceA = a((String) it.next());
            if (preferenceA != null) {
                exl exlVar = preferenceA.n;
                if (exlVar == null) {
                    preferenceA.n = this.f;
                } else {
                    preferenceA.n = new xar(this, exlVar);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.exv, android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.c = acxa.aW() ? mpl.f().a().c : lau.a().a(getActivity(), "common_user_settings");
        this.a.f("common_user_settings_temp");
        this.d = this.a.c();
        qiy.b(this.c.getAll(), this.d);
        if (acxa.aW()) {
            r(mpl.f().a().c);
        }
        r(this.c);
        setHasOptionsMenu(true);
        this.f = new xar(this, new xaq());
    }

    @Override // defpackage.exv, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ListView listView = (ListView) viewOnCreateView.findViewById(R.id.list);
        if (listView != null) {
            listView.setDividerHeight(0);
        }
        p(yzy.f);
        o();
        return viewOnCreateView;
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.d.unregisterOnSharedPreferenceChangeListener(this.g);
        this.c.unregisterOnSharedPreferenceChangeListener(this.h);
    }

    @Override // android.support.v4.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        getActivity().finish();
        return true;
    }

    public final void p(yzy yzyVar) {
        if (yzyVar == null || yzyVar == yzy.a) {
            return;
        }
        ebf.j().o(k(), yzyVar);
    }

    @Override // defpackage.exv
    public void e(Bundle bundle, String str) {
    }
}
