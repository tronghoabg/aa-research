package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Looper;
import android.os.StrictMode;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class vlw extends Fragment implements esl, fcv {
    static final yfy a;
    public final Object b = new Object();
    public vme c;
    public SwipeRefreshLayout d;
    public Spinner e;
    private vls f;

    static {
        yfu yfuVar = new yfu(4);
        yfuVar.e(vmb.EVENT_TYPE_UNKNOWN, "Unknown");
        yfuVar.e(vmb.MEMORY, "Memory");
        yfuVar.e(vmb.TIMER, "Timer");
        yfuVar.e(vmb.NETWORK, "Network");
        yfuVar.e(vmb.CRASH, "Crash");
        yfuVar.e(vmb.JANK, "Jank");
        yfuVar.e(vmb.BATTERY, "Battery");
        yfuVar.e(vmb.PRIMES_INTERNAL, "Primes Internal Events");
        yfuVar.e(vmb.CPU, "CPU");
        yfuVar.e(vmb.TRACE, "Trace");
        yfuVar.e(vmb.CPU_PROFILING, "CPU Profiling");
        yfuVar.e(vmb.STRICT_MODE, "Strict Mode");
        yfuVar.e(vmb.CLIENT_TRACING, "Client Tracing");
        yfuVar.e(vmb.CUI, "CUI");
        yfuVar.e(vmb.DISK, "Disk");
        yfuVar.e(vmb.APPLICATION_EXIT, "Application Exit");
        yfuVar.e(vmb.STALL, "Stall");
        a = yfuVar.d(false);
    }

    @Override // defpackage.esl
    public final void a(esv esvVar) {
        this.f.b(null);
        this.d.i(false, false);
    }

    @Override // defpackage.esl
    public final esv b(int i) {
        return new vlv(this, getContext().getApplicationContext());
    }

    @Override // defpackage.esl
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.f.b((Cursor) obj);
        this.d.i(false, false);
    }

    @Override // defpackage.fcv
    public final void d() {
        esm esmVarA = esm.a(this);
        esq esqVar = esmVarA.a;
        Bundle bundle = Bundle.EMPTY;
        if (esqVar.c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
        if (esm.d(2)) {
            Log.v("LoaderManager", a.bt(bundle, esmVarA, "restartLoader in ", ": args="));
        }
        esn esnVarA = esqVar.a(0);
        esmVarA.f(0, bundle, this, esnVarA != null ? esnVarA.a(false) : null);
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        setHasOptionsMenu(true);
        this.c = new vme(getContext().getApplicationContext());
    }

    @Override // android.support.v4.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.primes_localdb_menu, menu);
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.primes_event_fragment, viewGroup, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(getString(R.string.primes_option_all_events));
        for (vmb vmbVar : vmb.values()) {
            arrayList.add((String) a.get(vmbVar));
        }
        this.e = (Spinner) viewInflate.findViewById(R.id.select_event_type);
        ArrayAdapter arrayAdapter = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.e.setAdapter((SpinnerAdapter) arrayAdapter);
        this.e.setOnItemSelectedListener(new exe(this, 2));
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.recycler);
        vls vlsVar = new vls(getContext());
        this.f = vlsVar;
        recyclerView.Z(vlsVar);
        recyclerView.ab(new LinearLayoutManager(1));
        recyclerView.aw(new vlq(getContext()));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewInflate.findViewById(R.id.swipe_refresh_layout);
        this.d = swipeRefreshLayout;
        swipeRefreshLayout.a = this;
        esm.a(this).e(0, Bundle.EMPTY, this);
        return viewInflate;
    }

    @Override // android.support.v4.app.Fragment
    @ResultIgnorabilityUnspecified
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_refresh) {
            this.d.post(new upk(this, 10));
            return true;
        }
        if (menuItem.getItemId() != R.id.action_clear_all) {
            if (menuItem.getItemId() != R.id.action_goto_primes_settings) {
                return false;
            }
            w wVar = new w(getActivity().a());
            wVar.e(((ViewGroup) getView().getParent()).getId(), new vly(), null, 1);
            wVar.n(null);
            wVar.i(false, true);
            return true;
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            synchronized (this.b) {
                SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
                try {
                    writableDatabase.delete("PRIMES_EVENTS", null, null);
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                } finally {
                }
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            this.f.b(null);
            return true;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }
}
