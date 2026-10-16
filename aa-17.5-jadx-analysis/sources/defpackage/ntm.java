package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class ntm extends eqj {
    public static final yph a = yph.c("GH.CellSignalLiveData");
    private static final SparseArray n;
    private static final SparseArray o;
    public final Context h;
    public Network i;
    public boolean j;
    public boolean k;
    public SignalStrength l;
    private final nth p;
    private final TelephonyManager q;
    private final ConnectivityManager r;
    private final ConnectivityManager.NetworkCallback s = new ntl(this);
    private int t = 0;
    public int m = 0;
    private final PhoneStateListener u = new nti(this);

    static {
        SparseArray sparseArray = new SparseArray(16);
        sparseArray.put(5, nts.b);
        sparseArray.put(6, nts.b);
        sparseArray.put(12, nts.b);
        sparseArray.put(14, nts.b);
        sparseArray.put(3, nts.b);
        sparseArray.put(0, nts.m);
        sparseArray.put(2, nts.d);
        sparseArray.put(4, nts.a);
        sparseArray.put(7, nts.a);
        sparseArray.put(2, nts.d);
        sparseArray.put(8, nts.c);
        sparseArray.put(9, nts.c);
        sparseArray.put(10, nts.c);
        sparseArray.put(15, nts.c);
        sparseArray.put(13, nts.h);
        if (Build.VERSION.SDK_INT >= 29) {
            sparseArray.put(20, nts.j);
        }
        n = sparseArray;
        SparseArray sparseArray2 = new SparseArray(5);
        sparseArray2.put(1, nts.i);
        sparseArray2.put(2, nts.j);
        sparseArray2.put(3, nts.j);
        sparseArray2.put(4, nts.j);
        sparseArray2.put(5, nts.j);
        o = sparseArray2;
    }

    public ntm(Context context, nth nthVar) {
        this.h = context;
        this.p = nthVar;
        this.q = (TelephonyManager) context.getSystemService("phone");
        this.r = (ConnectivityManager) context.getSystemService("connectivity");
    }

    private final int r() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.l == null) {
            return -1;
        }
        try {
            Object objInvoke = SignalStrength.class.getMethod("getLevel", null).invoke(this.l, null);
            objInvoke.getClass();
            int iIntValue = ((Integer) objInvoke).intValue();
            ((ype) a.l().ai(5442)).w("getLevelFallback got level: %d", iIntValue);
            return Math.min(iIntValue, 4);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            ((ype) a.l().ai((char) 5443)).u("getLevelFallback failed");
            return -1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ntm.a():void");
    }

    public final boolean b() {
        SignalStrength signalStrength = this.l;
        return (signalStrength == null || signalStrength.isGsm()) ? false : true;
    }

    @Override // defpackage.eqj
    protected final void c() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.r.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(0).addCapability(12).build(), this.s);
        this.q.listen(this.u, Build.VERSION.SDK_INT >= 30 ? 1049057 : 481);
        a();
    }

    @Override // defpackage.eqj
    public final void d() {
        this.r.unregisterNetworkCallback(this.s);
        this.i = null;
        this.j = false;
        this.k = false;
        this.q.listen(this.u, 0);
    }
}
