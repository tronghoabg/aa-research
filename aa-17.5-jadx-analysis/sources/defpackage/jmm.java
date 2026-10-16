package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class jmm {
    public static final yph a = yph.c("GH.CDMWirelessSetup");
    public final Executor b;
    public final oqe c;
    public final afei d;
    public final BluetoothAdapter e;
    public final pal f;
    private final Context g;

    public jmm(Context context, Executor executor, oqe oqeVar, afei afeiVar) {
        this.g = context;
        this.b = executor;
        this.c = oqeVar;
        this.d = afeiVar;
        this.e = ((BluetoothManager) jfj.c(context).getSystemService(BluetoothManager.class)).getAdapter();
        this.f = new pap(context, executor);
    }
}
