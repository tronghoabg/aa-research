package defpackage;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.projection.gearhead.R;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class mda implements lhg {
    public static final mcw a = new mcw();
    public static final afgl b = new lcj(mki.b, 15);
    public static final yph c = yph.c("GH.ParkedAppMgr");
    public Map d;
    private final kiu e;
    private final eqj f;
    private final eqj g;
    private ExecutorService h;
    private final eqj i;
    private final mcy j;

    public /* synthetic */ mda(byte[] bArr) {
        kiu kiuVarA = kiu.a();
        this.e = kiuVarA;
        mpc mpcVar = mpd.b().h;
        this.f = mpcVar;
        eqj eqjVarA = lix.b().a();
        this.g = eqjVarA;
        eqjVarA.getClass();
        this.i = tby.e(kiuVarA, mpcVar, eqjVarA, mcz.a);
        this.j = new mcy(this);
    }

    public static final mda a() {
        return a.a();
    }

    public final void b(nsn nsnVar) {
        Context context = mki.a.c;
        context.getClass();
        obs.a().e(context, new ComponentName("com.google.android.projection.gearhead", getClass().getName()), context.getText(R.string.parked_manager_close_app), 1, nsnVar);
    }

    @Override // defpackage.lhg
    public final void c() {
        this.d = null;
        this.i.fE(lbh.d(), this.j);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.getClass();
        this.h = executorServiceNewSingleThreadExecutor;
        if (executorServiceNewSingleThreadExecutor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        executorServiceNewSingleThreadExecutor.execute(new ily(12));
        if (lzf.c()) {
            ebf.j().F((rqv) olm.e(acai.O).l());
        }
    }

    @Override // defpackage.lhg
    public final void d() {
        ExecutorService executorService = this.h;
        if (executorService != null) {
            executorService.shutdownNow();
        }
        this.h = null;
    }

    public mda() {
        this(null);
    }
}
